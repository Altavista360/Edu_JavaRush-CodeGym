/*
 * Authors: JavaRush's team, CodeGym's team, Altavista360
 * Version: 1.0.0
 */

/*
 * // JavaRush
 * Задача: Расчёт средней скорости космического корабля 🚀
 * Ссылка: https://javarush.com/tasks/ru.javarush.java.core.level06.task05
 */

/*
 * // CodeGym
 * Task: Calculating the spacecraft's average speed 🚀
 * Link: https://codegym.cc/tasks/en.codegym.java.core.level06.task05
 */

/*
 * // JavaRush
 * Условие:
 * Вы — главный навигатор космического корабля, выполняющего критически важную миссию. Вам необходимо точно рассчитать среднюю скорость полёта.
 * Известно, что ваш корабль пролетел journeyDistance равное 150.0 световых лет за travelTime в 2.5 земных цикла.
 * Объявите две переменные типа double с этими именами и соответствующими значениями.
 * Ваша задача — вычислить среднюю скорость (расстояние, делённое на время) и вывести этот результат на экран. Точность здесь критически важна для успеха миссии!
 */

/*
 * // JavaRush
 * Требования:
 * • В программе должны быть объявлены две переменные типа double: journeyDistance и travelTime.
 * • Переменной journeyDistance должно быть присвоено значение 150.0, а переменной travelTime — значение 2.5.
 * • Программа должна вычислять среднюю скорость как результат деления journeyDistance на travelTime.
 * • Результат вычисления средней скорости должен быть выведен на экран.
 */

/*
 * // JavaRush
 * Черновик:
 * package ru.javarush.java.core.level06.task05;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Объявляем переменную journeyDistance и присваиваем ей значение 150.0 (световых лет)
 *
 *         // Объявляем переменную travelTime и присваиваем ей значение 2.5 (земных циклов)
 *
 *
 *         // Вычисляем среднюю скорость: расстояние делим на время
 *
 *
 *         // Выводим результат вычисления средней скорости на экран
 *
 *     }
 * }
 */

// JavaRush
package ru.javarush.java.core.level06.task05;

public class Solution {
    public static void main(String[] args) {
        // Объявляем переменную journeyDistance и присваиваем ей значение 150.0 (световых лет)
        double journeyDistance = 150.0;
        // Объявляем переменную travelTime и присваиваем ей значение 2.5 (земных циклов)
        double travelTime = 2.5;

        // Вычисляем среднюю скорость: расстояние делим на время
        double speed = journeyDistance / travelTime;

        // Выводим результат вычисления средней скорости на экран
        System.out.println(speed);
    }
}

/*
 * // JavaRush
 * Правильное решение:
 * // Author: JavaRush's team
 * package ru.javarush.java.core.level06.task05;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Объявляем переменную journeyDistance и присваиваем ей значение 150.0 (световых лет)
 *         double journeyDistance = 150.0;
 *         // Объявляем переменную travelTime и присваиваем ей значение 2.5 (земных циклов)
 *         double travelTime = 2.5;
 *
 *         // Вычисляем среднюю скорость: расстояние делим на время
 *         double averageSpeed = journeyDistance / travelTime;
 *
 *         // Выводим результат вычисления средней скорости на экран
 *         System.out.println(averageSpeed);
 *     }
 * }
 */