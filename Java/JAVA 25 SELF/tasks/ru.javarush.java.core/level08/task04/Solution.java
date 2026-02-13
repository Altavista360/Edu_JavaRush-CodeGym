/*
 * Authors: JavaRush's team, CodeGym's team, Altavista360
 * Version: 1.0.0
 */

/*
 * // JavaRush
 * Задача: Усилитель сообщений для громких объявлений 📣
 * Ссылка: https://javarush.com/tasks/ru.javarush.java.core.level08.task04
 */

/*
 * // CodeGym
 * Task: Message amplifier for loud announcements 📣
 * Link: https://codegym.cc/tasks/en.codegym.java.core.level08.task04
 */

/*
 * // JavaRush
 * Условие:
 * Вообразите, что вы создаёте специальный текстовый генератор для рекламных щитов или чат-бота, которому иногда нужно очень убедительно повторить одно и то же сообщение, чтобы привлечь внимание. Вам нужен инструмент, который возьмёт любую фразу и умножит её заданное количество раз, выводя сразу на публичное обозрение.
 * Сконструируйте класс MessageAmplifier, это будет ваш мастер по громким объявлениям. Внутри него создайте публичный статический метод amplifyAndDisplay.
 * Этот метод должен принимать два входных значения: messageText, то есть саму фразу, и numberOfRepeats — сколько раз её нужно повторить. После этого amplifyAndDisplay должен мгновенно склеить фразу столько раз, сколько указано, и вывести получившуюся длинную, мощную строку прямо на экран.
 * Для демонстрации его способностей, в вашем главном стартовом блоке main, попросите MessageAmplifier усилить сообщение "Ура!" 4 раза.
 */

/*
 * // JavaRush
 * Требования:
 * • В программе должен быть создан публичный класс с именем MessageAmplifier.
 * • В классе MessageAmplifier должен быть определён публичный статический метод amplifyAndDisplay.
 * • Метод amplifyAndDisplay должен принимать два параметра: строку messageText и целое число numberOfRepeats.
 * • Метод amplifyAndDisplay должен формировать новую строку, которая состоит из messageText, повторённого numberOfRepeats раз подряд.
 * • Метод amplifyAndDisplay должен выводить получившуюся строку на экран.
 * • В методе main основной программы должен быть вызван метод MessageAmplifier.amplifyAndDisplay с аргументами "Ура!" и 4.
 */

/*
 * // JavaRush
 * Черновик:
 * package ru.javarush.java.core.level08.task04;
 *
 * public class MessageAmplifier {
 *
 *     // Публичный статический метод, который повторяет строку и выводит результат
 *     public static void amplifyAndDisplay(String messageText, int numberOfRepeats) {
 *         // Используем обычную строку и оператор +
 *
 *
 *         // Выводим итоговую "усиленную" строку
 *
 *     }
 *
 *     public static void main(String[] args) {
 *         // Демонстрация работы: усиливаем сообщение "Ура!" четыре раза
 *         amplifyAndDisplay("Ура!", 4);
 *     }
 * }
 */

// JavaRush
package ru.javarush.java.core.level08.task04;

public class MessageAmplifier {

    // Публичный статический метод, который повторяет строку и выводит результат
    public static void amplifyAndDisplay(String messageText, int numberOfRepeats) {
        // Используем обычную строку и оператор +
        String answer = "";
        for (int i = 0; i < numberOfRepeats; i++) {
            answer += messageText;
        }
        // Выводим итоговую "усиленную" строку
        System.out.println(answer);
    }

    public static void main(String[] args) {
        // Демонстрация работы: усиливаем сообщение "Ура!" четыре раза
        amplifyAndDisplay("Ура!", 4);
    }
}

/*
 * // JavaRush
 * Правильное решение:
 * // Author: JavaRush's team
 * package ru.javarush.java.core.level08.task04;
 *
 * public class MessageAmplifier {
 *
 *     // Публичный статический метод, который повторяет строку и выводит результат
 *     public static void amplifyAndDisplay(String messageText, int numberOfRepeats) {
 *         // Используем обычную строку и оператор +
 *         String result = "";
 *         for (int i = 0; i < numberOfRepeats; i++) {
 *             result += messageText;
 *         }
 *
 *         // Выводим итоговую "усиленную" строку
 *         System.out.println(result);
 *     }
 *
 *     public static void main(String[] args) {
 *         // Демонстрация работы: усиливаем сообщение "Ура!" четыре раза
 *         amplifyAndDisplay("Ура!", 4);
 *     }
 * }
 */