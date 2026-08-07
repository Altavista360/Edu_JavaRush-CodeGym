## Authors: JavaRush's team, CodeGym's team, Altavista360
## Version: 1.0.0

### JavaRush
## Задача: Супермашины.
## Ссылка: https://javarush.com/tasks/ru.javarush.python.core.level09.task09

### CodeGym
## Task: Supermachines.
## Link: https://codegym.cc/tasks/en.codegym.python.core.level09.task09

### JavaRush
## Условие:
# Создайте базовый класс Vehicle, который будет иметь атрибуты brand и model. Затем создайте дочерний класс Car, который будет наследовать от Vehicle и добавлять атрибут fuel_type. Используйте метод super() для вызова конструктора базового класса.

### JavaRush
## Требования:
# • Программа должна включать базовый класс Vehicle, который содержит атрибуты brand и model.
# • Программа должна включать дочерний класс Car, который наследует от базового класса Vehicle.
# • Дочерний класс Car должен добавлять новый атрибут fuel_type.
# • Конструктор дочернего класса Car должен использовать метод super() для вызова конструктора базового класса Vehicle.

### JavaRush
## Черновик:
# # Супермашины.
#
# # Создайте базовый класс Vehicle, который будет иметь атрибуты brand и model.
# # Затем создайте дочерний класс Car, который будет наследовать от Vehicle и добавлять атрибут fuel_type.
# # Используйте метод super() для вызова конструктора базового класса.
#
# # Напишите тут ваш код

### JavaRush
# Супермашины.

# Создайте базовый класс Vehicle, который будет иметь атрибуты brand и model.
# Затем создайте дочерний класс Car, который будет наследовать от Vehicle и добавлять атрибут fuel_type.
# Используйте метод super() для вызова конструктора базового класса.

# Напишите тут ваш код

class Vehicle:
    def __init__(self, brand, model):
        self.brand = brand
        self.model = model

class Car(Vehicle):
    def __init__(self, brand, model, fuel_type):
        super().__init__(brand, model)
        self.fuel_type = fuel_type

car = Car("Tesla", "Model Y", "Электро")
print(f"Бренд: {car.brand}, Модель: {car.model}, Тип топлива: {car.fuel_type}")

### JavaRush
## Правильное решение:
## Author: JavaRush's team
# class Vehicle:
#     def __init__(self, brand, model):
#         self.brand = brand
#         self.model = model
#
# class Car(Vehicle):
#     def __init__(self, brand, model, fuel_type):
#         super().__init__(brand, model)
#         self.fuel_type = fuel_type
#
# # Пример использования
# car = Car("Toyota", "Corolla", "Petrol")
# print(f"Brand: {car.brand}, Model: {car.model}, Fuel Type: {car.fuel_type}")