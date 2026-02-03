/*
 * Authors: JavaRush's team, CodeGym's team, Altavista360
 * Version: 1.0.0
 */

/*
 * // JavaRush
 * Задача: Подсчёт сокровищ в драконьем логове 🐉
 * Ссылка: https://javarush.com/tasks/ru.javarush.java.core.level06.task02
 */

/*
 * // CodeGym
 * Task: Counting the Treasure in the Dragon's Lair 🐉
 * Link: https://codegym.cc/tasks/en.codegym.java.core.level06.task02
 */

/*
 * // JavaRush
 * Условие:
 * Вы — отважный искатель приключений, который только что обнаружил несметные сокровища в логове древнего дракона. Вам предстоит пересчитать их!
 * Представьте, что золотых монет так много, что их количество превышает возможности обычного int. Объявите переменную типа long с именем dragonHoard и присвойте ей по-настоящему огромное значение, например, 10_000_000_000L, используя специальные суффиксы и подчёркивания для удобства чтения.
 * Ваша задача — убедиться, что это колоссальное число корректно отображается на экране.
 */

/*
 * // JavaRush
 * Требования:
 * • В программе должна быть объявлена переменная с именем dragonHoard типа long.
 * • Переменной dragonHoard должно быть присвоено значение 10_000_000_000 (десять миллиардов).
 * • При присваивании значения переменной dragonHoard должен быть использован суффикс L для обозначения типа long.
 * • В числовом литерале должны быть использованы подчёркивания для улучшения читаемости (например, 10_000_000_000L).
 * • Значение переменной dragonHoard должно быть выведено на экран.
 */

/*
 * // JavaRush
 * Черновик:
 * package ru.javarush.java.core.level06.task02;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Объявляем переменную dragonHoard типа long и присваиваем ей 10 миллиардов
 *         // Используем суффикс L и подчёркивания для удобства чтения
 *
 *
 *         // Выводим значение переменной на экран
 *
 *     }
 * }
 */

// JavaRush
package ru.javarush.java.core.level06.task02;

public class Solution {
    public static void main(String[] args) {
        // Объявляем переменную dragonHoard типа long и присваиваем ей 10 миллиардов
        // Используем суффикс L и подчёркивания для удобства чтения
        long dragonHoard = 10_000_000_000L;

        // Выводим значение переменной на экран
        System.out.println(dragonHoard);
    }
}

/*
 * // JavaRush
 * Правильное решение:
 * // Author: JavaRush's team
 * package ru.javarush.java.core.level06.task02;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Объявляем переменную dragonHoard типа long и присваиваем ей 10 миллиардов
 *         // Используем суффикс L и подчёркивания для удобства чтения
 *         long dragonHoard = 10_000_000_000L;
 *
 *         // Выводим значение переменной на экран
 *         System.out.println(dragonHoard);
 *     }
 * }
 */