/*
 * Authors: JavaRush's team, CodeGym's team, Altavista360
 * Version: 1.0.0
 */

/*
 * // JavaRush
 * Задача: Волшебная ферма: уникальный звук существа 🪄
 * Ссылка: https://javarush.com/tasks/ru.javarush.java.core.level16.task09
 */

/*
 * // CodeGym
 * Task: Magic Farm: A Creature's Unique Sound 🪄
 * Link: https://codegym.cc/tasks/en.codegym.java.core.level16.task09
 */

/*
 * // JavaRush
 * Условие:
 * Вы работаете на ферме магических существ, где каждое животное издаёт свой уникальный звук. У вас есть общий шаблон для всех животных, но одно из существ настолько необычно, что ему нужен особенный, ни на что не похожий звук, который вы хотите определить прямо на месте, без создания отдельного файла класса.
 * Сначала создайте базовый класс MagicalCreature с методом void makeSound(), который выводит на экран общее сообщение, например, "Существо издаёт звук".
 * В главном методе вашей программы (main) создайте объект MagicalCreature с помощью анонимного класса. Переопределите метод makeSound() таким образом, чтобы при его вызове выводилось сообщение "Ква-ква!". Вызовите метод makeSound() для созданного объекта, чтобы услышать его уникальный звук.
 */

/*
 * // JavaRush
 * Требования:
 * • В программе должен быть определён класс MagicalCreature с методом void makeSound(), который выводит на экран сообщение "Существо издаёт звук".
 * • В методе main должен быть создан объект класса MagicalCreature с помощью анонимного класса.
 * • В анонимном классе метод makeSound() должен быть переопределён так, чтобы он выводил на экран сообщение "Ква-ква!".
 * • В методе main должен быть вызван метод makeSound() для созданного объекта, и на экран должно выводиться "Ква-ква!".
 */

/*
 * // JavaRush
 * Черновик:
 * package ru.javarush.java.core.level16.task09;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Создаем объект MagicalCreature с помощью анонимного класса
 *
 *
 *         // Вызываем метод, чтобы услышать уникальный звук
 *
 *     }
 * }
 *
 * // Базовый класс с общим поведением
 * class MagicalCreature {
 *     void makeSound() {
 *         // Общий звук для любых магических существ
 *         System.out.println("Существо издаёт звук");
 *     }
 * }
 */

// JavaRush
package ru.javarush.java.core.level16.task09;

public class Solution {
    public static void main(String[] args) {
        // Создаем объект MagicalCreature с помощью анонимного класса
        MagicalCreature creature = new MagicalCreature() {
            @Override
            public void makeSound() {
                System.out.println("Ква-ква!");
            }
        };

        // Вызываем метод, чтобы услышать уникальный звук
        creature.makeSound();
    }
}

// Базовый класс с общим поведением
class MagicalCreature {
    void makeSound() {
        // Общий звук для любых магических существ
        System.out.println("Существо издаёт звук");
    }
}

/*
 * // JavaRush
 * Правильное решение:
 * // Author: JavaRush's team
 * package ru.javarush.java.core.level16.task09;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Создаем объект MagicalCreature с помощью анонимного класса
 *         MagicalCreature creature = new MagicalCreature() {
 *             @Override
 *             public void makeSound() {
 *                 // Переопределяем звук для уникального существа
 *                 System.out.println("Ква-ква!");
 *             }
 *         };
 *
 *         // Вызываем метод, чтобы услышать уникальный звук
 *         creature.makeSound();
 *     }
 * }
 *
 * // Базовый класс с общим поведением
 * class MagicalCreature {
 *     void makeSound() {
 *         // Общий звук для любых магических существ
 *         System.out.println("Существо издаёт звук");
 *     }
 * }
 */