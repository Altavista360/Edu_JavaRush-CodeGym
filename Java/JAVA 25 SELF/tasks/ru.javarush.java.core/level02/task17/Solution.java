/*
 * Authors: JavaRush's team, CodeGym's team, Altavista360
 * Version: 1.0.0
 */

/*
 * // JavaRush
 * Задача: Получение пароля 🔒
 * Ссылка: https://javarush.com/tasks/ru.javarush.java.core.level02.task17
 */

/*
 * // CodeGym
 * Task: Password input 🔒
 * Link: https://codegym.cc/tasks/en.codegym.java.core.level02.task17
 */

/*
 * // JavaRush
 * Условие:
 * Вы разрабатываете систему входа. Напишите программу, которая считывает пароль (одну строку текста) с клавиатуры и выводит его на экран для подтверждения.
 */

/*
 * // JavaRush
 * Требования:
 * • Программа должна использовать класс Scanner для чтения данных с клавиатуры.
 * • Пароль должен считываться как строка методом nextLine().
 * • Программа должна вывести на экран введённый пользователем пароль.
 * • Программа должна считать и вывести только одну строку, соответствующую введённому паролю.
 */

/*
 * // JavaRush
 * Черновик:
 * package ru.javarush.java.core.level02.task17;
 *
 * import java.util.Scanner;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Создаем Scanner для чтения данных с клавиатуры
 *
 *
 *         // Считываем одну строку как пароль
 *
 *
 *         // Выводим введенный пароль на экран
 *
 *     }
 * }
 */

// JavaRush
package ru.javarush.java.core.level02.task17;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        // Создаем Scanner для чтения данных с клавиатуры
        Scanner keyboard = new Scanner(System.in);

        // Считываем одну строку как пароль
        String password = keyboard.nextLine();

        // Выводим введенный пароль на экран
        System.out.println(password);
    }
}

/*
 * // JavaRush
 * Правильное решение:
 * // Author: JavaRush's team
 * package ru.javarush.java.core.level02.task17;
 *
 * import java.util.Scanner;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Создаем Scanner для чтения данных с клавиатуры
 *         Scanner console = new Scanner(System.in);
 *
 *         // Считываем одну строку как пароль
 *         String password = console.nextLine();
 *
 *         // Выводим введенный пароль на экран
 *         System.out.println(password);
 *     }
 * }
 */