/*
 * Authors: JavaRush's team, CodeGym's team, Altavista360
 * Version: 1.0.0
 */

/*
 * // JavaRush
 * Задача: Зеркальное послание волшебника 📜
 * Ссылка: https://javarush.com/tasks/ru.javarush.java.core.level05.task03
 */

/*
 * // CodeGym
 * Task: Wizard's Mirror Message 📜
 * Link: https://codegym.cc/tasks/en.codegym.java.core.level05.task03
 */

/*
 * // JavaRush
 * Условие:
 * В старинном свитке вы обнаружили загадочное послание от забытого волшебника. Его слова имеют необычную природу: чтобы раскрыть их истинный смысл, их нужно прочитать в обратном порядке. Это как смотреть в волшебное зеркало, которое переворачивает все буквы.
 * Ваша задача — написать программу, которая поможет вам увидеть его "обратную сторону". Попросите пользователя ввести любую строку текста (назовите её magicMessage). Затем ваша программа должна мгновенно отразить это послание, выведя все символы в строго обратном порядке. Так, если введено слово "cat", должно появиться "tac".
 */

/*
 * // JavaRush
 * Требования:
 * • Программа должна запросить у пользователя ввод строки и сохранить её в переменную с именем magicMessage.
 * • Программа должна корректно прочитать строку, введённую пользователем, с помощью стандартных средств ввода Java.
 * • Программа должна преобразовать строку magicMessage так, чтобы все символы в ней располагались в обратном порядке.
 * • Программа должна вывести преобразованную (инвертированную) строку на экран.
 */

/*
 * // JavaRush
 * Черновик:
 * package ru.javarush.java.core.level05.task03;
 *
 * import java.util.Scanner;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *
 *
 *         // Просим пользователя ввести строку (послание)
 *
 *
 *         // Разворачиваем строку с помощью цикла for
 *
 *
 *         // Выводим инвертированную строку
 *
 *     }
 * }
 */

// JavaRush
package ru.javarush.java.core.level05.task03;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner inputData = new Scanner(System.in);

        // Просим пользователя ввести строку (послание)
        System.out.println("Введите волшебное послание:");
        String magicMessage = inputData.nextLine();

        // Разворачиваем строку с помощью цикла for
        String  gnirtsTupni = "";
        for (int i = magicMessage.length() - 1; i >= 0; i--) {
            gnirtsTupni += magicMessage.charAt(i);
        }

        // Выводим инвертированную строку
        System.out.println(gnirtsTupni);
    }
}

/*
 * // JavaRush
 * Правильное решение:
 * // Author: JavaRush's team
 * package ru.javarush.java.core.level05.task03;
 *
 * import java.util.Scanner;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         Scanner console = new Scanner(System.in);
 *
 *         // Просим пользователя ввести строку (послание)
 *         System.out.println("Введите волшебное послание:");
 *         String magicMessage = console.nextLine(); // сохраняем ввод в переменную с нужным именем
 *
 *         // Разворачиваем строку с помощью цикла for
 *         String reversed = "";
 *         for (int i = magicMessage.length() - 1; i >= 0; i--) {
 *             reversed += magicMessage.charAt(i);
 *         }
 *
 *         // Выводим инвертированную строку
 *         System.out.println(reversed);
 *     }
 * }
 */