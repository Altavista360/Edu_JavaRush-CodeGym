/*
 * Authors: JavaRush's team, CodeGym's team, Altavista360
 * Version: 1.0.0
 */

/*
 * // JavaRush
 * Задача: Сравнение строк без учёта регистра
 * Ссылка: https://javarush.com/tasks/ru.javarush.java.core.level09.task13
 */

/*
 * // CodeGym
 * Task: Case-insensitive string comparison
 * Link: https://codegym.cc/tasks/en.codegym.java.core.level09.task13
 */

/*
 * // JavaRush
 * Условие:
 * Сравнение строк без учёта регистра
 * Представьте, что вы — хранитель замка, который разрабатывает логин-систему для важного портала. Пользователи могут вводить свои имена или пароли с разным регистром (например, "admin" или "ADMIN"). Чтобы система была дружелюбной и не заставляла пользователя перепечатывать, вы хотите, чтобы сравнение не учитывало регистр букв.
 * Ваша задача — объявить две переменные типа String: одну со значением "Hello", другую — "HELLO". Используйте метод equalsIgnoreCase() для их сравнения, чтобы узнать, считаются ли они одинаковыми, игнорируя различия в регистре. Выведите результат этого "мягкого" сравнения на экран.
 */

/*
 * // JavaRush
 * Требования:
 * • В программе должны быть объявлены две переменные типа String: одна со значением "Hello", другая со значением "HELLO".
 * • Для сравнения двух строк должно быть использовано именно сравнение с помощью метода equalsIgnoreCase().
 * • Метод equalsIgnoreCase() должен применяться к одной из строк с передачей второй строки в качестве аргумента, чтобы сравнить их без учёта регистра символов.
 * • Результат сравнения (true или false) должен быть выведен на экран.
 */

/*
 * // JavaRush
 * Черновик:
 * package ru.javarush.java.core.level09.task13;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Объявляем две строки в разном регистре
 *         String s1 = "Hello";
 *         String s2 = "HELLO";
 *
 *         // Сравниваем строки без учета регистра с помощью equalsIgnoreCase()
 *
 *
 *         // Выводим результат сравнения (true или false)
 *
 *     }
 * }
 */

// JavaRush
package ru.javarush.java.core.level09.task13;

public class Solution {
    public static void main(String[] args) {
        // Объявляем две строки в разном регистре
        String s1 = "Hello";
        String s2 = "HELLO";

        // Сравниваем строки без учета регистра с помощью equalsIgnoreCase()
        boolean compare = s1.equalsIgnoreCase(s2);

        // Выводим результат сравнения (true или false)
        System.out.println(compare);
    }
}

/*
 * // JavaRush
 * Правильное решение:
 * // Author: JavaRush's team
 * package ru.javarush.java.core.level09.task13;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Объявляем две строки в разном регистре
 *         String s1 = "Hello";
 *         String s2 = "HELLO";
 *
 *         // Сравниваем строки без учета регистра с помощью equalsIgnoreCase()
 *         boolean result = s1.equalsIgnoreCase(s2);
 *
 *         // Выводим результат сравнения (true или false)
 *         System.out.println(result);
 *     }
 * }
 */