/*
 * Authors: JavaRush's team, CodeGym's team, Altavista360
 * Version: 1.0.0
 */

/*
 * // JavaRush
 * Задача: Результаты игры в кости 🎲
 * Ссылка: https://javarush.com/tasks/ru.javarush.java.core.level02.task02
 */

/*
 * // CodeGym
 * Task: Dice Game Results 🎲
 * Link: https://codegym.cc/tasks/en.codegym.java.core.level02.task02
 */

/*
 * // JavaRush
 * Условие:
 * Вы записываете результаты бросков игральных костей. Создайте три переменные типа int: firstRoll, secondRoll и totalScore.
 * Присвойте переменной firstRoll значение 7, secondRoll — 3, а переменной totalScore — сумму двух первых переменных. Выведите на экран значение переменной totalScore. Создание и присваивание должно быть выполнено в одной строке.
 */

/*
 * // JavaRush
 * Требования:
 * • В программе должны быть объявлены три переменные типа int: firstRoll, secondRoll и totalScore.
 * • Каждая из переменных firstRoll, secondRoll и totalScore должна быть инициализирована значением сразу при объявлении (в одной строке).
 * • firstRoll должен быть равен 7, secondRoll должен быть равен 3, totalScore должен быть равен сумме firstRoll и secondRoll.
 * • На экран должно быть выведено значение переменной totalScore.
 */

/*
 * // JavaRush
 * Черновик:
 * package ru.javarush.java.core.level02.task02;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Объявляем и инициализируем переменные в одной строке
 *
 *
 *         // Выводим значение переменной totalScore на экран
 *
 *     }
 * }
 */

// JavaRush
package ru.javarush.java.core.level02.task02;

public class Solution {
    public static void main(String[] args) {
        // Объявляем и инициализируем переменные в одной строке
        int firstRoll = 7, secondRoll = 3, totalScore = firstRoll + secondRoll;

        // Выводим значение переменной totalScore на экран
        System.out.println(totalScore);
    }
}

/*
 * // JavaRush
 * Правильное решение:
 * // Author: JavaRush's team
 * package ru.javarush.java.core.level02.task02;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Объявляем и инициализируем переменные в одной строке
 *         int firstRoll = 7, secondRoll = 3, totalScore = firstRoll + secondRoll;
 *
 *         // Выводим значение переменной totalScore на экран
 *         System.out.println(totalScore);
 *     }
 * }
 */