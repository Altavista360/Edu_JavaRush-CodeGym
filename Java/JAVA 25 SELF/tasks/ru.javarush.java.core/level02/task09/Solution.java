/*
 * Authors: JavaRush's team, CodeGym's team, Altavista360
 * Version: 1.0.0
 */

/*
 * // JavaRush
 * Задача: Код доступа 🔑
 * Ссылка: https://javarush.com/tasks/ru.javarush.java.core.level02.task09
 */

/*
 * // CodeGym
 * Task: Access Code 🔑
 * Link: https://codegym.cc/tasks/en.codegym.java.core.level02.task09
 */

/*
 * // JavaRush
 * Условие:
 * Представьте, что вы хотите поделиться кодом доступа к секретному файлу. Код доступа — это число.
 * Создайте переменную типа int с любым значением. Преобразуйте это число в строку, чтобы его можно было отправить в сообщении, и выведите полученную строку на экран.
 */

/*
 * // JavaRush
 * Требования:
 * • В программе должна быть объявлена переменная типа int и присвоено ей любое целое значение.
 * • Значение переменной типа int должно быть преобразовано в строку.
 * • Результат преобразования (строка) должен быть сохранён в отдельную переменную типа String.
 * • Полученная строка должна быть выведена на экран с помощью System.out.println.
 */

/*
 * // JavaRush
 * Черновик:
 * package ru.javarush.java.core.level02.task09;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Объявляем переменную типа int и присваиваем ей произвольное целое значение (код доступа)
 *
 *
 *         // Преобразуем целочисленное значение accessCode в строку
 *
 *
 *         // Выводим полученную строку на экран
 *
 *     }
 * }
 */

// JavaRush
package ru.javarush.java.core.level02.task09;

public class Solution {
    public static void main(String[] args) {
        // Объявляем переменную типа int и присваиваем ей произвольное целое значение (код доступа)
        int foo = 131072;

        // Преобразуем целочисленное значение accessCode в строку
        String accessCode = String.valueOf(foo);

        // Выводим полученную строку на экран
        System.out.println(accessCode);
    }
}

/*
 * // JavaRush
 * Правильное решение:
 * // Author: JavaRush's team
 * package ru.javarush.java.core.level02.task09;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Объявляем переменную типа int и присваиваем ей произвольное целое значение (код доступа)
 *         int accessCode = 12345;
 *
 *         // Преобразуем целочисленное значение accessCode в строку
 *         String codeString = Integer.toString(accessCode);
 *
 *         // Выводим полученную строку на экран
 *         System.out.println(codeString);
 *     }
 * }
 */