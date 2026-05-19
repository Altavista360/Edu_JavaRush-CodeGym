/*
 * Authors: JavaRush's team, CodeGym's team, Altavista360
 * Version: 1.0.0
 */

/*
 * // JavaRush
 * Задача: Оживляем транспорт в городе 🚗🚲
 * Ссылка: https://javarush.com/tasks/ru.javarush.java.core.level19.task03
 */

/*
 * // CodeGym
 * Task: Bringing vehicles to life in the city 🚗🚲
 * Link: https://codegym.cc/tasks/en.codegym.java.core.level19.task03
 */

/*
 * // JavaRush
 * Условие:
 * Вообразите себя инженером, который проектирует систему управления городским транспортом. Каждое транспортное средство способно перемещаться, но делает это по-своему, будь то машина, едущая по дороге, или велосипед, крутящий педали.
 * Для начала создайте абстрактный класс Vehicle с одним абстрактным методом move(), который будет символизировать движение без конкретных деталей. Затем воплотите в жизнь два конкретных вида транспорта: класс Car и класс Bicycle.
 * Оба этих класса должны наследовать Vehicle и реализовать свой собственный способ передвижения: пусть Car выводит на экран фразу "Машина едет по дороге", а Bicycle — "Велосипед крутит педали".
 * Чтобы убедиться, что ваша система работает, в главном методе программы, main, создайте коллекцию, способную вмещать объекты типа Vehicle, и добавьте в неё по одному экземпляру Car и Bicycle. После этого пройдитесь по вашей коллекции и для каждого транспортного средства вызовите метод move(), чтобы увидеть, как они оживают и демонстрируют свое уникальное движение.
 */

/*
 * // JavaRush
 * Требования:
 * • Необходимо создать абстрактный класс с именем Vehicle.
 * • В классе Vehicle должен быть объявлен один абстрактный метод move без реализации.
 * • Должен быть создан класс Car, который наследует Vehicle и реализует метод move.
 * • Должен быть создан класс Bicycle, который наследует Vehicle и реализует метод move.
 * • В реализации метода move класса Car должно выводиться "Машина едет по дороге".
 * • В реализации метода move класса Bicycle должно выводиться "Велосипед крутит педали".
 * • В методе main должна быть создана коллекция, способная хранить объекты типа Vehicle.
 * • В коллекцию должны быть добавлены по одному объекту классов Car и Bicycle.
 * • В методе main необходимо пройтись по коллекции и для каждого объекта вызвать метод move.
 */

/*
 * // JavaRush
 * Черновик:
 * package ru.javarush.java.core.level19.task03;
 *
 * import java.util.ArrayList;
 * import java.util.List;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Коллекция, способная хранить объекты типа Vehicle (полиморфизм)
 *         List<Vehicle> vehicles = new ArrayList<>();
 *
 *         // Добавляем по одному объекту Car и Bicycle
 *         vehicles.add(new Car());
 *         vehicles.add(new Bicycle());
 *
 *         // Проходимся по коллекции и "оживляем" транспорт, вызывая move()
 *         for (Vehicle vehicle : vehicles) {
 *             vehicle.move();
 *         }
 *     }
 * }
 */

// JavaRush
package ru.javarush.java.core.level19.task03;

import java.util.ArrayList;
import java.util.List;

abstract class Vehicle {
    public abstract void move();
}

class Car extends Vehicle {
    @Override
    public void move() {
        System.out.println("Машина едет по дороге");
    }
}

class Bicycle extends Vehicle {
    @Override
    public void move() {
        System.out.println("Велосипед крутит педали");
    }
}

public class Solution {
    public static void main(String[] args) {
        // Коллекция, способная хранить объекты типа Vehicle (полиморфизм)
        List<Vehicle> vehicles = new ArrayList<>();

        // Добавляем по одному объекту Car и Bicycle
        vehicles.add(new Car());
        vehicles.add(new Bicycle());

        // Проходимся по коллекции и "оживляем" транспорт, вызывая move()
        for (Vehicle vehicle : vehicles) {
            vehicle.move();
        }
    }
}

/*
 * // JavaRush
 * Правильное решение:
 * // Author: JavaRush's team
 * package ru.javarush.java.core.level19.task03;
 *
 * import java.util.ArrayList;
 * import java.util.List;
 *
 * // Абстрактный класс, описывающий обобщённое транспортное средство
 * abstract class Vehicle {
 *     // Абстрактный метод движения: у разных транспортов он свой
 *     public abstract void move();
 * }
 *
 * // Конкретный транспорт: Машина
 * class Car extends Vehicle {
 *     @Override
 *     public void move() {
 *         // Уникальная реализация движения для машины
 *         System.out.println("Машина едет по дороге");
 *     }
 * }
 *
 * // Конкретный транспорт: Велосипед
 * class Bicycle extends Vehicle {
 *     @Override
 *     public void move() {
 *         // Уникальная реализация движения для велосипеда
 *         System.out.println("Велосипед крутит педали");
 *     }
 * }
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Коллекция, способная хранить объекты типа Vehicle (полиморфизм)
 *         List<Vehicle> vehicles = new ArrayList<>();
 *
 *         // Добавляем по одному объекту Car и Bicycle
 *         vehicles.add(new Car());
 *         vehicles.add(new Bicycle());
 *
 *         // Проходимся по коллекции и "оживляем" транспорт, вызывая move()
 *         for (Vehicle vehicle : vehicles) {
 *             vehicle.move();
 *         }
 *     }
 * }
 */