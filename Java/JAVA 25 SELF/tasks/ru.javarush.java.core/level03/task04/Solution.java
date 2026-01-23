/*
 * Authors: JavaRush's team, CodeGym's team, Altavista360
 * Version: 1.0.0
 */

/*
 * // JavaRush
 * Задача: Приветствие по времени суток ☀️
 * Ссылка: https://javarush.com/tasks/ru.javarush.java.core.level03.task04
 */

/*
 * // CodeGym
 * Task: Greeting by Time of Day ☀️
 * Link: https://codegym.cc/tasks/en.codegym.java.core.level03.task04
 */

/*
 * // JavaRush
 * Условие:
 * Ваше приложение должно менять приветствие в зависимости от времени.
 * Объявите переменную int currentHour и присвойте ей значение 20.
 * Используйте оператор if-else if-else, чтобы вывести:
 * • "Доброе утро!", если currentHour меньше 12.
 * • "Добрый день!", если currentHour от 12 до 18 (включительно).
 * • "Добрый вечер!" во всех остальных случаях.
 */

/*
 * // JavaRush
 * Требования:
 * • В программе должна быть объявлена переменная int с именем currentHour и присвоено ей значение 20.
 * • Для выбора приветствия должен использоваться оператор if-else if-else.
 * • Если значение currentHour меньше 12, программа должна вывести "Доброе утро!".
 * • Если значение currentHour от 12 до 18 включительно, программа должна вывести "Добрый день!".
 * • Во всех остальных случаях программа должна вывести "Добрый вечер!".
 */

/*
 * // JavaRush
 * Черновик:
 * package ru.javarush.java.core.level03.task04;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Объявляем переменную currentHour и присваиваем ей значение 20
 *
 *
 *         // Используем оператор if-else if-else для выбора нужного приветствия
 *         if (/* условие */) {
 *             // Если текущее время меньше 12, считаем, что это утро
 *
 *         } else if (/* условие */) {
 *             // Если текущее время от 12 до 18 включительно, считаем, что это день
 *
 *         } else {
 *             // Во всех остальных случаях считаем, что это вечер
 *
 *         }
 *     }
 * }
 */

// JavaRush
package ru.javarush.java.core.level03.task04;

public class Solution {
    public static void main(String[] args) {
        // Объявляем переменную currentHour и присваиваем ей значение 20
        int currentHour = 20;

        // Используем оператор if-else if-else для выбора нужного приветствия
        if (currentHour < 12) {
            // Если текущее время меньше 12, считаем, что это утро
        System.out.println("Доброе утро!");
        } else if (currentHour >= 12 & currentHour <= 18) {
            // Если текущее время от 12 до 18 включительно, считаем, что это день
        System.out.println("Добрый день!");
        } else {
            // Во всех остальных случаях считаем, что это вечер
        System.out.println("Добрый вечер!");
        }
    }
}

/*
 * // JavaRush
 * Правильное решение:
 * // Author: JavaRush's team
 * package ru.javarush.java.core.level03.task04;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Объявляем переменную currentHour и присваиваем ей значение 20
 *         int currentHour = 20;
 *
 *         // Используем оператор if-else if-else для выбора нужного приветствия
 *         if (currentHour < 12) {
 *             // Если текущее время меньше 12, считаем, что это утро
 *             System.out.println("Доброе утро!");
 *         } else if (currentHour >= 12 && currentHour <= 18) {
 *             // Если текущее время от 12 до 18 включительно, считаем, что это день
 *             System.out.println("Добрый день!");
 *         } else {
 *             // Во всех остальных случаях считаем, что это вечер
 *             System.out.println("Добрый вечер!");
 *         }
 *     }
 * }
 */