/*
 * Authors: JavaRush's team, CodeGym's team, Altavista360
 * Version: 1.0.0
 */

/*
 * // JavaRush
 * Задача: Скачивание файла через URL
 * Ссылка: https://javarush.com/tasks/ru.javarush.java.core.level12.task13
 */

/*
 * // CodeGym
 * Task: Download a file via URL
 * Link: https://codegym.cc/tasks/en.codegym.java.core.level12.task13
 */

/*
 * // JavaRush
 * Условие:
 * Представьте, что вы создаете модуль для загрузки изображений для вашего нового фотоальбома. Ваша первая задача — реализовать базовую функцию скачивания изображения из интернета.
 * Создайте программу, которая обратится по веб-адресу https://httpbin.org/image/png и загрузит находящееся там PNG-изображение. Сохраните это изображение на свой диск с именем "image01.png".
 * Для установления соединения и получения потока данных используйте класс URL и его метод openStream(). Для эффективной записи файла на диск воспользуйтесь методом Files.copy().
 * После успешного выполнения программы в вашей рабочей папке должен появиться файл "image01.png", содержащий загруженное изображение.
 */

/*
 * // JavaRush
 * Требования:
 * • Программа должна использовать класс URL для указания адреса изображения в интернете.
 * • Для получения потока данных с удалённого ресурса должен быть использован метод openStream() класса URL.
 * • Программа должна скачивать изображение, доступное по адресу https://httpbin.org/image/png.
 * • Загруженное изображение должно быть сохранено в файл с именем "image01.png" в рабочей директории.
 * • Для записи полученного потока данных на диск должен быть использован метод Files.copy() из пакета java.nio.file.
 */

/*
 * // JavaRush
 * Черновик:
 * package ru.javarush.java.core.level12.task13;
 *
 * import java.io.IOException;
 * import java.net.URL;
 * import java.nio.file.Files;
 * import java.nio.file.Path;
 *
 * public class Solution {
 *     public static void main(String[] args) throws IOException {
 *         // URL изображения, которое нужно скачать
 *         String imageUrl = "https://httpbin.org/image/png";
 *         // Имя файла, в который будет сохранено изображение
 *         String fileName = "image01.png";
 *
 *
 *     }
 * }
 */

// JavaRush
package ru.javarush.java.core.level12.task13;

import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;

public class Solution {
    public static void main(String[] args) throws IOException {
        // URL изображения, которое нужно скачать
        String imageUrl = "https://httpbin.org/image/png";
        // Имя файла, в который будет сохранено изображение
        String fileName = "image01.png";

        URL url = new URL(imageUrl);
        Files.copy(url.openStream(), Path.of(fileName));
    }
}

/*
 * // JavaRush
 * Правильное решение:
 * // Author: JavaRush's team
 * package ru.javarush.java.core.level12.task13;
 *
 * import java.io.IOException;
 * import java.net.URL;
 * import java.nio.file.Files;
 * import java.nio.file.Path;
 *
 * public class Solution {
 *     public static void main(String[] args) throws IOException {
 *         // URL изображения, которое нужно скачать
 *         String imageUrl = "https://httpbin.org/image/png";
 *         // Имя файла, в который будет сохранено изображение
 *         String fileName = "image01.png";
 *
 *         URL url = new URL(imageUrl);
 *         Files.copy(url.openStream(), Path.of(fileName));
 *         System.out.println("Изображение успешно загружено и сохранено как " + fileName);
 *     }
 * }
 */