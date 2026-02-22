/*
 * Authors: JavaRush's team, CodeGym's team, Altavista360
 * Version: 1.0.0
 */

/*
 * // JavaRush
 * Задача: Извлечение символа по индексу
 * Ссылка: https://javarush.com/tasks/ru.javarush.java.core.level09.task09
 */

/*
 * // CodeGym
 * Task: Extracting a character by index
 * Link: https://codegym.cc/tasks/en.codegym.java.core.level09.task09
 */

/*
 * // JavaRush
 * Условие:
 * Представьте, что вы — тайный агент и вам нужно извлечь один, но очень важный символ из секретного кода. Код — это слово, и вам сказали, что нужный символ находится на определённой позиции. Точность — ключ к успеху!
 * Ваша миссия — взять секретное слово "Java", проникнуть в него и извлечь второй по счёту символ (помните, индексация начинается с 0!), а затем вывести его на экран. Используйте метод charAt() для этой точной операции.
 */

/*
 * // JavaRush
 * Требования:
 * • В программе должна быть переменная типа String, содержащая слово "Java".
 * • Для извлечения символа из строки должен быть использован метод charAt().
 * • Должен быть извлечён символ с индексом 1 (второй по счёту символ, учитывая нулевую индексацию).
 * • Извлечённый символ должен быть выведен на экран.
 */

/*
 * // JavaRush
 * Черновик:
 * package ru.javarush.java.core.level09.task09;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Объявляем строку с секретным словом
 *         String secret = "Java";
 *
 *         // Извлекаем символ с индексом 1 (второй символ, т.к. индексация с нуля) методом charAt()
 *
 *
 *         // Выводим извлеченный символ на экран
 *
 *     }
 * }
 */

// JavaRush
package ru.javarush.java.core.level09.task09;

public class Solution {
    public static void main(String[] args) {
        // Объявляем строку с секретным словом
        String secret = "Java";

        // Извлекаем символ с индексом 1 (второй символ, т.к. индексация с нуля) методом charAt()
        char foo = secret.charAt(1);

        // Выводим извлеченный символ на экран
        System.out.println(foo);
    }
}

/*
 * // JavaRush
 * Правильное решение:
 * // Author: JavaRush's team
 * package ru.javarush.java.core.level09.task09;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Объявляем строку с секретным словом
 *         String secret = "Java";
 *
 *         // Извлекаем символ с индексом 1 (второй символ, т.к. индексация с нуля) методом charAt()
 *         char extracted = secret.charAt(1);
 *
 *         // Выводим извлеченный символ на экран
 *         System.out.println(extracted);
 *     }
 * }
 */