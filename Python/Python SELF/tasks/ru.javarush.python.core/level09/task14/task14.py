## Authors: JavaRush's team, CodeGym's team, Altavista360
## Version: 1.0.0

### JavaRush
## Задача: Автопарк.
## Ссылка: https://javarush.com/tasks/ru.javarush.python.core.level09.task14

### CodeGym
## Task: Fleet of vehicles.
## Link: https://codegym.cc/tasks/en.codegym.python.core.level09.task14

### JavaRush
## Условие:
# Напишите функцию check_subclass для проверки, является ли один класс подклассом другого. Используйте функцию issubclass() для выполнения проверки. Затем создайте классы Vehicle, Car, Bicycle, и проверьте, являются ли Car и Bicycle подклассами Vehicle.

### JavaRush
## Требования:
# • Программа должна включать функцию под названием check_subclass, которая принимает два аргумента: два класса для проверки.
# • Функция check_subclass должна использовать встроенную функцию issubclass() для проверки, является ли первый переданный в нее класс подклассом второго.
# • Программа должна включать определение класса Vehicle.
# • Программа должна включать определение класса Car, который представляет собой тип транспортного средства.
# • Программа должна включать определение класса Bicycle, который представляет собой тип транспортного средства.

### JavaRush
## Черновик:
# # Автопарк.
#
# # Напишите функцию check_subclass для проверки, является ли один класс подклассом другого.
# # Используйте функцию issubclass() для выполнения проверки.
# # Затем создайте классы Vehicle, Car, Bicycle, и проверьте, являются ли Car и Bicycle подклассами Vehicle.
#
# # Напишите тут ваш код

### JavaRush
# Автопарк.

# Напишите функцию check_subclass для проверки, является ли один класс подклассом другого.
# Используйте функцию issubclass() для выполнения проверки.
# Затем создайте классы Vehicle, Car, Bicycle, и проверьте, являются ли Car и Bicycle подклассами Vehicle.

# Напишите тут ваш код

def check_subclass(class1, class2):
    return issubclass(class1, class2)

class Vehicle:
    pass

class Car(Vehicle):
    pass

class Bicycle(Vehicle):
    pass

print(check_subclass(Car, Vehicle))
print(check_subclass(Bicycle, Vehicle))

### JavaRush
## Правильное решение:
## Author: JavaRush's team
# def check_subclass(class1, class2):
#     return issubclass(class1, class2)
#
# class Vehicle:
#     pass
#
# class Car(Vehicle):
#     pass
#
# class Bicycle(Vehicle):
#     pass
#
# # Проверка
# print(check_subclass(Car, Vehicle))  # Должно вернуть True
# print(check_subclass(Bicycle, Vehicle))  # Должно вернуть True