/*
 * Authors: JavaRush's team, CodeGym's team, Altavista360
 * Version: 1.0.0
 */

/*
 * // JavaRush
 * Задача: Вставка подстроки
 * Ссылка: https://javarush.com/tasks/ru.javarush.java.core.level09.task18
 */

/*
 * // CodeGym
 * Task: Substring insertion
 * Link: https://codegym.cc/tasks/en.codegym.java.core.level09.task18
 */

/*
 * // JavaRush
 * Условие:
 * Вы — дирижёр слов, работающий над автоматическим приветствием в чат-боте. Иногда нужно элегантно "вплести" дополнительное слово или фразу в уже готовое сообщение, чтобы сделать его более персонализированным или информативным, не переписывая всё сообщение заново.
 * Ваша задача — начать с объекта StringBuilder, содержащего фразу "Привет, мир!". Ваша миссия — найти место после запятой и с помощью метода insert() добавить туда слово "Java " (обратите внимание на пробел!), чтобы в итоге получилось "Привет, Java мир!".
 * Выведите изменённое приветствие на экран, демонстрируя свою способность точно управлять текстом.
 */

/*
 * // JavaRush
 * Требования:
 * • В программе должен быть создан объект StringBuilder, инициализированный строкой "Привет, мир!".
 * • Необходимо определить индекс позиции сразу после запятой в исходной строке.
 * • Для вставки слова "Java " должен быть использован метод insert() класса StringBuilder.
 * • Вставляемая подстрока должна быть именно "Java " (с пробелом после слова).
 * • После вставки итоговая строка должна быть "Привет, Java мир!".
 * • Изменённая строка должна быть выведена на экран.
 */

/*
 * // JavaRush
 * Черновик:
 * package ru.javarush.java.core.level09.task18;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Создаем StringBuilder с исходной фразой
 *
 *
 *         // Находим позицию запятой
 *
 *
 *         // В исходной строке после запятой стоит пробел,
 *         // поэтому вставляем после запятой и пробела (+2)
 *
 *
 *         // Вставляем подстроку "Java " (с пробелом в конце)
 *
 *
 *         // Выводим результат
 *
 *     }
 * }
 */

// JavaRush
package ru.javarush.java.core.level09.task18;

public class Solution {
    public static void main(String[] args) {
        // Создаем StringBuilder с исходной фразой
        StringBuilder greeting = new StringBuilder("Привет, мир!");

        // Находим позицию запятой
        int indexTab = greeting.indexOf(",");

        // В исходной строке после запятой стоит пробел,
        // поэтому вставляем после запятой и пробела (+2)
        int inputPosition = indexTab + 2;

        // Вставляем подстроку "Java " (с пробелом в конце)
        greeting.insert(inputPosition, "Java ");

        // Выводим результат
        System.out.println(greeting);
    }
}

/*
 * // JavaRush
 * Правильное решение:
 * // Author: JavaRush's team
 * package ru.javarush.java.core.level09.task18;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Создаем StringBuilder с исходной фразой
 *         StringBuilder greeting = new StringBuilder("Привет, мир!");
 *
 *         // Находим позицию запятой
 *         int commaIndex = greeting.indexOf(",");
 *
 *         // В исходной строке после запятой стоит пробел,
 *         // поэтому вставляем после запятой и пробела (+2)
 *         int insertPos = commaIndex + 2;
 *
 *         // Вставляем подстроку "Java " (с пробелом в конце)
 *         greeting.insert(insertPos, "Java ");
 *
 *         // Выводим результат
 *         System.out.println(greeting);
 *     }
 * }
 */