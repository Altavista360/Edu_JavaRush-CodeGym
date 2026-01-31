/*
 * Authors: JavaRush's team, CodeGym's team, Altavista360
 * Version: 1.0.0
 */

/*
 * // JavaRush
 * Задача: Магический гримуар роста силы ✨
 * Ссылка: https://javarush.com/tasks/ru.javarush.java.core.level05.task04
 */

/*
 * // CodeGym
 * Task: Magic Grimoire of Power Growth ✨
 * Link: https://codegym.cc/tasks/en.codegym.java.core.level05.task04
 */

/*
 * // JavaRush
 * Условие:
 * В волшебной академии, где вы обучаетесь, юным магам преподают основы нумерологии. Одно из важных упражнений — вычисление "силы" числа, которая определяется его квадратом. Это помогает понять, как быстро увеличивается магический потенциал.
 * Ваше задание — создать цифровой гримуар, который показывает рост силы. Попросите пользователя ввести число N (например, magicLimit), которое будет обозначать верхний предел чисел для расчёта. Затем ваша программа должна вычислить и вывести на экран квадрат каждого числа, начиная с 1 и заканчивая N, располагая каждое вычисление на новой строке.
 * Если, например, magicLimit будет 3, ваш гримуар должен отобразить:
 * 1
 * 4
 * 9
 */

/*
 * // JavaRush
 * Требования:
 * • Программа должна запрашивать у пользователя ввод числа N (magicLimit).
 * • Программа должна обрабатывать все числа от 1 до N включительно.
 * • Для каждого числа от 1 до N программа должна вычислять его квадрат.
 * • Каждое вычисленное значение квадрата должно выводиться на отдельной строке.
 */

/*
 * // JavaRush
 * Черновик:
 * package ru.javarush.java.core.level05.task04;
 *
 * import java.util.Scanner;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Создаем объект Scanner для ввода данных с клавиатуры
 *
 *
 *         // Запрашиваем у пользователя ввод числа N (magicLimit)
 *
 *
 *         // Вычисляем и выводим квадрат каждого числа от 1 до N
 *         for (/* инициализация */; /* условие */; /* изменение */) {
 *             // Вывод квадрата числа
 *
 *         }
 *     }
 * }
 */

// JavaRush
package ru.javarush.java.core.level05.task04;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        // Создаем объект Scanner для ввода данных с клавиатуры
        Scanner inputData = new Scanner(System.in);

        // Запрашиваем у пользователя ввод числа N (magicLimit)
        System.out.println("Введите волшебное число:");
        int magicLimit = inputData.nextInt();

        // Вычисляем и выводим квадрат каждого числа от 1 до N
        for (int i = 1/* инициализация */; i <= magicLimit/* условие */; i++/* изменение */) {
            // Вывод квадрата числа
            System.out.println(i * i);
        }
    }
}

/*
 * // JavaRush
 * Правильное решение:
 * // Author: JavaRush's team
 * package ru.javarush.java.core.level05.task04;
 *
 * import java.util.Scanner;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Создаем объект Scanner для ввода данных с клавиатуры
 *         Scanner console = new Scanner(System.in);
 *
 *         // Запрашиваем у пользователя ввод числа N (magicLimit)
 *         System.out.println("Введите число N (magicLimit):");
 *         int magicLimit = console.nextInt();
 *
 *         // Вычисляем и выводим квадрат каждого числа от 1 до N
 *         for (int i = 1; i <= magicLimit; i++) {
 *             System.out.println(i * i); // Вывод квадрата числа
 *         }
 *     }
 * }
 */