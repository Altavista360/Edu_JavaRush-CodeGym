/*
 * Authors: JavaRush's team, CodeGym's team, Altavista360
 * Version: 1.0.0
 */

/*
 * // JavaRush
 * Задача: Межгалактический переводчик: мгновенное приветствие 🚀
 * Ссылка: https://javarush.com/tasks/ru.javarush.java.core.level16.task10
 */

/*
 * // CodeGym
 * Task: Intergalactic Translator: Instant Greeting 🚀
 * Link: https://codegym.cc/tasks/en.codegym.java.core.level16.task10
 */

/*
 * // JavaRush
 * Условие:
 * Вы создаёте универсальный переводчик для межгалактических путешествий. Этот переводчик должен уметь 'приветствовать' любую форму жизни. Для быстрого теста вам нужен одноразовый модуль приветствия, который сразу же выдаст фразу "Привет, мир!", без необходимости строить полноценный языковой модуль.
 * Сначала создайте интерфейс Communicator с методом void greet(). В главном методе вашей программы (main) создайте объект, который реализует интерфейс Communicator, используя анонимный класс. В реализации метода greet() анонимного класса пусть выводится сообщение "Привет, мир!". Затем вызовите метод greet() для созданного объекта, чтобы убедиться, что ваш переводчик успешно произносит приветствие.
 */

/*
 * // JavaRush
 * Требования:
 * • В программе должен быть объявлен интерфейс Communicator с методом void greet().
 * • В методе main необходимо создать объект, реализующий интерфейс Communicator, с помощью анонимного класса.
 * • В анонимном классе метод greet() должен быть реализован таким образом, чтобы выводить на экран сообщение "Привет, мир!".
 * • В методе main должен быть вызван метод greet() для созданного объекта, чтобы сообщение "Привет, мир!" появилось на экране.
 * • Не должно быть отдельного именованного класса, реализующего Communicator — реализация должна быть только через анонимный класс.
 */

/*
 * // JavaRush
 * Черновик:
 * package ru.javarush.java.core.level16.task10;
 *
 * // Объявляем интерфейс Communicator с единственным методом greet
 * interface Communicator {
 *     void greet();
 * }
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Создаем объект анонимного класса, реализующего Communicator
 *
 *
 *         // Вызываем метод greet(), чтобы вывести приветствие на экран
 *
 *     }
 * }
 */

// JavaRush
package ru.javarush.java.core.level16.task10;

// Объявляем интерфейс Communicator с единственным методом greet
interface Communicator {
    void greet();
}

public class Solution {
    public static void main(String[] args) {
        // Создаем объект анонимного класса, реализующего Communicator
        Communicator translator = new Communicator() {
            @Override
            public void greet() {
                System.out.println("Привет, мир!");
            }
        };

        // Вызываем метод greet(), чтобы вывести приветствие на экран
        translator.greet();
    }
}

/*
 * // JavaRush
 * Правильное решение:
 * // Author: JavaRush's team
 * package ru.javarush.java.core.level16.task10;
 *
 * // Объявляем интерфейс Communicator с единственным методом greet
 * interface Communicator {
 *     void greet();
 * }
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Создаем объект анонимного класса, реализующего Communicator
 *         Communicator translator = new Communicator() {
 *             @Override
 *             public void greet() {
 *                 // Мгновенное приветствие
 *                 System.out.println("Привет, мир!");
 *             }
 *         };
 *
 *         // Вызываем метод greet(), чтобы вывести приветствие на экран
 *         translator.greet();
 *     }
 * }
 */