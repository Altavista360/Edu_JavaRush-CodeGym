/*
 * Authors: JavaRush's team, CodeGym's team, Altavista360
 * Version: 1.0.0
 */

/*
 * // JavaRush
 * Задача: Получение и вывод координат МКС из JSON-ответа
 * Ссылка: https://javarush.com/tasks/ru.javarush.java.core.level12.task20
 */

/*
 * // CodeGym
 * Task: Retrieving and printing the ISS coordinates from a JSON response
 * Link: https://codegym.cc/tasks/en.codegym.java.core.level12.task20
 */

/*
 * // JavaRush
 * Условие:
 * Ваше приложение по отслеживанию МКС становится все более продвинутым, и теперь вам нужно не просто получить данные, а извлечь из них конкретную информацию — текущие координаты станции.
 * Ваша задача — вручную "разобрать" JSON-ответ, чтобы получить широту и долготу.
 * Сделайте GET-запрос к адресу "http://api.open-notify.org/iss-now.json" с помощью HttpClient.
 * Получите все тело ответа в виде строки. Затем, без использования сторонних библиотек для парсинга JSON, найдите в этой строке значения latitude и longitude, которые расположены внутри объекта iss_position.
 * Для этого используйте методы класса String, такие как indexOf для нахождения начала нужного фрагмента и substring для извлечения самого значения.
 * В конце выведите найденные координаты на экран в удобном формате: "Текущие координаты МКС: широта = [значение], долгота = [значение]".
 */

/*
 * // JavaRush
 * Требования:
 * • Программа должна выполнять GET-запрос по адресу http://api.open-notify.org/iss-now.json с помощью класса HttpClient.
 * • Программа должна получить полное тело ответа сервера как строку.
 * • Для извлечения значений latitude и longitude из объекта iss_position необходимо использовать только методы класса String (например, indexOf, substring), без сторонних библиотек для парсинга JSON.
 * • Программа должна корректно найти и извлечь значения широты (latitude) и долготы (longitude) из строки-ответа.
 * • Результат должен быть выведен на экран в формате: "Текущие координаты МКС: широта = [значение], долгота = [значение]".
 */

/*
 * // JavaRush
 * Черновик:
 * package ru.javarush.java.core.level12.task20;
 *
 * import java.net.URI;
 * import java.net.http.HttpClient;
 * import java.net.http.HttpRequest;
 * import java.net.http.HttpResponse;
 *
 * public class Solution {
 *     public static void main(String[] args) throws Exception {
 *         // Создаем HttpClient и формируем GET-запрос
 *         HttpClient client = HttpClient.newHttpClient();
 *         URI uri = URI.create("http://api.open-notify.org/iss-now.json");
 *
 *
 *         // Отправляем запрос и получаем тело ответа целиком как строку
 *
 *
 *         // Вручную находим в строке объект "iss_position"
 *
 *
 *         // Находим границы объекта iss_position: от '{' до соответствующей '}'
 *
 *
 *         // Внутри iss_position извлекаем значения полей "latitude" и "longitude"
 *
 *
 *         // Форматированный вывод координат
 *         System.out.println("Текущие координаты МКС: широта = " + latitude + ", долгота = " + longitude);
 *     }
 *
 *     // Вспомогательный метод: извлекает строковое значение поля по его имени внутри JSON-фрагмента.
 *     // Логика простая: находим "ключ", затем двоеточие, затем первую и вторую кавычки значения.
 *     private static String extractQuotedValue(String jsonFragment, String fieldName) {
 *         int keyPos = jsonFragment.indexOf("\"" + fieldName + "\""); // позиция ключа "fieldName"
 *         int colonPos = jsonFragment.indexOf(':', keyPos);           // двоеточие после ключа
 *         int firstQuote = jsonFragment.indexOf('"', colonPos + 1);   // открывающая кавычка значения
 *         int secondQuote = jsonFragment.indexOf('"', firstQuote + 1); // закрывающая кавычка значения
 *         return jsonFragment.substring(firstQuote + 1, secondQuote);  // само значение между кавычками
 *     }
 * }
 */

// JavaRush
package ru.javarush.java.core.level12.task20;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Solution {
    public static void main(String[] args) throws Exception {
        // Создаем HttpClient и формируем GET-запрос
        HttpClient client = HttpClient.newHttpClient();
        URI uri = URI.create("http://api.open-notify.org/iss-now.json");
        HttpRequest request = HttpRequest.newBuilder(uri).GET().build();

        // Отправляем запрос и получаем тело ответа целиком как строку
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        String body = response.body();

        // Вручную находим в строке объект "iss_position"
        int issPosIndex = body.indexOf("\"iss_position\"");
        if (issPosIndex < 0) {
            System.out.println("Не удалось найти объект iss_position в ответе.");
            return;
        }

        // Находим границы объекта iss_position: от '{' до соответствующей '}'
        int startBrace = body.indexOf('{', issPosIndex);
        int endBrace = body.indexOf('}', startBrace);
        String issObject = body.substring(startBrace, endBrace + 1);

        // Внутри iss_position извлекаем значения полей "latitude" и "longitude"
        String latitude = extractQuotedValue(issObject, "latitude");
        String longitude = extractQuotedValue(issObject, "longitude");

        // Форматированный вывод координат
        System.out.println("Текущие координаты МКС: широта = " + latitude + ", долгота = " + longitude);
    }

    // Вспомогательный метод: извлекает строковое значение поля по его имени внутри JSON-фрагмента.
    // Логика простая: находим "ключ", затем двоеточие, затем первую и вторую кавычки значения.
    private static String extractQuotedValue(String jsonFragment, String fieldName) {
        int keyPos = jsonFragment.indexOf("\"" + fieldName + "\""); // позиция ключа "fieldName"
        int colonPos = jsonFragment.indexOf(':', keyPos);           // двоеточие после ключа
        int firstQuote = jsonFragment.indexOf('"', colonPos + 1);   // открывающая кавычка значения
        int secondQuote = jsonFragment.indexOf('"', firstQuote + 1); // закрывающая кавычка значения
        return jsonFragment.substring(firstQuote + 1, secondQuote);  // само значение между кавычками
    }
}

/*
 * // JavaRush
 * Правильное решение:
 * // Author: JavaRush's team
 * package ru.javarush.java.core.level12.task20;
 *
 * import java.net.URI;
 * import java.net.http.HttpClient;
 * import java.net.http.HttpRequest;
 * import java.net.http.HttpResponse;
 *
 * public class Solution {
 *     public static void main(String[] args) throws Exception {
 *         // Создаем HttpClient и формируем GET-запрос
 *         HttpClient client = HttpClient.newHttpClient();
 *         URI uri = URI.create("http://api.open-notify.org/iss-now.json");
 *         HttpRequest request = HttpRequest.newBuilder(uri).GET().build();
 *
 *         // Отправляем запрос и получаем тело ответа целиком как строку
 *         HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
 *         String body = response.body();
 *
 *         // Вручную находим в строке объект "iss_position"
 *         int issPosIndex = body.indexOf("\"iss_position\"");
 *         if (issPosIndex < 0) {
 *             System.out.println("Не удалось найти объект iss_position в ответе.");
 *             return;
 *         }
 *
 *         // Находим границы объекта iss_position: от '{' до соответствующей '}'
 *         int startBrace = body.indexOf('{', issPosIndex); // открывающая скобка объекта
 *         int endBrace = body.indexOf('}', startBrace);    // закрывающая скобка объекта (внутри нет вложенных объектов)
 *         String issObject = body.substring(startBrace, endBrace + 1);
 *
 *         // Внутри iss_position извлекаем значения полей "latitude" и "longitude"
 *         String latitude = extractQuotedValue(issObject, "latitude");
 *         String longitude = extractQuotedValue(issObject, "longitude");
 *
 *         // Форматированный вывод координат
 *         System.out.println("Текущие координаты МКС: широта = " + latitude + ", долгота = " + longitude);
 *     }
 *
 *     // Вспомогательный метод: извлекает строковое значение поля по его имени внутри JSON-фрагмента.
 *     // Логика простая: находим "ключ", затем двоеточие, затем первую и вторую кавычки значения.
 *     private static String extractQuotedValue(String jsonFragment, String fieldName) {
 *         int keyPos = jsonFragment.indexOf("\"" + fieldName + "\""); // позиция ключа "fieldName"
 *         int colonPos = jsonFragment.indexOf(':', keyPos);           // двоеточие после ключа
 *         int firstQuote = jsonFragment.indexOf('"', colonPos + 1);   // открывающая кавычка значения
 *         int secondQuote = jsonFragment.indexOf('"', firstQuote + 1); // закрывающая кавычка значения
 *         return jsonFragment.substring(firstQuote + 1, secondQuote);  // само значение между кавычками
 *     }
 * }
 */