/*
 * Authors: JavaRush's team, CodeGym's team, Altavista360
 * Version: 1.0.0
 */

/*
 * // JavaRush
 * Задача: Личное приветствие для нового пользователя 👋
 * Ссылка: https://javarush.com/tasks/ru.javarush.java.core.level08.task05
 */

/*
 * // CodeGym
 * Task: Personal greeting for a new user 👋
 * Link: https://codegym.cc/tasks/en.codegym.java.core.level08.task05
 */

/*
 * // JavaRush
 * Условие:
 * Представьте, что вы создаете интерактивное приложение, которое стремится лично приветствовать каждого своего нового пользователя, делая его визит по-настоящему особенным. Ваша задача — написать специальную функцию, которая будет обращаться к человеку по имени, создавая ощущение индивидуального подхода.
 * Создайте класс PersonalGreeter.
 * Внутри него объявите статический метод welcomeNewUser, который будет принимать в качестве единственного параметра userName — это строка, содержащая имя пользователя. Этот метод должен формировать и выводить на экран дружелюбную фразу, начинающуюся с "Приветствуем тебя, " и сразу же добавлять к ней переданное имя пользователя.
 * Чтобы проверить, как это работает, в главном стартовом блоке main вызовите welcomeNewUser, передав ему имя "Аня", и убедитесь, что приложение тепло её поприветствует.
 */

/*
 * // JavaRush
 * Требования:
 * • В программе должен быть объявлен класс с именем PersonalGreeter.
 * • Внутри класса PersonalGreeter должен быть объявлен статический метод с именем welcomeNewUser.
 * • Метод welcomeNewUser должен принимать один параметр типа String, который содержит имя пользователя.
 * • Метод welcomeNewUser должен формировать строку, начинающуюся с "Приветствуем тебя, " и добавлять к ней имя пользователя, после чего выводить получившуюся строку на экран.
 * • В методе main класса PersonalGreeter должен быть вызван метод welcomeNewUser с аргументом "Аня".
 */

/*
 * // JavaRush
 * Черновик:
 * package ru.javarush.java.core.level08.task05;
 *
 * public class PersonalGreeter {
 *     // Статический метод для приветствия нового пользователя
 *     public static void welcomeNewUser(String userName) {
 *         // Формируем строку приветствия и выводим её на экран
 *
 *     }
 *
 *     public static void main(String[] args) {
 *         // Вызываем метод welcomeNewUser с именем "Аня"
 *         welcomeNewUser("Аня");
 *     }
 * }
 */

// JavaRush
package ru.javarush.java.core.level08.task05;

public class PersonalGreeter {
    // Статический метод для приветствия нового пользователя
    public static void welcomeNewUser(String userName) {
        // Формируем строку приветствия и выводим её на экран
        System.out.println("Приветствуем тебя, " + userName);
    }

    public static void main(String[] args) {
        // Вызываем метод welcomeNewUser с именем "Аня"
        welcomeNewUser("Аня");
    }
}

/*
 * // JavaRush
 * Правильное решение:
 * // Author: JavaRush's team
 * package ru.javarush.java.core.level08.task05;
 *
 * public class PersonalGreeter {
 *     // Статический метод для приветствия нового пользователя
 *     public static void welcomeNewUser(String userName) {
 *         // Формируем строку приветствия и выводим её на экран
 *         System.out.println("Приветствуем тебя, " + userName);
 *     }
 *
 *     public static void main(String[] args) {
 *         // Вызываем метод welcomeNewUser с именем "Аня"
 *         welcomeNewUser("Аня");
 *     }
 * }
 */