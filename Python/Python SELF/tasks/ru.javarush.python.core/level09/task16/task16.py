## Authors: JavaRush's team, CodeGym's team, Altavista360
## Version: 1.0.0

### JavaRush
## Задача: Супер-экшен.
## Ссылка: https://javarush.com/tasks/ru.javarush.python.core.level09.task16

### CodeGym
## Task: Super Action.
## Link: https://codegym.cc/tasks/en.codegym.python.core.level09.task16

### JavaRush
## Условие:
# Создайте два базовых класса BaseA и BaseB, каждый из которых имеет метод action(). Создайте производный класс Derived с переопределенным методом action(), который вызывает метод super().action(). Вызовите метод action() у объекта класса Derived и проанализируйте порядок вызова методов.

### JavaRush
## Требования:
# • Программа должна включать класс BaseA, который содержит метод action().
# • Программа должна включать класс BaseB, который содержит метод action().
# • Программа должна включать класс Derived, который наследуется от классов BaseA и BaseB и переопределяет метод action().
# • Метод action() в классе Derived должен вызывать метод super().action().
# • Программа должна создать объект класса Derived и вызвать у него метод action(), чтобы проанализировать порядок вызова методов.

### JavaRush
## Черновик:
# # Супер-экшен.
#
# # Создайте два базовых класса BaseA и BaseB, каждый из которых имеет метод action().
# # Создайте производный класс Derived с переопределенным методом action(), который вызывает метод super().action().
# # Вызовите метод action() у объекта класса Derived и проанализируйте порядок вызова методов.
#
# # Напишите тут ваш код

### JavaRush
# Супер-экшен.

# Создайте два базовых класса BaseA и BaseB, каждый из которых имеет метод action().
# Создайте производный класс Derived с переопределенным методом action(), который вызывает метод super().action().
# Вызовите метод action() у объекта класса Derived и проанализируйте порядок вызова методов.

# Напишите тут ваш код

class BaseA:
    def action(self):
        print("Action from BaseA")

class BaseB:
    def action(self):
        print("Action from BaseB")

class Derived(BaseA, BaseB):
    def action(self):
        super().action()
        print("Action from Derived")

d = Derived()
d.action()

### JavaRush
## Правильное решение:
## Author: JavaRush's team
# class BaseA:
#     def action(self):
#         print("Action from BaseA")
#
# class BaseB:
#     def action(self):
#         print("Action from BaseB")
#
# class Derived(BaseA, BaseB):
#     def action(self):
#         super().action()
#         print("Action from Derived")
#
# d = Derived()
# d.action()