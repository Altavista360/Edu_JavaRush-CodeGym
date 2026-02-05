/*
 * Authors: JavaRush's team, CodeGym's team, Altavista360
 * Version: 1.0.0
 */

/*
 * // JavaRush
 * Задача: Попытка вычислить Неизвестное ❓
 * Ссылка: https://javarush.com/tasks/ru.javarush.java.core.level06.task11
 */

/*
 * // CodeGym
 * Task: Attempt to compute the Unknown ❓
 * Link: https://codegym.cc/tasks/en.codegym.java.core.level06.task11
 */

/*
 * // JavaRush
 * Условие:
 * Вы — древний маг, пытающийся разгадать тайну чисел. Одна из таких тайн — квадратный корень из отрицательного числа.
 * Используйте Math.sqrt(-1) для вычисления квадратного корня из -1 и сохраните этот загадочный результат в переменной типа double с именем mysticAnomaly.
 * Выведите значение mysticAnomaly на экран, чтобы лицезреть его.
 * Затем, чтобы подтвердить, что вы столкнулись с чем-то неопределённым, вызовите специальный метод Double.isNaN() для mysticAnomaly и выведите его результат.
 */

/*
 * // JavaRush
 * Требования:
 * • В программе должен быть использован метод Math.sqrt для вычисления квадратного корня из -1.
 * • Результат вычисления Math.sqrt(-1) должен быть сохранен в переменной типа double с именем mysticAnomaly.
 * • На экран должно быть выведено значение переменной mysticAnomaly.
 * • Для переменной mysticAnomaly должен быть вызван метод Double.isNaN(), и результат этого вызова должен быть выведен на экран.
 */

/*
 * // JavaRush
 * Черновик:
 * package ru.javarush.java.core.level06.task11;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Вычисляем квадратный корень из -1 с помощью Math.sqrt
 *
 *
 *         // Выводим значение mysticAnomaly на экран
 *
 *
 *         // Проверяем, является ли mysticAnomaly NaN (Not a Number)
 *
 *
 *         // Выводим результат проверки на экран
 *
 *     }
 * }
 */

// JavaRush
package ru.javarush.java.core.level06.task11;

public class Solution {
    public static void main(String[] args) {
        // Вычисляем квадратный корень из -1 с помощью Math.sqrt
        double mysticAnomaly = Math.sqrt(-1);

        // Выводим значение mysticAnomaly на экран
        System.out.println(mysticAnomaly);

        // Проверяем, является ли mysticAnomaly NaN (Not a Number)
        boolean mysticAnomalyIsNaN = Double.isNaN(mysticAnomaly);

        // Выводим результат проверки на экран
        System.out.println(mysticAnomalyIsNaN);
    }
}

/*
 * // JavaRush
 * Правильное решение:
 * // Author: JavaRush's team
 * package ru.javarush.java.core.level06.task11;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Вычисляем квадратный корень из -1 с помощью Math.sqrt
 *         double mysticAnomaly = Math.sqrt(-1);
 *
 *         // Выводим значение mysticAnomaly на экран
 *         System.out.println("Значение mysticAnomaly: " + mysticAnomaly);
 *
 *         // Проверяем, является ли mysticAnomaly NaN (Not a Number)
 *         boolean isNaN = Double.isNaN(mysticAnomaly);
 *
 *         // Выводим результат проверки на экран
 *         System.out.println("Является ли mysticAnomaly NaN: " + isNaN);
 *     }
 * }
 */