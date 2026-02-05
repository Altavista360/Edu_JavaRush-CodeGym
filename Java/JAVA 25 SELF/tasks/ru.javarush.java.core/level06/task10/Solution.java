/*
 * Authors: JavaRush's team, CodeGym's team, Altavista360
 * Version: 1.0.0
 */

/*
 * // JavaRush
 * Задача: Изучение границ вселенной вычислений 🌌
 * Ссылка: https://javarush.com/tasks/ru.javarush.java.core.level06.task10
 */

/*
 * // CodeGym
 * Task: Exploring the Limits of the Computational Universe 🌌
 * Link: https://codegym.cc/tasks/en.codegym.java.core.level06.task10
 */

/*
 * // JavaRush
 * Условие:
 * Вы — исследователь, который пытается понять границы числовых вычислений. Представьте, что вы делите 1.0 на 0.0, пытаясь симулировать бесконечность или что-то за пределами понимания.
 * Создайте переменную типа double с именем cosmicEvent и присвойте ей результат этого деления.
 * Сначала выведите значение cosmicEvent на экран, чтобы увидеть, что получится.
 * Затем, чтобы точно подтвердить, что вы столкнулись с бесконечностью, выведите результат вызова специального метода Double.isInfinite() для вашей переменной cosmicEvent.
 */

/*
 * // JavaRush
 * Требования:
 * • программе должна быть объявлена переменная типа double с именем cosmicEvent.
 * • Переменной cosmicEvent должно быть присвоено значение выражения 1.0 / 0.0.
 * • Программа должна вывести на экран значение переменной cosmicEvent.
 * • Программа должна вывести результат вызова метода Double.isInfinite() для переменной cosmicEvent.
 */

/*
 * // JavaRush
 * Черновик:
 * package ru.javarush.java.core.level06.task10;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Делим 1.0 на 0.0: в мире double это не ошибка, а положительная бесконечность
 *
 *
 *         // Выводим значение переменной (ожидается "Infinity")
 *
 *
 *         // Подтверждаем, что значение действительно бесконечность
 *
 *     }
 * }
 */

// JavaRush
package ru.javarush.java.core.level06.task10;

public class Solution {
    public static void main(String[] args) {
        // Делим 1.0 на 0.0: в мире double это не ошибка, а положительная бесконечность
        double cosmicEvent = 1.0 / 0.0;

        // Выводим значение переменной (ожидается "Infinity")
        System.out.println(cosmicEvent);

        // Подтверждаем, что значение действительно бесконечность
        System.out.println(Double.isInfinite(cosmicEvent));
    }
}

/*
 * // JavaRush
 * Правильное решение:
 * // Author: JavaRush's team
 * package ru.javarush.java.core.level06.task10;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Делим 1.0 на 0.0: в мире double это не ошибка, а положительная бесконечность
 *         double cosmicEvent = 1.0 / 0.0;
 *
 *         // Выводим значение переменной (ожидается "Infinity")
 *         System.out.println(cosmicEvent);
 *
 *         // Подтверждаем, что значение действительно бесконечность
 *         System.out.println(Double.isInfinite(cosmicEvent));
 *     }
 * }
 */