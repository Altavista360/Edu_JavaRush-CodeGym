/*
 * Authors: JavaRush's team, CodeGym's team, Altavista360
 * Version: 1.0.0
 */

/*
 * // JavaRush
 * Задача: Первый привет от загруженного модуля 🚀
 * Ссылка: https://javarush.com/tasks/ru.javarush.java.core.level15.task17
 */

/*
 * // CodeGym
 * Task: First greeting from the loaded module 🚀
 * Link: https://codegym.cc/tasks/en.codegym.java.core.level15.task17
 */

/*
 * // JavaRush
 * Условие:
 * Представьте, что вы разрабатываете главный модуль для большого программного комплекса. Перед тем как вы начнёте создавать какие-либо объекты или компоненты этого модуля, должна быть выполнена некая одноразовая, общая инициализация, которая происходит автоматически при загрузке модуля в память.
 * Создайте класс ApplicationModule. Внутри него объявите одно статическое поле moduleStatusMessage типа String. Теперь, добавьте в этот класс статический блок инициализации. Внутри этого блока присвойте полю moduleStatusMessage значение "Приложение: Главный модуль готов к работе!" и сразу же выведите это сообщение на экран.
 * В вашем классе Solution просто создайте объект класса ApplicationModule. Важно: не добавляйте никакого вывода в конструктор ApplicationModule или в нестатические блоки, если таковые имеются. Вы должны убедиться, что ваша программа при запуске выводит только ту строку, которая была определена в статическом блоке, подтверждая, что статический блок выполнился при первой загрузке класса, ещё до создания экземпляра.
 */

/*
 * // JavaRush
 * Требования:
 * • В программе должен быть создан публичный класс с именем ApplicationModule.
 * • В классе ApplicationModule должно быть объявлено одно статическое поле moduleStatusMessage типа String.
 * • В классе ApplicationModule должен быть реализован статический блок инициализации.
 * • В статическом блоке поле moduleStatusMessage должно быть проинициализировано значением "Приложение: Главный модуль готов к работе!".
 * • Внутри статического блока должно быть выполнено отображение значения moduleStatusMessage на экран.
 * • В конструкторе и нестатических блоках класса ApplicationModule не должно быть кода, выводящего информацию на экран.
 * • В классе Solution должен быть создан хотя бы один объект класса ApplicationModule.
 * • При запуске программы на экран должно быть выведено только сообщение из статического блока.
 */

// JavaRush
package ru.javarush.java.core.level15.task17;

public class ApplicationModule {
    public static String moduleStatusMessage;

    static {
        moduleStatusMessage = "Приложение: Главный модуль готов к работе!";
        System.out.println(moduleStatusMessage); // Выводим сообщение сразу после инициализации
    }

    public ApplicationModule() {

    }
}

/*
 * // JavaRush
 * Правильное решение:
 * // Author: JavaRush's team
 * package ru.javarush.java.core.level15.task17;
 *
 * // Публичный класс главного модуля приложения
 * public class ApplicationModule {
 *     // Статическое поле со статусом модуля
 *     public static String moduleStatusMessage;
 *
 *     // Статический блок выполняется один раз при первой загрузке класса в память
 *     static {
 *         moduleStatusMessage = "Приложение: Главный модуль готов к работе!";
 *         System.out.println(moduleStatusMessage); // Выводим сообщение сразу после инициализации
 *     }
 *
 *     // Конструктор не содержит вывода — это важно по условию
 *     public ApplicationModule() {
 *         // пусто
 *     }
 * }
 */