/*
 * Authors: JavaRush's team, CodeGym's team, Altavista360
 * Version: 1.0.0
 */

/*
 * // JavaRush
 * Задача: Сезонные поздравления в приложении 🌸☀️🍁❄️
 * Ссылка: https://javarush.com/tasks/ru.javarush.java.core.level10.task14
 */

/*
 * // CodeGym
 * Task: Seasonal greetings in the app 🌸☀️🍁❄️
 * Link: https://codegym.cc/tasks/en.codegym.java.core.level10.task14
 */

/*
 * // JavaRush
 * Условие:
 * Вы разрабатываете приложение, которое меняет фон или сообщение в зависимости от текущего времени года. Пользователю всегда приятно получать персонализированное послание.
 * Для этого сначала объявите перечисление Season с четырьмя значениями: WINTER, SPRING, SUMMER, AUTUMN.
 * В методе main создайте переменную типа Season и присвойте ей значение SUMMER, так как сейчас, допустим, наступило лето.
 * Используйте оператор switch, чтобы для каждого времени года вывести на экран уникальное и жизнерадостное сообщение. Например, для SUMMER это может быть "Лето — время отпусков!", для WINTER — "Пора кататься на лыжах!", и так далее.
 */

/*
 * // JavaRush
 * Требования:
 * • В программе должно быть объявлено перечисление (enum) с именем Season, содержащим четыре значения: WINTER, SPRING, SUMMER, AUTUMN.
 * • В методе main должна быть создана переменная типа Season.
 * • Переменной типа Season в методе main должно быть присвоено значение SUMMER.
 * • В методе main должен использоваться оператор switch для обработки значения переменной типа Season.
 * • Для каждого значения перечисления Season в операторе switch должно выводиться уникальное сообщение, соответствующее времени года.
 */

/*
 * // JavaRush
 * Черновик:
 * package ru.javarush.java.core.level10.task14;
 *
 * // Перечисление с четырьмя временами года
 *
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Создаем переменную типа Season и присваиваем ей значение SUMMER
 *
 *
 *         // Для каждого сезона выводим свое жизнерадостное сообщение
 *
 *     }
 * }
 */

// JavaRush
package ru.javarush.java.core.level10.task14;

// Перечисление с четырьмя временами года
enum Season {
    SPRING, SUMMER, AUTUMN, WINTER
}

public class Solution {
    public static void main(String[] args) {
        // Создаем переменную типа Season и присваиваем ей значение SUMMER
        Season currentSeason = Season.SUMMER;

        // Для каждого сезона выводим свое жизнерадостное сообщение
        switch (currentSeason) {
            case SPRING:
                System.out.println("Весна — наконец стало теплее!");
                break;
            case SUMMER:
                System.out.println("Лето — время отпусков!");
                break;
            case AUTUMN:
                System.out.println("Осень — время для долгих прогулок!");
                break;
            case WINTER:
                System.out.println("Зима — пора кататься на лыжах!");
                break;
        }
    }
}

/*
 * // JavaRush
 * Правильное решение:
 * // Author: JavaRush's team
 * package ru.javarush.java.core.level10.task14;
 *
 * // Перечисление с четырьмя временами года
 * enum Season {
 *     WINTER, SPRING, SUMMER, AUTUMN
 * }
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Создаем переменную типа Season и присваиваем ей значение SUMMER
 *         Season currentSeason = Season.SUMMER;
 *
 *         // Для каждого сезона выводим свое жизнерадостное сообщение
 *         switch (currentSeason) {
 *             case WINTER:
 *                 System.out.println("Зима — пора кататься на лыжах!");
 *                 break;
 *             case SPRING:
 *                 System.out.println("Весна — всё вокруг расцветает!");
 *                 break;
 *             case SUMMER:
 *                 System.out.println("Лето — время отпусков и тёплых вечеров!");
 *                 break;
 *             case AUTUMN:
 *                 System.out.println("Осень — золотые листья и уютные прогулки!");
 *                 break;
 *         }
 *     }
 * }
 */