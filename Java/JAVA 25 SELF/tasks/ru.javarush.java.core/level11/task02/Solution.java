/*
 * Authors: JavaRush's team, CodeGym's team, Altavista360
 * Version: 1.0.0
 */

/*
 * // JavaRush
 * Задача: Поиск несуществующего кристалла в рюкзаке 🎒
 * Ссылка: https://javarush.com/tasks/ru.javarush.java.core.level11.task02
 */

/*
 * // CodeGym
 * Task: Searching for a non-existent gem in the backpack 🎒
 * Link: https://codegym.cc/tasks/en.codegym.java.core.level11.task02
 */

/*
 * // JavaRush
 * Условие:
 * Вы разрабатываете приключенческую игру, где герой собирает волшебные кристаллы. Вы решили хранить их количество в массиве.
 * Итак, создайте массив int[] collectedGems, который может вместить всего три кристалла. Заполните его любыми тремя целыми числами, например, 10, 20, 30.
 * Теперь представьте, что ваш герой, в пылу сражения, пытается найти "пятый" кристалл в своём рюкзаке, хотя там всего три места, пронумерованных от нуля до двух. Попробуйте вывести на экран элемент этого массива по индексу 5. Посмотрите, как игра (ваша программа) отреагирует на попытку обратиться к предмету, которого просто не существует.
 */

/*
 * // JavaRush
 * Требования:
 * • Необходимо создать массив типа int длиной 3 и присвоить ему имя collectedGems.
 * • Массив collectedGems должен быть заполнен тремя целыми числами, например, 10, 20, 30.
 * • В программе должна быть попытка вывести на экран элемент массива collectedGems с индексом 5.
 * • Программа должна привести к возникновению исключения при попытке доступа к несуществующему индексу массива.
 */

/*
 * // JavaRush
 * Черновик:
 * package ru.javarush.java.core.level11.task02;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Создаем массив collectedGems длиной 3
 *
 *
 *         // Пытаемся вывести элемент по индексу 5.
 *         // В массиве всего 3 элемента (индексы 0..2), поэтому ниже возникнет исключение
 *         // ArrayIndexOutOfBoundsException.
 *
 *     }
 * }
 */

// JavaRush
package ru.javarush.java.core.level11.task02;

public class Solution {
    public static void main(String[] args) {
        // Создаем массив collectedGems длиной 3
        int[] collectedGems = {10, 20, 30};

        // Пытаемся вывести элемент по индексу 5.
        // В массиве всего 3 элемента (индексы 0..2), поэтому ниже возникнет исключение
        // ArrayIndexOutOfBoundsException.
        System.out.println(collectedGems[5]);
    }
}

/*
 * // JavaRush
 * Правильное решение:
 * // Author: JavaRush's team
 * package ru.javarush.java.core.level11.task02;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Создаем массив collectedGems длиной 3
 *         int[] collectedGems = {10, 20, 30};
 *
 *         // Пытаемся вывести элемент по индексу 5.
 *         // В массиве всего 3 элемента (индексы 0..2), поэтому ниже возникнет исключение
 *         // ArrayIndexOutOfBoundsException.
 *         System.out.println(collectedGems[5]);
 *     }
 * }
 */