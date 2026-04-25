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
 * public class SpecialCalculator {
 *
 *     // Метод, который мгновенно выводит сумму numA и numB на экран
 *     public void calculateAndDisplaySum(int numA, int numB) {
 *         // Локальный класс — временный «модуль» отображения результата.
 *         // Он объявлен внутри метода и имеет доступ к его параметрам (они эффективно final).
 *
 *
 *         // Создаем объект локального класса и сразу же выводим результат
 *
 *     }
 * }
 */

// JavaRush
package ru.javarush.java.core.level16.task15;

public class SpecialCalculator {

    // Метод, который мгновенно выводит сумму numA и numB на экран
    public void calculateAndDisplaySum(int numA, int numB) {
        // Локальный класс — временный «модуль» отображения результата.
        // Он объявлен внутри метода и имеет доступ к его параметрам (они эффективно final).
        class SumResultPrinter {
            void printResult() {
                System.out.println(numA + numB);
            }
        }

        // Создаем объект локального класса и сразу же выводим результат
        new SumResultPrinter().printResult();
    }
}

/*
 * // JavaRush
 * Правильное решение:
 * // Author: JavaRush's team
 * package ru.javarush.java.core.level16.task15;
 *
 * public class SpecialCalculator {
 *
 *     // Метод, который мгновенно выводит сумму numA и numB на экран
 *     public void calculateAndDisplaySum(int numA, int numB) {
 *         // Локальный класс — временный «модуль» отображения результата.
 *         // Он объявлен внутри метода и имеет доступ к его параметрам (они эффективно final).
 *         class SumResultPrinter {
 *             void printResult() {
 *                 // Выводим сумму на экран
 *                 System.out.println(numA + numB);
 *             }
 *         }
 *
 *         // Создаем объект локального класса и сразу же выводим результат
 *         new SumResultPrinter().printResult();
 *     }
 * }
 */