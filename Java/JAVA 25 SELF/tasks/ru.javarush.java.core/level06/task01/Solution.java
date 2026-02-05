/*
 * Authors: JavaRush's team, CodeGym's team, Altavista360
 * Version: 1.0.0
 */

/*
 * // JavaRush
 * Задача: Создание инвентаря для героя RPG 🎮
 * Ссылка: https://javarush.com/tasks/ru.javarush.java.core.level06.task01
 */

/*
 * // CodeGym
 * Task: Creating an RPG Hero's Inventory 🎮
 * Link: https://codegym.cc/tasks/en.codegym.java.core.level06.task01
 */

/*
 * // JavaRush
 * Условие:
 * Представьте, что вы — разработчик новой, захватывающей ролевой игры. Вам нужно создать базовый инвентарь для вашего первого героя, чтобы отслеживать его характеристики. Для этого объявите несколько переменных с различными числовыми типами и присвойте им стартовые значения.
 * Создайте переменную byte characterLevel для уровня персонажа, short armorRating для показателя брони, int experiencePoints для накопленного опыта, long goldCoins для несметных сокровищ, float magicResistance для сопротивления магии (может быть дробным!), и double criticalHitChance для шанса критического удара (требует высокой точности).
 * После присвоения значений с гордостью выведите всю эту жизненно важную статистику на экран, убедившись, что каждая из них отображается на новой строке, чтобы каждый мог восхититься силой вашего героя!
 */

/*
 * // JavaRush
 * Требования:
 * • В программе должны быть объявлены переменные: characterLevel типа byte, armorRating типа short, experiencePoints типа int, goldCoins типа long, magicResistance типа float, criticalHitChance типа double.
 * • Каждой из перечисленных переменных должно быть присвоено стартовое значение.
 * • Все переменные должны быть выведены на экран.
 * • Каждая переменная должна выводиться на отдельной строке.
 */

/*
 * // JavaRush
 * Черновик:
 * package ru.javarush.java.core.level06.task01;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Объявляем уровень персонажа (тип byte)
 *
 *         // Объявляем показатель брони (тип short)
 *
 *         // Объявляем накопленный опыт (тип int)
 *
 *         // Объявляем количество золотых монет (тип long)
 *
 *         // Объявляем сопротивление магии (тип float)
 *
 *         // Объявляем шанс критического удара (тип double)
 *
 *
 *         // Выводим каждую характеристику героя на новой строке
 *
 *
 *
 *
 *
 *     }
 * }
 */

// JavaRush
package ru.javarush.java.core.level06.task01;

public class Solution {
    public static void main(String[] args) {
        // Объявляем уровень персонажа (тип byte)
        byte characterLevel = 7;
        // Объявляем показатель брони (тип short)
        short armorRating = 85;
        // Объявляем накопленный опыт (тип int)
        int experiencePoints = 2200;
        // Объявляем количество золотых монет (тип long)
        long goldCoins = 1002003004005L;
        // Объявляем сопротивление магии (тип float)
        float magicResistance = 0.5f;
        // Объявляем шанс критического удара (тип double)
        double criticalHitChance = 0.2;

        // Выводим каждую характеристику героя на новой строке
        System.out.println(characterLevel);
        System.out.println(armorRating);
        System.out.println(experiencePoints);
        System.out.println(goldCoins);
        System.out.println(magicResistance);
        System.out.println(criticalHitChance);
    }
}

/*
 * // JavaRush
 * Правильное решение:
 * // Author: JavaRush's team
 * package ru.javarush.java.core.level06.task01;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Объявляем уровень персонажа (тип byte)
 *         byte characterLevel = 5;
 *         // Объявляем показатель брони (тип short)
 *         short armorRating = 50;
 *         // Объявляем накопленный опыт (тип int)
 *         int experiencePoints = 1200;
 *         // Объявляем количество золотых монет (тип long)
 *         long goldCoins = 10000L;
 *         // Объявляем сопротивление магии (тип float)
 *         float magicResistance = 0.75f;
 *         // Объявляем шанс критического удара (тип double)
 *         double criticalHitChance = 0.25;
 *
 *         // Выводим каждую характеристику героя на новой строке
 *         System.out.println(characterLevel);
 *         System.out.println(armorRating);
 *         System.out.println(experiencePoints);
 *         System.out.println(goldCoins);
 *         System.out.println(magicResistance);
 *         System.out.println(criticalHitChance);
 *     }
 * }
 */