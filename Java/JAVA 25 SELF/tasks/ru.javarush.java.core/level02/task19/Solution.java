/*
 * Authors: JavaRush's team, CodeGym's team, Altavista360
 * Version: 1.0.0
 */

/*
 * // JavaRush
 * Задача: Подсчет общей стоимости покупок 🛒
 * Ссылка: https://javarush.com/tasks/ru.javarush.java.core.level02.task19
 */

/*
 * // CodeGym
 * Task: Calculating the total cost of purchases 🛒
 * Link: https://codegym.cc/tasks/en.codegym.java.core.level02.task19
 */

/*
 * // JavaRush
 * Условие:
 * Вы работаете на кассе. Напишите программу, которая считывает с клавиатуры цену двух товаров и выводит на экран их общую стоимость.
 */

/*
 * // JavaRush
 * Требования:
 * • Программа должна использовать класс Scanner для считывания данных с клавиатуры.
 * • Программа должна считать с клавиатуры два целых числа, каждое из которых представляет цену товара.
 * • Программа должна корректно сложить две введённые цены.
 * • Программа должна вывести на экран сумму двух введённых цен.
 */

/*
 * // JavaRush
 * Черновик:
 * package ru.javarush.java.core.level02.task19;
 *
 * import java.util.Scanner;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Создаем Scanner для чтения данных с клавиатуры
 *
 *
 *         // Считываем цены двух товаров как целые числа
 *
 *
 *         // Складываем и выводим сумму
 *
 *     }
 * }
 */

// JavaRush
package ru.javarush.java.core.level02.task19;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        // Создаем Scanner для чтения данных с клавиатуры
        Scanner keyboard = new Scanner(System.in);

        // Считываем цены двух товаров как целые числа
        int foo = keyboard.nextInt();
        int bar = keyboard.nextInt();

        // Складываем и выводим сумму
        int total = foo + bar;
        System.out.println(total);
    }
}

/*
 * // JavaRush
 * Правильное решение:
 * // Author: JavaRush's team
 * package ru.javarush.java.core.level02.task19;
 *
 * import java.util.Scanner;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Создаем Scanner для чтения данных с клавиатуры
 *         Scanner console = new Scanner(System.in);
 *
 *         // Считываем цены двух товаров как целые числа
 *         int firstPrice = console.nextInt();
 *         int secondPrice = console.nextInt();
 *
 *         // Складываем и выводим сумму
 *         int total = firstPrice + secondPrice;
 *         System.out.println(total);
 *     }
 * }
 */