/*
 * Authors: JavaRush's team, CodeGym's team, Altavista360
 * Version: 1.0.0
 */

/*
 * // JavaRush
 * Задача: Математические константы для всего мира 🌍
 * Ссылка: https://javarush.com/tasks/ru.javarush.java.core.level10.task07
 */

/*
 * // CodeGym
 * Task: Mathematical constants for the whole world 🌍
 * Link: https://codegym.cc/tasks/en.codegym.java.core.level10.task07
 */

/*
 * // JavaRush
 * Условие:
 * Представьте, что вы разрабатываете библиотеку для сложных математических расчетов, и вам нужна константа Пи (π), которая должна быть доступна из любой части вашей программы без создания каких-либо объектов.
 * Создайте отдельный класс под названием MathFormulas. Внутри этого класса объявите публичную статическую финальную переменную типа double с именем PI_VALUE и присвойте ей точное значение 3.1415926535. Затем в методе main вашей основной программы выведите значение этой константы на экран, обратившись к ней напрямую через имя класса MathFormulas, показывая, что она доступна всем.
 */

/*
 * // JavaRush
 * Требования:
 * • Должен быть создан отдельный класс с именем MathFormulas.
 * • Внутри класса MathFormulas должна быть объявлена публичная статическая финальная переменная типа double с именем PI_VALUE.
 * • Переменной PI_VALUE должно быть присвоено значение 3.1415926535 при объявлении.
 * • Доступ к переменной PI_VALUE должен осуществляться напрямую через имя класса MathFormulas, без создания экземпляра этого класса.
 * • В методе main основной программы должно быть выведено на экран значение переменной PI_VALUE, обращаясь к ней через MathFormulas.PI_VALUE.
 */

/*
 * // JavaRush
 * Черновик:
 * package ru.javarush.java.core.level10.task07;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Выводим значение константы PI_VALUE, обращаясь к ней через имя класса MathFormulas
 *
 *     }
 * }
 */

// JavaRush
package ru.javarush.java.core.level10.task07;

public class MathFormulas {
    public static final double PI_VALUE = 3.1415926535;
}

public class Solution {
    public static void main(String[] args) {
        // Выводим значение константы PI_VALUE, обращаясь к ней через имя класса MathFormulas
        System.out.println(MathFormulas.PI_VALUE);
    }
}

/*
 * // JavaRush
 * Правильное решение:
 * // Author: JavaRush's team
 *
 * // Solution.java
 * package ru.javarush.java.core.level10.task07;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Выводим значение константы PI_VALUE, обращаясь к ней через имя класса MathFormulas
 *         System.out.println(MathFormulas.PI_VALUE);
 *     }
 * }
 *
 * // MathFormulas.java
 * package ru.javarush.java.core.level10.task07;
 *
 * // Класс MathFormulas предназначен для хранения математических констант
 * public class MathFormulas {
 *     // Объявляем публичную статическую финальную переменную для хранения значения Пи
 *     public static final double PI_VALUE = 3.1415926535;
 * }
 */