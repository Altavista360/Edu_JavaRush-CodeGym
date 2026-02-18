/*
 * Authors: JavaRush's team, CodeGym's team, Altavista360
 * Version: 1.0.0
 */

/*
 * // JavaRush
 * Задача: Открытый реестр жителей деревни 🏡
 * Ссылка: https://javarush.com/tasks/ru.javarush.java.core.level08.task17
 */

/*
 * // CodeGym
 * Task: Open registry of village residents 🏡
 * Link: https://codegym.cc/tasks/en.codegym.java.core.level08.task17
 */

/*
 * // JavaRush
 * Условие:
 * Представьте, что вы создаете самый простой открытый реестр для жителей деревни, где имя каждого человека должно быть доступно для прямого просмотра и изменения всеми желающими. Ваша задача — разработать класс VillageResident, который будет иметь публичное поле residentName типа String. Это поле должно быть прямо видно и изменяемо из любой точки вашей программы, как информация на доске объявлений.
 * В главной деревенской площади, в методе main, создайте запись для нового жителя: newVillager = new VillageResident(). Затем прямо и без стеснения присвойте его полю residentName значение "Иван" и немедленно выведите это имя на экран, чтобы все убедились, что запись успешно создана и доступна.
 */

/*
 * // JavaRush
 * Требования:
 * • В программе должен быть создан класс с именем VillageResident.
 * • Класс VillageResident должен содержать публичное поле residentName типа String.
 * • Поле residentName должно быть доступно для чтения и изменения из любой части программы (используется модификатор public).
 * • В методе main должен быть создан объект класса VillageResident и сохранён в переменную newVillager.
 * • В методе main полю residentName объекта newVillager должно быть присвоено значение "Иван".
 * • В методе main значение поля residentName объекта newVillager должно быть выведено на экран.
 */

/*
 * // JavaRush
 * Черновик:
 * package ru.javarush.java.core.level08.task17;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Создаем объект класса VillageResident
 *         VillageResident newVillager = new VillageResident();
 *
 *         // Прямо присваиваем значение "Иван" полю residentName
 *         newVillager.residentName = "Иван";
 *
 *         // Выводим значение поля residentName на экран
 *         System.out.println(newVillager.residentName);
 *     }
 * }
 *
 * // Класс VillageResident с публичным полем residentName
 */

// JavaRush
package ru.javarush.java.core.level08.task17;

public class Solution {
    public static void main(String[] args) {
        // Создаем объект класса VillageResident
        VillageResident newVillager = new VillageResident();

        // Прямо присваиваем значение "Иван" полю residentName
        newVillager.residentName = "Иван";

        // Выводим значение поля residentName на экран
        System.out.println(newVillager.residentName);
    }
}

// Класс VillageResident с публичным полем residentName
class VillageResident {
    public String residentName;

/*
 * // JavaRush
 * Правильное решение:
 * // Author: JavaRush's team
 * package ru.javarush.java.core.level08.task17;
 *
 * public class Solution {
 *     public static void main(String[] args) {
 *         // Создаем объект класса VillageResident
 *         VillageResident newVillager = new VillageResident();
 *
 *         // Прямо присваиваем значение "Иван" полю residentName
 *         newVillager.residentName = "Иван";
 *
 *         // Выводим значение поля residentName на экран
 *         System.out.println(newVillager.residentName);
 *     }
 * }
 *
 * // Класс VillageResident с публичным полем residentName
 * class VillageResident {
 *     // Публичное поле residentName, доступное для чтения и изменения
 *     public String residentName;
 * }
 */