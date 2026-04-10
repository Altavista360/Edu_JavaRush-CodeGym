/*
 * Authors: JavaRush's team, CodeGym's team, Altavista360
 * Version: 1.0.0
 */

/*
 * // JavaRush
 * Задача: Читаем имя на цифровой визитке 🃏
 * Ссылка: https://javarush.com/tasks/ru.javarush.java.core.level15.task05
 */

/*
 * // CodeGym
 * Task: Reading the name on a digital business card 🃏
 * Link: https://codegym.cc/tasks/en.codegym.java.core.level15.task05
 */

/*
 * // JavaRush
 * Условие:
 * Представьте, что вы создаёте основу для цифровых визитных карточек. На каждой визитке есть имя владельца, но это имя должно быть приватным внутри объекта, чтобы никто не мог случайно его изменить. Зато должна быть возможность его прочитать.
 * Создайте класс UserCard. Внутри него объявите одно приватное поле userName типа String. Затем реализуйте публичный метод getUserName(), который просто возвращает значение этого приватного поля.
 * В классе Solution создайте объект UserCard. Инициализируйте поле userName при создании объекта, например, с именем "Элис" (для этого можете добавить соответствующий публичный конструктор в UserCard). После этого используйте метод getUserName(), чтобы получить это имя и вывести его на экран. Ваша программа должна успешно вывести "Элис".
 */

/*
 * // JavaRush
 * Требования:
 * • В классе UserCard должно быть объявлено приватное поле userName типа String.
 * • В классе UserCard должен быть реализован публичный метод getUserName(), возвращающий значение приватного поля userName.
 * • В классе UserCard должен быть реализован публичный конструктор, принимающий параметр userName и инициализирующий соответствующее поле.
 * • В классе Solution должен быть создан объект UserCard с именем "Элис".
 * • В классе Solution необходимо получить имя пользователя с помощью метода getUserName() и вывести его на экран.
 */

/*
 * // JavaRush
 * Черновик:
 * package ru.javarush.java.core.level15.task05;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Создаем визитку и задаем имя владельца
 *         UserCard card = new UserCard("Элис");
 *
 *         // Получаем имя через геттер и выводим на экран
 *         System.out.println(card.getUserName());
 *     }
 * }
 */

// JavaRush
package ru.javarush.java.core.level15.task05;

public class Solution {
    public static void main(String[] args) {
        // Создаем визитку и задаем имя владельца
        UserCard card = new UserCard("Элис");

        // Получаем имя через геттер и выводим на экран
        System.out.println(card.getUserName());
    }
}

/*
 * // JavaRush
 * Правильное решение:
 * // Author: JavaRush's team
 * package ru.javarush.java.core.level15.task05;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Создаем визитку и задаем имя владельца
 *         UserCard card = new UserCard("Элис");
 *
 *         // Получаем имя через геттер и выводим на экран
 *         System.out.println(card.getUserName());
 *     }
 * }
 */