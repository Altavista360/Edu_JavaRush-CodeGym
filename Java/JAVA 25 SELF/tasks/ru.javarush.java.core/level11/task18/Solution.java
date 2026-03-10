/*
 * Authors: JavaRush's team, CodeGym's team, Altavista360
 * Version: 1.0.0
 */

/*
 * // JavaRush
 * Задача: Герой и его несуществующий артефакт в инвентаре 🏹
 * Ссылка: https://javarush.com/tasks/ru.javarush.java.core.level11.task18
 */

/*
 * // CodeGym
 * Task: The Hero and His Nonexistent Inventory Artifact 🏹
 * Link: https://codegym.cc/tasks/en.codegym.java.core.level11.task18
 */

/*
 * // JavaRush
 * Условие:
 * Вы пишете код для инвентаря игрового персонажа, который может носить всего три артефакта. Объявите массив int[] playerInventory размером в три элемента и заполните его любыми значениями, представляющими артефакты.
 * Теперь представьте, что игрок пытается найти артефакт в "пятом" слоте, которого физически не существует. Попробуйте вывести на экран элемент массива с индексом 5.
 * Запустите программу и проанализируйте сгенерированный "Stack Trace". Обратите внимание на тип исключения и на номер строки, где вы пытались обратиться к несуществующему слоту инвентаря.
 */

/*
 * // JavaRush
 * Требования:
 * • В программе должен быть объявлен массив int[] с именем playerInventory.
 * • Массив playerInventory должен иметь размер три элемента.
 * • Массив playerInventory должен быть заполнен любыми значениями (например, идентификаторами артефактов).
 * • В программе должна быть попытка вывести на экран элемент массива playerInventory с индексом 5.
 * • Программа должна привести к возникновению исключения из-за выхода за пределы массива.
 */

/*
 * // JavaRush
 * Черновик:
 * package ru.javarush.java.core.level11.task18;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Объявляем массив playerInventory размером 3 элемента
 *
 *
 *         // Пытаемся вывести элемент массива с индексом 5
 *         // Это вызовет исключение ArrayIndexOutOfBoundsException
 *
 *     }
 * }
 */

// JavaRush
package ru.javarush.java.core.level11.task18;

public class Solution {
    public static void main(String[] args) {
        // Объявляем массив playerInventory размером 3 элемента
        int[] playerInventory = {1, 3, 5};

        // Пытаемся вывести элемент массива с индексом 5
        // Это вызовет исключение ArrayIndexOutOfBoundsException
        System.out.println(playerInventory[5]);
    }
}

/*
 * // JavaRush
 * Правильное решение:
 * // Author: JavaRush's team
 * package ru.javarush.java.core.level11.task18;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Объявляем массив playerInventory размером 3 элемента
 *         int[] playerInventory = {101, 102, 103};
 *
 *         // Пытаемся вывести элемент массива с индексом 5
 *         // Это вызовет исключение ArrayIndexOutOfBoundsException
 *         System.out.println(playerInventory[5]);
 *     }
 * }
 */