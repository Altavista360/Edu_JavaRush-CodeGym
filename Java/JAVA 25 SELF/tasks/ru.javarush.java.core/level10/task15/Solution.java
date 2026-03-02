/*
 * Authors: JavaRush's team, CodeGym's team, Altavista360
 * Version: 1.0.0
 */

/*
 * // JavaRush
 * Задача: Планирование недели в приложении 🗓️
 * Ссылка: https://javarush.com/tasks/ru.javarush.java.core.level10.task15
 */

/*
 * // CodeGym
 * Task: Weekly planning in the app 🗓️
 * Link: https://codegym.cc/tasks/en.codegym.java.core.level10.task15
 */

/*
 * // JavaRush
 * Условие:
 * Вы создаёте планировщик задач, и вам нужно вывести все дни недели, чтобы пользователь мог выбрать, на какой день запланировать задачу.
 * Объявите перечисление DayOfWeek с семью значениями, представляющими каждый день недели: MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY. В методе main вашей программы, используя цикл, пройдитесь по всем возможным значениям перечисления DayOfWeek и выведите каждое из них на экран с новой строки. Это позволит пользователю увидеть полный список доступных дней.
 */

/*
 * // JavaRush
 * Требования:
 * • В программе должно быть объявлено перечисление (enum) с именем DayOfWeek.
 * • Перечисление DayOfWeek должно содержать ровно семь значений: MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY.
 * • В методе main программы необходимо с помощью цикла пройтись по всем значениям перечисления DayOfWeek.
 * • Каждое значение перечисления DayOfWeek должно быть выведено на экран с новой строки.
 */

/*
 * // JavaRush
 * Черновик:
 * package ru.javarush.java.core.level10.task15;
 *
 * // Перечисление дней недели: каждое значение — отдельный день.
 *
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Используем цикл for-each для перебора всех значений перечисления DayOfWeek
 *
 *     }
 * }
 */

// JavaRush
package ru.javarush.java.core.level10.task15;

// Перечисление дней недели: каждое значение — отдельный день.
enum DayOfWeek {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

public class Solution {
    public static void main(String[] args) {
        // Используем цикл for-each для перебора всех значений перечисления DayOfWeek
        for (DayOfWeek day : DayOfWeek.values()) {
            System.out.println(day);
        }
    }
}

/*
 * // JavaRush
 * Правильное решение:
 * // Author: JavaRush's team
 * package ru.javarush.java.core.level10.task15;
 *
 * // Перечисление дней недели: каждое значение — отдельный день.
 * enum DayOfWeek {
 *     MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
 * }
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Используем цикл for-each для перебора всех значений перечисления DayOfWeek
 *         for (DayOfWeek day : DayOfWeek.values()) {
 *             System.out.println(day);
 *         }
 *     }
 * }
 */