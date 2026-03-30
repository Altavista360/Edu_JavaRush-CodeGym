/*
 * Authors: JavaRush's team, CodeGym's team, Altavista360
 * Version: 1.0.0
 */

/*
 * // JavaRush
 * Задача: Открытие нового семестра: учёт студентов
 * Ссылка: https://javarush.com/tasks/ru.javarush.java.core.level14.task04
 */

/*
 * // CodeGym
 * Task: Opening a New Semester: Student Records
 * Link: https://codegym.cc/tasks/en.codegym.java.core.level14.task04
 */

/*
 * // JavaRush
 * Условие:
 * Вы — администратор виртуального университета, и вам нужно вести учёт студентов. Каждый студент в вашей системе имеет имя и год поступления.
 * Ваша задача — создать "форму" для каждого студента, которая будет содержать его имя (String studentName) и год поступления (int enrollmentYear).
 * После этого, в вашем главном сценарии (main методе), "зарегистрируйте" двух разных студентов: для первого студента укажите имя "Анна" и год поступления 2022, а для второго — "Иван" и 2023 год.
 * И наконец, "представьте" каждого из этих студентов, выведя на экран их имя и год поступления в формате: "Имя: [имя студента], год поступления: [год поступления]".
 */

/*
 * // JavaRush
 * Требования:
 * • Необходимо объявить класс с именем Student.
 * • Класс Student должен содержать два поля: String studentName и int enrollmentYear.
 * • В методе main необходимо создать два объекта класса Student с разными значениями полей.
 * • Объекты студентов должны быть инициализированы следующими значениями: для первого — имя "Анна" и год поступления 2022, для второго — имя "Иван" и год поступления 2023.
 * • В методе main необходимо вывести на экран информацию о каждом студенте в формате: "Имя: [имя студента], год поступления: [год поступления]".
 */

/*
 * // JavaRush
 * Черновик:
 * package ru.javarush.java.core.level14.task04;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Создаем два объекта Student и сразу инициализируем их поля через конструктор
 *
 *
 *         // Выводим информацию о каждом студенте в заданном формате
 *
 *     }
 * }
 *
 * // Класс-форма для студента: хранит имя и год поступления
 */

// JavaRush
package ru.javarush.java.core.level14.task04;

public class Solution {
    public static void main(String[] args) {
        // Создаем два объекта Student и сразу инициализируем их поля через конструктор
        Student firstStudent = new Student("Анна", 2022);
        Student secondStudent = new Student("Иван", 2023);

        // Выводим информацию о каждом студенте в заданном формате
        System.out.println("Имя: " + firstStudent.studentName + ", год поступления: " + firstStudent.enrollmentYear);
        System.out.println("Имя: " + secondStudent.studentName + ", год поступления: " + secondStudent.enrollmentYear);
    }
}

// Класс-форма для студента: хранит имя и год поступления
class Student {
    String studentName;
    int enrollmentYear;

    Student(String studentName, int enrollmentYear) {
        this.studentName = studentName;
        this.enrollmentYear = enrollmentYear;
    }
}

/*
 * // JavaRush
 * Правильное решение:
 * // Author: JavaRush's team
 * package ru.javarush.java.core.level14.task04;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Создаем два объекта Student и сразу инициализируем их поля через конструктор
 *         Student firstStudent = new Student("Анна", 2022);
 *         Student secondStudent = new Student("Иван", 2023);
 *
 *         // Выводим информацию о каждом студенте в заданном формате
 *         System.out.println("Имя: " + firstStudent.studentName + ", год поступления: " + firstStudent.enrollmentYear);
 *         System.out.println("Имя: " + secondStudent.studentName + ", год поступления: " + secondStudent.enrollmentYear);
 *     }
 * }
 *
 * // Класс-форма для студента: хранит имя и год поступления
 * class Student {
 *     String studentName;   // Имя студента
 *     int enrollmentYear;   // Год поступления
 *
 *     // Простой конструктор для инициализации полей при создании объекта
 *     Student(String studentName, int enrollmentYear) {
 *         this.studentName = studentName;
 *         this.enrollmentYear = enrollmentYear;
 *     }
 * }
 */