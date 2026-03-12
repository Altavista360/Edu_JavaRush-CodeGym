/*
 * Authors: JavaRush's team, CodeGym's team, Altavista360
 * Version: 1.0.0
 */

/*
 * // JavaRush
 * Задача: Список дел с вводом пользователя
 * Ссылка: https://javarush.com/tasks/ru.javarush.java.core.level12.task04
 */

/*
 * // CodeGym
 * Task: To-Do List with User Input
 * Link: https://codegym.cc/tasks/en.codegym.java.core.level12.task04
 */

/*
 * // JavaRush
 * Условие:
 * Представьте, что вы создаете интерактивный помощник для занятого человека, который хочет быстро надиктовать свои задачи на день. Ваша программа должна слушать, что пользователь говорит, записывая каждую задачу, пока он не закончит.
 * Создайте программу, которая будет использовать Scanner для чтения текстовых строк прямо из консоли и добавлять каждую введенную задачу в динамический список ArrayList<String>.
 * Процесс записи должен продолжаться до тех пор, пока пользователь не решит закончить, введя совершенно пустую строку.
 * После того как пользователь завершит ввод всех своих задач, ваша программа должна показать ему полный список, но в необычном порядке: от самой последней добавленной задачи к самой первой, выводя каждую на новой строке, чтобы он мог видеть свои последние мысли в первую очередь.
 */

/*
 * // JavaRush
 * Требования:
 * • Программа должна использовать класс Scanner для чтения строк из консоли.
 * • Все введённые пользователем задачи должны сохраняться в динамическом списке ArrayList<String>.
 * • Ввод задач должен продолжаться до тех пор, пока пользователь не введёт пустую строку (""), после чего программа прекращает приём новых задач.
 * • После завершения ввода программа должна вывести все задачи в обратном порядке — начиная с последней введённой и заканчивая первой.
 * • Каждая задача из списка должна быть напечатана на отдельной строке.
 */

/*
 * // JavaRush
 * Черновик:
 * package ru.javarush.java.core.level12.task04;
 *
 * import java.util.ArrayList;
 * import java.util.Scanner;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Создаем Scanner для чтения строк из консоли
 *
 *
 *         // Динамический список для хранения задач
 *
 *
 *         // Считываем строки до тех пор, пока не введена пустая строка
 *
 *         // читаем очередную задачу
 *         // пустая строка — сигнал завершения ввода
 *
 *         // добавляем задачу в список
 *
 *
 *         // Выводим задачи в обратном порядке: от последней к первой
 *
 *
 *     }
 * }
 */

// JavaRush
package ru.javarush.java.core.level12.task04;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        // Создаем Scanner для чтения строк из консоли
        Scanner console = new Scanner(System.in);

        // Динамический список для хранения задач
        ArrayList<String> todoList = new ArrayList<>();

        while (true) {
            // Считываем строки до тех пор, пока не введена пустая строка
            System.out.print("Введите задачу (или нажмите Enter без ввода для выхода): ");
            // читаем очередную задачу
            // пустая строка — сигнал завершения ввода
            String task = console.nextLine();
            if (task.isEmpty()) break;
            // добавляем задачу в список
            todoList.add(task);
        }

        // Выводим задачи в обратном порядке: от последней к первой
        for (int i = todoList.size() - 1; i >= 0; i--)
        {
            System.out.println(todoList.get(i));
        }

    }
}

/*
 * // JavaRush
 * Правильное решение:
 * // Author: JavaRush's team
 * package ru.javarush.java.core.level12.task04;
 *
 * import java.util.ArrayList;
 * import java.util.Scanner;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Создаем Scanner для чтения строк из консоли
 *         Scanner console = new Scanner(System.in);
 *
 *         // Динамический список для хранения задач
 *         ArrayList<String> tasks = new ArrayList<>();
 *
 *         // Считываем строки до тех пор, пока не введена пустая строка
 *         while (true) {
 *             String line = console.nextLine(); // читаем очередную задачу
 *             if (line.isEmpty()) {             // пустая строка — сигнал завершения ввода
 *                 break;
 *             }
 *             tasks.add(line);                   // добавляем задачу в список
 *         }
 *
 *         // Выводим задачи в обратном порядке: от последней к первой
 *         for (int i = tasks.size() - 1; i >= 0; i--) {
 *             System.out.println(tasks.get(i));
 *         }
 *     }
 * }
 */