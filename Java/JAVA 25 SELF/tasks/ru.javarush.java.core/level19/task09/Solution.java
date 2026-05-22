/*
 * Authors: JavaRush's team, CodeGym's team, Altavista360
 * Version: 1.0.0
 */

/*
 * // JavaRush
 * Задача: Симулятор транспорта: машина едет 🛣️
 * Ссылка: https://javarush.com/tasks/ru.javarush.java.core.level19.task09
 */

/*
 * // CodeGym
 * Task: Transport Simulator: Car Is Driving 🛣️
 * Link: https://codegym.cc/tasks/en.codegym.java.core.level19.task09
 */

/*
 * // JavaRush
 * Условие:
 * Представьте, что вы создаете базовую модель для симулятора дорожного движения. Все транспортные средства умеют двигаться, но машина делает это особым образом.
 * Для начала, создайте абстрактный класс Vehicle с абстрактным методом void move(), который будет представлять общую концепцию перемещения.
 * Затем воплотите в жизнь один из видов транспорта — класс Car. Он должен наследовать Vehicle и реализовать метод move() таким образом, чтобы при его вызове на экране появлялась фраза "Машина едет".
 * Чтобы убедиться, что ваша модель работает как задумано, в методе main создайте экземпляр класса Car и вызовите у него метод move(). В результате вы должны увидеть на экране "Машина едет".
 */

/*
 * // JavaRush
 * Требования:
 * • В программе должен быть объявлен абстрактный класс с именем Vehicle.
 * • Класс Vehicle должен содержать абстрактный метод void move() без реализации.
 * • В программе должен быть объявлен класс Car, который наследует (extends) абстрактный класс Vehicle.
 * • Класс Car обязан реализовать метод move(), который выводит на экран строку "Машина едет".
 * • В методе main необходимо создать объект класса Car и вызвать у него метод move().
 * • В результате работы программы на экране должна появиться строка "Машина едет".
 */

/*
 * // JavaRush
 * Черновик:
 * package ru.javarush.java.core.level19.task09;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Полиморфизм: переменная типа Vehicle ссылается на объект Car
 *         Vehicle car = new Car();
 *
 *         // Вызов переопределённого метода move() у машины
 *         car.move(); // Ожидаемый вывод: "Машина едет"
 *     }
 * }
 */

// JavaRush
package ru.javarush.java.core.level19.task09;

public class Solution {
    public static void main(String[] args) {
        // Полиморфизм: переменная типа Vehicle ссылается на объект Car
        Vehicle car = new Car();

        // Вызов переопределённого метода move() у машины
        car.move(); // Ожидаемый вывод: "Машина едет"
    }
}

abstract class Vehicle {
    public abstract void move();
}

class Car extends Vehicle {
    @Override
    public void move() {
        System.out.println("Машина едет");
    }
}

/*
 * // JavaRush
 * Правильное решение:
 * // Author: JavaRush's team
 * package ru.javarush.java.core.level19.task09;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Полиморфизм: переменная типа Vehicle ссылается на объект Car
 *         Vehicle car = new Car();
 *
 *         // Вызов переопределённого метода move() у машины
 *         car.move(); // Ожидаемый вывод: "Машина едет"
 *     }
 * }
 *
 * // Абстрактный базовый класс для всех транспортных средств
 * abstract class Vehicle {
 *     // Абстрактный метод: конкретные виды транспорта обязаны его реализовать
 *     public abstract void move();
 * }
 *
 * // Конкретный класс транспорта — Машина
 * class Car extends Vehicle {
 *     @Override
 *     public void move() {
 *         // Реализация способа передвижения машины
 *         System.out.println("Машина едет");
 *     }
 * }
 */