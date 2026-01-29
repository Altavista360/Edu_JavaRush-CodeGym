/*
 * Authors: JavaRush's team, CodeGym's team, Altavista360
 * Version: 1.0.0
 */

/*
 * // JavaRush
 * Задача: Отбор качественных товаров 📦
 * Ссылка: https://javarush.com/tasks/ru.javarush.java.core.level04.task14
 */

/*
 * // CodeGym
 * Task: Selecting quality products 📦
 * Link: https://codegym.cc/tasks/en.codegym.java.core.level04.task14
 */

/*
 * // JavaRush
 * Условие:
 * Вы проверяете партию товаров, и некоторые из них оказались бракованными (представлены отрицательными числами).
 * У вас есть массив оценок товаров: {3, -2, 7, -5, 8, 0}.
 * Используйте цикл for, чтобы вывести на экран только качественные товары (положительные числа или 0), а бракованные — пропустить.
 */

/*
 * // JavaRush
 * Требования:
 * • В задаче должен быть использован цикл for для перебора элементов массива.
 * • В программе должен быть массив с оценками товаров, содержащий значения {3, -2, 7, -5, 8, 0}.
 * • На экран должны выводиться только положительные числа или ноль из массива (то есть только качественные товары).
 * • Для пропуска бракованных товаров (отрицательных чисел) необходимо использовать оператор continue внутри цикла.
 */

/*
 * // JavaRush
 * Черновик:
 * package ru.javarush.java.core.level04.task14;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Массив с оценками товаров
 *         int[] productRatings = {3, -2, 7, -5, 8, 0};
 *
 *         // Цикл for для перебора всех элементов массива
 *         for (int rating : productRatings) {
 *             // Если товар бракованный (отрицательное число), пропускаем его
 *             if (/*условие */) {
 *                       // Переход к следующей итерации цикла
 *             }
 *
 *             // Выводим на экран только качественные товары (положительные числа)
 *             System.out.println(rating);
 *         }
 *     }
 * }
 */

// JavaRush
package ru.javarush.java.core.level04.task14;

public class Solution {
    public static void main(String[] args) {
        // Массив с оценками товаров
        int[] productRatings = {3, -2, 7, -5, 8, 0};

        // Цикл for для перебора всех элементов массива
        for (int rating : productRatings) {
            // Если товар бракованный (отрицательное число), пропускаем его
            if (rating < 0/*условие */) {
                      continue;// Переход к следующей итерации цикла
            }

            // Выводим на экран только качественные товары (положительные числа)
            System.out.println(rating);
        }
    }
}

/*
 * // JavaRush
 * Правильное решение:
 * // Author: JavaRush's team
 * package ru.javarush.java.core.level04.task14;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Массив с оценками товаров
 *         int[] productRatings = {3, -2, 7, -5, 8, 0};
 *
 *         // Цикл for для перебора всех элементов массива
 *         for (int rating : productRatings) {
 *             // Если товар бракованный (отрицательное число), пропускаем его
 *             if (rating < 0) {
 *                 continue; // Переход к следующей итерации цикла
 *             }
 *
 *             // Выводим на экран только качественные товары (положительные числа)
 *             System.out.println(rating);
 *         }
 *     }
 * }
 */