/**
 * @author JavaRush's team
 * @author CodeGym's team
 * @author Altavista360
 * @version 1.0.0
 */

/**
 * // JavaRush
 * Задача: Возраст проекта 💻
 * @see <a href="https://javarush.com/tasks/ru.javarush.java.core.level01.task06">ru.javarush.java.core.level01.task06</a>
 */

/**
 * // CodeGym
 * Task: Project age 💻
 * @see <a href="https://codegym.cc/tasks/en.codegym.java.core.level01.task06">en.codegym.java.core.level01.task06</a>
 */

/**
 * // JavaRush
 * Описание:
 * Представьте, что вы хотите узнать, сколько лет вашему проекту, который начался в 2020 году.
 * Объявите две переменные типа int: currentYear (присвойте ей значение 2026) и projectAge.
 * Присвойте переменной projectAge значение, равное разнице между currentYear и 2020.
 * Затем выведите на экран возраст проекта.
*/

/**
 * // CodeGym
 * Description:
 * Imagine you want to find out how many years your project has been running, which started in 2020.
 * Declare two variables of type int: currentYear (assign it the value 2026) and projectAge.
 * Assign to the variable projectAge the value equal to the difference between currentYear and 2020.
 * Then print the project age to the screen.
 */

/**
 * // JavaRush
 * Требования:
 * • В программе должна быть объявлена переменная типа int с именем currentYear и значением 2026.
 * • В программе должна быть объявлена переменная типа int с именем projectAge.
 * • Переменной projectAge должно быть присвоено значение, равное разности currentYear и 2020.
 * • Программа должна вывести на экран значение переменной projectAge.
*/

/**
 * // CodeGym
 * Requirements:
 * • The program must declare a variable of type int named currentYear with the value 2026.
 * • The program must declare a variable of type int named projectAge.
 * • The variable projectAge must be assigned the value equal to the difference between currentYear and 2020.
 * • The program must print the value of the variable projectAge to the screen.
 */

/**
 * // JavaRush
 * Черновик:
 * package ru.javarush.java.core.level01.task06;
 *
 * public class Solution
 * {
 *     public static void main(String[] args)
 *     {
 *         // Объявляем переменную currentYear и присваиваем ей значение 2026
 *
 *
 *         // Объявляем переменную projectAge
 *
 *
 *         // Вычисляем возраст проекта как разницу между currentYear и 2020
 *
 *
 *         // Выводим возраст проекта на экран
 *
 *     }
 * }
 */

/**
 * // CodeGym
 * Draft:
 * package en.codegym.java.core.level01.task06;
 *
 * public class Solution
 * {
 *     public static void main(String[] args)
 *     {
 *         // Declare variable currentYear and assign it the value 2026
 *
 *
 *         // Declare variable projectAge
 *
 *
 *         // Calculate the project age as the difference between currentYear and 2020
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
        // Объявляем переменную currentYear и присваиваем ей значение 2026
        int currentYear;
        currentYear = 2026;

        // Объявляем переменную projectAge
        int projectAge;

        // Вычисляем возраст проекта как разницу между currentYear и 2020
        projectAge = currentYear - 2020;

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
        // Declare variable currentYear and assign it the value 2026
        int currentYear;
        currentYear = 2026;

        // Declare variable projectAge
        int projectAge;

        // Calculate the project age as the difference between currentYear and 2020
        projectAge = currentYear - 2020;

        // Print the project age to the screen
        System.out.println(projectAge);
    }
}
*/