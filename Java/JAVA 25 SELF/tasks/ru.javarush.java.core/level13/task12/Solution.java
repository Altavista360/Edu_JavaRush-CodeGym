/*
 * Authors: JavaRush's team, CodeGym's team, Altavista360
 * Version: 1.0.0
 */

/*
 * // JavaRush
 * Задача: Хроники времени: путешествие через Instant 🌌
 * Ссылка: https://javarush.com/tasks/ru.javarush.java.core.level13.task12
 */

/*
 * // CodeGym
 * Task: Chronicles of Time: a journey through Instant 🌌
 * Link: https://codegym.cc/tasks/en.codegym.java.core.level13.task12
 */

/*
 * // JavaRush
 * Условие:
 * Вы создаете универсальную систему хроник, которая должна работать с абсолютным временем. Начните с создания originalEventTime — ZonedDateTime объекта для 1 июня 2025 года, 12:00 в зоне "Europe/Berlin".
 * Затем преобразуйте этот originalEventTime в universalInstant — абсолютное, независимое от часового пояса мгновение.
 * Наконец, возьмите universalInstant и переведите его обратно в ZonedDateTime, но уже для зоны "Asia/Tokyo", получив eventTimeTokyoZoned.
 * Выведите на экран все три значения: originalEventTime, universalInstant и eventTimeTokyoZoned, чтобы продемонстрировать, как момент существует во всех своих проявлениях.
 */

/*
 * // JavaRush
 * Требования:
 * • Программа должна создать объект originalEventTime типа ZonedDateTime, представляющий 1 июня 2025 года, 12:00 в зоне "Europe/Berlin".
 * • Программа должна преобразовать originalEventTime в объект universalInstant типа Instant.
 * • Программа должна создать объект eventTimeTokyoZoned типа ZonedDateTime, представляющий тот же момент времени universalInstant, но в зоне "Asia/Tokyo".
 * • Программа должна вывести на экран значения originalEventTime, universalInstant и eventTimeTokyoZoned.
 */

/*
 * // JavaRush
 * Черновик:
 * package ru.javarush.java.core.level13.task12;
 *
 * import java.time.Instant;
 * import java.time.ZoneId;
 * import java.time.ZonedDateTime;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // 1) Создаем ZonedDateTime для 1 июня 2025 года, 12:00 в зоне Europe/Berlin
 *
 *
 *         // 2) Преобразуем ZonedDateTime в абсолютное мгновение Instant (UTC, часовой пояс не влияет)
 *
 *
 *         // 3) Тот же самый Instant отображаем как локальное время для зоны Asia/Tokyo
 *
 *
 *         // 4) Выводим все три значения
 *
 *     }
 * }
 */

// JavaRush
package ru.javarush.java.core.level13.task12;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Solution {
    public static void main(String[] args) {
        // 1) Создаем ZonedDateTime для 1 июня 2025 года, 12:00 в зоне Europe/Berlin
        ZoneId berlin = ZoneId.of("Europe/Berlin");
        ZonedDateTime originalEventTime = ZonedDateTime.of(2025, 6, 1, 12, 0, 0, 0, berlin);

        // 2) Преобразуем ZonedDateTime в абсолютное мгновение Instant (UTC, часовой пояс не влияет)
        Instant universalInstant = originalEventTime.toInstant();

        // 3) Тот же самый Instant отображаем как локальное время для зоны Asia/Tokyo
        ZoneId tokyo = ZoneId.of("Asia/Tokyo");
        ZonedDateTime eventTimeTokyoZoned = ZonedDateTime.ofInstant(universalInstant, tokyo);

        // 4) Выводим все три значения
        System.out.println(originalEventTime);
        System.out.println(universalInstant);
        System.out.println(eventTimeTokyoZoned);
    }
}

/*
 * // JavaRush
 * Правильное решение:
 * // Author: JavaRush's team
 * package ru.javarush.java.core.level13.task12;
 *
 * import java.time.Instant;
 * import java.time.ZoneId;
 * import java.time.ZonedDateTime;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // 1) Создаем ZonedDateTime для 1 июня 2025 года, 12:00 в зоне Europe/Berlin
 *         ZoneId berlin = ZoneId.of("Europe/Berlin");
 *         ZonedDateTime originalEventTime = ZonedDateTime.of(2025, 6, 1, 12, 0, 0, 0, berlin);
 *
 *         // 2) Преобразуем ZonedDateTime в абсолютное мгновение Instant (UTC, часовой пояс не влияет)
 *         Instant universalInstant = originalEventTime.toInstant();
 *
 *         // 3) Тот же самый Instant отображаем как локальное время для зоны Asia/Tokyo
 *         ZoneId tokyo = ZoneId.of("Asia/Tokyo");
 *         ZonedDateTime eventTimeTokyoZoned = ZonedDateTime.ofInstant(universalInstant, tokyo);
 *
 *         // 4) Выводим все три значения
 *         System.out.println(originalEventTime);
 *         System.out.println(universalInstant);
 *         System.out.println(eventTimeTokyoZoned);
 *     }
 * }
 */