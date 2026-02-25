/*
 * Authors: JavaRush's team, CodeGym's team, Altavista360
 * Version: 1.0.0
 */

/*
 * // JavaRush
 * Задача: Разворот строки
 * Ссылка: https://javarush.com/tasks/ru.javarush.java.core.level09.task19
 */

/*
 * // CodeGym
 * Task: String Reversal
 * Link: https://codegym.cc/tasks/en.codegym.java.core.level09.task19
 */

/*
 * // JavaRush
 * Условие:
 * Вы участвуете в криптографическом квесте, где одно из заданий — прочитать зашифрованное сообщение, которое было записано задом наперёд.
 * Вы — дешифровщик древних свитков, и вам нужно быстро и эффективно "отзеркалить" текст, чтобы раскрыть его смысл. Каждая буква на своём месте — ключ к разгадке!
 * Создайте объект StringBuilder, содержащий загадочную последовательность "abcdef".
 * Ваша задача — использовать подходящий метод, чтобы полностью развернуть эту строку, прочитав её задом наперёд.
 * Выведите получившуюся "отзеркаленную" строку на экран, раскрывая тайну послания.
 */

/*
 * // JavaRush
 * Требования:
 * • В программе должен быть создан объект класса StringBuilder с содержимым "abcdef".
 * • Для разворота строки необходимо использовать метод reverse() класса StringBuilder.
 * • После вызова метода reverse() содержимое объекта StringBuilder должно измениться на "fedcba".
 * • Получившаяся строка "fedcba" должна быть выведена на экран.
 */

/*
 * // JavaRush
 * Черновик:
 * package ru.javarush.java.core.level09.task19;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Создаем StringBuilder с исходной строкой
 *
 *
 *         // Разворачиваем строку с помощью стандартного метода reverse()
 *
 *
 *         // Выводим результат на экран: должно получиться "fedcba"
 *
 *     }
 * }
 */

// JavaRush
package ru.javarush.java.core.level09.task19;

public class Solution {
    public static void main(String[] args) {
        // Создаем StringBuilder с исходной строкой
        StringBuilder foo = new StringBuilder("abcdef");

        // Разворачиваем строку с помощью стандартного метода reverse()
        foo.reverse();

        // Выводим результат на экран: должно получиться "fedcba"
        System.out.println(foo.toString());
    }
}

/*
 * // JavaRush
 * Правильное решение:
 * // Author: JavaRush's team
 * package ru.javarush.java.core.level09.task19;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Создаем StringBuilder с исходной строкой
 *         StringBuilder sb = new StringBuilder("abcdef");
 *
 *         // Разворачиваем строку с помощью стандартного метода reverse()
 *         sb.reverse();
 *
 *         // Выводим результат на экран: должно получиться "fedcba"
 *         System.out.println(sb.toString());
 *     }
 * }
 */