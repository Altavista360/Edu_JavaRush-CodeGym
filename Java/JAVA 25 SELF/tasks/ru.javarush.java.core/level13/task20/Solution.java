/*
 * Authors: JavaRush's team, CodeGym's team, Altavista360
 * Version: 1.0.0
 */

/*
 * // JavaRush
 * Задача: Агентство недвижимости: расчет возраста здания 🏡
 * Ссылка: https://javarush.com/tasks/ru.javarush.java.core.level13.task20
 */

/*
 * // CodeGym
 * Task: Real Estate Agency: Building Age Calculation 🏡
 * Link: https://codegym.cc/tasks/en.codegym.java.core.level13.task20
 */

/*
 * // JavaRush
 * Условие:
 * Вы работаете в агентстве недвижимости и вам нужно точно определить возраст здания, зная только его constructionDate (20 марта 2000 года) и today (текущую дату).
 * Используя мощный класс Period, вычислите buildingAgePeriod, то есть, сколько полных years, months и days прошло с момента постройки до сегодняшнего дня.
 * Выведите buildingAgePeriod на экран в понятном формате: "Возраст: X лет, Y месяцев, Z дней".
 */

/*
 * // JavaRush
 * Требования:
 * • Необходимо использовать класс Period для вычисления разницы между датами.
 * • Дата постройки здания (constructionDate) и текущая дата (today) должны быть представлены объектами LocalDate.
 * • Возраст здания должен определяться как полное количество лет, месяцев и дней между датой постройки и текущей датой.
 * • Результат должен быть выведен на экран в формате: "Возраст: X лет, Y месяцев, Z дней", где X, Y, Z — соответствующие значения из объекта Period.
 */

/*
 * // JavaRush
 * Черновик:
 * package ru.javarush.java.core.level13.task20;
 *
 * import java.time.LocalDate;
 * import java.time.Period;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Создаем объект LocalDate для даты постройки здания: 20 марта 2000 года
 *
 *
 *         // Получаем текущую дату
 *
 *
 *         // Вычисляем полный период между датой постройки и сегодняшним днем
 *
 *
 *         // Форматируем и выводим результат в формате "Возраст: X лет, Y месяцев, Z дней"
 *
 *     }
 * }
 */

// JavaRush
package ru.javarush.java.core.level13.task20;

import java.time.LocalDate;
import java.time.Period;

public class Solution {
    public static void main(String[] args) {
        // Создаем объект LocalDate для даты постройки здания: 20 марта 2000 года
        LocalDate constructionDate = LocalDate.of(2000, 3, 20);

        // Получаем текущую дату
        LocalDate foo = LocalDate.now();

        // Вычисляем полный период между датой постройки и сегодняшним днем
        Period bar = Period.between(constructionDate, foo);

        // Форматируем и выводим результат в формате "Возраст: X лет, Y месяцев, Z дней"
        System.out.println("Возраст: "
            + bar.getYears() + " лет, "
            + bar.getMonths() + " месяцев, "
            + bar.getDays() + " дней"
        );
    }
}

/*
 * // JavaRush
 * Правильное решение:
 * // Author: JavaRush's team
 * package ru.javarush.java.core.level13.task20;
 *
 * import java.time.LocalDate;
 * import java.time.Period;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Создаем объект LocalDate для даты постройки здания: 20 марта 2000 года
 *         LocalDate constructionDate = LocalDate.of(2000, 3, 20);
 *
 *         // Получаем текущую дату
 *         LocalDate today = LocalDate.now();
 *
 *         // Вычисляем полный период между датой постройки и сегодняшним днем
 *         Period buildingAgePeriod = Period.between(constructionDate, today);
 *
 *         // Форматируем и выводим результат в формате "Возраст: X лет, Y месяцев, Z дней"
 *         System.out.println("Возраст: "
 *             + buildingAgePeriod.getYears() + " лет, "
 *             + buildingAgePeriod.getMonths() + " месяцев, "
 *             + buildingAgePeriod.getDays() + " дней"
 *         );
 *     }
 * }
 */