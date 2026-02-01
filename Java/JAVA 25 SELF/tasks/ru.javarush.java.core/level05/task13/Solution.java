/*
 * Authors: JavaRush's team, CodeGym's team, Altavista360
 * Version: 1.0.0
 */

/*
 * // JavaRush
 * Задача: Магическая куча камней 🤖🧑
 * Ссылка: https://javarush.com/tasks/ru.javarush.java.core.level05.task13
 */

/*
 * // CodeGym
 * Task: Magic Pile of Stones 🤖🧑
 * Link: https://codegym.cc/tasks/en.codegym.java.core.level05.task13
 */

/*
 * // JavaRush
 * Условие:
 * Вы встретили мудрого голема, который охраняет тайную кучу камней. В куче изначально лежит случайное количество камней от 1 до 100 — и это число загадал компьютер.
 * Правила игры:
 * • Первым ходит игрок. За один ход можно взять от 1 до 10 камней.
 * • Затем ходит голем: он берёт случайное количество камней (от 1 до 10, но не больше оставшегося).
 * • После каждого хода программа выводит, сколько камней осталось.
 * • Игра идёт до тех пор, пока камней не останется.
 * • Тот, кто взял последний камень, становится победителем.
 */

/*
 * // JavaRush
 * Требования:
 * • Компьютер должен выбрать случайное число от 1 до 100 — это количество камней в начале игры.
 * • Игрок должен ввести число от 1 до 10 — сколько камней он хочет взять.
 * • Компьютер выбирает случайное количество камней от 1 до 10, но не больше, чем осталось в куче.
 * • Игрок и компьютер должны ходить по очереди.
 * • После каждого хода количество камней уменьшается и программа сообщает, сколько камней осталось.
 * • Кто возьмёт последний камень, тот объявляется победителем.
 */

/*
 * // JavaRush
 * Черновик:
 * package ru.javarush.java.core.level05.task13;
 *
 * import java.util.Random;
 * import java.util.Scanner;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Случайное начальное число камней 1..100
 *         Random rand = new Random();
 *         int stones = rand.nextInt(100) + 1;
 *
 *         // Подготовка ввода
 *         Scanner sc = new Scanner(System.in);
 *         System.out.println("Старт игры. В куче " + stones + " камней.");
 *
 *         // Основной цикл партии
 *         while (stones > 0) {
 *             // Ход игрока: вводим, пока не попадём в допустимый диапазон
 *             int maxTake = Math.min(10, stones);
 *             int takePlayer;
 *             while (true) {
 *                 System.out.print("Сколько камней возьмёте (1-" + maxTake + "): ");
 *
 *
 *
 *             }
 *
 *             System.out.println("Игрок взял " + takePlayer + ". Осталось: " + stones);
 *
 *
 *             // Ход компьютера: берём случайно, но не больше остатка
 *             int takeBot = Math.min(stones, rand.nextInt(10) + 1);
 *
 *             System.out.println("Компьютер взял " + takeBot + ". Осталось: " + stones);
 *             if (stones == 0) {
 *                 System.out.println("Компьютер победил!");
 *                 break;
 *             }
 *         }
 *     }
 * }
 */

// JavaRush
package ru.javarush.java.core.level05.task13;

import java.util.Random;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        // Случайное начальное число камней 1..100
        Random rand = new Random();
        int stones = rand.nextInt(100) + 1;

        // Подготовка ввода
        Scanner sc = new Scanner(System.in);
        System.out.println("Старт игры. В куче " + stones + " камней.");

        // Основной цикл партии
        while (stones > 0) {
            // Ход игрока: вводим, пока не попадём в допустимый диапазон
            int maxTake = Math.min(10, stones);
            int takePlayer;
            while (true) {
                System.out.print("Сколько камней возьмёте (1-" + maxTake + "): ");
                    takePlayer = sc.nextInt();
                    if (takePlayer >= 1 && takePlayer <= maxTake) break;
                    System.out.println("Произошла ошибка.");
            }
            stones = stones - takePlayer;
            System.out.println("Игрок взял " + takePlayer + ". Осталось: " + stones);
            if (stones == 0) {
                System.out.println("Игрок победил!");
                break;
            }

            // Ход компьютера: берём случайно, но не больше остатка
            int takeBot = Math.min(stones, rand.nextInt(10) + 1);

            System.out.println("Компьютер взял " + takeBot + ". Осталось: " + stones);
            stones = stones - takeBot;
            if (stones == 0) {
                System.out.println("Компьютер победил!");
                break;
            }
        }
    }
}

/*
 * // JavaRush
 * Правильное решение:
 * // Author: JavaRush's team
 * package ru.javarush.java.core.level05.task13;
 *
 * import java.util.Random;
 * import java.util.Scanner;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Случайное начальное число камней 1..100
 *         Random rand = new Random();
 *         int stones = rand.nextInt(100) + 1;
 *
 *         // Подготовка ввода
 *         Scanner sc = new Scanner(System.in);
 *         System.out.println("Старт игры. В куче " + stones + " камней.");
 *
 *         // Основной цикл партии
 *         while (stones > 0) {
 *             // Ход игрока: вводим, пока не попадём в допустимый диапазон
 *             int maxTake = Math.min(10, stones);
 *             int takePlayer;
 *             while (true) {
 *                 System.out.print("Сколько камней возьмёте (1-" + maxTake + "): ");
 *                 takePlayer = sc.nextInt(); // ожидаем целое число
 *                 if (takePlayer >= 1 && takePlayer <= maxTake) break;
 *                 System.out.println("Неверный ввод.");
 *             }
 *             stones -= takePlayer;
 *             System.out.println("Игрок взял " + takePlayer + ". Осталось: " + stones);
 *             if (stones == 0) {
 *                 System.out.println("Игрок победил!");
 *                 break;
 *             }
 *
 *             // Ход компьютера: берём случайно, но не больше остатка
 *             int takeBot = Math.min(stones, rand.nextInt(10) + 1);
 *             stones -= takeBot;
 *             System.out.println("Компьютер взял " + takeBot + ". Осталось: " + stones);
 *             if (stones == 0) {
 *                 System.out.println("Компьютер победил!");
 *                 break;
 *             }
 *         }
 *     }
 * }
 */