/*
 * Authors: JavaRush's team, CodeGym's team, Altavista360
 * Version: 1.0.0
 */

/*
 * // JavaRush
 * Задача: Отметка текущего дня в календаре 🗓️
 * Ссылка: https://javarush.com/tasks/ru.javarush.java.core.level13.task01
 */

/*
 * // CodeGym
 * Task: Marking the current day in the calendar 🗓️
 * Link: https://codegym.cc/tasks/en.codegym.java.core.level13.task01
 */

/*
 * // JavaRush
 * Условие:
 * Представьте, что вы создаете умный цифровой календарь. Ваша первая задача — автоматически отметить сегодняшний день.
 * Для этого вам нужно захватить текущую дату и сохранить ее. Создайте переменную типа LocalDate под названием currentCalendarDate, в которую поместите сегодняшний день.
 * После этого покажите эту важную дату на экране, чтобы пользователь мог ее увидеть.
 */

/*
 * // JavaRush
 * Требования:
 * • В программе должен быть импортирован класс java.time.LocalDate.
 * • В программе должна быть объявлена переменная с именем currentCalendarDate типа LocalDate.
 * • В переменную currentCalendarDate должно быть записано текущее значение даты с помощью метода LocalDate.now().
 * • Программа должна вывести на экран значение переменной currentCalendarDate.
 */

/*
 * // JavaRush
 * Черновик:
 * package ru.javarush.java.core.level13.task01;
 *
 * import java.time.LocalDate;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Создаем переменную типа LocalDate и записываем в нее сегодняшнюю дату
 *
 *
 *         // Выводим дату на экран
 *
 *     }
 * }
 */

// JavaRush
package ru.javarush.java.core.level13.task01;

import java.time.LocalDate;

public class Solution {
    public static void main(String[] args) {
        // Создаем переменную типа LocalDate и записываем в нее сегодняшнюю дату
        LocalDate currentCalendarDate = LocalDate.now();

        // Выводим дату на экран
        System.out.println(currentCalendarDate);
    }
}

/*
 * // JavaRush
 * Правильное решение:
 * // Author: JavaRush's team
 * package ru.javarush.java.core.level13.task01;
 *
 * import java.time.LocalDate;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Создаем переменную типа LocalDate и записываем в нее сегодняшнюю дату
 *         LocalDate currentCalendarDate = LocalDate.now();
 *
 *         // Выводим дату на экран
 *         System.out.println(currentCalendarDate);
 *     }
 * }
 */