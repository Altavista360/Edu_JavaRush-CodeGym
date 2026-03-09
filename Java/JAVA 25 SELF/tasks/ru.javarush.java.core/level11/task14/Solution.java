/*
 * Authors: JavaRush's team, CodeGym's team, Altavista360
 * Version: 1.0.0
 */

/*
 * // JavaRush
 * Задача: Инструмент анализа логов: обработка сбоев чтения 📊
 * Ссылка: https://javarush.com/tasks/ru.javarush.java.core.level11.task14
 */

/*
 * // CodeGym
 * Task: Log Analysis Tool: Handling Read Failures 📊
 * Link: https://codegym.cc/tasks/en.codegym.java.core.level11.task14
 */

/*
 * // JavaRush
 * Условие:
 * Вы пишете утилиту для анализа системных лог-файлов. Для этого вам нужен метод, который попытается прочитать содержимое файла. Создайте метод public static void analyzeSystemLog(String logFileName). Этот метод должен заявить, что он может выбросить IOException (например, при попытке создать BufferedReader из FileReader или при чтении). Внутри метода пока не делайте сложную логику, достаточно просто объявить throws IOException.
 * В вашем main методе попытайтесь вызвать analyzeSystemLog("non_existent_log.txt"), имитируя ситуацию, когда файл не найден или недоступен. Оберните этот вызов в блок try-catch. Если возникнет IOException, выведите на экран дружелюбное сообщение: "Произошла ошибка при попытке прочитать файл системных логов. Ошибка чтения файла." Это показывает, как main должен реагировать на проблемы, о которых заявляет analyzeSystemLog.
 */

/*
 * // JavaRush
 * Требования:
 * • Метод analyzeSystemLog должен быть объявлен с модификатором throws IOException.
 * • Метод analyzeSystemLog должен быть публичным, статическим и принимать один параметр типа String с именем logFileName.
 * • Внутри метода analyzeSystemLog должна быть попытка создать BufferedReader на основе FileReader, используя переданный logFileName.
 * • В методе analyzeSystemLog не должно быть блока try-catch для IOException — исключение должно пробрасываться вызывающему коду.
 * • В методе main необходимо вызвать analyzeSystemLog с аргументом "non_existent_log.txt".
 * • Вызов analyzeSystemLog в main должен быть помещён в блок try-catch, который ловит IOException.
 * • В случае возникновения IOException в блоке catch должно выводиться сообщение: "Произошла ошибка при попытке прочитать файл системных логов. Ошибка чтения файла."
 */

/*
 * // JavaRush
 * Черновик:
 * package ru.javarush.java.core.level11.task14;
 *
 * import java.io.BufferedReader;
 * import java.io.FileReader;
 * import java.io.IOException;
 *
 * public class Solution {
 *
 *     // Метод для анализа системного лог-файла
 *     public static void analyzeSystemLog(String logFileName) {
 *         // Попытка создать BufferedReader для чтения файла
 *         BufferedReader reader = new BufferedReader(new FileReader(logFileName));
 *         // Закрытие ресурса (try-with-resources не используется, так как метод только пробрасывает исключение)
 *         reader.close();
 *     }
 *
 *     public static void main(String[] args) {
 *
 *             // Вызов метода analyzeSystemLog с несуществующим файлом
 *
 *
 *             // Обработка исключения и вывод дружелюбного сообщения
 *
 *
 *     }
 * }
 */

// JavaRush
package ru.javarush.java.core.level11.task14;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Solution {

    // Метод для анализа системного лог-файла
    public static void analyzeSystemLog(String logFileName) throws IOException {
        // Попытка создать BufferedReader для чтения файла
        BufferedReader reader = new BufferedReader(new FileReader(logFileName));
        // Закрытие ресурса (try-with-resources не используется, так как метод только пробрасывает исключение)
        reader.close();
    }

    public static void main(String[] args) {
        try {
            // Вызов метода analyzeSystemLog с несуществующим файлом
            analyzeSystemLog("non_existent_log.txt");
        } catch (IOException e) {
            // Обработка исключения и вывод дружелюбного сообщения
            System.out.println("Произошла ошибка при попытке прочитать файл системных логов. Ошибка чтения файла.");
        }
    }
}

/*
 * // JavaRush
 * Правильное решение:
 * // Author: JavaRush's team
 * package ru.javarush.java.core.level11.task14;
 *
 * import java.io.BufferedReader;
 * import java.io.FileReader;
 * import java.io.IOException;
 *
 * public class Solution {
 *
 *     // Метод для анализа системного лог-файла
 *     public static void analyzeSystemLog(String logFileName) throws IOException {
 *         // Попытка создать BufferedReader для чтения файла
 *         BufferedReader reader = new BufferedReader(new FileReader(logFileName));
 *         // Закрытие ресурса (try-with-resources не используется, так как метод только пробрасывает исключение)
 *         reader.close();
 *     }
 *
 *     public static void main(String[] args) {
 *         try {
 *             // Вызов метода analyzeSystemLog с несуществующим файлом
 *             analyzeSystemLog("non_existent_log.txt");
 *         } catch (IOException e) {
 *             // Обработка исключения и вывод дружелюбного сообщения
 *             System.out.println("Произошла ошибка при попытке прочитать файл системных логов. Ошибка чтения файла.");
 *         }
 *     }
 * }
 */