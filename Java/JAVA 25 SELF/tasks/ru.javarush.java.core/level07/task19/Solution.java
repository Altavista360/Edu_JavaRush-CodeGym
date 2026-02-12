/*
 * Authors: JavaRush's team, CodeGym's team, Altavista360
 * Version: 1.0.0
 */

/*
 * // JavaRush
 * Задача: Извлечение центральных показаний с метеостанции ☀️
 * Ссылка: https://javarush.com/tasks/ru.javarush.java.core.level07.task19
 */

/*
 * // CodeGym
 * Task: Extracting mid-day readings from the weather station ☀️
 * Link: https://codegym.cc/tasks/en.codegym.java.core.level07.task19
 */

/*
 * // JavaRush
 * Условие:
 * Ваша метеостанция собрала длинную последовательность температурных показаний в течение дня: 10, 20, 30, 40, 50, 60, 70 градусов. Однако для конкретного отчета вам нужны только показания из середины дня — а именно, значения, записанные начиная с третьего показания и до (но не включая) шестого показания (помните, что программисты начинают отсчет с нуля!). Вам нужно извлечь только этот поднабор данных в совершенно новый список для вашего отчета, а затем показать, что вы получили.
 * Создайте массив целых чисел int[] dailyTemperatures из 7 элементов со значениями: {10, 20, 30, 40, 50, 60, 70}. Скопируйте из него только элементы с индексами от 2 до 5 (не включая индекс 5) в новый массив с помощью метода Arrays.copyOfRange. Затем выведите этот новый массив на экран, используя Arrays.toString. В результате вы должны увидеть [30, 40, 50].
 */

/*
 * // JavaRush
 * Требования:
 * • В программе должен быть создан массив int[] dailyTemperatures из 7 элементов со значениями {10, 20, 30, 40, 50, 60, 70}.
 * • Для копирования части массива необходимо использовать метод Arrays.copyOfRange.
 * • В новый массив должны быть скопированы элементы исходного массива с индексами от 2 (включительно) до 5 (не включая 5), то есть значения 30, 40, 50.
 * • Полученный массив должен быть выведен на экран с помощью метода Arrays.toString.
 * • В результате на экране должно быть напечатано [30, 40, 50].
 */

/*
 * // JavaRush
 * Черновик:
 * package ru.javarush.java.core.level07.task19;
 *
 * import java.util.Arrays;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Исходный массив температур за день
 *
 *
 *         // Копируем элементы с индексами 2 (включительно) до 5 (не включая 5): 30, 40, 50
 *
 *
 *         // Выводим полученный подмассив в формате [30, 40, 50]
 *
 *     }
 * }
 */

// JavaRush
package ru.javarush.java.core.level07.task19;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        // Исходный массив температур за день
        int[] dailyTemperatures = {10, 20, 30, 40, 50, 60, 70};

        // Копируем элементы с индексами 2 (включительно) до 5 (не включая 5): 30, 40, 50
        int[] middayTemperatures = Arrays.copyOfRange(dailyTemperatures, 2, 5);

        // Выводим полученный подмассив в формате [30, 40, 50]
        System.out.println(Arrays.toString(middayTemperatures));
    }
}

/*
 * // JavaRush
 * Правильное решение:
 * // Author: JavaRush's team
 * package ru.javarush.java.core.level07.task19;
 *
 * import java.util.Arrays;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Исходный массив температур за день
 *         int[] dailyTemperatures = {10, 20, 30, 40, 50, 60, 70};
 *
 *         // Копируем элементы с индексами 2 (включительно) до 5 (не включая 5): 30, 40, 50
 *         int[] middayTemperatures = Arrays.copyOfRange(dailyTemperatures, 2, 5);
 *
 *         // Выводим полученный подмассив в формате [30, 40, 50]
 *         System.out.println(Arrays.toString(middayTemperatures));
 *     }
 * }
 */