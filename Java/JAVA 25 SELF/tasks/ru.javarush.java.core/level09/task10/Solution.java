/*
 * Authors: JavaRush's team, CodeGym's team, Altavista360
 * Version: 1.0.0
 */

/*
 * // JavaRush
 * Задача: Поиск подстроки в строке
 * Ссылка: https://javarush.com/tasks/ru.javarush.java.core.level09.task10
 */

/*
 * // CodeGym
 * Task: Substring search in a string
 * Link: https://codegym.cc/tasks/en.codegym.java.core.level09.task10
 */

/*
 * // JavaRush
 * Условие:
 * Вы – настоящий "искатель" информации и работаете над поисковой системой для огромной цифровой библиотеки. Пользователь ввёл ключевую фразу, и ваша задача — быстро найти, где именно в длинном тексте она встречается. Скорость и точность важны, ведь от этого зависит удобство пользователя!
 * Возьмите фразу "I love programming in Java". Используя метод indexOf(), найдите точный порядковый номер символа, с которого начинается слово "Java" в этой фразе, и выведите это число на экран. Это как найти координаты клада на очень длинной карте!
 */

/*
 * // JavaRush
 * Требования:
 * • В задаче должен быть использован метод indexOf() класса String для поиска позиции подстроки "Java".
 * • В качестве исходной строки должна быть использована фраза "I love programming in Java".
 * • Программа должна определить точный порядковый номер символа, с которого начинается слово "Java" в исходной строке.
 * • Программа должна вывести найденный порядковый номер на экран.
 */

/*
 * // JavaRush
 * Черновик:
 * package ru.javarush.java.core.level09.task10;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Исходная строка
 *         String phrase = "I love programming in Java";
 *
 *         // Используем метод indexOf() для поиска позиции слова "Java"
 *
 *
 *         // Выводим результат на экран
 *
 *     }
 * }
 */

// JavaRush
package ru.javarush.java.core.level09.task10;

public class Solution {
    public static void main(String[] args) {
        // Исходная строка
        String phrase = "I love programming in Java";

        // Используем метод indexOf() для поиска позиции слова "Java"
        int foo = phrase.indexOf("Java");

        // Выводим результат на экран
        System.out.println(foo);
    }
}

/*
 * // JavaRush
 * Правильное решение:
 * // Author: JavaRush's team
 * package ru.javarush.java.core.level09.task10;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Исходная строка
 *         String phrase = "I love programming in Java";
 *
 *         // Используем метод indexOf() для поиска позиции слова "Java"
 *         int position = phrase.indexOf("Java");
 *
 *         // Выводим результат на экран
 *         System.out.println(position);
 *     }
 * }
 */