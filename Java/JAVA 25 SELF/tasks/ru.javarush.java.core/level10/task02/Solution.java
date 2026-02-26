/*
 * Authors: JavaRush's team, CodeGym's team, Altavista360
 * Version: 1.0.0
 */

/*
 * // JavaRush
 * Задача: Проверка ввода цифры 🔢
 * Ссылка: https://javarush.com/tasks/ru.javarush.java.core.level10.task02
 */

/*
 * // CodeGym
 * Task: Digit Input Validation 🔢
 * Link: https://codegym.cc/tasks/en.codegym.java.core.level10.task02
 */

/*
 * // JavaRush
 * Условие:
 * Вы создаёте интерактивную форму, где пользователю нужно ввести всего один символ — например, для подтверждения кода или ввода одиночной цифры. Вам нужно убедиться, что введённый символ действительно является цифрой, а не буквой или чем-то ещё.
 * Для этого создайте переменную типа char и присвойте ей символ '7'. Затем, словно мудрый инспектор, используйте класс-обёртку Character, чтобы определить, является ли этот символ настоящей цифрой. Выведите результат этой проверки на экран, чтобы пользователь знал, корректен ли его ввод.
 */

/*
 * // JavaRush
 * Требования:
 * • В программе должна быть создана переменная типа char и ей должен быть присвоен символ '7'.
 * • Для проверки, является ли символ цифрой, необходимо использовать методы класса-обёртки Character.
 * • Должен быть использован метод Character.isDigit(char), чтобы определить, является ли символ цифрой.
 * • Результат проверки (true или false) должен быть выведен на экран.
 */

/*
 * // JavaRush
 * Черновик:
 * package ru.javarush.java.core.level10.task02;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Объявляем переменную типа char и присваиваем ей символ '7'
 *         char ch = '7';
 *
 *         // Используем класс-обёртку Character для проверки, является ли символ цифрой
 *
 *
 *         // Выводим результат проверки на экран
 *
 *     }
 * }
 */

// JavaRush
package ru.javarush.java.core.level10.task02;

public class Solution {
    public static void main(String[] args) {
        // Объявляем переменную типа char и присваиваем ей символ '7'
        char ch = '7';

        // Используем класс-обёртку Character для проверки, является ли символ цифрой
        boolean foo = Character.isDigit(ch);

        // Выводим результат проверки на экран
        System.out.println(foo);
    }
}

/*
 * // JavaRush
 * Правильное решение:
 * // Author: JavaRush's team
 * package ru.javarush.java.core.level10.task02;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Объявляем переменную типа char и присваиваем ей символ '7'
 *         char ch = '7';
 *
 *         // Используем класс-обёртку Character для проверки, является ли символ цифрой
 *         boolean isDigit = Character.isDigit(ch);
 *
 *         // Выводим результат проверки на экран
 *         System.out.println(isDigit);
 *     }
 * }
 */