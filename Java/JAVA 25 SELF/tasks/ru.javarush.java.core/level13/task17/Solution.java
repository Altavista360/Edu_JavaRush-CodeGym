/*
 * Authors: JavaRush's team, CodeGym's team, Altavista360
 * Version: 1.0.0
 */

/*
 * // JavaRush
 * Задача: Обратный отсчет до праздника 🎉
 * Ссылка: https://javarush.com/tasks/ru.javarush.java.core.level13.task17
 */

/*
 * // CodeGym
 * Task: Holiday Countdown 🎉
 * Link: https://codegym.cc/tasks/en.codegym.java.core.level13.task17
 */

/*
 * // JavaRush
 * Условие:
 * Вы создаете приложение для отсчета дней до предстоящего праздника. Сегодняшний день — это ваш отправной пункт.
 * Вам нужно определить holidayCountdownStart — дату, которая наступит ровно через 10 дней от сегодняшнего дня.
 * Создайте переменную типа LocalDate для today. Затем, прибавьте к ней 10 дней, используя специальный метод для дат, и сохраните результат в переменной holidayCountdownStart.
 * Выведите holidayCountdownStart на экран, чтобы все знали, когда начнется веселье!
 */

/*
 * // JavaRush
 * Требования:
 * • В программе должна быть объявлена переменная типа LocalDate с именем today, в которую сохраняется текущая дата.
 * • Для получения значения переменной today должен использоваться метод LocalDate.now().
 * • Для вычисления даты начала обратного отсчета (holidayCountdownStart) к переменной today должно быть прибавлено ровно 10 дней с помощью стандартного метода работы с датами.
 * • В программе должна быть объявлена переменная типа LocalDate с именем holidayCountdownStart, в которую записывается дата, наступающая через 10 дней после today.
 * • Программа должна вывести значение переменной holidayCountdownStart на экран.
 */

/*
 * // JavaRush
 * Черновик:
 * package ru.javarush.java.core.level13.task17;
 *
 * import java.time.LocalDate;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Получаем сегодняшнюю дату
 *
 *
 *         // Прибавляем к ней 10 дней, чтобы узнать дату начала обратного отсчета
 *
 *
 *         // Выводим результат на экран
 *
 *     }
 * }
 */

// JavaRush
package ru.javarush.java.core.level13.task17;

import java.time.LocalDate;

public class Solution {
    public static void main(String[] args) {
        // Получаем сегодняшнюю дату
        LocalDate today = LocalDate.now();

        // Прибавляем к ней 10 дней, чтобы узнать дату начала обратного отсчета
        LocalDate holidayCountdownStart = today.plusDays(10);

        // Выводим результат на экран
        System.out.println(holidayCountdownStart);
    }
}

/*
 * // JavaRush
 * Правильное решение:
 * // Author: JavaRush's team
 * package ru.javarush.java.core.level13.task17;
 *
 * import java.time.LocalDate;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Получаем сегодняшнюю дату
 *         LocalDate today = LocalDate.now();
 *
 *         // Прибавляем к ней 10 дней, чтобы узнать дату начала обратного отсчета
 *         LocalDate holidayCountdownStart = today.plusDays(10);
 *
 *         // Выводим результат на экран
 *         System.out.println(holidayCountdownStart);
 *     }
 * }
 */