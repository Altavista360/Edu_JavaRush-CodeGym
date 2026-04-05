/*
 * Authors: JavaRush's team, CodeGym's team, Altavista360
 * Version: 1.0.0
 */

/*
 * // JavaRush
 * Задача: Зачисление студентов в многопрофильный колледж
 * Ссылка: https://javarush.com/tasks/ru.javarush.java.core.level14.task16
 */

/*
 * // CodeGym
 * Task: Enrollment of students in a multidisciplinary college
 * Link: https://codegym.cc/tasks/en.codegym.java.core.level14.task16
 */

/*
 * // JavaRush
 * Условие:
 * Вы — ответственный за приём студентов в уникальное учебное заведение, куда поступают самые разные ученики: кто-то уже с полным досье, кто-то только с именем и группой, кто-то просто с именем, а кто-то и вовсе без какой-либо начальной информации.
 * Ваша задача — разработать форму зачисления для студентов, назвав её Student, которая будет настолько гибкой, чтобы принимать учеников с любым набором начальных данных. Каждая "форма" должна содержать имя (String studentName), группу (String studentGroup) и балл за вступительные экзамены (int studentScore).
 * Реализуйте четыре сценария зачисления (конструктора):
 * • первый сценарий принимает все три параметра.
 * • второй сценарий принимает только имя и группу, устанавливая балл в 0.
 * • третий сценарий принимает только имя, устанавливая группу в "Unknown" и балл в 0.
 * • четвертый сценарий не принимает никаких параметров, устанавливая имя в "Unknown", группу в "Unknown" и балл в 0.
 * После того как вы создадите эту гибкую "форму", в вашем главном сценарии "зачислите" четырёх студентов, используя каждый из этих сценариев (по одному студенту на каждый сценарий).
 * В завершение, покажите миру их профили, выведя значения их полей на экран, чтобы убедиться в корректности зачисления.
 */

/*
 * // JavaRush
 * Требования:
 * • Необходимо создать публичный класс с именем Student.
 * • В классе Student должны быть объявлены три поля: String studentName, String studentGroup, int studentScore.
 * • В классе Student должен быть реализован конструктор, принимающий три параметра: имя, группа и балл, и инициализирующий соответствующие поля.
 * • В классе Student должен быть реализован конструктор, принимающий только имя и группу, при этом поле studentScore должно устанавливаться в 0.
 * • В классе Student должен быть реализован конструктор, принимающий только имя, при этом поле studentGroup должно устанавливаться в "Unknown", а studentScore — в 0.
 * • В классе Student должен быть реализован конструктор без параметров, при этом поля studentName и studentGroup должны устанавливаться в "Unknown", а studentScore — в 0.
 * • В главном методе программы должны быть созданы четыре объекта класса Student, каждый с использованием одного из четырёх конструкторов.
 * • В главном методе программы необходимо вывести значения всех полей каждого из четырёх студентов на экран.
 */

/*
 * // JavaRush
 * Черновик:
 * package ru.javarush.java.core.level14.task16;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Создаём четырёх студентов, используя каждый из четырёх конструкторов
 *         Student full = new Student("Алиса", "Физика", 95);
 *         Student noScore = new Student("Борис", "Математика");
 *         Student nameOnly = new Student("Светлана");
 *         Student empty = new Student();
 *
 *         // Выводим значения всех полей каждого студента
 *         printStudent(full);
 *         printStudent(noScore);
 *         printStudent(nameOnly);
 *         printStudent(empty);
 *     }
 *
 *     // Небольшой помощник для наглядного вывода всех полей студента
 *     private static void printStudent(Student s) {
 *         System.out.println("Имя: " + s.studentName
 *                 + ", Группа: " + s.studentGroup
 *                 + ", Балл: " + s.studentScore);
 *     }
 * }
 */

// JavaRush
package ru.javarush.java.core.level14.task16;

public class Solution {
    public static void main(String[] args) {
        // Создаём четырёх студентов, используя каждый из четырёх конструкторов
        Student full = new Student("Алиса", "Физика", 95);
        Student noScore = new Student("Борис", "Математика");
        Student nameOnly = new Student("Светлана");
        Student empty = new Student();

        // Выводим значения всех полей каждого студента
        printStudent(full);
        printStudent(noScore);
        printStudent(nameOnly);
        printStudent(empty);
    }

    // Небольшой помощник для наглядного вывода всех полей студента
    private static void printStudent(Student s) {
        System.out.println("Имя: " + s.studentName
                + ", Группа: " + s.studentGroup
                + ", Балл: " + s.studentScore);
    }
}

/*
 * // JavaRush
 * Правильное решение:
 * // Author: JavaRush's team
 * package ru.javarush.java.core.level14.task16;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Создаём четырёх студентов, используя каждый из четырёх конструкторов
 *         Student full = new Student("Алиса", "Физика", 95);
 *         Student noScore = new Student("Борис", "Математика");
 *         Student nameOnly = new Student("Светлана");
 *         Student empty = new Student();
 *
 *         // Выводим значения всех полей каждого студента
 *         printStudent(full);
 *         printStudent(noScore);
 *         printStudent(nameOnly);
 *         printStudent(empty);
 *     }
 *
 *     // Небольшой помощник для наглядного вывода всех полей студента
 *     private static void printStudent(Student s) {
 *         System.out.println("Имя: " + s.studentName
 *                 + ", Группа: " + s.studentGroup
 *                 + ", Балл: " + s.studentScore);
 *     }
 * }
 */