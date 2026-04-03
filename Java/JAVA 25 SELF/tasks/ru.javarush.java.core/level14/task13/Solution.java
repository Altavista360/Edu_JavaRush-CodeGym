/*
 * Authors: JavaRush's team, CodeGym's team, Altavista360
 * Version: 1.0.0
 */

/*
 * // JavaRush
 * Задача: Издательство: книга ещё в работе или уже готова к печати
 * Ссылка: https://javarush.com/tasks/ru.javarush.java.core.level14.task13
 */

/*
 * // CodeGym
 * Task: Publishing: a book still in progress or already ready for print
 * Link: https://codegym.cc/tasks/en.codegym.java.core.level14.task13
 */

/*
 * // JavaRush
 * Условие:
 * Представьте, что вы работаете в издательстве, и вам нужно создать систему для учёта новых книг. Иногда к вам приходят книги, у которых пока есть только название, а количество страниц ещё не определено, а иногда — уже полностью готовые рукописи.
 * Ваша задача — спроектировать "форму" для книги, назвав её Book, которая будет содержать название (String bookTitle) и количество страниц (int pageCount).
 * Затем добавьте два "способа регистрации" книги:
 * • Первый способ позволит зарегистрировать книгу, указав только её название, при этом количество страниц по умолчанию будет 0.
 * • Второй способ позволит сразу указать и название, и количество страниц.
 * После того как шаблон будет готов, в вашем главном сценарии "зарегистрируйте" две книги: одну, используя первый способ (только название, например, "Загадочный роман"), и вторую, используя второй способ (с названием, например, "Путешествие по космосу", и указанием 500 страниц).
 * В завершение, убедитесь, что вся информация о книгах корректно отображается, выведя значения их полей на экран.
 */

/*
 * // JavaRush
 * Требования:
 * • Необходимо создать класс с именем Book.
 * • Класс Book должен содержать два поля: String bookTitle и int pageCount.
 * • В классе Book должно быть два конструктора: один принимает только название книги (bookTitle), второй — название и количество страниц (bookTitle и pageCount).
 * • В конструкторе, принимающем только название книги, поле pageCount должно устанавливаться в значение 0.
 * • В главном методе необходимо создать два объекта Book: первый — с помощью конструктора, принимающего только название ("Загадочный роман"), второй — с помощью конструктора, принимающего название и количество страниц ("Путешествие по космосу", 500).
 * • Программа должна вывести значения полей bookTitle и pageCount для обеих созданных книг на экран.
 */

/*
 * // JavaRush
 * Черновик:
 * package ru.javarush.java.core.level14.task13;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Регистрируем книгу, у которой пока есть только название
 *
 *
 *         // Регистрируем книгу с названием и количеством страниц
 *
 *
 *         // Выводим значения полей для обеих книг (по очереди: название, затем количество страниц)
 *
 *     }
 * }
 *
 * // "Форма" для книги: хранит название и количество страниц
 */

// JavaRush
package ru.javarush.java.core.level14.task13;

public class Solution {
    public static void main(String[] args) {
        // Регистрируем книгу, у которой пока есть только название
        Book foo = new Book("Загадочный роман"); // pageCount должен стать 0 по умолчанию

        // Регистрируем книгу с названием и количеством страниц
        Book bar = new Book("Путешествие по космосу", 500);

        // Выводим значения полей для обеих книг (по очереди: название, затем количество страниц)
        System.out.println(foo.bookTitle);
        System.out.println(foo.pageCount);
        System.out.println(bar.bookTitle);
        System.out.println(bar.pageCount);
    }
}

// "Форма" для книги: хранит название и количество страниц
class Book {
    String bookTitle;
    int pageCount;

    Book(String bookTitle) {
        this.bookTitle = bookTitle;
        this.pageCount = 0;
    }

    Book(String bookTitle, int pageCount) {
        this.bookTitle = bookTitle;
        this.pageCount = pageCount;
    }
}

/*
 * // JavaRush
 * Правильное решение:
 * // Author: JavaRush's team
 * package ru.javarush.java.core.level14.task13;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Регистрируем книгу, у которой пока есть только название
 *         Book first = new Book("Загадочный роман"); // pageCount должен стать 0 по умолчанию
 *
 *         // Регистрируем книгу с названием и количеством страниц
 *         Book second = new Book("Путешествие по космосу", 500);
 *
 *         // Выводим значения полей для обеих книг (по очереди: название, затем количество страниц)
 *         System.out.println(first.bookTitle);
 *         System.out.println(first.pageCount);
 *         System.out.println(second.bookTitle);
 *         System.out.println(second.pageCount);
 *     }
 * }
 *
 * // "Форма" для книги: хранит название и количество страниц
 * class Book {
 *     String bookTitle; // название книги
 *     int pageCount;    // количество страниц
 *
 *     // Конструктор: только название, страниц по умолчанию 0
 *     Book(String bookTitle) {
 *         this.bookTitle = bookTitle;
 *         this.pageCount = 0; // значение по умолчанию
 *     }
 *
 *     // Конструктор: название и количество страниц
 *     Book(String bookTitle, int pageCount) {
 *         this.bookTitle = bookTitle;
 *         this.pageCount = pageCount;
 *     }
 * }
 */