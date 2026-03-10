/*
 * Authors: JavaRush's team, CodeGym's team, Altavista360
 * Version: 1.0.0
 */

/*
 * // JavaRush
 * Задача: Кулинарный калькулятор и его неприятный сюрприз 🥧
 * Ссылка: https://javarush.com/tasks/ru.javarush.java.core.level11.task17
 */

/*
 * // CodeGym
 * Task: Culinary calculator and its unpleasant surprise 🥧
 * Link: https://codegym.cc/tasks/en.codegym.java.core.level11.task17
 */

/*
 * // JavaRush
 * Условие:
 * Представьте, что вы создали простую программу для расчёта пропорций в кулинарии, но допустили критическую ошибку. Вы пытаетесь рассчитать, сколько порций можно сделать, разделив 10 ингредиентов на 0 (потому что забыли указать минимальное количество ингредиентов на порцию).
 * В вашем main методе намеренно разделите целое число 10 на 0. Запустите эту программу и внимательно изучите то, что выведет консоль: длинный текст, называемый Stack Trace.
 * Найдите в нём тип исключения и точную строку кода, где произошла эта математическая катастрофа.
 */

/*
 * // JavaRush
 * Требования:
 * • В методе main должно быть выполнено деление целого числа 10 на 0.
 * • Программа при запуске должна выбрасывать исключение, связанное с делением на ноль.
 * • После возникновения ошибки в консоли должен появиться stack trace (трассировка стека вызовов).
 * • В stack trace должен быть указан тип возникшего исключения (например, ArithmeticException).
 * • Stack trace должен содержать информацию о строке исходного кода, где произошло деление на ноль.
 */

/*
 * // JavaRush
 * Черновик:
 * package ru.javarush.java.core.level11.task17;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Намеренно выполняем деление 10 на 0, чтобы вызвать ArithmeticException
 *
 *
 *         // Этот код не будет выполнен, так как программа завершится с ошибкой
 *
 *     }
 * }
 */

// JavaRush
package ru.javarush.java.core.level11.task17;

public class Solution {
    public static void main(String[] args) {
        // Намеренно выполняем деление 10 на 0, чтобы вызвать ArithmeticException
        int foo = 10 / 0;

        // Этот код не будет выполнен, так как программа завершится с ошибкой
        System.out.println(foo);
    }
}

/*
 * // JavaRush
 * Правильное решение:
 * // Author: JavaRush's team
 * package ru.javarush.java.core.level11.task17;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Намеренно выполняем деление 10 на 0, чтобы вызвать ArithmeticException
 *         int result = 10 / 0;
 *
 *         // Этот код не будет выполнен, так как программа завершится с ошибкой
 *         System.out.println("Результат: " + result);
 *     }
 * }
 */