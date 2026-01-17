/*
 * Authors: JavaRush's team, CodeGym's team, Altavista360
 * Version: 1.0.0
 */

/*
 * // JavaRush
 * Задача: Составление фразы из слов 📝
 * Ссылка: https://javarush.com/tasks/ru.javarush.java.core.level01.task03
 */

/*
 * // CodeGym
 * Task: Assembling a sentence from words 📝
 * Link: https://codegym.cc/tasks/en.codegym.java.core.level01.task03
 */

/*
 * // JavaRush
 * Условие:
 * Представьте, что вы собираете фразу по частям. Напишите программу, которая выводит на экран две строки, каждая на новой строке. Используйте для этого разные команды System.out.println():
 * • Первая строка: "Я учу Java."
 * • Вторая строка: "Это интересно!"
 * Выведите каждое слово (Я, учу, Java, Это, интересно) отдельной командой System.out.print() или System.out.println().
 */

/*
 * // CodeGym
 * Condition:
 * Imagine you're building a sentence piece by piece. Write a program that prints two lines, each on a new line. Use different commands System.out.println() for this:
 * • First line: "I learn Java."
 * • Second line: "This is interesting!"
 * Print each word (I, learn, Java, This, interesting) using a separate System.out.print() or System.out.println() command.
 */

/*
 * // JavaRush
 * Требования:
 * • Для вывода каждого слова должна быть использована отдельная команда System.out.print() или System.out.println().
 * • Слова должны выводиться в следующем порядке: "Я", "учу", "Java", затем "Это", "интересно".
 * • В результате на экране должно появиться две строки: первая — "Я учу Java.", вторая — "Это интересно!".
 * • Каждая из двух итоговых строк должна выводиться на новой строке экрана.
 */

/*
 * // CodeGym
 * Requirements:
 * • Each word must be printed using a separate System.out.print() or System.out.println() command.
 * • Words should be printed in the following order: "I", "learn", "Java", then "This", "interesting".
 * • The result should display two lines: the first — "I learn Java.", the second — "This is interesting!".
 * • Each of the two final lines must be printed on a new line of the screen.
 */

/*
 * // JavaRush
 * Черновик:
 * • package ru.javarush.java.core.level01.task03;
 * •
 * • public class Solution
 * • {
 * •     public static void main(String[] args)
 * •     {
 * •         // Выводим первое слово первой строки
 * •
 * •         // Добавляем пробел и выводим второе слово первой строки
 * •
 * •         // Добавляем пробел и выводим третье слово первой строки
 * •
 * •
 * •         // Выводим первое слово второй строки
 * •
 * •         // Добавляем пробел и выводим второе слово второй строки
 * •
 * •     }
 * • }
 */

/*
 * // CodeGym
 * Draft:
 * package en.codegym.java.core.level01.task03;
 *
 * public class Solution
 * {
 *     public static void main(String[] args)
 *     {
 *         // Print the first word of the first line
 *
 *         // Add a space and print the second word of the first line
 *
 *         // Add a space and print the third word of the first line
 *
 *
 *         // Print the first word of the second line
 *
 *         // Add a space and print the second word of the second line
 *
 *     }
 * }
 */

// JavaRush
package ru.javarush.java.core.level01.task03;

public class Solution
{
    public static void main(String[] args)
    {
        // Выводим первое слово первой строки
        System.out.print("Я");
        // Добавляем пробел и выводим второе слово первой строки
        System.out.print(" " + "учу");
        // Добавляем пробел и выводим третье слово первой строки
        System.out.println(" " + "Java" + ".");

        // Выводим первое слово второй строки
        System.out.print("Это");
        // Добавляем пробел и выводим второе слово второй строки
        System.out.print(" " + "интересно" + "!");
    }
}

/*
// CodeGym
package en.codegym.java.core.level01.task03;

public class Solution
{
    public static void main(String[] args)
    {
        // Print the first word of the first line
        System.out.print("I");
        // Add a space and print the second word of the first line
        System.out.print(" " + "learn");
        // Add a space and print the third word of the first line
        System.out.println(" " + "Java" + ".");

        // Print the first word of the second line
        System.out.print("This");
        // Add a space and print the second word of the second line
        System.out.print(" " + "is");
        System.out.println(" " + "interesting" + "!");
    }
}
*/

/*
 * // JavaRush
 * Правильное решение:
 * // Author: JavaRush's team
 * package ru.javarush.java.core.level01.task03;
 *
 * public class Solution
 * {
 *     public static void main(String[] args)
 *     {
 *         // Выводим первое слово первой строки
 *         System.out.print("Я");
 *         // Добавляем пробел и выводим второе слово первой строки
 *         System.out.print(" учу");
 *         // Добавляем пробел и выводим третье слово первой строки
 *         System.out.println(" Java.");
 *
 *         // Выводим первое слово второй строки
 *         System.out.print("Это");
 *         // Добавляем пробел и выводим второе слово второй строки
 *         System.out.println(" интересно!");
 *     }
 * }
 */

/*
 * // CodeGym
 * Correct solution:
 * // Author: CodeGym's team
 * package en.codegym.java.core.level01.task03;
 *
 * public class Solution
 * {
 *     public static void main(String[] args)
 *     {
 *         // Print the first word of the first line
 *         System.out.print("I");
 *         // Add a space and print the second word of the first line
 *         System.out.print(" learn");
 *         // Add a space and print the third word of the first line
 *         System.out.println(" Java.");
 *
 *         // Print the first word of the second line
 *         System.out.print("This");
 *         // Add a space and print the second word of the second line
 *         System.out.println(" is interesting!");
 *     }
 * }
 */