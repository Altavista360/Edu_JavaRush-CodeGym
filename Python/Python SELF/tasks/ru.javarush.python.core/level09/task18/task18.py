## Authors: JavaRush's team, CodeGym's team, Altavista360
## Version: 1.0.0

### JavaRush
## Задача: Переопределение метода
## Ссылка: https://javarush.com/tasks/ru.javarush.python.core.level09.task18

### CodeGym
## Task: Method Overriding
## Link: https://codegym.cc/tasks/en.codegym.python.core.level09.task18

### JavaRush
## Условие:
# Создайте классы M, N, и O, где N и O наследуют от M. В каждом классе определите метод action, который выводит имя класса и вызывает метод родительского класса с помощью super(). Проверьте порядок вызова методов, создав экземпляр класса N и вызвав метод action.

### JavaRush
## Требования:
# • Необходимо создать три класса с именами M, N и O. Классы N и O должны наследовать от класса M.
# • В каждом из классов M, N и O необходимо определить метод с именем action. Метод должен выводить имя текущего класса.
# • Методы action в классах N и O должны вызывать метод action родительского класса с помощью super().
# • Необходимо создать экземпляр класса N и вызвать его метод action для проверки порядка вызова методов.

### JavaRush
## Черновик:
# # Переопределение метода
#
# # Создайте классы M, N, и O, где N и O наследуют от M.
# # В каждом классе определите метод action, который выводит имя класса
# # и вызывает метод родительского класса с помощью super().
# # Проверьте порядок вызова методов, создав экземпляр класса N и вызвав метод action.
#
# # Напишите тут ваш код

### JavaRush
# Переопределение метода

# Создайте классы M, N, и O, где N и O наследуют от M.
# В каждом классе определите метод action, который выводит имя класса
# и вызывает метод родительского класса с помощью super().
# Проверьте порядок вызова методов, создав экземпляр класса N и вызвав метод action.

# Напишите тут ваш код

class M:
    def action(self):
        print("Class M action")

class N(M):
    def action(self):
        print("Class N action")
        super().action()

class O(M):
    def action(self):
        print("Class O action")
        super().action()

n = N()
n.action()

### JavaRush
## Правильное решение:
## Author: JavaRush's team
# class M:
#     def action(self):
#         print("Class M action")
#
# class N(M):
#     def action(self):
#         print("Class N action")
#         super().action()
#
# class O(M):
#     def action(self):
#         print("Class O action")
#         super().action()
#
# n = N()
# n.action()