/*
 * Authors: JavaRush's team, CodeGym's team, Altavista360
 * Version: 1.0.0
 */

/*
 * // JavaRush
 * Задача: Упорядочивание результатов забега 🏃‍♂️
 * Ссылка: https://javarush.com/tasks/ru.javarush.java.core.level07.task17
 */

/*
 * // CodeGym
 * Task: Sorting race results 🏃‍♂️
 * Link: https://codegym.cc/tasks/en.codegym.java.core.level07.task17
 */

/*
 * // JavaRush
 * Условие:
 * Вы только что закончили замерять время пяти участников забега, и их результаты немного перемешаны: 7, 2, 9, 4 и 1 секунды. Чтобы представить официальные результаты в понятном виде, вам нужно отсортировать эти времена от самого быстрого (наименьшего числа) до самого медленного (наибольшего числа). К счастью, в Java есть очень полезный инструмент для этого — метод Arrays.sort. Как только времена будут отсортированы, выведите их, чтобы объявить победителей.
 * Создайте массив целых чисел int[] raceTimes из 5 элементов со значениями: {7, 2, 9, 4, 1}. Отсортируйте этот массив по возрастанию с помощью метода Arrays.sort. Затем выведите отсортированный массив на экран, используя вспомогательный метод Arrays.toString, который удобно форматирует массив для печати. В результате вы должны увидеть [1, 2, 4, 7, 9].
 */

/*
 * // JavaRush
 * Требования:
 * • В программе должен быть создан массив int[] raceTimes с элементами 7, 2, 9, 4 и 1.
 * • Массив raceTimes должен быть отсортирован по возрастанию с помощью метода Arrays.sort.
 * • Для вывода отсортированного массива на экран должен использоваться метод Arrays.toString.
 * • Программа должна вывести строку, соответствующую отсортированному массиву: [1, 2, 4, 7, 9].
 */

/*
 * // JavaRush
 * Черновик:
 * package ru.javarush.java.core.level07.task17;
 *
 * import java.util.Arrays;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Создаем массив с заданными значениями
 *
 *
 *         // Сортируем массив по возрастанию с помощью метода Arrays.sort
 *
 *
 *         // Выводим отсортированный массив на экран с использованием Arrays.toString
 *
 *     }
 * }
 */

// JavaRush
package ru.javarush.java.core.level07.task17;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        // Создаем массив с заданными значениями
        int[] raceTimes = {7, 2, 9, 4, 1};

        // Сортируем массив по возрастанию с помощью метода Arrays.sort
        Arrays.sort(raceTimes);

        // Выводим отсортированный массив на экран с использованием Arrays.toString
        System.out.println(Arrays.toString(raceTimes));
    }
}

/*
 * // JavaRush
 * Правильное решение:
 * // Author: JavaRush's team
 * package ru.javarush.java.core.level07.task17;
 *
 * import java.util.Arrays;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Создаем массив с заданными значениями
 *         int[] raceTimes = {7, 2, 9, 4, 1};
 *
 *         // Сортируем массив по возрастанию с помощью метода Arrays.sort
 *         Arrays.sort(raceTimes);
 *
 *         // Выводим отсортированный массив на экран с использованием Arrays.toString
 *         System.out.println(Arrays.toString(raceTimes));
 *     }
 * }
 */