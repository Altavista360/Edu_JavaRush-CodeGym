/*
 * Authors: JavaRush's team, CodeGym's team, Altavista360
 * Version: 1.0.0
 */

/*
 * // JavaRush
 * Задача: Неизменное число дней в неделе 📅
 * Ссылка: https://javarush.com/tasks/ru.javarush.java.core.level10.task06
 */

/*
 * // CodeGym
 * Task: Immutable number of days in a week 📅
 * Link: https://codegym.cc/tasks/en.codegym.java.core.level10.task06
 */

/*
 * // JavaRush
 * Условие:
 * Вы создаёте календарь или планировщик задач, и одной из фундаментальных констант для вас является число дней в неделе. Это значение никогда не меняется, и важно, чтобы случайно его нельзя было изменить в коде.
 * В методе main объявите переменную типа int с именем DAYS_IN_CALENDAR_WEEK. Сделайте её настоящей константой, используя модификатор final, и присвойте ей значение 7. В конце выведите значение этой константы на экран, подтверждая её неизменность.
 */

/*
 * // JavaRush
 * Требования:
 * • Переменная DAYS_IN_CALENDAR_WEEK должна быть объявлена с модификатором final, чтобы сделать её неизменяемой.
 * • Переменная DAYS_IN_CALENDAR_WEEK должна иметь тип int.
 * • Переменной DAYS_IN_CALENDAR_WEEK должно быть присвоено значение 7 при объявлении.
 * • Переменная DAYS_IN_CALENDAR_WEEK должна быть объявлена внутри метода main.
 * • Значение переменной DAYS_IN_CALENDAR_WEEK должно быть выведено на экран.
 */

/*
 * // JavaRush
 * Черновик:
 * package ru.javarush.java.core.level10.task06;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Объявляем константу: финальное целое число дней в календарной неделе
 *
 *
 *         // Выводим значение константы на экран
 *
 *     }
 * }
 */

// JavaRush
package ru.javarush.java.core.level10.task06;

public class Solution {
    public static void main(String[] args) {
        // Объявляем константу: финальное целое число дней в календарной неделе
        final int DAYS_IN_CALENDAR_WEEK = 7;

        // Выводим значение константы на экран
        System.out.println(DAYS_IN_CALENDAR_WEEK);
    }
}

/*
 * // JavaRush
 * Правильное решение:
 * // Author: JavaRush's team
 * package ru.javarush.java.core.level10.task06;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Объявляем константу: финальное целое число дней в календарной неделе
 *         final int DAYS_IN_CALENDAR_WEEK = 7;
 *
 *         // Выводим значение константы на экран
 *         System.out.println(DAYS_IN_CALENDAR_WEEK);
 *     }
 * }
 */