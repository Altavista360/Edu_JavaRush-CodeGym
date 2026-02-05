/*
 * Authors: JavaRush's team, CodeGym's team, Altavista360
 * Version: 1.0.0
 */

/*
 * // JavaRush
 * Задача: Оценка ресурсов для космической колонии 🛰️
 * Ссылка: https://javarush.com/tasks/ru.javarush.java.core.level06.task13
 */

/*
 * // CodeGym
 * Task: Resource estimate for a space colony 🛰️
 * Link: https://codegym.cc/tasks/en.codegym.java.core.level06.task13
 */

/*
 * // JavaRush
 * Условие:
 * Представьте, что вы планируете ресурсы для строительства новой космической колонии на далёкой планете. У вас есть расчёт, который даёт дробное число необходимого металла, скажем, 789.456 тонн.
 * Создайте переменную типа double с именем rawMetalEstimate и присвойте ей это или любое другое дробное значение.
 * Однако для логистики вам нужно знать целое число, округлённое до ближайшего значения. Используйте Math.round для того, чтобы округлить rawMetalEstimate до ближайшего целого числа.
 * Затем выведите этот более удобный для планирования результат на экран, чтобы знать, сколько тонн металла заказывать.
 */

/*
 * // JavaRush
 * Требования:
 * • В программе должна быть объявлена переменная типа double с именем rawMetalEstimate.
 * • Переменной rawMetalEstimate должно быть присвоено дробное значение (например, 789.456).
 * • Значение rawMetalEstimate должно быть округлено до ближайшего целого числа с использованием метода Math.round.
 * • Округлённое значение должно быть выведено на экран.
 */

/*
 * // JavaRush
 * Черновик:
 * package ru.javarush.java.core.level06.task13;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Исходная оценка количества металла (в тоннах) с дробной частью
 *
 *
 *         // Округляем до ближайшего целого числа с помощью Math.round (результат типа long)
 *
 *
 *         // Выводим округленное значение на экран
 *
 *     }
 * }
 */

// JavaRush
package ru.javarush.java.core.level06.task13;

public class Solution {
    public static void main(String[] args) {
        // Исходная оценка количества металла (в тоннах) с дробной частью
        double rawMetalEstimate = 789.456;

        // Округляем до ближайшего целого числа с помощью Math.round (результат типа long)
        long foo = Math.round(rawMetalEstimate);

        // Выводим округленное значение на экран
        System.out.println(foo);
    }
}

/*
 * // JavaRush
 * Правильное решение:
 * // Author: JavaRush's team
 * package ru.javarush.java.core.level06.task13;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Исходная оценка количества металла (в тоннах) с дробной частью
 *         double rawMetalEstimate = 789.456;
 *
 *         // Округляем до ближайшего целого числа с помощью Math.round (результат типа long)
 *         long roundedTons = Math.round(rawMetalEstimate);
 *
 *         // Выводим округленное значение на экран
 *         System.out.println(roundedTons);
 *     }
 * }
 */