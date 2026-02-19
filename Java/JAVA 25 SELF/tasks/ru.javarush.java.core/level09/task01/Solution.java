/*
 * Authors: JavaRush's team, CodeGym's team, Altavista360
 * Version: 1.0.0
 */

/*
 * // JavaRush
 * Задача: Путь к файлу с обратными слэшами
 * Ссылка: https://javarush.com/tasks/ru.javarush.java.core.level09.task01
 */

/*
 * // CodeGym
 * Task: File path with backslashes
 * Link: https://codegym.cc/tasks/en.codegym.java.core.level09.task01
 */

/*
 * // JavaRush
 * Условие:
 * Представьте, что вы – опытный системный администратор, готовящий инструкции для нового сотрудника. Вам нужно убедиться, что он правильно установит Java, а для этого ему нужен точный путь к исполнительному файлу.
 * Ваша задача — написать небольшой кусочек кода, который отобразит этот путь на консоли, чтобы ваши коллеги могли без ошибок найти нужную папку.
 * Путь выглядит так: C:\Program Files\Java. Учтите, что обратные слэши требуют особого внимания!
 */

/*
 * // JavaRush
 * Требования:
 * • В строке, содержащей путь, обратные слэши должны быть экранированы двойным обратным слэшем (\\).
 * • Путь должен быть сохранён в переменной типа String.
 * • На экран должен быть выведен путь C:\Program Files\Java с правильным отображением обратных слэшей.
 * • Для вывода строки на консоль необходимо использовать команду System.out.println.
 */

/*
 * // JavaRush
 * Черновик:
 * package ru.javarush.java.core.level09.task01;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Объявляем строковую переменную для хранения пути
 *
 *
 *         // Выводим строку с экранированными обратными слэшами на консоль
 *
 *     }
 * }
 */

// JavaRush
package ru.javarush.java.core.level09.task01;

public class Solution {
    public static void main(String[] args) {
        // Объявляем строковую переменную для хранения пути
        String path_to_folder = "C:\\Program Files\\Java";

        // Выводим строку с экранированными обратными слэшами на консоль
        System.out.println(path_to_folder);
    }
}

/*
 * // JavaRush
 * Правильное решение:
 * // Author: JavaRush's team
 * package ru.javarush.java.core.level09.task01;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Объявляем строковую переменную для хранения пути
 *         String path = "C:\\Program Files\\Java";
 *
 *         // Выводим строку с экранированными обратными слэшами на консоль
 *         System.out.println(path);
 *     }
 * }
 */