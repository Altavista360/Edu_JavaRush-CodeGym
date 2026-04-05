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

// JavaRush
package ru.javarush.java.core.level14.task16;

public class Student {
    public String studentName;
    public String studentGroup;
    public int studentScore;

    public Student(String studentName, String studentGroup, int studentScore) {
        this.studentName = studentName;
        this.studentGroup = studentGroup;
        this.studentScore = studentScore;
    }

    public Student(String studentName, String studentGroup) {
        this(studentName, studentGroup, 0);
    }

    public Student(String studentName) {
        this(studentName, "Unknown", 0);
    }

    public Student() {
        this("Unknown", "Unknown", 0);
    }
}

/*
 * // JavaRush
 * Правильное решение:
 * // Author: JavaRush's team
 * package ru.javarush.java.core.level14.task16;
 *
 * // Публичный класс Student — "форма зачисления"
 * public class Student {
 *     // Поля "анкеты" студента
 *     public String studentName;
 *     public String studentGroup;
 *     public int studentScore;
 *
 *     // 1) Полный конструктор: все три параметра заданы явно
 *     public Student(String studentName, String studentGroup, int studentScore) {
 *         this.studentName = studentName;
 *         this.studentGroup = studentGroup;
 *         this.studentScore = studentScore;
 *     }
 *
 *     // 2) Имя и группа: балл по умолчанию 0
 *     public Student(String studentName, String studentGroup) {
 *         this(studentName, studentGroup, 0); // делегируем в "полный" конструктор
 *     }
 *
 *     // 3) Только имя: группа "Unknown", балл 0
 *     public Student(String studentName) {
 *         this(studentName, "Unknown", 0); // переиспользуем логику через this(...)
 *     }
 *
 *     // 4) Без параметров: имя и группа "Unknown", балл 0
 *     public Student() {
 *         this("Unknown", "Unknown", 0); // единая точка инициализации
 *     }
 * }
 */