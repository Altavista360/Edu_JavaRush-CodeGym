/*
 * Authors: JavaRush's team, CodeGym's team, Altavista360
 * Version: 1.0.0
 */

/*
 * // JavaRush
 * Задача: Корректировка времени секретной миссии 🚀
 * Ссылка: https://javarush.com/tasks/ru.javarush.java.core.level13.task08
 */

/*
 * // CodeGym
 * Task: Secret Mission Time Adjustment 🚀
 * Link: https://codegym.cc/tasks/en.codegym.java.core.level13.task08
 */

/*
 * // JavaRush
 * Условие:
 * Вы планируете тайную операцию. Изначально missionBriefing назначена на 1 июня 2025 года, 14:00. Однако, в последний момент пришло изменение: нужно прибавить 2 часа к этому времени, а затем отнять 30 минут.
 * Создайте объект LocalDateTime для первоначального missionBriefing. Примените необходимые изменения, чтобы получить finalMissionTime. Выведите finalMissionTime на экран, чтобы все агенты знали точное время старта.
 */

/*
 * // JavaRush
 * Требования:
 * • Необходимо создать объект LocalDateTime с датой 1 июня 2025 года и временем 14:00.
 * • К объекту missionBriefing нужно прибавить 2 часа.
 * • К результату предыдущей операции необходимо вычесть 30 минут.
 * • Полученное после всех изменений значение времени должно быть сохранено в переменную finalMissionTime.
 * • Значение переменной finalMissionTime должно быть выведено на экран.
 */

/*
 * // JavaRush
 * Черновик:
 * package ru.javarush.java.core.level13.task08;
 *
 * import java.time.LocalDateTime;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Исходная дата и время брифинга: 1 июня 2025 года, 14:00
 *
 *
 *         // Прибавляем 2 часа, затем вычитаем 30 минут и сохраняем результат.
 *
 *
 *         // Выводим итоговое время старта миссии
 *
 *     }
 * }
 */

// JavaRush
package ru.javarush.java.core.level13.task08;

import java.time.LocalDateTime;

public class Solution {
    public static void main(String[] args) {
        // Исходная дата и время брифинга: 1 июня 2025 года, 14:00
        LocalDateTime missionBriefing = LocalDateTime.of(2025, 6, 1, 14, 0);

        // Прибавляем 2 часа, затем вычитаем 30 минут и сохраняем результат.
        LocalDateTime finalMissionTime = missionBriefing.plusHours(2).minusMinutes(30);

        // Выводим итоговое время старта миссии
        System.out.println(finalMissionTime);
    }
}

/*
 * // JavaRush
 * Правильное решение:
 * // Author: JavaRush's team
 * package ru.javarush.java.core.level13.task08;
 *
 * import java.time.LocalDateTime;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Исходная дата и время брифинга: 1 июня 2025 года, 14:00
 *         LocalDateTime missionBriefing = LocalDateTime.of(2025, 6, 1, 14, 0);
 *
 *         // LocalDateTime — неизменяемый класс: каждая операция возвращает новый объект.
 *         // Прибавляем 2 часа, затем вычитаем 30 минут и сохраняем результат.
 *         LocalDateTime finalMissionTime = missionBriefing.plusHours(2).minusMinutes(30);
 *
 *         // Выводим итоговое время старта миссии
 *         System.out.println(finalMissionTime);
 *     }
 * }
 */