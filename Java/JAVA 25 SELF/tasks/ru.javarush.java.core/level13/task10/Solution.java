/*
 * Authors: JavaRush's team, CodeGym's team, Altavista360
 * Version: 1.0.0
 */

/*
 * // JavaRush
 * Задача: Международная конференция: фиксация события в часовом поясе 🌐
 * Ссылка: https://javarush.com/tasks/ru.javarush.java.core.level13.task10
 */

/*
 * // CodeGym
 * Task: International conference: fixing the event in a time zone 🌐
 * Link: https://codegym.cc/tasks/en.codegym.java.core.level13.task10
 */

/*
 * // JavaRush
 * Условие:
 * Вы планируете важную международную конференцию. Основное событие, conferenceStartLocal, запланировано на 1 июня 2025 года, 14:00. Это просто "локальное" время, но для координации вам нужно привязать его к конкретному часовому поясу — "Europe/Berlin".
 * Ваша задача — преобразовать conferenceStartLocal в conferenceStartBerlinZoned типа ZonedDateTime с учетом этой зоны. Выведите conferenceStartBerlinZoned на экран, чтобы подтвердить, что время события теперь четко определено в пространстве и времени.
 */

/*
 * // JavaRush
 * Требования:
 * • Необходимо создать объект LocalDateTime, соответствующий дате и времени 1 июня 2025 года, 14:00.
 * • Нужно преобразовать локальное время conferenceStartLocal в ZonedDateTime, используя зону "Europe/Berlin".
 * • conferenceStartBerlinZoned должен иметь тип ZonedDateTime.
 * • Полученное значение conferenceStartBerlinZoned должно быть выведено на экран для проверки результата.
 */

/*
 * // JavaRush
 * Черновик:
 * package ru.javarush.java.core.level13.task10;
 *
 * import java.time.LocalDateTime;
 * import java.time.ZoneId;
 * import java.time.ZonedDateTime;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // 1. Создаем "локальное" время без привязки к часовой зоне:
 *         // 1 июня 2025 года, 14:00
 *
 *
 *         // 2. Выбираем часовую зону Europe/Berlin
 *
 *
 *         // 3. Привязываем локальное время к выбранной зоне, получаем ZonedDateTime
 *
 *
 *         // 4. Выводим результат для проверки (например: 2025-06-01T14:00+03:00[Europe/Berlin])
 *
 *     }
 * }
 */

// JavaRush
package ru.javarush.java.core.level13.task10;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Solution {
    public static void main(String[] args) {
        // 1. Создаем "локальное" время без привязки к часовой зоне:
        // 1 июня 2025 года, 14:00
        LocalDateTime conferenceStartLocal = LocalDateTime.of(2025, 6, 1, 14, 0);

        // 2. Выбираем часовую зону Europe/Berlin
        ZoneId berlinZone = ZoneId.of("Europe/Berlin");

        // 3. Привязываем локальное время к выбранной зоне, получаем ZonedDateTime
        ZonedDateTime conferenceStartBerlinZoned = conferenceStartLocal.atZone(berlinZone);

        // 4. Выводим результат для проверки (например: 2025-06-01T14:00+03:00[Europe/Berlin])
        System.out.println(conferenceStartBerlinZoned);
    }
}

/*
 * // JavaRush
 * Правильное решение:
 * // Author: JavaRush's team
 * package ru.javarush.java.core.level13.task10;
 *
 * import java.time.LocalDateTime;
 * import java.time.ZoneId;
 * import java.time.ZonedDateTime;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // 1. Создаем "локальное" время без привязки к часовой зоне:
 *         // 1 июня 2025 года, 14:00
 *         LocalDateTime conferenceStartLocal = LocalDateTime.of(2025, 6, 1, 14, 0);
 *
 *         // 2. Выбираем часовую зону Europe/Berlin
 *         ZoneId berlinZone = ZoneId.of("Europe/Berlin");
 *
 *         // 3. Привязываем локальное время к выбранной зоне, получаем ZonedDateTime
 *         ZonedDateTime conferenceStartBerlinZoned = conferenceStartLocal.atZone(berlinZone);
 *
 *         // 4. Выводим результат для проверки (например: 2025-06-01T14:00+03:00[Europe/Berlin])
 *         System.out.println(conferenceStartBerlinZoned);
 *     }
 * }
 */