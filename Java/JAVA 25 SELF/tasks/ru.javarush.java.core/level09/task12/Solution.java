/*
 * Authors: JavaRush's team, CodeGym's team, Altavista360
 * Version: 1.0.0
 */

/*
 * // JavaRush
 * Задача: Проверка первой буквы и извлечение подстроки
 * Ссылка: https://javarush.com/tasks/ru.javarush.java.core.level09.task12
 */

/*
 * // CodeGym
 * Task: Check the first letter and extract a substring
 * Link: https://codegym.cc/tasks/en.codegym.java.core.level09.task12
 */

/*
 * // JavaRush
 * Условие:
 * Вы — страж порядка в каталоге товаров для интернет-магазина. Существует строгое правило: если название продукта начинается с буквы 'E', то для краткого отчёта о запасах нужно отобразить только его аббревиатуру или сокращённое название — первые три символа. В противном случае, нужно просто уведомить, что правило не соблюдено. Каждая буква имеет значение! Возьмите в качестве примера строку "Example".
 * Ваша программа должна первым делом проверить, начинается ли это название с буквы 'E'. Если да, то извлеките и выведите на экран только первые три символа этого названия. Если же название начинается с любой другой буквы, выведите на экран сообщение: "Первая буква не E". Это как пропускной пункт, который пропускает только "избранных"!
 */

/*
 * // JavaRush
 * Требования:
 * • Программа должна проверить, начинается ли строка с буквы 'E'.
 * • Если строка начинается с буквы 'E', программа должна извлечь первые три символа этой строки.
 * • Если строка начинается с буквы 'E', программа должна вывести на экран только первые три символа строки.
 * • Если строка не начинается с буквы 'E', программа должна вывести на экран сообщение: "Первая буква не E".
 */

/*
 * // JavaRush
 * Черновик:
 * package ru.javarush.java.core.level09.task12;
 *
 * import java.util.Scanner;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Создаем объект Scanner для ввода данных с клавиатуры
 *         Scanner console = new Scanner(System.in);
 *
 *         // Запрашиваем у пользователя ввод названия продукта
 *         System.out.println("Введите название продукта:");
 *         String productName = console.nextLine();
 *
 *         // Проверяем, начинается ли название с буквы 'E'
 *
 *             // Извлекаем первые три символа строки
 *
 *             // Выводим аббревиатуру на экран
 *
 *
 *             // Выводим сообщение, если первая буква не 'E'
 *
 *     }
 * }
 */

// JavaRush
package ru.javarush.java.core.level09.task12;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        // Создаем объект Scanner для ввода данных с клавиатуры
        Scanner console = new Scanner(System.in);

        // Запрашиваем у пользователя ввод названия продукта
        System.out.println("Введите название продукта:");
        String productName = console.nextLine();

        // Проверяем, начинается ли название с буквы 'E'
        if (productName.startsWith("E")) {
            // Извлекаем первые три символа строки
            String abc = productName.substring(0, 3);
            // Выводим аббревиатуру на экран
            System.out.println(abc);
        } else {
            // Выводим сообщение, если первая буква не 'E'
            System.out.println("Первая буква не E");
        }
    }
}

/*
 * // JavaRush
 * Правильное решение:
 * // Author: JavaRush's team
 * package ru.javarush.java.core.level09.task12;
 *
 * import java.util.Scanner;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Создаем объект Scanner для ввода данных с клавиатуры
 *         Scanner console = new Scanner(System.in);
 *
 *         // Запрашиваем у пользователя ввод названия продукта
 *         System.out.println("Введите название продукта:");
 *         String productName = console.nextLine();
 *
 *         // Проверяем, начинается ли название с буквы 'E'
 *         if (productName.startsWith("E")) {
 *             // Извлекаем первые три символа строки
 *             String abbreviation = productName.substring(0, 3);
 *             // Выводим аббревиатуру на экран
 *             System.out.println(abbreviation);
 *         } else {
 *             // Выводим сообщение, если первая буква не 'E'
 *             System.out.println("Первая буква не E");
 *         }
 *     }
 * }
 */