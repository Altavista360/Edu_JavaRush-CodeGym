/*
 * Authors: JavaRush's team, CodeGym's team, Altavista360
 * Version: 1.0.0
 */

/*
 * // JavaRush
 * Задача: Форматирование цен на витрине онлайн-магазина 🛍️
 * Ссылка: https://javarush.com/tasks/ru.javarush.java.core.level06.task07
 */

/*
 * // CodeGym
 * Task: Formatting product prices on the online store storefront 🛍️
 * Link: https://codegym.cc/tasks/en.codegym.java.core.level06.task07
 */

/*
 * // JavaRush
 * Условие:
 * Вы отвечаете за отображение цен на сайте крупного онлайн-магазина. Чтобы витрина выглядела профессионально и аккуратно, цены должны всегда отображаться с двумя знаками после запятой, даже если они имеют больше знаков.
 * Объявите переменную double productPrice и присвойте ей значение 1234.56789 (представьте, что это цена какого-то товара).
 * Ваша миссия — вывести это значение на экран, гарантируя, что оно всегда будет иметь ровно два знака после запятой, используя средства форматированного вывода.
 */

/*
 * // JavaRush
 * Требования:
 * • В программе должна быть объявлена переменная с именем productPrice типа double.
 * • Переменной productPrice должно быть присвоено значение 1234.56789.
 * • Для вывода значения переменной productPrice на экран должен использоваться форматированный вывод (String.format).
 * • Значение productPrice должно быть выведено на экран с ровно двумя знаками после запятой, независимо от количества знаков в исходном числе.
 * • Отформатированное значение productPrice должно быть выведено на экран.
 */

/*
 * // JavaRush
 * Черновик:
 * package ru.javarush.java.core.level06.task07;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Объявляем переменную и присваиваем ей цену товара
 *
 *
 *         // Форматируем число так, чтобы было ровно два знака после запятой
 *
 *
 *         // Выводим отформатированное значение на экран
 *
 *     }
 * }
 */

// JavaRush
package ru.javarush.java.core.level06.task07;

public class Solution {
    public static void main(String[] args) {
        // Объявляем переменную и присваиваем ей цену товара
        double productPrice = 1234.56789;

        // Форматируем число так, чтобы было ровно два знака после запятой
        String productPrice2f = String.format("%.2f", productPrice);

        // Выводим отформатированное значение на экран
        System.out.println(productPrice2f);
    }
}

/*
 * // JavaRush
 * Правильное решение:
 * // Author: JavaRush's team
 * package ru.javarush.java.core.level06.task07;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Объявляем переменную и присваиваем ей цену товара
 *         double productPrice = 1234.56789;
 *
 *         // Форматируем число так, чтобы было ровно два знака после запятой
 *         String formatted = String.format("%.2f", productPrice);
 *
 *         // Выводим отформатированное значение на экран
 *         System.out.println(formatted);
 *     }
 * }
 */