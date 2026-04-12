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

// JavaRush
package ru.javarush.java.core.level15.task10;

public class StudentProfile {
    private int studentAge;

    public StudentProfile(int studentAge) {
        this.studentAge = studentAge;
    }

    public int getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(int newAge) {
        this.studentAge = newAge;
    }
}

/*
 * // JavaRush
 * Правильное решение:
 * // Author: JavaRush's team
 * package ru.javarush.java.core.level15.task10;
 *
 * // Класс с инкапсулированным полем возраста студента
 * public class StudentProfile {
 *     // Приватное поле: возраст студента
 *     private int studentAge;
 *
 *     // Публичный конструктор для первичной инициализации возраста
 *     public StudentProfile(int studentAge) {
 *         this.studentAge = studentAge;
 *     }
 *
 *     // Геттер: возвращает текущий возраст студента
 *     public int getStudentAge() {
 *         return studentAge;
 *     }
 *
 *     // Сеттер: позволяет обновить возраст студента
 *     public void setStudentAge(int newAge) {
 *         this.studentAge = newAge;
 *     }
 * }
 */