/*
 * Authors: JavaRush's team, CodeGym's team, Altavista360
 * Version: 1.0.0
 */

/*
 * // JavaRush
 * Задача: Получение типа содержимого и размера файла
 * Ссылка: https://javarush.com/tasks/ru.javarush.java.core.level12.task16
 */

/*
 * // CodeGym
 * Task: Getting the content type and file size
 * Link: https://codegym.cc/tasks/en.codegym.java.core.level12.task16
 */

/*
 * // JavaRush
 * Условие:
 * Ваша задача — не просто скачать файл, но и получить о нем важную метаинформацию прямо во время загрузки. Вы хотите узнать его тип и размер, прежде чем сохранить его.
 * Скачайте файл по адресу https://httpbin.org/image/png, используя HttpClient. После того как получите ответ от сервера, извлеките и выведите на экран два ключевых значения: тип содержимого файла (который находится в заголовке Content-Type ответа) и общий размер файла в байтах.
 * Формат вывода должен быть таким: "Тип: image/png, Размер: 1234 байт".
 * Только после вывода этой информации сохраните загруженное изображение на диск с именем "image04.png".
 */

/*
 * // JavaRush
 * Требования:
 * • Для скачивания файла должен использоваться класс HttpClient из стандартной библиотеки Java.
 * • Программа должна отправлять GET-запрос по адресу https://httpbin.org/image/png.
 * • После получения ответа необходимо извлечь значение заголовка Content-Type и использовать его для вывода типа содержимого.
 * • Программа должна определить общий размер загруженного файла в байтах на основе ответа сервера.
 * • Информация о типе содержимого и размере файла должна выводиться в формате: "Тип: image/png, Размер: 1234 байт".
 */

/*
 * // JavaRush
 * Черновик:
 * package ru.javarush.java.core.level12.task16;
 *
 * import java.net.URI;
 * import java.net.http.HttpClient;
 * import java.net.http.HttpRequest;
 * import java.net.http.HttpResponse;
 * import java.nio.file.Files;
 * import java.nio.file.Path;
 *
 * public class Solution {
 *     public static void main(String[] args) throws Exception {
 *         // Создаем HttpClient из стандартной библиотеки Java
 *
 *
 *         // Готовим GET-запрос на указанный URL
 *
 *
 *         // Отправляем запрос и сразу получаем тело как массив байт
 *
 *
 *         // Извлекаем тип содержимого из заголовка Content-Type
 *
 *
 *         // Определяем размер файла по длине массива байт ответа
 *
 *
 *         // Сначала выводим информацию о типе и размере
 *
 *
 *         // Только после вывода сохраняем изображение на диск
 *
 *     }
 * }
 */

// JavaRush
package ru.javarush.java.core.level12.task16;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.Files;
import java.nio.file.Path;

public class Solution {
    public static void main(String[] args) throws Exception {
        // Создаем HttpClient из стандартной библиотеки Java
        HttpClient client = HttpClient.newHttpClient();

        // Готовим GET-запрос на указанный URL
        String url = "https://httpbin.org/image/png";
        HttpRequest request = HttpRequest.newBuilder(url).build();

        // Отправляем запрос и сразу получаем тело как массив байт
        HttpResponse<byte[]> response = client.send(request, HttpResponse.BodyHandlers.ofByteArray());

        // Извлекаем тип содержимого из заголовка Content-Type
        String contentType = response.headers().firstValue("Content-Type").orElse("неизвестный тип");

        // Определяем размер файла по длине массива байт ответа
        byte[] contentBody = response.body();
        int contentSize = contentBody.length;

        // Сначала выводим информацию о типе и размере
        System.out.println("Тип: " + contentType  + ", Размер: " + contentSize + " байт");

        // Только после вывода сохраняем изображение на диск
        Files.write(Path.of("image04.png", contentBody));
    }
}

/*
 * // JavaRush
 * Правильное решение:
 * // Author: JavaRush's team
 * package ru.javarush.java.core.level12.task16;
 *
 * import java.net.URI;
 * import java.net.http.HttpClient;
 * import java.net.http.HttpRequest;
 * import java.net.http.HttpResponse;
 * import java.nio.file.Files;
 * import java.nio.file.Path;
 *
 * public class Solution {
 *     public static void main(String[] args) throws Exception {
 *         // Создаем HttpClient из стандартной библиотеки Java
 *         HttpClient client = HttpClient.newHttpClient();
 *
 *         // Готовим GET-запрос на указанный URL
 *         HttpRequest request = HttpRequest.newBuilder()
 *                 .uri(URI.create("https://httpbin.org/image/png"))
 *                 .GET()
 *                 .build();
 *
 *         // Отправляем запрос и сразу получаем тело как массив байт
 *         HttpResponse<byte[]> response = client.send(request, HttpResponse.BodyHandlers.ofByteArray());
 *
 *         // Извлекаем тип содержимого из заголовка Content-Type
 *         String contentType = response.headers()
 *                 .firstValue("Content-Type")
 *                 .orElse("unknown");
 *
 *         // Определяем размер файла по длине массива байт ответа
 *         byte[] body = response.body();
 *         int size = body.length;
 *
 *         // Сначала выводим информацию о типе и размере
 *         System.out.println("Тип: " + contentType + ", Размер: " + size + " байт");
 *
 *         // Только после вывода сохраняем изображение на диск
 *         Files.write(Path.of("image04.png"), body);
 *     }
 * }
 */