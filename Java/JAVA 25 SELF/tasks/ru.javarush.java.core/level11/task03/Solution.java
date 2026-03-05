/*
 * Authors: JavaRush's team, CodeGym's team, Altavista360
 * Version: 1.0.0
 */

/*
 * // JavaRush
 * Задача: Возраст игрока: "двадцать" вместо 20 🎮
 * Ссылка: https://javarush.com/tasks/ru.javarush.java.core.level11.task03
 */

/*
 * // CodeGym
 * Task: Player age: "twenty" instead of 20 🎮
 * Link: https://codegym.cc/tasks/en.codegym.java.core.level11.task03
 */

/*
 * // JavaRush
 * Условие:
 * Возраст игрока: "двадцать" вместо 20 🎮
 * Представьте, что вы пишете фрагмент программы для онлайн-формы регистрации игроков, где каждый должен ввести свой возраст. К сожалению, иногда игроки, вместо чисел, вводят текстовые значения, вроде "двадцать" или "abc".
 * Ваша задача – смоделировать такую ситуацию. Объявите строковую переменную String playerAgeInput и присвойте ей значение "abc". Теперь попробуйте с помощью метода Integer.parseInt преобразовать эту строку в целое число и вывести результат на экран. Увидите, что произойдет, когда Java пытается осмыслить, что же такое "abc" в мире чисел.
 */

/*
 * // JavaRush
 * Требования:
 * • Необходимо объявить переменную типа String с именем playerAgeInput.
 * • Переменной playerAgeInput должно быть присвоено значение "abc".
 * • Следует попытаться преобразовать значение переменной playerAgeInput в целое число с помощью метода Integer.parseInt.
 * • Результат преобразования (или возникшее исключение) должен быть выведен на экран.
 * • В результате попытки преобразования строки "abc" в число должно возникнуть исключение NumberFormatException.
 */

/*
 * // JavaRush
 * Черновик:
 * package ru.javarush.java.core.level11.task03;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Объявляем строковую переменную playerAgeInput и присваиваем ей некорректное число
 *
 *
 *         // Пытаемся преобразовать строку в целое число и вывести результат.
 *         // При выполнении Integer.parseInt будет выброшено исключение NumberFormatException,
 *         // поскольку "abc" не является корректным представлением целого числа.
 *
 *     }
 * }
 */

// JavaRush
package ru.javarush.java.core.level11.task03;

public class Solution {
    public static void main(String[] args) {
        // Объявляем строковую переменную playerAgeInput и присваиваем ей некорректное число
        String playerAgeInput = "abc";

        // Пытаемся преобразовать строку в целое число и вывести результат.
        // При выполнении Integer.parseInt будет выброшено исключение NumberFormatException,
        // поскольку "abc" не является корректным представлением целого числа.
        System.out.println(Integer.parseInt(playerAgeInput));
    }
}

/*
 * // JavaRush
 * Правильное решение:
 * // Author: JavaRush's team
 * package ru.javarush.java.core.level11.task03;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Объявляем строковую переменную playerAgeInput и присваиваем ей некорректное число
 *         String playerAgeInput = "abc";
 *
 *         // Пытаемся преобразовать строку в целое число и вывести результат.
 *         // При выполнении Integer.parseInt будет выброшено исключение NumberFormatException,
 *         // поскольку "abc" не является корректным представлением целого числа.
 *         System.out.println(Integer.parseInt(playerAgeInput));
 *     }
 * }
 */