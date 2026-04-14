/*
 * Authors: JavaRush's team, CodeGym's team, Altavista360
 * Version: 1.0.0
 */

/*
 * // JavaRush
 * Задача: Неизменяемое имя на удостоверении студента 📝
 * Ссылка: https://javarush.com/tasks/ru.javarush.java.core.level15.task14
 */

/*
 * // CodeGym
 * Task: Immutable student name on identity card 📝
 * Link: https://codegym.cc/tasks/en.codegym.java.core.level15.task14
 */

/*
 * // JavaRush
 * Условие:
 * Вы создаёте систему для генерации цифровых студенческих удостоверений. Имя студента, один раз напечатанное на удостоверении, не должно меняться.
 * Создайте класс StudentIdentityCard. Внутри него объявите приватное final поле studentName типа String. Модификатор final гарантирует, что это поле может быть инициализировано только один раз.
 * Ваша задача — инициализировать это поле в публичном конструкторе класса StudentIdentityCard. Конструктор должен принимать параметр String initialName, который будет использоваться для установки значения studentName. Добавьте публичный геттер getStudentName() для доступа к этому полю.
 * В классе Solution создайте новый объект StudentIdentityCard, передав в конструктор имя "Алиса". Затем выведите имя студента на экран, используя метод getStudentName(). Попытка изменить studentName после создания объекта должна быть невозможна из-за использования final.
 */

/*
 * // JavaRush
 * Требования:
 * • В классе StudentIdentityCard должно быть объявлено приватное поле studentName с модификатором final и типом String.
 * • Поле studentName должно быть инициализировано только в публичном конструкторе класса StudentIdentityCard, принимающем параметр String initialName.
 * • В классе StudentIdentityCard должен быть реализован публичный метод getStudentName(), возвращающий значение поля studentName.
 * • После создания объекта StudentIdentityCard изменение значения поля studentName должно быть невозможно из-за использования модификатора final и отсутствия сеттера.
 * • В классе Solution необходимо создать объект StudentIdentityCard, передав в конструктор строку "Алиса", и вывести имя студента на экран с помощью метода getStudentName().
 */

/*
 * // JavaRush
 * Черновик:
 * package ru.javarush.java.core.level15.task14;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Создаем удостоверение с именем "Алиса"
 *         StudentIdentityCard card = new StudentIdentityCard("Алиса");
 *
 *         // Выводим имя студента через геттер
 *         System.out.println(card.getStudentName());
 *
 *         // Попытка изменить имя невозможна:
 *         card.studentName = "Боб"; // так нельзя — поле приватное и final (ошибка компиляции)
 *     }
 * }
 */

// JavaRush
package ru.javarush.java.core.level15.task14;

public class Solution {
    public static void main(String[] args) {
        // Создаем удостоверение с именем "Алиса"
        StudentIdentityCard card = new StudentIdentityCard("Алиса");

        // Выводим имя студента через геттер
        System.out.println(card.getStudentName());

        // Попытка изменить имя невозможна:
        card.studentName = "Боб"; // так нельзя — поле приватное и final (ошибка компиляции)
    }
}

/*
 * // JavaRush
 * Правильное решение:
 * // Author: JavaRush's team
 * package ru.javarush.java.core.level15.task14;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Создаем удостоверение с именем "Алиса"
 *         StudentIdentityCard card = new StudentIdentityCard("Алиса");
 *
 *         // Выводим имя студента через геттер
 *         System.out.println(card.getStudentName());
 *
 *         // Попытка изменить имя невозможна:
 *         card.studentName = "Боб"; // так нельзя — поле приватное и final (ошибка компиляции)
 *     }
 * }
 */