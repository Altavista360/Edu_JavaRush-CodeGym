/*
 * Authors: JavaRush's team, CodeGym's team, Altavista360
 * Version: 1.0.0
 */

/*
 * // JavaRush
 * Задача: Чтение текста из файла и вывод на экран
 * Ссылка: https://javarush.com/tasks/ru.javarush.java.core.level12.task10
 */

/*
 * // CodeGym
 * Task: Reading text from a file and printing to the screen
 * Link: https://codegym.cc/tasks/en.codegym.java.core.level12.task10
 */

/*
 * // JavaRush
 * Условие:
 * После того как вы записали свою вдохновляющую мысль в цифровой дневник, вы хотите убедиться, что она сохранилась правильно, или просто перечитать ее.
 * Ваша задача — открыть ранее созданный файл и показать его содержимое. Считайте весь текст из файла "note.txt" (предполагается, что этот файл уже существует после выполнения предыдущей задачи или был создан вручную).
 * Для чтения также используйте удобные и современные методы из классов Path и Files.
 * В результате выполнения вашей программы на экране должна появиться та самая строка, которая содержится в файле "note.txt".
 */

/*
 * // JavaRush
 * Требования:
 * • Программа должна использовать класс Path для задания пути к файлу "note.txt".
 * • Для чтения содержимого файла должен быть использован класс Files.
 * • Программа должна считать весь текст из файла "note.txt" целиком.
 * • Считанная строка из файла должна быть выведена на экран.
 * • Программа должна корректно работать при условии, что файл "note.txt" уже существует.
 */

/*
 * // JavaRush
 * Черновик:
 * package ru.javarush.java.core.level12.task10;
 *
 * import java.io.IOException;
 * import java.nio.file.Files;
 * import java.nio.file.Path;
 *
 * public class Solution {
 *     public static void main(String[] args) throws IOException {
 *         // Задаем путь к файлу "note.txt" с помощью класса Path
 *
 *
 *         // Считываем весь текст файла целиком удобным методом Files.readString
 *
 *
 *         // Выводим считанное содержимое без добавления лишней новой строки
 *
 *     }
 * }
 */

// JavaRush
package ru.javarush.java.core.level12.task10;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Solution {
    public static void main(String[] args) throws IOException {
        // Задаем путь к файлу "note.txt" с помощью класса Path
        Path someFile = Path.of("note.txt");

        // Считываем весь текст файла целиком удобным методом Files.readString
        String someNote = Files.readString(someFile);

        // Выводим считанное содержимое без добавления лишней новой строки
        System.out.print(someNote);
    }
}

/*
 * // JavaRush
 * Правильное решение:
 * // Author: JavaRush's team
 * package ru.javarush.java.core.level12.task10;
 *
 * import java.nio.file.Files;
 * import java.nio.file.Path;
 * import java.io.IOException;
 *
 * public class Solution {
 *     public static void main(String[] args) throws IOException {
 *         // Задаем путь к файлу "note.txt" с помощью класса Path
 *         Path notePath = Path.of("note.txt");
 *
 *         // Считываем весь текст файла целиком удобным методом Files.readString
 *         String text = Files.readString(notePath);
 *
 *         // Выводим считанное содержимое без добавления лишней новой строки
 *         System.out.print(text);
 *     }
 * }
 */