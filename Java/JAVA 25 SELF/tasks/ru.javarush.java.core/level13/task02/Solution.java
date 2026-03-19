/*
 * Authors: JavaRush's team, CodeGym's team, Altavista360
 * Version: 1.0.0
 */

/*
 * // JavaRush
 * Задача: Взгляд назад: какой день был вчера? ⏪
 * Ссылка: https://javarush.com/tasks/ru.javarush.java.core.level13.task02
 */

/*
 * // CodeGym
 * Task: Looking back: what day was yesterday? ⏪
 * Link: https://codegym.cc/tasks/en.codegym.java.core.level13.task02
 */

/*
 * // JavaRush
 * Условие:
 * Вы разрабатываете приложение для историков, которое позволяет быстро переключаться между датами. Вам нужно узнать, какой была дата вчера.
 * Сначала получите текущую дату и сохраните ее в переменной LocalDate с именем today.
 * Затем, используя возможности Java, вычислите yesterday (вчерашнюю дату) и сохраните ее в отдельной переменной типа LocalDate с тем же именем.
 * Наконец, выведите yesterday на экран, чтобы подтвердить, что вы успешно заглянули в прошлое.
 */

/*
 * // JavaRush
 * Требования:
 * • В программе должен быть импортирован класс java.time.LocalDate.
 * • Программа должна получить текущую дату с помощью LocalDate.now() и сохранить ее в переменной с именем today.
 * • Программа должна вычислить дату, предшествующую today, и сохранить ее в переменной типа LocalDate с именем yesterday.
 * • Программа должна вывести значение переменной yesterday на экран.
 */

/*
 * // JavaRush
 * Черновик:
 * package ru.javarush.java.core.level13.task02;
 *
 * import java.time.LocalDate;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Получаем текущую дату системы и сохраняем в переменную today
 *
 *
 *         // Вычисляем дату, предшествующую today, и сохраняем в переменную yesterday
 *
 *
 *         // Выводим вчерашнюю дату на экран
 *
 *     }
 * }
 */

// JavaRush
package ru.javarush.java.core.level13.task02;

import java.time.LocalDate;

public class Solution {
    public static void main(String[] args) {
        // Получаем текущую дату системы и сохраняем в переменную today
        LocalDate today = LocalDate.now();

        // Вычисляем дату, предшествующую today, и сохраняем в переменную yesterday
        LocalDate yesterday = today.minusDays(1);

        // Выводим вчерашнюю дату на экран
        System.out.println(yesterday);
    }
}

/*
 * // JavaRush
 * Правильное решение:
 * // Author: JavaRush's team
 * package ru.javarush.java.core.level13.task02;
 *
 * import java.time.LocalDate;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Получаем текущую дату системы и сохраняем в переменную today
 *         LocalDate today = LocalDate.now();
 *
 *         // Вычисляем дату, предшествующую today, и сохраняем в переменную yesterday
 *         LocalDate yesterday = today.minusDays(1);
 *
 *         // Выводим вчерашнюю дату на экран
 *         System.out.println(yesterday);
 *     }
 * }
 */