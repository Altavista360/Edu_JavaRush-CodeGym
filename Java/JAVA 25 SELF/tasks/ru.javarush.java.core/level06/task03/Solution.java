/*
 * Authors: JavaRush's team, CodeGym's team, Altavista360
 * Version: 1.0.0
 */

/*
 * // JavaRush
 * Задача: Расшифровка древних рун 🔮
 * Ссылка: https://javarush.com/tasks/ru.javarush.java.core.level06.task03
 */

/*
 * // CodeGym
 * Task: Decoding Ancient Runes 🔮
 * Link: https://codegym.cc/tasks/en.codegym.java.core.level06.task03
 */

/*
 * // JavaRush
 * Условие:
 * Представьте, что вы — исследователь древних цивилизаций и обнаружили таинственную руну, которая выглядит как символ 'Z'. Чтобы понять её истинное значение, вам нужно узнать её числовой код в древней системе.
 * Объявите переменную char mysteryCharacter и присвойте ей этот загадочный символ 'Z'. Затем создайте переменную int decryptedCode и магически преобразуйте символ 'Z' в его соответствующее числовое значение (Unicode-код).
 * В конце выведите на экран результат вашего исследования: "Код символа 'Z': " за которым следует числовая тайна, которую вы раскрыли.
 */

/*
 * // JavaRush
 * Требования:
 * • В программе должна быть объявлена переменная типа char с именем mysteryCharacter.
 * • Переменной mysteryCharacter должен быть присвоен символ 'Z'.
 * • В программе должна быть объявлена переменная типа int с именем decryptedCode.
 * • Переменной decryptedCode должно быть присвоено числовое значение (Unicode-код) символа, хранящегося в mysteryCharacter.
 * • Программа должна вывести на экран строку "Код символа 'Z': " и числовое значение, содержащееся в переменной decryptedCode.
 */

/*
 * // JavaRush
 * Черновик:
 * package ru.javarush.java.core.level06.task03;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Объявляем переменную типа char для хранения загадочного символа руны
 *
 *
 *         // Преобразуем символ в его числовой код (Unicode) и сохраняем в переменную decryptedCode
 *
 *
 *         // Выводим результат исследования: строку и расшифрованный числовой код символа
 *
 *     }
 * }
 */

// JavaRush
package ru.javarush.java.core.level06.task03;

public class Solution {
    public static void main(String[] args) {
        // Объявляем переменную типа char для хранения загадочного символа руны
        char mysteryCharacter = 'Z';

        // Преобразуем символ в его числовой код (Unicode) и сохраняем в переменную decryptedCode
        int decryptedCode = mysteryCharacter;

        // Выводим результат исследования: строку и расшифрованный числовой код символа
        System.out.println("Код символа 'Z': " + decryptedCode);
    }
}

/*
 * // JavaRush
 * Правильное решение:
 * // Author: JavaRush's team
 * package ru.javarush.java.core.level06.task03;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Объявляем переменную типа char для хранения загадочного символа руны
 *         char mysteryCharacter = 'Z';
 *
 *         // Преобразуем символ в его числовой код (Unicode) и сохраняем в переменную decryptedCode
 *         int decryptedCode = mysteryCharacter;
 *
 *         // Выводим результат исследования: строку и расшифрованный числовой код символа
 *         System.out.println("Код символа 'Z': " + decryptedCode);
 *     }
 * }
 */