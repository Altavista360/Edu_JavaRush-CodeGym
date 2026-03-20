/*
 * Authors: JavaRush's team, CodeGym's team, Altavista360
 * Version: 1.0.0
 */

/*
 * // JavaRush
 * Задача: Заглядываем в будущее: какой день будет завтра? ⏩
 * Ссылка: https://javarush.com/tasks/ru.javarush.java.core.level13.task03
 */

/*
 * // CodeGym
 * Task: Looking into the future: what day will tomorrow be? ⏩
 * Link: https://codegym.cc/tasks/en.codegym.java.core.level13.task03
 */

/*
 * // JavaRush
 * Условие:
 * Вы программируете футуристический планировщик событий. Чтобы помочь пользователю предвидеть будущее, вам нужно определить, какой день будет завтра.
 * Захватите today (текущую дату) и сохраните ее в переменной LocalDate. После этого предскажите tomorrow (завтрашнюю дату) и сохраните ее в новой переменной LocalDate с этим именем.
 * Покажите tomorrow на экране, чтобы пользователь мог начать планировать заранее!
 */

/*
 * // JavaRush
 * Требования:
 * • В программе должен быть импортирован класс java.time.LocalDate.
 * • Текущая дата должна быть получена с помощью метода LocalDate.now() и сохранена в переменной с именем today.
 * • Завтрашняя дата должна быть вычислена на основе today с помощью метода plusDays(1) и сохранена в переменной с именем tomorrow.
 * • Обе переменные today и tomorrow должны иметь тип LocalDate.
 * • Значение переменной tomorrow должно быть выведено на экран.
 */

/*
 * // JavaRush
 * Черновик:
 * package ru.javarush.java.core.level13.task03;
 *
 * import java.time.LocalDate;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Получаем текущую дату и сохраняем в переменной today
 *
 *
 *         // Вычисляем завтрашнюю дату на основе today
 *
 *
 *         // Выводим завтрашнюю дату на экран
 *
 *     }
 * }
 */

// JavaRush
package ru.javarush.java.core.level13.task03;

import java.time.LocalDate;

public class Solution {
    public static void main(String[] args) {
        // Получаем текущую дату и сохраняем в переменной today
        LocalDate today = LocalDate.now();

        // Вычисляем завтрашнюю дату на основе today
        LocalDate tomorrow = today.plusDays(1);

        // Выводим завтрашнюю дату на экран
        System.out.println(tomorrow);
    }
}

/*
 * // JavaRush
 * Правильное решение:
 * // Author: JavaRush's team
 * package ru.javarush.java.core.level13.task03;
 *
 * import java.time.LocalDate;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Получаем текущую дату и сохраняем в переменной today
 *         LocalDate today = LocalDate.now();
 *
 *         // Вычисляем завтрашнюю дату на основе today
 *         LocalDate tomorrow = today.plusDays(1);
 *
 *         // Выводим завтрашнюю дату на экран
 *         System.out.println(tomorrow);
 *     }
 * }
 */