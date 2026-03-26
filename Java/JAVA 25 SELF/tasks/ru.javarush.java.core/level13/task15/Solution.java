/*
 * Authors: JavaRush's team, CodeGym's team, Altavista360
 * Version: 1.0.0
 */

/*
 * // JavaRush
 * Задача: Персонализация: дата с локальным колоритом 🗓️
 * Ссылка: https://javarush.com/tasks/ru.javarush.java.core.level13.task15
 */

/*
 * // CodeGym
 * Task: Personalization: date with local flavor 🗓️
 * Link: https://codegym.cc/tasks/en.codegym.java.core.level13.task15
 */

/*
 * // JavaRush
 * Условие:
 * Для вашего приложения-органайзера необходимо отображать даты в привычном для пользователя формате, например, "15.03.2023".
 * Создайте объект LocalDate для specificEventDate (15 марта 2023 года).
 * Затем примените DateTimeFormatter.ofPattern("dd.MM.yyyy"), чтобы преобразовать specificEventDate в friendlyDisplayDateString — строку, которая идеально вписывается в локальные предпочтения.
 * Выведите friendlyDisplayDateString на экран, чтобы порадовать пользователя.
 */

/*
 * // JavaRush
 * Требования:
 * • В программе должен быть создан объект LocalDate с датой 15 марта 2023 года и присвоен переменной specificEventDate.
 * • Для форматирования даты должен быть использован объект DateTimeFormatter, созданный через ofPattern с шаблоном "dd.MM.yyyy".
 * • Должна быть выполнена операция преобразования specificEventDate в строку с помощью созданного форматтера. Результат должен быть сохранён в переменную friendlyDisplayDateString.
 * • Значение переменной friendlyDisplayDateString должно быть выведено на экран.
 */

/*
 * // JavaRush
 * Черновик:
 * package ru.javarush.java.core.level13.task15;
 *
 * import java.time.LocalDate;
 * import java.time.format.DateTimeFormatter;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Создаем объект LocalDate с датой 15 марта 2023 года
 *
 *
 *         // Готовим форматтер с шаблоном "dd.MM.yyyy" (например, "15.03.2023")
 *
 *
 *         // Форматируем дату в строку с учетом заданного шаблона
 *
 *
 *         // Выводим получившуюся строку на экран
 *
 *     }
 * }
 */

// JavaRush
package ru.javarush.java.core.level13.task15;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Solution {
    public static void main(String[] args) {
        // Создаем объект LocalDate с датой 15 марта 2023 года
        LocalDate specificEventDate = LocalDate.of(2023, 3, 15);

        // Готовим форматтер с шаблоном "dd.MM.yyyy" (например, "15.03.2023")
        DateTimeFormatter foo = DateTimeFormatter.ofPattern("dd.MM.yyyy");

        // Форматируем дату в строку с учетом заданного шаблона
        String friendlyDisplayDateString = specificEventDate.format(foo);

        // Выводим получившуюся строку на экран
        System.out.println(friendlyDisplayDateString);
    }
}

/*
 * // JavaRush
 * Правильное решение:
 * // Author: JavaRush's team
 * package ru.javarush.java.core.level13.task15;
 *
 * import java.time.LocalDate;
 * import java.time.format.DateTimeFormatter;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Создаем объект LocalDate с датой 15 марта 2023 года
 *         LocalDate specificEventDate = LocalDate.of(2023, 3, 15);
 *
 *         // Готовим форматтер с шаблоном "dd.MM.yyyy" (например, "15.03.2023")
 *         DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
 *
 *         // Форматируем дату в строку с учетом заданного шаблона
 *         String friendlyDisplayDateString = specificEventDate.format(formatter);
 *
 *         // Выводим получившуюся строку на экран
 *         System.out.println(friendlyDisplayDateString);
 *     }
 * }
 */