/*
 * Authors: JavaRush's team, CodeGym's team, Altavista360
 * Version: 1.0.0
 */

/*
 * // JavaRush
 * Задача: Учёт книг в библиотеке: новые поступления
 * Ссылка: https://javarush.com/tasks/ru.javarush.java.core.level14.task12
 */

/*
 * // CodeGym
 * Task: Library book inventory: new arrivals
 * Link: https://codegym.cc/tasks/en.codegym.java.core.level14.task12
 */

/*
 * // JavaRush
 * Условие:
 * Вы — библиотекарь, и к вам в руки попадают книги: некоторые уже имеют все нужные данные, а некоторые пока без точного названия и количества страниц – их только предстоит описать.
 * Ваша задача — создать гибкий шаблон для книг, назвав его Book, с полями для названия (String bookTitle) и количества страниц (int numberOfPages).
 * Реализуйте два "способа регистрации" книги (конструктора):
 * • первый, без каких-либо начальных данных, который будет по умолчанию называть книгу "Без названия" и указывать 0 страниц;
 * • второй, более полный, который будет принимать название и количество страниц сразу.
 * В вашем основном сценарии (main методе) "зарегистрируйте" одну книгу, используя первый способ (для той, что пока без данных), и вторую — используя второй способ, присвоив ей название "Java для начинающих" и указав 350 страниц.
 * Затем "покажите" информацию о каждой книге, выведя её на экран в формате: "Книга: [название книги], страниц: [количество страниц]".
 */

/*
 * // JavaRush
 * Требования:
 * • Должен быть создан публичный класс с именем Book.
 * • Класс Book должен содержать два приватных поля: String bookTitle и int numberOfPages.
 * • В классе Book должен быть реализован конструктор без параметров, который устанавливает bookTitle в "Без названия" и numberOfPages в 0.
 * • В классе Book должен быть реализован конструктор с двумя параметрами (String, int), который устанавливает соответствующие значения полей bookTitle и numberOfPages.
 * • В методе main должен быть создан один объект Book с помощью конструктора без параметров и один объект Book с помощью конструктора с параметрами ("Java для начинающих", 350).
 * • В методе main должна быть реализована печать информации о каждой книге в формате: "Книга: [название книги], страниц: [количество страниц]".
 */

// JavaRush
package ru.javarush.java.core.level14.task12;

public class Book {
    private String bookTitle;
    private int numberOfPages;

    public Book() {
        this.bookTitle = "Без названия";
        this.numberOfPages = 0;
    }

    public Book(String bookTitle, int numberOfPages) {
        this.bookTitle = bookTitle;
        this.numberOfPages = numberOfPages;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }
}

/*
 * // JavaRush
 * Правильное решение:
 * // Author: JavaRush's team
 * package ru.javarush.java.core.level14.task12;
 *
 * // Публичный класс Book — шаблон книги с названием и количеством страниц
 * public class Book {
 *     // Приватные поля — инкапсулируем данные книги
 *     private String bookTitle;
 *     private int numberOfPages;
 *
 *     // Конструктор без параметров: книга "Без названия" и 0 страниц
 *     public Book() {
 *         this.bookTitle = "Без названия";
 *         this.numberOfPages = 0;
 *     }
 *
 *     // Конструктор с параметрами: сразу задаем название и количество страниц
 *     public Book(String bookTitle, int numberOfPages) {
 *         this.bookTitle = bookTitle;
 *         this.numberOfPages = numberOfPages;
 *     }
 *
 *     // Геттеры для безопасного доступа к приватным полям
 *     public String getBookTitle() {
 *         return bookTitle;
 *     }
 *
 *     public int getNumberOfPages() {
 *         return numberOfPages;
 *     }
 * }
 */