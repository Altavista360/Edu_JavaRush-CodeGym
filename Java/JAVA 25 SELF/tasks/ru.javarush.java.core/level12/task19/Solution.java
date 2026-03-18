/*
 * Authors: JavaRush's team, CodeGym's team, Altavista360
 * Version: 1.0.0
 */

/*
 * // JavaRush
 * Задача: Получение случайного факта о кошках
 * Ссылка: https://javarush.com/tasks/ru.javarush.java.core.level12.task19
 */

/*
 * // CodeGym
 * Task: Getting a random cat fact
 * Link: https://codegym.cc/tasks/en.codegym.java.core.level12.task19
 */

/*
 * // JavaRush
 * Условие:
 * Вам пришла идея создать приложение, которое будет развлекать пользователей случайными фактами. Начните с самых популярных — фактов о кошках!
 * Ваша задача — обратиться к API, который предоставляет такие факты, и просто показать пользователю полученный текст.
 * Сделайте GET-запрос к адресу "https://catfact.ninja/fact" с помощью HttpClient. Получите тело ответа от сервера в виде обычной строки и выведите его на экран.
 * Например, результатом может быть что-то вроде:
 * 1) {"fact":"Cats have five toes on their front paws, but only four on the back.","length":71}
 */

/*
 * // JavaRush
 * Требования:
 * • В программе должны быть использованы классы из пакета java.net.http для выполнения HTTP-запроса.
 * • Для отправки GET-запроса по адресу https://catfact.ninja/fact необходимо использовать HttpClient.
 * • Программа должна выполнить HTTP-запрос методом GET по указанному адресу.
 * • Тело ответа от сервера должно быть получено в виде строки.
 * • Полученная строка с фактом о кошках должна быть выведена на экран.
 */

/*
 * // JavaRush
 * Черновик:
 * package ru.javarush.java.core.level12.task19;
 *
 * import java.net.URI;
 * import java.net.http.HttpClient;
 * import java.net.http.HttpRequest;
 * import java.net.http.HttpResponse;
 *
 * public class Solution {
 *     public static void main(String[] args) throws Exception {
 *         // Создаем HTTP‑клиент по умолчанию
 *
 *
 *         // Готовим GET‑запрос к API фактов о кошках
 *
 *
 *         // Отправляем запрос и получаем ответ в виде строки
 *
 *
 *         // Выводим тело ответа на экран (JSON-строка с фактом о кошках)
 *
 *     }
 * }
 */

// JavaRush
package ru.javarush.java.core.level12.task19;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Solution {
    public static void main(String[] args) throws Exception {
        // Создаем HTTP‑клиент по умолчанию
        HttpClient client = HttpClient.newHttpClient();

        // Готовим GET‑запрос к API фактов о кошках
                HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://catfact.ninja/fact"))
                .GET()
                .build();

        // Отправляем запрос и получаем ответ в виде строки
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        // Выводим тело ответа на экран (JSON-строка с фактом о кошках)
        System.out.println(response.body());
    }
}

/*
 * // JavaRush
 * Правильное решение:
 * // Author: JavaRush's team
 * package ru.javarush.java.core.level12.task19;
 *
 * import java.net.URI;
 * import java.net.http.HttpClient;
 * import java.net.http.HttpRequest;
 * import java.net.http.HttpResponse;
 *
 * public class Solution {
 *     public static void main(String[] args) throws Exception {
 *         // Создаем HTTP‑клиент по умолчанию
 *         HttpClient client = HttpClient.newHttpClient();
 *
 *         // Готовим GET‑запрос к API фактов о кошках
 *         HttpRequest request = HttpRequest.newBuilder()
 *                 .uri(URI.create("https://catfact.ninja/fact"))
 *                 .GET() // Явно указываем метод GET
 *                 .build();
 *
 *         // Отправляем запрос и получаем ответ в виде строки
 *         HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
 *
 *         // Выводим тело ответа на экран (JSON-строка с фактом о кошках)
 *         System.out.println(response.body());
 *     }
 * }
 */