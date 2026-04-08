/*
 * Authors: JavaRush's team, CodeGym's team, Altavista360
 * Version: 1.0.0
 */

/*
 * // JavaRush
 * Задача: Представляем членов клуба 🤝
 * Ссылка: https://javarush.com/tasks/ru.javarush.java.core.level15.task02
 */

/*
 * // CodeGym
 * Task: Introducing the Club Members 🤝
 * Link: https://codegym.cc/tasks/en.codegym.java.core.level15.task02
 */

/*
 * // JavaRush
 * Условие:
 * Теперь, когда данные членов клуба в классе Person надёжно скрыты от прямого доступа, вам понадобится способ их прочитать, чтобы, например, вывести информацию о члене на экран.
 * Ваша задача — расширить класс Person из предыдущей задачи. Добавьте в него два публичных метода: getMemberName() и getMemberAge(). Эти методы будут служить "окнами" для просмотра приватных полей memberName и memberAge соответственно, просто возвращая их значения.
 * Также создайте публичный конструктор для класса Person, который будет принимать memberName и memberAge в качестве параметров и использовать их для инициализации приватных полей при создании нового объекта.
 * Затем, в вашем классе Solution, создайте новый объект Person, передавая ему имя и возраст, например, "Анна" и 30 лет. После этого используйте только что созданные методы getMemberName() и getMemberAge(), чтобы получить имя и возраст Анны и вывести их на консоль. Таким образом, вы покажете, как контролируемо получать доступ к приватным данным.
 */

/*
 * // JavaRush
 * Требования:
 * • Класс Person должен содержать приватные поля memberName и memberAge.
 * • В классе Person должны быть реализованы публичные методы getMemberName() и getMemberAge(), которые возвращают значения соответствующих приватных полей.
 * • В классе Person должен быть публичный конструктор, принимающий параметры для инициализации полей memberName и memberAge.
 * • В классе Solution необходимо создать объект типа Person, передав в конструктор имя "Анна" и возраст 30.
 * • В классе Solution необходимо получить имя и возраст объекта Person только с помощью методов getMemberName() и getMemberAge().
 * • В классе Solution необходимо вывести на консоль имя и возраст, полученные через геттеры объекта Person.
 */

/*
 * // JavaRush
 * Черновик:
 * package ru.javarush.java.core.level15.task02;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Создаем объект Person с именем "Анна" и возрастом 30
 *         Person person = new Person("Анна", 30);
 *
 *         // Получаем имя и возраст через геттеры и выводим их на консоль
 *         System.out.println("Имя: " + person.getMemberName());
 *         System.out.println("Возраст: " + person.getMemberAge());
 *     }
 * }
 */

// JavaRush
package ru.javarush.java.core.level15.task02;

public class Solution {
    public static void main(String[] args) {
        // Создаем объект Person с именем "Анна" и возрастом 30
        Person person = new Person("Анна", 30);

        // Получаем имя и возраст через геттеры и выводим их на консоль
        System.out.println("Имя: " + person.getMemberName());
        System.out.println("Возраст: " + person.getMemberAge());
    }
}

/*
 * // JavaRush
 * Правильное решение:
 * // Author: JavaRush's team
 * package ru.javarush.java.core.level15.task02;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Создаем объект Person с именем "Анна" и возрастом 30
 *         Person person = new Person("Анна", 30);
 *
 *         // Получаем имя и возраст через геттеры и выводим их на консоль
 *         System.out.println("Имя: " + person.getMemberName());
 *         System.out.println("Возраст: " + person.getMemberAge());
 *     }
 * }
 */