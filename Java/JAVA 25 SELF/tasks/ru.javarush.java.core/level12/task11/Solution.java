/*
 * Authors: JavaRush's team, CodeGym's team, Altavista360
 * Version: 1.0.0
 */

/*
 * // JavaRush
 * Задача: Запись и чтение бинарных данных
 * Ссылка: https://javarush.com/tasks/ru.javarush.java.core.level12.task11
 */

/*
 * // CodeGym
 * Task: Writing and reading binary data
 * Link: https://codegym.cc/tasks/en.codegym.java.core.level12.task11
 */

/*
 * // JavaRush
 * Условие:
 * Вы разрабатываете систему для шифрования секретных сообщений и решили начать с простого теста: сохранения и чтения отдельных символов в бинарном формате.
 * Сформируйте массив байтов, который будет содержать числовые значения 72, 73, 74. Это соответствует символам 'H', 'I', 'J' в кодировке ASCII.
 * Запишите этот массив байтов в новый файл с именем "letters.bin".
 * Затем, чтобы убедиться в целостности данных, прочитайте содержимое этого же файла "letters.bin" обратно в новый массив байтов.
 * После этого пройдитесь по каждому байту в прочитанном массиве и выведите его на экран как соответствующий символ, разделяя символы пробелами.
 * В итоге вы должны увидеть на экране: H I J.
 */

/*
 * // JavaRush
 * Требования:
 * • Необходимо создать массив байтов, содержащий значения 72, 73 и 74.
 * • Требуется записать созданный массив байтов в новый файл с именем "letters.bin" в бинарном формате.
 * • Требуется прочитать содержимое файла "letters.bin" обратно в новый массив байтов.
 * • Для каждого байта в прочитанном массиве нужно вывести соответствующий символ на экран.
 * • Символы должны быть выведены на экран через пробел, итоговая строка вывода: H I J.
 */

/*
 * // JavaRush
 * Черновик:
 * package ru.javarush.java.core.level12.task11;
 *
 * import java.io.IOException;
 * import java.nio.file.Files;
 * import java.nio.file.Path;
 *
 * public class Solution {
 *     public static void main(String[] args) throws IOException {
 *         // 1) Создаем массив байтов с ASCII-кодами букв H, I, J
 *
 *
 *         // 2) Записываем массив в бинарный файл "letters.bin"
 *
 *
 *         // 3) Читаем содержимое файла обратно в новый массив байтов
 *
 *
 *         // 4) Выводим каждый байт как символ, разделяя пробелами
 *
 *     }
 * }
 */

// JavaRush
package ru.javarush.java.core.level12.task11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Solution {
    public static void main(String[] args) throws IOException {
        // 1) Создаем массив байтов с ASCII-кодами букв H, I, J
        byte[] foo = {72, 73, 74};

        // 2) Записываем массив в бинарный файл "letters.bin"
        Files.write(Path.of("letters.bin"), foo);

        // 3) Читаем содержимое файла обратно в новый массив байтов
        byte[] bar = Files.readAllBytes(Path.of("letters.bin"));

        // 4) Выводим каждый байт как символ, разделяя пробелами
        for (byte i : bar)
        {
            System.out.print((char)i + " ");
        }
    }
}

/*
 * // JavaRush
 * Правильное решение:
 * // Author: JavaRush's team
 * package ru.javarush.java.core.level12.task11;
 *
 * import java.nio.file.Files;
 * import java.nio.file.Path;
 * import java.io.IOException;
 *
 * public class Solution {
 *     public static void main(String[] args) throws IOException {
 *         // 1) Создаем массив байтов с ASCII-кодами букв H, I, J
 *         byte[] bytesToWrite = {72, 73, 74};
 *
 *         // 2) Записываем массив в бинарный файл "letters.bin"
 *         Path file = Path.of("letters.bin");
 *         Files.write(file, bytesToWrite); // создаст файл или перезапишет его
 *
 *         // 3) Читаем содержимое файла обратно в новый массив байтов
 *         byte[] bytesRead = Files.readAllBytes(file);
 *
 *         // 4) Выводим каждый байт как символ, разделяя пробелами
 *         for (int i = 0; i < bytesRead.length; i++) {
 *             if (i > 0) System.out.print(" "); // разделяем символы пробелом
 *             System.out.print((char) bytesRead[i]); // преобразуем байт в символ
 *         }
 *     }
 * }
 */