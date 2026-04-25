/*
 * Authors: JavaRush's team, CodeGym's team, Altavista360
 * Version: 1.0.0
 */

/*
 * // JavaRush
 * Задача: Анализатор текстовых данных: краткий отчет по имени 📊
 * Ссылка: https://javarush.com/tasks/ru.javarush.java.core.level16.task16
 */

/*
 * // CodeGym
 * Task: Text Data Analyzer: brief name report 📊
 * Link: https://codegym.cc/tasks/en.codegym.java.core.level16.task16
 */

/*
 * // JavaRush
 * Условие:
 * Вы создаёте умный анализатор текстовых данных, который умеет обрабатывать имена. Когда вы передаёте имя для анализа, система должна сгенерировать краткий отчёт. Этот отчёт должен включать исходное имя, его версию в верхнем регистре и его длину. Вам понадобится временный, "локальный" компонент для создания такого отчёта.
 * В классе TextAnalyzer объявите метод generateNameReport(String customerName). Внутри этого метода объявите локальный класс с именем NameStatistics. У NameStatistics должно быть поле originalCustomerName (строка), метод printUpperCaseName(), который выводит имя в верхнем регистре, и метод printNameLength(), который выводит длину имени. Создайте объект NameStatistics, передав ему customerName. Затем последовательно вызовите оба его метода, чтобы на экране отобразились имя в верхнем регистре и его длина.
 */

/*
 * // JavaRush
 * Требования:
 * • В классе TextAnalyzer должен быть объявлен метод generateNameReport с параметром String customerName.
 * • Внутри метода generateNameReport должен быть объявлен локальный класс с именем NameStatistics.
 * • Локальный класс NameStatistics должен иметь конструктор, принимающий строку customerName и сохраняющий её в поле originalCustomerName.
 * • В классе NameStatistics должно быть приватное или защищённое поле originalCustomerName типа String, в котором хранится исходное имя.
 * • В классе NameStatistics должен быть метод printUpperCaseName, который выводит на экран значение originalCustomerName, преобразованное к верхнему регистру.
 * • В классе NameStatistics должен быть метод printNameLength, который выводит на экран длину строки originalCustomerName.
 * • Внутри метода generateNameReport должен быть создан объект класса NameStatistics, используя переданное имя customerName.
 * • Внутри метода generateNameReport должны быть последовательно вызваны методы printUpperCaseName и printNameLength для созданного объекта NameStatistics.
 */

/*
 * // JavaRush
 * Черновик:
 * package ru.javarush.java.core.level16.task16;
 *
 * import java.util.Scanner;
 *
 * public class TextAnalyzer {
 *
 *     // Метод-обработчик имени: внутри объявляем локальный класс и используем его
 *     public void generateNameReport(String customerName) {
 *         // Локальный класс доступен только внутри этого метода
 *
 *
 *         // Создаем объект локального класса и последовательно вызываем методы отчета
 *
 *     }
 *
 *     public static void main(String[] args) {
 *         Scanner console = new Scanner(System.in);
 *         String name = console.nextLine();          // читаем имя с консоли
 *         new TextAnalyzer().generateNameReport(name);
 *     }
 * }
 */

// JavaRush
package ru.javarush.java.core.level16.task16;

import java.util.Scanner;

public class TextAnalyzer {

    // Метод-обработчик имени: внутри объявляем локальный класс и используем его
    public void generateNameReport(String customerName) {
        // Локальный класс доступен только внутри этого метода
        class NameStatistics {
            private final String originalCustomerName;

            NameStatistics(String customerName) {
                this.originalCustomerName = customerName;
            }

            void printUpperCaseName() {
                System.out.println(originalCustomerName.toUpperCase());
            }

            void printNameLength() {
                System.out.println(originalCustomerName.length());
            }
        }

        // Создаем объект локального класса и последовательно вызываем методы отчета
        NameStatistics stats = new NameStatistics(customerName);
        stats.printUpperCaseName();
        stats.printNameLength();
    }

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String name = console.nextLine();          // читаем имя с консоли
        new TextAnalyzer().generateNameReport(name);
    }
}

/*
 * // JavaRush
 * Правильное решение:
 * // Author: JavaRush's team
 * package ru.javarush.java.core.level16.task16;
 *
 * import java.util.Scanner;
 *
 * public class TextAnalyzer {
 *
 *     // Метод-обработчик имени: внутри объявляем локальный класс и используем его
 *     public void generateNameReport(String customerName) {
 *         // Локальный класс доступен только внутри этого метода
 *         class NameStatistics {
 *             // Храним исходное имя
 *             private final String originalCustomerName;
 *
 *             // Конструктор принимает имя и сохраняет его в поле
 *             NameStatistics(String customerName) {
 *                 this.originalCustomerName = customerName;
 *             }
 *
 *             // Печать имени в верхнем регистре
 *             void printUpperCaseName() {
 *                 System.out.println(originalCustomerName.toUpperCase());
 *             }
 *
 *             // Печать длины имени
 *             void printNameLength() {
 *                 System.out.println(originalCustomerName.length());
 *             }
 *         }
 *
 *         // Создаем объект локального класса и последовательно вызываем методы отчета
 *         NameStatistics stats = new NameStatistics(customerName);
 *         stats.printUpperCaseName();
 *         stats.printNameLength();
 *     }
 *
 *     public static void main(String[] args) {
 *         Scanner console = new Scanner(System.in);
 *         String name = console.nextLine();          // читаем имя с консоли
 *         new TextAnalyzer().generateNameReport(name);
 *     }
 * }
 */