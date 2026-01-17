/*
 * Authors: JavaRush's team, CodeGym's team, Altavista360
 * Version: 1.0.0
 */

/*
 * // JavaRush
 * Задача: Сообщение в чате 💬
 * Ссылка: https://javarush.com/tasks/ru.javarush.java.core.level01.task02
 */

/*
 * // CodeGym
 * Task: Chat message 💬
 * Link: https://codegym.cc/tasks/en.codegym.java.core.level01.task02
 */

/*
 * // JavaRush
 * Условие:
 * Imagine you are sending a message in a chat. Write a program that prints the current year — 2025 — and the emoji 😅. Each message should be on a separate line.
 */

/*
 * // CodeGym
 * Condition:
 * Представьте, что вы отправляете сообщение в чат. Напишите программу, которая выводит на экран текущий год — 2025 — и смайлик 😅. Каждое сообщение должно быть на отдельной строке.
 */

/*
 * // JavaRush
 * Требования:
 * • Программа должна вывести на экран число 2025.
 * • Программа должна вывести на экран смайлик 😅.
 * • Число 2025 и смайлик 😅 должны выводиться на отдельных строках, а не в одной строке.
 * • Для вывода сообщений на экран необходимо использовать команду System.out.println.
 */

/*
 * // CodeGym
 * Requirements:
 * • The program must print the number 2025.
 * • The program must print the emoji 😅.
 * • The number 2025 and the emoji 😅 must be printed on separate lines, not on the same line.
 * • Use System.out.println to print messages to the screen.
 */

/*
 * // JavaRush
 * Черновик:
 * package ru.javarush.java.core.level01.task02;
 *
 * public class Solution
 * {
 *     public static void main(String[] args)
 *     {
 *         // Выводим на экран фразу "Круто быть программистом!😎"
 *
 *     }
 * }
 */

/*
 * // CodeGym
 * Draft:
 * package en.codegym.java.core.level01.task02;
 *
 * public class Solution
 * {
 *     public static void main(String[] args)
 *     {
 *         // Print the current year 2025 on a separate line
 *
 *
 *         // Print the emoji 😅 on a separate line
 *
 *     }
 * }
 */

// JavaRush
package ru.javarush.java.core.level01.task02;

public class Solution
{
    public static void main(String[] args)
    {
        // Выводим текущий год 2025 на отдельной строке
        System.out.println("2025");

        // Выводим смайлик 😅 на отдельной строке
        System.out.println("😅");
    }
}

/*
// CodeGym
package en.codegym.java.core.level01.task02;

public class Solution
{
    public static void main(String[] args)
    {
        // Print the current year 2025 on a separate line
        System.out.println("2025");

        // Print the emoji 😅 on a separate line
        System.out.println("😅");
    }
}
*/

/*
 * // JavaRush
 * Правильное решение:
 * // Author: JavaRush's team
 * package ru.javarush.java.core.level01.task02;
 *
 * public class Solution
 * {
 *     public static void main(String[] args)
 *     {
 *         // Выводим текущий год 2025 на отдельной строке
 *         System.out.println(2025);
 *
 *         // Выводим смайлик 😅 на отдельной строке
 *         System.out.println("😅");
 *     }
 * }
 */

/*
 * // CodeGym
 * Correct solution:
 * // Author: CodeGym's team
 * package en.codegym.java.core.level01.task02;
 *
 * public class Solution
 * {
 *     public static void main(String[] args)
 *     {
 *         // Print the current year 2025 on a separate line
 *         System.out.println(2025);
 *
 *         // Print the emoji 😅 on a separate line
 *         System.out.println("😅");
 *     }
 * }
 */