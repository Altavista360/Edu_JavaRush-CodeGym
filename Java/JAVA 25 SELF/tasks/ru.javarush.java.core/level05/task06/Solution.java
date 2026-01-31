/*
 * Authors: JavaRush's team, CodeGym's team, Altavista360
 * Version: 1.0.0
 */

/*
 * // JavaRush
 * Задача: Секрет древнего палиндрома 📜
 * Ссылка: https://javarush.com/tasks/ru.javarush.java.core.level05.task06
 */

/*
 * // CodeGym
 * Task: The Secret of the Ancient Palindrome 📜
 * Link: https://codegym.cc/tasks/en.codegym.java.core.level05.task06
 */

/*
 * // JavaRush
 * Условие:
 * В старинном замке нашли свиток с загадочным словом, и легенда гласит, что оно обладает особой силой, если читается одинаково как слева направо, так и справа налево. Вы — криптограф, которому поручено проверить, является ли это слово истинным "палиндромом".
 * Пользователь введёт вам эту загадочную строку (например, ancientRiddle). Ваша программа должна тщательно проанализировать её. Если послание читается одинаково в обоих направлениях, выведите "YES", подтверждая его магическую природу. В противном случае, если оно не является палиндромом, выведите "NO".
 */

/*
 * // JavaRush
 * Требования:
 * • Программа должна принимать строку, введённую пользователем с клавиатуры.
 * • Программа должна определить, является ли введённая строка палиндромом (читается одинаково слева направо и справа налево).
 * • Если строка — палиндром, программа должна вывести "YES". Если строка не является палиндромом, программа должна вывести "NO".
 * • Проверка должна учитывать регистр символов (например, "Anna" и "anna" считаются разными).
 * • Программа не должна выводить никаких других сообщений, кроме "YES" или "NO".
 */

/*
 * // JavaRush
 * Черновик:
 * package ru.javarush.java.core.level05.task06;
 *
 * import java.util.Scanner;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Создаем Scanner для чтения строки с клавиатуры
 *
 *
 *         // Проверяем палиндром двумя указателями: с начала и с конца
 *
 *
 *         for (/* инициализация */; /* условие */; /* изменение */) {
 *             // Проверка чувствительна к регистру, сравниваем символы напрямую
 *             if (/* условие */) {
 *
 *                 break; // Дальше проверять не нужно
 *             }
 *         }
 *
 *         // Вывод строго "YES" или "NO" без дополнительных сообщений
 *
 *     }
 * }
 */

// JavaRush
package ru.javarush.java.core.level05.task06;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        // Создаем Scanner для чтения строки с клавиатуры
        Scanner inputData = new Scanner(System.in);
        String ancientRiddle = inputData.nextLine();

        // Проверяем палиндром двумя указателями: с начала и с конца
        boolean palindromeString = true;

        for (int i = 0, j = ancientRiddle.length() - 1 /* инициализация */; i < j /* условие */; i++, j-- /* изменение */) {
            // Проверка чувствительна к регистру, сравниваем символы напрямую
            if (ancientRiddle.charAt(i) != ancientRiddle.charAt(j) /* условие */) {
                palindromeString = false;
                break; // Дальше проверять не нужно
            }
        }

        // Вывод строго "YES" или "NO" без дополнительных сообщений
        if (palindromeString == true) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}

/*
 * // JavaRush
 * Правильное решение:
 * // Author: JavaRush's team
 * package ru.javarush.java.core.level05.task06;
 *
 * import java.util.Scanner;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Создаем Scanner для чтения строки с клавиатуры
 *         Scanner console = new Scanner(System.in);
 *         String s = console.nextLine(); // Считываем всю строку целиком (включая пробелы)
 *
 *         // Проверяем палиндром двумя указателями: с начала и с конца
 *         boolean isPalindrome = true;
 *         for (int i = 0, j = s.length() - 1; i < j; i++, j--) {
 *             // Проверка чувствительна к регистру, сравниваем символы напрямую
 *             if (s.charAt(i) != s.charAt(j)) {
 *                 isPalindrome = false;
 *                 break; // Дальше проверять не нужно
 *             }
 *         }
 *
 *         // Вывод строго "YES" или "NO" без дополнительных сообщений
 *         System.out.println(isPalindrome ? "YES" : "NO");
 *     }
 * }
 */