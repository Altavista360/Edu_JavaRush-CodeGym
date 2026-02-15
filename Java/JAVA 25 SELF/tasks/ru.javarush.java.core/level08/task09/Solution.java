/*
 * Authors: JavaRush's team, CodeGym's team, Altavista360
 * Version: 1.0.0
 */

/*
 * // JavaRush
 * Задача: Умный помощник для персонализированных обращений 🤖
 * Ссылка: https://javarush.com/tasks/ru.javarush.java.core.level08.task09
 */

/*
 * // CodeGym
 * Task: Smart assistant for personalized greetings 🤖
 * Link: https://codegym.cc/tasks/en.codegym.java.core.level08.task09
 */

/*
 * // JavaRush
 * Условие:
 * Представьте, что вы создаете основу для интеллектуального помощника, который должен уметь формировать персонализированные приветствия для каждого пользователя, но при этом давать вам на руки готовую фразу для дальнейшего использования, а не просто выводить её.
 * Разработайте метод под названием generateGreetingMessage, который будет принимать в качестве единственного входного значения recipientName — имя пользователя, представленное строкой.
 * Задача этого метода — не выводить что-либо напрямую, а возвращать полноценную, готовую строку вида "Привет, <имя>!", где <имя> будет заменено на переданное имя пользователя.
 * В главном демонстрационном блоке main вызовите этот метод, передав ему имя "Алиса", и сразу же покажите полученную от него приветственную фразу на экране, чтобы убедиться, что ваш помощник правильно обращается к пользователю.
 */

/*
 * // JavaRush
 * Требования:
 * • Должен быть реализован метод с именем generateGreetingMessage, который возвращает значение типа String.
 * • Метод generateGreetingMessage должен принимать один параметр — строку recipientName, содержащую имя пользователя.
 * • Метод generateGreetingMessage должен возвращать строку в формате "Привет, <имя>!", где <имя> заменяется на значение параметра recipientName.
 * • Метод generateGreetingMessage не должен выводить результат на экран самостоятельно, он только возвращает сформированную строку.
 * • В методе main необходимо вызвать generateGreetingMessage с аргументом "Алиса" и вывести возвращённую строку на экран.
 */

/*
 * // JavaRush
 * Черновик:
 * package ru.javarush.java.core.level08.task09;
 *
 * public class Solution {
 *
 *     // Метод для генерации персонализированного приветствия
 *     public static String generateGreetingMessage(String recipientName) {
 *         // Формируем строку приветствия с использованием переданного имени
 *
 *     }
 *
 *     public static void main(String[] args) {
 *         // Вызываем метод generateGreetingMessage с именем "Алиса"
 *         String greeting = generateGreetingMessage("Алиса");
 *
 *         // Выводим результат на экран
 *         System.out.println(greeting);
 *     }
 * }
 */

// JavaRush
package ru.javarush.java.core.level08.task09;

public class Solution {

    // Метод для генерации персонализированного приветствия
    public static String generateGreetingMessage(String recipientName) {
        // Формируем строку приветствия с использованием переданного имени
        return "Привет, " + recipientName + "!";
    }

    public static void main(String[] args) {
        // Вызываем метод generateGreetingMessage с именем "Алиса"
        String greeting = generateGreetingMessage("Алиса");

        // Выводим результат на экран
        System.out.println(greeting);
    }
}

/*
 * // JavaRush
 * Правильное решение:
 * // Author: JavaRush's team
 * package ru.javarush.java.core.level08.task09;
 *
 * public class Solution {
 *
 *     // Метод для генерации персонализированного приветствия
 *     public static String generateGreetingMessage(String recipientName) {
 *         // Формируем строку приветствия с использованием переданного имени
 *         return "Привет, " + recipientName + "!";
 *     }
 *
 *     public static void main(String[] args) {
 *         // Вызываем метод generateGreetingMessage с именем "Алиса"
 *         String greeting = generateGreetingMessage("Алиса");
 *
 *         // Выводим результат на экран
 *         System.out.println(greeting);
 *     }
 * }
 */