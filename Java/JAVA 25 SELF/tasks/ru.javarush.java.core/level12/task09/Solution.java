/*
 * Authors: JavaRush's team, CodeGym's team, Altavista360
 * Version: 1.0.0
 */

/*
 * // JavaRush
 * Задача: Запись строки в текстовый файл
 * Ссылка: https://javarush.com/tasks/ru.javarush.java.core.level12.task09
 */

/*
 * // CodeGym
 * Task: Write a line to a text file
 * Link: https://codegym.cc/tasks/en.codegym.java.core.level12.task09
 */

/*
 * // JavaRush
 * Условие:
 * Представьте, что вы ведете свой личный цифровой дневник. Каждый день вы хотите записывать одну вдохновляющую мысль.
 * Ваша задача — взять сегодняшнюю мысль и сохранить ее в новый файл. Создайте текстовый файл с именем "note.txt" в текущей рабочей папке вашей программы. Затем аккуратно запишите в него вдохновляющую строку "Сегодня отличный день!", используя современные методы работы с файлами, такие как Path и Files.
 * осле успешного выполнения программы вы должны найти файл "note.txt" на своем компьютере, и он должен содержать именно эту строку.
 */

/*
 * // JavaRush
 * Требования:
 * • В программе должен использоваться класс Path для задания пути к файлу "note.txt".
 * • Для записи строки в файл должен использоваться класс Files и его современные методы.
 * • В текущей рабочей директории программы должен быть создан файл с именем "note.txt".
 * • В файл "note.txt" должна быть записана строка "Сегодня отличный день!".
 * • Строка должна быть записана в файл в корректной текстовой кодировке (например, UTF-8).
 * • В файле "note.txt" не должно быть ничего, кроме строки "Сегодня отличный день!".
 */

/*
 * // JavaRush
 * Черновик:
 * package ru.javarush.java.core.level12.task09;
 *
 * import java.io.IOException;
 * import java.nio.charset.StandardCharsets;
 * import java.nio.file.Files;
 * import java.nio.file.Path;
 *
 * public class Solution {
 *     public static void main(String[] args) throws IOException {
 *         // Создаем объект Path для файла "note.txt" в текущей директории
 *
 *
 *         // Строка, которую нужно записать в файл
 *
 *
 *         // Записываем строку в файл с использованием кодировки UTF-8
 *
 *     }
 * }
 */

// JavaRush
package ru.javarush.java.core.level12.task09;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class Solution {
    public static void main(String[] args) throws IOException {
        // Создаем объект Path для файла "note.txt" в текущей директории
        Path myFile = Path.of("note.txt");

        // Строка, которую нужно записать в файл
        String someNote = "Сегодня отличный день!";

        // Записываем строку в файл с использованием кодировки UTF-8
        Files.writeString(myFile, someNote, StandardCharsets.UTF_8);
    }
}

/*
 * // JavaRush
 * Правильное решение:
 * // Author: JavaRush's team
 * package ru.javarush.java.core.level12.task09;
 *
 * import java.io.IOException;
 * import java.nio.file.Files;
 * import java.nio.file.Path;
 * import java.nio.charset.StandardCharsets;
 *
 * public class Solution {
 *     public static void main(String[] args) throws IOException {
 *         // Создаем объект Path для файла "note.txt" в текущей директории
 *         Path filePath = Path.of("note.txt");
 *
 *         // Строка, которую нужно записать в файл
 *         String content = "Сегодня отличный день!";
 *
 *         // Записываем строку в файл с использованием кодировки UTF-8
 *         Files.writeString(filePath, content, StandardCharsets.UTF_8);
 *     }
 * }
 */