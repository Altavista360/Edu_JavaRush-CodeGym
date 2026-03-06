/*
 * Authors: JavaRush's team, CodeGym's team, Altavista360
 * Version: 1.0.0
 */

/*
 * // JavaRush
 * Задача: Ошибочный запрос к рюкзаку героя 🛡️
 * Ссылка: https://javarush.com/tasks/ru.javarush.java.core.level11.task06
 */

/*
 * // CodeGym
 * Task: Invalid access to the hero's backpack 🛡️
 * Link: https://codegym.cc/tasks/en.codegym.java.core.level11.task06
 */

/*
 * // JavaRush
 * Условие:
 * Вы разрабатываете систему инвентаря для новой RPG-игры. У игрока есть рюкзак всего на 3 слота для предметов. Создайте массив int[] heroInventory и заполните его любыми тремя целыми числами, представляющими предметы (например, ID предметов 101, 102, 103).
 * Теперь представьте, что игрок, пытаясь обмануть игру или просто ошибившись, пробует достать предмет из несуществующего 10-го слота. Поместите попытку доступа к элементу с индексом 10 в блок try. Если игра столкнется с ошибкой (что неизбежно), перехватите это исключение в блоке catch и выведите на экран сообщение для игрока: "Ошибка! Такой ячейки в рюкзаке не существует. Индекс вне границ массива."
 */

/*
 * // JavaRush
 * Требования:
 * • В программе должен быть объявлен массив int[] с именем heroInventory.
 * • Массив heroInventory должен быть инициализирован ровно тремя целыми числами.
 * • В блоке try должна быть попытка доступа к элементу heroInventory с индексом 10.
 * • Исключение, возникающее при обращении к несуществующему элементу массива, должно быть перехвачено в блоке catch.
 * • В блоке catch должно выводиться сообщение: "Ошибка! Такой ячейки в рюкзаке не существует. Индекс вне границ массива."
 */

/*
 * // JavaRush
 * Черновик:
 * package ru.javarush.java.core.level11.task06;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Рюкзак героя на 3 слота: храним ID предметов
 *
 *
 *         try {
 *             // Ошибочный доступ к 10-му индексу (за пределами массива из 3 элементов)
 *
 *         } catch (ArrayIndexOutOfBoundsException e) {
 *             // Сообщение для игрока о выходе индекса за границы массива
 *
 *
 *         }
 *     }
 * }
 */

// JavaRush
package ru.javarush.java.core.level11.task06;

public class Solution {
    public static void main(String[] args) {
        // Рюкзак героя на 3 слота: храним ID предметов
        int[] heroInventory = {101, 102, 103};

        try {
            // Ошибочный доступ к 10-му индексу (за пределами массива из 3 элементов)
            int foo = heroInventory[10];
            System.out.println(foo);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Сообщение для игрока о выходе индекса за границы массива
            System.out.println("Ошибка! Такой ячейки в рюкзаке не существует. Индекс вне границ массива.");

        }
    }
}

/*
 * // JavaRush
 * Правильное решение:
 * // Author: JavaRush's team
 * package ru.javarush.java.core.level11.task06;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Рюкзак героя на 3 слота: храним ID предметов
 *         int[] heroInventory = {101, 102, 103};
 *
 *         try {
 *             // Ошибочный доступ к 10-му индексу (за пределами массива из 3 элементов)
 *             int item = heroInventory[10]; // Эта строка выбросит ArrayIndexOutOfBoundsException
 *             System.out.println(item);     // До этой строки выполнение не дойдет
 *         } catch (ArrayIndexOutOfBoundsException e) {
 *             // Сообщение для игрока о выходе индекса за границы массива
 *             System.out.println("Ошибка! Такой ячейки в рюкзаке не существует. Индекс вне границ массива.");
 *         }
 *     }
 * }
 */