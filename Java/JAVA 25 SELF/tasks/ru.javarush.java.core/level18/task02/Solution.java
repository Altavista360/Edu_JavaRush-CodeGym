/*
 * Authors: JavaRush's team, CodeGym's team, Altavista360
 * Version: 1.0.0
 */

/*
 * // JavaRush
 * Задача: Хор фермы: Полиморфизм с несколькими голосами
 * Ссылка: https://javarush.com/tasks/ru.javarush.java.core.level18.task02
 */

/*
 * // CodeGym
 * Task: Farm Choir: Polymorphism with Multiple Voices
 * Link: https://codegym.cc/tasks/en.codegym.java.core.level18.task02
 */

/*
 * // JavaRush
 * Условие:
 * Ваш зоопарк расширяется, и теперь вы отвечаете за виртуальную ферму, где животные должны звучать по-своему, но их всех нужно «попросить» издавать звуки одним и тем же способом. Начните с уже знакомого базового класса Animal с методом void makeSound(), который выводит "Какой-то звук...". Это будет основа для всех обитателей вашей фермы.
 * Теперь добавьте новых жильцов: грациозную кошку (Cat) и величественную корову (Cow). Оба эти класса должны наследовать от Animal. Пусть Cat переопределяет makeSound(), чтобы выводить нежное "Мяу!", а Cow — протяжное "Мууу!".
 * В методе main представьте, что вы собираете всех своих животных в один "загон". Для этого создайте массив, который способен хранить объекты типа Animal. Поместите в этот массив по одному объекту Cat и Cow. Теперь ваша задача — пройтись по этому "загону" с помощью цикла и попросить каждое животное "издать свой звук", вызвав makeSound() у каждого элемента массива. В результате ваша программа должна создать настоящий фермерский хор, выводя на экран сначала "Мяу!", а затем "Мууу!".
 */

/*
 * // JavaRush
 * Требования:
 * • Должен быть создан класс Animal с методом void makeSound(), который по умолчанию выводит "Какой-то звук...".
 * • Должны быть созданы классы Cat и Cow, которые наследуются от класса Animal.
 * • Класс Cat должен переопределять метод makeSound() так, чтобы он выводил "Мяу!".
 * • Класс Cow должен переопределять метод makeSound() так, чтобы он выводил "Мууу!".
 * • В методе main должен быть создан массив, способный хранить объекты типа Animal.
 * • В массив должны быть добавлены по одному объекту Cat и Cow.
 * • В методе main необходимо пройтись по массиву с помощью цикла и вызвать метод makeSound() для каждого элемента массива.
 * • Результат вызова makeSound() должен зависеть от фактического типа объекта (Cat или Cow), а не от типа переменной массива (Animal).
 */

/*
 * // JavaRush
 * Черновик:
 * package ru.javarush.java.core.level18.task02;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Массив типа Animal хранит ссылки на разные конкретные животные.
 *         Animal[] pen = { new Cat(), new Cow() };
 *
 *         // Полиморфизм: вызывается версия makeSound() конкретного объекта,
 *         // даже если переменная имеет тип базового класса Animal.
 *         for (Animal animal : pen) {
 *             animal.makeSound(); // Ожидаемый вывод: "Мяу!" затем "Мууу!"
 *         }
 *     }
 * }
 */

// JavaRush
package ru.javarush.java.core.level18.task02;

class Animal {
    void makeSound() {
        System.out.println("Какой-то звук...");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Мяу!");
    }
}

class Cow extends Animal {
    @Override
    void makeSound() {
        System.out.println("Мууу!");
    }
}

public class Solution {
    public static void main(String[] args) {
        // Массив типа Animal хранит ссылки на разные конкретные животные.
        Animal[] pen = { new Cat(), new Cow() };

        // Полиморфизм: вызывается версия makeSound() конкретного объекта,
        // даже если переменная имеет тип базового класса Animal.
        for (Animal animal : pen) {
            animal.makeSound(); // Ожидаемый вывод: "Мяу!" затем "Мууу!"
        }
    }
}

/*
 * // JavaRush
 * Правильное решение:
 * // Author: JavaRush's team
 * package ru.javarush.java.core.level18.task02;
 *
 * // Базовый класс для всех животных на ферме.
 * // У него есть метод makeSound(), который можно переопределять в потомках.
 * class Animal {
 *     void makeSound() {
 *         System.out.println("Какой-то звук...");
 *     }
 * }
 *
 * // Кошка — наследник Animal. Переопределяет звук под себя.
 * class Cat extends Animal {
 *     @Override
 *     void makeSound() {
 *         System.out.println("Мяу!");
 *     }
 * }
 *
 * // Корова — наследник Animal. Переопределяет звук под себя.
 * class Cow extends Animal {
 *     @Override
 *     void makeSound() {
 *         System.out.println("Мууу!");
 *     }
 * }
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Массив типа Animal хранит ссылки на разные конкретные животные.
 *         Animal[] pen = { new Cat(), new Cow() };
 *
 *         // Полиморфизм: вызывается версия makeSound() конкретного объекта,
 *         // даже если переменная имеет тип базового класса Animal.
 *         for (Animal animal : pen) {
 *             animal.makeSound(); // Ожидаемый вывод: "Мяу!" затем "Мууу!"
 *         }
 *     }
 * }
 */