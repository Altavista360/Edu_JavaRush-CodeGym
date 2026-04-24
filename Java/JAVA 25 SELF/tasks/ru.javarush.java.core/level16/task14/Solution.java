/*
 * Authors: JavaRush's team, CodeGym's team, Altavista360
 * Version: 1.0.0
 */

/*
 * // JavaRush
 * Задача: Хранитель тайны: контролируемое раскрытие секрета 🔐
 * Ссылка: https://javarush.com/tasks/ru.javarush.java.core.level16.tas14
 */

/*
 * // CodeGym
 * Task: Secret Keeper: Controlled Secret Disclosure 🔐
 * Link: https://codegym.cc/tasks/en.codegym.java.core.level16.task14
 */

/*
 * // JavaRush
 * Условие:
 * Вы создаёте систему для хранения ценной информации, которая должна быть строго конфиденциальной. Сама система SecretKeeper хранит "секрет", доступ к которому ограничен. Однако, в определённых условиях, когда владелец системы даёт разрешение, "секрет" может быть временно раскрыт специальным временным агентом.
 * В классе SecretKeeper объявите приватное строковое поле hiddenSecret со значением "Java — круто!". В методе revealSecret() этого класса объявите локальный класс с именем TruthRevealer. TruthRevealer должен содержать метод printSecret(), который выводит на экран значение поля hiddenSecret. Создайте объект TruthRevealer и вызовите его метод printSecret(), чтобы увидеть секретное послание на экране.
 */

/*
 * // JavaRush
 * Требования:
 * • В классе SecretKeeper должно быть объявлено приватное строковое поле с именем hiddenSecret и значением "Java — круто!".
 * • В методе revealSecret() класса SecretKeeper должен быть объявлен локальный класс с именем TruthRevealer.
 * • Класс TruthRevealer должен иметь доступ к приватному полю hiddenSecret внешнего класса SecretKeeper.
 * • В классе TruthRevealer должен быть реализован метод printSecret(), который выводит на экран значение поля hiddenSecret.
 * • В методе revealSecret() должен быть создан объект класса TruthRevealer и вызван его метод printSecret().
 */

/*
 * // JavaRush
 * Черновик:
 * package ru.javarush.java.core.level16.task14;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Демонстрация работы SecretKeeper
 *         SecretKeeper keeper = new SecretKeeper();
 *         keeper.revealSecret();
 *     }
 * }
 *
 * // Класс-хранитель секрета
 * class SecretKeeper {
 *     // Приватное поле с секретом
 *     private String hiddenSecret = "Java — круто!";
 *
 *     // Метод, внутри которого объявляется локальный класс
 *     public void revealSecret() {
 *         // Локальный класс, объявленный внутри метода
 *
 *
 *         // Создаём объект локального класса и раскрываем секрет
 *
 *     }
 * }
 */

// JavaRush
package ru.javarush.java.core.level16.task14;

public class Solution {
    public static void main(String[] args) {
        // Демонстрация работы SecretKeeper
        SecretKeeper keeper = new SecretKeeper();
        keeper.revealSecret();
    }
}

// Класс-хранитель секрета
class SecretKeeper {
    // Приватное поле с секретом
    private String hiddenSecret = "Java — круто!";

    // Метод, внутри которого объявляется локальный класс
    public void revealSecret() {
        // Локальный класс, объявленный внутри метода
        class TruthRevealer {
            void printSecret() {
                System.out.println(hiddenSecret);
            }
        }

        // Создаём объект локального класса и раскрываем секрет
        TruthRevealer agent = new TruthRevealer();
        agent.printSecret();
    }
}

/*
 * // JavaRush
 * Правильное решение:
 * // Author: JavaRush's team
 * package ru.javarush.java.core.level16.task14;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Демонстрация работы SecretKeeper
 *         SecretKeeper keeper = new SecretKeeper();
 *         keeper.revealSecret();
 *     }
 * }
 *
 * // Класс-хранитель секрета
 * class SecretKeeper {
 *     // Приватное поле с секретом
 *     private String hiddenSecret = "Java — круто!";
 *
 *     // Метод, внутри которого объявляется локальный класс
 *     public void revealSecret() {
 *         // Локальный класс, объявленный внутри метода
 *         class TruthRevealer {
 *             // Метод, который печатает секрет
 *             void printSecret() {
 *                 // Локальный класс имеет доступ к приватному полю внешнего класса
 *                 System.out.println(hiddenSecret);
 *             }
 *         }
 *
 *         // Создаём объект локального класса и раскрываем секрет
 *         TruthRevealer agent = new TruthRevealer();
 *         agent.printSecret();
 *     }
 * }
 */