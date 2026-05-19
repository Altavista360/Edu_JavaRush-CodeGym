/*
 * Authors: JavaRush's team, CodeGym's team, Altavista360
 * Version: 1.0.0
 */

/*
 * // JavaRush
 * Задача: Разрабатываем модуль онлайн-оплаты 💳
 * Ссылка: https://javarush.com/tasks/ru.javarush.java.core.level19.task04
 */

/*
 * // CodeGym
 * Task: Developing an online payment module 💳
 * Link: https://codegym.cc/tasks/en.codegym.java.core.level19.task04
 */

/*
 * // JavaRush
 * Условие:
 * Вы разрабатываете важный модуль для обработки платежей в крупном интернет-магазине. Все платежи, независимо от способа, имеют общие этапы (например, информация о начале обработки), но их окончательное "исполнение" всегда уникально.
 * Вам нужно создать абстрактный класс Payment. Он должен содержать абстрактный метод process(), который будет отвечать за специфику обработки каждого платежа, но его реализация будет оставлена потомкам. Кроме того, добавьте в Payment обычный, неабстрактный метод printInfo(), который будет универсально выводить сообщение "Платёж обрабатывается", ведь эта информация актуальна для любого платежа.
 * Далее, создайте класс PaypalPayment, который будет конкретным воплощением Payment. Внутри PaypalPayment реализуйте метод process() так, чтобы он явно сообщал: "Обработка платежа через PayPal".
 * Чтобы проверить работу вашей системы, в методе main создайте экземпляр PaypalPayment и последовательно вызовите у него оба метода: сначала printInfo(), а затем process(). Это позволит вам увидеть как общую информацию о платеже, так и детали его специфической обработки.
 */

/*
 * // JavaRush
 * Требования:
 * • В программе должен быть создан абстрактный класс с именем Payment.
 * • В классе Payment должен быть объявлен абстрактный метод process() без реализации.
 * • В классе Payment должен быть реализован обычный (неабстрактный) метод printInfo(), который выводит на экран сообщение "Платёж обрабатывается".
 * • Должен быть создан класс PaypalPayment, который наследует класс Payment.
 * • В классе PaypalPayment должен быть реализован метод process(), который выводит на экран сообщение "Обработка платежа через PayPal".
 * • В методе main необходимо создать объект типа PaypalPayment и вызвать у него методы printInfo() и process() в указанном порядке.
 */

/*
 * // JavaRush
 * Черновик:
 * package ru.javarush.java.core.level19.task04;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Создаем платеж PayPal и последовательно вызываем общую и специфичную логику
 *         PaypalPayment payment = new PaypalPayment();
 *         payment.printInfo();   // сначала общая информация
 *         payment.process();     // затем специфическая обработка
 *     }
 * }
 */

// JavaRush
package ru.javarush.java.core.level19.task04;

abstract class Payment {
    public void printInfo() {
        System.out.println("Платёж обрабатывается");
    }

    public abstract void process();
}

class PaypalPayment extends Payment {
    @Override
    public void process() {
        System.out.println("Обработка платежа через PayPal");
    }
}

public class Solution {
    public static void main(String[] args) {
        // Создаем платеж PayPal и последовательно вызываем общую и специфичную логику
        PaypalPayment payment = new PaypalPayment();
        payment.printInfo();   // сначала общая информация
        payment.process();     // затем специфическая обработка
    }
}

/*
 * // JavaRush
 * Правильное решение:
 * // Author: JavaRush's team
 * package ru.javarush.java.core.level19.task04;
 *
 * // Абстрактный класс, описывающий общий контракт для любых платежей
 * abstract class Payment {
 *     // Универсальный метод: одинаков для всех видов платежей
 *     public void printInfo() {
 *         System.out.println("Платёж обрабатывается");
 *     }
 *
 *     // Абстрактный метод: конкретика обработки у каждого вида своя
 *     public abstract void process();
 * }
 *
 * // Конкретная реализация платежа через PayPal
 * class PaypalPayment extends Payment {
 *     @Override
 *     public void process() {
 *         System.out.println("Обработка платежа через PayPal");
 *     }
 * }
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Создаем платеж PayPal и последовательно вызываем общую и специфичную логику
 *         PaypalPayment payment = new PaypalPayment();
 *         payment.printInfo();   // сначала общая информация
 *         payment.process();     // затем специфическая обработка
 *     }
 * }
 */