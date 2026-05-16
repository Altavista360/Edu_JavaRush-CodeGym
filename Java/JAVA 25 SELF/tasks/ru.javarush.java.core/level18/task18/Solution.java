/*
 * Authors: JavaRush's team, CodeGym's team, Altavista360
 * Version: 1.0.0
 */

/*
 * // JavaRush
 * Задача: Оживляем питомцев: Наследование и реализация абстрактного метода
 * Ссылка: https://javarush.com/tasks/ru.javarush.java.core.level18.task18
 */

/*
 * // CodeGym
 * Task: Bringing Pets to Life: Inheritance and Implementing an Abstract Method
 * Link: https://codegym.cc/tasks/en.codegym.java.core.level18.task18
 */

/*
 * // JavaRush
 * Условие:
 * Вы создаете игру-симулятор питомцев, где каждое животное должно издавать свой уникальный звук. Вы уже знаете, что все животные издают какой-то звук, но пока неясно, какой именно для каждого конкретного вида.
 * Начните с создания абстрактного класса Animal (Животное) с абстрактным методом makeSound() (издать звук). Это будет общий контракт: любое животное в вашей игре должно уметь издавать звук.
 * Теперь пришло время добавить первого конкретного питомца — верного пса! Создайте класс Dog (Собака), который наследует от вашего абстрактного Animal. Поскольку Dog больше не абстрактен, он обязан "выполнить контракт" и реализовать метод makeSound(). Сделайте так, чтобы Dog реализовал makeSound() для вывода на экран радостного "Гав-гав!". Теперь ваш пес умеет по-настоящему "говорить"!
 */

/*
 * // JavaRush
 * Требования:
 * • В программе должен быть создан абстрактный класс с именем Animal.
 * • В абстрактном классе Animal должен быть объявлен абстрактный метод makeSound() без реализации.
 * • Должен быть создан класс Dog, который наследуется от абстрактного класса Animal.
 * • Класс Dog должен реализовать (переопределить) абстрактный метод makeSound().
 * • Реализация метода makeSound() в классе Dog должна выводить на экран строку "Гав-гав!".
 */

/*
 * // JavaRush
 * Черновик:
 * package ru.javarush.java.core.level18.task18;
 *
 * // Задача: абстрактный класс Animal и его наследник Dog, который реализует makeSound()
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Демонстрируем полиморфизм: переменная базового типа ссылается на объект подкласса
 *         Animal pet = new Dog();
 *         pet.makeSound(); // Ожидаемый вывод: "Гав-гав!"
 *     }
 * }
 */

// JavaRush
package ru.javarush.java.core.level18.task18;

// Задача: абстрактный класс Animal и его наследник Dog, который реализует makeSound()
public class Solution {
    public static void main(String[] args) {
        // Демонстрируем полиморфизм: переменная базового типа ссылается на объект подкласса
        Animal pet = new Dog();
        pet.makeSound(); // Ожидаемый вывод: "Гав-гав!"
    }
}

abstract class Animal {
    abstract void makeSound();
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Гав-гав!");
    }
}

/*
 * // JavaRush
 * Правильное решение:
 * // Author: JavaRush's team
 * package ru.javarush.java.core.level18.task18;
 *
 * // Задача: абстрактный класс Animal и его наследник Dog, который реализует makeSound()
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Демонстрируем полиморфизм: переменная базового типа ссылается на объект подкласса
 *         Animal pet = new Dog();
 *         pet.makeSound(); // Ожидаемый вывод: "Гав-гав!"
 *     }
 * }
 *
 * // Абстрактный класс: задаёт общий контракт для животных — уметь издавать звук
 * abstract class Animal {
 *     // Абстрактный метод без реализации: каждый потомок обязан его определить
 *     abstract void makeSound();
 * }
 *
 * // Конкретный класс Собака: реализует уникальный звук
 * class Dog extends Animal {
 *     @Override
 *     void makeSound() {
 *         System.out.println("Гав-гав!");
 *     }
 * }
 */