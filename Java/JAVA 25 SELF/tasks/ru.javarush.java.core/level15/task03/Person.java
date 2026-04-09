/*
 * Authors: JavaRush's team, CodeGym's team, Altavista360
 * Version: 1.0.0
 */

/*
 * // JavaRush
 * Задача: Корректировка данных и защита от ошибок 🚫
 * Ссылка: https://javarush.com/tasks/ru.javarush.java.core.level15.task03
 */

/*
 * // CodeGym
 * Task: Data validation and error protection 🚫
 * Link: https://codegym.cc/tasks/en.codegym.java.core.level15.task03
 */

/*
 * // JavaRush
 * Условие:
 * Представьте, что вы — секретарь клуба, и вам нужно обновлять информацию о членах, но при этом важно, чтобы данные всегда оставались корректными. Например, возраст не может быть отрицательным!
 * Продолжайте работать с вашим классом Person. Добавьте в него два публичных метода-сеттера: setMemberName(String newName) для изменения имени и setMemberAge(int newAge) для изменения возраста.
 * В методе setMemberAge() реализуйте важную проверку: если кто-то пытается установить отрицательный возраст (то есть newAge < 0), ваш метод должен отказаться изменять поле memberAge. Вместо этого он должен вывести на экран сообщение "Ошибка: Возраст не может быть отрицательным. Значение не изменено." В противном случае, если возраст корректен, спокойно обновите поле memberAge.
 * В классе Solution создайте новый объект Person, например, "Иван", с возрастом 25. Затем попробуйте установить Ивану возраст -5. После этого выведите его текущий возраст на экран, чтобы убедиться, что возраст не изменился, и вы увидите то самое сообщение об ошибке. Затем попробуйте установить ему корректный возраст, например, 35, и снова выведите возраст, чтобы подтвердить успешное изменение.
 */

/*
 * // JavaRush
 * Требования:
 * • В классе Person должны быть объявлены два публичных метода-сеттера: setMemberName(String newName) и setMemberAge(int newAge).
 * • Метод setMemberAge(int newAge) должен проверять, что переданное значение newAge не меньше 0.
 * • Если newAge меньше 0, метод setMemberAge не должен изменять значение поля memberAge и должен вывести сообщение "Ошибка: Возраст не может быть отрицательным. Значение не изменено." на экран.
 * • Если newAge больше или равен 0, метод setMemberAge должен изменить поле memberAge на новое значение.
 * • В методе main класса Solution должен быть создан объект Person с именем "Иван" и возрастом 25, после чего должны быть произведены попытки изменить возраст на -5 и 35 с соответствующей проверкой результата через вывод текущего возраста на экран.
 */

// JavaRush
package ru.javarush.java.core.level15.task03;

public class Person {
    private String memberName;
    private int memberAge;

    public Person(String memberName, int memberAge) {
        this.memberName = memberName;
        setMemberAge(memberAge);
    }

    public void setMemberName(String newName) {
        this.memberName = newName;
    }

    public void setMemberAge(int newAge) {
        if (newAge < 0) {
            System.out.println("Ошибка: Возраст не может быть отрицательным. Значение не изменено.");
            return;
        }
        this.memberAge = newAge;
    }

    public int getMemberAge() {
        return memberAge;
    }
}

/*
 * // JavaRush
 * Правильное решение:
 * // Author: JavaRush's team
 * package ru.javarush.java.core.level15.task03;
 *
 * // Класс Person инкапсулирует данные участника клуба
 * public class Person {
 *     private String memberName; // имя участника
 *     private int memberAge;     // возраст участника
 *
 *     // Конструктор: сохраняем имя и устанавливаем возраст через сеттер (с проверкой)
 *     public Person(String memberName, int memberAge) {
 *         this.memberName = memberName;
 *         setMemberAge(memberAge); // используем логику проверки из сеттера
 *     }
 *
 *     // Публичный сеттер имени
 *     public void setMemberName(String newName) {
 *         this.memberName = newName;
 *     }
 *
 *     // Публичный сеттер возраста с защитой от отрицательных значений
 *     public void setMemberAge(int newAge) {
 *         if (newAge < 0) {
 *             // Если возраст некорректный — не меняем поле и печатаем сообщение
 *             System.out.println("Ошибка: Возраст не может быть отрицательным. Значение не изменено.");
 *             return;
 *         }
 *         this.memberAge = newAge;
 *     }
 *
 *     // Геттер возраста — чтобы проверить текущие данные после попыток изменения
 *     public int getMemberAge() {
 *         return memberAge;
 *     }
 * }
 */