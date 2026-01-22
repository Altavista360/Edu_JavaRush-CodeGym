/*
 * Authors: JavaRush's team, CodeGym's team, Altavista360
 * Version: 1.0.0
 */

/*
 * // JavaRush
 * Задача: Проверка погоды на улице ❄️
 * Ссылка: https://javarush.com/tasks/ru.javarush.java.core.level03.task02
 */

/*
 * // CodeGym
 * Task: Check the weather outside ❄️
 * Link: https://codegym.cc/tasks/en.codegym.java.core.level03.task02
 */

/*
 * // JavaRush
 * Условие:
 * Вы пишете программу, которая помогает выбрать одежду. Создайте переменную int currentTemperature и присвойте ей значение -5. С помощью оператора if-else выведите на экран "Оденьтесь потеплее, на улице мороз!", если температура меньше 0. Иначе выведите "Можно идти в легкой одежде!".
 */

/*
 * // JavaRush
 * Требования:
 * • В программе должна быть объявлена переменная int с именем currentTemperature и ей должно быть присвоено значение -5.
 * • Программа должна использовать оператор if-else для проверки значения переменной currentTemperature.
 * • Если значение currentTemperature меньше 0, программа должна вывести на экран строку "Оденьтесь потеплее, на улице мороз!".
 * • Если значение currentTemperature не меньше 0, программа должна вывести на экран строку "Можно идти в легкой одежде!".
 */

/*
 * // JavaRush
 * Черновик:
 * package ru.javarush.java.core.level03.task02;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Объявляем переменную currentTemperature и присваиваем ей значение -5
 *
 *
 *         // Проверяем, меньше ли температура 0
 *         if (/* условие */) {
 *             // Если температура меньше 0, выводим сообщение о морозе
 *
 *         } else {
 *             // Если температура не меньше 0, выводим сообщение о легкой одежде
 *
 *         }
 *     }
 * }
 */

// JavaRush
package ru.javarush.java.core.level03.task02;

public class Solution {
    public static void main(String[] args) {
        // Объявляем переменную currentTemperature и присваиваем ей значение -5
        int currentTemperature = -5;

        // Проверяем, меньше ли температура 0
        if (currentTemperature < 0) {
            // Если температура меньше 0, выводим сообщение о морозе
        System.out.println("Оденьтесь потеплее, на улице мороз!");
        } else {
            // Если температура не меньше 0, выводим сообщение о легкой одежде
        System.out.println("Можно идти в легкой одежде!");
        }
    }
}

/*
 * // JavaRush
 * Правильное решение:
 * // Author: JavaRush's team
 * package ru.javarush.java.core.level03.task02;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Объявляем переменную currentTemperature и присваиваем ей значение -5
 *         int currentTemperature = -5;
 *
 *         // Проверяем, меньше ли температура 0
 *         if (currentTemperature < 0) {
 *             // Если температура меньше 0, выводим сообщение о морозе
 *             System.out.println("Оденьтесь потеплее, на улице мороз!");
 *         } else {
 *             // Если температура не меньше 0, выводим сообщение о легкой одежде
 *             System.out.println("Можно идти в легкой одежде!");
 *         }
 *     }
 * }
 */