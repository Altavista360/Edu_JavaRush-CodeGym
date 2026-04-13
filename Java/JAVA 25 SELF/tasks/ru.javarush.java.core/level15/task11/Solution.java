/*
 * Authors: JavaRush's team, CodeGym's team, Altavista360
 * Version: 1.0.0
 */

/*
 * // JavaRush
 * Задача: Управление умной лампой: Включить/Выключить 💡
 * Ссылка: https://javarush.com/tasks/ru.javarush.java.core.level15.task11
 */

/*
 * // CodeGym
 * Task: Smart Lamp Control: Turn On/Turn Off 💡
 * Link: https://codegym.cc/tasks/en.codegym.java.core.level15.task11
 */

/*
 * // JavaRush
 * Условие:
 * Вы работаете над системой "умный дом" и ваша первая задача — управлять виртуальной лампой. Вам нужно иметь возможность её включать, выключать и узнавать, горит ли она сейчас.
 * Создайте класс SmartLamp. Внутри него объявите приватное поле isCurrentlyOn типа boolean, которое будет хранить состояние лампы (true, если включена, false, если выключена). Реализуйте геттер isCurrentlyOn() (обратите внимание на соглашение именования для boolean-геттеров в Java) и сеттер setCurrentlyOn(boolean newState) для этого поля. Добавьте конструктор для начальной установки состояния лампы, например, по умолчанию выключено.
 * В классе Solution создайте объект SmartLamp. Затем используйте метод setCurrentlyOn() для того, чтобы "включить" лампу, передав ему true. После этого выведите на экран результат вызова метода isCurrentlyOn(), чтобы убедиться, что лампа теперь "горит".
 */

/*
 * // JavaRush
 * Требования:
 * • В классе SmartLamp должно быть объявлено приватное поле isCurrentlyOn типа boolean, которое хранит состояние лампы.
 * • В классе SmartLamp должен быть реализован публичный геттер с именем isCurrentlyOn(), возвращающий текущее значение поля isCurrentlyOn.
 * • В классе SmartLamp должен быть реализован публичный сеттер setCurrentlyOn(boolean newState), который изменяет значение поля isCurrentlyOn.
 * • Класс SmartLamp должен содержать конструктор, устанавливающий начальное состояние лампы (по умолчанию выключено, то есть isCurrentlyOn = false).
 * • В классе Solution должен быть создан объект SmartLamp, после чего должен быть вызван метод setCurrentlyOn(true) для включения лампы.
 * • В классе Solution должен быть вызван метод isCurrentlyOn() для объекта SmartLamp, и его результат должен быть выведен на экран.
 */

/*
 * // JavaRush
 * Черновик:
 * package ru.javarush.java.core.level15.task11;
 *
 * // Класс Solution — точка входа в программу
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Создаем объект "умной лампы" (по умолчанию выключена)
 *         SmartLamp lamp = new SmartLamp();
 *
 *         // Включаем лампу
 *         lamp.setCurrentlyOn(true);
 *
 *         // Проверяем состояние через boolean-геттер и выводим результат
 *         System.out.println(lamp.isCurrentlyOn());
 *     }
 * }
 *
 * // Класс SmartLamp инкапсулирует состояние лампы
 */

// JavaRush
package ru.javarush.java.core.level15.task11;

// Класс Solution — точка входа в программу
public class Solution {
    public static void main(String[] args) {
        // Создаем объект "умной лампы" (по умолчанию выключена)
        SmartLamp lamp = new SmartLamp();

        // Включаем лампу
        lamp.setCurrentlyOn(true);

        // Проверяем состояние через boolean-геттер и выводим результат
        System.out.println(lamp.isCurrentlyOn());
    }
}

// Класс SmartLamp инкапсулирует состояние лампы
class SmartLamp {
    private boolean isCurrentlyOn;

    public SmartLamp() {
        this.isCurrentlyOn = false;
    }

    public boolean isCurrentlyOn() {
        return isCurrentlyOn;
    }

    public void setCurrentlyOn(boolean newState) {
        this.isCurrentlyOn = newState;
    }
}

/*
 * // JavaRush
 * Правильное решение:
 * // Author: JavaRush's team
 * package ru.javarush.java.core.level15.task11;
 *
 * // Класс Solution — точка входа в программу
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Создаем объект "умной лампы" (по умолчанию выключена)
 *         SmartLamp lamp = new SmartLamp();
 *
 *         // Включаем лампу
 *         lamp.setCurrentlyOn(true);
 *
 *         // Проверяем состояние через boolean-геттер и выводим результат
 *         System.out.println(lamp.isCurrentlyOn());
 *     }
 * }
 *
 * // Класс SmartLamp инкапсулирует состояние лампы
 * class SmartLamp {
 *     // Приватное поле хранит текущее состояние (включена/выключена)
 *     private boolean isCurrentlyOn;
 *
 *     // Конструктор: по умолчанию лампа выключена
 *     public SmartLamp() {
 *         this.isCurrentlyOn = false;
 *     }
 *
 *     // Правильный boolean-геттер по соглашению именования: начинается с "is"
 *     public boolean isCurrentlyOn() {
 *         return isCurrentlyOn;
 *     }
 *
 *     // Сеттер позволяет менять состояние лампы
 *     public void setCurrentlyOn(boolean newState) {
 *         this.isCurrentlyOn = newState;
 *     }
 * }
 */