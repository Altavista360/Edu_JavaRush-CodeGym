/*
 * Authors: JavaRush's team, CodeGym's team, Altavista360
 * Version: 1.0.0
 */

/*
 * // JavaRush
 * Задача: Интерактивная доска объявлений: временное приветствие 👋
 * Ссылка: https://javarush.com/tasks/ru.javarush.java.core.level16.task13
 */

/*
 * // CodeGym
 * Task: Interactive bulletin board: temporary greeting 👋
 * Link: https://codegym.cc/tasks/en.codegym.java.core.level16.task13
 */

/*
 * // JavaRush
 * Условие:
 * Представьте, что вы разрабатываете интерактивную доску объявлений, которая умеет показывать различные сообщения. Иногда вам нужно вывести очень специфичное, временное сообщение, которое актуально только в определённый момент выполнения кода, и вам не требуется создавать для него отдельный глобальный класс.
 * В классе DisplayBoard объявите метод showTemporaryMessage(). Внутри этого метода showTemporaryMessage() объявите локальный класс с именем GreetingDisplay. Этот GreetingDisplay должен содержать метод displayMessage(), который выводит на экран строку "Привет из локального класса!". Создайте объект GreetingDisplay и вызовите его метод displayMessage(), чтобы на экране появилось это временное приветствие.
 */

/*
 * // JavaRush
 * Требования:
 * • В классе DisplayBoard должен быть объявлен метод showTemporaryMessage().
 * • Внутри метода showTemporaryMessage() должен быть объявлен локальный класс с именем GreetingDisplay.
 * • Локальный класс GreetingDisplay должен содержать метод displayMessage(), который выводит строку "Привет из локального класса!".
 * • Внутри метода showTemporaryMessage() должен быть создан объект класса GreetingDisplay.
 * • После создания объекта GreetingDisplay должен быть вызван его метод displayMessage(), чтобы на экран было выведено временное приветствие.
 */

/*
 * // JavaRush
 * Черновик:
 * package ru.javarush.java.core.level16.task13;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Небольшая демонстрация работы доски объявлений
 *         DisplayBoard board = new DisplayBoard();
 *         board.showTemporaryMessage();
 *     }
 * }
 *
 * class DisplayBoard {
 *
 *     // Метод, внутри которого объявляется локальный класс
 *     public void showTemporaryMessage() {
 *         // Локальный класс доступен только в пределах этого метода
 *
 *
 *         // Создаем объект локального класса и вызываем его метод
 *
 *     }
 * }
 */

// JavaRush
package ru.javarush.java.core.level16.task13;

public class Solution {
    public static void main(String[] args) {
        // Небольшая демонстрация работы доски объявлений
        DisplayBoard board = new DisplayBoard();
        board.showTemporaryMessage();
    }
}

class DisplayBoard {

    // Метод, внутри которого объявляется локальный класс
    public void showTemporaryMessage() {
        // Локальный класс доступен только в пределах этого метода
        class GreetingDisplay {
            void displayMessage() {
                System.out.println("Привет из локального класса!");
            }
        }

        // Создаем объект локального класса и вызываем его метод
        GreetingDisplay greeting = new GreetingDisplay();
        greeting.displayMessage();
    }
}

/*
 * // JavaRush
 * Правильное решение:
 * // Author: JavaRush's team
 * package ru.javarush.java.core.level16.task13;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Небольшая демонстрация работы доски объявлений
 *         DisplayBoard board = new DisplayBoard();
 *         board.showTemporaryMessage();
 *     }
 * }
 *
 * class DisplayBoard {
 *
 *     // Метод, внутри которого объявляется локальный класс
 *     public void showTemporaryMessage() {
 *         // Локальный класс доступен только в пределах этого метода
 *         class GreetingDisplay {
 *             // Метод локального класса выводит временное сообщение
 *             void displayMessage() {
 *                 System.out.println("Привет из локального класса!");
 *             }
 *         }
 *
 *         // Создаем объект локального класса и вызываем его метод
 *         GreetingDisplay greeting = new GreetingDisplay();
 *         greeting.displayMessage();
 *     }
 * }
 */