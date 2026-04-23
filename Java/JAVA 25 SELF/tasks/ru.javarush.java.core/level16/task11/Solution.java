/*
 * Authors: JavaRush's team, CodeGym's team, Altavista360
 * Version: 1.0.0
 */

/*
 * // JavaRush
 * Задача: Производственная линия: объявление о начале работы 🏭
 * Ссылка: https://javarush.com/tasks/ru.javarush.java.core.level16.task11
 */

/*
 * // CodeGym
 * Task: Production Line: Start Announcement 🏭
 * Link: https://codegym.cc/tasks/en.codegym.java.core.level16.task11
 */

/*
 * // JavaRush
 * Условие:
 * Представьте, что вы управляете сложной производственной линией. Когда вы запускаете определённую операцию подсчёта, система должна немедленно объявить о начале процесса. Это объявление является разовой задачей, которая актуальна только в момент запуска операции.
 * Сначала создайте класс ProductionCounter с методом void startCountOperation(). Внутри метода startCountOperation() создайте объект интерфейса Runnable с помощью анонимного класса. Пусть метод run() этого анонимного класса выводит на экран сообщение "Счётчик запущен". Вызовите метод run() для созданного объекта прямо внутри startCountOperation().
 * В главном методе вашей программы (main) создайте объект класса ProductionCounter и вызовите его метод startCountOperation(), чтобы инициировать процесс и услышать объявление.
 */

/*
 * // JavaRush
 * Требования:
 * • Необходимо создать публичный класс с именем ProductionCounter.
 * • Класс ProductionCounter должен содержать публичный метод void startCountOperation().
 * • Внутри метода startCountOperation() должен быть создан объект интерфейса Runnable с помощью анонимного класса.
 * • В анонимном классе необходимо переопределить метод run(), чтобы он выводил на экран строку "Счётчик запущен".
 * • Метод run() созданного анонимного класса должен быть вызван непосредственно внутри метода startCountOperation().
 * • В методе main программы необходимо создать объект класса ProductionCounter и вызвать у него метод startCountOperation().
 */

/*
 * // JavaRush
 * Черновик:
 * package ru.javarush.java.core.level16.task11;
 *
 * public class ProductionCounter {
 *
 *     // Публичный метод, в котором создаём анонимный класс Runnable и вызываем его run()
 *     public void startCountOperation() {
 *         // Создаём объект интерфейса Runnable с помощью анонимного класса
 *
 *
 *         // Вызываем метод run() прямо внутри startCountOperation()
 *
 *     }
 *
 *     public static void main(String[] args) {
 *         // Создаём объект ProductionCounter и запускаем операцию подсчёта
 *         ProductionCounter counter = new ProductionCounter();
 *         counter.startCountOperation();
 *     }
 * }
 */

// JavaRush
package ru.javarush.java.core.level16.task11;

public class ProductionCounter {

    // Публичный метод, в котором создаём анонимный класс Runnable и вызываем его run()
    public void startCountOperation() {
        // Создаём объект интерфейса Runnable с помощью анонимного класса
        Runnable announcement = new Runnable() {
            @Override
            public void run() {
                System.out.println("Счётчик запущен");
            }
        };

        // Вызываем метод run() прямо внутри startCountOperation()
        announcement.run();
    }

    public static void main(String[] args) {
        // Создаём объект ProductionCounter и запускаем операцию подсчёта
        ProductionCounter counter = new ProductionCounter();
        counter.startCountOperation();
    }
}

/*
 * // JavaRush
 * Правильное решение:
 * // Author: JavaRush's team
 * package ru.javarush.java.core.level16.task11;
 *
 * public class ProductionCounter {
 *
 *     // Публичный метод, в котором создаём анонимный класс Runnable и вызываем его run()
 *     public void startCountOperation() {
 *         // Создаём объект интерфейса Runnable с помощью анонимного класса
 *         Runnable announcement = new Runnable() {
 *             @Override
 *             public void run() {
 *                 // Одноразовое объявление о запуске операции
 *                 System.out.println("Счётчик запущен");
 *             }
 *         };
 *
 *         // Вызываем метод run() прямо внутри startCountOperation()
 *         announcement.run();
 *     }
 *
 *     public static void main(String[] args) {
 *         // Создаём объект ProductionCounter и запускаем операцию подсчёта
 *         ProductionCounter counter = new ProductionCounter();
 *         counter.startCountOperation();
 *     }
 * }
 */