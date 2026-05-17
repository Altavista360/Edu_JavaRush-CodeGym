/*
 * Authors: JavaRush's team, CodeGym's team, Altavista360
 * Version: 1.0.0
 */

/*
 * // JavaRush
 * Задача: Динамичная ферма: Абстрактные классы, поля и полиморфизм
 * Ссылка: https://javarush.com/tasks/ru.javarush.java.core.level18.task20
 */

/*
 * // CodeGym
 * Task: Dynamic Farm: Abstract Classes, Fields, and Polymorphism
 * Link: https://codegym.cc/tasks/en.codegym.java.core.level18.task20
 */

/*
 * // JavaRush
 * Условие:
 * Вы создаете цифровую ферму, где каждое животное не только издает свой уникальный звук, но и имеет собственное имя, что делает их более персонализированными.
 * Начните с создания абстрактного класса Animal (Животное). Добавьте в него поле String name (имя) для каждого животного. Также объявите абстрактный метод makeSound() (издать звук).
 * Теперь пришло время наполнить вашу ферму обитателями. Создайте два класса-наследника: Cat (Кошка) и Cow (Корова). Каждый из них должен реализовать метод makeSound() так, чтобы он не просто издавал звук, но и включал имя животного. Например, "Барсик: Мяу!" или "Зорька: Мууу!". Не забудьте в конструкторах этих классов принимать имя и присваивать его полю name родительского класса.
 * В методе main представьте, что вы прогуливаетесь по своей ферме. Создайте массив типа Animal из двух элементов. Поместите туда объекты Cat и Cow, дайте им разные, уникальные имена (например, "Мурка" и "Буренка"). Теперь пройдитесь по массиву и вызовите makeSound() для каждого элемента. Ваша программа должна вдохнуть жизнь в вашу ферму, выводя имена и уникальные звуки обоих животных, демонстрируя их индивидуальность.
 */

/*
 * // JavaRush
 * Требования:
 * • Необходимо создать абстрактный класс Animal, который будет содержать поле String name и абстрактный метод makeSound().
 * • В абстрактном классе Animal должно быть объявлено поле String name, предназначенное для хранения имени животного.
 * • В абстрактном классе Animal должен быть объявлен абстрактный метод makeSound(), не принимающий параметров и не возвращающий значение.
 * • Классы Cat и Cow должны наследоваться от абстрактного класса Animal.
 * • В классах Cat и Cow должен быть реализован конструктор, принимающий имя животного и присваивающий его полю name родительского класса.
 * • Классы Cat и Cow должны реализовать метод makeSound() так, чтобы он выводил на экран строку с именем животного и уникальным звуком (например, "Мурка: Мяу!" или "Буренка: Мууу!").
 * • В методе main необходимо создать массив типа Animal из двух элементов и поместить в него объекты Cat и Cow с разными именами.
 * • В методе main требуется пройтись по массиву Animal и вызвать метод makeSound() для каждого элемента, чтобы на экран были выведены имена и уникальные звуки обоих животных.
 */

/*
 * // JavaRush
 * Черновик:
 * package ru.javarush.java.core.level18.task20;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Создаем массив типа Animal и наполняем его разными животными
 *         Animal[] animals = new Animal[2];
 *         animals[0] = new Cat("Мурка");
 *         animals[1] = new Cow("Буренка");
 *
 *         // Полиморфный вызов: у каждого животного вызывается его реализация makeSound()
 *         for (Animal animal : animals) {
 *             animal.makeSound();
 *         }
 *     }
 * }
 */

// JavaRush
package ru.javarush.java.core.level18.task20;

abstract class Animal {
    protected String name;

    public abstract void makeSound();
}

class Cat extends Animal {
    public Cat(String name) {
        this.name = name;
    }

    @Override
    public void makeSound() {
        System.out.println(name + ": Мяу!");
    }
}

class Cow extends Animal {
    public Cow(String name) {
        this.name = name;
    }

    @Override
    public void makeSound() {
        System.out.println(name + ": Мууу!");
    }
}

public class Solution {
    public static void main(String[] args) {
        // Создаем массив типа Animal и наполняем его разными животными
        Animal[] animals = new Animal[2];
        animals[0] = new Cat("Мурка");
        animals[1] = new Cow("Буренка");

        // Полиморфный вызов: у каждого животного вызывается его реализация makeSound()
        for (Animal animal : animals) {
            animal.makeSound();
        }
    }
}

/*
 * // JavaRush
 * Правильное решение:
 * // Author: JavaRush's team
 * package ru.javarush.java.core.level18.task20;
 *
 * // Абстрактный базовый класс для всех животных фермы
 * abstract class Animal {
 *     // Имя животного (доступно наследникам)
 *     protected String name;
 *
 *     // Абстрактный метод: каждый потомок реализует свой звук
 *     public abstract void makeSound();
 * }
 *
 * // Кошка — конкретный потомок Animal
 * class Cat extends Animal {
 *     // В конструкторе принимаем имя и записываем его в поле родителя
 *     public Cat(String name) {
 *         this.name = name; // присваиваем унаследованному полю name
 *     }
 *
 *     @Override
 *     public void makeSound() {
 *         // Выводим имя и уникальный звук кошки
 *         System.out.println(name + ": Мяу!");
 *     }
 * }
 *
 * // Корова — конкретный потомок Animal
 * class Cow extends Animal {
 *     // В конструкторе принимаем имя и записываем его в поле родителя
 *     public Cow(String name) {
 *         this.name = name; // присваиваем унаследованному полю name
 *     }
 *
 *     @Override
 *     public void makeSound() {
 *         // Выводим имя и уникальный звук коровы
 *         System.out.println(name + ": Мууу!");
 *     }
 * }
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Создаем массив типа Animal и наполняем его разными животными
 *         Animal[] animals = new Animal[2];
 *         animals[0] = new Cat("Мурка");
 *         animals[1] = new Cow("Буренка");
 *
 *         // Полиморфный вызов: у каждого животного вызывается его реализация makeSound()
 *         for (Animal animal : animals) {
 *             animal.makeSound();
 *         }
 *     }
 * }
 */