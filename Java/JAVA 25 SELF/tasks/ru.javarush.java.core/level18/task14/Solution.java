/*
 * Authors: JavaRush's team, CodeGym's team, Altavista360
 * Version: 1.0.0
 */

/*
 * // JavaRush
 * Задача: Корпоративная симфония: Полиморфизм в работе сотрудников
 * Ссылка: https://javarush.com/tasks/ru.javarush.java.core.level18.task14
 */

/*
 * // CodeGym
 * Task: Corporate Symphony: Polymorphism in Employee Work
 * Link: https://codegym.cc/tasks/en.codegym.java.core.level18.task14
 */

/*
 * // JavaRush
 * Условие:
 * Представьте, что вы разрабатываете интеллектуальную систему для крупной компании, которая должна отслеживать деятельность своих сотрудников. Несмотря на разные должности, все они "работают".
 * Объявите базовый класс Employee с методом work(), который будет выводить на экран общую фразу: "Сотрудник работает...".
 * Теперь добавьте конкретные роли: Manager и Developer. Эти классы должны быть наследниками Employee и каждый из них должен переопределить метод work() так, чтобы он отражал их специфическую деятельность: Manager будет выводить "Менеджер проводит совещание.", а Developer — "Разработчик пишет код.".
 * В методе main соберите свою "команду" в один список. Для этого создайте массив, способный хранить объекты типа Employee. Добавьте в этот массив по одному объекту Manager и Developer. Затем пройдитесь по этому массиву с помощью цикла и для каждого члена команды вызовите метод work(). Ваша система должна четко показать, чем занимается каждый сотрудник, несмотря на то, что вы обращаетесь к ним как к обычным "сотрудникам".
 */

/*
 * // JavaRush
 * Требования:
 * • Должен быть создан класс Employee с методом work().
 * • Метод work() в классе Employee должен выводить на экран строку "Сотрудник работает...".
 * • Должны быть созданы классы Manager и Developer, которые наследуются от Employee.
 * • Класс Manager должен переопределять метод work(), выводя строку "Менеджер проводит совещание.".
 * • Класс Developer должен переопределять метод work(), выводя строку "Разработчик пишет код.".
 * • В методе main должен быть создан массив, способный хранить объекты типа Employee.
 * • В созданный массив должны быть добавлены по одному объекту классов Manager и Developer.
 * • В методе main должен быть реализован цикл, проходящий по массиву сотрудников и вызывающий для каждого метод work().
 * • Вызовы метода work() должны отражать полиморфное поведение: несмотря на тип Employee, должны выводиться специфические сообщения для Manager и Developer.
 */

/*
 * // JavaRush
 * Черновик:
 * package ru.javarush.java.core.level18.task14;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Создаем массив, способный хранить объекты типа Employee
 *         Employee[] team = new Employee[2];
 *
 *         // Добавляем в массив по одному объекту Manager и Developer
 *         team[0] = new Manager();
 *         team[1] = new Developer();
 *
 *         // Полиморфный вызов: метод work() вызывается у ссылки типа Employee,
 *         // но выполняется переопределенная версия соответствующего класса
 *         for (Employee employee : team) {
 *             employee.work();
 *         }
 *     }
 * }
 */

// JavaRush
package ru.javarush.java.core.level18.task14;

public class Solution {
    public static void main(String[] args) {
        // Создаем массив, способный хранить объекты типа Employee
        Employee[] team = new Employee[2];

        // Добавляем в массив по одному объекту Manager и Developer
        team[0] = new Manager();
        team[1] = new Developer();

        // Полиморфный вызов: метод work() вызывается у ссылки типа Employee,
        // но выполняется переопределенная версия соответствующего класса
        for (Employee employee : team) {
            employee.work();
        }
    }
}

class Employee {
    public void work() {
        System.out.println("Сотрудник работает...");
    }
}

class Manager extends Employee {
    @Override
    public void work() {
        System.out.println("Менеджер проводит совещание.");
    }
}

class Developer extends Employee {
    @Override
    public void work() {
        System.out.println("Разработчик пишет код.");
    }
}

/*
 * // JavaRush
 * Правильное решение:
 * // Author: JavaRush's team
 * package ru.javarush.java.core.level18.task14;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Создаем массив, способный хранить объекты типа Employee
 *         Employee[] team = new Employee[2];
 *
 *         // Добавляем в массив по одному объекту Manager и Developer
 *         team[0] = new Manager();
 *         team[1] = new Developer();
 *
 *         // Полиморфный вызов: метод work() вызывается у ссылки типа Employee,
 *         // но выполняется переопределенная версия соответствующего класса
 *         for (Employee employee : team) {
 *             employee.work();
 *         }
 *     }
 * }
 *
 * // Базовый класс сотрудника
 * class Employee {
 *     // Общая реализация метода work() для всех сотрудников
 *     public void work() {
 *         System.out.println("Сотрудник работает...");
 *     }
 * }
 *
 * // Конкретный сотрудник — менеджер
 * class Manager extends Employee {
 *     @Override
 *     public void work() {
 *         // Специфическая деятельность менеджера
 *         System.out.println("Менеджер проводит совещание.");
 *     }
 * }
 *
 * // Конкретный сотрудник — разработчик
 * class Developer extends Employee {
 *     @Override
 *     public void work() {
 *         // Специфическая деятельность разработчика
 *         System.out.println("Разработчик пишет код.");
 *     }
 * }
 */