/*
 * Authors: JavaRush's team, CodeGym's team, Altavista360
 * Version: 1.0.0
 */

/*
 * // JavaRush
 * Задача: Битва с Двухголовым Драконом 🐉⚔️
 * Ссылка: https://javarush.com/tasks/ru.javarush.java.core.level05.task14
 */

/*
 * // CodeGym
 * Task: Battle with the Two-Headed Dragon 🐉⚔️
 * Link: https://codegym.cc/tasks/en.codegym.java.core.level05.task14
 */

/*
 * // JavaRush
 * Условие:
 * Вам предстоит сразиться с двухголовым драконом!
 * • У рыцаря (игрока) — 100 жизней.
 * • У дракона — 50 жизней, но у него две головы, и он бьёт дважды за один ход (каждая голова наносит один удар).
 * Правила игры:
 * 1. В начале боя компьютер загадывает число от 2 до 20 — это максимальная сила удара рыцаря, о которой вы не знаете.
 * 2. Бой проходит по ходам:
 *    • Ход рыцаря: введите число от 1 до 20 (сила удара).
 *      • Если число больше загаданного максимума → это промах, урон = 0.
 *      • Если число ≤ максимуму → отнимите это значение от жизней дракона.
 *    • Ход дракона: каждая голова наносит случайный урон от 1 до 10. Складываем два удара и отнимаем их от жизней рыцаря.
 * 3. После каждого хода программа выводит:
 *    • Жизни рыцаря: X
 *    • Жизни дракона: Y
 * 4. Игра идёт, пока здоровье одной стороны не станет 0 или меньше.
 *    • Если первым погибает дракон → вывести: Рыцарь победил!
 *    • Если первым погибает рыцарь → вывести: Дракон победил!
 */

/*
 * // JavaRush
 * Требования:
 * • У рыцаря должно быть 100 жизней, у дракона — 50 жизней.
 * • В начале игры компьютер загадывает число от 2 до 20 — это максимальная сила удара, при превышении которой у рыцаря будет промах.
 * • Игрок вводит число от 1 до 20. Если оно больше максимума — удар считается промахом (0 урона). Если ≤ максимуму — урон вычитается из жизней дракона.
 * • Дракон наносит два удара за ход. Каждый удар = случайное число от 1 до 10. Сумма этих ударов вычитается из жизней рыцаря.
 * • После каждого хода программа должна выводить количество жизней рыцаря и количество жизней дракона.
 * • Если здоровье дракона ≤ 0 → выводится Рыцарь победил!. Если здоровье рыцаря ≤ 0 → выводится Дракон победил!.
 */

/*
 * // JavaRush
 * Черновик:
 * package ru.javarush.java.core.level05.task14;
 *
 * import java.util.Random;
 * import java.util.Scanner;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Стартовые очки здоровья
 *         int knightHp = 100;
 *         int dragonHp = 50;
 *
 *         // Компьютер загадывает скрытый максимум удара рыцаря 2..20
 *         Random rand = new Random();
 *         int dragonMax = rand.nextInt(19) + 2;
 *
 *         // Ввод силы удара рыцаря
 *         Scanner console = new Scanner(System.in);
 *         System.out.println("Битва началась! У рыцаря 100 жизней, у дракона 50 жизней.");
 *
 *         // Основной боевой цикл
 *         while (true) {
 *             // Ход рыцаря: промах, если превышает скрытый максимум
 *
 *
 *             // Проверяем смерть дракона
 *
 *
 *             // Ход дракона: первая голова атакует
 *
 *
 *             // Ход дракона: вторая голова атакует
 *
 *
 *             // Текущий статус и проверка смерти рыцаря
 *
 *         }
 *     }
 * }
 */

// JavaRush
package ru.javarush.java.core.level05.task14;

import java.util.Random;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        // Стартовые очки здоровья
        int knightHp = 100;
        int dragonHp = 50;

        // Компьютер загадывает скрытый максимум удара рыцаря 2..20
        Random rand = new Random();
        int dragonMax = rand.nextInt(19) + 2;

        // Ввод силы удара рыцаря
        Scanner console = new Scanner(System.in);
        System.out.println("Битва началась! У рыцаря 100 жизней, у дракона 50 жизней.");

        // Основной боевой цикл
        while (true) {
            // Ход рыцаря: промах, если превышает скрытый максимум
            int foo;
            while (true) {
                System.out.print("Как сильно ударить дракона (1-20): ");
                foo = console.nextInt();
                if (foo >= 1 && foo <= 20) break;
                System.out.println("Введите корректное число.");
            }
            int bar;
            if (foo <= dragonMax) {
                bar = foo;
            }
            else {
                bar = 0;
            }
            if (bar == 0) {
                System.out.println("Промахнулись.");
            } else {
                 dragonHp -= bar;
                System.out.println("Вы успешно атаковали. Причинён ущерб на " + bar + " уровней жизни.");
            }

            // Проверяем смерть дракона
            if (dragonHp <= 0) {
                System.out.println("Жизни рыцаря: " + Math.max(0, knightHp));
                System.out.println("Жизни дракона: 0");
                System.out.println("Рыцарь победил!");
                break;
            }

            // Ход дракона: первая голова атакует
            int headFirst = rand.nextInt(10) + 1;
            knightHp = knightHp - headFirst;
            System.out.println("Первая голова дракона успешно атаковала. Причинён ущерб на " + headFirst + " уровней жизни.");

            // Ход дракона: вторая голова атакует
            int headSecond = rand.nextInt(10) + 1;
            knightHp = knightHp - headSecond;
            System.out.println("Вторая голова дракона успешно атаковала. Причинён ущерб на " + headSecond + " уровней жизни.");

            // Текущий статус и проверка смерти рыцаря
            System.out.println("Жизни рыцаря: " + Math.max(0, knightHp));
            System.out.println("Жизни дракона: " + Math.max(0, dragonHp));
            if (knightHp <= 0) {
                System.out.println("Дракон победил!");
                break;
            }
        }
    }
}

/*
 * // JavaRush
 * Правильное решение:
 * // Author: JavaRush's team
 * package ru.javarush.java.core.level05.task14;
 *
 * import java.util.Random;
 * import java.util.Scanner;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Стартовые очки здоровья
 *         int knightHp = 100;
 *         int dragonHp = 50;
 *
 *         // Компьютер загадывает скрытый максимум удара рыцаря 2..20
 *         Random rand = new Random();
 *         int dragonMax = rand.nextInt(19) + 2;
 *
 *         // Ввод силы удара рыцаря
 *         Scanner console = new Scanner(System.in);
 *         System.out.println("Битва началась! У рыцаря 100 жизней, у дракона 50 жизней.");
 *
 *         // Основной боевой цикл
 *         while (true) {
 *             // Ход рыцаря: промах, если превышает скрытый максимум
 *             int hit;
 *             while (true) {
 *                 System.out.print("Сила удара рыцаря (1-20): ");
 *                 hit = console.nextInt(); // ожидаем целое число
 *                 if (hit >= 1 && hit <= 20) break;
 *                 System.out.println("Введите число от 1 до 20.");
 *             }
 *             int dealt = (hit <= dragonMax) ? hit : 0;
 *             if (dealt == 0) {
 *                 System.out.println("Промах! Урон = 0");
 *             } else {
 *                 dragonHp -= dealt;
 *                 System.out.println("Рыцарь наносит " + dealt + " урона!");
 *             }
 *
 *             // Проверяем смерть дракона
 *             if (dragonHp <= 0) {
 *                 System.out.println("Жизни рыцаря: " + Math.max(0, knightHp));
 *                 System.out.println("Жизни дракона: 0");
 *                 System.out.println("Рыцарь победил!");
 *                 break;
 *             }
 *
 *             // Ход дракона: первая голова атакует
 *             int d1 = rand.nextInt(10) + 1;
 *             knightHp -= d1;
 *             System.out.println("Первая голова дракона наносит удар: " + d1 + " урона.");
 *
 *             // Ход дракона: вторая голова атакует
 *             int d2 = rand.nextInt(10) + 1;
 *             knightHp -= d2;
 *             System.out.println("Вторая голова дракона наносит удар: " + d2 + " урона.");
 *
 *             // Текущий статус и проверка смерти рыцаря
 *             System.out.println("Жизни рыцаря: " + Math.max(0, knightHp));
 *             System.out.println("Жизни дракона: " + Math.max(0, dragonHp));
 *             if (knightHp <= 0) {
 *                 System.out.println("Дракон победил!");
 *                 break;
 *             }
 *         }
 *     }
 * }
 */