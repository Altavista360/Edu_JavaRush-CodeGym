/*
 * Authors: JavaRush's team, CodeGym's team, Altavista360
 * Version: 1.0.0
 */

/*
 * // JavaRush
 * Задача: Базовая система управления персоналом 🧑‍💼
 * Ссылка: https://javarush.com/tasks/ru.javarush.java.core.level19.task11
 */

/*
 * // CodeGym
 * Task: Basic Personnel Management System 🧑‍💼
 * Link: https://codegym.cc/tasks/en.codegym.java.core.level19.task11
 */

/*
 * // JavaRush
 * Условие:
 * Представьте, что вы разрабатываете фундаментальную часть системы управления персоналом. У каждого сотрудника есть имя, и каждый получает зарплату. Имя можно получить стандартным способом, но вот как начисляется зарплата — это уже отдельная история для каждой должности.
 * Для начала, создайте абстрактный класс Employee. В нём определите поле String name для хранения имени сотрудника и метод getName(), который просто будет возвращать это имя. Помимо этого, добавьте абстрактный метод double getSalary(), который будет отвечать за расчет вознаграждения, но его реализацию вы оставите для конкретных должностей.
 * Теперь создайте класс Manager, который станет первым конкретным типом сотрудника. Он должен наследовать Employee, иметь своё собственное поле salary и, конечно же, реализовать метод getSalary() таким образом, чтобы он просто возвращал это поле salary.
 * Чтобы проверить вашу систему, в методе main создайте объект Manager с именем "Ivan" и зарплатой 50000. В завершение, выведите на экран сначала имя менеджера, а затем его зарплату, чтобы убедиться в корректности данных.
 */

/*
 * // JavaRush
 * Требования:
 * • Должен быть создан абстрактный класс Employee с полем String name.
 * • Класс Employee должен содержать метод getName(), возвращающий имя сотрудника.
 * • В классе Employee должен быть абстрактный метод double getSalary(), который не имеет реализации.
 * • Должен быть реализован класс Manager, который наследует класс Employee.
 * • Класс Manager должен содержать собственное поле double salary для хранения зарплаты.
 * • Класс Manager должен реализовать метод getSalary(), который возвращает значение поля salary.
 * • В методе main должен быть создан объект класса Manager с именем "Ivan" и зарплатой 50000.
 * • В методе main необходимо вывести на экран имя и зарплату созданного менеджера.
 */

/*
 * // JavaRush
 * Черновик:
 * package ru.javarush.java.core.level19.task11;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Создаём менеджера "Ivan" с зарплатой 50000
 *         Manager manager = new Manager("Ivan", 50000);
 *
 *         // Сначала выводим имя, затем зарплату
 *         System.out.println(manager.getName());
 *         System.out.println(manager.getSalary());
 *     }
 * }
 */

// JavaRush
package ru.javarush.java.core.level19.task11;

abstract class Employee {
    protected String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract double getSalary();
}

class Manager extends Employee {
    private double salary;

    public Manager(String name, double salary) {
        super(name);
        this.salary = salary;
    }

    @Override
    public double getSalary() {
        return salary;
    }
}

public class Solution {
    public static void main(String[] args) {
        // Создаём менеджера "Ivan" с зарплатой 50000
        Manager manager = new Manager("Ivan", 50000);

        // Сначала выводим имя, затем зарплату
        System.out.println(manager.getName());
        System.out.println(manager.getSalary());
    }
}

/*
 * // JavaRush
 * Правильное решение:
 * // Author: JavaRush's team
 * package ru.javarush.java.core.level19.task11;
 *
 * // Абстрактный класс сотрудника: хранит имя и задаёт абстрактный метод для зарплаты
 * abstract class Employee {
 *     protected String name; // Имя сотрудника
 *
 *     public Employee(String name) {
 *         this.name = name;
 *     }
 *
 *     // Геттер имени — общий для всех сотрудников
 *     public String getName() {
 *         return name;
 *     }
 *
 *     // Абстрактный метод: как считать зарплату — решают подклассы
 *     public abstract double getSalary();
 * }
 *
 * // Конкретный тип сотрудника — Менеджер
 * class Manager extends Employee {
 *     private double salary; // Фиксированная зарплата менеджера
 *
 *     public Manager(String name, double salary) {
 *         super(name); // Инициализируем имя через конструктор базового класса
 *         this.salary = salary;
 *     }
 *
 *     @Override
 *     public double getSalary() {
 *         // Для менеджера зарплата — это просто значение поля salary
 *         return salary;
 *     }
 * }
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Создаём менеджера "Ivan" с зарплатой 50000
 *         Manager manager = new Manager("Ivan", 50000);
 *
 *         // Сначала выводим имя, затем зарплату
 *         System.out.println(manager.getName());
 *         System.out.println(manager.getSalary());
 *     }
 * }
 */