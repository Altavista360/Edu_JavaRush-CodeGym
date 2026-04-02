/*
 * Authors: JavaRush's team, CodeGym's team, Altavista360
 * Version: 1.0.0
 */

/*
 * // JavaRush
 * Задача: Расставляем машины на виртуальной витрине
 * Ссылка: https://javarush.com/tasks/ru.javarush.java.core.level14.task11
 */

/*
 * // CodeGym
 * Task: Placing cars in a virtual showroom
 * Link: https://codegym.cc/tasks/en.codegym.java.core.level14.task11
 */

/*
 * // JavaRush
 * Условие:
 * Вы — владелец виртуального автосалона, и на вашей площадке стоят несколько совершенно разных машин, хоть и одной модели, каждая со своей историей.
 * Ваша задача — создать шаблон для автомобиля, назвав его Car, который будет хранить его марку (String carBrand) и год выпуска (int carYear).
 * Затем, в вашем главном сценарии (main методе), "выставьте" на продажу две совершенно независимые машины. Первой присвойте марку "Toyota" и год выпуска 2020. Второй — марку "Lada" и год выпуска 2010.
 * После этого "представьте" каждую из этих машин публике, выведя на экран информацию о каждой в формате: "Марка: [марка автомобиля], год выпуска: [год выпуска]".
 */

/*
 * // JavaRush
 * Требования:
 * • Необходимо создать отдельный класс с именем Car.
 * • Класс Car должен содержать два поля: строковое поле carBrand и целочисленное поле carYear.
 * • В методе main необходимо создать два независимых объекта класса Car с помощью оператора new.
 * • Первому объекту класса Car должны быть присвоены значения "Toyota" для carBrand и 2020 для carYear, второму — "Lada" для carBrand и 2010 для carYear.
 * • Информация о каждом автомобиле должна быть выведена на экран в формате: "Марка: [марка автомобиля], год выпуска: [год выпуска]".
 */

/*
 * // JavaRush
 * Черновик:
 * package ru.javarush.java.core.level14.task11;
 *
 * // Класс-шаблон для автомобиля: хранит марку и год выпуска
 *
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Создаем два независимых объекта класса Car с помощью new
 *
 *
 *         // Инициализируем поля первого автомобиля
 *
 *
 *         // Инициализируем поля второго автомобиля
 *
 *
 *         // Выводим информацию о каждом автомобиле в требуемом формате
 *
 *     }
 * }
 */

// JavaRush
package ru.javarush.java.core.level14.task11;

// Класс-шаблон для автомобиля: хранит марку и год выпуска
class Car {
    String carBrand;
    int carYear;
}

public class Solution {
    public static void main(String[] args) {
        // Создаем два независимых объекта класса Car с помощью new
        Car foo = new Car();
        Car bar = new Car();

        // Инициализируем поля первого автомобиля
        foo.carBrand = "Toyota";
        foo.carYear = 2020;

        // Инициализируем поля второго автомобиля
        bar.carBrand = "Lada";
        bar.carYear = 2010;

        // Выводим информацию о каждом автомобиле в требуемом формате
        System.out.println("Марка: " + foo.carBrand + ", год выпуска: " + foo.carYear);
        System.out.println("Марка: " + bar.carBrand + ", год выпуска: " + bar.carYear);
    }
}

/*
 * // JavaRush
 * Правильное решение:
 * // Author: JavaRush's team
 * package ru.javarush.java.core.level14.task11;
 *
 * // Класс-шаблон для автомобиля: хранит марку и год выпуска
 * class Car {
 *     String carBrand; // марка автомобиля
 *     int carYear;     // год выпуска
 * }
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Создаем два независимых объекта класса Car с помощью new
 *         Car firstCar = new Car();
 *         Car secondCar = new Car();
 *
 *         // Инициализируем поля первого автомобиля
 *         firstCar.carBrand = "Toyota";
 *         firstCar.carYear = 2020;
 *
 *         // Инициализируем поля второго автомобиля
 *         secondCar.carBrand = "Lada";
 *         secondCar.carYear = 2010;
 *
 *         // Выводим информацию о каждом автомобиле в требуемом формате
 *         System.out.println("Марка: " + firstCar.carBrand + ", год выпуска: " + firstCar.carYear);
 *         System.out.println("Марка: " + secondCar.carBrand + ", год выпуска: " + secondCar.carYear);
 *     }
 * }
 */