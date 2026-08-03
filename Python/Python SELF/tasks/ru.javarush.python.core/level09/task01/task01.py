## Authors: JavaRush's team, CodeGym's team, Altavista360
## Version: 1.0.0

### JavaRush
## Задача: Создаем объекты.
## Ссылка: https://javarush.com/tasks/ru.javarush.python.core.level09.task01

### CodeGym
## Task: Creating objects.
## Link: https://codegym.cc/tasks/en.codegym.python.core.level09.task01

### JavaRush
## Условие:
# Создайте класс Car с атрибутами make, model и year. Добавьте метод display_info(), который выводит информацию о машине. Затем создайте объект этого класса и вызовите метод display_info().

### JavaRush
## Требования:
# • Программа должна создавать класс с названием Car, который содержит атрибуты make, model и year.
# • Класс Car должен содержать метод display_info(), который выводит информацию о машине.
# • Программа должна создавать объект класса Car.
# • Программа должна вызывать метод display_info() для объекта класса Car.

### JavaRush
## Черновик:
# # Создаем объекты.
#
# # Создайте класс Car с атрибутами make, model и year.
# # Добавьте метод display_info(), который выводит информацию о машине.
# # Затем создайте объект этого класса и вызовите метод display_info().
#
# # Напишите тут ваш код

### JavaRush
# Создаем объекты.

# Создайте класс Car с атрибутами make, model и year.
# Добавьте метод display_info(), который выводит информацию о машине.
# Затем создайте объект этого класса и вызовите метод display_info().

# Напишите тут ваш код

class Car:
    def __init__(self, make, model, year):
        self.make = make
        self.model = model
        self.year = year

    def display_info(self):
        print(f"{self.year} {self.make} {self.model}")

my_car = Car("Toyota", "Camry", 2020)

my_car.display_info()

### JavaRush
## Правильное решение:
## Author: JavaRush's team
# class Car:
#     def __init__(self, make, model, year):
#         self.make = make
#         self.model = model
#         self.year = year
#
#     def display_info(self):
#         print(f"{self.year} {self.make} {self.model}")
#
# # Создание объекта класса Car
# my_car = Car("Toyota", "Camry", 2020)
#
# # Вызов метода display_info()
# my_car.display_info()