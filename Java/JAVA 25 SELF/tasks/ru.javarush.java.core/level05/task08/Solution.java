/*
 * Authors: JavaRush's team, CodeGym's team, Altavista360
 * Version: 1.0.0
 */

/*
 * // JavaRush
 * Задача: Гонка за золотым кубком: Самый короткий путь 🏆
 * Ссылка: https://javarush.com/tasks/ru.javarush.java.core.level05.task08
 */

/*
 * // CodeGym
 * Task: Race for the Golden Cup: The Shortest Path 🏆
 * Link: https://codegym.cc/tasks/en.codegym.java.core.level05.task08
 */

/*
 * // JavaRush
 * Условие:
 * Вы организатор соревнований по поиску золотого кубка. Участникам предстоит пройти три разных пути, и чтобы определить победителя в напряжённой гонке, вам нужно найти самый короткий путь. Каждый путь имеет свою уникальную продолжительность в минутах.
 * Ваша программа должна принять три числовых значения (например, pathOne, pathTwo, pathThree), представляющих продолжительность каждого пути. Затем она должна мгновенно определить, какой из этих путей является наименьшим по времени, и вывести это минимальное значение на экран. Это позволит объявить чемпиона по самому быстрому прохождению!
 */

/*
 * // JavaRush
 * Требования:
 * • Программа должна принимать на вход три числовых значения, каждое из которых представляет продолжительность одного из трёх путей.
 * • Программа должна определить, какое из трёх введённых значений является наименьшим.
 * • Программа должна вывести на экран минимальное значение из трёх введённых чисел.
 * • Программа должна корректно работать с целыми числами, представляющими минуты.
 */

/*
 * // JavaRush
 * Черновик:
 * package ru.javarush.java.core.level05.task08;
 *
 * import java.util.Scanner;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Создаём Scanner для чтения данных с клавиатуры
 *
 *
 *         // Считываем три целых числа — длительности трёх путей в минутах
 *
 *
 *         // Определяем минимальную длительность среди трёх значений
 *
 *
 *         // Выводим результат
 *
 *     }
 * }
 */

// JavaRush
package ru.javarush.java.core.level05.task08;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        // Создаём Scanner для чтения данных с клавиатуры
        Scanner inputData = new Scanner(System.in);

        // Считываем три целых числа — длительности трёх путей в минутах
        int pathOne = inputData.nextInt();
        int pathTwo = inputData.nextInt();
        int pathThree = inputData.nextInt();

        // Определяем минимальную длительность среди трёх значений
        int minPath = 0;
        if (pathOne < pathTwo && pathOne < pathThree) {
            minPath = pathOne;
        }
        else {
            if (pathTwo < pathThree) {
                minPath = pathTwo;
            }
            else {
                minPath = pathThree;
            }
        }

        // Выводим результат
        System.out.println(minPath);
    }
}

/*
 * // JavaRush
 * Правильное решение:
 * // Author: JavaRush's team
 * package ru.javarush.java.core.level05.task08;
 *
 * import java.util.Scanner;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Создаём Scanner для чтения данных с клавиатуры
 *         Scanner console = new Scanner(System.in);
 *
 *         // Считываем три целых числа — длительности трёх путей в минутах
 *         int pathOne = console.nextInt();
 *         int pathTwo = console.nextInt();
 *         int pathThree = console.nextInt();
 *
 *         // Определяем минимальную длительность среди трёх значений
 *         int minTwo = (pathOne < pathTwo) ? pathOne : pathTwo;
 *         int minDuration = (minTwo < pathThree) ? minTwo : pathThree;
 *
 *         // Выводим результат
 *         System.out.println(minDuration);
 *     }
 * }
 */