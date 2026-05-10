/*
 * Authors: JavaRush's team, CodeGym's team, Altavista360
 * Version: 1.0.0
 */

/*
 * // JavaRush
 * Задача: Волшебный принтер сообщений: Простейшая перегрузка метода
 * Ссылка: https://javarush.com/tasks/ru.javarush.java.core.level18.task05
 */

/*
 * // CodeGym
 * Task: Magic Message Printer: Simple Method Overloading
 * Link: https://codegym.cc/tasks/en.codegym.java.core.level18.task05
 */

/*
 * // JavaRush
 * Условие:
 * Представьте, что вы создаёте умный принтер для вашей системы, который умеет печатать разные виды сообщений. Иногда ему нужно вывести просто текст, а иногда — результат сложного вычисления. Вам понадобится класс MessagePrinter.
 * Внутри этого класса создайте два метода с одинаковым названием, например, printMessage. Первый метод printMessage должен принимать один параметр — строку (String) — и просто выводить её на экран, как есть. Второй метод printMessage должен быть немного умнее: он должен принимать два целых числа (int) и выводить на экран их сумму.
 * В главном методе вашей программы, main, создайте объект вашего MessagePrinter. Затем продемонстрируйте его способности: вызовите первый printMessage с каким-нибудь текстовым сообщением (например, "Привет, мир!"), а затем вызовите второй printMessage, передав ему два целых числа (например, 10 и 20). Ваша программа должна успешно обработать оба вызова, показав, как один и тот же метод может действовать по-разному в зависимости от того, что ему передали.
 */

/*
 * // JavaRush
 * Требования:
 * • В программе должен быть создан класс с именем MessagePrinter.
 * • В классе MessagePrinter должно быть объявлено два метода с именем printMessage, но с разными параметрами (перегрузка).
 * • Один из методов printMessage должен принимать один параметр типа String и выводить его на экран.
 * • Второй метод printMessage должен принимать два параметра типа int, вычислять их сумму и выводить результат на экран.
 * • В методе main необходимо создать объект класса MessagePrinter и вызвать оба варианта метода printMessage: один раз с текстовой строкой, второй раз с двумя целыми числами.
 */

/*
 * // JavaRush
 * Черновик:
 * package ru.javarush.java.core.level18.task05;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Создаем объект "умного" принтера
 *         MessagePrinter printer = new MessagePrinter();
 *
 *         // Демонстрируем первый вариант метода: печать строки как есть
 *         printer.printMessage("Привет, мир!");
 *
 *         // Демонстрируем второй вариант метода: печать суммы двух чисел
 *         printer.printMessage(10, 20);
 *     }
 * }
 */

// JavaRush
 package ru.javarush.java.core.level18.task05;

public class Solution {
    public static void main(String[] args) {
        // Создаем объект "умного" принтера
        MessagePrinter printer = new MessagePrinter();

        // Демонстрируем первый вариант метода: печать строки как есть
        printer.printMessage("Привет, мир!");

        // Демонстрируем второй вариант метода: печать суммы двух чисел
        printer.printMessage(10, 20);
    }
}

class MessagePrinter {
    public void printMessage(String message) {
        System.out.println(message);
    }

    public void printMessage(int a, int b) {
        int sum = a + b;
        System.out.println(sum);
    }
}

/*
 * // JavaRush
 * Правильное решение:
 * // Author: JavaRush's team
 * package ru.javarush.java.core.level18.task05;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Создаем объект "умного" принтера
 *         MessagePrinter printer = new MessagePrinter();
 *
 *         // Демонстрируем первый вариант метода: печать строки как есть
 *         printer.printMessage("Привет, мир!");
 *
 *         // Демонстрируем второй вариант метода: печать суммы двух чисел
 *         printer.printMessage(10, 20);
 *     }
 * }
 *
 * // Класс, отвечающий за печать сообщений
 * class MessagePrinter {
 *     // Перегруженный метод #1: принимает строку и выводит её
 *     public void printMessage(String message) {
 *         System.out.println(message);
 *     }
 *
 *     // Перегруженный метод #2: принимает два int, считает сумму и выводит результат
 *     public void printMessage(int a, int b) {
 *         int sum = a + b; // простое вычисление суммы
 *         System.out.println(sum);
 *     }
 * }
 */