/*
 * Authors: JavaRush's team, CodeGym's team, Altavista360
 * Version: 1.0.0
 */

/*
 * // JavaRush
 * Задача: Глобальный командный центр: время по всему миру 🌍
 * Ссылка: https://javarush.com/tasks/ru.javarush.java.core.level13.task09
 */

/*
 * // CodeGym
 * Task: Global Command Center: World Time 🌍
 * Link: https://codegym.cc/tasks/en.codegym.java.core.level13.task09
 */

/*
 * // JavaRush
 * Условие:
 * Вы разрабатываете главный дисплей для глобального командного центра. Ваша задача — показать текущее время в трех стратегически важных часовых поясах: "Europe/Berlin", "America/New_York" и "Asia/Tokyo".
 * Для каждой из этих зон создайте ZonedDateTime объект, который будет содержать currentTimeInBerlin, currentTimeInNewYork и currentTimeInTokyo соответственно.
 * Убедитесь, что вы выводите каждую зону на отдельной строке, четко указывая название города и соответствующее местное время.
 */

/*
 * // JavaRush
 * Требования:
 * • В программе должны быть использованы объекты ZonedDateTime для представления времени в указанных часовых поясах.
 * • Для каждой временной зоны должно быть получено текущее время с помощью ZonedDateTime.now(ZoneId.of(...)).
 * • Для создания объектов ZonedDateTime должны быть использованы идентификаторы "Europe/Berlin", "America/New_York" и "Asia/Tokyo".
 * • В программе должны быть объявлены переменные currentTimeInBerlin, currentTimeInNewYork и currentTimeInTokyo, каждая из которых содержит ZonedDateTime для соответствующей зоны.
 * • Результат работы программы должен выводить для каждой зоны название города и соответствующее локальное время на отдельной строке.
 * • В выводе должно быть явно указано название города и его локальное время.
 */

/*
 * // JavaRush
 * Черновик:
 * package ru.javarush.java.core.level13.task09;
 *
 * import java.time.ZoneId;
 * import java.time.ZonedDateTime;
 * import java.time.format.DateTimeFormatter;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Получаем текущее время в каждой указанной зоне через ZonedDateTime.now(ZoneId.of(...))
 *
 *
 *         // Простой и наглядный формат даты и времени (локальное время конкретной зоны)
 *
 *
 *         // Выводим каждую зону на отдельной строке: название города + локальное время
 *
 *     }
 * }
 */

// JavaRush
package ru.javarush.java.core.level13.task09;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Solution {
    public static void main(String[] args) {
        // Получаем текущее время в каждой указанной зоне через ZonedDateTime.now(ZoneId.of(...))
        ZonedDateTime currentTimeInBerlin = ZonedDateTime.now(ZoneId.of("Europe/Berlin"));
        ZonedDateTime currentTimeInNewYork = ZonedDateTime.now(ZoneId.of("America/New_York"));
        ZonedDateTime currentTimeInTokyo = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));

        // Простой и наглядный формат даты и времени (локальное время конкретной зоны)
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        // Выводим каждую зону на отдельной строке: название города + локальное время
        System.out.println("Берлин: " + currentTimeInBerlin.format(formatter));
        System.out.println("Нью-Йорк: " + currentTimeInNewYork.format(formatter));
        System.out.println("Токио: " + currentTimeInTokyo.format(formatter));
    }
}

/*
 * // JavaRush
 * Правильное решение:
 * // Author: JavaRush's team
 * package ru.javarush.java.core.level13.task09;
 *
 * import java.time.ZoneId;
 * import java.time.ZonedDateTime;
 * import java.time.format.DateTimeFormatter;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Получаем текущее время в каждой указанной зоне через ZonedDateTime.now(ZoneId.of(...))
 *         ZonedDateTime currentTimeInBerlin = ZonedDateTime.now(ZoneId.of("Europe/Berlin"));
 *         ZonedDateTime currentTimeInNewYork = ZonedDateTime.now(ZoneId.of("America/New_York"));
 *         ZonedDateTime currentTimeInTokyo = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));
 *
 *         // Простой и наглядный формат даты и времени (локальное время конкретной зоны)
 *         DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
 *
 *         // Выводим каждую зону на отдельной строке: название города + локальное время
 *         System.out.println("Берлин: " + currentTimeInBerlin.format(formatter));
 *         System.out.println("Нью-Йорк: " + currentTimeInNewYork.format(formatter));
 *         System.out.println("Токио: " + currentTimeInTokyo.format(formatter));
 *     }
 * }
 */