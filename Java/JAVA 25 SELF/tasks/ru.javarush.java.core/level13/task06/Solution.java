/*
 * Authors: JavaRush's team, CodeGym's team, Altavista360
 * Version: 1.0.0
 */

/*
 * // JavaRush
 * Задача: Астрологический прогноз: день рождения и день недели 🌟
 * Ссылка: https://javarush.com/tasks/ru.javarush.java.core.level13.task06
 */

/*
 * // CodeGym
 * Task: Astrological forecast: Birthday and day of week 🌟
 * Link: https://codegym.cc/tasks/en.codegym.java.core.level13.task06
 */

/*
 * // JavaRush
 * Условие:
 * Для вашего нового астрологического приложения вам нужно определить день недели для конкретной даты рождения.
 * Возьмем для примера userBirthDate: 15 декабря 1990 года.
 * Создайте объект LocalDate для этой даты. Затем ваша задача — выяснить, какой день недели был в этот особенный день, и вывести его на экран.
 */

/*
 * // JavaRush
 * Требования:
 * • В программе должен быть создан объект LocalDate, представляющий 15 декабря 1990 года.
 * • Для работы с датой рождения необходимо использовать класс LocalDate из пакета java.time.
 * • Программа должна определить, какой день недели соответствует заданной дате.
 * • Полученное значение дня недели должно быть выведено на экран.
 */

/*
 * // JavaRush
 * Черновик:
 * package ru.javarush.java.core.level13.task06;
 *
 * import java.time.DayOfWeek;
 * import java.time.LocalDate;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Создаем объект LocalDate для 15 декабря 1990 года
 *
 *
 *         // Получаем день недели для указанной даты
 *
 *
 *         // Выводим день недели на экран
 *
 *     }
 * }
 */

// JavaRush
package ru.javarush.java.core.level13.task06;

import java.time.LocalDate;
import java.time.DayOfWeek;

public class Solution {
    public static void main(String[] args) {
        // Создаем объект LocalDate для 15 декабря 1990 года
        LocalDate userBirthDate = LocalDate.of(1990, 12, 15);

        // Получаем день недели для указанной даты
        DayOfWeek foo = userBirthDate.getDayOfWeek();

        // Выводим день недели на экран
        System.out.println("15 декабря 1990 года был: " + foo);
    }
}

/*
 * // JavaRush
 * Правильное решение:
 * // Author: JavaRush's team
 * package ru.javarush.java.core.level13.task06;
 *
 * import java.time.LocalDate;
 * import java.time.DayOfWeek;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Создаем объект LocalDate для 15 декабря 1990 года
 *         LocalDate userBirthDate = LocalDate.of(1990, 12, 15);
 *
 *         // Получаем день недели для указанной даты
 *         DayOfWeek dayOfWeek = userBirthDate.getDayOfWeek();
 *
 *         // Выводим день недели на экран
 *         System.out.println("День недели для 15 декабря 1990 года: " + dayOfWeek);
 *     }
 * }
 */