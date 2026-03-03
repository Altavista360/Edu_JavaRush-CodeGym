/*
 * Authors: JavaRush's team, CodeGym's team, Altavista360
 * Version: 1.0.0
 */

/*
 * // JavaRush
 * Задача: Управление дроном 🚁
 * Ссылка: https://javarush.com/tasks/ru.javarush.java.core.level10.task18
 */

/*
 * // CodeGym
 * Task: Drone Control 🚁
 * Link: https://codegym.cc/tasks/en.codegym.java.core.level10.task18
 */

/*
 * // JavaRush
 * Условие:
 * Вы пишете программное обеспечение для управления дроном. Дрон получает текстовые команды, и в зависимости от команды, его статус должен меняться. Вам нужен элегантный способ переводить команды в понятные сообщения о состоянии.
 * Создайте переменную String droneCommand и присвойте ей значение "pause". Используйте switch-выражение нового стиля, чтобы присвоить строковой переменной droneStatusMessage следующие статусы:
 * • "Запуск!" — если droneCommand равен "start".
 * • "Остановка!" — если droneCommand равен "stop".
 * • "Пауза..." — если droneCommand равен "pause".
 * • "Неизвестная команда" — для любого другого значения.
 * В конце выведите droneStatusMessage на экран, чтобы увидеть, как дрон реагирует на команду.
 */

/*
 * // JavaRush
 * Требования:
 * • В программе должна быть объявлена переменная типа String с именем droneCommand и присвоено значение "pause".
 * • Для обработки значения droneCommand должно быть использовано современное switch-выражение (switch expression) с оператором присваивания результата переменной.
 * • В переменную droneStatusMessage должно присваиваться соответствующее сообщение в зависимости от значения droneCommand: - "Запуск!" — если droneCommand равен "start". - "Остановка!" — если droneCommand равен "stop". - "Пауза..." — если droneCommand равен "pause". - "Неизвестная команда" — для любого другого значения.
 * • В конце программы значение переменной droneStatusMessage должно быть выведено на экран.
 */

/*
 * // JavaRush
 * Черновик:
 * package ru.javarush.java.core.level10.task18;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Объявляем переменную droneCommand и присваиваем ей значение "pause"
 *         String droneCommand = "pause";
 *
 *         // Используем современное switch-выражение для определения статуса дрона
 *
 *
 *         // Выводим сообщение о статусе дрона на экран
 *
 *     }
 * }
 */

// JavaRush
package ru.javarush.java.core.level10.task18;

public class Solution {
    public static void main(String[] args) {
        // Объявляем переменную droneCommand и присваиваем ей значение "pause"
        String droneCommand = "pause";

        // Используем современное switch-выражение для определения статуса дрона
        String droneStatusMessage = switch (droneCommand) {
            case "start" -> "Запуск!";
            case "stop" -> "Остановка!";
            case "pause" -> "Пауза...";
            default -> "Неизвестная команда";
        };

        // Выводим сообщение о статусе дрона на экран
        System.out.println(droneStatusMessage);
    }
}

/*
 * // JavaRush
 * Правильное решение:
 * // Author: JavaRush's team
 * package ru.javarush.java.core.level10.task18;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Объявляем переменную droneCommand и присваиваем ей значение "pause"
 *         String droneCommand = "pause";
 *
 *         // Используем современное switch-выражение для определения статуса дрона
 *         String droneStatusMessage = switch (droneCommand) {
 *             case "start" -> "Запуск!";
 *             case "stop" -> "Остановка!";
 *             case "pause" -> "Пауза...";
 *             default -> "Неизвестная команда";
 *         };
 *
 *         // Выводим сообщение о статусе дрона на экран
 *         System.out.println(droneStatusMessage);
 *     }
 * }
 */