/*
 * Authors: JavaRush's team, CodeGym's team, Altavista360
 * Version: 1.0.0
 */

/*
 * // JavaRush
 * Задача: Панель управления роботом 🤖
 * Ссылка: https://javarush.com/tasks/ru.javarush.java.core.level10.task10
 */

/*
 * // CodeGym
 * Task: Robot Control Panel 🤖
 * Link: https://codegym.cc/tasks/en.codegym.java.core.level10.task10
 */

/*
 * // JavaRush
 * Условие:
 * Вы разрабатываете пульт управления для небольшого робота. Робот должен выполнять определённые действия в зависимости от текстовой команды, которую ему отправляют.
 * Попросите пользователя ввести одну из команд: "start", "stop" или "exit". Затем, используя оператор switch, обработайте этот ввод. Если введена команда "start", робот должен ответить "Запуск!". Если "stop" — "Остановка". Если "exit" — "Выход". А если робот не понимает команду, он должен вывести "Неизвестная команда".
 */

/*
 * // JavaRush
 * Требования:
 * • Программа должна запросить у пользователя ввод текстовой команды.
 * • Для обработки введённой команды должен использоваться оператор switch.
 * • Если пользователь ввёл "start", программа должна вывести "Запуск!".
 * • Если пользователь ввёл "stop", программа должна вывести "Остановка".
 * • Если пользователь ввёл "exit", программа должна вывести "Выход".
 * • Если введена любая другая команда, программа должна вывести "Неизвестная команда".
 */

/*
 * // JavaRush
 * Черновик:
 * package ru.javarush.java.core.level10.task10;
 *
 * import java.util.Scanner;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Создаем объект Scanner для чтения ввода пользователя с консоли
 *         Scanner console = new Scanner(System.in);
 *
 *         // Запрашиваем у пользователя ввод команды
 *         System.out.println("Введите команду (start, stop, exit):");
 *         String command = console.nextLine().trim(); // Убираем лишние пробелы по краям
 *
 *         // Обрабатываем введенную команду с помощью классического switch
 *
 *
 *
 *     }
 * }
 */

// JavaRush
package ru.javarush.java.core.level10.task10;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        // Создаем объект Scanner для чтения ввода пользователя с консоли
        Scanner console = new Scanner(System.in);

        // Запрашиваем у пользователя ввод команды
        System.out.println("Введите команду (start, stop, exit):");
        String command = console.nextLine().trim(); // Убираем лишние пробелы по краям

        // Обрабатываем введенную команду с помощью классического switch
        switch (command) {
            case "start":
                System.out.println("Запуск!");
                break;
            case "stop":
                System.out.println("Остановка");
                break;
            case "exit":
                System.out.println("Выход");
                break;
            default:
                System.out.println("Неизвестная команда");
        }
    }
}

/*
 * // JavaRush
 * Правильное решение:
 * // Author: JavaRush's team
 * package ru.javarush.java.core.level10.task10;
 *
 * import java.util.Scanner;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Создаем объект Scanner для чтения ввода пользователя с консоли
 *         Scanner console = new Scanner(System.in);
 *
 *         // Запрашиваем у пользователя ввод команды
 *         System.out.println("Введите команду (start, stop, exit):");
 *         String command = console.nextLine().trim(); // Убираем лишние пробелы по краям
 *
 *         // Обрабатываем введенную команду с помощью классического switch
 *         switch (command) {
 *             case "start":
 *                 System.out.println("Запуск!");
 *                 break;
 *             case "stop":
 *                 System.out.println("Остановка");
 *                 break;
 *             case "exit":
 *                 System.out.println("Выход");
 *                 break;
 *             default:
 *                 System.out.println("Неизвестная команда");
 *         }
 *     }
 * }
 */