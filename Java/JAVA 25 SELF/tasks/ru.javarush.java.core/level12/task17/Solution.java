/*
 * Authors: JavaRush's team, CodeGym's team, Altavista360
 * Version: 1.0.0
 */

/*
 * // JavaRush
 * Задача: Получение и вывод JSON-ответа о погоде
 * Ссылка: https://javarush.com/tasks/ru.javarush.java.core.level12.task17
 */

/*
 * // CodeGym
 * Task: Fetching and printing JSON weather response
 * Link: https://codegym.cc/tasks/en.codegym.java.core.level12.task17
 */

/*
 * // JavaRush
 * Условие:
 * Представьте, что вы разрабатываете приложение для прогноза погоды и вам нужно получить актуальные данные из внешнего источника. Ваша первая задача — отправить запрос к API погоды и просто вывести на экран полный JSON-ответ, чтобы понять его структуру.
 * Сформируйте GET-запрос к адресу "https://api.open-meteo.com/v1/forecast?latitude=50.45&longitude=30.52&current_weather=true".
 * Для отправки запроса и получения ответа используйте классы HttpClient и HttpRequest.
 * После успешного выполнения запроса получите тело ответа сервера в виде обычной строки и полностью выведите его содержимое на экран вашей консоли.
 */

/*
 * // JavaRush
 * Требования:
 * • В программе должен использоваться класс HttpClient для отправки HTTP-запроса.
 * • Для запроса данных должен быть сформирован GET-запрос к адресу https://api.open-meteo.com/v1/forecast?latitude=50.45&longitude=30.52&current_weather=true с помощью класса HttpRequest.
 * • Ответ сервера должен быть получен в виде строки (String), содержащей полный JSON-ответ.
 * • Полученный JSON-ответ должен быть полностью выведен на экран консоли.
 */

/*
 * // JavaRush
 * Черновик:
 * package ru.javarush.java.core.level12.task17;
 *
 * import java.net.URI;
 * import java.net.http.HttpClient;
 * import java.net.http.HttpRequest;
 * import java.net.http.HttpResponse;
 *
 * public class Solution {
 *     public static void main(String[] args) throws Exception {
 *         // Создаем HTTP-клиент (современный API из java.net.http)
 *
 *
 *         // Формируем GET-запрос к заданному адресу
 *
 *
 *         // Отправляем запрос и получаем ответ как строку (полный JSON)
 *
 *
 *         // Выводим полный JSON-ответ на экран
 *
 *     }
 * }
 */

// JavaRush
package ru.javarush.java.core.level12.task17;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Solution {
    public static void main(String[] args) throws Exception {
        // Создаем HTTP-клиент (современный API из java.net.http)
        HttpClient client = HttpClient.newHttpClient();

        // Формируем GET-запрос к заданному адресу
        URI uri = URI.create("https://api.open-meteo.com/v1/forecast?latitude=50.45&longitude=30.52&current_weather=true");
        HttpRequest request = HttpRequest.newBuilder()
                .uri(uri)
                .GET()
                .build();

        // Отправляем запрос и получаем ответ как строку (полный JSON)
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        // Выводим полный JSON-ответ на экран
        System.out.println(response.body());
    }
}

/*
 * // JavaRush
 * Правильное решение:
 * // Author: JavaRush's team
 * package ru.javarush.java.core.level12.task17;
 *
 * import java.net.URI;
 * import java.net.http.HttpClient;
 * import java.net.http.HttpRequest;
 * import java.net.http.HttpResponse;
 *
 * public class Solution {
 *     public static void main(String[] args) throws Exception {
 *         // Создаем HTTP-клиент (современный API из java.net.http)
 *         HttpClient client = HttpClient.newHttpClient();
 *
 *         // Формируем GET-запрос к заданному адресу
 *         URI uri = URI.create("https://api.open-meteo.com/v1/forecast?latitude=50.45&longitude=30.52&current_weather=true");
 *         HttpRequest request = HttpRequest.newBuilder()
 *                 .uri(uri)
 *                 .GET() // Явно указываем метод GET для наглядности
 *                 .build();
 *
 *         // Отправляем запрос и получаем ответ как строку (полный JSON)
 *         HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
 *
 *         // Выводим полный JSON-ответ на экран
 *         System.out.println(response.body());
 *     }
 * }
 */