/*
 * Authors: JavaRush's team, CodeGym's team, Altavista360
 * Version: 1.0.0
 */

/*
 * // JavaRush
 * Задача: Форматирование отчёта с процентом и локалью
 * Ссылка: https://javarush.com/tasks/ru.javarush.java.core.level09.task08
 */

/*
 * // CodeGym
 * Task: Formatting a report with percentage and locale
 * Link: https://codegym.cc/tasks/en.codegym.java.core.level09.task08
 */

/*
 * // JavaRush
 * Условие:
 * Вы – архитектор образовательной платформы, которая работает по всему миру. После завершения теста студенту необходимо показать его результат в процентах. Для европейских студентов особенно важно, чтобы десятичный разделитель был запятой, а не точкой. Это вопрос не только правильности, но и уважения к культурным особенностям.
 * Ваша задача — объявить переменные для имени студента (String studentName = "Анна"), количества правильных ответов (int correctAnswers = 45) и общего числа вопросов (int totalQuestions = 50).
 * Затем, вычислив процент правильных ответов, используя String.format и локаль Locale.GERMANY, выведите на экран строку, которая покажет имя студента и его процентный результат с одним знаком после запятой, где десятичным разделителем будет запятая, а не точка, и знак процента будет явно указан. Например: "Анна: 90,0% правильных ответов".
 */

/*
 * // JavaRush
 * Требования:
 * • Должны быть объявлены переменные: String studentName со значением "Анна", int correctAnswers со значением 45 и int totalQuestions со значением 50.
 * • Процент правильных ответов должен быть вычислен как отношение correctAnswers к totalQuestions, умноженное на 100.
 * • Для форматирования строки должен использоваться метод String.format с указанием локали Locale.GERMANY.
 * • Процент должен быть выведен с одним знаком после запятой в дробной части.
 * • В результате форматирования в качестве десятичного разделителя должна использоваться запятая, а не точка.
 * • На экран должна быть выведена строка, содержащая имя студента, процент (с запятой и одним знаком после запятой), знак процента (%) и пояснение "правильных ответов". Например: "Анна: 90,0% правильных ответов".
 */

/*
 * // JavaRush
 * Черновик:
 * package ru.javarush.java.core.level09.task08;
 *
 * import java.util.Locale;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Объявляем переменные
 *         String studentName = "Анна"; // Имя студента
 *         int correctAnswers = 45; // Количество правильных ответов
 *         int totalQuestions = 50; // Общее количество вопросов
 *
 *         // Вычисляем процент правильных ответов
 *
 *
 *         // Форматируем строку с использованием Locale.GERMANY
 *
 *
 *         // Выводим результат на экран
 *
 *     }
 * }
 */

// JavaRush
package ru.javarush.java.core.level09.task08;

import java.util.Locale;

public class Solution {
    public static void main(String[] args) {
        // Объявляем переменные
        String studentName = "Анна"; // Имя студента
        int correctAnswers = 45; // Количество правильных ответов
        int totalQuestions = 50; // Общее количество вопросов

        // Вычисляем процент правильных ответов
        double percentage = (double) correctAnswers / totalQuestions * 100;

        // Форматируем строку с использованием Locale.GERMANY
        String formattedString = String.format(Locale.GERMANY, "%s: %.1f%% правильных ответов", studentName, percentage);

        // Выводим результат на экран
        System.out.println(formattedString);
    }
}

/*
 * // JavaRush
 * Правильное решение:
 * // Author: JavaRush's team
 * package ru.javarush.java.core.level09.task08;
 *
 * import java.util.Locale;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Объявляем переменные
 *         String studentName = "Анна"; // Имя студента
 *         int correctAnswers = 45; // Количество правильных ответов
 *         int totalQuestions = 50; // Общее количество вопросов
 *
 *         // Вычисляем процент правильных ответов
 *         double percentage = (double) correctAnswers / totalQuestions * 100;
 *
 *         // Форматируем строку с использованием Locale.GERMANY
 *         String result = String.format(Locale.GERMANY, "%s: %.1f%% правильных ответов", studentName, percentage);
 *
 *         // Выводим результат на экран
 *         System.out.println(result);
 *     }
 * }
 */