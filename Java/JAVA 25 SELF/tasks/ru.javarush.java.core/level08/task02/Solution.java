/*
 * Authors: JavaRush's team, CodeGym's team, Altavista360
 * Version: 1.0.0
 */

/*
 * // JavaRush
 * Задача: Личный калькулятор для быстрого подсчета ➕
 * Ссылка: https://javarush.com/tasks/ru.javarush.java.core.level08.task02
 */

/*
 * // CodeGym
 * Task: Personal pocket calculator for quick sums ➕
 * Link: https://codegym.cc/tasks/en.codegym.java.core.level08.task02
 */

/*
 * // JavaRush
 * Условие:
 * Вообразите, что вы создаете маленький карманный калькулятор для своего друга, который постоянно забывает, как складывать числа, особенно когда это нужно сделать очень быстро. Вам нужен специальный инструмент для этой простой, но такой необходимой операции.
 * Создайте класс под названием MathMagic – это будет ваш персональный интеллектуальный центр для математических задач. Внутри этого класса реализуйте статический метод showSum, который будет принимать два целых числа, например, первоеЧисло и второеЧисло.
 * Задача этого метода — мгновенно сложить их и немедленно показать полученный результат сложения прямо на экране, чтобы ваш друг сразу увидел ответ.
 * Затем, в главном разделе вашей программы, в методе main, активируйте этот инструмент, передав ему числа 7 и 5, чтобы продемонстрировать, как он работает в действии.
 */

/*
 * // JavaRush
 * Требования:
 * • В программе должен быть создан класс с именем MathMagic.
 * • Внутри класса MathMagic должен быть реализован статический метод showSum, принимающий два параметра типа int.
 * • Метод showSum должен вычислять сумму двух переданных ему целых чисел.
 * • Метод showSum должен выводить результат сложения на экран.
 * • В методе main необходимо вызвать MathMagic.showSum с аргументами 7 и 5.
 */

/*
 * // JavaRush
 * Черновик:
 * package ru.javarush.java.core.level08.task02;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Вызовем наш "калькулятор": сложим 7 и 5 и выведем результат
 *
 *     }
 * }
 *
 * // Класс-инструмент для простых математических операций
 * class MathMagic {
 *     // Статический метод принимает два int, считает сумму и выводит её
 *
 * }
 */

// JavaRush
package ru.javarush.java.core.level08.task02;

public class Solution {
    public static void main(String[] args) {
        // Вызовем наш "калькулятор": сложим 7 и 5 и выведем результат
        MathMagic.showSum(7, 5);
    }
}

// Класс-инструмент для простых математических операций
class MathMagic {
    // Статический метод принимает два int, считает сумму и выводит её
    public static void showSum(int foo, int bar) {
        int sum = foo + bar;
        System.out.println(sum);
    }
}

/*
 * // JavaRush
 * Правильное решение:
 * // Author: JavaRush's team
 * package ru.javarush.java.core.level08.task02;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Вызовем наш "калькулятор": сложим 7 и 5 и выведем результат
 *         MathMagic.showSum(7, 5);
 *     }
 * }
 *
 * // Класс-инструмент для простых математических операций
 * class MathMagic {
 *     // Статический метод принимает два int, считает сумму и выводит её
 *     public static void showSum(int firstNumber, int secondNumber) {
 *         int sum = firstNumber + secondNumber; // вычисляем сумму
 *         System.out.println(sum);              // выводим результат на экран
 *     }
 * }
 */