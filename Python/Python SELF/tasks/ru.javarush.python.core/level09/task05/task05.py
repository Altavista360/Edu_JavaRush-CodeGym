## Authors: JavaRush's team, CodeGym's team, Altavista360
## Version: 1.0.0

### JavaRush
## Задача: Защищайтесь.
## Ссылка: https://javarush.com/tasks/ru.javarush.python.core.level09.task05

### CodeGym
## Task: Defend yourself.
## Link: https://codegym.cc/tasks/en.codegym.python.core.level09.task05

### JavaRush
## Условие:
# Создайте класс Car, который будет иметь публичный атрибут brand и защищенный атрибут _model_. Добавьте методы для получения и установки значения защищенного атрибута _model_. Создайте объект класса Car, установите значения атрибутов и выведите их на экран.

### JavaRush
## Требования:
# • Программа должна включать создание класса Car.
# • Класс Car должен содержать публичный атрибут brand, который можно будет свободно изменять и читать.
# • Класс Car должен содержать защищенный атрибут _model_, доступ к которому должен осуществляться через методы получения и установки значения.
# • Класс Car должен содержать метод для получения значения защищенного атрибута _model_ и метод для установки значения защищенного атрибута _model_.
# • Программа должна создать объект класса Car, установить значения атрибутов brand и _model_, используя публичные и защищенные методы доступа, и вывести эти значения на экран.

### JavaRush
## Черновик:
# # Защищайтесь.
#
# # Создайте класс Car, который будет иметь публичный атрибут brand и защищенный атрибут _model_.
# # Добавьте методы для получения и установки значения защищенного атрибута _model.
# # Создайте объект класса Car, установите значения атрибутов и выведите их на экран.
#
# # Напишите тут ваш код

### JavaRush
# Защищайтесь.

# Создайте класс Car, который будет иметь публичный атрибут brand и защищенный атрибут _model.
# Добавьте методы для получения и установки значения защищенного атрибута _model.
# Создайте объект класса Car, установите значения атрибутов и выведите их на экран.

# Напишите тут ваш код

class Car:
    def __init__(self, brand, model):
        self.brand = brand
        self._model = model

    def get_model(self):
        return self._model

    def set_model(self, model):
        self._model = model

car = Car("Roadster", "Model S")

car.brand = "Tesla"
car.set_model("Cybertruck")

print(f"Бренд: {car.brand}")
print(f"Модель: {car.get_model()}")

### JavaRush
## Правильное решение:
## Author: JavaRush's team
# class Car:
#     def __init__(self, brand, model):
#         self.brand = brand
#         self._model_ = model
#
#     def get_model(self):
#         return self._model_
#
#     def set_model(self, model):
#         self._model_ = model
#
# # Создание объекта класса Car
# car = Car("Toyota", "Camry")
#
# # Установим новые значения для атрибутов
# car.brand = "Honda"
# car.set_model("Civic")
#
# # Выводим значения атрибутов на экран
# print(f"Brand: {car.brand}")
# print(f"Model: {car.get_model()}")