/*
 * Authors: JavaRush's team, CodeGym's team, Altavista360
 * Version: 1.0.0
 */

/*
 * // JavaRush
 * Задача: Красивое представление отчёта о доходах 📊
 * Ссылка: https://javarush.com/tasks/ru.javarush.java.core.level06.task15
 */

/*
 * // CodeGym
 * Task: Polished Revenue Report Presentation 📊
 * Link: https://codegym.cc/tasks/en.codegym.java.core.level06.task15
 */

/*
 * // JavaRush
 * Условие:
 * Вы готовите ежеквартальный финансовый отчёт для инвесторов. Сумма дохода, которую вы получили, может быть любой, например, 3.1 миллиона или 125.789 миллионов.
 * Создайте переменную типа double с именем quarterlyRevenue и присвойте ей любое значение.
 * Чтобы отчёт выглядел профессионально и единообразно, все денежные суммы должны быть представлены с ровно двумя знаками после запятой, даже если это 3.1, оно должно выглядеть как 3.10.
 * Используйте класс DecimalFormat для форматирования quarterlyRevenue и выведите эту отформатированную строку на экран.
 */

/*
 * // JavaRush
 * Требования:
 * • В программе должна быть объявлена переменная с именем quarterlyRevenue типа double.
 * • Переменной quarterlyRevenue должно быть присвоено произвольное значение.
 * • Для форматирования значения quarterlyRevenue должен быть использован класс DecimalFormat.
 * • Значение quarterlyRevenue должно быть отформатировано так, чтобы в выводе всегда было ровно два знака после запятой (например, 3.10).
 * • Отформатированное значение quarterlyRevenue должно быть выведено на экран.
 */

/*
 * // JavaRush
 * Черновик:
 * package ru.javarush.java.core.level06.task15;
 *
 * import java.text.DecimalFormat;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Объявляем переменную для квартального дохода и присваиваем ей значение
 *
 *
 *         // Создаем форматер, который всегда выводит ровно две цифры после запятой
 *         // Шаблон "0.00" гарантирует наличие хотя бы одной цифры до запятой и двух после
 *
 *
 *         // Форматируем число и выводим результат на экран
 *
 *     }
 * }
 */

// JavaRush
package ru.javarush.java.core.level06.task15;

import java.text.DecimalFormat;

public class Solution {
    public static void main(String[] args) {
        // Объявляем переменную для квартального дохода и присваиваем ей значение
        double  quarterlyRevenue = 2.875;

        // Создаем форматер, который всегда выводит ровно две цифры после запятой
        // Шаблон "0.00" гарантирует наличие хотя бы одной цифры до запятой и двух после
        DecimalFormat foo = new DecimalFormat("0.00");

        // Форматируем число и выводим результат на экран
        String bar = foo.format(quarterlyRevenue);
        System.out.println(bar);
    }
}

/*
 * // JavaRush
 * Правильное решение:
 * // Author: JavaRush's team
 * package ru.javarush.java.core.level06.task15;
 *
 * import java.text.DecimalFormat;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Объявляем переменную для квартального дохода и присваиваем ей значение
 *         double quarterlyRevenue = 3.1;
 *
 *         // Создаем форматер, который всегда выводит ровно две цифры после запятой
 *         // Шаблон "0.00" гарантирует наличие хотя бы одной цифры до запятой и двух после
 *         DecimalFormat formatter = new DecimalFormat("0.00");
 *
 *         // Форматируем число и выводим результат на экран
 *         String formatted = formatter.format(quarterlyRevenue);
 *         System.out.println(formatted);
 *     }
 * }
 */