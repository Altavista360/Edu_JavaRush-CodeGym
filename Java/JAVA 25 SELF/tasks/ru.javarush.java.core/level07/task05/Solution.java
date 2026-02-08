/*
 * Authors: JavaRush's team, CodeGym's team, Altavista360
 * Version: 1.0.0
 */

/*
 * // JavaRush
 * Задача: Начальная настройка таблицы рекордов 🚀
 * Ссылка: https://javarush.com/tasks/ru.javarush.java.core.level07.task05
 */

/*
 * // CodeGym
 * Task: Initial high score table setup 🚀
 * Link: https://codegym.cc/tasks/en.codegym.java.core.level07.task05
 */

/*
 * // JavaRush
 * Условие:
 * Вы приступаете к настройке таблицы рекордов для своей новой захватывающей игры "Галактический Защитник". У вас есть пять предварительно установленных высоких результатов от тестовых игроков, и вы хотите вывести их на экран, чтобы сразу заполнить первые места в списке лидеров. Каждый результат должен быть показан на отдельной строке.
 * Создайте массив int[] gameHighScores длиной в 5 элементов. Заполните его значениями 10, 20, 30, 40, 50 с помощью быстрой инициализации массива, что позволит сразу присвоить все значения при создании. Затем, чтобы отобразить каждый рекорд в своей строке, выведите все элементы этого массива на экран, выводя каждый на новой строке.
 */

/*
 * // JavaRush
 * Требования:
 * • Необходимо создать массив int[] gameHighScores длиной 5 элементов и сразу инициализировать его значениями 10, 20, 30, 40, 50 при объявлении.
 * • Массив должен быть типа int[].
 * • Все элементы массива gameHighScores должны быть выведены на экран.
 * • Каждый элемент массива должен быть выведен на отдельной строке.
 */

/*
 * // JavaRush
 * Черновик:
 * package ru.javarush.java.core.level07.task05;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Быстрая инициализация массива из 5 элементов
 *
 *
 *         // Выводим каждый элемент на новой строке
 *
 *
 *     }
 * }
 */

// JavaRush
package ru.javarush.java.core.level07.task05;

public class Solution {
    public static void main(String[] args) {
        // Быстрая инициализация массива из 5 элементов
        int[] gameHighScores = {10, 20, 30, 40, 50};

        // Выводим каждый элемент на новой строке
        for (int i : gameHighScores) {
             System.out.println(i);
        }
    }
}

/*
 * // JavaRush
 * Правильное решение:
 * // Author: JavaRush's team
 * package ru.javarush.java.core.level07.task05;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Быстрая инициализация массива из 5 элементов
 *         int[] gameHighScores = {10, 20, 30, 40, 50};
 *
 *         // Выводим каждый элемент на новой строке
 *         for (int score : gameHighScores) {
 *             System.out.println(score);
 *         }
 *     }
 * }
 */