/*
 * Authors: JavaRush's team, CodeGym's team, Altavista360
 * Version: 1.0.0
 */

/*
 * // JavaRush
 * Задача: Корпоративный лабиринт: Полиморфизм и роль сотрудника
 * Ссылка: https://javarush.com/tasks/ru.javarush.java.core.level18.task03
 */

/*
 * // CodeGym
 * Task: Corporate Maze: Polymorphism and the Employee Role
 * Link: https://codegym.cc/tasks/en.codegym.java.core.level18.task03
 */

/*
 * // JavaRush
 * Условие:
 * Lorem ipsum dolor sit amet consectetur adipiscing elit. Quisque faucibus ex sapien vitae pellentesque sem placerat. In id cursus mi pretium tellus duis convallis.
 * Вы разрабатываете систему управления персоналом для крупной корпорации, где каждый сотрудник имеет свою уникальную роль, но при этом все они просто "работают". Создайте базовый класс Employee с методом void work(), который будет выводить на экран общую фразу: "Сотрудник работает.". Это будет стандартом для всех в вашей компании.
 * Теперь добавьте в компанию ключевого игрока — разработчика. Создайте класс Developer, который наследует от Employee. Разработчик, конечно, не просто "работает"; он пишет код! Поэтому переопределите метод work() в классе Developer так, чтобы он точно описывал его деятельность: "Разработчик пишет код.".
 * В методе main представьте, что вам поручили оценить работу одного из ваших сотрудников, но вы знаете его только как "общего" работника. Объявите переменную типа Employee. Затем, словно по волшебству, назначьте этой переменной объект Developer. Теперь вызовите метод work() у этой переменной. Ваша программа должна чётко показать, чем занимается этот сотрудник, выводя на экран: "Разработчик пишет код.". Это наглядно демонстрирует, как система, ориентированная на общую роль, все равно корректно вызывает специфическое поведение.
 */

/*
 * // JavaRush
 * Требования:
 * • В программе должен быть объявлен класс Employee с методом void work(), который выводит на экран "Сотрудник работает.".
 * • Должен быть создан класс Developer, который наследуется от Employee.
 * • В классе Developer метод work() должен быть переопределён и выводить на экран "Разработчик пишет код.".
 * • В методе main необходимо объявить переменную типа Employee.
 * • В переменную типа Employee должен быть присвоен объект класса Developer.
 * • Метод work() должен быть вызван у переменной типа Employee, и результатом должен быть вывод "Разработчик пишет код.".
 * • Программа должна наглядно показать, что при вызове переопределённого метода через ссылку базового типа вызывается реализация из подкласса.
 */

/*
 * // JavaRush
 * Черновик:
 * package ru.javarush.java.core.level18.task03;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Объявляем переменную базового типа
 *         Employee employee;
 *
 *         // Присваиваем ей объект подкласса Developer
 *         employee = new Developer();
 *
 *         // Полиморфный вызов: выполнится переопределённая версия из Developer
 *         employee.work(); // Ожидаемый вывод: "Разработчик пишет код."
 *     }
 * }
 */

// JavaRush
package ru.javarush.java.core.level18.task03;

public class Solution {
    public static void main(String[] args) {
        // Объявляем переменную базового типа
        Employee employee;

        // Присваиваем ей объект подкласса Developer
        employee = new Developer();

        // Полиморфный вызов: выполнится переопределённая версия из Developer
        employee.work(); // Ожидаемый вывод: "Разработчик пишет код."
    }
}

class Employee {
    void work() {
        System.out.println("Сотрудник работает.");
    }
}

class Developer extends Employee {
    @Override
    void work() {
        System.out.println("Разработчик пишет код.");
    }
}

/*
 * // JavaRush
 * Правильное решение:
 * // Author: JavaRush's team
 * package ru.javarush.java.core.level18.task03;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Объявляем переменную базового типа
 *         Employee employee;
 *
 *         // Присваиваем ей объект подкласса Developer
 *         employee = new Developer();
 *
 *         // Полиморфный вызов: выполнится переопределённая версия из Developer
 *         employee.work(); // Ожидаемый вывод: "Разработчик пишет код."
 *     }
 * }
 *
 * // Базовый класс сотрудника
 * class Employee {
 *     // Общая реализация работы для любого сотрудника
 *     void work() {
 *         System.out.println("Сотрудник работает.");
 *     }
 * }
 *
 * // Разработчик наследуется от сотрудника
 * class Developer extends Employee {
 *     // Переопределяем поведение: разработчик пишет код
 *     @Override
 *     void work() {
 *         System.out.println("Разработчик пишет код.");
 *     }
 * }
 */