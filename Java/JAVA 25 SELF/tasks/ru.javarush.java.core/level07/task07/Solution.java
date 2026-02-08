/*
 * Authors: JavaRush's team, CodeGym's team, Altavista360
 * Version: 1.0.0
 */

/*
 * // JavaRush
 * Задача: Подсчет общей суммы покупок в корзине 🛍️
 * Ссылка: https://javarush.com/tasks/ru.javarush.java.core.level07.task07
 */

/*
 * // CodeGym
 * Task: Calculating the total amount of purchases in the cart 🛍️
 * Link: https://codegym.cc/tasks/en.codegym.java.core.level07.task07
 */

/*
 * // JavaRush
 * Условие:
 * Вы разрабатываете простую систему подсчета для корзины онлайн-магазина. Покупатель добавил четыре товара, чьи стоимости составляют 5, 7, 2 и 9 кредитов. Ваша задача — быстро сложить эти стоимости, чтобы показать покупателю общую сумму к оплате.
 * Создайте массив int[] itemPrices длиной в 4 элемента и сразу же заполните его числами 5, 7, 2, 9 при помощи быстрой инициализации массива. Затем, посчитайте сумму всех элементов этого массива и выведите полученный результат на экран, чтобы покупатель увидел свой общий чек.
 */

/*
 * // JavaRush
 * Требования:
 * • Необходимо создать массив int[] itemPrices длиной 4 элемента и сразу инициализировать его значениями 5, 7, 2, 9.
 * • Массив itemPrices должен иметь тип int[].
 * • Программа должна вычислить сумму всех элементов массива itemPrices.
 * • Программа должна вывести на экран только итоговую сумму всех покупок.
 */

/*
 * // JavaRush
 * Черновик:
 * package ru.javarush.java.core.level07.task07;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Создаем массив с быстрой инициализацией
 *
 *
 *         // Переменная для хранения суммы
 *
 *
 *         // Суммируем все элементы массива
 *
 *
 *
 *         // Выводим итоговую сумму на экран
 *
 *     }
 * }
 */

// JavaRush
package ru.javarush.java.core.level07.task07;

public class Solution {
    public static void main(String[] args) {
        // Создаем массив с быстрой инициализацией
        int[] itemPrices = {5, 7, 2, 9};

        // Переменная для хранения суммы
        int totalSum = 0;

        // Суммируем все элементы массива
        for (int price : itemPrices) {
            totalSum = totalSum + price;
        }

        // Выводим итоговую сумму на экран
        System.out.println(totalSum);
    }
}

/*
 * // JavaRush
 * Правильное решение:
 * // Author: JavaRush's team
 * package ru.javarush.java.core.level07.task07;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Создаем массив с быстрой инициализацией
 *         int[] itemPrices = {5, 7, 2, 9};
 *
 *         // Переменная для хранения суммы
 *         int totalSum = 0;
 *
 *         // Суммируем все элементы массива
 *         for (int price : itemPrices) {
 *             totalSum += price;
 *         }
 *
 *         // Выводим итоговую сумму на экран
 *         System.out.println(totalSum);
 *     }
 * }
 */