/*
 * Authors: JavaRush's team, CodeGym's team, Altavista360
 * Version: 1.0.0
 */

/*
 * // JavaRush
 * Задача: Фундаментальные константы для расчётов ⚛️
 * Ссылка: https://javarush.com/tasks/ru.javarush.java.core.level15.task16
 */

/*
 * // CodeGym
 * Task: Fundamental constants for calculations ⚛️
 * Link: https://codegym.cc/tasks/en.codegym.java.core.level15.task16
 */

/*
 * // JavaRush
 * Условие:
 * Вы создаёте вспомогательную библиотеку, которая будет содержать общеизвестные, фундаментальные константы, используемые в математике и календаре. Эти значения должны быть легко доступны из любой части вашей программы и, конечно же, не должны изменяться.
 * Создайте класс GlobalConstants. Внутри него объявите два публичных статических final поля:
 * • MATH_PI типа double, которому присвойте значение 3.14159.
 * • CALENDAR_DAYS_IN_YEAR типа int, которому присвойте значение 365.
 * Эти поля являются константами, поэтому их имена должны быть написаны в верхнем регистре с использованием подчёркиваний.
 * В классе Solution выведите на экран значения обеих констант, обратившись к ним напрямую через имя класса GlobalConstants. Это продемонстрирует, как можно удобно и безопасно использовать фиксированные, глобальные значения в вашем приложении.
 */

/*
 * // JavaRush
 * Требования:
 * • Необходимо создать отдельный класс с именем GlobalConstants.
 * • В классе GlobalConstants должно быть объявлено два поля с модификаторами public static final.
 * • Поле MATH_PI должно быть типа double и иметь значение 3.14159, а поле CALENDAR_DAYS_IN_YEAR должно быть типа int и иметь значение 365.
 * • Названия обоих полей должны быть написаны заглавными буквами с использованием подчёркиваний (например, MATH_PI).
 * • В классе Solution необходимо вывести значения обеих констант, обратившись к ним через имя класса GlobalConstants (например, GlobalConstants.MATH_PI).
 */

// JavaRush
package ru.javarush.java.core.level15.task16;

public class GlobalConstants {
    public static final double MATH_PI = 3.14159;

    public static final int CALENDAR_DAYS_IN_YEAR = 365;

    private GlobalConstants() {

    }
}

/*
 * // JavaRush
 * Правильное решение:
 * // Author: JavaRush's team
 * package ru.javarush.java.core.level15.task16;
 *
 * // Вспомогательный класс с глобальными константами
 * public class GlobalConstants {
 *
 *     // Константа числа Пи (для простых математических расчётов)
 *     public static final double MATH_PI = 3.14159;
 *
 *     // Количество дней в невисокосном году (календарная константа)
 *     public static final int CALENDAR_DAYS_IN_YEAR = 365;
 *
 *     private GlobalConstants() {
 *         // Приватный конструктор запрещает создание экземпляров этого класса
 *     }
 * }
 */