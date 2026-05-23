/*
 * Authors: JavaRush's team, CodeGym's team, Altavista360
 * Version: 1.0.0
 */

/*
 * // JavaRush
 * Задача: Гибкая система оплаты в магазине 💰
 * Ссылка: https://javarush.com/tasks/ru.javarush.java.core.level19.task12
 */

/*
 * // CodeGym
 * Task: Flexible payment system in a store 💰
 * Link: https://codegym.cc/tasks/en.codegym.java.core.level19.task12
 */

/*
 * // JavaRush
 * Условие:
 * Вообразите, что вы создаете гибкую систему обработки платежей для современного магазина. Каждый платеж проходит этап обработки, но детали этого процесса уникальны для каждого способа оплаты.
 * Вам нужно создать абстрактный класс Payment с одним абстрактным методом void process(), который будет символизировать этот этап обработки.
 * Затем реализуйте два конкретных способа оплаты: класс CashPayment (для наличных) и класс OnlinePayment (для онлайн-переводов). Оба класса должны наследовать Payment и каждый по-своему реализовать метод process(): пусть CashPayment выводит на экран "Оплата наличными", а OnlinePayment — "Онлайн-оплата".
 * Для демонстрации мощи вашей системы, в методе main создайте массив, способный хранить объекты типа Payment. В этот массив добавьте по одному экземпляру CashPayment и OnlinePayment. После этого пройдитесь циклом по всему массиву и для каждого платежа вызовите метод process(). В результате вы должны увидеть на экране оба сообщения, подтверждающие успешную обработку каждого типа платежа.
 * Оплата наличными
 * Онлайн-оплата
 */

/*
 * // JavaRush
 * Требования:
 * • В программе должен быть создан абстрактный класс с именем Payment.
 * • В абстрактном классе Payment должен быть объявлен абстрактный метод void process().
 * • Должен быть создан класс CashPayment, который наследует Payment и реализует метод process() так, чтобы он выводил на экран "Оплата наличными".
 * • Должен быть создан класс OnlinePayment, который наследует Payment и реализует метод process() так, чтобы он выводил на экран "Онлайн-оплата".
 * • В методе main должен быть создан массив или коллекция, способная хранить объекты типа Payment.
 * • В массив Payment должны быть добавлены по одному экземпляру классов CashPayment и OnlinePayment.
 * • В методе main необходимо пройтись по массиву Payment с помощью цикла и для каждого элемента вызвать метод process().
 * • В результате работы программы на экране должны появиться строки "Оплата наличными" и "Онлайн-оплата".
 */

/*
 * // JavaRush
 * Черновик:
 * package ru.javarush.java.core.level19.task12;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Создаем массив базового типа Payment: можно хранить любые его наследники
 *         Payment[] payments = new Payment[] {
 *                 new CashPayment(),    // экземпляр оплаты наличными
 *                 new OnlinePayment()   // экземпляр онлайн-оплаты
 *         };
 *
 *         // Полиморфный вызов: для каждого объекта будет вызвана своя реализация process()
 *         for (Payment payment : payments) {
 *             payment.process();
 *         }
 *     }
 * }
 */

// JavaRush
package ru.javarush.java.core.level19.task12;

public class Solution {
    public static void main(String[] args) {
        // Создаем массив базового типа Payment: можно хранить любые его наследники
        Payment[] payments = new Payment[] {
                new CashPayment(),    // экземпляр оплаты наличными
                new OnlinePayment()   // экземпляр онлайн-оплаты
        };

        // Полиморфный вызов: для каждого объекта будет вызвана своя реализация process()
        for (Payment payment : payments) {
            payment.process();
        }
    }
}

abstract class Payment {
    public abstract void process();
}

class CashPayment extends Payment {
    @Override
    public void process() {
        System.out.println("Оплата наличными");
    }
}

class OnlinePayment extends Payment {
    @Override
    public void process() {
        System.out.println("Онлайн-оплата");
    }
}

/*
 * // JavaRush
 * Правильное решение:
 * // Author: JavaRush's team
 * package ru.javarush.java.core.level19.task12;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Создаем массив базового типа Payment: можно хранить любые его наследники
 *         Payment[] payments = new Payment[] {
 *                 new CashPayment(),    // экземпляр оплаты наличными
 *                 new OnlinePayment()   // экземпляр онлайн-оплаты
 *         };
 *
 *         // Полиморфный вызов: для каждого объекта будет вызвана своя реализация process()
 *         for (Payment payment : payments) {
 *             payment.process();
 *         }
 *     }
 * }
 *
 * // Абстрактный класс, задающий общий контракт для всех способов оплаты
 * abstract class Payment {
 *     // Абстрактный метод обработки платежа — детали в подклассах
 *     public abstract void process();
 * }
 *
 * // Конкретная реализация оплаты наличными
 * class CashPayment extends Payment {
 *     @Override
 *     public void process() {
 *         System.out.println("Оплата наличными");
 *     }
 * }
 *
 * // Конкретная реализация онлайн-оплаты
 * class OnlinePayment extends Payment {
 *     @Override
 *     public void process() {
 *         System.out.println("Онлайн-оплата");
 *     }
 * }
 */