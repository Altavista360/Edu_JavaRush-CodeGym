/**
 * @author JavaRush's team
 * @author CodeGym's team
 * @author Altavista360
 * @version 1.0.0
 */

/**
 * // JavaRush
 * Задача: Создание профиля пользователя 👤
 * @see <a href="https://javarush.com/tasks/ru.javarush.java.core.level01.task08">ru.javarush.java.core.level01.task08</a>
 */

/**
 * // CodeGym
 * Task: Creating a User Profile 👤
 * @see <a href="https://codegym.cc/tasks/en.codegym.java.core.level01.task08">en.codegym.java.core.level01.task08</a>
 */

/**
 * // JavaRush
 * Описание:
 * Вы создаете профиль пользователя в социальной сети. Объявите переменную типа String с именем userName и присвойте ей значение "Alice". Также, объявите переменную типа int с именем userAge со значением 20.
 * Затем, создайте переменную profileInfo типа String, в которую вы объедините имя и возраст в строку "Имя: Alice, Возраст: 20". Выведите значение profileInfo на экран.
 */

/**
 * // CodeGym
 * Description:
 * You are creating a user profile for a social network. Declare a variable of type String named userName and assign it the value "Alice". Also, declare a variable of type int named userAge with the value 20.
 * Then, create a profileInfo variable of type String that combines the name and age into the string "Name: Alice, Age: 20". Print the value of profileInfo to the console.
 */

/**
 * // JavaRush
 * Требования:
 * • В программе должна быть объявлена переменная типа String с именем userName.
 * • Переменной userName должно быть присвоено значение "Alice".
 * • В программе должна быть объявлена переменная типа int с именем userAge.
 * • Переменной userAge должно быть присвоено значение 20.
 * • В программе должна быть объявлена переменная типа String с именем profileInfo, в которую объединяются имя и возраст пользователя в виде строки "Имя: Alice, Возраст: 20".
 * • Программа должна вывести значение переменной profileInfo на экран.
 */

/**
 * // CodeGym
 * Requirements:
 * • The program must declare a variable of type String named userName.
 * • The variable userName must be assigned the value "Alice".
 * • The program must declare a variable of type int named userAge.
 * • The variable userAge must be assigned the value 20.
 * • The program must declare a variable of type String named profileInfo that combines the user's name and age as the string "Name: Alice, Age: 20".
 * • The program must print the value of the profileInfo variable to the console.
 */

/**
 * // JavaRush
 * Черновик:
 * package ru.javarush.java.core.level01.task08;
 *
 * public class Solution
 * {
 *     public static void main(String[] args)
 *     {
 *         // Объявляем переменную типа String для имени пользователя
 *
 *
 *         // Объявляем переменную типа int для возраста пользователя
 *
 *
 *         // Создаем строку, объединяющую имя и возраст пользователя
 *
 *
 *         // Выводим информацию о профиле на экран
 *
 *     }
 * }
 */

/**
 * // CodeGym
 * Draft:
 * package en.codegym.java.core.level01.task08;
 *
 * public class Solution
 * {
 *     public static void main(String[] args)
 *     {
 *         // Declare a String variable for the user's name
 *
 *
 *         // Declare an int variable for the user's age
 *
 *
 *         // Create a string that combines the user's name and age
 *
 *
 *         // Print the profile information to the console
 *
 *     }
 * }
 */

// JavaRush
package ru.javarush.java.core.level01.task08;

public class Solution
{
    public static void main(String[] args)
    {
        // Объявляем переменную типа String для имени пользователя
        String userName = "Alice";

        // Объявляем переменную типа int для возраста пользователя
        int userAge = 20;

        // Создаем строку, объединяющую имя и возраст пользователя
        String profileInfo = "Имя: " + userName + ", Возраст: " + userAge;

        // Выводим информацию о профиле на экран
        System.out.println (profileInfo);
    }
}

/*
// CodeGym
package en.codegym.java.core.level01.task08;

public class Solution
{
    public static void main(String[] args)
    {
        // Declare a String variable for the user's name
        String userName = "Alice";

        // Declare an int variable for the user's age
        int userAge = 20;

        // Create a string that combines the user's name and age
        String profileInfo = "Name: " + userName + ", Age: " + userAge;

        // Print the profile information to the console
        System.out.println (profileInfo);
    }
}
*/