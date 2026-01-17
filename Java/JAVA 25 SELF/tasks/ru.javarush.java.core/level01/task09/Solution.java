/*
 * Authors: JavaRush's team, CodeGym's team, Altavista360
 * Version: 1.0.0
 */

/*
 * // JavaRush
 * Задача: Вычисление стоимости заказа 🛍️
 * Ссылка: https://javarush.com/tasks/ru.javarush.java.core.level01.task09
 */

/*
 * // CodeGym
 * Task: Calculating the order cost 🛍️
 * Link: https://codegym.cc/tasks/en.codegym.java.core.level01.task09
 */

/*
 * // JavaRush
 * Условие:
 * Вы рассчитываете стоимость заказа в магазине. Объявите три переменные типа int: itemPrice со значением 4, itemCount со значением 3, discount со значением 2.
 * Создайте переменную totalCost, в которую запишите значение выражения (itemPrice + itemCount) * discount.
 * После этого создайте переменную finalMessage типа String, в которую вы запишете строку "Итоговая стоимость: " + totalCost, и выведите её на экран.
 */

/*
 * // CodeGym
 * Condition:
 * You are calculating the order cost in a shop. Declare three variables of type int: itemPrice with value 4, itemCount with value 3, discount with value 2.
 * Create a variable totalCost, and assign it the value of the expression (itemPrice + itemCount) * discount.
 * After that create a variable finalMessage of type String, in which you will write the string "Final cost: " + totalCost, and print it to the screen.
 */

/*
 * // JavaRush
 * Требования:
 * • В программе должны быть объявлены три переменные типа int: itemPrice, itemCount и discount.
 * • Переменным itemPrice, itemCount и discount должны быть присвоены значения 4, 3 и 2 соответственно.
 * • Должна быть объявлена переменная totalCost, в которую записывается результат выражения (itemPrice + itemCount) * discount.
 * • Должна быть объявлена переменная finalMessage типа String.
 */

/*
 * // CodeGym
 * Requirements:
 * • The program must declare three int variables: itemPrice, itemCount and discount.
 * • The variables itemPrice, itemCount and discount must be assigned the values 4, 3 and 2 respectively.
 * • A variable totalCost must be declared and assigned the result of the expression (itemPrice + itemCount) * discount.
 * • A variable finalMessage of type String must be declared.
 * • The variable finalMessage must be assigned the string "Final cost: " + totalCost.
 * • The program must print the contents of the variable finalMessage to the screen.
 */

/*
 * // JavaRush
 * Черновик:
 * package ru.javarush.java.core.level01.task09;
 *
 * public class Solution
 * {
 *     public static void main(String[] args)
 *     {
 *         // Объявляем переменные типа int и присваиваем им значения
 *
 *
 *         // Вычисляем итоговую стоимость заказа
 *
 *
 *         // Формируем итоговое сообщение
 *
 *
 *         // Выводим итоговое сообщение на экран
 *
 *     }
 * }
 */

/*
 * // CodeGym
 * Draft:
 * package en.codegym.java.core.level01.task09;
 *
 * public class Solution
 * {
 *     public static void main(String[] args)
 *     {
 *         // Declare int variables and assign them values
 *
 *
 *         // Calculate the total order cost
 *
 *
 *         // Form the final message
 *
 *
 *         // Print the final message to the screen
 *
 *     }
 * }
 */

// JavaRush
package ru.javarush.java.core.level01.task09;

public class Solution
{
    public static void main(String[] args)
    {
        // Объявляем переменные типа int и присваиваем им значения
        int itemPrice = 4;
        int itemCount = 3;
        int discount = 2;

        // Вычисляем итоговую стоимость заказа
        int totalCost = (itemPrice + itemCount) * discount;
        // totalCost = (itemPrice * itemCount) * (1 - discount / 100) // согласно правильной логике, при условии что скидка указана в процентах

        // Формируем итоговое сообщение
        String finalMessage = "Итоговая стоимость: " + totalCost;

        // Выводим итоговое сообщение на экран
        System.out.println (finalMessage);
    }
}

/*
// CodeGym
package en.codegym.java.core.level01.task09;

public class Solution
{
    public static void main(String[] args)
    {
        // Declare int variables and assign them values
        int itemPrice = 4;
        int itemCount = 3;
        int discount = 2;

        // Calculate the total order cost
        int totalCost = (itemPrice + itemCount) * discount;
        // totalCost = (itemPrice * itemCount) * (1 - discount / 100) // according to correct logic, provided that the discount is indicated as a percentage

        // Form the final message
        String finalMessage = "Final cost: " + totalCost;

        // Print the final message to the screen
        System.out.println (finalMessage);
    }
}
*/

/*
 * // JavaRush
 * Правильное решение:
 * // Author: JavaRush's team
 * package ru.javarush.java.core.level01.task09;
 *
 * public class Solution
 * {
 *     public static void main(String[] args)
 *     {
 *         // Объявляем переменные типа int и присваиваем им значения
 *         int itemPrice = 4; // Цена одного товара
 *         int itemCount = 3; // Количество товаров
 *         int discount = 2;  // Скидка
 *
 *         // Вычисляем итоговую стоимость заказа
 *         int totalCost = itemPrice * itemCount - discount;
 *
 *         // Формируем итоговое сообщение
 *         String finalMessage = "Итоговая стоимость: " + totalCost;
 *
 *         // Выводим итоговое сообщение на экран
 *         System.out.println(finalMessage);
 *     }
 * }
 */

/*
 * // CodeGym
 * Correct solution:
 * // Author: CodeGym's team
 * package en.codegym.java.core.level01.task09;
 *
 * public class Solution
 * {
 *     public static void main(String[] args)
 *     {
 *         // Declare int variables and assign them values
 *         int itemPrice = 4; // Price of a single item
 *         int itemCount = 3; // Number of items
 *         int discount = 2;  // Discount
 *
 *         // Calculate the total order cost
 *         int totalCost = (itemPrice + itemCount) * discount;
 *
 *         // Form the final message
 *         String finalMessage = "Final cost: " + totalCost;
 *
 *         // Print the final message to the screen
 *         System.out.println(finalMessage);
 *     }
 * }
 */