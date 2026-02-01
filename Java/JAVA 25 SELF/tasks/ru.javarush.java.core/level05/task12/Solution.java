/*
 * Authors: JavaRush's team, CodeGym's team, Altavista360
 * Version: 1.0.0
 */

/*
 * // JavaRush
 * Задача: Охота на дракона 🐉🔥
 * Ссылка: https://javarush.com/tasks/ru.javarush.java.core.level05.task12
 */

/*
 * // CodeGym
 * Task: Dragon Hunt 🐉🔥
 * Link: https://codegym.cc/tasks/en.codegym.java.core.level05.task12
 */

/*
 * // JavaRush
 * Условие:
 * В подземелье прячется дракон с 50 жизнями. У храброго рыцаря есть лишь 10 ударов, чтобы его победить.
 * Правила боя:
 * 1. Каждый ход программа спрашивает у рыцаря, какой урон (число от 1 до 10) нанести.
 * 2. Из здоровья дракона вычитается это число.
 * 3. Если жизни дракона стали 0 или меньше — программа выводит: Дракон повержен!
 * 4. Если удары закончились, а дракон всё ещё жив — программа сообщает: Рыцарь проиграл!
 */

/*
 * // JavaRush
 * Требования:
 * • Установить здоровье дракона = 50, количество ударов рыцаря = 10.
 * • На каждом ходу программа должна запрашивать у пользователя число от 1 до 10.
 * • Значение удара вычитается из текущего здоровья дракона.
 * • Если здоровье дракона ≤ 0, программа выводит Дракон повержен! и завершает выполнение.
 * • После каждого удара уменьшается счётчик оставшихся ударов рыцаря.
 * • Если удары закончились, а здоровье дракона > 0, программа выводит Рыцарь проиграл!.
 */

/*
 * // JavaRush
 * Черновик:
 * package ru.javarush.java.core.level05.task12;
 *
 * import java.util.Scanner;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         int dragonHp = 50;
 *         int knightHits = 10;
 *         Scanner console = new Scanner(System.in);
 *         System.out.print("Вы напали на спящего дракона - дракон расстроился");
 *
 *         // цикл боя
 *         while (knightHits > 0 && dragonHp > 0) {
 *             // Игрок указывает силу удара
 *             System.out.print("Сила удара (1-10): ");
 *
 *             // Если слишком сильно или слишком слабо - то промах
 *
 *
 *             // отнимаем жизнь у дракона и ход у игрока
 *
 *
 *             // проверка, что дракон побежден
 *
 *         }
 *
 *         //проверка, что рыцарь проиграл
 *
 *     }
 * }
 */

// JavaRush
package ru.javarush.java.core.level05.task12;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        int dragonHp = 50;
        int knightHits = 10;
        Scanner console = new Scanner(System.in);
        System.out.print("Вы напали на спящего дракона - дракон расстроился");

        // цикл боя
        while (knightHits > 0 && dragonHp > 0) {
            // Игрок указывает силу удара
            System.out.print("Сила удара (1-10): ");

            // Если слишком сильно или слишком слабо - то промах
            int inputDamage = console.nextInt();
            if (inputDamage < 1 || inputDamage > 10) {
                System.out.println("Промах!.");
                continue;
            }

            // отнимаем жизнь у дракона и ход у игрока
            dragonHp = dragonHp - inputDamage;
            knightHits = knightHits - 1;

            // проверка, что дракон побежден
            if (dragonHp <= 0) {
                System.out.print("Дракон повержен!");
                return;
            }
        }

        //проверка, что рыцарь проиграл
        if (dragonHp > 0) {
            System.out.print("Рыцарь проиграл!");
        }
    }
}

/*
 * // JavaRush
 * Правильное решение:
 * // Author: JavaRush's team
 * package ru.javarush.java.core.level05.task12;
 *
 * import java.util.Scanner;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         int dragonHp = 50;
 *         int knightHits = 10;
 *         Scanner console = new Scanner(System.in);
 *         System.out.print("Вы напали на спящего дракона - дракон расстроился");
 *
 *         // цикл боя
 *         while (knightHits > 0 && dragonHp > 0) {
 *             // Игрок указывает силу удара
 *             System.out.print("Сила удара (1-10): ");
 *
 *             // Если слишком сильно или слишком слабо - то промах
 *             int dmg = console.nextInt();
 *             if (dmg < 1 || dmg > 10) {
 *                 System.out.println("Вы промахнулись.");
 *                 continue;
 *             }
 *
 *             // отнимаем жизнь у дракона и ход у игрока
 *             dragonHp -= dmg;
 *             knightHits--;
 *
 *             // проверка, что дракон побежден
 *             if (dragonHp <= 0) {
 *                 System.out.println("Дракон повержен!");
 *                 return;
 *             }
 *         }
 *
 *         //проверка, что рыцарь проиграл
 *         if (dragonHp > 0) {
 *             System.out.println("Рыцарь проиграл!");
 *         }
 *     }
 * }
 */