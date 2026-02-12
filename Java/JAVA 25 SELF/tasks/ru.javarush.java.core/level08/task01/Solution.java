/*
 * Authors: JavaRush's team, CodeGym's team, Altavista360
 * Version: 1.0.0
 */

/*
 * // JavaRush
 * Задача: Ваше первое заклинание в мире Java ✨
 * Ссылка: https://javarush.com/tasks/ru.javarush.java.core.level08.task01
 */

/*
 * // CodeGym
 * Task: Your first spell in the world of Java ✨
 * Link: https://codegym.cc/tasks/en.codegym.java.core.level08.task01
 */

/*
 * // JavaRush
 * Условие:
 * Представьте, что вы — начинающий волшебник в огромной, загадочной стране Java, и настало время произнести ваше первое заклинание! Ваша самая главная задача — создать простейшую программу, которая сможет поприветствовать этот удивительный цифровой мир.
 * Для этого вам необходимо создать магический класс с именем Program.
 * Внутри этого класса отыщите специальный волшебный портал main, который является точкой входа для всех ваших заклинаний. Когда вы активируете этот портал, ваша программа должна громко и ясно произнести на весь экран приветственную фразу: "Привет, Java!".
 * Убедитесь, что именно это магическое приветствие появится при запуске вашей первой программы.
 */

/*
 * // JavaRush
 * Требования:
 * • В программе должен быть создан публичный класс с именем Program.
 * • В классе Program должен быть объявлен статический метод main с сигнатурой public static void main(String[] args).
 * • Внутри метода main должно быть выполнено отображение строки "Привет, Java!" на экран.
 * • Программа должна вывести на экран только строку "Привет, Java!" без дополнительных символов, пробелов или строк.
 */

/*
 * // JavaRush
 * Черновик:
 * package ru.javarush.java.core.level08.task01;
 *
 * public class Program {
 *     public static void main(String[] args) {
 *         // Выводим на экран приветственное сообщение
 *
 *     }
 * }
 */

// JavaRush
package ru.javarush.java.core.level08.task01;

public class Program {
    public static void main(String[] args) {
        // Выводим на экран приветственное сообщение
        System.out.print("Привет, Java!");
    }
}

/*
 * // JavaRush
 * Правильное решение:
 * // Author: JavaRush's team
 * package ru.javarush.java.core.level08.task01;
 *
 * public class Program {
 *     public static void main(String[] args) {
 *         // Выводим на экран приветственное сообщение
 *         System.out.println("Привет, Java!");
 *     }
 * }
 */