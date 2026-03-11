/*
 * Authors: JavaRush's team, CodeGym's team, Altavista360
 * Version: 1.0.0
 */

/*
 * // JavaRush
 * Задача: Добавление и получение элемента
 * Ссылка: https://javarush.com/tasks/ru.javarush.java.core.level12.task01
 */

/*
 * // CodeGym
 * Task: Adding and retrieving an element
 * Link: https://codegym.cc/tasks/en.codegym.java.core.level12.task01
 */

/*
 * // JavaRush
 * Условие:
 * Представьте, что вы управляете небольшим цифровым архивом редких артефактов, и каждый новый предмет получает свой уникальный идентификатор. Вы только что обнаружили новый артефакт и присвоили ему номер 42.
 * Ваша задача — внести этот номер в вашу коллекцию, а затем убедиться, что он успешно записан, просмотрев самый первый добавленный идентификатор.
 * Создайте динамический список для хранения числовых идентификаторов артефактов (типа Integer). Затем смело добавьте в этот список идентификатор 42. После этого получите доступ к первому элементу вашего списка, используя его позицию, и выведите его уникальный код на экран, чтобы подтвердить успешное добавление.
 */

/*
 * // JavaRush
 * Требования:
 * • Необходимо создать динамический список для хранения числовых идентификаторов артефактов типа Integer.
 * • В список должен быть добавлен идентификатор с числовым значением 42.
 * • Требуется получить первый элемент списка по его индексу (позиции 0).
 * • Полученное значение первого элемента списка должно быть выведено на экран.
 */

/*
 * // JavaRush
 * Черновик:
 * package ru.javarush.java.core.level12.task01;
 *
 * import java.util.ArrayList;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Создаем динамический список для хранения числовых идентификаторов артефактов
 *
 *
 *         // Добавляем идентификатор 42 в список
 *
 *
 *         // Получаем первый элемент списка по индексу 0
 *
 *
 *         // Выводим значение первого элемента на экран
 *
 *     }
 * }
 */

// JavaRush
package ru.javarush.java.core.level12.task01;

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        // Создаем динамический список для хранения числовых идентификаторов артефактов
        ArrayList<Integer> someList = new ArrayList<>();

        // Добавляем идентификатор 42 в список
        someList.add(42);

        // Получаем первый элемент списка по индексу 0
        int foo = someList.get(0);

        // Выводим значение первого элемента на экран
        System.out.println(foo);
    }
}

/*
 * // JavaRush
 * Правильное решение:
 * // Author: JavaRush's team
 * package ru.javarush.java.core.level12.task01;
 *
 * import java.util.ArrayList;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Создаем динамический список для хранения числовых идентификаторов артефактов
 *         ArrayList<Integer> artifactIds = new ArrayList<>();
 *
 *         // Добавляем идентификатор 42 в список
 *         artifactIds.add(42);
 *
 *         // Получаем первый элемент списка по индексу 0
 *         Integer firstArtifactId = artifactIds.get(0);
 *
 *         // Выводим значение первого элемента на экран
 *         System.out.println(firstArtifactId);
 *     }
 * }
 */