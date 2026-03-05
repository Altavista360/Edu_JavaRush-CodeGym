/*
 * Authors: JavaRush's team, CodeGym's team, Altavista360
 * Version: 1.0.0
 */

/*
 * // JavaRush
 * Задача: Отсутствующее имя секретного агента 🤫
 * Ссылка: https://javarush.com/tasks/ru.javarush.java.core.level11.task04
 */

/*
 * // CodeGym
 * Task: Missing Secret Agent Name 🤫
 * Link: https://codegym.cc/tasks/en.codegym.java.core.level11.task04
 */

/*
 * // JavaRush
 * Условие:
 * Вы ведете строгий учет личных дел в секретной базе данных. Иногда случается так, что имя человека по каким-то причинам отсутствует, и его поле в базе данных просто пустое, что в мире Java обозначается как null.
 * Создайте строковую переменную String secretAgentName и присвойте ей значение null.
 * Теперь представьте, что вам срочно нужно узнать длину имени этого агента (сколько в нём символов). Попробуйте вызвать метод length() у переменной secretAgentName и вывести результат на экран.
 * Вы увидите, что произойдет, когда вы пытаетесь что-то "измерить" у того, чего на самом деле нет.
 */

/*
 * // JavaRush
 * Требования:
 * • В программе должна быть объявлена переменная типа String с именем secretAgentName.
 * • Переменной secretAgentName должно быть явно присвоено значение null.
 * • В программе должен быть осуществлен вызов метода length() у переменной secretAgentName.
 * • Результат вызова метода length() у переменной secretAgentName должен быть выведен на экран.
 * • В результате выполнения программы должно возникнуть исключение NullPointerException.
 */

/*
 * // JavaRush
 * Черновик:
 * package ru.javarush.java.core.level11.task04;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Объявляем строковую переменную и явно присваиваем ей значение null
 *
 *
 *         // Пытаемся получить длину строки и вывести её на экран.
 *         // Здесь произойдет NullPointerException, т.к. метод вызывается у null.
 *
 *     }
 * }
 */

// JavaRush
package ru.javarush.java.core.level11.task04;

public class Solution {
    public static void main(String[] args) {
        // Объявляем строковую переменную и явно присваиваем ей значение null
        String secretAgentName = null;

        // Пытаемся получить длину строки и вывести её на экран.
        // Здесь произойдет NullPointerException, т.к. метод вызывается у null.
        System.out.println(secretAgentName.length());
    }
}

/*
 * // JavaRush
 * Правильное решение:
 * // Author: JavaRush's team
 * package ru.javarush.java.core.level11.task04;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Объявляем строковую переменную и явно присваиваем ей значение null
 *         String secretAgentName = null;
 *
 *         // Пытаемся получить длину строки и вывести её на экран.
 *         // Здесь произойдет NullPointerException, т.к. метод вызывается у null.
 *         System.out.println(secretAgentName.length());
 *     }
 * }
 */