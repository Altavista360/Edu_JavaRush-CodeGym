/*
 * Authors: JavaRush's team, CodeGym's team, Altavista360
 * Version: 1.0.0
 */

/*
 * // JavaRush
 * Задача: Быстрое объявление приветствия 👋
 * Ссылка: https://javarush.com/tasks/ru.javarush.java.core.level10.task05
 */

/*
 * // CodeGym
 * Task: Quick greeting declaration 👋
 * Link: https://codegym.cc/tasks/en.codegym.java.core.level10.task05
 */

/*
 * // JavaRush
 * Условие:
 * Вы пишете небольшую утилиту для приветствия нового пользователя в системе. Вам нужно быстро объявить текстовое сообщение, не беспокоясь о его типе, так как компилятор Java справится с этим сам.
 * Внутри главного метода main объявите переменную с помощью ключевого слова var и сразу же присвойте ей строковое значение "Привет, Java!". После этого выведите значение этой переменной на экран, демонстрируя удобство var.
 */

/*
 * // JavaRush
 * Требования:
 * • Внутри метода main необходимо объявить переменную с помощью ключевого слова var.
 * • Переменная, объявленная с помощью var, должна быть инициализирована сразу при объявлении.
 * • Переменной, объявленной через var, должно быть присвоено строковое значение "Привет, Java!".
 * • Программа должна вывести на экран значение объявленной переменной.
 */

/*
 * // JavaRush
 * Черновик:
 * package ru.javarush.java.core.level10.task05;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Объявляем переменную с использованием ключевого слова var
 *
 *
 *         // Выводим значение переменной на экран
 *
 *     }
 * }
 */

// JavaRush
package ru.javarush.java.core.level10.task05;

public class Solution {
    public static void main(String[] args) {
        // Объявляем переменную с использованием ключевого слова var
        var greeting = "Привет, Java!";

        // Выводим значение переменной на экран
        System.out.println(greeting);
    }
}

/*
 * // JavaRush
 * Правильное решение:
 * // Author: JavaRush's team
 * package ru.javarush.java.core.level10.task05;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Объявляем переменную с использованием ключевого слова var
 *         var greeting = "Привет, Java!";
 *
 *         // Выводим значение переменной на экран
 *         System.out.println(greeting);
 *     }
 * }
 */