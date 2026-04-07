/*
 * Authors: JavaRush's team, CodeGym's team, Altavista360
 * Version: 1.0.0
 */

/*
 * // JavaRush
 * Задача: Путь студента к итоговой оценке
 * Ссылка: https://javarush.com/tasks/ru.javarush.java.core.level14.task20
 */

/*
 * // CodeGym
 * Task: A Student's Path to the Final Grade
 * Link: https://codegym.cc/tasks/en.codegym.java.core.level14.task20
 */

/*
 * // JavaRush
 * Условие:
 * Представьте, что вы отслеживаете процесс подготовки нового студента к поступлению. Его оценка по предмету проходит несколько этапов пересмотра, и вы хотите видеть, как она меняется на каждом шаге, прежде чем студент будет полностью "готов" к зачислению.
 * Ваша задача — создать "профиль" студента, назвав его Student, с полем для оценки (int studentGrade), которое при объявлении изначально получает значение 1.
 * Затем добавьте в этот профиль два "контрольных пункта" (нестатических блока инициализации), которые будут автоматически срабатывать в определённом порядке при "создании" каждого студента.
 * • Первый "контрольный пункт" должен сначала вывести на экран "Блок 1: grade = " и текущую оценку, а затем установить оценку в 5.
 * • Второй "контрольный пункт" должен просто вывести "Блок 2: grade = " и текущую оценку.
 * В вашем главном сценарии (main методе) "создайте" одного студента, назвав его newStudent.
 * В результате на экране должны появиться строки, показывающие изменения оценки:
 * Блок 1: grade = 1
 * Блок 2: grade = 5
 */

/*
 * // JavaRush
 * Требования:
 * • Необходимо создать класс с именем Student.
 * • В классе Student должно быть объявлено нестатическое поле int studentGrade, которое инициализируется значением 1 непосредственно при объявлении.
 * • В классе Student должен быть объявлен первый нестатический блок инициализации, который сначала выводит на экран строку "Блок 1: grade = " и текущее значение studentGrade, а затем присваивает полю studentGrade значение 5.
 * • В классе Student должен быть объявлен второй нестатический блок инициализации, который выводит на экран строку "Блок 2: grade = " и текущее значение studentGrade.
 * • Блоки инициализации должны выполняться в том порядке, в котором они объявлены в классе.
 * • В методе main необходимо создать объект класса Student с именем newStudent.
 * • В результате работы программы должны быть выведены строки "Блок 1: grade = 1" и "Блок 2: grade = 5" в указанном порядке.
 */

/*
 * // JavaRush
 * Черновик:
 * package ru.javarush.java.core.level14.task20;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Создаем объект класса Student
 *
 *     }
 * }
 */

// JavaRush
package ru.javarush.java.core.level14.task20;

public class Solution {
    public static void main(String[] args) {
        // Создаем объект класса Student
        Student newStudent = new Student();
    }
}

class Student {
    int studentGrade = 1;
    {
        System.out.println("Блок 1: grade = " + studentGrade);
        studentGrade = 5;
    }
    {
        System.out.println("Блок 2: grade = " + studentGrade);
    }
}

/*
 * // JavaRush
 * Правильное решение:
 * // Author: JavaRush's team
 * package ru.javarush.java.core.level14.task20;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Создаем объект класса Student
 *         Student newStudent = new Student();
 *     }
 * }
 *
 * class Student {
 *     // Поле оценки с начальным значением 1
 *     int studentGrade = 1;
 *
 *     // Первый блок инициализации
 *     {
 *         // Выводим текущую оценку
 *         System.out.println("Блок 1: grade = " + studentGrade);
 *         // Устанавливаем значение оценки в 5
 *         studentGrade = 5;
 *     }
 *
 *     // Второй блок инициализации
 *     {
 *         // Выводим текущую оценку
 *         System.out.println("Блок 2: grade = " + studentGrade);
 *     }
 * }
 */