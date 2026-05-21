/*
 * Authors: JavaRush's team, CodeGym's team, Altavista360
 * Version: 1.0.0
 */

/*
 * // JavaRush
 * Задача: Геометрический редактор: фигуры и их площади 📐
 * Ссылка: https://javarush.com/tasks/ru.javarush.java.core.level19.task07
 */

/*
 * // CodeGym
 * Task: Geometric Editor: Shapes and Their Areas 📐
 * Link: https://codegym.cc/tasks/en.codegym.java.core.level19.task07
 */

/*
 * // JavaRush
 * Условие:
 * Представьте, что вы разрабатываете мощный графический редактор, который должен уметь работать с разнообразными геометрическими фигурами. Каждая фигура обладает своим уникальным названием и, конечно же, площадью, но способ вычисления этой площади для каждой фигуры индивидуален.
 * Для начала, создайте абстрактный класс Shape. Внутри него определите поле String name для хранения имени фигуры и абстрактный метод double area(), который будет отвечать за вычисление её площади.
 * Важно также реализовать в классе Shape конструктор, который будет принимать имя фигуры и сохранять его в соответствующем поле.
 * Теперь пришло время добавить одну из самых фундаментальных фигур — круг. Создайте класс Circle, который должен наследовать ваш Shape. Добавьте в Circle поле double radius для хранения радиуса и реализуйте конструктор, который позволит задать как имя круга, так и его радиус. Внутри Circle вам также потребуется реализовать метод area() так, чтобы он возвращал площадь круга, используя формулу π * radius * radius (для π можете использовать Math.PI или просто 3.14).
 * В главном методе программы, main, создайте экземпляр класса Circle, присвоив ему имя "Круг" и радиус 2.0. В завершение, выведите на экран сначала имя этого круга, а затем значение его площади, чтобы убедиться, что все расчеты выполнены верно.
 */

/*
 * // JavaRush
 * Требования:
 * • Необходимо создать абстрактный класс с именем Shape.
 * • В классе Shape должно быть объявлено поле String name для хранения имени фигуры.
 * • В классе Shape должен быть объявлен абстрактный метод double area(), который будет возвращать площадь фигуры.
 * • В классе Shape должен быть реализован конструктор, принимающий имя фигуры и сохраняющий его в поле name.
 * • Должен быть создан класс Circle, который наследует абстрактный класс Shape.
 * • В классе Circle должно быть объявлено поле double radius для хранения радиуса круга.
 * • В классе Circle должен быть реализован конструктор, который принимает имя и радиус круга и сохраняет их в соответствующие поля.
 * • Класс Circle должен реализовывать метод area(), который возвращает площадь круга по формуле π * radius * radius (использовать Math.PI или 3.14).
 * • В методе main необходимо создать объект класса Circle с именем "Круг" и радиусом 2.0, а затем вывести на экран имя круга и его площадь.
 */

/*
 * // JavaRush
 * Черновик:
 * package ru.javarush.java.core.level19.task07;
 *
 * // Главный класс с точкой входа
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Создаем круг с именем "Круг" и радиусом 2.0
 *         Circle circle = new Circle("Круг", 2.0);
 *
 *         // Сначала выводим имя фигуры
 *         System.out.println(circle.name);
 *
 *         // Затем выводим площадь круга
 *         System.out.println(circle.area());
 *     }
 * }
 */

// JavaRush
package ru.javarush.java.core.level19.task07;

// Главный класс с точкой входа
public class Solution {
    public static void main(String[] args) {
        // Создаем круг с именем "Круг" и радиусом 2.0
        Circle circle = new Circle("Круг", 2.0);

        // Сначала выводим имя фигуры
        System.out.println(circle.name);

        // Затем выводим площадь круга
        System.out.println(circle.area());
    }
}

abstract class Shape {
    String name;

    Shape(String name) {
        this.name = name;
    }

    abstract double area();
}

class Circle extends Shape {
    double radius;

    Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}

/*
 * // JavaRush
 * Правильное решение:
 * // Author: JavaRush's team
 * package ru.javarush.java.core.level19.task07;
 *
 * // Главный класс с точкой входа
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Создаем круг с именем "Круг" и радиусом 2.0
 *         Circle circle = new Circle("Круг", 2.0);
 *
 *         // Сначала выводим имя фигуры
 *         System.out.println(circle.name);
 *
 *         // Затем выводим площадь круга
 *         System.out.println(circle.area());
 *     }
 * }
 *
 * // Абстрактный класс фигуры: хранит имя и знает, что у фигуры есть площадь
 * abstract class Shape {
 *     String name; // имя фигуры
 *
 *     // Конструктор принимает имя и сохраняет его
 *     Shape(String name) {
 *         this.name = name;
 *     }
 *
 *     // Абстрактный метод вычисления площади (реализация в подклассах)
 *     abstract double area();
 * }
 *
 * // Конкретная фигура — круг
 * class Circle extends Shape {
 *     double radius; // радиус круга
 *
 *     // Конструктор круга: принимает имя и радиус
 *     Circle(String name, double radius) {
 *         super(name);        // сохраняем имя в базовом классе
 *         this.radius = radius;
 *     }
 *
 *     @Override
 *     double area() {
 *         // Площадь круга: π * r^2
 *         return Math.PI * radius * radius;
 *     }
 * }
 */