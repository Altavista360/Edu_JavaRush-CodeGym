/*
 * Authors: JavaRush's team, CodeGym's team, Altavista360
 * Version: 1.0.0
 */

/*
 * // JavaRush
 * Задача: Профиль игрового персонажа 🎮
 * Ссылка: https://javarush.com/tasks/ru.javarush.java.core.level02.task13
 */

/*
 * // CodeGym
 * Task: Game character profile 🎮
 * Link: https://codegym.cc/tasks/en.codegym.java.core.level02.task13
 */

/*
 * // JavaRush
 * Условие:
 * Представьте, что вы создаете профиль для игрового персонажа. Объявите четыре переменные разных типов, чтобы хранить информацию о нём:
 * • byte для его уровня (level)
 * • int для количества золота (goldAmount)
 * • double для его рейтинга (rating)
 * • String для имени (characterName)
 * Присвойте им любые значения и выведите все данные на экран.
 */

/*
 * // JavaRush
 * Требования:
 * • В программе должны быть объявлены четыре переменные: одна типа byte (level), одна типа int (goldAmount), одна типа double (rating), одна типа String (characterName).
 * • Каждой из переменных должно быть присвоено некоторое значение.
 * • Переменные должны иметь имена: level, goldAmount, rating, characterName.
 * • Все четыре значения переменных должны быть выведены на экран.
 */

/*
 * // JavaRush
 * Черновик:
 * package ru.javarush.java.core.level02.task13;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Объявляем переменные с информацией о персонаже
 *
 *
 *         // Выводим все данные на экран
 *
 *
 *     }
 * }
 */

// JavaRush
package ru.javarush.java.core.level02.task13;

public class Solution {
    public static void main(String[] args) {
        // Объявляем переменные с информацией о персонаже
        byte level = 100;
        int goldAmount = 1976;
        double rating = 0.75148;
        String characterName = "Rocky";

        // Выводим все данные на экран
        System.out.println(level);
        System.out.println(goldAmount);
        System.out.println(rating);
        System.out.println(characterName);
    }
}

/*
 * // JavaRush
 * Правильное решение:
 * // Author: JavaRush's team
 * package ru.javarush.java.core.level02.task13;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Объявляем переменные с информацией о персонаже
 *         byte level = 12;                 // Уровень персонажа (подходит тип byte)
 *         int goldAmount = 3450;           // Количество золота
 *         double rating = 4.7;             // Рейтинг персонажа
 *         String characterName = "Aria";   // Имя персонажа
 *
 *         // Выводим все данные на экран
 *         System.out.println("Имя: " + characterName);
 *         System.out.println("Уровень: " + level);
 *         System.out.println("Золото: " + goldAmount);
 *         System.out.println("Рейтинг: " + rating);
 *     }
 * }
 */