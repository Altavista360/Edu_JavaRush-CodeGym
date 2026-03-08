/*
 * Authors: JavaRush's team, CodeGym's team, Altavista360
 * Version: 1.0.0
 */

/*
 * // JavaRush
 * Задача: Валидация имени пользователя в системе регистрации 📝
 * Ссылка: https://javarush.com/tasks/ru.javarush.java.core.level11.task12
 */

/*
 * // CodeGym
 * Task: Username validation in the registration system 📝
 * Link: https://codegym.cc/tasks/en.codegym.java.core.level11.task12
 */

/*
 * // JavaRush
 * Условие:
 * Вы создаете систему регистрации новых пользователей, и одно из главных правил – имя пользователя не может быть пустым.
 * Реализуйте метод public static void validateUserName(String userName). Если переданная userName является пустой строкой, этот метод должен сгенерировать исключение IllegalArgumentException с сообщением: "Регистрация отклонена: Имя пользователя не может быть пустым."
 * Однако, независимо от того, было ли имя корректным или нет, в конце проверки (используя блок finally) метод должен всегда выводить сообщение: "Проверка имени пользователя завершена."
 * В вашем main методе вызовите validateUserName с пустой строкой (например, ""). Оберните этот вызов в блок try-catch, чтобы поймать исключение, которое вы сгенерировали, и выведите на экран его сообщение. Обратите внимание, что сообщение из finally должно появиться в консоли в любом случае.
 */

/*
 * // JavaRush
 * Требования:
 * • В классе должен быть реализован публичный статический метод с сигнатурой public static void validateUserName(String userName).
 * • Если переданный параметр userName является пустой строкой (""), метод validateUserName должен выбрасывать исключение IllegalArgumentException с сообщением: "Регистрация отклонена: Имя пользователя не может быть пустым."
 * • В методе validateUserName должен быть использован блок finally, который всегда выводит сообщение "Проверка имени пользователя завершена." вне зависимости от результата проверки.
 * • В методе main должен быть вызван метод validateUserName с аргументом пустая строка ("").
 * • Вызов метода validateUserName в main должен быть обернут в блок try-catch, при этом в блоке catch должно быть выведено на экран сообщение перехваченного исключения.
 */

/*
 * // JavaRush
 * Черновик:
 * package ru.javarush.java.core.level11.task12;
 *
 * public class Solution {
 *
 *     // Метод для проверки имени пользователя
 *     public static void validateUserName(String userName) {
 *         // Проверяем, является ли имя пользователя пустым
 *
 *         // Генерируем исключение IllegalArgumentException с заданным сообщением
 *
 *
 *         // Сообщение, которое выводится всегда, независимо от результата проверки
 *
 *     }
 *
 *     public static void main(String[] args) {
 *         // Вызываем метод validateUserName с пустой строкой
 *
 *         // Перехватываем исключение и выводим его сообщение
 *
 *     }
 * }
 */

// JavaRush
package ru.javarush.java.core.level11.task12;

public class Solution {

    // Метод для проверки имени пользователя
    public static void validateUserName(String userName) {
    try {
        // Проверяем, является ли имя пользователя пустым
        if (userName.isEmpty()) {
            // Генерируем исключение IllegalArgumentException с заданным сообщением
            throw new IllegalArgumentException("Регистрация отклонена: Имя пользователя не может быть пустым.");
            }
        } finally {
            // Сообщение, которое выводится всегда, независимо от результата проверки
            System.out.println("Проверка имени пользователя завершена.");
        }
    }

    public static void main(String[] args) {
        try {
            // Вызываем метод validateUserName с пустой строкой
            validateUserName("");
        } catch (IllegalArgumentException e) {
            // Перехватываем исключение и выводим его сообщение
            System.out.println(e.getMessage());
        }
    }
}

/*
 * // JavaRush
 * Правильное решение:
 * // Author: JavaRush's team
 * package ru.javarush.java.core.level11.task12;
 *
 * public class Solution {
 *
 *     // Метод для проверки имени пользователя
 *     public static void validateUserName(String userName) {
 *         try {
 *             // Проверяем, является ли имя пользователя пустым
 *             if (userName.isEmpty()) {
 *                 // Генерируем исключение IllegalArgumentException с заданным сообщением
 *                 throw new IllegalArgumentException("Регистрация отклонена: Имя пользователя не может быть пустым.");
 *             }
 *         } finally {
 *             // Сообщение, которое выводится всегда, независимо от результата проверки
 *             System.out.println("Проверка имени пользователя завершена.");
 *         }
 *     }
 *
 *     public static void main(String[] args) {
 *         try {
 *             // Вызываем метод validateUserName с пустой строкой
 *             validateUserName("");
 *         } catch (IllegalArgumentException e) {
 *             // Перехватываем исключение и выводим его сообщение
 *             System.out.println(e.getMessage());
 *         }
 *     }
 * }
 */