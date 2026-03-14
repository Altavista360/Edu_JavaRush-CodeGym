/*
 * Authors: JavaRush's team, CodeGym's team, Altavista360
 * Version: 1.0.0
 */

/*
 * // JavaRush
 * Задача: Копирование файла
 * Ссылка: https://javarush.com/tasks/ru.javarush.java.core.level12.task12
 */

/*
 * // CodeGym
 * Task: Copying a file
 * Link: https://codegym.cc/tasks/en.codegym.java.core.level12.task12
 */

/*
 * // JavaRush
 * Условие:
 * Вам необходимо сделать резервную копию важного бинарного файла перед тем, как вы начнете его редактировать.
 * Представьте, что у вас есть файл "letters.bin" (созданный в предыдущей задаче), и вам нужна его точная копия под другим именем.
 * Скопируйте содержимое файла "letters.bin" в новый файл, который будет называться "letters_copy.bin".
 * Для выполнения этой операции используйте эффективные методы Files.readAllBytes для чтения всего содержимого исходного файла и Files.write для записи его в новый файл.
 * После завершения программы в вашей рабочей папке должен появиться новый файл "letters_copy.bin", полностью идентичный исходному "letters.bin".
 */

/*
 * // JavaRush
 * Требования:
 * • Для работы с файлами программа должна использовать класс java.nio.file.Files.
 * • Содержимое файла "letters.bin" должно быть полностью считано с помощью метода Files.readAllBytes.
 * • Считанные байты должны быть записаны в новый файл "letters_copy.bin" с помощью метода Files.write.
 * • Файл "letters_copy.bin" должен быть идентичен по содержимому исходному файлу "letters.bin".
 * • Операции чтения и записи должны выполняться как с бинарными файлами, без преобразования данных.
 * • Файл "letters_copy.bin" должен появиться в той же рабочей папке, где находится "letters.bin".
 */

/*
 * // JavaRush
 * Черновик:
 * package ru.javarush.java.core.level12.task12;
 *
 * import java.nio.file.Files;
 * import java.nio.file.Path;
 *
 * public class Solution {
 *     public static void main(String[] args) throws Exception {
 *         // Определяем пути к файлам в текущей рабочей папке
 *
 *
 *         // Считываем все байты исходного файла с помощью Files.readAllBytes
 *
 *
 *         // Записываем байты в новый файл с помощью Files.write
 *         // Это создаст файл, если его нет, и перезапишет, если он уже существует
 *
 *     }
 * }
 */

// JavaRush


/*
 * // JavaRush
 * Правильное решение:
 * // Author: JavaRush's team
 * package ru.javarush.java.core.level12.task12;
 *
 * import java.nio.file.Files;
 * import java.nio.file.Path;
 *
 * public class Solution {
 *     public static void main(String[] args) throws Exception {
 *         // Определяем пути к файлам в текущей рабочей папке
 *         Path source = Path.of("letters.bin");
 *         Path target = Path.of("letters_copy.bin");
 *
 *         // Считываем все байты исходного файла с помощью Files.readAllBytes
 *         byte[] data = Files.readAllBytes(source);
 *
 *         // Записываем байты в новый файл с помощью Files.write
 *         // Это создаст файл, если его нет, и перезапишет, если он уже существует
 *         Files.write(target, data);
 *     }
 * }
 */