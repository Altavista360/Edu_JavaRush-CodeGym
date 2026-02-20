/*
 * Authors: JavaRush's team, CodeGym's team, Altavista360
 * Version: 1.0.0
 */

/*
 * // JavaRush
 * Задача: Unicode-символы и смайлики в строке
 * Ссылка: https://javarush.com/tasks/ru.javarush.java.core.level09.task04
 */

/*
 * // CodeGym
 * Task: Lorem ipsum dolor sit amet consectetur adipiscing elit.
 * Link: https://codegym.cc/tasks/en.codegym.java.core.level09.task04
 */

/*
 * // JavaRush
 * Условие:
 * Вы работаете над чат-приложением нового поколения, и хотите, чтобы сообщения выглядели более дружелюбно и современно.
 * Ваше первое задание — создать стандартное приветствие, которое включает в себя яркие эмодзи. Однако, чтобы эти символы отображались корректно на любом устройстве, вам нужно использовать их точные Unicode-последовательности, а не просто копировать из таблицы символов.
 * Ваша миссия — вывести это приветствие на консоль: "Привет, мир! ☀️😊", встроив символы солнца и улыбающегося лица с помощью их Unicode-последовательностей, демонстрируя ваше мастерство в работе с символами.
 */

/*
 * // JavaRush
 * Требования:
 * • Программа должна использовать Unicode-последовательности для вставки символов солнца и улыбающегося лица в строку, а не копировать символы напрямую.
 * • Строка, выводимая на экран, должна быть: "Привет, мир! ☀️😊" — с символами солнца и улыбающегося лица, встроенными через Unicode.
 * • Программа должна вывести итоговую строку приветствия на консоль с помощью System.out.println.
 * • Unicode-последовательности для символов должны быть записаны в правильном формате Java (\uXXXX или суррогатные пары, если требуется).
 */

/*
 * // JavaRush
 * Черновик:
 * package ru.javarush.java.core.level09.task04;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Используем Unicode-последовательности:
 *
 *     }
 * }
 */

// JavaRush
package ru.javarush.java.core.level09.task04;

public class Solution {
    public static void main(String[] args) {
        // Используем Unicode-последовательности:
        System.out.println("Привет, мир! \u2600\uFE0F\uD83D\uDE0A");
    }
}

/*
 * // JavaRush
 * Правильное решение:
 * // Author: JavaRush's team
 * package ru.javarush.java.core.level09.task04;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Используем Unicode-последовательности:
 *         // ☀️ = U+2600 (BLACK SUN WITH RAYS) + U+FE0F (Variation Selector-16 для эмодзи-стиля)
 *         // 😊 = U+1F60A (SMILING FACE WITH SMILING EYES) — в Java записывается суррогатной парой \uD83D\uDE0A
 *         System.out.println("Привет, мир! \u2600\uFE0F\uD83D\uDE0A");
 *     }
 * }
 */