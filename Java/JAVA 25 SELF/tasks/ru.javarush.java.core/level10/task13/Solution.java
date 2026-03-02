/*
 * Authors: JavaRush's team, CodeGym's team, Altavista360
 * Version: 1.0.0
 */

/*
 * // JavaRush
 * Задача: Моделирование светофора 🚦
 * Ссылка: https://javarush.com/tasks/ru.javarush.java.core.level10.task13
 */

/*
 * // CodeGym
 * Task: Traffic Light Simulation 🚦
 * Link: https://codegym.cc/tasks/en.codegym.java.core.level10.task13
 */

/*
 * // JavaRush
 * Условие:
 * Представьте, что вы моделируете работу светофора на оживленном перекрестке. У светофора есть ограниченное количество состояний, и каждое из них имеет своё чёткое значение.
 * Ваша задача — объявить перечисление enum под названием TrafficSignalState с тремя возможными значениями: RED (красный), YELLOW (жёлтый) и GREEN (зелёный).
 * Затем в методе main создайте переменную типа TrafficSignalState и присвойте ей начальное значение RED, имитируя включение красного света. После этого выведите значение этой переменной на экран.
 */

/*
 * // JavaRush
 * Требования:
 * • В программе должно быть объявлено перечисление (enum) с именем TrafficSignalState.
 * • Перечисление TrafficSignalState должно содержать ровно три значения: RED, YELLOW и GREEN.
 * • В методе main необходимо создать переменную типа TrafficSignalState.
 * • Созданной переменной типа TrafficSignalState в методе main должно быть присвоено значение RED.
 * • Значение переменной типа TrafficSignalState должно быть выведено на экран.
 */

/*
 * // JavaRush
 * Черновик:
 * package ru.javarush.java.core.level10.task13;
 *
 * // Перечисление состояний светофора.
 * // Содержит ровно три значения: RED, YELLOW и GREEN.
 *
 *
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Создаём переменную типа TrafficSignalState и задаём начальное значение RED
 *
 *
 *         // Выводим текущее состояние светофора на экран
 *
 *     }
 * }
 */

// JavaRush
package ru.javarush.java.core.level10.task13;

// Перечисление состояний светофора.
// Содержит ровно три значения: RED, YELLOW и GREEN.
enum TrafficSignalState {
    RED,
    YELLOW,
    GREEN
}

public class Solution {
    public static void main(String[] args) {
        // Создаём переменную типа TrafficSignalState и задаём начальное значение RED
        TrafficSignalState currentState = TrafficSignalState.RED;

        // Выводим текущее состояние светофора на экран
        System.out.println(currentState);
    }
}

/*
 * // JavaRush
 * Правильное решение:
 * // Author: JavaRush's team
 * package ru.javarush.java.core.level10.task13;
 *
 * // Перечисление состояний светофора.
 * // Содержит ровно три значения: RED, YELLOW и GREEN.
 * enum TrafficSignalState {
 *     RED,    // красный
 *     YELLOW, // жёлтый
 *     GREEN   // зелёный
 * }
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Создаём переменную типа TrafficSignalState и задаём начальное значение RED
 *         TrafficSignalState currentState = TrafficSignalState.RED;
 *
 *         // Выводим текущее состояние светофора на экран
 *         System.out.println(currentState);
 *     }
 * }
 */