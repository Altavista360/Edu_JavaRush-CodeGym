## Authors: JavaRush's team, CodeGym's team, Altavista360
## Version: 1.0.0

### JavaRush
## Задача: Использование super() и MRO
## Ссылка: https://javarush.com/tasks/ru.javarush.python.core.level09.task17

### CodeGym
## Task: Using super() and MRO
## Link: https://codegym.cc/tasks/en.codegym.python.core.level09.task17

### JavaRush
## Условие:
# Создайте классы A, B, C, и D, где B и C наследуют от A, а D наследует от B и C. В каждом классе определите метод method, который выводит имя класса и вызывает метод super().method(). Создайте экземпляр класса D и вызовите метод method, чтобы понять порядок вызова методов по MRO.

### JavaRush
## Требования:
# • Программа должна содержать классы A, B, C, и D, где классы B и C наследуют от класса A, а класс D наследует от классов B и C.
# • Каждый класс должен иметь метод method, который выводит имя класса и вызывает метод super().method().
# • Программа должна создавать экземпляр класса D.
# • Программа должна вызывать метод method на экземпляре класса D, чтобы продемонстрировать порядок вызова методов по MRO (методу разрешения порядка).
# • Метод method в каждом классе должен выводить имя соответствующего класса.

### JavaRush
## Черновик:
# # Использование super() и MRO
#
# # Создайте классы A, B, C, и D, где B и C наследуют от A, а D наследует от B и C.
# # В каждом классе определите метод method, который выводит имя класса и вызывает метод super().method().
# # Создайте экземпляр класса D и вызовите метод method, чтобы понять порядок вызова методов по MRO.
#
# # Напишите тут ваш код

### JavaRush
# Использование super() и MRO

# Создайте классы A, B, C, и D, где B и C наследуют от A, а D наследует от B и C.
# В каждом классе определите метод method, который выводит имя класса и вызывает метод super().method().
# Создайте экземпляр класса D и вызовите метод method, чтобы понять порядок вызова методов по MRO.

# Напишите тут ваш код

class A:
    def method(self):
        print("A")

class B(A):
    def method(self):
        print("B")
        super().method()

class C(A):
    def method(self):
        print("C")
        super().method()

class D(B, C):
    def method(self):
        print("D")
        super().method()

d = D()
d.method()

### JavaRush
## Правильное решение:
## Author: JavaRush's team
# class A:
#     def method(self):
#         print("A")
#         # No call to super() because A is the topmost class
#
# class B(A):
#     def method(self):
#         print("B")
#         super().method()
#
# class C(A):
#     def method(self):
#         print("C")
#         super().method()
#
# class D(B, C):
#     def method(self):
#         print("D")
#         super().method()
#
# d = D()
# d.method()