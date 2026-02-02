/*
 * Authors: JavaRush's team, CodeGym's team, Altavista360
 * Version: 1.0.0
 */

/*
 * // JavaRush
 * Задача: Использование инструмента по полному адресу 🛠️
 * Ссылка: https://javarush.com/tasks/ru.javarush.java.core.level05.task15
 */

/*
 * // CodeGym
 * Task: Using the tool by its full address 🛠️
 * Link: https://codegym.cc/tasks/en.codegym.java.core.level05.task15
 */

/*
 * // JavaRush
 * Условие:
 * Представьте, что у вас есть огромный склад инструментов, и вы хотите взять очень специфический инструмент — сканер для чтения мыслей пользователя, но вы хотите обратиться к нему по полному "адресу" на складе, не принося его на верстак заранее (то есть, без использования оператора import). Это как если бы вы сказали "Принесите мне 'Тот-самый-инструмент-из-сектора-А-ряда-Б-ячейки-В'" вместо просто "Принесите сканер".
 * В методе main вашего класса Main напишите одну строку кода, которая создаёт объект Scanner, используя его полное имя (например, java.util.Scanner), и читает строку, которую введёт пользователь в консоль. Затем сразу же выведите эту строку на экран. Ваша программа должна работать идеально, без единого оператора import в начале файла, демонстрируя ваше мастерство в точной адресации.
 */

/*
 * // JavaRush
 * Требования:
 * • В программе должен быть объявлен публичный класс с именем Main.
 * • В начале файла не должно быть ни одной строки с оператором import.
 * • Объект класса Scanner должен быть создан с использованием полного имени класса — java.util.Scanner.
 * • Программа должна считать строку, введённую пользователем, используя созданный объект Scanner.
 * • Считанная строка должна быть немедленно выведена на экран.
 */

/*
 * // JavaRush
 * Черновик:
 * package ru.javarush.java.core.level05.task15;
 *
 * public class Main {
 *     public static void main(String[] args) {
 *         // Создаем объект Scanner, используя полное имя класса
 *
 *
 *         // Считываем строку, введенную пользователем
 *
 *
 *         // Выводим считанную строку на экран
 *
 *     }
 * }
 */

// JavaRush
package ru.javarush.java.core.level05.task15;

public class Main {
    public static void main(String[] args) {
        // Создаем объект Scanner, используя полное имя класса
        java.util.Scanner inputData = new java.util.Scanner(System.in);

        // Считываем строку, введенную пользователем
        String inputString = inputData.nextLine();

        // Выводим считанную строку на экран
        System.out.println(inputString);
    }
}

/*
 * // JavaRush
 * Правильное решение:
 * // Author: JavaRush's team
 * package ru.javarush.java.core.level05.task15;
 *
 * public class Main {
 *     public static void main(String[] args) {
 *         // Создаем объект Scanner, используя полное имя класса java.util.Scanner
 *         java.util.Scanner console = new java.util.Scanner(System.in);
 *
 *         // Считываем строку, введенную пользователем
 *         String input = console.nextLine();
 *
 *         // Выводим считанную строку на экран
 *         System.out.println(input);
 *     }
 * }
 */