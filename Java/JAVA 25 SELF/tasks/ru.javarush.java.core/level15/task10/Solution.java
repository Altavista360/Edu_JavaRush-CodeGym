/*
 * Authors: JavaRush's team, CodeGym's team, Altavista360
 * Version: 1.0.0
 */

/*
 * // JavaRush
 * Задача: Управление возрастом студента в базе данных 🎓
 * Ссылка: https://javarush.com/tasks/ru.javarush.java.core.level15.task10
 */

/*
 * // CodeGym
 * Task: Managing Student Age in the Database 🎓
 * Link: https://codegym.cc/tasks/en.codegym.java.core.level15.task10
 */

/*
 * // JavaRush
 * Условие:
 * Вы — часть команды, которая разрабатывает систему управления студенческими записями. Важно хранить возраст каждого студента и иметь возможность его корректировать, а также получать эту информацию.
 * Создайте класс StudentProfile. Внутри него объявите приватное поле studentAge типа int. Реализуйте для этого поля два публичных метода: getStudentAge(), который будет возвращать текущий возраст студента, и setStudentAge(int newAge), который позволит обновить возраст студента. Не забудьте также добавить публичный конструктор для инициализации studentAge при создании объекта.
 * В классе Solution создайте объект StudentProfile. Используя метод setStudentAge(), установите возраст студента, например, на 20 лет. Затем, чтобы убедиться, что возраст был успешно обновлён и доступен для чтения, выведите результат вызова метода getStudentAge() на экран.
 */

/*
 * // JavaRush
 * Требования:
 * • В классе StudentProfile должно быть объявлено приватное поле int studentAge.
 * • В классе StudentProfile должен быть публичный метод getStudentAge(), возвращающий текущее значение поля studentAge.
 * • В классе StudentProfile должен быть публичный метод setStudentAge(int newAge), который устанавливает значение поля studentAge.
 * • В классе StudentProfile должен быть публичный конструктор, принимающий параметр int для инициализации поля studentAge при создании объекта.
 * • В классе Solution должен быть создан объект StudentProfile.
 * • В классе Solution для объекта StudentProfile должен быть вызван метод setStudentAge с аргументом, например, 20.
 * • В классе Solution должен быть вызван метод getStudentAge для объекта StudentProfile, и результат должен быть выведен на экран.
 */

/*
 * // JavaRush
 * Черновик:
 * package ru.javarush.java.core.level15.task10;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Создаем объект профиля студента с начальным возрастом (например, 18)
 *         StudentProfile profile = new StudentProfile(18);
 *
 *         // Обновляем возраст до 20 с помощью сеттера
 *         profile.setStudentAge(20);
 *
 *         // Выводим текущий возраст, чтобы убедиться, что он обновился
 *         System.out.println(profile.getStudentAge());
 *     }
 * }
 */

// JavaRush
package ru.javarush.java.core.level15.task10;

public class Solution {
    public static void main(String[] args) {
        // Создаем объект профиля студента с начальным возрастом (например, 18)
        StudentProfile profile = new StudentProfile(18);

        // Обновляем возраст до 20 с помощью сеттера
        profile.setStudentAge(20);

        // Выводим текущий возраст, чтобы убедиться, что он обновился
        System.out.println(profile.getStudentAge());
    }
}

/*
 * // JavaRush
 * Правильное решение:
 * // Author: JavaRush's team
 * package ru.javarush.java.core.level15.task10;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Создаем объект профиля студента с начальным возрастом (например, 18)
 *         StudentProfile profile = new StudentProfile(18);
 *
 *         // Обновляем возраст до 20 с помощью сеттера
 *         profile.setStudentAge(20);
 *
 *         // Выводим текущий возраст, чтобы убедиться, что он обновился
 *         System.out.println(profile.getStudentAge());
 *     }
 * }
 */