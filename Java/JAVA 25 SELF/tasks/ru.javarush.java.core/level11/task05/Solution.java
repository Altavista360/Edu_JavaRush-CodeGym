/*
 * Authors: JavaRush's team, CodeGym's team, Altavista360
 * Version: 1.0.0
 */

/*
 * // JavaRush
 * Задача: Надежный робот-исследователь 🤖
 * Ссылка: https://javarush.com/tasks/ru.javarush.java.core.level11.task05
 */

/*
 * // CodeGym
 * Task: Reliable Explorer Robot 🤖
 * Link: https://codegym.cc/tasks/en.codegym.java.core.level11.task05
 */

/*
 * // JavaRush
 * Условие:
 * Вы программируете умного робота-исследователя, который должен пройти 100 метров. Обычно он знает, сколько шагов приходится на один метр. Но сегодня его сенсоры почему-то сошли с ума и выдали, что stepsPerUnit равно 0! Робот должен быть максимально надежным, поэтому его программа ни в коем случае не должна "упасть" из-за такой глупости.
 * Объявите целочисленную переменную totalDistance со значением 100 и другую переменную stepsPerUnit со значением 0. Попробуйте выполнить операцию деления totalDistance на stepsPerUnit. Оберните эту критическую операцию в блок try-catch, чтобы перехватить неизбежное исключение. Если оно произойдет, выведите на экран дружелюбное сообщение для оператора: "Робот сообщает: Деление на ноль невозможно! Пожалуйста, проверьте сенсоры."
 */

/*
 * // JavaRush
 * Требования:
 * • В программе должны быть объявлены две переменные типа int: totalDistance со значением 100 и stepsPerUnit со значением 0.
 * • Программа должна попытаться выполнить деление totalDistance на stepsPerUnit.
 * • Операция деления должна быть обернута в блок try-catch для перехвата возможного исключения.
 * • В блоке catch должно быть перехвачено соответствующее исключение (например, ArithmeticException), возникающее при делении на ноль.
 * • В случае возникновения исключения программа должна вывести на экран сообщение: "Робот сообщает: Деление на ноль невозможно! Пожалуйста, проверьте сенсоры."
 */

/*
 * // JavaRush
 * Черновик:
 * package ru.javarush.java.core.level11.task05;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Объявляем переменные по условию
 *
 *
 *         try {
 *             // Пытаемся выполнить деление, которое вызовет ArithmeticException (деление на ноль)
 *
 *
 *             // Этот вывод здесь для наглядности (не будет выполнен при stepsPerUnit = 0)
 *
 *
 *         } catch (ArithmeticException e) {
 *             // Дружелюбное сообщение для оператора при делении на ноль
 *
 *
 *         }
 *     }
 * }
 */

// JavaRush
package ru.javarush.java.core.level11.task05;

public class Solution {
    public static void main(String[] args) {
        // Объявляем переменные по условию
        int totalDistance = 100;
        int stepsPerUnit = 0;

        try {
            // Пытаемся выполнить деление, которое вызовет ArithmeticException (деление на ноль)
            int foo = totalDistance / stepsPerUnit;

            // Этот вывод здесь для наглядности (не будет выполнен при stepsPerUnit = 0)
            System.out.println(foo);

        } catch (ArithmeticException e) {
            // Дружелюбное сообщение для оператора при делении на ноль
            System.out.println("Робот сообщает: Деление на ноль невозможно! Пожалуйста, проверьте сенсоры.");

        }
    }
}

/*
 * // JavaRush
 * Правильное решение:
 * // Author: JavaRush's team
 * package ru.javarush.java.core.level11.task05;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Объявляем переменные по условию
 *         int totalDistance = 100;
 *         int stepsPerUnit = 0;
 *
 *         try {
 *             // Пытаемся выполнить деление, которое вызовет ArithmeticException (деление на ноль)
 *             int steps = totalDistance / stepsPerUnit;
 *
 *             // Этот вывод здесь для наглядности (не будет выполнен при stepsPerUnit = 0)
 *             System.out.println(steps);
 *         } catch (ArithmeticException e) {
 *             // Дружелюбное сообщение для оператора при делении на ноль
 *             System.out.println("Робот сообщает: Деление на ноль невозможно! Пожалуйста, проверьте сенсоры.");
 *         }
 *     }
 * }
 */