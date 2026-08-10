## Authors: JavaRush's team, CodeGym's team, Altavista360
## Version: 1.0.0

### JavaRush
## Задача: Базовые классы.
## Ссылка: https://javarush.com/tasks/ru.javarush.python.core.level09.task15

### CodeGym
## Task: Basic classes.
## Link: https://codegym.cc/tasks/en.codegym.python.core.level09.task15

### JavaRush
## Условие:
# Создайте два базовых класса Base1 и Base2, каждый из которых имеет метод describe(). Создайте производный класс Combined, который наследует от обоих базовых классов. Реализуйте метод describe() в каждом базовом классе. Вызовите метод describe() у объекта класса Combined.

### JavaRush
## Требования:
# • Программа должна включать два базовых класса — `Base1` и `Base2`.
# • Каждый из базовых классов (`Base1` и `Base2`) должен содержать метод `describe()`.
# • Программа должна включать производный класс `Combined`, который наследует от обоих базовых классов (`Base1` и `Base2`).
# • Метод `describe()` должен быть вызван для объекта класса `Combined`.

### JavaRush
## Черновик:
# # Базовые классы.
#
# # Создайте два базовых класса Base1 и Base2, каждый из которых имеет метод describe().
# # Создайте производный класс Combined, который наследует от обоих базовых классов.
# # Реализуйте метод describe() в каждом базовом классе. Вызовите метод describe() у объекта класса Combined.
#
# # Напишите тут ваш код

### JavaRush
# Базовые классы.

# Создайте два базовых класса Base1 и Base2, каждый из которых имеет метод describe().
# Создайте производный класс Combined, который наследует от обоих базовых классов.
# Реализуйте метод describe() в каждом базовом классе. Вызовите метод describe() у объекта класса Combined.

# Напишите тут ваш код

class Base1:
    def describe(self):
        print("This is Base1")

class Base2:
    def describe(self):
        print("This is Base2")

class Combined(Base1, Base2):
    pass

obj = Combined()
obj.describe()

### JavaRush
## Правильное решение:
## Author: JavaRush's team
# class Base1:
#     def describe(self):
#         print("This is Base1")
#
# class Base2:
#     def describe(self):
#         print("This is Base2")
#
# class Combined(Base1, Base2):
#     pass
#
# obj = Combined()
# obj.describe()