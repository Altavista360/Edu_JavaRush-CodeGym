/*
 * Authors: JavaRush's team, CodeGym's team, Altavista360
 * Version: 1.0.0
 */

/*
 * // JavaRush
 * Задача: Магия печати: Отличие между переопределением и перегрузкой
 * Ссылка: https://javarush.com/tasks/ru.javarush.java.core.level18.task10
 */

/*
 * // CodeGym
 * Task: Printing Magic: Difference Between Overriding and Overloading
 * Link: https://codegym.cc/tasks/en.codegym.java.core.level18.task10
 */

/*
 * // JavaRush
 * Условие:
 * Вы разрабатываете продвинутую систему печати, которая может обрабатывать разные типы данных, а также имеет специальный режим для "цветной" печати некоторых сообщений.
 * Создайте базовый класс Printer. Внутри Printer создайте два метода с названием print: один должен принимать целое число (int) и выводить на экран "Число: X", где X — это переданное число. Второй метод print должен принимать строку (String) и выводить "Строка: Y", где Y — это переданная строка.
 * Теперь расширьте вашу систему, создав класс ColorPrinter, который наследуется от Printer. ColorPrinter должен иметь возможность "перехватывать" и изменять поведение печати строк. Переопределите метод print(String) в ColorPrinter так, чтобы он выводил "Цветная строка: Y". Убедитесь, что вы не перегружаете, а именно переопределяете метод.
 * В методе main создайте объект ColorPrinter. Продемонстрируйте его возможности: сначала вызовите метод print с числом (например, 5), а затем вызовите метод print со строкой (например, "Hello"). Ваша программа должна показать, что число печатается стандартно, а строка — уже с "цветным" форматированием, выводя: "Число: 5" и "Цветная строка: Hello".
 */

/*
 * // JavaRush
 * Требования:
 * • Должен быть создан класс с именем Printer.
 * • В классе Printer должно быть определено два метода с именем print: один принимает параметр типа int, другой — параметр типа String.
 * • Метод print(int) класса Printer должен выводить на экран строку "Число: X", где X — переданное число.
 * • Метод print(String) класса Printer должен выводить на экран строку "Строка: Y", где Y — переданная строка.
 * • Должен быть создан класс ColorPrinter, который наследуется от класса Printer.
 * • В классе ColorPrinter должен быть переопределён (а не перегружен) метод print(String), который выводит строку "Цветная строка: Y", где Y — переданная строка.
 * • В методе main должен быть создан объект класса ColorPrinter.
 * • В методе main при вызове print(5) на объекте ColorPrinter должно выводиться "Число: 5", а при вызове print("Hello") — "Цветная строка: Hello".
 */

/*
 * // JavaRush
 * Черновик:
 * package ru.javarush.java.core.level18.task10;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Создаём объект дочернего класса
 *         ColorPrinter printer = new ColorPrinter();
 *
 *         // Демонстрация: перегрузка в базовом классе + переопределение в дочернем
 *         printer.print(5);        // вызовется метод Printer#print(int)
 *         printer.print("Hello");  // вызовется переопределённый метод ColorPrinter#print(String)
 *     }
 * }
 */

// JavaRush
package ru.javarush.java.core.level18.task10;

public class Solution {
    public static void main(String[] args) {
        // Создаём объект дочернего класса
        ColorPrinter printer = new ColorPrinter();

        // Демонстрация: перегрузка в базовом классе + переопределение в дочернем
        printer.print(5);        // вызовется метод Printer#print(int)
        printer.print("Hello");  // вызовется переопределённый метод ColorPrinter#print(String)
    }
}

class Printer {
    void print(int number) {
        System.out.println("Число: " + number);
    }

    void print(String text) {
        System.out.println("Строка: " + text);
    }
}

class ColorPrinter extends Printer {
    @Override
    void print(String text) {
        System.out.println("Цветная строка: " + text);
    }
}

/*
 * // JavaRush
 * Правильное решение:
 * // Author: JavaRush's team
 * package ru.javarush.java.core.level18.task10;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Создаём объект дочернего класса
 *         ColorPrinter printer = new ColorPrinter();
 *
 *         // Демонстрация: перегрузка в базовом классе + переопределение в дочернем
 *         printer.print(5);        // вызовется метод Printer#print(int)
 *         printer.print("Hello");  // вызовется переопределённый метод ColorPrinter#print(String)
 *     }
 * }
 *
 * // Базовый класс печати
 * class Printer {
 *     // Перегруженный метод: принимает int
 *     void print(int number) {
 *         System.out.println("Число: " + number);
 *     }
 *
 *     // Перегруженный метод: принимает String
 *     void print(String text) {
 *         System.out.println("Строка: " + text);
 *     }
 * }
 *
 * // Дочерний класс, меняющий поведение печати строк
 * class ColorPrinter extends Printer {
 *     @Override // Аннотация гарантирует именно переопределение, а не перегрузку
 *     void print(String text) {
 *         System.out.println("Цветная строка: " + text);
 *     }
 * }
 */