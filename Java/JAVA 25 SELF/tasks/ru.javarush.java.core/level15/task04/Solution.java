/*
 * Authors: JavaRush's team, CodeGym's team, Altavista360
 * Version: 1.0.0
 */

/*
 * // JavaRush
 * Задача: Неизменяемые бирки товаров на складе 🏷️
 * Ссылка: https://javarush.com/tasks/ru.javarush.java.core.level15.task04
 */

/*
 * // CodeGym
 * Task: Immutable product tags in the warehouse 🏷️
 * Link: https://codegym.cc/tasks/en.codegym.java.core.level15.task04
 */

/*
 * // JavaRush
 * Условие:
 * Вы разрабатываете систему учёта товаров для склада. Каждый товар имеет уникальный идентификатор и наименование. После того как товар попадает на склад, его идентификатор и название не должны меняться – это как нестираемая бирка. Вы, однако, должны иметь возможность посмотреть эти данные.
 * Создайте класс Product. Внутри него определите два приватных поля: productID типа int и productName типа String.
 * Ваша задача — реализовать для этих полей только "окошки для просмотра" – публичные геттеры: getProductID() и getProductName(). Сеттеры для этих полей создавать не нужно, так как их значения после создания объекта не должны изменяться.
 * Добавьте публичный конструктор, который позволит установить productID и productName при создании нового объекта Product.
 * В классе Solution создайте экземпляр Product, например, с ID 101 и названием "Молоко". Затем используйте методы getProductID() и getProductName() для того, чтобы вывести эти данные на экран. Попробуйте также изменить поля productID или productName напрямую, как вы делали это с Person в предыдущих задачах — вы должны увидеть, что это невозможно, поскольку для них нет публичных сеттеров, и они защищены от прямого доступа.
 */

/*
 * // JavaRush
 * Требования:
 * • В классе Product должны быть определены два приватных поля: productID типа int и productName типа String.
 * • В классе Product должны быть реализованы публичные методы getProductID() и getProductName(), которые возвращают значения соответствующих полей.
 * • В классе Product не должно быть публичных сеттеров для полей productID и productName, чтобы исключить возможность их изменения после создания объекта.
 * • Класс Product должен иметь публичный конструктор, принимающий два параметра — productID и productName — и инициализирующий соответствующие поля.
 * • В классе Solution необходимо создать объект Product с конкретными значениями (например, 101 и "Молоко") и вывести значения его полей на экран с помощью методов getProductID() и getProductName().
 * • Попытка изменить значения полей productID или productName напрямую или через сеттеры должна быть невозможна, так как поля приватные и сеттеры отсутствуют.
 */

/*
 * // JavaRush
 * Черновик:
 * package ru.javarush.java.core.level15.task04;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Создаём товар с ID 101 и названием "Молоко"
 *         Product product = new Product(101, "Молоко");
 *
 *         // Выводим данные через геттеры
 *         System.out.println(product.getProductID());
 *         System.out.println(product.getProductName());
 *
 *         // Попытки изменить поля напрямую или через сеттеры невозможны:
 *         product.productID = 202;          // ошибка компиляции: поле private
 *         product.productName = "Кефир";    // ошибка компиляции: поле private
 *         product.setProductID(202);        // ошибка компиляции: метода нет
 *         product.setProductName("Кефир");  // ошибка компиляции: метода нет
 *     }
 * }
 */

// JavaRush
package ru.javarush.java.core.level15.task04;

public class Solution {
    public static void main(String[] args) {
        // Создаём товар с ID 101 и названием "Молоко"
        Product product = new Product(101, "Молоко");

        // Выводим данные через геттеры
        System.out.println(product.getProductID());
        System.out.println(product.getProductName());

        // Попытки изменить поля напрямую или через сеттеры невозможны:
        product.productID = 202;          // ошибка компиляции: поле private
        product.productName = "Кефир";    // ошибка компиляции: поле private
        product.setProductID(202);        // ошибка компиляции: метода нет
        product.setProductName("Кефир");  // ошибка компиляции: метода нет
    }
}

/*
 * // JavaRush
 * Правильное решение:
 * // Author: JavaRush's team
 * package ru.javarush.java.core.level15.task04;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Создаём товар с ID 101 и названием "Молоко"
 *         Product product = new Product(101, "Молоко");
 *
 *         // Выводим данные через геттеры
 *         System.out.println(product.getProductID());
 *         System.out.println(product.getProductName());
 *
 *         // Попытки изменить поля напрямую или через сеттеры невозможны:
 *         product.productID = 202;          // ошибка компиляции: поле private
 *         product.productName = "Кефир";    // ошибка компиляции: поле private
 *         product.setProductID(202);        // ошибка компиляции: метода нет
 *         product.setProductName("Кефир");  // ошибка компиляции: метода нет
 *     }
 * }
 */