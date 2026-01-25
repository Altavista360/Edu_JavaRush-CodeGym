/*
 * Authors: JavaRush's team, CodeGym's team, Altavista360
 * Version: 1.0.0
 */

/*
 * // JavaRush
 * Задача: Проход на секретную вечеринку 🤫
 * Ссылка: https://javarush.com/tasks/ru.javarush.java.core.level03.task15
 */

/*
 * // CodeGym
 * Task: Getting into the secret party 🤫
 * Link: https://codegym.cc/tasks/en.codegym.java.core.level03.task15
 */

/*
 * // JavaRush
 * Условие:
 * Чтобы попасть на закрытую вечеринку, нужно выполнить три условия:
 * • hasInvitation (присвойте ей значение true)
 * • dressCodeMet (присвойте ей значение false)
 * • passwordIsCorrect (присвойте ей значение true)
 * Вы пройдете, только если все три условия верны. Создайте выражение boolean admitted = hasInvitation && dressCodeMet && passwordIsCorrect;
 * Затем создайте еще два выражения, расставив скобки по-разному: (hasInvitation && dressCodeMet) && passwordIsCorrect и hasInvitation && (dressCodeMet && passwordIsCorrect).
 * Выведите результаты всех трех выражений.
 */

/*
 * // JavaRush
 * Требования:
 * • В программе должны быть объявлены и инициализированы три переменные типа boolean: hasInvitation (значение true), dressCodeMet (значение false), passwordIsCorrect (значение true).
 * • Для определения допуска (admitted) должно быть использовано логическое выражение с оператором && между всеми тремя переменными.
 * • Должны быть созданы два дополнительных логических выражения, в которых используются разные варианты расстановки скобок: (hasInvitation && dressCodeMet) && passwordIsCorrect и hasInvitation && (dressCodeMet && passwordIsCorrect).
 * • Программа должна вывести значения всех трех логических выражений на экран.
 */

/*
 * // JavaRush
 * Черновик:
 * package ru.javarush.java.core.level03.task15;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Объявляем и инициализируем переменные для условий допуска
 *
 *
 *         // Основное логическое выражение без дополнительных скобок
 *
 *
 *         // Выражение с группировкой первых двух условий
 *
 *
 *         // Выражение с группировкой последних двух условий
 *
 *
 *         // Выводим результаты всех трёх выражений на экран
 *
 *
 *     }
 * }
 */

// JavaRush
package ru.javarush.java.core.level03.task15;

public class Solution {
    public static void main(String[] args) {
        // Объявляем и инициализируем переменные для условий допуска
        boolean hasInvitation = true;
        boolean dressCodeMet = false;
        boolean passwordIsCorrect = true;

        // Основное логическое выражение без дополнительных скобок
        boolean admitted = hasInvitation && dressCodeMet && passwordIsCorrect;

        // Выражение с группировкой первых двух условий
        boolean foo = (hasInvitation && dressCodeMet) && passwordIsCorrect;

        // Выражение с группировкой последних двух условий
        boolean bar = hasInvitation && (dressCodeMet && passwordIsCorrect);

        // Выводим результаты всех трёх выражений на экран
        System.out.println(admitted);
        System.out.println(foo);
        System.out.println(bar);
    }
}

/*
 * // JavaRush
 * Правильное решение:
 * // Author: JavaRush's team
 * package ru.javarush.java.core.level03.task15;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Объявляем и инициализируем переменные для условий допуска
 *         boolean hasInvitation = true;         // приглашение есть
 *         boolean dressCodeMet = false;         // дресс-код не соблюдён
 *         boolean passwordIsCorrect = true;     // пароль введён правильно
 *
 *         // Основное логическое выражение без дополнительных скобок
 *         boolean admitted = hasInvitation && dressCodeMet && passwordIsCorrect;
 *         // Выражение с группировкой первых двух условий
 *         boolean admitted1 = (hasInvitation && dressCodeMet) && passwordIsCorrect;
 *         // Выражение с группировкой последних двух условий
 *         boolean admitted2 = hasInvitation && (dressCodeMet && passwordIsCorrect);
 *
 *         // Выводим результаты всех трёх выражений на экран
 *         System.out.println(admitted);
 *         System.out.println(admitted1);
 *         System.out.println(admitted2);
 *     }
 * }
 */