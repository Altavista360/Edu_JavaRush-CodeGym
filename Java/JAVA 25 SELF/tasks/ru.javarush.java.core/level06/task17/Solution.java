/*
 * Authors: JavaRush's team, CodeGym's team, Altavista360
 * Version: 1.0.0
 */

/*
 * // JavaRush
 * Задача: Подсчёт целых предметов из общей массы 📦
 * Ссылка: https://javarush.com/tasks/ru.javarush.java.core.level06.task17
 */

/*
 * // CodeGym
 * Task: Counting whole items from total weight 📦
 * Link: https://codegym.cc/tasks/en.codegym.java.core.level06.task17
 */

/*
 * // JavaRush
 * Условие:
 * Представьте, что вы на складе и получили огромную партию какого-то материала, измеряемого в килограммах. Вам нужно узнать, сколько целых предметов можно изготовить из этой массы, если каждый предмет весит определённую часть килограмма.
 * У вас есть общая масса, например, 7.89 килограмма. Объявите переменную типа double с именем totalMaterialWeight и присвойте ей значение 7.89.
 * Ваша задача — узнать, сколько полных предметов можно получить, отбросив дробную часть. Явно преобразуйте значение totalMaterialWeight к типу int и сохраните результат в переменной completeItemsCount. Затем выведите полученное количество целых предметов на экран.
 */

/*
 * // JavaRush
 * Требования:
 * • В программе должна быть объявлена переменная типа double с именем totalMaterialWeight, которой присвоено значение 7.89.
 * • Значение переменной totalMaterialWeight должно быть явно приведено к типу int.
 * • Результат преобразования должен быть сохранён в переменной completeItemsCount типа int.
 * • На экран должно быть выведено значение переменной completeItemsCount.
 */

/*
 * // JavaRush
 * Черновик:
 * package ru.javarush.java.core.level06.task17;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Общая масса материала в килограммах
 *
 *
 *         // Явно приводим double к int — дробная часть отбрасывается
 *
 *
 *         // Выводим количество целых предметов
 *
 *     }
 * }
 */

// JavaRush
package ru.javarush.java.core.level06.task17;

public class Solution {
    public static void main(String[] args) {
        // Общая масса материала в килограммах
        double totalMaterialWeight = 7.89;

        // Явно приводим double к int — дробная часть отбрасывается
        int completeItemsCount = (int) totalMaterialWeight;

        // Выводим количество целых предметов
        System.out.println(completeItemsCount);
    }
}

/*
 * // JavaRush
 * Правильное решение:
 * // Author: JavaRush's team
 * package ru.javarush.java.core.level06.task17;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Общая масса материала в килограммах
 *         double totalMaterialWeight = 7.89;
 *
 *         // Явно приводим double к int — дробная часть отбрасывается
 *         int completeItemsCount = (int) totalMaterialWeight;
 *
 *         // Выводим количество целых предметов
 *         System.out.println(completeItemsCount);
 *     }
 * }
 */