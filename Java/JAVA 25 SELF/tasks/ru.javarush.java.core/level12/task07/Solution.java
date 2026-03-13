/*
 * Authors: JavaRush's team, CodeGym's team, Altavista360
 * Version: 1.0.0
 */

/*
 * // JavaRush
 * Задача: Удаление элемента из словаря
 * Ссылка: https://javarush.com/tasks/ru.javarush.java.core.level12.task07
 */

/*
 * // CodeGym
 * Task: Removing an element from the map
 * Link: https://codegym.cc/tasks/en.codegym.java.core.level12.task07
 */

/*
 * // JavaRush
 * Условие:
 * Вы управляете небольшой базой данных пользователей, и иногда возникает необходимость удалить старые или неактивные учетные записи. Ваша задача — удалить пользователя и затем убедиться, что его данные больше недоступны.
 * Создайте ассоциативный массив (HashMap) под названием userRegistry, где ключом будет уникальный идентификатор пользователя (Integer), а значением — его имя (String).
 * Добавьте в словарь двух пользователей: с ID 1 по имени "Иван" и с ID 2 по имени "Мария".
 * Теперь настало время удалить пользователя с ключом 1. После удаления попытайтесь снова получить значение по ключу 1 и выведите результат на экран, чтобы удостовериться, что пользователь "Иван" был успешно удален (вы должны увидеть null).
 */

/*
 * // JavaRush
 * Требования:
 * • Необходимо создать объект HashMap с именем userRegistry, где ключ типа Integer, а значение типа String.
 * • В userRegistry нужно добавить двух пользователей: с ключом 1 и значением "Иван", а также с ключом 2 и значением "Мария".
 * • Из userRegistry требуется удалить элемент с ключом 1.
 * • После удаления необходимо получить значение по ключу 1 и вывести результат на экран.
 * • Результат вывода значения по ключу 1 должен быть null, что подтверждает успешное удаление пользователя "Иван".
 */

/*
 * // JavaRush
 * Черновик:
 * package ru.javarush.java.core.level12.task07;
 *
 * import java.util.HashMap;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Создаем словарь: ключ — Integer (ID пользователя), значение — String (имя)
 *
 *
 *         // Добавляем двух пользователей
 *
 *
 *         // Удаляем пользователя с ключом 1
 *
 *
 *         // Пытаемся получить значение по ключу 1 после удаления
 *
 *
 *         // Ожидается вывод null (пользователь "Иван" удален)
 *
 *     }
 * }
 */

// JavaRush
package ru.javarush.java.core.level12.task07;

import java.util.HashMap;

public class Solution {
    public static void main(String[] args) {
        // Создаем словарь: ключ — Integer (ID пользователя), значение — String (имя)
        HashMap<Integer, String> userRegistry = new HashMap<>();

        // Добавляем двух пользователей
        userRegistry.put(1, "Иван");
        userRegistry.put(2, "Мария");

        // Удаляем пользователя с ключом 1
        userRegistry.remove(1);

        // Пытаемся получить значение по ключу 1 после удаления
        String foo = userRegistry.get(1);

        // Ожидается вывод null (пользователь "Иван" удален)
        System.out.println(foo);
    }
}

/*
 * // JavaRush
 * Правильное решение:
 * // Author: JavaRush's team
 * package ru.javarush.java.core.level12.task07;
 *
 * import java.util.HashMap;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Создаем словарь: ключ — Integer (ID пользователя), значение — String (имя)
 *         HashMap<Integer, String> userRegistry = new HashMap<>();
 *
 *         // Добавляем двух пользователей
 *         userRegistry.put(1, "Иван");
 *         userRegistry.put(2, "Мария");
 *
 *         // Удаляем пользователя с ключом 1
 *         userRegistry.remove(1);
 *
 *         // Пытаемся получить значение по ключу 1 после удаления
 *         String removedUser = userRegistry.get(1);
 *
 *         // Ожидается вывод null (пользователь "Иван" удален)
 *         System.out.println(removedUser);
 *     }
 * }
 */