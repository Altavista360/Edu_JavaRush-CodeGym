/*
 * Authors: JavaRush's team, CodeGym's team, Altavista360
 * Version: 1.0.0
 */

/*
 * // JavaRush
 * Задача: Фиксация важного исторического момента 📜
 * Ссылка: https://javarush.com/tasks/ru.javarush.java.core.level13.task04
 */

/*
 * // CodeGym
 * Task: Recording an important historical moment 📜
 * Link: https://codegym.cc/tasks/en.codegym.java.core.level13.task04
 */

/*
 * // JavaRush
 * Условие:
 * Представьте, что вы записываете точное время и дату важного исторического события, которое произошло 20 марта 2022 года. Вам нужно не просто день, а конкретный момент.
 * Создайте переменную типа LocalDateTime (поскольку задача подразумевает и дату, и время) и присвойте ей значение, представляющее 20 марта 2022 года, скажем, в 10:00 утра. Назовите эту переменную historicMoment.
 * Затем выведите historicMoment на экран, чтобы зафиксировать этот ключевой момент.
 */

/*
 * // JavaRush
 * Требования:
 * • В программе должна быть объявлена переменная с именем historicMoment типа LocalDateTime.
 * • Переменная historicMoment должна быть инициализирована значением, соответствующим 20 марта 2022 года, 10:00 утра.
 * • Для создания значения даты и времени должен быть использован класс LocalDateTime (например, метод LocalDateTime.of).
 * • Значение переменной historicMoment должно быть выведено на экран с помощью System.out.println.
 */

/*
 * // JavaRush
 * Черновик:
 * package ru.javarush.java.core.level13.task04;
 *
 * import java.time.LocalDateTime;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // LocalDateTime хранит одновременно дату и время
 *         // Фиксируем точный момент: 20 марта 2022 года, 10:00
 *
 *
 *         // Выводим зафиксированный момент на экран
 *
 *     }
 * }
 */

// JavaRush
package ru.javarush.java.core.level13.task04;

import java.time.LocalDateTime;

public class Solution {
    public static void main(String[] args) {
        // LocalDateTime хранит одновременно дату и время
        // Фиксируем точный момент: 20 марта 2022 года, 10:00
        LocalDateTime historicMoment = LocalDateTime.of(2022, 3, 20, 10, 0);

        // Выводим зафиксированный момент на экран
        System.out.println(historicMoment);
    }
}

/*
 * // JavaRush
 * Правильное решение:
 * // Author: JavaRush's team
 * package ru.javarush.java.core.level13.task04;
 *
 * import java.time.LocalDateTime;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // LocalDateTime хранит одновременно дату и время
 *         // Фиксируем точный момент: 20 марта 2022 года, 10:00
 *         LocalDateTime historicMoment = LocalDateTime.of(2022, 3, 20, 10, 0);
 *
 *         // Выводим зафиксированный момент на экран
 *         System.out.println(historicMoment);
 *     }
 * }
 */