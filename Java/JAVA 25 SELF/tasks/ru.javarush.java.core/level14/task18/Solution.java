/*
 * Authors: JavaRush's team, CodeGym's team, Altavista360
 * Version: 1.0.0
 */

/*
 * // JavaRush
 * Задача: Стандартизация новых книг в издательстве
 * Ссылка: https://javarush.com/tasks/ru.javarush.java.core.level14.task18
 */

/*
 * // CodeGym
 * Task: Standardizing New Books in the Publishing House
 * Link: https://codegym.cc/tasks/en.codegym.java.core.level14.task18
 */

/*
 * // JavaRush
 * Условие:
 * Вы работаете в издательстве, и чтобы избежать путаницы, вы решили, что каждая новая книга, поступающая в систему, должна иметь базовые, стандартные параметры, даже если они пока не окончательны.
 * Ваша задача — создать "шаблон" для книги, назвав его Book, с полями для названия (String bookTitle) и количества страниц (int pageCount).
 * При объявлении этих полей прямо в шаблоне присвойте им стандартные значения: название — "Без названия", а количество страниц — 100.
 * Затем, в вашем главном сценарии (main методе), "создайте" одну такую книгу, назвав её standardBook, и убедитесь, что эти стандартные значения сразу же присвоены, выведя их на экран.
 */

/*
 * // JavaRush
 * Требования:
 * Должен быть создан класс с именем Book.
 * В классе Book должны быть объявлены два поля: String bookTitle и int pageCount, и им должны быть присвоены значения "Без названия" и 100 соответственно прямо при объявлении.
 * В методе main должен быть создан объект класса Book с именем standardBook.
 * После создания объекта standardBook значения его полей bookTitle и pageCount должны быть выведены на экран - им должны быть присвоены стандартные значения.
 */

/*
 * // JavaRush
 * Черновик:
 * package ru.javarush.java.core.level14.task18;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Создаем книгу со стандартными значениями полей
 *         Book standardBook = new Book();
 *
 *         // Выводим стандартные значения на экран
 *         System.out.println(standardBook.bookTitle);
 *         System.out.println(standardBook.pageCount);
 *     }
 * }
 *
 * // "Шаблон" книги с начальными значениями полей прямо при объявлении
 */

// JavaRush
package ru.javarush.java.core.level14.task18;

public class Solution {
    public static void main(String[] args) {
        // Создаем книгу со стандартными значениями полей
        Book standardBook = new Book();

        // Выводим стандартные значения на экран
        System.out.println(standardBook.bookTitle);
        System.out.println(standardBook.pageCount);
    }
}

// "Шаблон" книги с начальными значениями полей прямо при объявлении
class Book {
    String bookTitle = "Без названия";
    int pageCount = 100;
}

/*
 * // JavaRush
 * Правильное решение:
 * // Author: JavaRush's team
 * package ru.javarush.java.core.level14.task18;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Создаем книгу со стандартными значениями полей
 *         Book standardBook = new Book();
 *
 *         // Выводим стандартные значения на экран
 *         System.out.println(standardBook.bookTitle);
 *         System.out.println(standardBook.pageCount);
 *     }
 * }
 *
 * // "Шаблон" книги с начальными значениями полей прямо при объявлении
 * class Book {
 *     String bookTitle = "Без названия"; // стандартное название
 *     int pageCount = 100;               // стандартное количество страниц
 * }
 */