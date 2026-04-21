/*
 * Authors: JavaRush's team, CodeGym's team, Altavista360
 * Version: 1.0.0
 */

/*
 * // JavaRush
 * Задача: Издательский дом: создание новой книги 📚
 * Ссылка: https://javarush.com/tasks/ru.javarush.java.core.level16.task08
 */

/*
 * // CodeGym
 * Task: Publishing House: creating a new book 📚
 * Link: https://codegym.cc/tasks/en.codegym.java.core.level16.task08
 */

/*
 * // JavaRush
 * Условие:
 * Вы — издатель, и вам нужна удобная система для создания новых книг. Вместо того чтобы собирать книгу по частям, вы хотите иметь организованный способ "собирать" её, задавая различные атрибуты (название, количество страниц) шаг за шагом, прежде чем книга будет окончательно "переплетена" и готова.
 * Создайте класс Book с приватными полями bookTitle (строка) и pageCount (целое число). Реализуйте приватный конструктор Book(Builder builder), который инициализирует поля книги из соответствующих полей переданного Builder.
 * Внутри класса Book объявите публичный статический вложенный класс с именем Builder. Этот Builder должен иметь методы setTitle(String title) и setPages(int pages), которые возвращают сам Builder для цепочного вызова. Также добавьте в Builder метод build(), который возвращает новый, полностью сконструированный объект Book.
 * В методе main вашей программы используйте этот Builder для создания нового объекта Book, задав название "Java Basics" и количество страниц 500. Выведите на экран информацию о созданной книге в формате: "Book: Java Basics, 500 pages."
 */

/*
 * // JavaRush
 * Требования:
 * • Необходимо создать класс с именем Book.
 * • В классе Book должны быть приватные поля: bookTitle (String) и pageCount (int).
 * • В классе Book должен быть приватный конструктор, принимающий объект Builder и инициализирующий поля книги значениями из Builder.
 * • Внутри класса Book должен быть объявлен публичный статический вложенный класс с именем Builder.
 * • Класс Builder должен содержать методы setTitle(String title) и setPages(int pages), которые устанавливают соответствующие значения и возвращают сам объект Builder для цепочки вызова.
 * • Класс Builder должен содержать метод build(), возвращающий новый объект Book, собранный на основе данных Builder.
 * • В методе main необходимо создать объект Book с помощью Book.Builder, указав название "Java Basics" и количество страниц 500.
 * • В методе main необходимо вывести в консоль строку "Book: Java Basics, 500 pages."
 */

/*
 * // JavaRush
 * Черновик:
 * package ru.javarush.java.core.level16.task08;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Создаем книгу через статический вложенный класс Builder
 *         Book book = new Book.Builder()
 *                 .setTitle("Java Basics")
 *                 .setPages(500)
 *                 .build();
 *
 *         // Выводим информацию о книге (toString() возвращает строку в нужном формате)
 *         System.out.println(book);
 *     }
 * }
 */

// JavaRush
package ru.javarush.java.core.level16.task08;

public class Solution {
    public static void main(String[] args) {
        // Создаем книгу через статический вложенный класс Builder
        Book book = new Book.Builder()
                .setTitle("Java Basics")
                .setPages(500)
                .build();

        // Выводим информацию о книге (toString() возвращает строку в нужном формате)
        System.out.println(book);
    }
}

class Book {
    private final String bookTitle;
    private final int pageCount;

    private Book(Builder builder) {
        this.bookTitle = builder.title;
        this.pageCount = builder.pages;
    }

    public static class Builder {
        private String title;
        private int pages;

        public Builder setTitle(String title) {
            this.title = title;
            return this;
        }

        public Builder setPages(int pages) {
            this.pages = pages;
            return this;
        }

        public Book build() {
            return new Book(this);
        }
    }

    @Override
    public String toString() {
        return "Book: " + bookTitle + ", " + pageCount + " pages.";
    }
}

/*
 * // JavaRush
 * Правильное решение:
 * // Author: JavaRush's team
 * package ru.javarush.java.core.level16.task08;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Создаем книгу через статический вложенный класс Builder
 *         Book book = new Book.Builder()
 *                 .setTitle("Java Basics")
 *                 .setPages(500)
 *                 .build();
 *
 *         // Выводим информацию о книге (toString() возвращает строку в нужном формате)
 *         System.out.println(book);
 *     }
 * }
 *
 * // Класс Book с приватными полями и приватным конструктором, который принимает Builder
 * class Book {
 *     private final String bookTitle; // название книги
 *     private final int pageCount;    // количество страниц
 *
 *     // Приватный конструктор: создаем Book только через Builder
 *     private Book(Builder builder) {
 *         this.bookTitle = builder.title;
 *         this.pageCount = builder.pages;
 *     }
 *
 *     // Публичный статический вложенный класс Builder
 *     public static class Builder {
 *         private String title; // поля-черновики для будущей книги
 *         private int pages;
 *
 *         // Устанавливаем название книги и возвращаем Builder для цепочки вызовов
 *         public Builder setTitle(String title) {
 *             this.title = title;
 *             return this;
 *         }
 *
 *         // Устанавливаем число страниц и возвращаем Builder для цепочки вызовов
 *         public Builder setPages(int pages) {
 *             this.pages = pages;
 *             return this;
 *         }
 *
 *         // Собираем готовый объект Book
 *         public Book build() {
 *             return new Book(this);
 *         }
 *     }
 *
 *     @Override
 *     public String toString() {
 *         // Формат вывода строго по условию
 *         return "Book: " + bookTitle + ", " + pageCount + " pages.";
 *     }
 * }
 */