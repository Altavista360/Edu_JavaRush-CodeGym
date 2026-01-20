/*
 * Authors: JavaRush's team, CodeGym's team, Altavista360
 * Version: 1.0.0
 */

/*
 * // JavaRush
 * Задача: Номер рейса ✈️
 * Ссылка: https://javarush.com/tasks/ru.javarush.java.core.level02.task10
 */

/*
 * // CodeGym
 * Task: Flight number ✈️
 * Link: https://codegym.cc/tasks/en.codegym.java.core.level02.task10
 */

/*
 * // JavaRush
 * Условие:
 * Вы пишете программу для отслеживания рейсов. Создайте переменную типа int с любым номером рейса и переменную типа String с городом назначения. Объедините их с помощью оператора +, чтобы получить полную строку, например, "Рейс 123 до Минска", и выведите её на экран.
 */

/*
 * // JavaRush
 * Требования:
 * • В программе должна быть объявлена переменная типа int для хранения номера рейса.
 * • В программе должна быть объявлена переменная типа String для хранения города назначения.
 * • Номер рейса и город назначения должны быть объединены в одну строку с помощью оператора +.
 * • Итоговая строка должна иметь формат "Рейс [номер] до [город]", где [номер] — значение переменной int, а [город] — значение переменной String.
 * • Результирующая строка должна быть выведена на экран с помощью System.out.println.
 */

/*
 * // JavaRush
 * Черновик:
 * package ru.javarush.java.core.level02.task10;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Объявляем переменную типа int для хранения номера рейса
 *
 *
 *         // Объявляем переменную типа String для хранения города назначения
 *
 *
 *         // Объединяем номер рейса и город назначения в одну строку с помощью оператора +
 *
 *
 *         // Выводим итоговую строку на экран
 *
 *     }
 * }
 */

// JavaRush
package ru.javarush.java.core.level02.task10;

public class Solution {
    public static void main(String[] args) {
        // Объявляем переменную типа int для хранения номера рейса
        int foo = 8192;

        // Объявляем переменную типа String для хранения города назначения
        String bar = "Минск";

        // Объединяем номер рейса и город назначения в одну строку с помощью оператора +
        String str = "Рейс " + foo + " до " + bar;

        // Выводим итоговую строку на экран
        System.out.println(str);
    }
}

/*
 * // JavaRush
 * Правильное решение:
 * // Author: JavaRush's team
 * package ru.javarush.java.core.level02.task10;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Объявляем переменную типа int для хранения номера рейса
 *         int flightNumber = 123;
 *
 *         // Объявляем переменную типа String для хранения города назначения
 *         String destinationCity = "Минск";
 *
 *         // Объединяем номер рейса и город назначения в одну строку с помощью оператора +
 *         String flightInfo = "Рейс " + flightNumber + " до " + destinationCity;
 *
 *         // Выводим итоговую строку на экран
 *         System.out.println(flightInfo);
 *     }
 * }
 */