/*
 * Authors: JavaRush's team, CodeGym's team, Altavista360
 * Version: 1.0.0
 */

/*
 * // JavaRush
 * Задача: Определение максимальной температуры дня 🌡️
 * Ссылка: https://javarush.com/tasks/ru.javarush.java.core.level07.task08
 */

/*
 * // CodeGym
 * Task: Determine the maximum temperature of the day 🌡
 * Link: https://codegym.cc/tasks/en.codegym.java.core.level07.task08
 */

/*
 * // JavaRush
 * Условие:
 * Ваша система "Умный дом" записывала показания температуры внутри помещения шесть раз в течение дня. Показания были такими: 3, 11, 7, 4, 15, и 2 градуса Цельсия.
 * Вам необходимо выяснить, какая была самая высокая температура, зафиксированная за этот период, чтобы, например, скорректировать работу системы охлаждения.
 * Создайте массив int[] hourlyTemperatures длиной в 6 элементов и заполните его числами 3, 11, 7, 4, 15, 2 с помощью быстрой инициализации массива.
 * Затем, найдите максимальный элемент в этом массиве (то есть, самую высокую температуру) и выведите его на экран.
 */

/*
 * // JavaRush
 * Требования:
 * • Необходимо создать массив int[] hourlyTemperatures длиной 6 элементов и сразу заполнить его значениями 3, 11, 7, 4, 15, 2 с помощью быстрой инициализации.
 * • Программа должна найти максимальное значение среди всех элементов массива hourlyTemperatures.
 * • Программа должна вывести на экран только максимальное значение из массива hourlyTemperatures.
 * • Для хранения температурных показаний должен быть использован одномерный массив типа int.
 */

/*
 * // JavaRush
 * Черновик:
 * package ru.javarush.java.core.level07.task08;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Быстрая инициализация массива с 6 элементами температур
 *
 *
 *         // Предполагаем, что первый элемент массива является максимальным
 *
 *
 *         // Проходим по всем элементам массива, начиная со второго
 *
 *         // Если текущая температура больше сохранённой максимальной
 *
 *         // Обновляем максимальную температуру
 *
 *
 *
 *         // Выводим найденную максимальную температуру
 *
 *     }
 * }
 */

// JavaRush
package ru.javarush.java.core.level07.task08;

public class Solution {
    public static void main(String[] args) {
        // Быстрая инициализация массива с 6 элементами температур
        int[] hourlyTemperatures = {3, 11, 7, 4, 15, 2};

        // Предполагаем, что первый элемент массива является максимальным
        int maxTemp = hourlyTemperatures[0];

        // Проходим по всем элементам массива, начиная со второго
        for (int i = 1; i < hourlyTemperatures.length; i++) {
        // Если текущая температура больше сохранённой максимальной
            if (hourlyTemperatures[i] > maxTemp) {
        // Обновляем максимальную температуру
                maxTemp = hourlyTemperatures[i];
            }
        }

        // Выводим найденную максимальную температуру
        System.out.println(maxTemp);
    }
}

/*
 * // JavaRush
 * Правильное решение:
 * // Author: JavaRush's team
 * package ru.javarush.java.core.level07.task08;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Быстрая инициализация массива с 6 элементами температур
 *         int[] hourlyTemperatures = {3, 11, 7, 4, 15, 2};
 *
 *         // Предполагаем, что первый элемент массива является максимальным
 *         int maxTemperature = hourlyTemperatures[0];
 *
 *         // Проходим по всем элементам массива, начиная со второго
 *         for (int i = 1; i < hourlyTemperatures.length; i++) {
 *             // Если текущая температура больше сохранённой максимальной
 *             if (hourlyTemperatures[i] > maxTemperature) {
 *                 // Обновляем максимальную температуру
 *                 maxTemperature = hourlyTemperatures[i];
 *             }
 *         }
 *
 *         // Выводим найденную максимальную температуру
 *         System.out.println(maxTemperature);
 *     }
 * }
 */