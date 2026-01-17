/*
 * Authors: JavaRush's team, CodeGym's team, Altavista360
 * Version: 1.0.0
 */

/*
 * // JavaRush
 * Задача: Суммирование результатов в игре 🎮
 * Ссылка: https://javarush.com/tasks/ru.javarush.java.core.level01.task07
 */

/*
 * // CodeGym
 * Task: Summing game scores 🎮
 * Link: https://codegym.cc/tasks/en.codegym.java.core.level01.task07
 */

/*
 * // JavaRush
 * Условие:
 * Представьте, что вы ведете счет в игре. Объявите две переменные типа int: player1Score со значением 1999 и player2Score со значением 25.
 * Создайте переменную totalScore, в которую запишите общую сумму очков обоих игроков, и выведите её на экран.
*/

/*
 * // CodeGym
 * Condition:
 * Imagine you are keeping score in a game. Declare two variables of type int: player1Score with the value 1999 and player2Score with the value 25.
 * Create a variable totalScore to store the combined score of both players, and print it to the console.
 */

/*
 * // JavaRush
 * Требования:
 * • В программе должны быть объявлены две переменные типа int: player1Score и player2Score.
 * • Переменная player1Score должна быть инициализирована значением 1999, а переменная player2Score — значением 25.
 * • В программе должна быть объявлена переменная totalScore, в которую записывается сумма значений player1Score и player2Score.
 * • Значение переменной totalScore должно быть выведено на экран.
 */

/*
 * // CodeGym
 * Requirements:
 * • The program must declare two int variables: player1Score and player2Score.
 * • The variable player1Score must be initialized to 1999, and player2Score to 25.
 * • The program must declare a variable totalScore that stores the sum of player1Score and player2Score.
 * • The value of totalScore must be printed to the console.
 */

/*
 * // JavaRush
 * Черновик:
 * package ru.javarush.java.core.level01.task07;
 *
 * public class Solution
 * {
 *     public static void main(String[] args)
 *     {
 *         // Объявляем переменные для хранения очков двух игроков и сразу инициализируем их нужными значениями
 *
 *
 *         // Вычисляем общую сумму очков
 *
 *
 *         // Выводим на экран значение общей суммы очков
 *
 *     }
 * }
 */

/*
 * // CodeGym
 * Draft:
 * package en.codegym.java.core.level01.task07;
 *
 * public class Solution
 * {
 *     public static void main(String[] args)
 *     {
 *         // Declare variables to store the two players' scores and initialize them with the required values
 *
 *
 *         // Calculate the total score
 *
 *
 *         // Print the total score to the console
 *
 *     }
 * }
 */

// JavaRush
package ru.javarush.java.core.level01.task07;

public class Solution
{
    public static void main(String[] args)
    {
        // Объявляем переменные для хранения очков двух игроков и сразу инициализируем их нужными значениями
        int player1Score = 1999;
        int player2Score = 25;

        // Вычисляем общую сумму очков
        int totalScore = player1Score + player2Score;

        // Выводим на экран значение общей суммы очков
        System.out.println(totalScore);

    }
}

/*
// CodeGym
package en.codegym.java.core.level01.task07;

public class Solution
{
    public static void main(String[] args)
    {
        // Declare variables to store the two players' scores and initialize them with the required values
        int player1Score = 1999;
        int player2Score = 25;

        // Calculate the total score
        int totalScore = player1Score + player2Score;

        // Print the total score to the console
        System.out.println(totalScore);

    }
}
*/

/*
 * // JavaRush
 * Правильное решение:
 * // Author: JavaRush's team
 * package ru.javarush.java.core.level01.task07;
 *
 * public class Solution
 * {
 *     public static void main(String[] args)
 *     {
 *         // Объявляем переменные для хранения очков двух игроков и сразу инициализируем их нужными значениями
 *         int player1Score = 1999;
 *         int player2Score = 25;
 *
 *         // Вычисляем общую сумму очков
 *         int totalScore = player1Score + player2Score;
 *
 *         // Выводим на экран значение общей суммы очков
 *         System.out.println(totalScore);
 *     }
 * }
 */

/*
 * // CodeGym
 * Correct solution:
 * // Author: CodeGym's team
 * package en.codegym.java.core.level01.task07;
 *
 * public class Solution
 * {
 *     public static void main(String[] args)
 *     {
 *         // Declare variables to store the two players' scores and initialize them with the required values
 *         int player1Score = 1999;
 *         int player2Score = 25;
 *
 *         // Calculate the total score
 *         int totalScore = player1Score + player2Score;
 *
 *         // Print the total score to the console
 *         System.out.println(totalScore);
 *     }
 * }
 */