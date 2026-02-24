/*
 * Authors: JavaRush's team, CodeGym's team, Altavista360
 * Version: 1.0.0
 */

/*
 * // JavaRush
 * Задача: Создание и вывод StringBuilder
 * Ссылка: https://javarush.com/tasks/ru.javarush.java.core.level09.task17
 */

/*
 * // CodeGym
 * Task: Creating and printing a StringBuilder
 * Link: https://codegym.cc/tasks/en.codegym.java.core.level09.task17
 */

/*
 * // JavaRush
 * Условие:
 * Представьте, что вы — кулинар строк, разрабатывающий динамический текстовый генератор для маркетингового приложения. Вам нужно "приготовить" идеальное рекламное сообщение, которое будет меняться в зависимости от контекста. Начать нужно с основы, а затем к ней добавлять "изюминки". Эффективность и гибкость — ваш девиз.
 * Ваша задача — создать объект StringBuilder, начав его со слова "Java". Затем, используя метод append(), добавьте к нему фразу " - это круто!", чтобы получился полный и воодушевляющий лозунг. В конце выведите получившуюся строку на экран. Покажите, как легко и мощно можно строить строки по частям.
 */

/*
 * // JavaRush
 * Требования:
 * • В программе должен быть создан объект класса StringBuilder.
 * • Объект StringBuilder должен быть инициализирован строкой "Java" при создании.
 * • Для добавления текста к строке должен быть использован метод append() объекта StringBuilder.
 * • К строке "Java" с помощью метода append() должна быть добавлена фраза " - это круто!".
 * • Получившаяся строка должна быть выведена на экран с помощью System.out.println.
 */

/*
 * // JavaRush
 * Черновик:
 * package ru.javarush.java.core.level09.task17;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Создаем StringBuilder с начальным содержимым "Java"
 *
 *
 *         // Добавляем к строке нужную фразу с помощью метода append()
 *
 *
 *         // Выводим итоговую строку на экран
 *
 *     }
 * }
 */

// JavaRush
package ru.javarush.java.core.level09.task17;

public class Solution {
    public static void main(String[] args) {
        // Создаем StringBuilder с начальным содержимым "Java"
        StringBuilder foo = new StringBuilder("Java");

        // Добавляем к строке нужную фразу с помощью метода append()
        foo.append(" - это круто!");

        // Выводим итоговую строку на экран
        System.out.println(foo.toString());
    }
}

/*
 * // JavaRush
 * Правильное решение:
 * // Author: JavaRush's team
 * package ru.javarush.java.core.level09.task17;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Создаем StringBuilder с начальным содержимым "Java"
 *         StringBuilder slogan = new StringBuilder("Java");
 *
 *         // Добавляем к строке нужную фразу с помощью метода append()
 *         slogan.append(" - это круто!");
 *
 *         // Выводим итоговую строку на экран
 *         System.out.println(slogan.toString());
 *     }
 * }
 */