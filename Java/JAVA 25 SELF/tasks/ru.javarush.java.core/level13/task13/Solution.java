/*
 * Authors: JavaRush's team, CodeGym's team, Altavista360
 * Version: 1.0.0
 */

/*
 * // JavaRush
 * Задача: Стандартизация отчетов: текущая дата в ISO формате 📊
 * Ссылка: https://javarush.com/tasks/ru.javarush.java.core.level13.task13
 */

/*
 * // CodeGym
 * Task: Report Standardization: Current Date in ISO Format 📊
 * Link: https://codegym.cc/tasks/en.codegym.java.core.level13.task13
 */

/*
 * // JavaRush
 * Условие:
 * Вы разрабатываете систему генерации ежедневных отчетов, и для единообразия все даты должны быть представлены в стандартном формате ISO (например, 2025-06-01).
 * Ваша задача — получить currentReportDate (сегодняшнюю дату) и, используя класс DateTimeFormatter, отформатировать ее так, чтобы она соответствовала ISO_LOCAL_DATE.
 * Выведите formattedReportDate на экран, чтобы убедиться, что она выглядит идеально для всех отчетов.
 */

/*
 * // JavaRush
 * Требования:
 * • В программе должна использоваться стандартная библиотека java.time.LocalDate для получения сегодняшней даты.
 * • Для форматирования даты должен быть использован класс java.time.format.DateTimeFormatter.
 * • Дата должна быть отформатирована с помощью предопределенного форматтера DateTimeFormatter.ISO_LOCAL_DATE.
 * • Результат форматирования должен быть сохранён в переменную с именем formattedReportDate.
 * • Значение переменной formattedReportDate должно быть выведено на экран.
 */

/*
 * // JavaRush
 * Черновик:
 * package ru.javarush.java.core.level13.task13;
 *
 * import java.time.LocalDate;
 * import java.time.format.DateTimeFormatter;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Получаем сегодняшнюю дату как LocalDate
 *
 *
 *         // Форматируем дату в стандарт ISO_LOCAL_DATE (например, 2025-06-01)
 *
 *
 *         // Выводим отформатированную дату
 *
 *     }
 * }
 */

// JavaRush
package ru.javarush.java.core.level13.task13;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Solution {
    public static void main(String[] args) {
        // Получаем сегодняшнюю дату как LocalDate
        LocalDate foo = LocalDate.now();

        // Форматируем дату в стандарт ISO_LOCAL_DATE (например, 2025-06-01)
        String formattedReportDate = foo.format(DateTimeFormatter.ISO_LOCAL_DATE);

        // Выводим отформатированную дату
        System.out.println(formattedReportDate);
    }
}

/*
 * // JavaRush
 * Правильное решение:
 * // Author: JavaRush's team
 * package ru.javarush.java.core.level13.task13;
 *
 * import java.time.LocalDate;
 * import java.time.format.DateTimeFormatter;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Получаем сегодняшнюю дату как LocalDate
 *         LocalDate currentReportDate = LocalDate.now();
 *
 *         // Форматируем дату в стандарт ISO_LOCAL_DATE (например, 2025-06-01)
 *         String formattedReportDate = currentReportDate.format(DateTimeFormatter.ISO_LOCAL_DATE);
 *
 *         // Выводим отформатированную дату
 *         System.out.println(formattedReportDate);
 *     }
 * }
 */