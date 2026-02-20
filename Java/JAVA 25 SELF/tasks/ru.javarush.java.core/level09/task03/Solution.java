/*
 * Authors: JavaRush's team, CodeGym's team, Altavista360
 * Version: 1.0.0
 */

/*
 * // JavaRush
 * Задача: Табуляция и кавычки в строке
 * Ссылка: https://javarush.com/tasks/ru.javarush.java.core.level09.task03
 */

/*
 * // CodeGym
 * Task: Tabs and quotes in a string
 * Link: https://codegym.cc/tasks/en.codegym.java.core.level09.task03
 */

/*
 * // JavaRush
 * Условие:
 * Представьте, что вы – дизайнер рекламных материалов для крупной IT-конференции. Вам нужно создать эффектный слоган, который будет выведен на консоли.
 * Чтобы текст смотрелся профессионально и был легко читаем, слово "Java" должно быть выделено кавычками, а весь слоган должен быть красиво выровнен с помощью табуляции.
 * Ваша задача — вывести на экран строку: "Java"\t— язык программирования!, убедившись, что слово "Java" окружено двойными кавычками и отделено от остального текста символами табуляции для идеального выравнивания.
 */

/*
 * // JavaRush
 * Требования:
 * • В строке при выводе на экран слово Java должно быть заключено в двойные кавычки, для чего необходимо использовать экранирование символа ".
 * • В строке между словом "Java" и тире должен быть использован спецсимвол табуляции (\t).
 * • Строка, выводимая на экран, должна точно соответствовать: "Java"\t— язык программирования!
 * • Строка должна быть выведена на экран с помощью команды System.out.println.
 */

/*
 * // JavaRush
 * Черновик:
 * package ru.javarush.java.core.level09.task03;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Вывод строки с экранированными кавычками и символом табуляции
 *
 *     }
 * }
 */

// JavaRush
package ru.javarush.java.core.level09.task03;

public class Solution {
    public static void main(String[] args) {
        // Вывод строки с экранированными кавычками и символом табуляции
        System.out.println("\"Java\"\t— язык программирования!");
    }
}

/*
 * // JavaRush
 * Правильное решение:
 * // Author: JavaRush's team
 * package ru.javarush.java.core.level09.task03;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Вывод строки с экранированными кавычками и символом табуляции
 *         System.out.println("\"Java\"\t— язык программирования!");
 *     }
 * }
 */