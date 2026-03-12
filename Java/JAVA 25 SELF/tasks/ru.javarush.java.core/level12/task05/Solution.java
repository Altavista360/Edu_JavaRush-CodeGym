/*
 * Authors: JavaRush's team, CodeGym's team, Altavista360
 * Version: 1.0.0
 */

/*
 * // JavaRush
 * Задача: Добавление и получение значения
 * Ссылка: https://javarush.com/tasks/ru.javarush.java.core.level12.task05
 */

/*
 * // CodeGym
 * Task: Adding and retrieving a value
 * Link: https://codegym.cc/tasks/en.codegym.java.core.level12.task05
 */

/*
 * // JavaRush
 * Условие:
 * Представьте, что вы создаете маленький карманный переводчик для путешественника. Ваша первая задача — научить его переводить одно простое слово.
 * Создайте ассоциативный массив (HashMap), который будет хранить переводы слов, где ключ — это слово на одном языке (String), а значение — его перевод на другом (String), и назовите его travelPhrasebook.
 * Добавьте в ваш словарь перевод: для слова "дом" значение "house".
 * Теперь, чтобы убедиться, что перевод сохранен правильно, запросите у вашего словаря перевод слова "дом" и выведите его прямо на экран.
 */

/*
 * // JavaRush
 * Требования:
 * • В программе должен быть объявлен объект HashMap с именем travelPhrasebook, где ключи и значения имеют тип String.
 * • В HashMap travelPhrasebook необходимо добавить пару, где ключ — строка "дом", а значение — строка "house".
 * • Программа должна получить из travelPhrasebook значение по ключу "дом".
 * • Полученное значение (перевод слова "дом") должно быть выведено на экран.
 */

/*
 * // JavaRush
 * Черновик:
 * package ru.javarush.java.core.level12.task05;
 *
 * import java.util.HashMap;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Создаем ассоциативный массив (HashMap) для хранения переводов слов
 *
 *
 *         // Добавляем в словарь перевод: ключ "дом", значение "house"
 *
 *
 *         // Получаем перевод слова "дом" из словаря
 *
 *
 *         // Выводим перевод на экран
 *
 *     }
 * }
 */

// JavaRush
package ru.javarush.java.core.level12.task05;

import java.util.HashMap;

public class Solution {
    public static void main(String[] args) {
        // Создаем ассоциативный массив (HashMap) для хранения переводов слов
        HashMap<String, String> travelPhrasebook = new HashMap<String, String>();

        // Добавляем в словарь перевод: ключ "дом", значение "house"
        travelPhrasebook.put("дом", "house");

        // Получаем перевод слова "дом" из словаря
        String foo = travelPhrasebook.get("дом");

        // Выводим перевод на экран
        System.out.println(foo);
    }
}

/*
 * // JavaRush
 * Правильное решение:
 * // Author: JavaRush's team
 * package ru.javarush.java.core.level12.task05;
 *
 * import java.util.HashMap;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Создаем ассоциативный массив (HashMap) для хранения переводов слов
 *         HashMap<String, String> travelPhrasebook = new HashMap<>();
 *
 *         // Добавляем в словарь перевод: ключ "дом", значение "house"
 *         travelPhrasebook.put("дом", "house");
 *
 *         // Получаем перевод слова "дом" из словаря
 *         String translation = travelPhrasebook.get("дом");
 *
 *         // Выводим перевод на экран
 *         System.out.println(translation);
 *     }
 * }
 */