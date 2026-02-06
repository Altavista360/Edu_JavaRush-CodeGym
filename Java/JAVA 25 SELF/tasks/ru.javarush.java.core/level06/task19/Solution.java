/*
 * Authors: JavaRush's team, CodeGym's team, Altavista360
 * Version: 1.0.0
 */

/*
 * // JavaRush
 * Задача: Ограничения старых погодных датчиков 🌡️
 * Ссылка: https://javarush.com/tasks/ru.javarush.java.core.level06.task19
 */

/*
 * // CodeGym
 * Task: Limitations of old weather sensors 🌡️
 * Link: https://codegym.cc/tasks/en.codegym.java.core.level06.task19
 */

/*
 * // JavaRush
 * Условие:
 * Представьте, что вы работаете со старым, очень простым погодным датчиком, который может хранить температуру только в очень ограниченном диапазоне типа byte. Однако текущая температура в городе currentCityTemperature достигла 200 градусов Цельсия (что значительно выше обычных значений, но идеально для демонстрации!) — это значение превышает максимальный диапазон byte.
 * Объявите переменную типа int и присвойте ей 200. Теперь, зная, что это приведёт к потере данных, явно преобразуйте это значение к типу byte и сохраните его в sensorReading. Выведите результат на экран. Будьте готовы увидеть не то, что ожидали, ведь старые технологии имеют свои ограничения!
 */

/*
 * // JavaRush
 * Требования:
 * • В программе должна быть объявлена переменная типа int и присвоено ей значение 200.
 * • Значение переменной типа int должно быть явно приведено к типу byte с помощью оператора приведения (cast).
 * • Результат явного приведения должен быть сохранён в переменную типа byte с именем sensorReading.
 * • Программа должна вывести значение переменной sensorReading на экран.
 */

/*
 * // JavaRush
 * Черновик:
 * package ru.javarush.java.core.level06.task19;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Объявляем переменную типа int и присваиваем ей значение 200
 *
 *
 *         // Явно приводим значение переменной currentCityTemperature к типу byte
 *
 *
 *         // Выводим результат на экран
 *
 *     }
 * }
 */

// JavaRush
package ru.javarush.java.core.level06.task19;

public class Solution {
    public static void main(String[] args) {
        // Объявляем переменную типа int и присваиваем ей значение 200
        int currentCityTemperature = 200;

        // Явно приводим значение переменной currentCityTemperature к типу byte
        byte sensorReading = (byte) currentCityTemperature;

        // Выводим результат на экран
        System.out.println(sensorReading);
    }
}

/*
 * // JavaRush
 * Правильное решение:
 * // Author: JavaRush's team
 * package ru.javarush.java.core.level06.task19;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Объявляем переменную типа int и присваиваем ей значение 200
 *         int currentCityTemperature = 200;
 *
 *         // Явно приводим значение переменной currentCityTemperature к типу byte
 *         byte sensorReading = (byte) currentCityTemperature;
 *
 *         // Выводим результат на экран
 *         System.out.println(sensorReading);
 *     }
 * }
 */