/*
 * Authors: JavaRush's team, CodeGym's team, Altavista360
 * Version: 1.0.0
 */

/*
 * // JavaRush
 * Задача: Подсчёт количества слов в тексте
 * Ссылка: https://javarush.com/tasks/ru.javarush.java.core.level12.task08
 */

/*
 * // CodeGym
 * Task: Word count in text
 * Link: https://codegym.cc/tasks/en.codegym.java.core.level12.task08
 */

/*
 * // JavaRush
 * Условие:
 * Вы — аналитик текста и вам поручено выяснить, какие слова чаще всего встречаются в коротком текстовом фрагменте. Ваша цель — подсчитать вхождения каждого слова.
 * Возьмите заданную строку текста: String textContent = "java core java map".
 * Создайте ассоциативный массив (HashMap), где ключом будет каждое уникальное слово (String), а значением — количество его вхождений в тексте (Integer).
 * После того как вы подсчитаете все слова, пройдитесь по вашему словарю и выведите на экран каждую пару "слово: количество", чтобы представить полный анализ частотности слов в тексте.
 */

/*
 * // JavaRush
 * Требования:
 * • В задаче должен использоваться ассоциативный массив (HashMap), где ключами являются уникальные слова из текста, а значениями — количество их вхождений.
 * • Строка textContent должна быть разбита на отдельные слова для дальнейшего анализа.
 * • Для каждого слова из строки textContent необходимо увеличить соответствующее значение в HashMap на 1 при каждом появлении слова.
 * • После подсчёта всех слов необходимо пройтись по всем элементам HashMap и вывести на экран каждую пару "слово: количество".
 */

/*
 * // JavaRush
 * Черновик:
 * package ru.javarush.java.core.level12.task08;
 *
 * import java.util.HashMap;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Исходный текст для анализа
 *         String textContent = "java core java map";
 *
 *         // Создаем HashMap для хранения статистики слов
 *
 *
 *         // Разбиваем текст на слова, используя пробел как разделитель
 *
 *
 *         // Подсчитываем количество вхождений каждого слова
 *
 *             // Получаем значение из словаря
 *
 *
 *             // Если слово уже есть в HashMap, увеличиваем его счетчик
 *
 *
 *         // Выводим результаты подсчета на экран
 *
 *     }
 * }
 */

// JavaRush
package ru.javarush.java.core.level12.task08;

import java.util.HashMap;

public class Solution {
    public static void main(String[] args) {
        // Исходный текст для анализа
        String textContent = "java core java map";

        // Создаем HashMap для хранения статистики слов
        HashMap<String, Integer> statWords = new HashMap<>();

        // Разбиваем текст на слова, используя пробел как разделитель
        String[] someWords = textContent.split(" ");

        // Подсчитываем количество вхождений каждого слова
        for (String word : someWords) {
            // Получаем значение из словаря
            Integer count = statWords.getOrDefault(word, 0);

            // Если слово уже есть в HashMap, увеличиваем его счетчик
            statWords.put(word, count + 1);
        }

        // Выводим результаты подсчета на экран
        for (var word : statWords.entrySet()) {
            System.out.println(word.getKey() + ": " + word.getValue());
        }

    }
}

/*
 * // JavaRush
 * Правильное решение:
 * // Author: JavaRush's team
 * package ru.javarush.java.core.level12.task08;
 *
 * import java.util.HashMap;
 * import java.util.Map;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Исходный текст для анализа
 *         String textContent = "java core java map";
 *
 *         // Создаем HashMap для хранения статистики слов
 *         HashMap<String, Integer> wordCountMap = new HashMap<>();
 *
 *         // Разбиваем текст на слова, используя пробел как разделитель
 *         String[] words = textContent.split(" ");
 *
 *         // Подсчитываем количество вхождений каждого слова
 *         for (String word : words) {
 *             // Получаем значение из словаря
 *             Integer count = wordCountMap.getOrDefault(word, 0);
 *
 *             // Если слово уже есть в HashMap, увеличиваем его счетчик
 *             wordCountMap.put(word, count + 1);
 *         }
 *
 *         // Выводим результаты подсчета на экран
 *         for (var entry : wordCountMap.entrySet()) {
 *             System.out.println(entry.getKey() + ": " + entry.getValue());
 *         }
 *     }
 * }
 */