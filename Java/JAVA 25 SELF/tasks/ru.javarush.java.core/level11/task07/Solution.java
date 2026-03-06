/*
 * Authors: JavaRush's team, CodeGym's team, Altavista360
 * Version: 1.0.0
 */

/*
 * // JavaRush
 * Задача: Диагностика проблемы в системе подсчета 📈
 * Ссылка: https://javarush.com/tasks/ru.javarush.java.core.level11.task07
 */

/*
 * // CodeGym
 * Task: Diagnosing an issue in the scoring system 📈
 * Link: https://codegym.cc/tasks/en.codegym.java.core.level11.task07
 */

/*
 * // JavaRush
 * Условие:
 * Представьте, что вы пишете программу для подсчёта среднего балла команды, набравшей 50 очков. Однако из-за какой-то системной ошибки список игроков оказался пустым – то есть numberOfPlayers равно 0.
 * Чтобы программа не "сломалась" полностью, вам нужно предусмотреть этот случай и получить детальное описание сбоя. В блоке try попробуйте поделить 50 на 0. В блоке catch, перехватив возникшее исключение, не просто выведите общее сообщение, а используйте метод e.getMessage() для того, чтобы вывести на экран точное текстовое описание ошибки, которое сгенерировала сама Java. Это поможет вам или другим разработчикам понять, что именно пошло не так.
 */

/*
 * // JavaRush
 * Требования:
 * • Программа должна использовать конструкцию try-catch для обработки возможной ошибки при делении на ноль.
 * • В блоке try должно быть выражение, в котором происходит деление числа 50 на 0.
 * • В блоке catch должно перехватываться исключение, возникающее при делении на ноль (ArithmeticException).
 * • Внутри блока catch необходимо вывести на экран результат метода e.getMessage() для перехваченного исключения, чтобы показать подробное описание ошибки.
 */

/*
 * // JavaRush
 * Черновик:
 * package ru.javarush.java.core.level11.task07;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         try {
 *             // Пробуем поделить 50 на 0 — это вызовет ArithmeticException
 *
 *
 *         } catch (ArithmeticException e) {
 *             // Выводим текстовое описание ошибки, сгенерированное JVM
 *
 *
 *         }
 *     }
 * }
 */

// JavaRush
package ru.javarush.java.core.level11.task07;

public class Solution {
    public static void main(String[] args) {
        try {
            // Пробуем поделить 50 на 0 — это вызовет ArithmeticException
            int foo = 50 / 0;

        } catch (ArithmeticException e) {
            // Выводим текстовое описание ошибки, сгенерированное JVM
            System.out.println(e.getMessage());

        }
    }
}

/*
 * // JavaRush
 * Правильное решение:
 * // Author: JavaRush's team
 * package ru.javarush.java.core.level11.task07;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         try {
 *             // Пробуем поделить 50 на 0 — это вызовет ArithmeticException
 *             int average = 50 / 0;
 *             System.out.println(average); // До этой строки выполнение не дойдет
 *         } catch (ArithmeticException e) {
 *             // Выводим текстовое описание ошибки, сгенерированное JVM
 *             System.out.println(e.getMessage());
 *         }
 *     }
 * }
 */