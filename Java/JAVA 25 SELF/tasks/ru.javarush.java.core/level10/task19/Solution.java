/*
 * Authors: JavaRush's team, CodeGym's team, Altavista360
 * Version: 1.0.0
 */

/*
 * // JavaRush
 * Задача: Обновление старого планировщика 📅
 * Ссылка: https://javarush.com/tasks/ru.javarush.java.core.level10.task19
 */

/*
 * // CodeGym
 * Task: Updating the old task scheduler 📅
 * Link: https://codegym.cc/tasks/en.codegym.java.core.level10.task19
 */

/*
 * // JavaRush
 * Условие:
 * Представьте, что вы улучшаете старый планировщик задач, который раньше использовал устаревший switch для определения дня недели по его числовому коду. Теперь вы хотите модернизировать его с помощью нового, более компактного синтаксиса switch-выражения.
 * Создайте переменную int dayNumber и присвойте ей значение 2. Используя switch-выражение нового синтаксиса, присвойте строковой переменной dayNameString название дня:
 * • "Понедельник" — если dayNumber равен 1.
 * • "Вторник" — если dayNumber равен 2.
 * • "Среда" — если dayNumber равен 3.
 * • "Неизвестный день" — для любого другого значения.
 * Выведите dayNameString на экран.
 */

/*
 * // JavaRush
 * Требования:
 * • В программе должна быть объявлена переменная типа int с именем dayNumber, которой присвоено значение 2.
 * • Для определения значения переменной dayNameString необходимо использовать современный синтаксис switch-выражения (Java 12+), а не классический switch-case.
 * • В switch-выражении должны быть предусмотрены следующие соответствия: 1 — "Понедельник", 2 — "Вторник", 3 — "Среда", остальные значения — "Неизвестный день".
 * • Результат работы switch-выражения должен быть присвоен переменной типа String с именем dayNameString.
 * • Программа должна вывести значение переменной dayNameString на экран.
 */

/*
 * // JavaRush
 * Черновик:
 * package ru.javarush.java.core.level10.task19;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Числовой код дня недели
 *         int dayNumber = 2;
 *
 *         // Новое switch-выражение (стрелочный синтаксис) возвращает строку
 *
 *
 *         // Выводим результат на экран
 *
 *     }
 * }
 */

// JavaRush
package ru.javarush.java.core.level10.task19;

public class Solution {
    public static void main(String[] args) {
        // Числовой код дня недели
        int dayNumber = 2;

        // Новое switch-выражение (стрелочный синтаксис) возвращает строку
        String dayNameString = switch (dayNumber) {
            case 1 -> "Понедельник";
            case 2 -> "Вторник";
            case 3 -> "Среда";
            default -> "Неизвестный день";
        };

        // Выводим результат на экран
        System.out.println(dayNameString);
    }
}

/*
 * // JavaRush
 * Правильное решение:
 * // Author: JavaRush's team
 * package ru.javarush.java.core.level10.task19;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Числовой код дня недели
 *         int dayNumber = 2;
 *
 *         // Новое switch-выражение (стрелочный синтаксис) возвращает строку
 *         String dayNameString = switch (dayNumber) {
 *             case 1 -> "Понедельник";
 *             case 2 -> "Вторник";
 *             case 3 -> "Среда";
 *             default -> "Неизвестный день";
 *         };
 *
 *         // Выводим результат на экран
 *         System.out.println(dayNameString);
 *     }
 * }
 */