## Authors: JavaRush's team, CodeGym's team, Altavista360
## Version: 1.0.0

### JavaRush
## Задача: Итератор для коллекции
## Ссылка: https://javarush.com/tasks/ru.javarush.python.core.level11.task10

### CodeGym
## Task: Iterator for a collection
## Link: https://codegym.cc/tasks/en.codegym.python.core.level11.task10

### JavaRush
## Условие:
# Напишите класс CollectionIterator, который будет итерироваться по произвольной коллекции (список, строка и т.д.). Реализуйте методы __iter__ и __next__.

### JavaRush
## Требования:
# • Программа должна включать определение класса CollectionIterator, который будет предназначен для итерации по произвольной коллекции.
# • Класс CollectionIterator должен содержать метод __iter__, который возвращает сам итератор, то есть экземпляр самого себя.
# • Класс CollectionIterator должен содержать метод __next__, который возвращает следующий элемент в коллекции. Если элементов больше нет, метод должен вызывать исключение StopIteration.

### JavaRush
## Черновик:
# # Итератор для коллекции
#
# # Напишите класс CollectionIterator, который будет итерироваться по произвольной коллекции (список, строка и т.д.).
# # Реализуйте методы __iter__ и __next__.
#
# # Напишите тут ваш код

### JavaRush
# Итератор для коллекции

# Напишите класс CollectionIterator, который будет итерироваться по произвольной коллекции (список, строка и т.д.).
# Реализуйте методы __iter__ и __next__.

# Напишите тут ваш код

class CollectionIterator:
    def __init__(self, collection):
        self.collection = collection
        self.index = 0

    def __iter__(self):
        return self

    def __next__(self):
        if self.index < len(self.collection):
            item = self.collection[self.index]
            self.index += 1
            return item
        else:
            raise StopIteration

ci_list = CollectionIterator([1, 3, 5, 7, 11])
for item in ci_list:
    print(item)

ci_string = CollectionIterator("qwerty")
for char in ci_string:
    print(char)

### JavaRush
## Правильное решение:
## Author: JavaRush's team
# class CollectionIterator:
#     def __init__(self, collection):
#         self.collection = collection
#         self.index = 0
#
#     def __iter__(self):
#         return self
#
#     def __next__(self):
#         if self.index < len(self.collection):
#             item = self.collection[self.index]
#             self.index += 1
#             return item
#         else:
#             raise StopIteration
#
# # Примеры использования:
# # Для списка
# ci_list = CollectionIterator([1, 2, 3, 4])
# for item in ci_list:
#     print(item)
#
# # Для строки
# ci_string = CollectionIterator("hello")
# for char in ci_string:
#     print(char)