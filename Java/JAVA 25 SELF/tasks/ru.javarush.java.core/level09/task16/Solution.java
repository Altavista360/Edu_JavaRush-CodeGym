/*
 * Authors: JavaRush's team, CodeGym's team, Altavista360
 * Version: 1.0.0
 */

/*
 * // JavaRush
 * Задача: Проверка наличия подстроки и сравнение email-адресов
 * Ссылка: https://javarush.com/tasks/ru.javarush.java.core.level09.task16
 */

/*
 * // CodeGym
 * Task: Checking substring presence and comparing email addresses
 * Link: https://codegym.cc/tasks/en.codegym.java.core.level09.task16
 */

/*
 * // JavaRush
 * Условие:
 * Вы — страж ворот нового цифрового мира, создающий систему регистрации и валидации для онлайн-сервиса. Пользователи вводят свои email-адреса, и вам нужно убедиться, что они корректно зарегистрированы, независимо от регистра букв, и что адрес содержит домен вашей компании. Каждое письмо должно быть проверено, а точность и безопасность — ваши главные принципы.
 * Ваша задача — сначала объявить две переменные типа String с email-адресами: emailOne = "User@Example.com" и emailTwo = "user@example.com". Сравните их, игнорируя регистр, используя метод equalsIgnoreCase(), и выведите результат. Затем создайте новую строку, например, registrationMessage = "user@example.com is registered", и проверьте, содержит ли она подстроку "example" с помощью метода contains(). Выведите результат этой проверки.
 * Оба результата должны быть на одной строке, разделенные пробелом. Это поможет вам убедиться, что пользователи успешно зарегистрированы и используют правильный домен.
 */

/*
 * // JavaRush
 * Требования:
 * • В программе должны быть объявлены две переменные типа String: emailOne со значением "User@Example.com" и emailTwo со значением "user@example.com".
 * • Для сравнения emailOne и emailTwo должен использоваться метод equalsIgnoreCase(), чтобы игнорировать различие в регистре символов.
 * • Результат сравнения (true или false) должен быть сохранён и выведен.
 * • В программе должна быть создана строка registrationMessage со значением "user@example.com is registered", и с помощью метода contains() должно быть проверено, содержит ли эта строка подстроку "example".
 * • Результат проверки наличия подстроки (true или false) должен быть сохранён и выведен.
 * • Оба результата (сравнения email и проверки подстроки) должны быть выведены на экран в одной строке, разделённые пробелом.
 */

/*
 * // JavaRush
 * Черновик:
 * package ru.javarush.java.core.level09.task16;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Объявляем две переменные с email-адресами
 *         String emailOne = "User@Example.com";
 *         String emailTwo = "user@example.com";
 *
 *         // Сравниваем email-адреса без учёта регистра
 *
 *
 *         // Создаем сообщение о регистрации пользователя
 *
 *
 *         // Проверяем, содержит ли сообщение подстроку "example"
 *
 *
 *         // Выводим оба результата в одной строке через пробел
 *
 *     }
 * }
 */

// JavaRush
package ru.javarush.java.core.level09.task16;

public class Solution {
    public static void main(String[] args) {
        // Объявляем две переменные с email-адресами
        String emailOne = "User@Example.com";
        String emailTwo = "user@example.com";

        // Сравниваем email-адреса без учёта регистра
        boolean answerIgnoreCase = emailOne.equalsIgnoreCase(emailTwo);

        // Создаем сообщение о регистрации пользователя
        String registrationMessage = "user@example.com is registered";

        // Проверяем, содержит ли сообщение подстроку "example"
        boolean checkExample = registrationMessage.contains("example");

        // Выводим оба результата в одной строке через пробел
        System.out.println(answerIgnoreCase + " " + checkExample);
    }
}

/*
 * // JavaRush
 * Правильное решение:
 * // Author: JavaRush's team
 * package ru.javarush.java.core.level09.task16;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Объявляем две переменные с email-адресами
 *         String emailOne = "User@Example.com";
 *         String emailTwo = "user@example.com";
 *
 *         // Сравниваем email-адреса без учёта регистра
 *         boolean emailsEqual = emailOne.equalsIgnoreCase(emailTwo);
 *
 *         // Создаем сообщение о регистрации пользователя
 *         String registrationMessage = "user@example.com is registered";
 *
 *         // Проверяем, содержит ли сообщение подстроку "example"
 *         boolean containsExample = registrationMessage.contains("example");
 *
 *         // Выводим оба результата в одной строке через пробел
 *         System.out.println(emailsEqual + " " + containsExample);
 *     }
 * }
 */