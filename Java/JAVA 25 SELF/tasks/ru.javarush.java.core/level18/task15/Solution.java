/*
 * Authors: JavaRush's team, CodeGym's team, Altavista360
 * Version: 1.0.0
 */

/*
 * // JavaRush
 * Задача: Расширение команды: Добавление нового типа сотрудника
 * Ссылка: https://javarush.com/tasks/ru.javarush.java.core.level18.task15
 */

/*
 * // CodeGym
 * Task: Team extension: Adding a new employee type
 * Link: https://codegym.cc/tasks/en.codegym.java.core.level18.task15
 */

/*
 * // JavaRush
 * Условие:
 * Ваша корпоративная HR-система (из предыдущей задачи) развивается, и теперь в вашей компании появились новые специалисты. К уже существующим классам Employee, Manager и Developer добавьте новый класс Tester. Он также должен наследовать от Employee и переопределять метод work() таким образом, чтобы он выводил "Тестировщик ищет баги.".
 * В методе main обновите вашу "команду". Снова создайте массив типа Employee. В этот раз поместите в него объекты Manager, Developer и нового Tester. Пройдитесь по массиву циклом и для каждого сотрудника вызовите work(). Ваша программа должна продемонстрировать, что система легко адаптируется к новым ролям, корректно выводя задачи каждого: менеджера, разработчика и тестировщика.
 */

/*
 * // JavaRush
 * Требования:
 * • В программе должен быть создан новый класс Tester, который наследуется от класса Employee.
 * • Класс Tester должен переопределять метод work() таким образом, чтобы при вызове этого метода выводилось сообщение "Тестировщик ищет баги.".
 * • В методе main должен быть создан массив типа Employee, в который помещаются объекты классов Manager, Developer и Tester.
 * • В программе должен использоваться цикл для перебора массива Employee, и для каждого элемента должен вызываться метод work(), чтобы показать полиморфное поведение.
 * • Результат работы программы должен содержать корректные сообщения для каждого типа сотрудника: менеджера, разработчика и тестировщика.
 */

/*
 * // JavaRush
 * Черновик:
 * package ru.javarush.java.core.level18.task15;
 *
 * // Демонстрация полиморфизма: добавили новый тип сотрудника Tester,
 * // и система без изменений логики main корректно вызывает его работу.
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Создаем массив ссылок базового типа Employee
 *         Employee[] team = {
 *                 new Manager(),
 *                 new Developer(),
 *                 new Tester() // новый тип сотрудника
 *         };
 *
 *         // Полиморфный вызов: у каждого элемента массива вызывается свой вариант work()
 *         for (Employee e : team) {
 *             e.work();
 *         }
 *     }
 * }
 */

// JavaRush
package ru.javarush.java.core.level18.task15;

// Демонстрация полиморфизма: добавили новый тип сотрудника Tester,
// и система без изменений логики main корректно вызывает его работу.
public class Solution {
    public static void main(String[] args) {
        // Создаем массив ссылок базового типа Employee
        Employee[] team = {
                new Manager(),
                new Developer(),
                new Tester() // новый тип сотрудника
        };

        // Полиморфный вызов: у каждого элемента массива вызывается свой вариант work()
        for (Employee e : team) {
            e.work();
        }
    }
}

abstract class Employee {
    public abstract void work();
}

class Manager extends Employee {
    @Override
    public void work() {
        System.out.println("Менеджер планирует и координирует работу.");
    }
}

class Developer extends Employee {
    @Override
    public void work() {
        System.out.println("Разработчик пишет код.");
    }
}

class Tester extends Employee {
    @Override
    public void work() {
        System.out.println("Тестировщик ищет баги.");
    }
}

/*
 * // JavaRush
 * Правильное решение:
 * // Author: JavaRush's team
 * package ru.javarush.java.core.level18.task15;
 *
 * // Демонстрация полиморфизма: добавили новый тип сотрудника Tester,
 * // и система без изменений логики main корректно вызывает его работу.
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Создаем массив ссылок базового типа Employee
 *         Employee[] team = {
 *                 new Manager(),
 *                 new Developer(),
 *                 new Tester() // новый тип сотрудника
 *         };
 *
 *         // Полиморфный вызов: у каждого элемента массива вызывается свой вариант work()
 *         for (Employee e : team) {
 *             e.work();
 *         }
 *     }
 * }
 *
 * // Базовый класс для всех сотрудников
 * abstract class Employee {
 *     // Общий контракт "работы" для всех сотрудников
 *     public abstract void work();
 * }
 *
 * // Менеджер — конкретный сотрудник, переопределяет свою работу
 * class Manager extends Employee {
 *     @Override
 *     public void work() {
 *         System.out.println("Менеджер планирует и координирует работу.");
 *     }
 * }
 *
 * // Разработчик — конкретный сотрудник, переопределяет свою работу
 * class Developer extends Employee {
 *     @Override
 *     public void work() {
 *         System.out.println("Разработчик пишет код.");
 *     }
 * }
 *
 * // Новый тип сотрудника: Тестировщик
 * class Tester extends Employee {
 *     @Override
 *     public void work() {
 *         // Требуемый вывод для тестировщика
 *         System.out.println("Тестировщик ищет баги.");
 *     }
 * }
 */