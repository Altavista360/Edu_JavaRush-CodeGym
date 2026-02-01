/*
 * Authors: JavaRush's team, CodeGym's team, Altavista360
 * Version: 1.0.0
 */

/*
 * // JavaRush
 * Задача: Игра «Угадай число» 🎲
 * Ссылка: https://javarush.com/tasks/ru.javarush.java.core.level05.task11
 */

/*
 * // CodeGym
 * Task: Number Guessing Game 🎲
 * Link: https://codegym.cc/tasks/en.codegym.java.core.level05.task11
 */

/*
 * // JavaRush
 * Условие:
 * Вы — молодой маг, которому поручено найти скрытый кристалл мудрости.
 * Хитрый дух загадал число от 1 до 100, и оно спрятано в его башне. Чтобы приблизиться к разгадке, вы называете числа, а дух подсказывает:
 * • Если ваше число меньше загаданного, он говорит: Больше!
 * • Если число больше — отвечает: Меньше!
 * • Если угадали точно — дух признаёт поражение и говорит: Верно!, после чего испытание завершается.
 * Ваша задача — написать программу, которая реализует эту игру, где игрок вводит числа в цикле, пока не угадает.
 */

/*
 * // JavaRush
 * Требования:
 * • Программа должна сгенерировать и сохранить загаданное число от 1 до 100.
 * • На каждом шаге игрок должен вводить число с клавиатуры.
 * • Если введённое число меньше загаданного — программа выводит Больше!.
 * • Если введённое число больше загаданного — программа выводит Меньше!.
 * • Если введённое число равно загаданному — программа выводит Верно! и завершает выполнение.
 * • Программа должна работать в цикле до тех пор, пока число не будет угадано.
 */

/*
 * // JavaRush
 * Черновик:
 * package ru.javarush.java.core.level05.task11;
 *
 * import java.util.Random;
 * import java.util.Scanner;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         Random rand = new Random();
 *         int secret = rand.nextInt(100) + 1; // 1..100
 *         Scanner console = new Scanner(System.in);
 *
 *         // Игра с духом
 *         while (true) {
 *
 *         }
 *     }
 * }
 */

// JavaRush
package ru.javarush.java.core.level05.task11;

import java.util.Random;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Random rand = new Random();
        int secret = rand.nextInt(100) + 1; // 1..100
        Scanner console = new Scanner(System.in);

        // Игра с духом
        while (true) {
        System.out.println("Введите число: ");
        int playerAnswer = console.nextInt();
        if (playerAnswer < secret) {
            System.out.println("Больше!");
            }
        else if (playerAnswer > secret) {
            System.out.println("Меньше!");
            }
        else {
            System.out.println("Верно!");
            break;
            }
        }
    }
}

/*
 * // JavaRush
 * Правильное решение:
 * // Author: JavaRush's team
 * package ru.javarush.java.core.level05.task11;
 *
 * import java.util.Random;
 * import java.util.Scanner;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         Random rand = new Random();
 *         int secret = rand.nextInt(100) + 1; // 1..100
 *         Scanner console = new Scanner(System.in);
 *
 *         // Игра с духом
 *         while (true) {
 *             System.out.print("Введите число (1-100): ");
 *             int guess = console.nextInt();
 *
 *             if (guess < secret) {
 *                 System.out.println("Больше!");
 *             } else if (guess > secret) {
 *                 System.out.println("Меньше!");
 *             } else {
 *                 System.out.println("Верно!");
 *                 break;
 *             }
 *         }
 *     }
 * }
 */