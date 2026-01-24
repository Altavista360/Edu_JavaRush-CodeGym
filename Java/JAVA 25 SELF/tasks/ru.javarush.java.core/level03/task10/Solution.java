/*
 * Authors: JavaRush's team, CodeGym's team, Altavista360
 * Version: 1.0.0
 */

/*
 * // JavaRush
 * Задача: Результат матча ⚽
 * Ссылка: https://javarush.com/tasks/ru.javarush.java.core.level03.task10
 */

/*
 * // CodeGym
 * Task: Match result ⚽
 * Link: https://codegym.cc/tasks/en.codegym.java.core.level03.task10
 */

/*
 * // JavaRush
 * Условие:
 * Представьте, что вы записываете результат футбольного матча. Объявите две переменные типа int с любыми значениями, например, ourScore и opponentScore. Создайте переменную типа boolean с именем weWon, которая будет содержать результат сравнения: наш счёт больше счёта соперника. Выведите значение переменной weWon на экран.
 */

/*
 * // JavaRush
 * Требования:
 * • В программе должны быть объявлены две переменные типа int, например, ourScore и opponentScore.
 * • Переменным ourScore и opponentScore должны быть присвоены любые целочисленные значения.
 * • В программе должна быть объявлена переменная типа boolean с именем weWon.
 * • Переменная weWon должна содержать результат сравнения: значение true, если ourScore больше opponentScore, иначе false.
 * • Программа должна вывести на экран значение переменной weWon.
 */

/*
 * // JavaRush
 * Черновик:
 * package ru.javarush.java.core.level03.task10;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Объявляем и присваиваем счёт нашей команды и соперника
 *
 *
 *         // weWon — результат логического сравнения: true, если наш счёт больше
 *
 *
 *         // Выводим значение переменной weWon на экран
 *
 *     }
 * }
 */

// JavaRush
package ru.javarush.java.core.level03.task10;

public class Solution {
    public static void main(String[] args) {
        // Объявляем и присваиваем счёт нашей команды и соперника
        int ourScore = 69;
        int opponentScore = 13;

        // weWon — результат логического сравнения: true, если наш счёт больше
        boolean weWon = ourScore > opponentScore;

        // Выводим значение переменной weWon на экран
        System.out.println(weWon);
    }
}

/*
 * // JavaRush
 * Правильное решение:
 * // Author: JavaRush's team
 * package ru.javarush.java.core.level03.task10;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Объявляем и присваиваем счёт нашей команды и соперника
 *         int ourScore = 3;
 *         int opponentScore = 1;
 *
 *         // weWon — результат логического сравнения: true, если наш счёт больше
 *         boolean weWon = ourScore > opponentScore;
 *
 *         // Выводим значение переменной weWon на экран
 *         System.out.println(weWon);
 *     }
 * }
 */