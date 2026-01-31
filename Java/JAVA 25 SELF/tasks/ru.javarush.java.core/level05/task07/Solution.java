/*
 * Authors: JavaRush's team, CodeGym's team, Altavista360
 * Version: 1.0.0
 */

/*
 * // JavaRush
 * Задача: Подсчёт сокровищ в волшебном сундуке 💰
 * Ссылка: https://javarush.com/tasks/ru.javarush.java.core.level05.task07
 */

/*
 * // CodeGym
 * Task: Counting treasures in the magic chest 💰
 * Link: https://codegym.cc/tasks/en.codegym.java.core.level05.task07
 */

/*
 * // JavaRush
 * Условие:
 * Вы — страж сокровищницы, и вам поручили инвентаризацию. В волшебном сундуке хранятся тысячи золотых монет, и вам нужно быстро определить, сколько цифр содержится в общей сумме этих монет, чтобы оценить масштабы богатства. Само число может быть очень большим.
 * Напишите программу, которая принимает от пользователя большое число (назовите его treasureAmount) и подсчитывает, сколько в нём цифр. Например, если введено 12345, результат должен быть 5. Это позволит вам узнать, насколько велико богатство, не вдаваясь в точную сумму.
 */

/*
 * // JavaRush
 * Требования:
 * • Программа должна принимать на вход от пользователя большое число (treasureAmount).
 * • Программа должна корректно обрабатывать числа, которые могут не помещаться в стандартные типы данных int или long.
 * • Программа должна определить и вывести количество цифр во введённом числе.
 * • Программа должна выводить на экран только количество цифр в числе, без лишней информации.
 */

/*
 * // JavaRush
 * Черновик:
 * package ru.javarush.java.core.level05.task07;
 *
 * import java.util.Scanner;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Создаем объект Scanner для считывания данных с консоли
 *
 *
 *         // Считываем большое число, введенное пользователем
 *
 *
 *         // Выводим количество цифр в числе
 *
 *     }
 * }
 */

// JavaRush
package ru.javarush.java.core.level05.task07;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        // Создаем объект Scanner для считывания данных с консоли
        Scanner inputData = new Scanner(System.in);

        // Считываем большое число, введенное пользователем
        String treasureAmount = inputData.nextLine();

        // Выводим количество цифр в числе
        System.out.println(treasureAmount.length());
    }
}

/*
 * // JavaRush
 * Правильное решение:
 * // Author: JavaRush's team
 * package ru.javarush.java.core.level05.task07;
 *
 * import java.util.Scanner;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Создаем объект Scanner для считывания данных с консоли
 *         Scanner console = new Scanner(System.in);
 *
 *         // Считываем большое число, введенное пользователем
 *         String treasureAmount = console.nextLine();
 *
 *         // Выводим количество цифр в числе
 *         System.out.println(treasureAmount.length());
 *     }
 * }
 */