/*
 * Authors: JavaRush's team, CodeGym's team, Altavista360
 * Version: 1.0.0
 */

/*
 * // JavaRush
 * Задача: Вдохните жизнь в мурлыкающее чудо
 * Ссылка: https://javarush.com/tasks/ru.javarush.java.core.level14.task02
 */

/*
 * // CodeGym
 * Task: Bring a Purring Wonder to Life
 * Link: https://codegym.cc/tasks/en.codegym.java.core.level14.task02
 */

/*
 * // JavaRush
 * Условие:
 * Вы уже нарисовали чертёж кошки, но пока это лишь идея, а не реальное, пусть и виртуальное, существо.
 * Ваша задача — материализовать этот чертёж, создав настоящего, хоть и цифрового, кота, которого вы сможете называть по имени.
 * Сначала создайте основной шаблон для кошки, назвав его Cat.
 * Затем, внутри вашего основного игрового сценария (метода main), "призовите" одного такого кота к существованию и дайте ему имя myCat, чтобы вы могли к нему обращаться.
 */

/*
 * // JavaRush
 * Требования:
 * • В программе должен быть объявлен новый класс с именем Cat.
 * • Класс Cat должен быть доступен из метода main, то есть иметь модификатор public (или package-private, если main находится в том же файле).
 * • В методе main должен быть создан объект класса Cat с помощью ключевого слова new.
 * • В методе main должна быть объявлена переменная с именем myCat, предназначенная для хранения ссылки на объект Cat.
 * • Переменная myCat должна быть инициализирована созданным объектом класса Cat.
 */

/*
 * // JavaRush
 * Черновик:
 * package ru.javarush.java.core.level14.task02;
 *
 * // Основной класс с точкой входа в программу
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Объявляем и инициализируем переменную myCat,
 *
 *     }
 * }
 *
 * // Шаблон (чертёж) для создания объектов-котов
 */

// JavaRush
package ru.javarush.java.core.level14.task02;

// Основной класс с точкой входа в программу
public class Solution {
    public static void main(String[] args) {
        // Объявляем и инициализируем переменную myCat,
        Cat myCat = new Cat();
    }
}

// Шаблон (чертёж) для создания объектов-котов
class Cat {

}

/*
 * // JavaRush
 * Правильное решение:
 * // Author: JavaRush's team
 * package ru.javarush.java.core.level14.task02;
 *
 * // Основной класс с точкой входа в программу
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Объявляем и инициализируем переменную myCat,
 *         Cat myCat = new Cat();
 *     }
 * }
 *
 * // Шаблон (чертёж) для создания объектов-котов
 * class Cat {
 *     // Здесь можно расширять шаблон: добавить поля, методы, конструкторы
 * }
 */