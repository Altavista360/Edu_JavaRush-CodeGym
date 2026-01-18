/*
 * Authors: JavaRush's team, CodeGym's team, Altavista360
 * Version: 1.0.0
 */

/*
 * // JavaRush
 * Задача: Исправление ошибок 🐛
 * Ссылка: https://javarush.com/tasks/ru.javarush.java.core.level01.task12
 */

/*
 * // CodeGym
 * Task: Fixing bugs 🐛
 * Link: https://codegym.cc/tasks/en.codegym.java.core.level01.task12
 */

/*
 * // JavaRush
 * Условие:
 * Вам дали код, который не компилируется. Найдите и закомментируйте все строки, которые вызывают ошибки или выводят что-то в консоль. Программа должна запускаться без проблем и не выводить ничего в консоль.
 */

/*
 * // CodeGym
 * Condition:
 * You are given code that does not compile. Find and comment out all lines that cause errors. The program should run without issues and must not print anything to the console.
 */

/*
 * // JavaRush
 * Требования:
 * • Все найденные строки с ошибками компиляции должны быть закомментированы с помощью //.
 * • В программе запрещено вносить любые другие изменения, кроме добавления комментариев для закомментирования ошибочных строк.
 * • После внесения изменений программа должна успешно компилироваться без ошибок.
 * • Программа не должна выводить ничего в консоль после исправления.
 */

/*
 * // CodeGym
 * Requirements:
 * • All found lines with compilation errors must be commented out using //.
 * • No other changes are allowed in the program except adding comments to comment out erroneous lines.
 * • After the changes the program must compile successfully without errors.
 * • The program must not print anything to the console after the fix.
 */

/*
 * // JavaRush
 * Черновик:
 * package ru.javarush.java.core.level01.task12;
 *
 * public class Solution
 * {
 *     public static void main(String[] args)
 *     {
 *         int number = 10;
 *         int number = 20;
 *
 *         int uninitialized;
 *         System.out.println(uninitialized);
 *
 *         String text = 123;
 *
 *         System.out.println(undeclaredVariable);
 *
 *         System.out.println(number);
 *     }
 * }
 */

/*
 * // CodeGym
 * Draft:
 * package en.codegym.java.core.level01.task12;
 *
 * public class Solution
 * {
 *     public static void main(String[] args)
 *     {
 *         int number = 10;
 *         int number = 20;
 *
 *         int uninitialized;
 *         System.out.println(uninitialized);
 *
 *         String text = 123;
 *
 *         System.out.println(undeclaredVariable);
 *
 *         System.out.println(number);
 *     }
 * }
 */

// JavaRush
package ru.javarush.java.core.level01.task12;

public class Solution
{
    public static void main(String[] args)
    {
        int number = 10;
        //int number = 20;

        //int uninitialized;
        //System.out.println(uninitialized);

        //String text = 123;

        //System.out.println(undeclaredVariable);

        //System.out.println(number);
    }
}

/*
// CodeGym
package en.codegym.java.core.level01.task12;

public class Solution
{
    public static void main(String[] args)
    {
        int number = 10;
        // int number = 20;

        // int uninitialized;
        // System.out.println(uninitialized);

        // String text = 123;

        // System.out.println(undeclaredVariable);

        // System.out.println(number);
    }
}
*/

/*
 * // JavaRush
 * Правильное решение:
 * // Author: JavaRush's team
 * package ru.javarush.java.core.level01.task12;
 *
 * public class Solution
 * {
 *     public static void main(String[] args)
 *     {
 *         // Объявление переменной типа int
 *         int number = 10;
 *
 *         // Ошибка: переменная не может быть объявлена дважды
 *         // int number = 20;
 *
 *          int uninitialized;
 *         // Ошибка: переменная должна быть инициализирована перед использованием
 *         // System.out.println(uninitialized);
 *
 *         // Ошибка: тип переменной не соответствует присваиваемому значению
 *         // String text = 123;
 *
 *         // Ошибка: переменная должна быть объявлена перед использованием
 *         // System.out.println(undeclaredVariable);
 *
 *         // Программа не должна ничего выводить в консоль, поэтому все строки с выводом закомментированы
 *         // System.out.println(number);
 *     }
 * }
 */

/*
 * // CodeGym
 * Correct solution:
 * // Author: CodeGym's team
 * package en.codegym.java.core.level01.task12;
 *
 * public class Solution
 * {
 *     public static void main(String[] args)
 *     {
 *         // Declaration of an int variable
 *         int number = 10;
 *
 *         // Error: variable cannot be declared twice
 *         // int number = 20;
 *
 *         // Error: variable must be initialized before use
 *         // int uninitialized;
 *         // System.out.println(uninitialized);
 *
 *         // Error: variable type does not match the assigned value
 *         // String text = 123;
 *
 *         // Error: variable must be declared before use
 *         // System.out.println(undeclaredVariable);
 *
 *         // The program should not print anything to the console, so all output lines are commented out
 *         // System.out.println(number);
 *     }
 * }
 */