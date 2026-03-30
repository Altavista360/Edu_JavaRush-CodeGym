/*
 * Authors: JavaRush's team, CodeGym's team, Altavista360
 * Version: 1.0.0
 */

/*
 * // JavaRush
 * Задача: Автомобиль мечты на виртуальной витрине
 * Ссылка: https://javarush.com/tasks/ru.javarush.java.core.level14.task05
 */

/*
 * // CodeGym
 * Task: Dream Car on the Virtual Showcase
 * Link: https://codegym.cc/tasks/en.codegym.java.core.level14.task05
 */

/*
 * // JavaRush
 * Условие:
 * Представьте, что вы работаете в автосалоне и вам нужно создать удобную систему для учёта автомобилей, которые стоят на вашей виртуальной витрине. Каждая машина имеет свою марку и год выпуска, и ей нужно уметь «представиться» потенциальному покупателю.
 * Ваша задача — создать шаблон для автомобиля, назвав его Car, который будет хранить его марку (String carBrand) и год выпуска (int productionYear).
 * Затем добавьте в этот шаблон особый метод displayDetails(), который при вызове будет выводить на экран красивую фразу: "Марка: [марка автомобиля], год выпуска: [год выпуска]".
 * После того как шаблон готов, в вашем основном сценарии (main методе) «добавьте» в салон одну машину, присвоив ей любые значения марки и года, и затем попросите её «представиться» с помощью созданного метода.
 */

/*
 * // JavaRush
 * Требования:
 * • В программе должен быть объявлен отдельный класс с именем Car.
 * • Класс Car должен содержать два поля: строковое поле carBrand для хранения марки автомобиля и целочисленное поле productionYear для хранения года выпуска.
 * • Класс Car должен иметь конструктор, который принимает значения марки и года выпуска и инициализирует соответствующие поля.
 * • В классе Car должен быть реализован метод displayDetails, который выводит на экран строку в формате: "Марка: [марка автомобиля], год выпуска: [год выпуска]".
 * • В методе main должен быть создан объект класса Car с произвольными значениями марки и года выпуска, после чего для этого объекта должен быть вызван метод displayDetails.
 */

/*
 * // JavaRush
 * Черновик:
 * package ru.javarush.java.core.level14.task05;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Создаем объект Car с произвольными значениями марки и года выпуска
 *
 *
 *         // Просим автомобиль "представиться"
 *
 *     }
 * }
 *
 * // Класс Car хранит марку и год выпуска и умеет выводить информацию о себе
 */

// JavaRush
package ru.javarush.java.core.level14.task05;

public class Solution {
    public static void main(String[] args) {
        // Создаем объект Car с произвольными значениями марки и года выпуска
        Car car = new Car("Toyota", 2018);

        // Просим автомобиль "представиться"
        car.displayDetails();
    }
}

// Класс Car хранит марку и год выпуска и умеет выводить информацию о себе
class Car {
    String carBrand;
    int productionYear;

    Car(String carBrand, int productionYear) {
        this.carBrand = carBrand;
        this.productionYear = productionYear;
    }

    void displayDetails() {
        System.out.println("Марка: " + carBrand + ", год выпуска: " + productionYear);
    }
}

/*
 * // JavaRush
 * Правильное решение:
 * // Author: JavaRush's team
 * package ru.javarush.java.core.level14.task05;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Создаем объект Car с произвольными значениями марки и года выпуска
 *         Car car = new Car("Toyota", 2018);
 *
 *         // Просим автомобиль "представиться"
 *         car.displayDetails();
 *     }
 * }
 *
 * // Класс Car хранит марку и год выпуска и умеет выводить информацию о себе
 * class Car {
 *     String carBrand;       // Марка автомобиля
 *     int productionYear;    // Год выпуска
 *
 *     // Конструктор инициализирует поля значениями из параметров
 *     Car(String carBrand, int productionYear) {
 *         this.carBrand = carBrand;
 *         this.productionYear = productionYear;
 *     }
 *
 *     // Метод выводит фразу нужного формата
 *     void displayDetails() {
 *         System.out.println("Марка: " + carBrand + ", год выпуска: " + productionYear);
 *     }
 * }
 */