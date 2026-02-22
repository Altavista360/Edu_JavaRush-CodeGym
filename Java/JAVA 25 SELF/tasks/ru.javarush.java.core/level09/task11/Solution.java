/*
 * Authors: JavaRush's team, CodeGym's team, Altavista360
 * Version: 1.0.0
 */

/*
 * // JavaRush
 * Задача: Получение подстроки
 * Ссылка: https://javarush.com/tasks/ru.javarush.java.core.level09.task11
 */

/*
 * // CodeGym
 * Task: Extracting a substring
 * Link: https://codegym.cc/tasks/en.codegym.java.core.level09.task11
 */

/*
 * // JavaRush
 * Условие:
 * Представьте, что вы — хирург слов, работающий над умным текстовым редактором. Вам нужно аккуратно "вырезать" определённый фрагмент из слова для дальнейшего анализа или преобразования. Только так вы сможете провести глубокий анализ текста!
 * Возьмите слово "programming". Ваша задача — с помощью метода substring() "вырезать" из него часть "gram" и вывести эту "вырезку" на экран.
 * Покажите, как вы можете ловко извлекать нужные фрагменты из больших строк.
 */

/*
 * // JavaRush
 * Требования:
 * • Для получения подстроки из строки должен быть использован метод substring() класса String.
 * • Метод substring должен быть вызван с такими аргументами, чтобы из строки "programming" была получена подстрока "gram".
 * • Полученная подстрока "gram" должна быть выведена на экран с помощью System.out.println.
 */

/*
 * // JavaRush
 * Черновик:
 * package ru.javarush.java.core.level09.task11;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Исходная строка
 *         String word = "programming";
 *
 *         // Извлечение подстроки "gram" с помощью метода substring()
 *
 *
 *         // Вывод подстроки на экран
 *
 *     }
 * }
 */

// JavaRush
package ru.javarush.java.core.level09.task11;

public class Solution {
    public static void main(String[] args) {
        // Исходная строка
        String word = "programming";

        // Извлечение подстроки "gram" с помощью метода substring()
        String foo = word.substring(3, 7);

        // Вывод подстроки на экран
        System.out.println(foo);
    }
}

/*
 * // JavaRush
 * Правильное решение:
 * // Author: JavaRush's team
 * package ru.javarush.java.core.level09.task11;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Исходная строка
 *         String word = "programming";
 *
 *         // Извлечение подстроки "gram" с помощью метода substring()
 *         String substring = word.substring(3, 7); // Индексы 3 (включительно) и 7 (не включительно)
 *
 *         // Вывод подстроки на экран
 *         System.out.println(substring);
 *     }
 * }
 */