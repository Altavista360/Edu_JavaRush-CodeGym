/*
 * Authors: JavaRush's team, CodeGym's team, Altavista360
 * Version: 1.0.0
 */

/*
 * // JavaRush
 * Задача: Отслеживание заказов: парсинг времени с точностью 📦
 * Ссылка: https://javarush.com/tasks/ru.javarush.java.core.level13.task16
 */

/*
 * // CodeGym
 * Task: Order Tracking: Precise Time Parsing 📦
 * Link: https://codegym.cc/tasks/en.codegym.java.core.level13.task16
 */

/*
 * // JavaRush
 * Условие:
 * Вам пришел новый orderTimestampString — "01.06.2025 14:30". Ваша система должна немедленно преобразовать эту строку в точный объект LocalDateTime, чтобы корректно отслеживать время поступления заказа.
 * Используйте шаблон "dd.MM.yyyy HH:mm" для парсинга orderTimestampString в parsedOrderDateTime. Затем выведите parsedOrderDateTime на экран, убедившись, что он корректно представлен в формате 2025-06-01T14:30, готовый для внутренней обработки.
 */

/*
 * // JavaRush
 * Требования:
 * • В программе должны быть импортированы классы java.time.LocalDateTime и java.time.format.DateTimeFormatter.
 * • Для парсинга строки "01.06.2025 14:30" должен использоваться шаблон "dd.MM.yyyy HH:mm".
 * • Строка orderTimestampString должна быть преобразована в объект LocalDateTime с помощью DateTimeFormatter.
 * • Результат парсинга должен быть сохранён в переменную с именем parsedOrderDateTime.
 * • На экран должен быть выведен parsedOrderDateTime в формате 2025-06-01T14:30 (стандартный вывод LocalDateTime.toString()).
 */

/*
 * // JavaRush
 * Черновик:
 * package ru.javarush.java.core.level13.task16;
 *
 * import java.time.LocalDateTime;
 * import java.time.format.DateTimeFormatter;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Исходная строка с меткой времени заказа
 *
 *
 *         // Создаем форматтер с шаблоном "dd.MM.yyyy HH:mm"
 *
 *
 *         // Парсим строку в объект LocalDateTime
 *
 *
 *         // Выводим результат в стандартном ISO-формате (например, 2025-06-01T14:30)
 *
 *     }
 * }
 */

// JavaRush
package ru.javarush.java.core.level13.task16;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Solution {
    public static void main(String[] args) {
        // Исходная строка с меткой времени заказа
        String orderTimestampString = "01.06.2025 14:30";

        // Создаем форматтер с шаблоном "dd.MM.yyyy HH:mm"
        DateTimeFormatter foo = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm");

        // Парсим строку в объект LocalDateTime
        LocalDateTime parsedOrderDateTime = LocalDateTime.parse(orderTimestampString, foo);

        // Выводим результат в стандартном ISO-формате (например, 2025-06-01T14:30)
        System.out.println(parsedOrderDateTime);
    }
}

/*
 * // JavaRush
 * Правильное решение:
 * // Author: JavaRush's team
 * package ru.javarush.java.core.level13.task16;
 *
 * import java.time.LocalDateTime;                 // Класс для хранения даты и времени без таймзоны
 * import java.time.format.DateTimeFormatter;      // Класс для парсинга/форматирования дат и времени
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Исходная строка с меткой времени заказа
 *         String orderTimestampString = "01.06.2025 14:30";
 *
 *         // Создаем форматтер с шаблоном "dd.MM.yyyy HH:mm"
 *         DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm");
 *
 *         // Парсим строку в объект LocalDateTime
 *         LocalDateTime parsedOrderDateTime = LocalDateTime.parse(orderTimestampString, formatter);
 *
 *         // Выводим результат в стандартном ISO-формате (например, 2025-06-01T14:30)
 *         System.out.println(parsedOrderDateTime);
 *     }
 * }
 */