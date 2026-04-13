/*
 * Authors: JavaRush's team, CodeGym's team, Altavista360
 * Version: 1.0.0
 */

/*
 * // JavaRush
 * Задача: Строгая проверка возраста в школьной базе данных 🏫
 * Ссылка: https://javarush.com/tasks/ru.javarush.java.core.level15.task12
 */

/*
 * // CodeGym
 * Task: Strict age validation in the school database 🏫
 * Link: https://codegym.cc/tasks/en.codegym.java.core.level15.task12
 */

/*
 * // JavaRush
 * Условие:
 * Вы отвечаете за целостность данных в школьной базе. Очень важно, чтобы возраст учеников всегда был корректным — очевидно, он не может быть отрицательным. Система должна уметь отсеивать некорректные данные при попытке их ввода.
 * Создайте класс SchoolStudent. Внутри него объявите приватное поле currentAge типа int.
 * Реализуйте публичный геттер getCurrentAge() для получения возраста. Самое главное — реализуйте сеттер setCurrentAge(int potentialAge). Внутри этого сеттера добавьте проверку: если переданное значение potentialAge отрицательное, то поле currentAge не должно изменяться. Вместо этого выведите на экран строгое сообщение: "Внимание! Возраст студента не может быть отрицательным. Значение не обновлено.". Если же potentialAge корректное (неотрицательное), тогда обновите поле currentAge.
 * В классе Solution создайте объект SchoolStudent, возможно, с начальным возрастом 10. Затем попробуйте установить ему возраст -5. После этой попытки сразу же выведите текущий возраст студента на экран, используя геттер, чтобы убедиться, что он не изменился. Затем попробуйте установить возраст 15 и снова выведите его на экран, чтобы подтвердить, что корректное значение успешно обновилось.
 */

/*
 * // JavaRush
 * Требования:
 * • В классе SchoolStudent должно быть объявлено приватное поле currentAge типа int.
 * • В классе SchoolStudent должен быть реализован публичный метод getCurrentAge(), возвращающий текущее значение поля currentAge.
 * • В классе SchoolStudent должен быть реализован публичный метод setCurrentAge(int potentialAge), который обновляет поле currentAge только если potentialAge неотрицательное.
 * • Если в метод setCurrentAge передано отрицательное значение, поле currentAge не должно изменяться, а на экран должно выводиться сообщение: "Внимание! Возраст студента не может быть отрицательным. Значение не обновлено."
 * • В классе Solution должен быть создан объект SchoolStudent (например, с возрастом 10), после чего должны быть выполнены попытки установить возраст -5 и 15 с последующим выводом значения возраста через геттер после каждой попытки.
 */

// JavaRush
package ru.javarush.java.core.level15.task12;

public class SchoolStudent {
    private int currentAge;

    public SchoolStudent(int initialAge) {
        setCurrentAge(initialAge);
    }

    public int getCurrentAge() {
        return currentAge;
    }

    public void setCurrentAge(int potentialAge) {
        if (potentialAge < 0) {
            System.out.println("Внимание! Возраст студента не может быть отрицательным. Значение не обновлено.");
            return;
        }
        this.currentAge = potentialAge;
    }
}

/*
 * // JavaRush
 * Правильное решение:
 * // Author: JavaRush's team
 * package ru.javarush.java.core.level15.task12;
 *
 * // Класс, отвечающий за хранение и проверку возраста студента
 * public class SchoolStudent {
 *     // Приватное поле с текущим возрастом — инкапсуляция данных
 *     private int currentAge;
 *
 *     // Конструктор для задания начального возраста
 *     public SchoolStudent(int initialAge) {
 *         // Используем сеттер, чтобы применить ту же проверку корректности
 *         setCurrentAge(initialAge);
 *     }
 *
 *     // Публичный геттер для получения текущего возраста
 *     public int getCurrentAge() {
 *         return currentAge;
 *     }
 *
 *     // Публичный сеттер с проверкой на отрицательные значения
 *     public void setCurrentAge(int potentialAge) {
 *         if (potentialAge < 0) {
 *             // Сообщение строго по условию задачи
 *             System.out.println("Внимание! Возраст студента не может быть отрицательным. Значение не обновлено.");
 *             return; // Поле не изменяем, выходим из метода
 *         }
 *         this.currentAge = potentialAge; // Обновляем возраст, если значение корректное
 *     }
 * }
 */