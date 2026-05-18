/*
 * Authors: JavaRush's team, CodeGym's team, Altavista360
 * Version: 1.0.0
 */

/*
 * // JavaRush
 * Задача: Добавляем собаку в зоопарк 🐶
 * Ссылка: https://javarush.com/tasks/ru.javarush.java.core.level19.task02
 */

/*
 * // CodeGym
 * Task: Adding a Dog to the Zoo 🐶
 * Link: https://codegym.cc/tasks/en.codegym.java.core.level19.task02
 */

/*
 * // JavaRush
 * Условие:
 * Продолжая работу над вашим симулятором зоопарка, пришло время добавить в него первого полноценного жителя — преданного пса.
 * Вам нужно создать класс Dog, который станет конкретным наследником вашего абстрактного класса Animal.
 * Самое важное — реализовать внутри Dog тот самый метод makeSound() таким образом, чтобы при его вызове на экране гордо появлялось веселое "Гав!".
 */

/*
 * // JavaRush
 * Требования:
 * • Необходимо создать новый класс с именем Dog.
 * • Класс Dog должен быть наследником абстрактного класса Animal.
 * • В классе Dog должен быть реализован метод makeSound(), унаследованный от Animal.
 * • Метод makeSound() в классе Dog должен выводить на экран строку "Гав!".
 */

/*
 * // JavaRush
 * Черновик:
 * package ru.javarush.java.core.level19.task02;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Демонстрация работы: полиморфный вызов makeSound()
 *         Animal dog = new Dog();
 *         dog.makeSound(); // Ожидаемый вывод: Гав!
 *     }
 * }
 */

// JavaRush
package ru.javarush.java.core.level19.task02;

public abstract class Animal {
    public abstract void makeSound();
}

/*
 * // JavaRush
 * Правильное решение:
 * // Author: JavaRush's team
 * package ru.javarush.java.core.level19.task02;
 *
 * // Абстрактный класс, описывающий общее поведение животных
 * public abstract class Animal {
 *     // Абстрактный метод: каждый конкретный вид животного реализует свой звук
 *     public abstract void makeSound();
 * }
 */