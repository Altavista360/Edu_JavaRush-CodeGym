/*
 * Authors: JavaRush's team, CodeGym's team, Altavista360
 * Version: 1.0.0
 */

/*
 * // JavaRush
 * Задача: Коллекция любимых кинолент в обратном порядке 🎞️
 * Ссылка: https://javarush.com/tasks/ru.javarush.java.core.level07.task06
 */

/*
 * // CodeGym
 * Task: Collection of favorite movies in reverse order 🎞️
 * Link: https://codegym.cc/tasks/en.codegym.java.core.level07.task06
 */

/*
 * // JavaRush
 * Условие:
 * Ваш друг спрашивает вас о трех ваших любимых кинолентах. Вам нужно быстро записать их, а затем, чтобы удивить друга, представить ему этот список в обратном порядке: сначала ту, которую вы назвали последней, затем вторую, и только потом первую.
 * Создайте массив String[] favoriteMovies длиной в 3 элемента. Используйте клавиатурный ввод, чтобы считать три строки (названия фильмов) и сохранить их в этот массив. После этого выведите эти строки на экран в обратном порядке: сначала последнюю, затем вторую, затем первую, каждую с новой строки.
 */

/*
 * // JavaRush
 * Требования:
 * • Необходимо создать массив типа String длиной ровно 3 элемента с именем favoriteMovies.
 * • Программа должна считать три строки с клавиатуры (названия фильмов) и сохранить их по порядку в массив favoriteMovies.
 * • Каждое введённое название фильма должно быть сохранено на соответствующей позиции в массиве: первое — в нулевой, второе — в первой, третье — во второй.
 * • После ввода все три фильма должны быть выведены на экран в обратном порядке: сначала третий, затем второй, затем первый, каждая строка — с новой строки.
 */

/*
 * // JavaRush
 * Черновик:
 * package ru.javarush.java.core.level07.task06;
 *
 * import java.util.Scanner;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Создаем массив фиксированной длины 3 для любимых фильмов
 *
 *
 *         // Создаем Scanner для чтения строк с клавиатуры
 *
 *
 *         // Считываем три названия фильмов и сохраняем по порядку в массив
 *
 *
 *
 *         // Выводим фильмы в обратном порядке: третий, второй, первый
 *
 *
 *     }
 * }
 */

// JavaRush
package ru.javarush.java.core.level07.task06;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        // Создаем массив фиксированной длины 3 для любимых фильмов
        String[] favoriteMovies = new String[3];

        // Создаем Scanner для чтения строк с клавиатуры
        Scanner inputData = new Scanner(System.in);

        // Считываем три названия фильмов и сохраняем по порядку в массив
        for (int i = 0; i < favoriteMovies.length; i++) {
            favoriteMovies[i] = inputData.nextLine();
        }

        // Выводим фильмы в обратном порядке: третий, второй, первый
        for (int i = favoriteMovies.length - 1; i >= 0; i--) {
            System.out.println(favoriteMovies[i]);
        }
    }
}

/*
 * // JavaRush
 * Правильное решение:
 * // Author: JavaRush's team
 * package ru.javarush.java.core.level07.task06;
 *
 * import java.util.Scanner;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Создаем массив фиксированной длины 3 для любимых фильмов
 *         String[] favoriteMovies = new String[3];
 *
 *         // Создаем Scanner для чтения строк с клавиатуры
 *         Scanner console = new Scanner(System.in);
 *
 *         // Считываем три названия фильмов и сохраняем по порядку в массив
 *         for (int i = 0; i < favoriteMovies.length; i++) {
 *             favoriteMovies[i] = console.nextLine();
 *         }
 *
 *         // Выводим фильмы в обратном порядке: третий, второй, первый
 *         for (int i = favoriteMovies.length - 1; i >= 0; i--) {
 *             System.out.println(favoriteMovies[i]);
 *         }
 *     }
 * }
 */