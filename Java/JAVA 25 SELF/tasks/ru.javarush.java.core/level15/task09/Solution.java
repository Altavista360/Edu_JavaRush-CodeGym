/*
 * Authors: JavaRush's team, CodeGym's team, Altavista360
 * Version: 1.0.0
 */

/*
 * // JavaRush
 * Задача: Переименование товара на складе 🔄
 * Ссылка: https://javarush.com/tasks/ru.javarush.java.core.level15.task09
 */

/*
 * // CodeGym
 * Task: Renaming a product in inventory 🔄
 * Link: https://codegym.cc/tasks/en.codegym.java.core.level15.task09
 */

/*
 * // JavaRush
 * Условие:
 * Ваш складской учет развивается. Иногда случается, что товар получает новое название, и вам нужно иметь возможность обновить его в системе.
 * Создайте класс Product с приватным полем productName типа String и соответствующим геттером getProductName() и конструктором. Ваша задача — добавить в класс Product новый публичный метод-сеттер: setProductName(String newProductName). Этот метод позволит вам изменить значение приватного поля productName на новое.
 * В классе Solution создайте объект Product, например, изначально назвав его "Старый товар". Затем, используя ваш новый метод setProductName(), измените название этого товара на "Новый товар". После этого выведите обновлённое название товара на экран, используя метод getProductName(), чтобы убедиться, что изменение прошло успешно.
 */

/*
 * // JavaRush
 * Требования:
 * • В классе Product должно быть приватное поле productName типа String.
 * • Класс Product должен иметь конструктор, который принимает параметр productName и инициализирует соответствующее поле.
 * • В классе Product должен быть публичный метод getProductName(), возвращающий текущее значение поля productName.
 * • В классе Product должен быть публичный метод setProductName(String newProductName), который изменяет значение поля productName на переданное значение.
 * • В методе main класса Solution необходимо создать объект Product c названием "Старый товар", затем изменить его название на "Новый товар" с помощью метода setProductName.
 * • После изменения названия товара необходимо вывести новое название на экран с помощью метода getProductName().
 */

/*
 * // JavaRush
 * Черновик:
 * package ru.javarush.java.core.level15.task09;
 *
 * // Класс Solution — точка входа программы
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Создаем товар с исходным названием "Старый товар"
 *         Product product = new Product("Старый товар");
 *
 *         // Переименовываем товар на "Новый товар" с помощью сеттера
 *         product.setProductName("Новый товар");
 *
 *         // Выводим обновлённое название с помощью геттера
 *         System.out.println(product.getProductName());
 *     }
 * }
 *
 * // Класс Product инкапсулирует название товара
 * class Product {
 *
 * }
 */

// JavaRush
package ru.javarush.java.core.level15.task09;

// Класс Solution — точка входа программы
public class Solution {
    public static void main(String[] args) {
        // Создаем товар с исходным названием "Старый товар"
        Product product = new Product("Старый товар");

        // Переименовываем товар на "Новый товар" с помощью сеттера
        product.setProductName("Новый товар");

        // Выводим обновлённое название с помощью геттера
        System.out.println(product.getProductName());
    }
}

// Класс Product инкапсулирует название товара
class Product {
    private String productName;

    public Product(String productName) {
        this.productName = productName;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String newProductName) {
        this.productName = newProductName;
    }
}

/*
 * // JavaRush
 * Правильное решение:
 * // Author: JavaRush's team
 * package ru.javarush.java.core.level15.task09;
 *
 * // Класс Solution — точка входа программы
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Создаем товар с исходным названием "Старый товар"
 *         Product product = new Product("Старый товар");
 *
 *         // Переименовываем товар на "Новый товар" с помощью сеттера
 *         product.setProductName("Новый товар");
 *
 *         // Выводим обновлённое название с помощью геттера
 *         System.out.println(product.getProductName());
 *     }
 * }
 *
 * // Класс Product инкапсулирует название товара
 * class Product {
 *     // Приватное поле: название товара
 *     private String productName;
 *
 *     // Конструктор для инициализации названия товара
 *     public Product(String productName) {
 *         this.productName = productName;
 *     }
 *
 *     // Геттер: возвращает текущее название товара
 *     public String getProductName() {
 *         return productName;
 *     }
 *
 *     // Сеттер: изменяет название товара на новое
 *     public void setProductName(String newProductName) {
 *         this.productName = newProductName;
 *     }
 * }
 */