/*
 * Authors: JavaRush's team, CodeGym's team, Altavista360
 * Version: 1.0.0
 */

/*
 * // JavaRush
 * Задача: Комфортная температура в помещении 🌡️
 * Ссылка: https://javarush.com/tasks/ru.javarush.java.core.level03.task12
 */

/*
 * // CodeGym
 * Task: Comfortable room temperature 🌡️
 * Link: https://codegym.cc/tasks/en.codegym.java.core.level03.task12
 */

/*
 * // JavaRush
 * Условие:
 * Вы создаёте умный термостат. Объявите переменную int с именем roomTemperature. Создайте переменную типа boolean с именем isComfortable, которая станет true, если roomTemperature находится в комфортном диапазоне от 20 до 25 градусов включительно. Выведите значение isComfortable на экран.
 */

/*
 * // JavaRush
 * Требования:
 * • В программе должна быть объявлена переменная типа int с именем roomTemperature.
 * • В программе должна быть объявлена переменная типа boolean с именем isComfortable.
 * • Переменная isComfortable должна быть равна true, если значение roomTemperature находится в диапазоне от 20 до 25 включительно.
 * • Программа должна выводить значение переменной isComfortable на экран.
 */

/*
 * // JavaRush
 * Черновик:
 * package ru.javarush.java.core.level03.task12;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Объявляем переменную roomTemperature типа int
 *
 *
 *         // Проверяем, находится ли roomTemperature в диапазоне от 20 до 25 включительно
 *
 *
 *         // Выводим значение переменной isComfortable на экран
 *
 *     }
 * }
 */

// JavaRush
package ru.javarush.java.core.level03.task12;

public class Solution {
    public static void main(String[] args) {
        // Объявляем переменную roomTemperature типа int
        int roomTemperature = 22;

        // Проверяем, находится ли roomTemperature в диапазоне от 20 до 25 включительно
        boolean isComfortable = roomTemperature >= 20 && roomTemperature <= 25;

        // Выводим значение переменной isComfortable на экран
        System.out.println(isComfortable);
    }
}

/*
 * // JavaRush
 * Правильное решение:
 * // Author: JavaRush's team
 * package ru.javarush.java.core.level03.task12;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Объявляем переменную roomTemperature типа int
 *         int roomTemperature = 22;
 *
 *         // Проверяем, находится ли roomTemperature в диапазоне от 20 до 25 включительно
 *         boolean isComfortable = roomTemperature >= 20 && roomTemperature <= 25;
 *
 *         // Выводим значение переменной isComfortable на экран
 *         System.out.println(isComfortable);
 *     }
 * }
 */