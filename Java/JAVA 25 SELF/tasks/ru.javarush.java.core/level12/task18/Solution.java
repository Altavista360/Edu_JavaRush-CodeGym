/*
 * Authors: JavaRush's team, CodeGym's team, Altavista360
 * Version: 1.0.0
 */

/*
 * // JavaRush
 * Задача: Получение и вывод статуса ответа от API
 * Ссылка: https://javarush.com/tasks/ru.javarush.java.core.level12.task18
 */

/*
 * // CodeGym
 * Task: Retrieving and printing API response status
 * Link: https://codegym.cc/tasks/en.codegym.java.core.level12.task18
 */

/*
 * // JavaRush
 * Условие:
 * Вы создаете систему мониторинга космических объектов и хотите убедиться, что API, предоставляющий данные о Международной космической станции (МКС), всегда доступен и отвечает корректно.
 * Ваша задача — отправить запрос и проверить только HTTP-статус ответа. Сделайте GET-запрос к адресу "http://api.open-notify.org/iss-now.json" с помощью HttpClient. После того как вы получите ответ от сервера, извлеките из него числовой HTTP-статус и выведите его на экран. Это позволит вам быстро определить, успешно ли соединение с API.
 */

/*
 * // JavaRush
 * Требования:
 * • В программе должны быть импортированы классы из пакета java.net.http, необходимые для выполнения HTTP-запроса.
 * • В программе должен быть создан экземпляр HttpClient для отправки HTTP-запроса.
 * • Программа должна отправлять GET-запрос по адресу http://api.open-notify.org/iss-now.json.
 * • Программа должна получить ответ от сервера в виде объекта HttpResponse.
 * • Программа должна извлечь числовой HTTP-статус из объекта ответа (например, 200, 404 и т.д.).
 * • Программа должна вывести полученный числовой HTTP-статус на экран.
 */

/*
 * // JavaRush
 * Черновик:
 * package ru.javarush.java.core.level12.task18;
 *
 * import java.net.URI;
 * import java.net.http.HttpClient;
 * import java.net.http.HttpRequest;
 * import java.net.http.HttpResponse;
 *
 * public class Solution {
 *     public static void main(String[] args) throws Exception {
 *         // Создаем HTTP-клиент (основной объект для отправки запросов)
 *
 *
 *         // Готовим GET-запрос к API МКС
 *
 *
 *         // Отправляем запрос и получаем ответ.
 *         // Используем BodyHandlers.discarding(), так как нам нужен только статус, а тело можно не загружать.
 *
 *
 *         // Извлекаем и выводим числовой HTTP-статус (например, 200)
 *
 *     }
 * }
 */

// JavaRush
package ru.javarush.java.core.level12.task18;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Solution {
    public static void main(String[] args) throws Exception {
        // Создаем HTTP-клиент (основной объект для отправки запросов)
        HttpClient client = HttpClient.newHttpClient();

        // Готовим GET-запрос к API МКС
        URI uri = URI.create("http://api.open-notify.org/iss-now.json");
        HttpRequest request = HttpRequest.newBuilder()
                .uri(uri)
                .GET()
                .build();

        // Отправляем запрос и получаем ответ.
        // Используем BodyHandlers.discarding(), так как нам нужен только статус, а тело можно не загружать.
        HttpResponse<Void> response = client.send(request, HttpResponse.BodyHandlers.discarding());

        // Извлекаем и выводим числовой HTTP-статус (например, 200)
        System.out.println(response.statusCode());
    }
}

/*
 * // JavaRush
 * Правильное решение:
 * // Author: JavaRush's team
 * package ru.javarush.java.core.level12.task18;
 *
 * import java.net.URI;
 * import java.net.http.HttpClient;
 * import java.net.http.HttpRequest;
 * import java.net.http.HttpResponse;
 *
 * public class Solution {
 *     public static void main(String[] args) throws Exception {
 *         // Создаем HTTP-клиент (основной объект для отправки запросов)
 *         HttpClient client = HttpClient.newHttpClient();
 *
 *         // Готовим GET-запрос к API МКС
 *         URI uri = URI.create("http://api.open-notify.org/iss-now.json");
 *         HttpRequest request = HttpRequest.newBuilder()
 *                 .uri(uri)
 *                 .GET()
 *                 .build();
 *
 *         // Отправляем запрос и получаем ответ.
 *         // Используем BodyHandlers.discarding(), так как нам нужен только статус, а тело можно не загружать.
 *         HttpResponse<Void> response = client.send(request, HttpResponse.BodyHandlers.discarding());
 *
 *         // Извлекаем и выводим числовой HTTP-статус (например, 200)
 *         System.out.println(response.statusCode());
 *     }
 * }
 */