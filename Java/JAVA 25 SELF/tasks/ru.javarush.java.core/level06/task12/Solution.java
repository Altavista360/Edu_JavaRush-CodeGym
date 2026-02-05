/*
 * Authors: JavaRush's team, CodeGym's team, Altavista360
 * Version: 1.0.0
 */

/*
 * // JavaRush
 * Задача: Калибровка высокоточного лазера 🔬
 * Ссылка: https://javarush.com/tasks/ru.javarush.java.core.level06.task12
 */

/*
 * // CodeGym
 * Task: High-Precision Laser Calibration 🔬
 * Link: https://codegym.cc/tasks/en.codegym.java.core.level06.task12
 */

/*
 * // JavaRush
 * Условие:
 * Вы — инженер, занимающийся калибровкой сверхточного лазера, который требует очень точной настройки частоты. Из-за мелких флуктуаций в оборудовании, идеально точного совпадения частот бывает трудно добиться, поэтому вы используете допуск (эпсилон).
 * Создайте две переменные типа double: actualFrequency (присвойте ей значение 0.1 + 0.2) и targetFrequency (присвойте ей значение 0.3). Задайте переменную double tolerance со значением 0.000001 — это ваш допустимый предел отклонения.
 * Ваша задача — проверить, находится ли actualFrequency "достаточно близко" к targetFrequency. Если абсолютная разница между actualFrequency и targetFrequency меньше tolerance, выведите на экран "Лазер откалиброван с допустимой точностью", иначе выведите "Требуется дополнительная калибровка".
 */

/*
 * // JavaRush
 * Требования:
 * • В программе должны быть объявлены переменные actualFrequency и targetFrequency типа double.
 * • Переменной actualFrequency должно быть присвоено значение выражения 0.1 + 0.2, а переменной targetFrequency — значение 0.3.
 * • В программе должна быть объявлена переменная tolerance типа double со значением 0.000001.
 * • Программа должна вычислять абсолютное значение разницы между actualFrequency и targetFrequency.
 * • Программа должна сравнивать полученную абсолютную разницу с переменной tolerance.
 * • Если абсолютная разница меньше tolerance, на экран должно быть выведено сообщение "Лазер откалиброван с допустимой точностью". В противном случае — "Требуется дополнительная калибровка".
 */

/*
 * // JavaRush
 * Черновик:
 * package ru.javarush.java.core.level06.task12;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Объявляем переменную actualFrequency и присваиваем ей значение 0.1 + 0.2
 *
 *
 *         // Объявляем переменную targetFrequency и присваиваем ей значение 0.3
 *
 *
 *         // Объявляем переменную tolerance и задаем ей значение 0.000001
 *
 *
 *         // Вычисляем абсолютную разницу между actualFrequency и targetFrequency
 *
 *
 *         // Сравниваем разницу с допуском и выводим соответствующее сообщение
 *
 *     }
 * }
 */

// JavaRush
package ru.javarush.java.core.level06.task12;

public class Solution {
    public static void main(String[] args) {
        // Объявляем переменную actualFrequency и присваиваем ей значение 0.1 + 0.2
        double actualFrequency = 0.1 + 0.2;

        // Объявляем переменную targetFrequency и присваиваем ей значение 0.3
        double targetFrequency = 0.3;

        // Объявляем переменную tolerance и задаем ей значение 0.000001
        double tolerance = 0.000001;

        // Вычисляем абсолютную разницу между actualFrequency и targetFrequency
        double difference = Math.abs(actualFrequency - targetFrequency);

        // Сравниваем разницу с допуском и выводим соответствующее сообщение
        if (difference < tolerance) {
            System.out.println("Лазер откалиброван с допустимой точностью");
        } else {
            System.out.println("Требуется дополнительная калибровка");
        }
    }
}

/*
 * // JavaRush
 * Правильное решение:
 * // Author: JavaRush's team
 * package ru.javarush.java.core.level06.task12;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Объявляем переменную actualFrequency и присваиваем ей значение 0.1 + 0.2
 *         double actualFrequency = 0.1 + 0.2;
 *
 *         // Объявляем переменную targetFrequency и присваиваем ей значение 0.3
 *         double targetFrequency = 0.3;
 *
 *         // Объявляем переменную tolerance и задаем ей значение 0.000001
 *         double tolerance = 0.000001;
 *
 *         // Вычисляем абсолютную разницу между actualFrequency и targetFrequency
 *         double difference = Math.abs(actualFrequency - targetFrequency);
 *
 *         // Сравниваем разницу с допуском и выводим соответствующее сообщение
 *         if (difference < tolerance) {
 *             System.out.println("Лазер откалиброван с допустимой точностью");
 *         } else {
 *             System.out.println("Требуется дополнительная калибровка");
 *         }
 *     }
 * }
 */