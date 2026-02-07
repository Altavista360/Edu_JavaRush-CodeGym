/*
 * Authors: JavaRush's team, CodeGym's team, Altavista360
 * Version: 1.0.0
 */

/*
 * // JavaRush
 * Задача: Оценка списка любимых языков программирования 💬
 * Ссылка: https://javarush.com/tasks/ru.javarush.java.core.level07.task02
 */

/*
 * // CodeGym
 * Task: Assessing a List of Favorite Programming Languages 💬
 * Link: https://codegym.cc/tasks/en.codegym.java.core.level07.task02
 */

/*
 * // JavaRush
 * Условие:
 * Вы готовите короткую запись в блоге о своих самых любимых языках программирования. Для простоты вы решили указать "Java" трижды, чтобы продемонстрировать, как сильно вы его цените. Перед публикацией вам нужно быстро проверить, сколько записей вы фактически приготовили для своего списка.
 * Создайте массив строк String[] favoriteLanguages, предназначенный для хранения трех наименований. В каждую из этих ячеек массива запишите строку "Java". После этого, чтобы убедиться в правильности размера вашего списка, выведите на экран количество элементов, которые способен хранить созданный вами массив.
 */

/*
 * // JavaRush
 * Требования:
 * • Необходимо создать массив строк с именем favoriteLanguages.
 * • Массив favoriteLanguages должен быть создан с размером, равным 3.
 * • Каждый элемент массива favoriteLanguages должен содержать строку "Java".
 * • Программа должна вывести на экран количество элементов, которые способен хранить массив favoriteLanguages.
 */

/*
 * // JavaRush
 * Черновик:
 * package ru.javarush.java.core.level07.task02;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Создаем массив строк с фиксированным размером 3
 *
 *
 *         // Заполняем массив значениями "Java"
 *
 *
 *         // Выводим на экран количество элементов, которые способен хранить массив
 *
 *     }
 * }
 */

// JavaRush
package ru.javarush.java.core.level07.task02;

public class Solution {
    public static void main(String[] args) {
        // Создаем массив строк с фиксированным размером 3
        String[] favoriteLanguages = new String[3];

        // Заполняем массив значениями "Java"
        favoriteLanguages[0] = "Java";
        favoriteLanguages[1] = "Java";
        favoriteLanguages[2] = "Java";

        // Выводим на экран количество элементов, которые способен хранить массив
        System.out.println(favoriteLanguages.length);
    }
}

/*
 * // JavaRush
 * Правильное решение:
 * // Author: JavaRush's team
 * package ru.javarush.java.core.level07.task02;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Создаем массив строк с фиксированным размером 3
 *         String[] favoriteLanguages = new String[3];
 *
 *         // Заполняем массив значениями "Java"
 *         favoriteLanguages[0] = "Java";
 *         favoriteLanguages[1] = "Java";
 *         favoriteLanguages[2] = "Java";
 *
 *         // Выводим на экран количество элементов, которые способен хранить массив
 *         System.out.println(favoriteLanguages.length);
 *     }
 * }
 */