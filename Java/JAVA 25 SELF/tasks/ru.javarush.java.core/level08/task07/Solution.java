/*
 * Authors: JavaRush's team, CodeGym's team, Altavista360
 * Version: 1.0.0
 */

/*
 * // JavaRush
 * Задача: Создание карточки сотрудника для отдела кадров 👩‍💻
 * Ссылка: https://javarush.com/tasks/ru.javarush.java.core.level08.task07
 */

/*
 * // CodeGym
 * Task: Creating an employee card for HR 👩‍💻
 * Link: https://codegym.cc/tasks/en.codegym.java.core.level08.task07
 */

/*
 * // JavaRush
 * Условие:
 * Представьте, что вы создаете автоматизированную систему для ведения карточек сотрудников в отделе кадров. Каждая карточка должна четко отображать основную информацию о человеке, комбинируя разные типы данных.
 * Создайте класс HRProfileManager. Внутри этого класса объявите статический метод displayEmployeeCard, который будет принимать два параметра: employeeName (строку с полным именем сотрудника) и employeeAge (целое число, его возраст).
 * Задача метода — сформировать и вывести на экран подробную строку, содержащую "Имя сотрудника: " с указанием имени, затем ", Возраст: " с указанием возраста.
 * Для проверки работы вашей системы в главном блоке main вызовите displayEmployeeCard, передав ему "Олег" в качестве имени и 30 в качестве возраста, чтобы увидеть готовую карточку сотрудника.
 */

/*
 * // JavaRush
 * Требования:
 * • Необходимо создать публичный класс с именем HRProfileManager.
 * • Внутри класса HRProfileManager должен быть объявлен статический метод с именем displayEmployeeCard.
 * • Метод displayEmployeeCard должен принимать два параметра: строку employeeName и целое число employeeAge.
 * • Метод displayEmployeeCard должен формировать строку вида "Имя сотрудника: <имя>, Возраст: <возраст>" и выводить её на экран.
 * • В методе main класса HRProfileManager необходимо вызвать displayEmployeeCard с параметрами "Олег" и 30.
 */

/*
 * // JavaRush
 * Черновик:
 * package ru.javarush.java.core.level08.task07;
 *
 * public class HRProfileManager {
 *     // Статический метод принимает имя и возраст сотрудника,
 *     // формирует строку карточки и выводит её на экран
 *     public static void displayEmployeeCard(String employeeName, int employeeAge) {
 *
 *     }
 *
 *     public static void main(String[] args) {
 *         // Проверяем работу метода на примере
 *         displayEmployeeCard("Олег", 30);
 *     }
 * }
 */

// JavaRush
package ru.javarush.java.core.level08.task07;

public class HRProfileManager {
    // Статический метод принимает имя и возраст сотрудника,
    // формирует строку карточки и выводит её на экран
    public static void displayEmployeeCard(String employeeName, int employeeAge) {
        String card = "Имя сотрудника: " + employeeName + ", Возраст: " + employeeAge;
        System.out.println(card);
    }

    public static void main(String[] args) {
        // Проверяем работу метода на примере
        displayEmployeeCard("Олег", 30);
    }
}

/*
 * // JavaRush
 * Правильное решение:
 * // Author: JavaRush's team
 * package ru.javarush.java.core.level08.task07;
 *
 * public class HRProfileManager {
 *     // Статический метод принимает имя и возраст сотрудника,
 *     // формирует строку карточки и выводит её на экран
 *     public static void displayEmployeeCard(String employeeName, int employeeAge) {
 *         String card = "Имя сотрудника: " + employeeName + ", Возраст: " + employeeAge;
 *         System.out.println(card);
 *     }
 *
 *     public static void main(String[] args) {
 *         // Проверяем работу метода на примере
 *         displayEmployeeCard("Олег", 30);
 *     }
 * }
 */