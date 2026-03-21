/*
 * Authors: JavaRush's team, CodeGym's team, Altavista360
 * Version: 1.0.0
 */

/*
 * // JavaRush
 * Задача: Расписание встреч: кто раньше? ⏰
 * Ссылка: https://javarush.com/tasks/ru.javarush.java.core.level13.task07
 */

/*
 * // CodeGym
 * Task: Meeting schedule: who is earlier? ⏰
 * Link: https://codegym.cc/tasks/en.codegym.java.core.level13.task07
 */

/*
 * // JavaRush
 * Условие:
 * Вы — секретарь, управляющий очень плотным расписанием. У вас есть две встречи: morningMeeting в "8:00" и afternoonPresentation в "14:30".
 * Вам нужно быстро определить, действительно ли morningMeeting запланирована раньше, чем afternoonPresentation.
 * Создайте два объекта LocalTime для этих встреч. Используя специальный метод сравнения, проверьте их порядок.
 * Если morningMeeting действительно раньше, выведите на экран "8:00 раньше 14:30". В противном случае сообщите: "8:00 не раньше 14:30".
 */

/*
 * // JavaRush
 * Требования:
 * • В программе должны быть созданы два объекта LocalTime: один для времени 8:00, другой для времени 14:30.
 * • Объект для 8:00 должен называться morningMeeting, а для 14:30 — afternoonPresentation.
 * • Для определения порядка встреч должен быть использован специальный метод сравнения времени из класса LocalTime (например, isBefore или compareTo).
 * • Если morningMeeting действительно раньше afternoonPresentation, программа должна вывести "8:00 раньше 14:30".
 * • Если morningMeeting не раньше afternoonPresentation, программа должна вывести "8:00 не раньше 14:30".
 */

/*
 * // JavaRush
 * Черновик:
 * package ru.javarush.java.core.level13.task07;
 *
 * import java.time.LocalTime;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Создаем два объекта времени: утренняя встреча и дневная презентация
 *
 *
 *         // Сравниваем времена с помощью специализированного метода isBefore
 *
 *     }
 * }
 */

// JavaRush
package ru.javarush.java.core.level13.task07;

import java.time.LocalTime;

public class Solution {
    public static void main(String[] args) {
        // Создаем два объекта времени: утренняя встреча и дневная презентация
        LocalTime morningMeeting = LocalTime.of(8, 0);
        LocalTime afternoonPresentation = LocalTime.of(14, 30);

        // Сравниваем времена с помощью специализированного метода isBefore
        if (morningMeeting.isBefore(afternoonPresentation)) {
            System.out.println("8:00 раньше 14:30");
        } else {
            System.out.println("8:00 не раньше 14:30");
        }
    }
}

/*
 * // JavaRush
 * Правильное решение:
 * // Author: JavaRush's team
 * package ru.javarush.java.core.level13.task07;
 *
 * import java.time.LocalTime;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Создаем два объекта времени: утренняя встреча и дневная презентация
 *         LocalTime morningMeeting = LocalTime.of(8, 0);
 *         LocalTime afternoonPresentation = LocalTime.of(14, 30);
 *
 *         // Сравниваем времена с помощью специализированного метода isBefore
 *         if (morningMeeting.isBefore(afternoonPresentation)) {
 *             System.out.println("8:00 раньше 14:30");
 *         } else {
 *             System.out.println("8:00 не раньше 14:30");
 *         }
 *     }
 * }
 */