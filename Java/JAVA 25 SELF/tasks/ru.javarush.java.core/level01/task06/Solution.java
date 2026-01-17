/*
 * Authors: JavaRush's team, CodeGym's team, Altavista360
 * Version: 1.0.0
 */

/*
 * // JavaRush
 * Задача: Возраст проекта 💻
 * Ссылка: https://javarush.com/tasks/ru.javarush.java.core.level01.task06
 */

/*
 * // CodeGym
 * Task: Project age 💻
 * Link: https://codegym.cc/tasks/en.codegym.java.core.level01.task06
 */

/*
 * // JavaRush
 * Условие:
 * Представьте, что вы хотите узнать, сколько лет вашему проекту, который начался в 2019 году.
 * Объявите две переменные типа int: currentYear (присвойте ей значение 2025) и projectAge.
 * Присвойте переменной projectAge значение, равное разнице между currentYear и 2019.
 * Затем выведите на экран возраст проекта.
*/

/*
 * // CodeGym
 * Condition:
 * Imagine you want to find out how many years your project has been running, which started in 2019.
 * Declare two variables of type int: currentYear (assign it the value 2025) and projectAge.
 * Assign to the variable projectAge the value equal to the difference between currentYear and 2019.
 * Then print the project age to the screen.
 */

/*
 * // JavaRush
 * Требования:
 * • В программе должна быть объявлена переменная типа int с именем currentYear и значением 2025.
 * • В программе должна быть объявлена переменная типа int с именем projectAge.
 * • Переменной projectAge должно быть присвоено значение, равное разности currentYear и 2019.
 * • Программа должна вывести на экран значение переменной projectAge.
*/

/*
 * // CodeGym
 * Requirements:
 * • The program must declare a variable of type int named currentYear with the value 2025.
 * • The program must declare a variable of type int named projectAge.
 * • The variable projectAge must be assigned the value equal to the difference between currentYear and 2019.
 * • The program must print the value of the variable projectAge to the screen.
 */

/*
 * // JavaRush
 * Черновик:
 * package ru.javarush.java.core.level01.task06;
 *
 * public class Solution
 * {
 *     public static void main(String[] args)
 *     {
 *         // Объявляем переменную currentYear и присваиваем ей значение 2025
 *
 *
 *         // Объявляем переменную projectAge
 *
 *
 *         // Вычисляем возраст проекта как разницу между currentYear и 2019
 *
 *
 *         // Выводим возраст проекта на экран
 *
 *     }
 * }
 */

/*
 * // CodeGym
 * Draft:
 * package en.codegym.java.core.level01.task06;
 *
 * public class Solution
 * {
 *     public static void main(String[] args)
 *     {
 *         // Declare variable currentYear and assign it the value 2025
 *
 *
 *         // Declare variable projectAge
 *
 *
 *         // Calculate the project age as the difference between currentYear and 2019
 *
 *
 *         // Print the project age to the screen
 *
 *     }
 * }
 */

// JavaRush
package ru.javarush.java.core.level01.task06;

public class Solution
{
    public static void main(String[] args)
    {
        // Объявляем переменную currentYear и присваиваем ей значение 2025
        int currentYear;
        currentYear = 2025;

        // Объявляем переменную projectAge
        int projectAge;

        // Вычисляем возраст проекта как разницу между currentYear и 2019
        projectAge = currentYear - 2019;

        // Выводим возраст проекта на экран
        System.out.println(projectAge);
    }
}

/*
// CodeGym
package en.codegym.java.core.level01.task06;

public class Solution
{
    public static void main(String[] args)
    {
        // Declare variable currentYear and assign it the value 2025
        int currentYear;
        currentYear = 2025;

        // Declare variable projectAge
        int projectAge;

        // Calculate the project age as the difference between currentYear and 2019
        projectAge = currentYear - 2019;

        // Print the project age to the screen
        System.out.println(projectAge);
    }
}
*/

/*
 * // JavaRush
 * Правильное решение:
 * // Author: JavaRush's team
 * package ru.javarush.java.core.level01.task06;
 *
 * public class Solution
 * {
 *     public static void main(String[] args)
 *     {
 *         // Объявляем переменную currentYear и присваиваем ей значение 2025
 *         int currentYear = 2025;
 *
 *         // Объявляем переменную projectAge
 *         int projectAge;
 *
 *         // Вычисляем возраст проекта как разницу между currentYear и 2019
 *         projectAge = currentYear - 2019;
 *
 *         // Выводим возраст проекта на экран
 *         System.out.println(projectAge);
 *     }
 * }
 */

/*
 * // CodeGym
 * Correct solution:
 * // Author: CodeGym's team
 * package en.codegym.java.core.level01.task06;
 *
 * public class Solution
 * {
 *     public static void main(String[] args)
 *     {
 *         // Declare variable currentYear and assign it the value 2025
 *         int currentYear = 2025;
 *
 *         // Declare variable projectAge
 *         int projectAge;
 *
 *         // Calculate the project age as the difference between currentYear and 2019
 *         projectAge = currentYear - 2019;
 *
 *         // Print the project age to the screen
 *         System.out.println(projectAge);
 *     }
 * }
 */