/*
 * Authors: JavaRush's team, CodeGym's team, Altavista360
 * Version: 1.0.0
 */

/*
 * // JavaRush
 * Задача: Подсчет общего балла за все тесты студента 📚
 * Ссылка: https://javarush.com/tasks/ru.javarush.java.core.level08.task12
 */

/*
 * // CodeGym
 * Task: Calculating the student's total score across all tests 📚
 * Link: https://codegym.cc/tasks/en.codegym.java.core.level08.task12
 */

/*
 * // JavaRush
 * Условие:
 * Вообразите, что вы — учитель, который ведет электронный журнал успеваемости студентов, и вам нужно быстро подсчитать общую сумму баллов за все тесты для конкретного ученика. Вам нужен автоматический помощник, который справится с этой трудоемкой задачей.
 * Сконструируйте метод под названием calculateTotalGrades. Он будет принимать в качестве единственного параметра studentExamResults — это будет массив целых чисел, представляющий оценки студента за различные экзамены.
 * Задача calculateTotalGrades — пройти по всем оценкам в массиве, сложить их вместе и вернуть окончательную сумму.
 * В вашем учительском кабинете, в методе main, создайте виртуальный список оценок для студента, например, currentGrades = {5, 4, 3, 5, 4}. Затем вызовите calculateTotalGrades, передав ему этот список. Сохраните полученную итоговую сумму в переменную finalTotalPoints и с удовлетворением выведите на экран: "Сумма всех оценок: " с указанием finalTotalPoints.
 */

/*
 * // JavaRush
 * Требования:
 * • Метод calculateTotalGrades должен быть объявлен с возвращаемым типом int и возвращать сумму баллов.
 * • Метод calculateTotalGrades должен принимать один параметр — массив целых чисел (int[]), представляющий оценки студента.
 * • Метод calculateTotalGrades должен корректно просуммировать все элементы переданного массива.
 * • Метод calculateTotalGrades должен возвращать вычисленную сумму баллов.
 * • В методе main нужно создать массив оценок, вызвать calculateTotalGrades, сохранить результат в переменную finalTotalPoints и вывести на экран строку "Сумма всех оценок: " с этим значением.
 */

/*
 * // JavaRush
 * Черновик:
 * package ru.javarush.java.core.level08.task12;
 *
 * public class Solution {
 *
 *     // Метод с возвращаемым значением int: принимает массив оценок и возвращает их сумму
 *     public static int calculateTotalGrades(int[] studentExamResults) {
 *
 *         // Проходим по всем элементам массива и накапливаем сумму
 *
 *         // Возвращаем итоговую сумму
 *     }
 *
 *     public static void main(String[] args) {
 *         // Виртуальный список оценок студента
 *         int[] currentGrades = {5, 4, 3, 5, 4};
 *
 *         // Вызываем метод подсчёта и сохраняем результат в переменную finalTotalPoints
 *         int finalTotalPoints = calculateTotalGrades(currentGrades);
 *
 *         // Выводим результат на экран
 *         System.out.println("Сумма всех оценок: " + finalTotalPoints);
 *     }
 * }
 */

// JavaRush
package ru.javarush.java.core.level08.task12;

public class Solution {

    // Метод с возвращаемым значением int: принимает массив оценок и возвращает их сумму
    public static int calculateTotalGrades(int[] studentExamResults) {
        int sum = 0;
        // Проходим по всем элементам массива и накапливаем сумму
        for (int grade : studentExamResults) {
            sum += grade;
        }
        // Возвращаем итоговую сумму
        return sum;
    }

    public static void main(String[] args) {
        // Виртуальный список оценок студента
        int[] currentGrades = {5, 4, 3, 5, 4};

        // Вызываем метод подсчёта и сохраняем результат в переменную finalTotalPoints
        int finalTotalPoints = calculateTotalGrades(currentGrades);

        // Выводим результат на экран
        System.out.println("Сумма всех оценок: " + finalTotalPoints);
    }
}

/*
 * // JavaRush
 * Правильное решение:
 * // Author: JavaRush's team
 * package ru.javarush.java.core.level08.task12;
 *
 * public class Solution {
 *
 *     // Метод с возвращаемым значением int: принимает массив оценок и возвращает их сумму
 *     public static int calculateTotalGrades(int[] studentExamResults) {
 *         int sum = 0;
 *         // Проходим по всем элементам массива и накапливаем сумму
 *         for (int grade : studentExamResults) {
 *             sum += grade;
 *         }
 *         return sum; // Возвращаем итоговую сумму
 *     }
 *
 *     public static void main(String[] args) {
 *         // Виртуальный список оценок студента
 *         int[] currentGrades = {5, 4, 3, 5, 4};
 *
 *         // Вызываем метод подсчёта и сохраняем результат в переменную finalTotalPoints
 *         int finalTotalPoints = calculateTotalGrades(currentGrades);
 *
 *         // Выводим результат на экран
 *         System.out.println("Сумма всех оценок: " + finalTotalPoints);
 *     }
 * }
 */