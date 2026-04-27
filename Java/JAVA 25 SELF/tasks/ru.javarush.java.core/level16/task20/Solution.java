/*
 * Authors: JavaRush's team, CodeGym's team, Altavista360
 * Version: 1.0.0
 */

/*
 * // JavaRush
 * Задача: Инструментарий разработчика: универсальное эхо 💬
 * Ссылка: https://javarush.com/tasks/ru.javarush.java.core.level16.task20
 */

/*
 * // CodeGym
 * Task: Developer toolkit: universal echo 💬.
 * Link: https://codegym.cc/tasks/en.codegym.java.core.level16.task20
 */

/*
 * // JavaRush
 * Условие:
 * Вы собираете набор универсальных инструментов для программистов. Один из таких инструментов должен уметь просто "повторять" переданные ему данные дважды, будь то текстовая строка, целое число, или любой другой тип. Главное, чтобы он мог это делать для любого типа данных без необходимости писать отдельные методы для каждого из них.
 * Создайте статический класс DevUtils (или добавьте этот метод в существующий). Внутри DevUtils реализуйте универсальный статический метод printTwice. Этот метод должен принимать один параметр любого типа и выводить его два раза, каждый раз на новой строке.
 * В главном методе вашей программы (main) вызовите DevUtils.printTwice("Java"), а затем DevUtils.printTwice(100). Ваша программа должна вывести "Java" дважды, а затем "100" дважды, каждое значение на отдельной строке, демонстрируя универсальность метода.
 */

/*
 * // JavaRush
 * Требования:
 * • Должен быть создан публичный статический класс с именем DevUtils.
 * • В классе DevUtils должен быть реализован публичный статический метод printTwice, который принимает один параметр любого типа.
 * • Метод printTwice должен быть объявлен с использованием дженериков, чтобы принимать параметр любого типа без необходимости перегружать метод для разных типов.
 * • Метод printTwice должен выводить переданный ему объект дважды, каждый раз на новой строке.
 * • В методе main основной программы должны быть вызовы DevUtils.printTwice("Java") и DevUtils.printTwice(100), чтобы продемонстрировать работу метода с разными типами данных.
 * • Результатом работы программы должны быть четыре строки: две строки с "Java" и две строки с "100", каждая на отдельной строке.
 */

/*
 * // JavaRush
 * Черновик:
 * package ru.javarush.java.core.level16.task20;
 *
 * public class Solution {
 *
 *     // Публичный статический (вложенный) класс с утилитарным методом
 *     public static class DevUtils {
 *         // Универсальный метод с дженериком: принимает параметр любого типа T
 *
 *     }
 *
 *     public static void main(String[] args) {
 *         // Демонстрация универсальности: строка и число
 *         DevUtils.printTwice("Java");
 *         DevUtils.printTwice(100);
 *     }
 * }
 */

// JavaRush
package ru.javarush.java.core.level16.task20;

public class Solution {

    // Публичный статический (вложенный) класс с утилитарным методом
    public static class DevUtils {
        // Универсальный метод с дженериком: принимает параметр любого типа T
        public static <T> void printTwice(T value) {
            System.out.println(value);
            System.out.println(value);
        }
    }

    public static void main(String[] args) {
        // Демонстрация универсальности: строка и число
        DevUtils.printTwice("Java");
        DevUtils.printTwice(100);
    }
}

/*
 * // JavaRush
 * Правильное решение:
 * // Author: JavaRush's team
 * package ru.javarush.java.core.level16.task20;
 *
 * public class Solution {
 *
 *     // Публичный статический (вложенный) класс с утилитарным методом
 *     public static class DevUtils {
 *         // Универсальный метод с дженериком: принимает параметр любого типа T
 *         public static <T> void printTwice(T value) {
 *             System.out.println(value);
 *             System.out.println(value);
 *         }
 *     }
 *
 *     public static void main(String[] args) {
 *         // Демонстрация универсальности: строка и число
 *         DevUtils.printTwice("Java");
 *         DevUtils.printTwice(100);
 *     }
 * }
 */