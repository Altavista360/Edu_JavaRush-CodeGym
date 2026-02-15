/*
 * Authors: JavaRush's team, CodeGym's team, Altavista360
 * Version: 1.0.0
 */

/*
 * // JavaRush
 * Задача: Проектирование различных форм и размеров объектов 📐
 * Ссылка: https://javarush.com/tasks/ru.javarush.java.core.level08.task08
 */

/*
 * // CodeGym
 * Task: Designing Various Shapes and Sizes of Objects 📐
 * Link: https://codegym.cc/tasks/en.codegym.java.core.level08.task08
 */

/*
 * // JavaRush
 * Условие:
 * Вообразите, что вы помогаете инженеру-дизайнеру, которому нужно быстро создавать и проверять параметры различных прямоугольных объектов — от стен зданий до игровых элементов. Ваша задача — создать инструмент, который мгновенно покажет размеры любого заданного прямоугольника, чтобы можно было легко экспериментировать с формами. Сконструируйте класс ShapeDesigner.
 * Внутри него объявите статический метод printRectangleSpecs, который будет принимать два целых числа: rectangleWidth и rectangleHeight. Этот метод должен выводить на экран четкую информацию: "Характеристики прямоугольника: ширина = " с указанием ширины, а затем ", высота = " с указанием высоты.
 * Чтобы продемонстрировать гибкость вашего инструмента, в главном дизайнерском бюро, методе main, вызовите printRectangleSpecs трижды, каждый раз с новыми параметрами: сначала с размерами 5 на 10, затем 3 на 7, и напоследок 12 на 4. Убедитесь, что каждый раз программа точно описывает заданный прямоугольник.
 */

/*
 * // JavaRush
 * Требования:
 * • В программе должен быть объявлен класс с именем ShapeDesigner.
 * • В классе ShapeDesigner должен быть объявлен статический метод printRectangleSpecs, принимающий два параметра типа int.
 * • Метод printRectangleSpecs должен выводить строку "Характеристики прямоугольника: ширина = X, высота = Y", где X и Y — значения переданных параметров.
 * • В методе main класса ShapeDesigner необходимо трижды вызвать printRectangleSpecs с параметрами (5, 10), (3, 7), (12, 4) соответственно.
 * • Каждый вызов printRectangleSpecs должен приводить к корректному выводу характеристик прямоугольника с соответствующими значениями.
 */

/*
 * // JavaRush
 * Черновик:
 * package ru.javarush.java.core.level08.task08;
 *
 * public class ShapeDesigner {
 *
 *     // Статический метод, который выводит характеристики прямоугольника
 *     public static void printRectangleSpecs(int rectangleWidth, int rectangleHeight) {
 *
 *     }
 *
 *     public static void main(String[] args) {
 *         // Демонстрация работы метода с тремя наборами параметров
 *         printRectangleSpecs(5, 10);
 *         printRectangleSpecs(3, 7);
 *         printRectangleSpecs(12, 4);
 *     }
 * }
 */

// JavaRush
package ru.javarush.java.core.level08.task08;

public class ShapeDesigner {

    // Статический метод, который выводит характеристики прямоугольника
    public static void printRectangleSpecs(int rectangleWidth, int rectangleHeight) {
        System.out.println("Характеристики прямоугольника: ширина = " + rectangleWidth + ", высота = " + rectangleHeight);
    }

    public static void main(String[] args) {
        // Демонстрация работы метода с тремя наборами параметров
        printRectangleSpecs(5, 10);
        printRectangleSpecs(3, 7);
        printRectangleSpecs(12, 4);
    }
}

/*
 * // JavaRush
 * Правильное решение:
 * // Author: JavaRush's team
 * package ru.javarush.java.core.level08.task08;
 *
 * public class ShapeDesigner {
 *
 *     // Статический метод, который выводит характеристики прямоугольника
 *     public static void printRectangleSpecs(int rectangleWidth, int rectangleHeight) {
 *         System.out.println("Характеристики прямоугольника: ширина = " + rectangleWidth + ", высота = " + rectangleHeight);
 *     }
 *
 *     public static void main(String[] args) {
 *         // Демонстрация работы метода с тремя наборами параметров
 *         printRectangleSpecs(5, 10);
 *         printRectangleSpecs(3, 7);
 *         printRectangleSpecs(12, 4);
 *     }
 * }
 */