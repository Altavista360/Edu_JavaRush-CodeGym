/*
 * Authors: JavaRush's team, CodeGym's team, Altavista360
 * Version: 1.0.0
 */

/*
 * // JavaRush
 * Задача: Приоритет логических операторов 🌴
 * Ссылка: https://javarush.com/tasks/ru.javarush.java.core.level03.task13
 */

/*
 * // CodeGym
 * Task: Precedence of logical operators 🌴
 * Link: https://codegym.cc/tasks/en.codegym.java.core.level03.task13
 */

/*
 * // JavaRush
 * Условие:
 * Представьте, что вы планируете отпуск и выбираете, куда поехать: в горы ⛰️ или на море 🏖️.
 * Объявите три переменные типа boolean:
 * • toTheSea (присвойте ей значение true)
 * • hasPlaneTickets (присвойте ей значение false)
 * • hasHotelRooms (присвойте ей значение true)
 * Для успешного отпуска вам нужно, чтобы было либо «море», либо «билеты на самолет и места в отеле».
 * Создайте выражение boolean vacationHappened = toTheSea || hasPlaneTickets && hasHotelRooms; и выведите его результат на экран.
 */

/*
 * // JavaRush
 * Требования:
 * • В программе должны быть объявлены три переменные типа boolean: toTheSea, hasPlaneTickets и hasHotelRooms.
 * • Переменной toTheSea должно быть присвоено значение true, hasPlaneTickets — значение false, hasHotelRooms — значение true.
 * • Должно быть создано логическое выражение vacationHappened, использующее переменные и операторы || и &&: vacationHappened = toTheSea || hasPlaneTickets && hasHotelRooms.
 * • В выражении vacationHappened необходимо использовать операторы без дополнительных скобок, чтобы продемонстрировать приоритет операторов && над ||.
 * • Значение переменной vacationHappened должно быть выведено на экран.
 */

/*
 * // JavaRush
 * Черновик:
 * package ru.javarush.java.core.level03.task13;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Объявляем исходные булевы переменные
 *
 *
 *         // Важно: оператор && имеет более высокий приоритет, чем ||
 *         // Поэтому сначала вычисляется (hasPlaneTickets && hasHotelRooms), затем результат объединяется с toTheSea через ||
 *
 *
 *         // Выводим результат на экран
 *
 *     }
 * }
 */

// JavaRush
package ru.javarush.java.core.level03.task13;

public class Solution {
    public static void main(String[] args) {
        // Объявляем исходные булевы переменные
        boolean toTheSea = true;
        boolean hasPlaneTickets = false;
        boolean hasHotelRooms = true;

        // Важно: оператор && имеет более высокий приоритет, чем ||
        // Поэтому сначала вычисляется (hasPlaneTickets && hasHotelRooms), затем результат объединяется с toTheSea через ||
        boolean vacationHappened = toTheSea || hasPlaneTickets && hasHotelRooms;

        // Выводим результат на экран
        System.out.println(vacationHappened);
    }
}

/*
 * // JavaRush
 * Правильное решение:
 * // Author: JavaRush's team
 * package ru.javarush.java.core.level03.task13;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Объявляем исходные булевы переменные
 *         boolean toTheSea = true;
 *         boolean hasPlaneTickets = false;
 *         boolean hasHotelRooms = true;
 *
 *         // Важно: оператор && имеет более высокий приоритет, чем ||
 *         // Поэтому сначала вычисляется (hasPlaneTickets && hasHotelRooms), затем результат объединяется с toTheSea через ||
 *         boolean vacationHappened = toTheSea || hasPlaneTickets && hasHotelRooms;
 *
 *         // Выводим результат на экран
 *         System.out.println(vacationHappened);
 *     }
 * }
 */