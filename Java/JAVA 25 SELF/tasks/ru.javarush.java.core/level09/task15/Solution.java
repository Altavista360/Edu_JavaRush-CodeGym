/*
 * Authors: JavaRush's team, CodeGym's team, Altavista360
 * Version: 1.0.0
 */

/*
 * // JavaRush
 * Задача: Лексикографическое сравнение строк
 * Ссылка: https://javarush.com/tasks/ru.javarush.java.core.level09.task15
 */

/*
 * // CodeGym
 * Task: Lexicographic string comparison
 * Link: https://codegym.cc/tasks/en.codegym.java.core.level09.task15
 */

/*
 * // JavaRush
 * Условие:
 * Представьте, что вы — библиотекарь, который расставляет книги на полках по алфавиту, или специалист по логистике, сортирующий товары. Чтобы правильно расположить элементы, вам нужно уметь определять, какая строка "больше" или "меньше" другой в лексикографическом (словарном) порядке. Важно знать, что идёт "до", а что "после".
 * Объявите две переменные типа String: одна пусть будет "apple", другая — "banana". Используйте метод compareTo() для их сравнения и выведите полученное число на экран. Это число покажет вам, какая строка "раньше" в алфавитном порядке. Затем поменяйте местами значения этих переменных и снова выполните то же сравнение, чтобы увидеть, как меняется результат. Это поможет вам понять внутренний механизм сортировки строк.
 */

/*
 * // JavaRush
 * Требования:
 * • В программе должны быть объявлены две переменные типа String с начальными значениями "apple" и "banana".
 * • Для сравнения двух строк необходимо использовать метод compareTo().
 * • Результат работы метода compareTo() должен быть выведен на экран.
 * • После первого сравнения значения переменных должны быть поменяны местами, и сравнение должно быть выполнено повторно с последующим выводом результата.
 */

/*
 * // JavaRush
 * Черновик:
 * package ru.javarush.java.core.level09.task15;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Объявляем две строковые переменные с начальными значениями
 *         String first = "apple";
 *         String second = "banana";
 *
 *         // Сравниваем строки лексикографически:
 *
 *
 *         // Меняем значения переменных местами
 *
 *
 *         // Повторяем сравнение после обмена
 *
 *     }
 * }
 */

// JavaRush
package ru.javarush.java.core.level09.task15;

public class Solution {
    public static void main(String[] args) {
        // Объявляем две строковые переменные с начальными значениями
        String first = "apple";
        String second = "banana";

        // Сравниваем строки лексикографически:
        int foo = first.compareTo(second);
        System.out.println(foo);

        // Меняем значения переменных местами
        String bar = first;
        first = second;
        second = bar;

        // Повторяем сравнение после обмена
        int baz = first.compareTo(second);
        System.out.println(baz);
    }
}

/*
 * // JavaRush
 * Правильное решение:
 * // Author: JavaRush's team
 * package ru.javarush.java.core.level09.task15;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Объявляем две строковые переменные с начальными значениями
 *         String first = "apple";
 *         String second = "banana";
 *
 *         // Сравниваем строки лексикографически:
 *         int result1 = first.compareTo(second);
 *         System.out.println(result1);
 *
 *         // Меняем значения переменных местами
 *         String temp = first;
 *         first = second;
 *         second = temp;
 *
 *         // Повторяем сравнение после обмена
 *         int result2 = first.compareTo(second);
 *         System.out.println(result2);
 *     }
 * }
 */