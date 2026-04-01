/*
 * Authors: JavaRush's team, CodeGym's team, Altavista360
 * Version: 1.0.0
 */

/*
 * // JavaRush
 * Задача: Ваш первый виртуальный питомец
 * Ссылка: https://javarush.com/tasks/ru.javarush.java.core.level14.task09
 */

/*
 * // CodeGym
 * Task: Your First Virtual Pet
 * Link: https://codegym.cc/tasks/en.codegym.java.core.level14.task09
 */

/*
 * // JavaRush
 * Условие:
 * Ваш первый виртуальный питомец
 * Вы — создатель виртуальных питомцев, и сегодня ваша миссия — дать жизнь одному конкретному коту. Вам нужно не просто представить, а буквально "родить" этого кота в вашем коде, дать ему имя и возраст, а затем убедиться, что он действительно существует и обладает всеми заданными вами характеристиками.
 * Ваша задача — создать шаблон для кота, назвав его Cat, с полями для имени (String catName) и возраста (int catAge).
 * Затем, в вашем главном сценарии (main методе), используйте магическое слово new для "сотворения" нового кота. Присвойте ему имя "Барсик" и возраст 3 года. В завершение, подтвердите его существование и правильность данных, выведя на экран имя и возраст вашего новорождённого питомца.
 */

/*
 * // JavaRush
 * Требования:
 * • В программе должен быть объявлен класс с именем Cat.
 * • Класс Cat должен содержать два поля: String catName и int catAge.
 * • В методе main должен быть создан объект класса Cat с использованием ключевого слова new.
 * • Объект Cat должен быть создан с именем "Барсик" и возрастом 3 года.
 * • В методе main программа должна вывести на экран имя и возраст созданного кота.
 */

/*
 * // JavaRush
 * Черновик:
 * package ru.javarush.java.core.level14.task09;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Создаем нового кота с именем "Барсик" и возрастом 3 года (используем "new" и конструктор)
 *
 *
 *         // Выводим имя и возраст кота, чтобы подтвердить корректность создания объекта
 *
 *     }
 * }
 *
 * // Шаблон (класс) кота с полями для имени и возраста
 */

// JavaRush
package ru.javarush.java.core.level14.task09;

public class Solution {
    public static void main(String[] args) {
        // Создаем нового кота с именем "Барсик" и возрастом 3 года (используем "new" и конструктор)
        Cat barsik = new Cat("Барсик", 3);

        // Выводим имя и возраст кота, чтобы подтвердить корректность создания объекта
        System.out.println(barsik.catName);
        System.out.println(barsik.catAge);
    }
}

// Шаблон (класс) кота с полями для имени и возраста
class Cat {
    String catName;
    int catAge;

    Cat(String catName, int catAge) {
        this.catName = catName;
        this.catAge = catAge;
    }
}

/*
 * // JavaRush
 * Правильное решение:
 * // Author: JavaRush's team
 * package ru.javarush.java.core.level14.task09;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Создаем нового кота с именем "Барсик" и возрастом 3 года (используем "new" и конструктор)
 *         Cat barsik = new Cat("Барсик", 3);
 *
 *         // Выводим имя и возраст кота, чтобы подтвердить корректность создания объекта
 *         System.out.println(barsik.catName);
 *         System.out.println(barsik.catAge);
 *     }
 * }
 *
 * // Шаблон (класс) кота с полями для имени и возраста
 * class Cat {
 *     String catName; // имя кота
 *     int catAge;     // возраст кота
 *
 *     // Конструктор инициализирует поля при создании объекта
 *     Cat(String catName, int catAge) {
 *         this.catName = catName;
 *         this.catAge = catAge;
 *     }
 * }
 */