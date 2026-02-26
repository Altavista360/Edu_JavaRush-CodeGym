/*
 * Authors: JavaRush's team, CodeGym's team, Altavista360
 * Version: 1.0.0
 */

/*
 * // JavaRush
 * Задача: Запись очков игрока 🎮
 * Ссылка: https://javarush.com/tasks/ru.javarush.java.core.level10.task01
 */

/*
 * // CodeGym
 * Task: Player Score Recording 🎮
 * Link: https://codegym.cc/tasks/en.codegym.java.core.level10.task01
 */

/*
 * // JavaRush
 * Условие:
 * Представьте, что вы разрабатываете игру и получили очки, набранные игроком, из текстового файла. Сейчас они хранятся в виде строки, но вам нужно провести с ними математические операции.
 * Ваша задача — создать строковую переменную playerScoreText и присвоить ей значение "500". Затем используйте мощь класса-обёртки Integer, чтобы волшебным образом преобразовать эту текстовую строку в настоящее целое число. Полученное число сохраните в переменную actualPlayerScore и выведите его на экран, чтобы убедиться, что всё прошло успешно.
 */

/*
 * // JavaRush
 * Требования:
 * • Необходимо создать строковую переменную с именем playerScoreText и присвоить ей значение "500".
 * • Для преобразования строки в целое число должен быть использован класс-обёртка Integer.
 * • Строковая переменная playerScoreText должна быть преобразована в целое число и результат сохранён в переменной actualPlayerScore.
 * • Необходимо объявить переменную actualPlayerScore для хранения полученного целого числа.
 * • Значение переменной actualPlayerScore должно быть выведено на экран.
 */

/*
 * // JavaRush
 * Черновик:
 * package ru.javarush.java.core.level10.task01;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Строковое представление очков игрока (например, считано из файла)
 *         String playerScoreText = "500";
 *
 *         // Преобразуем строку в int, используя класс-обёртку Integer
 *
 *
 *         // Выводим результат, чтобы проверить успешность преобразования
 *
 *     }
 * }
 */

// JavaRush
package ru.javarush.java.core.level10.task01;

public class Solution {
    public static void main(String[] args) {
        // Строковое представление очков игрока (например, считано из файла)
        String playerScoreText = "500";

        // Преобразуем строку в int, используя класс-обёртку Integer
        int actualPlayerScore = Integer.parseInt(playerScoreText);

        // Выводим результат, чтобы проверить успешность преобразования
        System.out.println(actualPlayerScore);
    }
}

/*
 * // JavaRush
 * Правильное решение:
 * // Author: JavaRush's team
 * package ru.javarush.java.core.level10.task01;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Строковое представление очков игрока (например, считано из файла)
 *         String playerScoreText = "500";
 *
 *         // Преобразуем строку в int, используя класс-обёртку Integer
 *         int actualPlayerScore = Integer.parseInt(playerScoreText);
 *
 *         // Выводим результат, чтобы проверить успешность преобразования
 *         System.out.println(actualPlayerScore);
 *     }
 * }
 */