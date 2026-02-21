/*
 * Authors: JavaRush's team, CodeGym's team, Altavista360
 * Version: 1.0.0
 */

/*
 * // JavaRush
 * Задача: Форматирование таблицы с выравниванием
 * Ссылка: https://javarush.com/tasks/ru.javarush.java.core.level09.task07
 */

/*
 * // CodeGym
 * Task: Formatting a Table with Alignment
 * Link: https://codegym.cc/tasks/en.codegym.java.core.level09.task07
 */

/*
 * // JavaRush
 * Условие:
 * Вы создаёте систему складского учёта для большого супермаркета. Каждый день нужно печатать отчёты о поступлении товаров, и крайне важно, чтобы все данные — название товара, количество и вес — были аккуратно выровнены в колонках, создавая чёткую и легко читаемую таблицу, даже если это всего одна строка.
 * Ваша задача — объявить переменные для названия товара (String itemName = "Яблоки"), его количества (int itemCount = 7) и веса (double itemWeight = 1.234).
 * Затем, используя String.format, сформируйте и выведите на консоль строку, которая будет выглядеть как идеальная строка отчёта: название товара выровнено влево и занимает 10 символов, количество — вправо и 4 символа, а вес отображается с двумя знаками после запятой, занимая 5 символов. Примерно так: "Товар: [Яблоки ] | Кол-во: [ 7] | Вес: [ 1.23 кг]".
 */

/*
 * // JavaRush
 * Требования:
 * • В программе должны быть объявлены переменные: String itemName со значением "Яблоки", int itemCount со значением 7 и double itemWeight со значением 1.234.
 * • Для создания итоговой строки отчёта необходимо использовать метод String.format.
 * • Название товара (itemName) должно быть выровнено влево и занимать ровно 10 символов в итоговой строке.
 * • Количество товара (itemCount) должно быть выровнено вправо и занимать ровно 4 символа в итоговой строке.
 * • Вес товара (itemWeight) должен отображаться с двумя знаками после запятой и занимать ровно 5 символов в итоговой строке.
 * • Итоговая строка отчёта должна быть выведена на консоль.
 */

/*
 * // JavaRush
 * Черновик:
 * package ru.javarush.java.core.level09.task07;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Объявляем переменные с заданными значениями
 *         String itemName = "Яблоки"; // Название товара
 *         int itemCount = 7; // Количество товара
 *         double itemWeight = 1.234; // Вес товара
 *
 *         // Форматируем строку отчёта с помощью String.format
 *
 *
 *         // Выводим форматированную строку на консоль
 *
 *     }
 * }
 */

// JavaRush
package ru.javarush.java.core.level09.task07;

public class Solution {
    public static void main(String[] args) {
        // Объявляем переменные с заданными значениями
        String itemName = "Яблоки"; // Название товара
        int itemCount = 7; // Количество товара
        double itemWeight = 1.234; // Вес товара

        // Форматируем строку отчёта с помощью String.format
        String formattedString = String.format(
            "Товар: [%-10s] | Кол-во: [%4d] | Вес: [%5.2f кг]",
            itemName, itemCount, itemWeight
        );

        // Выводим форматированную строку на консоль
        System.out.println(formattedString);
    }
}

/*
 * // JavaRush
 * Правильное решение:
 * // Author: JavaRush's team
 * package ru.javarush.java.core.level09.task07;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Объявляем переменные с заданными значениями
 *         String itemName = "Яблоки"; // Название товара
 *         int itemCount = 7; // Количество товара
 *         double itemWeight = 1.234; // Вес товара
 *
 *         // Форматируем строку отчёта с помощью String.format
 *         String report = String.format(
 *             "Товар: [%-10s] | Кол-во: [%4d] | Вес: [%5.2f кг]",
 *             itemName, itemCount, itemWeight
 *         );
 *
 *         // Выводим форматированную строку на консоль
 *         System.out.println(report);
 *     }
 * }
 */