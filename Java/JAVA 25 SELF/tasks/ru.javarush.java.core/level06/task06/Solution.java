/*
 * Authors: JavaRush's team, CodeGym's team, Altavista360
 * Version: 1.0.0
 */

/*
 * // JavaRush
 * Задача: Приём платежа в умном вендинговом автомате 💰
 * Ссылка: https://javarush.com/tasks/ru.javarush.java.core.level06.task06
 */

/*
 * // CodeGym
 * Task: Payment acceptance in a smart vending machine 💰
 * Link: https://codegym.cc/tasks/en.codegym.java.core.level06.task06
 */

/*
 * // JavaRush
 * Условие:
 * Представьте, что вы разрабатываете программное обеспечение для нового, умного вендингового автомата. Чтобы покупатель мог оплатить товар, автомату нужно точно узнать, какую сумму денег он внёс.
 * Используя Scanner, попросите покупателя ввести сумму платежа. Эта сумма может быть дробной (например, 5.75 за чипсы).
 * Сохраните введённое вещественное число в переменную типа double с именем customerPayment.
 * В конце подтвердите полученную сумму, выведя на экран: "Внесено средств: " за которым следует точная сумма, введённая покупателем.
 */

/*
 * // JavaRush
 * Требования:
 * • Программа должна использовать класс Scanner для считывания данных с клавиатуры.
 * • Программа должна запрашивать у пользователя ввод суммы платежа, которая может содержать дробную часть.
 * • Введённая пользователем сумма должна быть сохранена в переменную типа double с именем customerPayment.
 * • Программа должна вывести на экран строку "Внесено средств: ", после которой отображается введённая пользователем сумма без изменений.
 */

/*
 * // JavaRush
 * Черновик:
 * package ru.javarush.java.core.level06.task06;
 *
 * import java.util.Scanner;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Создаем объект Scanner для считывания данных с клавиатуры
 *
 *
 *         // Просим пользователя ввести сумму платежа
 *
 *
 *         // Считываем введенное значение и сохраняем его в переменную типа double
 *
 *
 *         // Подтверждаем полученную сумму, выводя её на экран
 *
 *     }
 * }
 */

// JavaRush
package ru.javarush.java.core.level06.task06;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        // Создаем объект Scanner для считывания данных с клавиатуры
        Scanner userInput = new Scanner(System.in);

        // Просим пользователя ввести сумму платежа
        System.out.println("Введите сумму платежа: ");

        // Считываем введенное значение и сохраняем его в переменную типа double
        double customerPayment = userInput.nextDouble();

        // Подтверждаем полученную сумму, выводя её на экран
        System.out.println("Внесено средств: " + customerPayment);
    }
}

/*
 * // JavaRush
 * Правильное решение:
 * // Author: JavaRush's team
 * package ru.javarush.java.core.level06.task06;
 *
 * import java.util.Scanner;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Создаем объект Scanner для считывания данных с клавиатуры
 *         Scanner console = new Scanner(System.in);
 *
 *         // Просим пользователя ввести сумму платежа
 *         System.out.println("Введите сумму платежа:");
 *
 *         // Считываем введенное значение и сохраняем его в переменную типа double
 *         double customerPayment = console.nextDouble();
 *
 *         // Подтверждаем полученную сумму, выводя её на экран
 *         System.out.println("Внесено средств: " + customerPayment);
 *     }
 * }
 */