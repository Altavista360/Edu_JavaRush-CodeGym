/*
 * Authors: JavaRush's team, CodeGym's team, Altavista360
 * Version: 1.0.0
 */

/*
 * // JavaRush
 * Задача: Форматирование числа с плавающей точкой
 * Ссылка: https://javarush.com/tasks/ru.javarush.java.core.level09.task06
 */

/*
 * // CodeGym
 * Task: Floating-point number formatting
 * Link: https://codegym.cc/tasks/en.codegym.java.core.level09.task06
 */

/*
 * // JavaRush
 * Условие:
 * Вы работаете над кассовым аппаратом для элитного бутика. Когда покупатель выбирает товар, цена должна отображаться безупречно, с точностью до двух знаков после запятой, как это принято в финансовых операциях. Никаких лишних цифр, только точность и ясность.
 * Ваша цель — объявить переменную типа double для хранения цены, например, double productPrice со значением 123.456, а затем, используя String.format, вывести её на экран в виде "Цена: 123.46 евро.", гарантируя, что после запятой останется ровно две цифры, как это принято в мире финансов.
 */

/*
 * // JavaRush
 * Требования:
 * • В программе должна быть объявлена переменная типа double для хранения цены товара.
 * • Переменная productPrice должна быть инициализирована значением 123.456.
 * • Для форматирования строки с ценой должно использоваться именно String.format.
 * • Результат форматирования должен содержать ровно две цифры после запятой.
 * • На экран должно быть выведено сообщение в таком виде: "Цена: 123.46 евро."
 */

/*
 * // JavaRush
 * Черновик:
 * package ru.javarush.java.core.level09.task06;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Объявляем переменную типа double для хранения цены товара
 *         double productPrice = 123.456;
 *
 *         // Форматируем строку с ценой, оставляя ровно две цифры после запятой
 *
 *
 *         // Выводим отформатированную строку на экран
 *
 *     }
 * }
 */

// JavaRush
package ru.javarush.java.core.level09.task06;

public class Solution {
    public static void main(String[] args) {
        // Объявляем переменную типа double для хранения цены товара
        double productPrice = 123.456;

        // Форматируем строку с ценой, оставляя ровно две цифры после запятой
        String formattedPrice = String.format("Цена: %.2f евро.", productPrice);

        // Выводим отформатированную строку на экран
        System.out.println(formattedPrice);
    }
}

/*
 * // JavaRush
 * Правильное решение:
 * // Author: JavaRush's team
 * package ru.javarush.java.core.level09.task06;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Объявляем переменную типа double для хранения цены товара
 *         double productPrice = 123.456;
 *
 *         // Форматируем строку с ценой, оставляя ровно две цифры после запятой
 *         String formattedPrice = String.format("Цена: %.2f евро.", productPrice);
 *
 *         // Выводим отформатированную строку на экран
 *         System.out.println(formattedPrice);
 *     }
}
 */