/*
 * Authors: JavaRush's team, CodeGym's team, Altavista360
 * Version: 1.0.0
 */

/*
 * // JavaRush
 * Задача: Управление цифровой библиотекой: кто что может делать 🏛️
 * Ссылка: https://javarush.com/tasks/ru.javarush.java.core.level15.task08
 */

/*
 * // CodeGym
 * Task: Managing a digital library: who can do what 🏛️
 * Link: https://codegym.cc/tasks/en.codegym.java.core.level15.task08
 */

/*
 * // JavaRush
 * Условие:
 * Вы – управляющий цифровой библиотекой, и разные задачи требуют разных уровней доступа. Некоторые операции доступны всем, другие – только сотрудникам или внутри системы, а некоторые – строго конфиденциальны и доступны только главному управляющему.
 * Создайте класс DigitalLibraryManager. Внутри этого класса определите четыре метода, каждый со своим модификатором доступа, имитируя различные уровни задач:
 * • public void announceOpening(): Этот метод должен быть доступен всем и выводить сообщение "Библиотека открыта для посетителей!".
 * • protected void conductStaffMeeting(): Этот метод предназначен только для сотрудников библиотеки и их потомков, выводя "Проведено собрание персонала библиотеки.".
 * • void manageBookInventory(): Этот метод без модификатора доступа (package-private) предназначен для внутренних операций внутри вашего библиотечного модуля, выводя "Инвентаризация книг завершена.".
 * • private void handleFinancialAudits(): Этот метод должен быть строго приватным, доступным только внутри самого класса DigitalLibraryManager (как секретные финансовые операции), выводя "Финансовый аудит успешно завершен.".
 * В вашем классе Solution (который должен быть в том же пакете, что и DigitalLibraryManager), создайте объект DigitalLibraryManager. Попробуйте вызвать все четыре метода у этого объекта.
 * Вы увидите, что программа успешно скомпилируется и выполнит announceOpening(), conductStaffMeeting() и manageBookInventory(). Однако, когда вы попытаетесь вызвать handleFinancialAudits(), компилятор выдаст ошибку, потому что это строго приватная операция, не предназначенная для вызова извне класса, демонстрируя разные уровни доступа в действии.
 */

/*
 * // JavaRush
 * Требования:
 * • Необходимо создать класс с именем DigitalLibraryManager.
 * • В классе DigitalLibraryManager должен быть метод public void announceOpening(), который выводит "Библиотека открыта для посетителей!".
 * • В классе DigitalLibraryManager должен быть метод protected void conductStaffMeeting(), который выводит "Проведено собрание персонала библиотеки.".
 * • В классе DigitalLibraryManager должен быть метод void manageBookInventory(), который выводит "Инвентаризация книг завершена.".
 * • В классе DigitalLibraryManager должен быть метод private void handleFinancialAudits(), который выводит "Финансовый аудит успешно завершен.".
 * • Необходимо создать класс Solution в том же пакете, что и DigitalLibraryManager.
 * • В классе Solution необходимо создать объект класса DigitalLibraryManager.
 * • В классе Solution необходимо попытаться вызвать у объекта DigitalLibraryManager методы announceOpening(), conductStaffMeeting(), manageBookInventory() и handleFinancialAudits().
 * • Компиляция должна завершиться ошибкой при попытке вызвать метод handleFinancialAudits() из класса Solution, так как этот метод имеет private-доступ.
 */

/*
 * // JavaRush
 * Черновик:
 * package ru.javarush.java.core.level15.task08;
 *
 * // Класс Solution находится в том же пакете (default package), что и DigitalLibraryManager
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Создаем объект управляющего цифровой библиотекой
 *         DigitalLibraryManager manager = new DigitalLibraryManager();
 *
 *         // Вызов public-метода — доступен всем
 *         manager.announceOpening();
 *
 *         // Вызов protected-метода — доступен в том же пакете (и в подклассах)
 *         manager.conductStaffMeeting();
 *
 *         // Вызов package-private метода — доступен в том же пакете
 *         manager.manageBookInventory();
 *
 *         // Попытка вызова private-метода приведет к ошибке компиляции,
 *         manager.handleFinancialAudits();
 *     }
 * }
 */

// JavaRush
package ru.javarush.java.core.level15.task08;

// Класс Solution находится в том же пакете (default package), что и DigitalLibraryManager
public class Solution {
    public static void main(String[] args) {
        // Создаем объект управляющего цифровой библиотекой
        DigitalLibraryManager manager = new DigitalLibraryManager();

        // Вызов public-метода — доступен всем
        manager.announceOpening();

        // Вызов protected-метода — доступен в том же пакете (и в подклассах)
        manager.conductStaffMeeting();

        // Вызов package-private метода — доступен в том же пакете
        manager.manageBookInventory();

        // Попытка вызова private-метода приведет к ошибке компиляции,
        manager.handleFinancialAudits();
    }
}

/*
 * // JavaRush
 * Правильное решение:
 * // Author: JavaRush's team
 * package ru.javarush.java.core.level15.task08;
 *
 * // Класс Solution находится в том же пакете (default package), что и DigitalLibraryManager
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Создаем объект управляющего цифровой библиотекой
 *         DigitalLibraryManager manager = new DigitalLibraryManager();
 *
 *         // Вызов public-метода — доступен всем
 *         manager.announceOpening();
 *
 *         // Вызов protected-метода — доступен в том же пакете (и в подклассах)
 *         manager.conductStaffMeeting();
 *
 *         // Вызов package-private метода — доступен в том же пакете
 *         manager.manageBookInventory();
 *
 *         // Попытка вызова private-метода приведет к ошибке компиляции,
 *         manager.handleFinancialAudits();
 *     }
 * }
 */