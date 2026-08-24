## Authors: JavaRush's team, CodeGym's team, Altavista360
## Version: 1.0.0

### JavaRush
## Задача: Перегрузка операторов сравнения
## Ссылка: https://javarush.com/tasks/ru.javarush.python.core.level11.task11

### CodeGym
## Task: Overloading comparison operators
## Link: https://codegym.cc/tasks/en.codegym.python.core.level11.task11

### JavaRush
## Условие:
# Напишите класс Person, который будет представлять человека с атрибутами name и age. Реализуйте перегрузку операторов сравнения == и < для сравнения людей по возрасту.

### JavaRush
## Требования:
# • Программа должна включать определение класса Person с атрибутами name и age.
# • Класс Person должен перегрузить оператор == для сравнения объектов по возрасту.
# • Класс Person должен перегрузить оператор < для сравнения объектов по возрасту.

### JavaRush
## Черновик:
# # Перегрузка операторов сравнения
#
# # Напишите класс Person, который будет представлять человека с атрибутами name и age.
# # Реализуйте перегрузку операторов сравнения == и < для сравнения людей по возрасту.
#
# # Напишите тут ваш код

### JavaRush
# Перегрузка операторов сравнения

# Напишите класс Person, который будет представлять человека с атрибутами name и age.
# Реализуйте перегрузку операторов сравнения == и < для сравнения людей по возрасту.

# Напишите тут ваш код

class Person:
    def __init__(self, name, age):
        self.name = name
        self.age = age

    def __eq__(self, other):
        if isinstance(other, Person):
            return self.age == other.age
        return False

    def __lt__(self, other):
        if isinstance(other, Person):
            return self.age < other.age
        return False

foo = Person("Harry Potter", 13)
bar = Person("Ron Weasley", 13)
baz = Person("Hermione Granger", 14)

print(foo == bar)
print(foo == baz)
print(foo < bar)
print(bar < foo)

### JavaRush
## Правильное решение:
## Author: JavaRush's team
# class Person:
#     def __init__(self, name, age):
#         self.name = name
#         self.age = age
#
#     def __eq__(self, other):
#         if isinstance(other, Person):
#             return self.age == other.age
#         return False
#
#     def __lt__(self, other):
#         if isinstance(other, Person):
#             return self.age < other.age
#         return False
#
# # Примеры использования
# person1 = Person("Alice", 30)
# person2 = Person("Bob", 25)
# person3 = Person("Charlie", 30)
#
# print(person1 == person2)  # False
# print(person1 == person3)  # True
# print(person1 < person2)   # False
# print(person2 < person1)   # True