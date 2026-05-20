/*
 * Authors: JavaRush's team, CodeGym's team, Altavista360
 * Version: 1.0.0
 */

/*
 * // JavaRush
 * Задача: Еще один житель цифрового зоопарка 🐾
 * Ссылка: https://javarush.com/tasks/ru.javarush.java.core.level19.task05
 */

/*
 * // CodeGym
 * Task: Another resident of the digital zoo 🐾
 * Link: https://codegym.cc/tasks/en.codegym.java.core.level19.task05
 */

/*
 * // JavaRush
 * Условие:
 * Представьте, что вы вновь погружаетесь в создание цифрового зоопарка. Для начала, вам нужен общий шаблон для всех обитателей, который говорит, что каждый из них способен издавать звуки, но не определяет, какие именно.
 * Поэтому создайте абстрактный класс Animal, объявив в нём абстрактный метод makeSound().
 * После этого пришло время добавить первого пушистого друга: создайте класс Dog, который станет наследником Animal. Внутри класса Dog обязательно реализуйте метод makeSound() таким образом, чтобы при его вызове на экране появлялось радостное "Гав!".
 */

/*
 * // JavaRush
 * Требования:
 * • В программе должен быть объявлен абстрактный класс с именем Animal.
 * • В абстрактном классе Animal должен быть объявлен абстрактный метод makeSound без реализации.
 * • Должен быть создан класс Dog, который наследует абстрактный класс Animal.
 * • В классе Dog должен быть реализован метод makeSound, который выводит на экран строку "Гав!".
 * • Метод makeSound должен быть публичным и не принимать параметров.
 */

/*
 * // JavaRush
 * Черновик:
 * package ru.javarush.java.core.level19.task05;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Создаем собаку и просим её издать звук
 *         Animal dog = new Dog();
 *         dog.makeSound(); // Ожидается вывод: Гав!
 *     }
 * }
 */

// JavaRush
package ru.javarush.java.core.level19.task05;

public class Solution {
    public static void main(String[] args) {
        // Создаем собаку и просим её издать звук
        Animal dog = new Dog();
        dog.makeSound(); // Ожидается вывод: Гав!
    }
}

abstract class Animal {
    public abstract void makeSound();
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Гав!");
    }
}

/*
 * // JavaRush
 * Правильное решение:
 * // Author: JavaRush's team
 * package ru.javarush.java.core.level19.task05;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Создаем собаку и просим её издать звук
 *         Animal dog = new Dog();
 *         dog.makeSound(); // Ожидается вывод: Гав!
 *     }
 * }
 *
 * // Абстрактный класс — общий шаблон для животных
 * abstract class Animal {
 *     // Абстрактный метод: конкретные животные сами определяют, как звучать
 *     public abstract void makeSound();
 * }
 *
 * // Конкретное животное: собака
 * class Dog extends Animal {
 *     @Override
 *     public void makeSound() {
 *         System.out.println("Гав!");
 *     }
 * }
 */