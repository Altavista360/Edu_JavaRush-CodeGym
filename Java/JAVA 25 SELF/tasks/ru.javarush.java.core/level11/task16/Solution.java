/*
 * Authors: JavaRush's team, CodeGym's team, Altavista360
 * Version: 1.0.0
 */

/*
 * // JavaRush
 * Задача: Золотая лихорадка: преобразование ввода игрока 💰
 * Ссылка: https://javarush.com/tasks/ru.javarush.java.core.level11.task16
 */

/*
 * // CodeGym
 * Task: Gold Rush: converting player input 💰
 * Link: https://codegym.cc/tasks/en.codegym.java.core.level11.task16
 */

/*
 * // JavaRush
 * Условие:
 * В вашей игре игроки иногда вводят текст вместо чисел, когда их просят ввести, например, количество золота, которое они хотят обменять. Вы хотите создать собственный удобный метод для преобразования строк в числа, который явно укажет на проблему, если ввод некорректен.
 * Создайте метод public static int convertToGoldAmount(String playerInput). Этот метод должен заявить, что он "пробрасывает" NumberFormatException. Внутри метода просто верните результат вызова Integer.parseInt(playerInput).
 * В вашем main методе, имитируя некорректный ввод, вызовите convertToGoldAmount("десять золота") или convertToGoldAmount("invalid_amount"). Оберните этот вызов в блок try-catch, чтобы поймать NumberFormatException. Если это исключение произойдет, выведите на экран сообщение: "Игрок ввел неверное значение. Ошибка преобразования числа." Это покажет, как вы можете перехватывать и обрабатывать исключения, генерируемые вашими собственными методами.
 */

/*
 * // JavaRush
 * Требования:
 * • Метод convertToGoldAmount должен быть объявлен с модификатором throws NumberFormatException.
 * • Метод convertToGoldAmount должен возвращать результат вызова Integer.parseInt(playerInput).
 * • В методе main вызов convertToGoldAmount с некорректной строкой должен быть обернут в блок try-catch.
 * • В блоке catch при перехвате NumberFormatException должно выводиться сообщение "Игрок ввел неверное значение. Ошибка преобразования числа."
 */

/*
 * // JavaRush
 * Черновик:
 * package ru.javarush.java.core.level11.task16;
 *
 * public class Solution {
 *
 *     // Метод для преобразования строки в число с пробросом исключения NumberFormatException
 *     public static int convertToGoldAmount(String playerInput)  {
 *         // Используем Integer.parseInt для преобразования строки в число
 *
 *     }
 *
 *     public static void main(String[] args) {
 *         // Пробуем преобразовать некорректную строку в число
 *
 *
 *         // Обрабатываем исключение и выводим сообщение об ошибке
 *
 *     }
 * }
 */

// JavaRush
package ru.javarush.java.core.level11.task16;

public class Solution {

    // Метод для преобразования строки в число с пробросом исключения NumberFormatException
    public static int convertToGoldAmount(String playerInput) throws NumberFormatException {
        // Используем Integer.parseInt для преобразования строки в число
        return Integer.parseInt(playerInput);
    }

    public static void main(String[] args) {
        try {
            // Пробуем преобразовать некорректную строку в число
            convertToGoldAmount("гора золота и маленькая тележка");
        } catch (NumberFormatException e) {
            // Обрабатываем исключение и выводим сообщение об ошибке
            System.out.println("Игрок ввел неверное значение. Ошибка преобразования числа.");
        }
    }
}

/*
 * // JavaRush
 * Правильное решение:
 * // Author: JavaRush's team
 * package ru.javarush.java.core.level11.task16;
 *
 * public class Solution {
 *
 *     // Метод для преобразования строки в число с пробросом исключения NumberFormatException
 *     public static int convertToGoldAmount(String playerInput) throws NumberFormatException {
 *         // Используем Integer.parseInt для преобразования строки в число
 *         return Integer.parseInt(playerInput);
 *     }
 *
 *     public static void main(String[] args) {
 *         try {
 *             // Пробуем преобразовать некорректную строку в число
 *             int goldAmount = convertToGoldAmount("десять золота");
 *             System.out.println("Количество золота: " + goldAmount);
 *         } catch (NumberFormatException e) {
 *             // Обрабатываем исключение и выводим сообщение об ошибке
 *             System.out.println("Игрок ввел неверное значение. Ошибка преобразования числа.");
 *         }
 *     }
 * }
 */