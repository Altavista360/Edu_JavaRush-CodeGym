/*
 * Authors: JavaRush's team, CodeGym's team, Altavista360
 * Version: 1.0.0
 */

/*
 * // JavaRush
 * Задача: Первое слово вашего цифрового создания 🗣️
 * Ссылка: https://javarush.com/tasks/ru.javarush.java.core.level05.task10
 */

/*
 * // CodeGym
 * Task: The first word of your digital creation 🗣️
 * Link: https://codegym.cc/tasks/en.codegym.java.core.level05.task10
 */

/*
 * // JavaRush
 * Условие:
 * Ваш цифровой дом построен, теперь пора вдохнуть в него жизнь! Вы хотите, чтобы ваша программа произнесла свои первые слова, простое приветствие миру. Это как первое "Hello!" от новорождённого существа в вашем коде.
 * Внутри созданного ранее класса Main, вам нужно определить его "голосовые связки" — специальный метод, который называется public static void main(String[] args). Это стартовая точка, откуда начинается выполнение любой Java-программы. Внутри этого метода напишите команду, которая выводит на экран заветный текст "Hello, World!". Затем, чтобы услышать это приветствие, запустите программу через зелёную стрелку в вашей IDE. В панели вывода (обычно Run или Console) вы должны увидеть текст "Hello, World!", означающий, что ваше создание успешно заговорило.
 */

/*
 * // JavaRush
 * Требования:
 * • В классе Main должен быть объявлен метод public static void main(String[] args).
 * • Внутри метода main должна быть команда, выводящая на экран строку "Hello, World!".
 * • Выводимый текст должен быть точно "Hello, World!" (с учетом регистра и пунктуации).
 * • Программа должна запускаться из метода main без ошибок и выводить результат в консоль.
 */

/*
 * // JavaRush
 * Черновик:
 * package ru.javarush.java.core.level05.task10;
 *
 * public class Main {
 *
 * }
 */

// JavaRush
package ru.javarush.java.core.level05.task10;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}

/*
 * // JavaRush
 * Правильное решение:
 * // Author: JavaRush's team
 * package ru.javarush.java.core.level05.task10;
 *
 * public class Main {
 *     public static void main(String[] args) {
 *         // Выводим на экран текст "Hello, World!"
 *         System.out.println("Hello, World!");
 *     }
 * }
 */