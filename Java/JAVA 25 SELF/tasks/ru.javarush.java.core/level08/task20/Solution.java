/*
 * Authors: JavaRush's team, CodeGym's team, Altavista360
 * Version: 1.0.0
 */

/*
 * // JavaRush
 * Задача: Управление информацией о школьниках в базе данных 👩‍🎓
 * Ссылка: https://javarush.com/tasks/ru.javarush.java.core.level08.task20
 */

/*
 * // CodeGym
 * Task: Managing student information in the database 👩‍🎓
 * Link: https://codegym.cc/tasks/en.codegym.java.core.level08.task20
 */

/*
 * // JavaRush
 * Условие:
 * Вы — администратор школы, ведущий электронный реестр учащихся. Некоторая информация о студентах, например, их имя, может быть открытой для просмотра всеми, кто имеет доступ к системе. Однако возраст — это более чувствительная информация, которую нельзя менять напрямую или видеть всем подряд, кроме авторизованного персонала.
 * Создайте класс SchoolStudent. Объявите в нем публичное поле studentName типа String (это имя будет видно всем) и приватное поле studentAge типа int (этот возраст должен быть скрыт от прямого доступа извне).
 * Чтобы администрация могла все же корректно устанавливать возраст, реализуйте публичный метод setStudentAge(int ageToSet). Также создайте публичный метод displayStudentProfile(), который будет аккуратно выводить на экран имя и возраст студента.
 * В главном кабинете администрации, в методе main, создайте запись для нового студента: newPupil = new SchoolStudent(). Присвойте его имя напрямую через публичное поле, например, "Мария". Затем, используя метод setStudentAge, установите её возраст, допустим, 16. После этого вызовите displayStudentProfile() для newPupil, чтобы увидеть полный профиль.
 * В заключение, попробуйте напрямую, из метода main, изменить поле newPupil.studentAge. Вы увидите, как система безопасности (компилятор) немедленно выдаст ошибку, потому что studentAge — приватное поле, и его нельзя трогать без разрешения! Это наглядно демонстрирует принципы инкапсуляции.
 */

/*
 * // JavaRush
 * Требования:
 * • В классе SchoolStudent должно быть объявлено публичное поле studentName типа String.
 * • В классе SchoolStudent должно быть объявлено приватное поле studentAge типа int.
 * • В классе SchoolStudent должен быть реализован публичный метод setStudentAge(int ageToSet), который позволяет установить значение возраста.
 * • В классе SchoolStudent должен быть реализован публичный метод displayStudentProfile(), который выводит на экран имя и возраст студента.
 * • В методе main имя студента должно быть присвоено напрямую через публичное поле studentName.
 * • В методе main возраст студента должен быть установлен с помощью метода setStudentAge.
 * • В методе main должна быть предпринята попытка изменить поле studentAge напрямую, которая приведет к ошибке компиляции.
 */

/*
 * // JavaRush
 * Черновик:
 * package ru.javarush.java.core.level08.task20;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Создаём новую запись об ученике
 *         SchoolStudent newPupil = new SchoolStudent();
 *
 *         // Имя можно присвоить напрямую — поле публичное
 *         newPupil.studentName = "Мария";
 *
 *         // Возраст задаётся только через публичный метод (инкапсуляция)
 *
 *
 *         // Выведем аккуратный профиль ученика
 *
 *
 *         // Попытка прямого изменения приватного поля — это нарушение инкапсуляции.
 *
 *     }
 * }
 *
 * // Класс описывает ученика школы
 * class SchoolStudent {
 *     // Имя ученика доступно всем — публичное поле
 *
 *
 *     // Возраст ученика — чувствительная информация, скрытая от прямого доступа
 *
 *
 *     // Публичный метод позволяет корректно установить возраст
 *
 *
 *     // Аккуратно выводим профиль ученика
 *
 * }
 */

// JavaRush
package ru.javarush.java.core.level08.task20;

public class Solution {
    public static void main(String[] args) {
        // Создаём новую запись об ученике
        SchoolStudent newPupil = new SchoolStudent();

        // Имя можно присвоить напрямую — поле публичное
        newPupil.studentName = "Мария";

        // Возраст задаётся только через публичный метод (инкапсуляция)
        newPupil.setStudentAge(16);

        // Выведем аккуратный профиль ученика
        newPupil.displayStudentProfile();

        // Попытка прямого изменения приватного поля — это нарушение инкапсуляции.
        newPupil.studentAge = 19;
    }
}

// Класс описывает ученика школы
class SchoolStudent {
    // Имя ученика доступно всем — публичное поле
    public String studentName;

    // Возраст ученика — чувствительная информация, скрытая от прямого доступа
    private int studentAge;

    // Публичный метод позволяет корректно установить возраст
    public void setStudentAge(int ageToSet) {
        this.studentAge = ageToSet;
    }

    // Аккуратно выводим профиль ученика
    public void displayStudentProfile() {
        System.out.println("Профиль ученика");
        System.out.println("Имя: " + studentName);
        System.out.println("Возраст: " + studentAge);
    }
}

/*
 * // JavaRush
 * Правильное решение:
 * // Author: JavaRush's team
 * package ru.javarush.java.core.level08.task20;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Создаём новую запись об ученике
 *         SchoolStudent newPupil = new SchoolStudent();
 *
 *         // Имя можно присвоить напрямую — поле публичное
 *         newPupil.studentName = "Мария";
 *
 *         // Возраст задаётся только через публичный метод (инкапсуляция)
 *         newPupil.setStudentAge(16);
 *
 *         // Выведем аккуратный профиль ученика
 *         newPupil.displayStudentProfile();
 *
 *         // Попытка прямого изменения приватного поля — это нарушение инкапсуляции.
 *         newPupil.studentAge = 17; // Ошибка: studentAge has private access in SchoolStudent
 *     }
 * }
 *
 * // Класс описывает ученика школы
 * class SchoolStudent {
 *     // Имя ученика доступно всем — публичное поле
 *     public String studentName;
 *
 *     // Возраст ученика — чувствительная информация, скрытая от прямого доступа
 *     private int studentAge;
 *
 *     // Публичный метод позволяет корректно установить возраст
 *     public void setStudentAge(int ageToSet) {
 *         this.studentAge = ageToSet;
 *     }
 *
 *     // Аккуратно выводим профиль ученика
 *     public void displayStudentProfile() {
 *         System.out.println("Профиль ученика");
 *         System.out.println("Имя: " + studentName);
 *         System.out.println("Возраст: " + studentAge);
 *     }
 * }
 */