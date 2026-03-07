/*
 * Authors: JavaRush's team, CodeGym's team, Altavista360
 * Version: 1.0.0
 */

/*
 * // JavaRush
 * Задача: Система подсчёта очков: только положительные значения! 🏅
 * Ссылка: https://javarush.com/tasks/ru.javarush.java.core.level11.task10
 */

/*
 * // CodeGym
 * Task: Scoring system: positive values only! 🏅
 * Link: https://codegym.cc/tasks/en.codegym.java.core.level11.task10
 */

/*
 * // JavaRush
 * Условие:
 * Вы пишете часть логики для системы подсчёта очков в игре. Очки всегда должны быть строго положительными, чтобы избежать некорректных ситуаций.
 * Создайте метод public static void displayPositiveScore(int currentScore). Этот метод должен выводить currentScore на экран, но только если это значение положительное (больше нуля).
 * Если же кто-то попытается передать в метод отрицательное значение (например, -10 за проваленную миссию), метод должен сам сгенерировать исключение IllegalArgumentException с сообщением: "Невозможно отобразить отрицательный счёт! Число отрицательное."
 * В вашем main методе вызовите displayPositiveScore сначала с положительным значением (например, 50), а затем с отрицательным (например, -5). Во втором случае оберните вызов в try-catch блок, чтобы перехватить созданное вами исключение и вывести на экран его сообщение, объясняющее игроку, почему счёт не может быть отрицательным.
 */

/*
 * // JavaRush
 * Требования:
 * • В классе должен быть объявлен публичный статический метод с сигнатурой public static void displayPositiveScore(int currentScore).
 * • Метод displayPositiveScore должен проверять, что переданное значение currentScore строго больше нуля.
 * • Если currentScore больше нуля, метод должен вывести это значение на экран.
 * • Если currentScore меньше или равен нулю, метод должен выбросить исключение IllegalArgumentException с сообщением "Невозможно отобразить отрицательный счёт! Число отрицательное."
 * • В методе main вызов displayPositiveScore с отрицательным значением должен быть обёрнут в try-catch блок, который перехватывает IllegalArgumentException.
 * • В catch-блоке после перехвата исключения должно быть выведено на экран сообщение этого исключения.
 */

/*
 * // JavaRush
 * Черновик:
 * package ru.javarush.java.core.level11.task10;
 *
 * public class Solution {
 *     // Метод выводит положительный счёт или генерирует исключение для неположительных значений
 *     public static void displayPositiveScore(int currentScore) {
 *
 *         // Генерируем IllegalArgumentException с требуемым сообщением
 *
 *
 *     }
 *
 *     public static void main(String[] args) {
 *         // Корректный вызов: положительное значение
 *
 *
 *         // Некорректный вызов: отрицательное значение, перехватываем исключение
 *
 *         // Выводим сообщение перехваченного исключения
 *
 *
 *     }
 * }
 */

// JavaRush
package ru.javarush.java.core.level11.task10;

public class Solution {
    // Метод выводит положительный счёт или генерирует исключение для неположительных значений
    public static void displayPositiveScore(int currentScore) {
        if (currentScore > 0) {
            System.out.println(currentScore);
        } else {
            // Генерируем IllegalArgumentException с требуемым сообщением
            throw new IllegalArgumentException("Невозможно отобразить отрицательный счёт! Число отрицательное.");
        }
    }

    public static void main(String[] args) {
        // Корректный вызов: положительное значение
        displayPositiveScore(360);

        // Некорректный вызов: отрицательное значение, перехватываем исключение
        try {
            displayPositiveScore(-1);
        } catch (IllegalArgumentException e) {
            // Выводим сообщение перехваченного исключения
            System.out.println(e.getMessage());
        }
    }
}

/*
 * // JavaRush
 * Правильное решение:
 * // Author: JavaRush's team
 * package ru.javarush.java.core.level11.task10;
 *
 * public class Solution {
 *     // Метод выводит положительный счёт или генерирует исключение для неположительных значений
 *     public static void displayPositiveScore(int currentScore) {
 *         if (currentScore > 0) {
 *             System.out.println(currentScore);
 *         } else {
 *             // Генерируем IllegalArgumentException с требуемым сообщением
 *             throw new IllegalArgumentException("Невозможно отобразить отрицательный счёт! Число отрицательное.");
 *         }
 *     }
 *
 *     public static void main(String[] args) {
 *         // Корректный вызов: положительное значение
 *         displayPositiveScore(50);
 *
 *         // Некорректный вызов: отрицательное значение, перехватываем исключение
 *         try {
 *             displayPositiveScore(-5);
 *         } catch (IllegalArgumentException e) {
 *             // Выводим сообщение перехваченного исключения
 *             System.out.println(e.getMessage());
 *         }
 *     }
 * }
 */