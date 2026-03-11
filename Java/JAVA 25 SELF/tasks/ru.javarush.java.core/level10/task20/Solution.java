/*
 * Authors: JavaRush's team, CodeGym's team, Altavista360
 * Version: 1.0.0
 */

/*
 * // JavaRush
 * Задача: Автоматическое присвоение оценок студентам 🎓
 * Ссылка: https://javarush.com/tasks/ru.javarush.java.core.level10.task20
 */

/*
 * // CodeGym
 * Task: Automatic assignment of student grades 🎓
 * Link: https://codegym.cc/tasks/en.codegym.java.core.level10.task20
 */

/*
 * // JavaRush
 * Условие:
 * Вы работаете над системой оценивания в учебном заведении. На основе числовых баллов студентов вам нужно автоматически присваивать им текстовые оценки. Некоторые оценки могут соответствовать нескольким числовым баллам.
 * Создайте переменную int studentScore и присвойте ей значение 9. Используйте switch-выражение нового стиля с возможностью указания нескольких значений в одном case для присвоения строковой переменной finalGrade следующих оценок:
 * • "Хорошо" — если studentScore равен 5, 6 или 7.
 * • "Отлично" — если studentScore равен 8, 9 или 10.
 * • "Нужно постараться" — для любого другого значения.
 * После определения, выведите finalGrade на экран.
 */

/*
 * // JavaRush
 * Требования:
 * • В программе должна быть объявлена переменная int с именем studentScore и значением 9.
 * • Для определения оценки по баллу должно быть использовано switch-выражение (а не классический switch-блок) с возможностью объединения нескольких значений в одном case.
 * • В switch-выражении case 5, 6, 7 должен присваивать "Хорошо", case 8, 9, 10 — "Отлично", а для всех остальных значений должна присваиваться строка "Нужно постараться".
 * • Результат работы switch-выражения должен быть присвоен строковой переменной с именем finalGrade.
 * • Программа должна вывести значение переменной finalGrade на экран.
 */

/*
 * // JavaRush
 * Черновик:
 * package ru.javarush.java.core.level10.task20;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Объявляем балл студента
 *         int studentScore = 9;
 *
 *         // Новое switch-выражение: возвращает значение, а не просто выполняет блок кода.
 *
 *
 *         // Выводим итоговую оценку на экран
 *
 *     }
 * }
 */

// JavaRush
package ru.javarush.java.core.level10.task20;

public class Solution {
    public static void main(String[] args) {
        // Объявляем балл студента
        int studentScore = 9;

        // Новое switch-выражение: возвращает значение, а не просто выполняет блок кода.
        String finalGrade = switch (studentScore) {
            case 5, 6, 7 -> "Хорошо";
            case 8, 9, 10 -> "Отлично";
            default -> "Нужно постараться";
        };

        // Выводим итоговую оценку на экран
        System.out.println(finalGrade);
    }
}

/*
 * // JavaRush
 * Правильное решение:
 * // Author: JavaRush's team
 * package ru.javarush.java.core.level10.task20;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Объявляем балл студента
 *         int studentScore = 9;
 *
 *         // Новое switch-выражение: возвращает значение, а не просто выполняет блок кода.
 *         String finalGrade = switch (studentScore) {
 *             case 5, 6, 7 -> "Хорошо";
 *             case 8, 9, 10 -> "Отлично";
 *             default -> "Нужно постараться";
 *         };
 *
 *         // Выводим итоговую оценку на экран
 *         System.out.println(finalGrade);
 *     }
 * }
 */