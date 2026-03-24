/*
 * Authors: JavaRush's team, CodeGym's team, Altavista360
 * Version: 1.0.0
 */

/*
 * // JavaRush
 * Задача: Перемещение телепортации: одно событие в разных часовых поясах 🚀
 * Ссылка: https://javarush.com/tasks/ru.javarush.java.core.level13.task11
 */

/*
 * // CodeGym
 * Task: Teleportation Relocation: One Event Across Time Zones 🚀
 * Link: https://codegym.cc/tasks/en.codegym.java.core.level13.task11
 */

/*
 * // JavaRush
 * Условие:
 * Вы управляете системой глобальных телепортаций. Одна из них назначена на teleportScheduledLocal — 1 июня 2025 года, 18:00.
 * Сначала точно определите это событие в часовом поясе "Europe/Berlin", создав teleportTimeBerlinZoned.
 * Теперь самое интересное: вам нужно узнать, когда именно это же самое событие произойдет для тех, кто находится в "America/New_York", то есть получить teleportTimeNewYorkZoned. Используйте метод withZoneSameInstant для точного преобразования.
 * Выведите на экран оба значения: teleportTimeBerlinZoned и teleportTimeNewYorkZoned, чтобы показать, как одно и то же мгновение выглядит в разных уголках мира.
 */

/*
 * // JavaRush
 * Требования:
 * • Необходимо создать объект LocalDateTime с датой и временем 1 июня 2025 года, 18:00.
 * • Необходимо получить объект ZoneId, соответствующий часовому поясу "Europe/Berlin".
 * • На основе локального времени и часового пояса "Europe/Berlin" необходимо создать объект ZonedDateTime и сохранить его в переменную teleportTimeBerlinZoned.
 * • Используя метод withZoneSameInstant, необходимо получить объект ZonedDateTime, соответствующий тому же моменту времени, но в часовом поясе "America/New_York", и сохранить его в переменную teleportTimeNewYorkZoned.
 * • Необходимо вывести на экран значения переменных teleportTimeBerlinZoned и teleportTimeNewYorkZoned.
 */

/*
 * // JavaRush
 * Черновик:
 * package ru.javarush.java.core.level13.task11;
 *
 * import java.time.LocalDateTime;
 * import java.time.ZoneId;
 * import java.time.ZonedDateTime;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Локальная дата-время телепорта (без привязки к часовому поясу)
 *
 *
 *         // Часовой пояс Берлина
 *
 *
 *         // Привязываем локальное время к Берлину — получаем конкретное мгновение
 *
 *
 *         // Переводим то же самое мгновение в часовой пояс Нью-Йорка
 *
 *
 *         // Выводим оба значения, чтобы увидеть разницу представлений одного мгновения
 *
 *     }
 * }
 */

// JavaRush
package ru.javarush.java.core.level13.task11;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Solution {
    public static void main(String[] args) {
        // Локальная дата-время телепорта (без привязки к часовому поясу)
        LocalDateTime teleportScheduledLocal = LocalDateTime.of(2025, 6, 1, 18, 0);

        // Часовой пояс Берлина
        ZoneId berlinZone = ZoneId.of("Europe/Berlin");

        // Привязываем локальное время к Берлину — получаем конкретное мгновение
        ZonedDateTime teleportTimeBerlinZoned = teleportScheduledLocal.atZone(berlinZone);

        // Переводим то же самое мгновение в часовой пояс Нью-Йорка
        ZoneId newYorkZone = ZoneId.of("America/New_York");
        ZonedDateTime teleportTimeNewYorkZoned = teleportTimeBerlinZoned.withZoneSameInstant(newYorkZone);

        // Выводим оба значения, чтобы увидеть разницу представлений одного мгновения
        System.out.println(teleportTimeBerlinZoned);
        System.out.println(teleportTimeNewYorkZoned);
    }
}

/*
 * // JavaRush
 * Правильное решение:
 * // Author: JavaRush's team
 * package ru.javarush.java.core.level13.task11;
 *
 * import java.time.LocalDateTime;
 * import java.time.ZoneId;
 * import java.time.ZonedDateTime;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Локальная дата-время телепорта (без привязки к часовому поясу)
 *         LocalDateTime teleportScheduledLocal = LocalDateTime.of(2025, 6, 1, 18, 0);
 *
 *         // Часовой пояс Берлина
 *         ZoneId berlinZone = ZoneId.of("Europe/Berlin");
 *
 *         // Привязываем локальное время к Берлину — получаем конкретное мгновение
 *         ZonedDateTime teleportTimeBerlinZoned = teleportScheduledLocal.atZone(berlinZone);
 *
 *         // Переводим то же самое мгновение в часовой пояс Нью-Йорка
 *         ZoneId newYorkZone = ZoneId.of("America/New_York");
 *         ZonedDateTime teleportTimeNewYorkZoned = teleportTimeBerlinZoned.withZoneSameInstant(newYorkZone);
 *
 *         // Выводим оба значения, чтобы увидеть разницу представлений одного мгновения
 *         System.out.println(teleportTimeBerlinZoned);
 *         System.out.println(teleportTimeNewYorkZoned);
 *     }
 * }
 */