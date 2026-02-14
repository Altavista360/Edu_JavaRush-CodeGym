/*
 * Authors: JavaRush's team, CodeGym's team, Altavista360
 * Version: 1.0.0
 */

/*
 * // JavaRush
 * Задача: Быстрый подсчет стоимости покупки 💰
 * Ссылка: https://javarush.com/tasks/ru.javarush.java.core.level08.task06
 */

/*
 * // CodeGym
 * Task: Quick calculation of the purchase cost 💰
 * Link: https://codegym.cc/tasks/en.codegym.java.core.level08.task06
 */

/*
 * // JavaRush
 * Условие:
 * Вообразите, что вы работаете кассиром в небольшом, но очень оживленном магазине, и вам нужен быстрый способ подсчета общей стоимости двух товаров, чтобы не заставлять покупателей ждать. Вы хотите автоматизировать этот процесс.
 * Создайте класс StoreCashier. Внутри этого класса объявите статический метод calculateAndShowCost, который будет принимать два целых числа: firstItemPrice и secondItemPrice.
 * Задача этого метода — моментально сложить их и вывести на экран сообщение, например, "Общая стоимость покупки: " с результатом подсчета.
 * Чтобы протестировать вашу кассовую программу, в главном стартовом блоке main имитируйте покупку товаров по цене 7 и 5, вызвав calculateAndShowCost с этими значениями.
 */

/*
 * // JavaRush
 * Требования:
 * • В программе должен быть объявлен публичный класс с именем StoreCashier.
 * • В классе StoreCashier должен быть объявлен статический метод с именем calculateAndShowCost.
 * • Метод calculateAndShowCost должен принимать два параметра типа int: firstItemPrice и secondItemPrice.
 * • Метод calculateAndShowCost должен вычислять сумму двух переданных параметров и выводить на экран сообщение в формате "Общая стоимость покупки: " с полученной суммой.
 * • В методе main класса StoreCashier должен быть вызван метод calculateAndShowCost с аргументами 7 и 5.
 */

/*
 * // JavaRush
 * Черновик:
 * package ru.javarush.java.core.level08.task06;
 *
 * public class StoreCashier {
 *
 *     // Статический метод, который принимает цены двух товаров,
 *     // суммирует их и выводит результат
 *     public static void calculateAndShowCost(int firstItemPrice, int secondItemPrice) {
 *
 *     }
 *
 *     public static void main(String[] args) {
 *         // Тест: имитируем покупку товаров по цене 7 и 5
 *         calculateAndShowCost(7, 5);
 *     }
 * }
 */

// JavaRush
package ru.javarush.java.core.level08.task06;

public class StoreCashier {

    // Статический метод, который принимает цены двух товаров,
    // суммирует их и выводит результат
    public static void calculateAndShowCost(int firstItemPrice, int secondItemPrice) {
        int totalSum = firstItemPrice + secondItemPrice;
        System.out.println("Общая стоимость покупки: " + totalSum);
    }

    public static void main(String[] args) {
        // Тест: имитируем покупку товаров по цене 7 и 5
        calculateAndShowCost(7, 5);
    }
}

/*
 * // JavaRush
 * Правильное решение:
 * // Author: JavaRush's team
 * package ru.javarush.java.core.level08.task06;
 *
 * public class StoreCashier {
 *
 *     // Статический метод, который принимает цены двух товаров,
 *     // суммирует их и выводит результат
 *     public static void calculateAndShowCost(int firstItemPrice, int secondItemPrice) {
 *         int total = firstItemPrice + secondItemPrice; // Складываем цены
 *         System.out.println("Общая стоимость покупки: " + total); // Печатаем итог
 *     }
 *
 *     public static void main(String[] args) {
 *         // Тест: имитируем покупку товаров по цене 7 и 5
 *         calculateAndShowCost(7, 5);
 *     }
 * }
 */