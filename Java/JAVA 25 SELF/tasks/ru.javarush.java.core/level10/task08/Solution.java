/*
 * Authors: JavaRush's team, CodeGym's team, Altavista360
 * Version: 1.0.0
 */

/*
 * // JavaRush
 * Задача: Установка максимального лимита игроков 🚫
 * Ссылка: https://javarush.com/tasks/ru.javarush.java.core.level10.task08
 */

/*
 * // CodeGym
 * Task: Setting the maximum player limit 🚫
 * Link: https://codegym.cc/tasks/en.codegym.java.core.level10.task08
 */

/*
 * // JavaRush
 * Условие:
 * Вы настраиваете лимит игроков для нового онлайн-сервера, и этот лимит должен быть строго фиксированным, чтобы сервер не перегрузился. Вы хотите, чтобы компилятор Java гарантировал, что после установки этого лимита его нельзя будет изменить.
 * В методе main объявите константу final int MAX_PLAYERS_ON_SERVER и присвойте ей значение 100. Теперь, чтобы убедиться в её неизменности, попробуйте прямо под этой строкой присвоить MAX_PLAYERS_ON_SERVER новое значение, например, 200. Вы должны увидеть, как компилятор моментально укажет на ошибку, подтверждая, что константа действительно защищена от изменений.
 * 1) final int MAX_PLAYERS_ON_SERVER = 100;
 * 2) MAX_PLAYERS_ON_SERVER = 200; // Ошибка компиляции!
 */

/*
 * // JavaRush
 * Требования:
 * • В методе main должна быть объявлена переменная с модификатором final: final int MAX_PLAYERS_ON_SERVER.
 * • Переменной MAX_PLAYERS_ON_SERVER должно быть присвоено значение 100 при объявлении.
 * • Сразу после объявления и инициализации переменной MAX_PLAYERS_ON_SERVER должно быть выполнено присваивание нового значения (например, 200).
 * • Компилятор Java должен выдавать ошибку при попытке изменить значение переменной, объявленной с модификатором final.
 */

/*
 * // JavaRush
 * Черновик:
 * package ru.javarush.java.core.level10.task08;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Объявляем константу с модификатором final и присваиваем ей значение 100
 *
 *
 *         // Попытка изменить значение константы
 *
 *
 *         // Выводим значение константы на экран
 *
 *     }
 * }
 */

// JavaRush
package ru.javarush.java.core.level10.task08;

public class Solution {
    public static void main(String[] args) {
        // Объявляем константу с модификатором final и присваиваем ей значение 100
        final int MAX_PLAYERS_ON_SERVER = 100;

        // Попытка изменить значение константы
        MAX_PLAYERS_ON_SERVER = 200;

        // Выводим значение константы на экран
        System.out.println(MAX_PLAYERS_ON_SERVER);
    }
}

/*
 * // JavaRush
 * Правильное решение:
 * // Author: JavaRush's team
 * package ru.javarush.java.core.level10.task08;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Объявляем константу с модификатором final и присваиваем ей значение 100
 *         final int MAX_PLAYERS_ON_SERVER = 100;
 *
 *         // Попытка изменить значение константы
 *         MAX_PLAYERS_ON_SERVER = 200;
 *
 *         // Выводим значение константы на экран
 *         System.out.println("Максимальное количество игроков на сервере: " + MAX_PLAYERS_ON_SERVER);
 *     }
 * }
 */