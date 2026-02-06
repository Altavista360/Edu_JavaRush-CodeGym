/*
 * Authors: JavaRush's team, CodeGym's team, Altavista360
 * Version: 1.0.0
 */

/*
 * // JavaRush
 * Задача: Отображение мировых продаж в удобном формате 🌍
 * Ссылка: https://javarush.com/tasks/ru.javarush.java.core.level06.task16
 */

/*
 * // CodeGym
 * Task: Displaying Global Sales in a Readable Format 🌍
 * Link: https://codegym.cc/tasks/en.codegym.java.core.level06.task16
 */

/*
 * // JavaRush
 * Условие:
 * Ваша компания является глобальным лидером, и вам нужно представить общую сумму мировых продаж, которая, конечно же, составляет миллиарды!
 * Создайте переменную типа double и присвойте ей значение, например, 12345678.9012 (миллионов).
 * Для удобства чтения таких огромных чисел в финансовой отчётности принято использовать разделители тысяч, а также показывать только два знака после запятой.
 * Используя класс DecimalFormat, отформатируйте вашу переменную totalGlobalSales таким образом, чтобы она отображалась с разделителем тысяч (например, 12,345,678.90) и ровно двумя знаками после запятой.
 * Выведите этот впечатляющий и легко читаемый результат на экран.
 */

/*
 * // JavaRush
 * Требования:
 * • В программе должна быть объявлена переменная типа double с именем totalGlobalSales.
 * • Переменной totalGlobalSales должно быть присвоено значение 12345678.9012.
 * • Для форматирования числа необходимо использовать класс DecimalFormat.
 * • Шаблон форматирования должен обеспечивать наличие разделителей тысяч и ровно двух знаков после запятой (например, 12,345,678.90).
 * • Значение переменной totalGlobalSales должно быть отформатировано с помощью настроенного объекта DecimalFormat.
 * • Отформатированное значение должно быть выведено на экран.
 */

/*
 * // JavaRush
 * Черновик:
 * package ru.javarush.java.core.level06.task16;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Объявляем и инициализируем сумму мировых продаж (в миллионах)
 *
 *
 *         // Шаблон "#,##0.00" — добавляет разделители тысяч и ровно 2 знака после запятой
 *
 *
 *         // Форматируем и выводим результат на экран
 *
 *     }
 * }
 */

// JavaRush
package ru.javarush.java.core.level06.task16;

import java.text.DecimalFormat;

public class Solution {
    public static void main(String[] args) {
        // Объявляем и инициализируем сумму мировых продаж (в миллионах)
        double totalGlobalSales = 12345678.9012;

        // Шаблон "#,##0.00" — добавляет разделители тысяч и ровно 2 знака после запятой
        DecimalFormat foo = new DecimalFormat("#,##0.00");

        // Форматируем и выводим результат на экран
        String bar = foo.format(totalGlobalSales);
        System.out.println(bar);
    }
}

/*
 * // JavaRush
 * Правильное решение:
 * // Author: JavaRush's team
 * package ru.javarush.java.core.level06.task16;
 *
 * import java.text.DecimalFormat;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Объявляем и инициализируем сумму мировых продаж (в миллионах)
 *         double totalGlobalSales = 12345678.9012;
 *
 *         // Шаблон "#,##0.00" — добавляет разделители тысяч и ровно 2 знака после запятой
 *         DecimalFormat formatter = new DecimalFormat("#,##0.00");
 *
 *         // Форматируем и выводим результат на экран
 *         String formatted = formatter.format(totalGlobalSales);
 *         System.out.println(formatted);
 *     }
 * }
 */