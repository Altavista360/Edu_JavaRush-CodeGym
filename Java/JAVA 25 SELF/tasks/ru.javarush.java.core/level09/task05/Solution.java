/*
 * Authors: JavaRush's team, CodeGym's team, Altavista360
 * Version: 1.0.0
 */

/*
 * // JavaRush
 * Задача: Форматированный вывод имени и возраста
 * Ссылка: https://javarush.com/tasks/ru.javarush.java.core.level09.task05
 */

/*
 * // CodeGym
 * Task: Unicode characters and emojis in a string
 * Link: https://codegym.cc/tasks/en.codegym.java.core.level09.task05
 */

/*
 * // JavaRush
 * Условие:
 * Представьте, что вы — разработчик новой социальной сети. Когда пользователь регистрируется, вам нужно быстро сгенерировать краткое досье с его именем и возрастом для административной панели. Важно, чтобы информация всегда выглядела аккуратно и единообразно.
 * Ваша задача — объявить две переменные, например, String userName и int userAge, присвоить им любые данные, а затем, используя мощь String.format, создать и вывести на экран строку, которая чётко укажет имя и возраст пользователя, например: "Имя: Анна, возраст: 25 лет."
 */

/*
 * // JavaRush
 * Требования:
 * • В программе должны быть объявлены две переменные: одна строковая (например, userName) и одна целочисленная (например, userAge).
 * • Строковой переменной userName и целочисленной переменной userAge должны быть присвоены любые значения.
 * • Для создания итоговой строки с информацией о пользователе должен быть использован метод String.format.
 * • Строка, формируемая с помощью String.format, должна содержать имя и возраст пользователя в формате: "Имя: <имя>, возраст: <возраст> лет."
 * • Сформированная строка должна быть выведена на экран с помощью System.out.println или аналогичного метода.
 */

/*
 * // JavaRush
 * Черновик:
 * package ru.javarush.java.core.level09.task05;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Объявляем две переменные и присваиваем им любые значения
 *         String userName = "Анна";
 *         int userAge = 25;
 *
 *         // Формируем итоговую строку через String.format
 *         // %s — подстановка строки, %d — подстановка целого числа
 *
 *
 *         // Выводим результат на экран
 *
 *     }
 * }
 */

// JavaRush
package ru.javarush.java.core.level09.task05;

public class Solution {
    public static void main(String[] args) {
        // Объявляем две переменные и присваиваем им любые значения
        String userName = "Анна";
        int userAge = 25;

        // Формируем итоговую строку через String.format
        // %s — подстановка строки, %d — подстановка целого числа
        String foo = String.format("Имя: %s, возраст: %d лет.", userName, userAge);

        // Выводим результат на экран
        System.out.println(foo);
    }
}

/*
 * // JavaRush
 * Правильное решение:
 * // Author: JavaRush's team
 * package ru.javarush.java.core.level09.task05;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Объявляем две переменные и присваиваем им любые значения
 *         String userName = "Анна";
 *         int userAge = 25;
 *
 *         // Формируем итоговую строку через String.format
 *         // %s — подстановка строки, %d — подстановка целого числа
 *         String info = String.format("Имя: %s, возраст: %d лет.", userName, userAge);
 *
 *         // Выводим результат на экран
 *         System.out.println(info);
 *     }
 * }
 */