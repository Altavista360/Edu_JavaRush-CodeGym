/*
 * Authors: JavaRush's team, CodeGym's team, Altavista360
 * Version: 1.0.0
 */

/*
 * // JavaRush
 * Задача: Скачивание файла с помощью transferTo
 * Ссылка: https://javarush.com/tasks/ru.javarush.java.core.level12.task14
 */

/*
 * // CodeGym
 * Task: Downloading a file using transferTo
 * Link: https://codegym.cc/tasks/en.codegym.java.core.level12.task14
 */

/*
 * // JavaRush
 * Условие:
 * Вы продолжаете улучшать свой модуль загрузки файлов, стремясь к максимальной эффективности. На этот раз вам нужно загрузить JPEG-изображение, используя более современный и потоковый подход к передаче данных.
 * Напишите программу, которая скачивает файл по адресу https://httpbin.org/image/jpeg. Сохраните его на диск с именем "image02.jpg".
 * Для получения входного потока данных по URL используйте класс URL и метод openStream(), как и раньше. Однако для записи в выходной поток примените метод transferTo(), который позволяет напрямую передать данные из InputStream в OutputStream. Выходной поток для файла создайте с помощью Files.newOutputStream(). Убедитесь, что после выполнения программы на вашем диске появится файл "image02.jpg".
 */

/*
 * // JavaRush
 * Требования:
 * • Программа должна использовать класс URL и его метод openStream() для получения InputStream с данными изображения по адресу https://httpbin.org/image/jpeg.
 * • Для записи файла на диск программа должна создать OutputStream с помощью метода Files.newOutputStream() и указать имя файла "image02.jpg".
 * • Программа должна использовать метод transferTo() объекта InputStream для передачи всех данных напрямую в OutputStream.
 * • В результате выполнения программы на диске должен появиться файл с именем "image02.jpg" и корректным содержимым изображения.
 */

/*
 * // JavaRush
 * Черновик:
 * package ru.javarush.java.core.level12.task14;
 *
 * import java.io.IOException;
 * import java.io.InputStream;
 * import java.io.OutputStream;
 * import java.net.URL;
 * import java.nio.file.Files;
 * import java.nio.file.Path;
 *
 * public class Solution {
 *     public static void main(String[] args) throws IOException {
 *         // Создаем объект URL для указания адреса изображения
 *         URL url = new URL("https://httpbin.org/image/jpeg");
 *
 *         // Открываем InputStream из URL (открытие соединения и получение данных)
 *
 *
 *         // Создаем OutputStream для записи данных в файл image02.jpg
 *
 *
 *         // Метод transferTo напрямую передаст все байты из input в output
 *
 *     }
 * }
 */

// JavaRush
package ru.javarush.java.core.level12.task14;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;

public class Solution {
    public static void main(String[] args) throws IOException {
        // Создаем объект URL для указания адреса изображения
        URL url = new URL("https://httpbin.org/image/jpeg");

        // Открываем InputStream из URL (открытие соединения и получение данных)
        InputStream inputJpeg = new URL(url).openStream();

        // Создаем OutputStream для записи данных в файл image02.jpg
        OutputStream outputJpeg = Files.newOutputStream(Path.of("image02.jpg"));

        // Метод transferTo напрямую передаст все байты из input в output
        inputJpeg.transferTo(outputJpeg);
    }
}

/*
 * // JavaRush
 * Правильное решение:
 * // Author: JavaRush's team
 * package ru.javarush.java.core.level12.task14;
 *
 * import java.net.URL;
 * import java.io.InputStream;
 * import java.io.OutputStream;
 * import java.nio.file.Files;
 * import java.nio.file.Path;
 * import java.io.IOException;
 *
 * public class Solution {
 *     public static void main(String[] args) throws IOException {
 *         // Создаем объект URL для указания адреса изображения
 *         URL url = new URL("https://httpbin.org/image/jpeg");
 *
 *         // Открываем InputStream из URL (открытие соединения и получение данных)
 *         InputStream input = url.openStream();
 *
 *         // Создаем OutputStream для записи данных в файл image02.jpg
 *         OutputStream output = Files.newOutputStream(Path.of("image02.jpg"));
 *
 *         // Метод transferTo напрямую передаст все байты из input в output
 *         input.transferTo(output);
 *     }
 * }
 */