/*
 * Authors: JavaRush's team, CodeGym's team, Altavista360
 * Version: 1.0.0
 */

/*
 * // JavaRush
 * Задача: Проверка наличия ключа
 * Ссылка: https://javarush.com/tasks/ru.javarush.java.core.level12.task06
 */

/*
 * // CodeGym
 * Task: Check for key existence
 * Link: https://codegym.cc/tasks/en.codegym.java.core.level12.task06
 */

/*
 * // JavaRush
 * Условие:
 * Вы — учитель, который ведет учет оценок своих учеников в цифровом журнале. Вам нужно быстро проверить, есть ли оценка у конкретного студента, прежде чем вы сможете ее показать.
 * Создайте ассоциативный массив (HashMap) с именем studentGrades, где ключом будет имя студента (String), а значением — его оценка (Integer).
 * Добавьте в этот словарь запись: "Анна" с оценкой 5.
 * Теперь, используя свойство словаря, проверьте, существует ли запись для "Анны". Если ее оценка действительно найдена в журнале, выведите на экран сообщение "Оценка Анны: " и само значение ее оценки, чтобы подтвердить наличие данных.
 */

/*
 * // JavaRush
 * Требования:
 * • Необходимо создать HashMap с именем studentGrades, где ключом является строка (имя студента), а значением — целое число (оценка).
 * • В словарь studentGrades нужно добавить пару ключ-значение: ключ "Анна", значение 5.
 * • Программа должна проверить, существует ли в словаре запись с ключом "Анна".
 * • Если запись для "Анны" найдена, программа должна вывести на экран сообщение "Оценка Анны: " и соответствующее значение оценки.
 */

/*
 * // JavaRush
 * Черновик:
 * package ru.javarush.java.core.level12.task06;
 *
 * import java.util.HashMap;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Создаем ассоциативный массив: ключ — имя студента, значение — его оценка
 *
 *
 *         // Добавляем запись: "Анна" -> 5
 *
 *
 *         // Проверяем, есть ли в словаре оценка для "Анны"
 *
 *             // Получаем оценку и выводим сообщение
 *
 *     }
 * }
 */

// JavaRush
package ru.javarush.java.core.level12.task06;

import java.util.HashMap;

public class Solution {
    public static void main(String[] args) {
        // Создаем ассоциативный массив: ключ — имя студента, значение — его оценка
        HashMap<String, Integer> studentGrades = new HashMap<String, Integer>();

        // Добавляем запись: "Анна" -> 5
        studentGrades.put("Анна", 5);

        // Проверяем, есть ли в словаре оценка для "Анны"
        if (studentGrades.containsKey("Анна")) {
            // Получаем оценку и выводим сообщение
            System.out.println("Оценка Анны: " + studentGrades.get("Анна"));
        }
    }
}

/*
 * // JavaRush
 * Правильное решение:
 * // Author: JavaRush's team
 * package ru.javarush.java.core.level12.task06;
 *
 * import java.util.HashMap;
 * import java.util.Map;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Создаем ассоциативный массив: ключ — имя студента, значение — его оценка
 *         HashMap<String, Integer> studentGrades = new HashMap<>();
 *
 *         // Добавляем запись: "Анна" -> 5
 *         studentGrades.put("Анна", 5);
 *
 *         // Проверяем, есть ли в словаре оценка для "Анны"
 *         if (studentGrades.containsKey("Анна")) {
 *             // Получаем оценку и выводим сообщение
 *             System.out.println("Оценка Анны: " + studentGrades.get("Анна"));
 *         }
 *     }
 * }
 */