/*
 * Authors: JavaRush's team, CodeGym's team, Altavista360
 * Version: 1.0.0
 */

/*
 * // JavaRush
 * Задача: Ведение счета в увлекательной игре 🎮
 * Ссылка: https://javarush.com/tasks/ru.javarush.java.core.level08.task03
 */

/*
 * // CodeGym
 * Task: Keeping Score in a Fun Game 🎮
 * Link: https://codegym.cc/tasks/en.codegym.java.core.level08.task03
 */

/*
 * // JavaRush
 * Условие:
 * Представьте, что вы разрабатываете простую систему подсчета очков для увлекательной аркадной игры, где игроки зарабатывают очки, собирая сияющие монетки. Вам нужен надежный механизм, который будет отслеживать общий счет для всех игроков, постоянно увеличиваясь.
 * Постройте класс с именем GameScore. Внутри него спрячьте приватное статическое поле totalGameScore, которое изначально будет равно 0 – это ваш центральный, защищенный регистр очков.
 * Теперь добавьте два статических метода: первый, collectCoin, будет увеличивать totalGameScore на единицу каждый раз, когда игрок успешно подбирает монетку. Второй, displayCurrentScore, должен показывать текущее значение totalGameScore на экране, чтобы игроки видели свой прогресс.
 * В главной части вашей игры, в методе main, представьте, что игрок собрал целых 3 монетки — вызовите collectCoin трижды. После этого сразу же вызовите displayCurrentScore, чтобы убедиться, что общий счет отображается корректно и радует игроков.
 */

/*
 * // JavaRush
 * Требования:
 * • В программе должен быть создан публичный класс с именем GameScore.
 * • В классе GameScore должно быть объявлено приватное статическое целочисленное поле totalGameScore, инициализированное нулем.
 * • В классе GameScore должен быть реализован публичный статический метод collectCoin, который увеличивает значение поля totalGameScore на 1.
 * • В классе GameScore должен быть реализован публичный статический метод displayCurrentScore, который выводит текущее значение totalGameScore на экран.
 * • В методе main класса GameScore необходимо трижды вызвать метод collectCoin, а затем вызвать метод displayCurrentScore.
 */

/*
 * // JavaRush
 * Черновик:
 * package ru.javarush.java.core.level08.task03;
 *
 * public class GameScore {
 *     // Приватный общий счет для всей игры — доступен только внутри класса
 *
 *
 *     // Увеличиваем счет на 1 каждый раз, когда игрок собирает монетку
 *
 *
 *     // Выводим текущий общий счет на экран
 *
 *
 *     public static void main(String[] args) {
 *         // Игрок собрал три монетки
 *
 *
 *         // Показываем текущий счет
 *
 *     }
 * }
 */

// JavaRush
package ru.javarush.java.core.level08.task03;

public class GameScore {
    // Приватный общий счет для всей игры — доступен только внутри класса
    private static int totalGameScore = 0;

    // Увеличиваем счет на 1 каждый раз, когда игрок собирает монетку
    public static void collectCoin() {
        totalGameScore++;
    }

    // Выводим текущий общий счет на экран
    public static void displayCurrentScore() {
        System.out.println(totalGameScore);
    }

    public static void main(String[] args) {
        // Игрок собрал три монетки
        collectCoin();
        collectCoin();
        collectCoin();

        // Показываем текущий счет
        displayCurrentScore();
    }
}

/*
 * // JavaRush
 * Правильное решение:
 * // Author: JavaRush's team
 * package ru.javarush.java.core.level08.task03;
 *
 * public class GameScore {
 *     // Приватный общий счет для всей игры — доступен только внутри класса
 *     private static int totalGameScore = 0;
 *
 *     // Увеличиваем счет на 1 каждый раз, когда игрок собирает монетку
 *     public static void collectCoin() {
 *         totalGameScore++;
 *     }
 *
 *     // Выводим текущий общий счет на экран
 *     public static void displayCurrentScore() {
 *         System.out.println(totalGameScore);
 *     }
 *
 *     public static void main(String[] args) {
 *         // Игрок собрал три монетки
 *         collectCoin();
 *         collectCoin();
 *         collectCoin();
 *
 *         // Показываем текущий счет
 *         displayCurrentScore();
 *     }
 * }
 */