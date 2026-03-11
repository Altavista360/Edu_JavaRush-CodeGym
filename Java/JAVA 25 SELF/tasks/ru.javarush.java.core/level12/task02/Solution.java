/*
 * Authors: JavaRush's team, CodeGym's team, Altavista360
 * Version: 1.0.0
 */

/*
 * // JavaRush
 * Задача: Замена и удаление элементов
 * Ссылка: https://javarush.com/tasks/ru.javarush.java.core.level12.task02
 */

/*
 * // CodeGym
 * Task: Replace and remove elements
 * Link: https://codegym.cc/tasks/en.codegym.java.core.level12.task02
 */

/*
 * // JavaRush
 * Условие:
 * Вы — шеф-повар, и ваш помощник только что прислал вам список свежих продуктов на день. Но планы изменились! Вам нужно обновить этот список прямо на ходу.
 * Создайте динамический список, который будет хранить названия фруктов (типа String).
 * Сначала добавьте в него "Яблоко", "Банан" и "Апельсин", чтобы отразить ваш начальный запас.
 * Затем представьте, что вместо "Банана" вам привезли "Грушу" — замените второй элемент в вашем списке на "Груша".
 * Неожиданно выясняется, что "Яблоко" закончилось, и его нужно срочно удалить из списка, убрав самый первый элемент.
 * В конце концов, пройдитесь по всему обновленному списку фруктов, выводя каждый из них на отдельной строке, чтобы точно знать, что у вас осталось.
 */

/*
 * // JavaRush
 * Требования:
 * • Необходимо создать динамический список (например, ArrayList), который будет хранить строки (названия фруктов).
 * • В список нужно добавить три элемента: "Яблоко", "Банан" и "Апельсин" — именно в таком порядке.
 * • Второй элемент списка ("Банан") должен быть заменен на "Груша".
 * • Первый элемент списка ("Яблоко") должен быть удален.
 * • Каждый элемент итогового списка должен быть выведен на отдельной строке.
 */

/*
 * // JavaRush
 * Черновик:
 * package ru.javarush.java.core.level12.task02;
 *
 * import java.util.ArrayList;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Создаем динамический список строк (названия фруктов)
 *
 *
 *         // Добавляем исходные фрукты в заданном порядке
 *
 *
 *         // Заменяем второй элемент ("Банан") на "Груша"
 *
 *
 *         // Удаляем первый элемент ("Яблоко")
 *
 *
 *         // Выводим оставшиеся фрукты, каждый на новой строке
 *
 *     }
 * }
 */

// JavaRush
package ru.javarush.java.core.level12.task02;

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        // Создаем динамический список строк (названия фруктов)
        ArrayList<String> someFruits = new ArrayList<>();

        // Добавляем исходные фрукты в заданном порядке
        someFruits.add("Яблоко");
        someFruits.add("Банан");
        someFruits.add("Апельсин");

        // Заменяем второй элемент ("Банан") на "Груша"
        someFruits.set(1, "Груша");

        // Удаляем первый элемент ("Яблоко")
        someFruits.remove(0);

        // Выводим оставшиеся фрукты, каждый на новой строке
        for (String fruit : someFruits)
        {
            System.out.println(fruit);
        }
    }
}

/*
 * // JavaRush
 * Правильное решение:
 * // Author: JavaRush's team
 * package ru.javarush.java.core.level12.task02;
 *
 * import java.util.ArrayList;
 * import java.util.List;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Создаем динамический список строк (названия фруктов)
 *         ArrayList<String> fruits = new ArrayList<>();
 *
 *         // Добавляем исходные фрукты в заданном порядке
 *         fruits.add("Яблоко");
 *         fruits.add("Банан");
 *         fruits.add("Апельсин");
 *
 *         // Заменяем второй элемент ("Банан") на "Груша"
 *         fruits.set(1, "Груша");
 *
 *         // Удаляем первый элемент ("Яблоко")
 *         fruits.remove(0);
 *
 *         // Выводим оставшиеся фрукты, каждый на новой строке
 *         for (String fruit : fruits) {
 *             System.out.println(fruit);
 *         }
 *     }
 * }
 */