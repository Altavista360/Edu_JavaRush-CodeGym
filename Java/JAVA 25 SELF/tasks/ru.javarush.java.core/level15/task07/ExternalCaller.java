/*
 * Authors: JavaRush's team, CodeGym's team, Altavista360
 * Version: 1.0.0
 */

/*
 * // JavaRush
 * Задача: Внутренняя помощь в команде разработки 🤝
 * Ссылка: https://javarush.com/tasks/ru.javarush.java.core.level15.task07
 */

/*
 * // CodeGym
 * Task: Internal assistance within the development team 🤝
 * Link: https://codegym.cc/tasks/en.codegym.java.core.level15.task07
 */

/*
 * // JavaRush
 * Условие:
 * Представьте, что вы и ваша команда разрабатываете большой программный модуль. Внутри этого модуля есть несколько классов, которые должны «сотрудничать» и обмениваться определёнными внутренними функциями. Однако эти функции не предназначены для использования за пределами вашего модуля (пакета).
 * Ваша задача — создать два класса: ModuleHelper и ModuleMain. Убедитесь, что они находятся в одном и том же пакете (например, "com.mycompany.module"). В классе ModuleHelper реализуйте метод provideInternalAssistance(), не указывая при этом никакого модификатора доступа (что сделает его package-private). Пусть этот метод выводит на экран сообщение, например, "Предоставляю внутреннюю помощь модуля!".
 * В классе ModuleMain создайте объект ModuleHelper и вызовите у него метод provideInternalAssistance(). Ваша программа должна успешно скомпилироваться и выполнить этот вызов, демонстрируя, что классы в одном пакете имеют доступ к таким методам.
 * Для полноты эксперимента, если бы вы попытались вызвать provideInternalAssistance() из класса, находящегося в совершенно другом пакете, ваша программа не должна была бы скомпилироваться, что подтвердило бы её защиту от внешнего вмешательства.
 */

/*
 * // JavaRush
 * Требования:
 * • Классы ModuleHelper и ModuleMain должны быть объявлены внутри одного и того же пакета, например, com.mycompany.module.
 * • Метод provideInternalAssistance в классе ModuleHelper должен быть объявлен без модификатора доступа, то есть он должен быть package-private.
 * • Метод provideInternalAssistance должен выводить на экран сообщение "Предоставляю внутреннюю помощь модуля!".
 * • Класс ModuleMain должен создавать объект ModuleHelper и успешно вызывать у него метод provideInternalAssistance.
 * • Если попытаться вызвать метод provideInternalAssistance из класса, находящегося в другом пакете, программа не должна компилироваться.
 */

/*
 * // JavaRush
 * Черновик:
 * package ru.javarush.java.core.level15.task07.other;
 *
 * import ru.javarush.java.core.level15.task07.main.ModuleHelper;
 *
 * public class ExternalCaller {
 *     public static void main(String[] args) {
 *         // Ошибка компиляции: метод недоступен из другого пакета
 *
 *     }
 * }
 */

// JavaRush
package ru.javarush.java.core.level15.task07.other;

import ru.javarush.java.core.level15.task07.main.ModuleHelper;

public class ExternalCaller {
    public static void main(String[] args) {
        ModuleHelper h = new ModuleHelper();
        h.provideInternalAssistance();
    }
}

/*
 * // JavaRush
 * Правильное решение:
 * // Author: JavaRush's team
 * package ru.javarush.java.core.level15.task07.other;
 *
 * import ru.javarush.java.core.level15.task07.main.ModuleHelper;
 *
 * public class ExternalCaller {
 *     public static void main(String[] args) {
 *         ModuleHelper h = new ModuleHelper();
 *         h.provideInternalAssistance(); // Ошибка компиляции: метод недоступен из другого пакета
 *     }
 * }
 */