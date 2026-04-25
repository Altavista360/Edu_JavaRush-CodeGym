/*
 * Authors: JavaRush's team, CodeGym's team, Altavista360
 * Version: 1.0.0
 */

/*
 * // JavaRush
 * Задача: Специализированный калькулятор: мгновенное отображение суммы ➕
 * Ссылка: https://javarush.com/tasks/ru.javarush.java.core.level16.task15
 */

/*
 * // CodeGym
 * Task: Specialized calculator: instant sum display ➕
 * Link: https://codegym.cc/tasks/en.codegym.java.core.level16.task15
 */

/*
 * // JavaRush
 * Условие:
 * Вы разрабатываете специализированный калькулятор для выполнения уникальных расчётов. Когда пользователь вводит два числа для суммирования, вам нужно, чтобы результат был сразу же отображён на экране с помощью временного, одноразового модуля отображения.
 * В классе SpecialCalculator объявите метод calculateAndDisplaySum(int numA, int numB). Внутри этого метода объявите локальный класс с именем SumResultPrinter. Этот SumResultPrinter должен иметь метод printResult(), который выводит на экран сумму чисел numA и numB. Создайте объект SumResultPrinter и вызовите его метод printResult(), чтобы на экране появилась желаемая сумма.
 */

/*
 * // JavaRush
 * Требования:
 * • В классе SpecialCalculator должен быть объявлен метод calculateAndDisplaySum(int numA, int numB).
 * • Внутри метода calculateAndDisplaySum необходимо объявить локальный класс с именем SumResultPrinter.
 * • Локальный класс SumResultPrinter должен содержать метод printResult(), который выводит сумму numA и numB на экран.
 * • Внутри метода calculateAndDisplaySum необходимо создать объект SumResultPrinter и вызвать его метод printResult().
 */

/*
 * // JavaRush
 * Черновик:
 * package ru.javarush.java.core.level16.task15;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Демонстрация работы специализированного калькулятора
 *         SpecialCalculator calculator = new SpecialCalculator();
 *         calculator.calculateAndDisplaySum(7, 13); // Ожидаемый вывод: 20
 *     }
 * }
 */

// JavaRush
package ru.javarush.java.core.level16.task15;

public class Solution {
    public static void main(String[] args) {
        // Демонстрация работы специализированного калькулятора
        SpecialCalculator calculator = new SpecialCalculator();
        calculator.calculateAndDisplaySum(7, 13); // Ожидаемый вывод: 20
    }
}

/*
 * // JavaRush
 * Правильное решение:
 * // Author: JavaRush's team
 * package ru.javarush.java.core.level16.task15;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Демонстрация работы специализированного калькулятора
 *         SpecialCalculator calculator = new SpecialCalculator();
 *         calculator.calculateAndDisplaySum(7, 13); // Ожидаемый вывод: 20
 *     }
 * }
 */