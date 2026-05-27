/*
 * Authors: JavaRush's team, CodeGym's team, Altavista360
 * Version: 1.0.0
 */

/*
 * // JavaRush
 * Задача: Расширяем менеджер задач для разных типов задач 🚀
 * Ссылка: https://javarush.com/tasks/ru.javarush.java.core.level19.task20
 */

/*
 * // CodeGym
 * Task: Extending the task manager for different task types 🚀
 * Link: https://codegym.cc/tasks/en.codegym.java.core.level19.task20
 */

/*
 * // JavaRush
 * Условие:
 * Ваша цель — сделать менеджер задач по-настоящему универсальным и легко расширяемым, способным обрабатывать самые разнообразные типы задач, сохраняя при этом общую, единую логику управления.
 * Продолжая развивать абстрактный класс Task с полем title и абстрактным методом complete(), теперь вам предстоит создать более специализированные его версии.
 * Реализуйте двух наследников: WorkTask, который будет иметь дополнительное поле deadline (срок выполнения), и HomeTask, который получит дополнительное поле location (место выполнения, например, "кухня" или "гараж").
 * Далее, чтобы обеспечить правильное хранение и управление, создайте интерфейс TaskRepository и класс TaskService, который будет работать исключительно с этим интерфейсом, не завися от конкретной реализации хранилища.
 * Добавьте в ваш репозиторий задачи обоих только что созданных типов, например, одну WorkTask и одну HomeTask. После этого вызовите соответствующий метод из TaskService для получения всей информации о задачах, а затем продемонстрируйте их выполнение.
 * Вся ваша программа должна безупречно работать с задачами обоих типов, при этом в логике TaskService и TaskRepository должны использоваться только высокоуровневые абстракции Task и TaskRepository, что и покажет истинную гибкость и расширяемость вашей системы.
 */

/*
 * // JavaRush
 * Требования:
 * • Должен быть реализован абстрактный класс Task с полем title и абстрактным методом complete().
 * • Должен быть создан класс WorkTask, наследующий Task, с дополнительным полем deadline.
 * • Должен быть создан класс HomeTask, наследующий Task, с дополнительным полем location.
 * • Должен быть объявлен интерфейс TaskRepository для хранения и управления задачами.
 * • Должен быть реализован класс TaskService, который работает только с интерфейсом TaskRepository и не зависит от его конкретной реализации.
 * • В репозиторий должны быть добавлены задачи обоих типов: хотя бы одна WorkTask и хотя бы одна HomeTask.
 * • Должен быть реализован метод TaskService, который получает и выводит информацию обо всех задачах из репозитория.
 * • Должно быть продемонстрировано выполнение задач (вызов метода complete() для каждой задачи) через логику TaskService.
 * • В TaskService и TaskRepository должны использоваться только абстракции (Task, TaskRepository), без упоминания конкретных типов задач или реализации репозитория.
 */

// JavaRush
package ru.javarush.java.core.level19.task20;

public class HomeTask extends Task {
    private final String location;

    public HomeTask(String title, String location) {
        super(title);
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    @Override
    public void complete() {
        System.out.println("Выполнена домашняя задача: \"" + title + "\" (место: " + location + ")");
    }

    @Override
    public String toString() {
        return "Домашняя задача — \"" + title + "\", место: " + location;
    }
}

/*
 * // JavaRush
 * Правильное решение:
 * // Author: JavaRush's team
 * package ru.javarush.java.core.level19.task20;
 *
 * // Специализированный тип задачи: домашняя задача с указанием места выполнения
 * public class HomeTask extends Task {
 *     private final String location;
 *
 *     public HomeTask(String title, String location) {
 *         super(title);
 *         this.location = location;
 *     }
 *
 *     public String getLocation() {
 *         return location;
 *     }
 *
 *     @Override
 *     public void complete() {
 *         // Демонстрация выполнения: печатаем сообщение
 *         System.out.println("Выполнена домашняя задача: \"" + title + "\" (место: " + location + ")");
 *     }
 *
 *     @Override
 *     public String toString() {
 *         // Детализированное описание — чтобы сервис мог печатать информацию, не зная конкретный тип
 *         return "Домашняя задача — \"" + title + "\", место: " + location;
 *     }
 * }
 */