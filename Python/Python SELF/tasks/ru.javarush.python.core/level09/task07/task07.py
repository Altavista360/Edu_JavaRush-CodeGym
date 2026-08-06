## Authors: JavaRush's team, CodeGym's team, Altavista360
## Version: 1.0.0

### JavaRush
## Задача: Машины.
## Ссылка: https://javarush.com/tasks/ru.javarush.python.core.level09.task07

### CodeGym
## Task: Vehicles.
## Link: https://codegym.cc/tasks/en.codegym.python.core.level09.task07

### JavaRush
## Условие:
# Создайте базовый класс Vehicle, который будет иметь атрибут brand. Затем создайте два дочерних класса Car и Motorcycle, которые будут наследовать от Vehicle и добавлять свои уникальные атрибуты и методы. Например, класс Car может иметь метод drive, а класс Motorcycle — метод ride.

### JavaRush
## Требования:
# • Класс Vehicle должен быть создан с атрибутом brand.
# • Классы Car и Motorcycle должны наследовать от класса Vehicle.
# • Класс Car должен иметь уникальный метод drive.
# • Класс Motorcycle должен иметь уникальный метод ride.

### JavaRush
## Черновик:
# # Машины.
#
# # Создайте базовый класс Vehicle, который будет иметь атрибут brand.
# # Затем создайте два дочерних класса Car и Motorcycle, которые будут наследовать от Vehicle
# # и добавлять свои уникальные атрибуты и методы.
# # Например, класс Car может иметь метод drive, а класс Motorcycle — метод ride.
#
#
#
# class Vehicle:
#     def __init__(self, brand):
#         self.brand = brand
#
# # Напишите тут ваш код
#
# # Примеры использования классов:
# car = Car("Toyota", "Corolla")
# print(car.drive())  # Output: Toyota Corolla is driving.
#
# motorcycle = Motorcycle("Yamaha", "R1")
# print(motorcycle.ride())  # Output: Yamaha R1 is riding.

### JavaRush
# Машины.

# Создайте базовый класс Vehicle, который будет иметь атрибут brand.
# Затем создайте два дочерних класса Car и Motorcycle, которые будут наследовать от Vehicle
# и добавлять свои уникальные атрибуты и методы.
# Например, класс Car может иметь метод drive, а класс Motorcycle — метод ride.



class Vehicle:
    def __init__(self, brand):
        self.brand = brand

# Напишите тут ваш код

class Car(Vehicle):
    def __init__(self, brand, model):
        super().__init__(brand)
        self.model = model

    def drive(self):
        return f"{self.brand} {self.model} is driving."

class Motorcycle(Vehicle):
    def __init__(self, brand, model):
        super().__init__(brand)
        self.model = model

    def ride(self):
        return f"{self.brand} {self.model} is riding."

# Примеры использования классов:
car = Car("Toyota", "Corolla")
print(car.drive())  # Output: Toyota Corolla is driving.

motorcycle = Motorcycle("Yamaha", "R1")
print(motorcycle.ride())  # Output: Yamaha R1 is riding.

### JavaRush
## Правильное решение:
## Author: JavaRush's team
# class Vehicle:
#     def __init__(self, brand):
#         self.brand = brand
#
# class Car(Vehicle):
#     def __init__(self, brand, model):
#         super().__init__(brand)
#         self.model = model
#
#     def drive(self):
#         return f"{self.brand} {self.model} is driving."
#
# class Motorcycle(Vehicle):
#     def __init__(self, brand, model):
#         super().__init__(brand)
#         self.model = model
#
#     def ride(self):
#         return f"{self.brand} {self.model} is riding."
#
# # Примеры использования классов:
# car = Car("Toyota", "Corolla")
# print(car.drive())  # Output: Toyota Corolla is driving.
#
# motorcycle = Motorcycle("Yamaha", "R1")
# print(motorcycle.ride())  # Output: Yamaha R1 is riding.