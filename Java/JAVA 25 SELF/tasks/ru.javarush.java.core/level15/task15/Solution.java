/*
 * Authors: JavaRush's team, CodeGym's team, Altavista360
 * Version: 1.0.0
 */

/*
 * // JavaRush
 * Задача: Определение стартового языка приложения ⚙️
 * Ссылка: https://javarush.com/tasks/ru.javarush.java.core.level15.task15
 */

/*
 * // CodeGym
 * Task: Defining the application's default language ⚙️
 * Link: https://codegym.cc/tasks/en.codegym.java.core.level15.task15
 */

/*
 * // JavaRush
 * Условие:
 * Вы настраиваете глобальные параметры для своего нового приложения. Одной из ключевых настроек является язык по умолчанию. Этот параметр должен быть определён один раз при запуске приложения и оставаться неизменным. Более того, он должен учитывать возможные системные предпочтения.
 * Создайте класс ApplicationConfiguration. В нём объявите публичное статическое final поле APPLICATION_DEFAULT_LANGUAGE типа String. Это поле будет хранить выбранный язык по умолчанию.
 * Ваша задача — инициализировать это поле не прямо при объявлении, а внутри статического блока инициализации. Внутри этого блока реализуйте логику:
 * • Попытайтесь получить значение системной переменной окружения с именем "APP_LANG" (используя System.getenv("APP_LANG")).
 * • Если такая переменная существует (то есть System.getenv() вернул не null), то присвойте её значение полю APPLICATION_DEFAULT_LANGUAGE.
 * • В противном случае, если переменная окружения не найдена, установите значение "en" (английский) как язык по умолчанию.
 * В классе Solution просто выведите на экран значение APPLICATION_DEFAULT_LANGUAGE, обратившись к нему через имя класса ApplicationConfiguration. Запустите программу, чтобы увидеть, какой язык будет установлен, и при желании, попробуйте задать переменную окружения "APP_LANG" перед запуском, чтобы увидеть, как это повлияет на результат.
 */

/*
 * // JavaRush
 * Требования:
 * • В классе ApplicationConfiguration должно быть объявлено публичное статическое final поле APPLICATION_DEFAULT_LANGUAGE типа String.
 * • Поле APPLICATION_DEFAULT_LANGUAGE должно быть инициализировано не при объявлении, а внутри статического блока инициализации.
 * • В статическом блоке необходимо попытаться получить значение переменной окружения "APP_LANG" с помощью System.getenv("APP_LANG").
 * • Если переменная окружения "APP_LANG" существует (не равна null), её значение должно быть присвоено полю APPLICATION_DEFAULT_LANGUAGE.
 * • Если переменная окружения "APP_LANG" отсутствует (равна null), полю APPLICATION_DEFAULT_LANGUAGE должно быть присвоено значение "en".
 * • В классе Solution должно быть выведено на экран значение поля ApplicationConfiguration.APPLICATION_DEFAULT_LANGUAGE.
 */

/*
 * // JavaRush
 * Черновик:
 * package ru.javarush.java.core.level15.task15;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Выводим значение языка по умолчанию, обращаясь к полю через имя класса
 *         System.out.println(ApplicationConfiguration.APPLICATION_DEFAULT_LANGUAGE);
 *     }
 * }
 */

// JavaRush
package ru.javarush.java.core.level15.task15;

public class Solution {
    public static void main(String[] args) {
        // Выводим значение языка по умолчанию, обращаясь к полю через имя класса
        System.out.println(ApplicationConfiguration.APPLICATION_DEFAULT_LANGUAGE);
    }
}

/*
 * // JavaRush
 * Правильное решение:
 * // Author: JavaRush's team
 * package ru.javarush.java.core.level15.task15;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Выводим значение языка по умолчанию, обращаясь к полю через имя класса
 *         System.out.println(ApplicationConfiguration.APPLICATION_DEFAULT_LANGUAGE);
 *     }
 * }
 */