## Authors: JavaRush's team, CodeGym's team, Altavista360
## Version: 1.0.0

### JavaRush
## Задача: Создание простого итератора
## Ссылка: https://javarush.com/tasks/ru.javarush.python.core.level11.task09

### CodeGym
## Task: Creating a Simple Iterator
## Link: https://codegym.cc/tasks/en.codegym.python.core.level11.task09

### JavaRush
## Условие:
# Напишите класс SimpleIterator, который будет итерироваться по последовательности чисел от start до end. Реализуйте методы __iter__ и __next__.

### JavaRush
## Требования:
# • Программа должна включать определение класса с именем SimpleIterator.
# • В классе SimpleIterator должен быть метод __init__, принимающий параметры start и end, и инициализирующий соответствующие атрибуты экземпляра.
# • Класс SimpleIterator должен содержать метод __iter__, который возвращает сам объект итератора.
# • Класс SimpleIterator должен содержать метод __next__, который возвращает следующий элемент последовательности и вызывает исключение StopIteration при достижении end.

### JavaRush
## Черновик:
# # Создание простого итератора
#
# # Напишите класс SimpleIterator, который будет итерироваться по последовательности чисел от start до end.
# # Реализуйте методы __iter__ и __next__.
#
# # Напишите тут ваш код

### JavaRush
# Создание простого итератора

# Напишите класс SimpleIterator, который будет итерироваться по последовательности чисел от start до end.
# Реализуйте методы __iter__ и __next__.

# Напишите тут ваш код

class SimpleIterator:
    def __init__(self, start, end):
        self.current = start
        self.end = end

    def __iter__(self):
        return self

    def __next__(self):
        if self.current > self.end:
            raise StopIteration
        else:
            self.current += 1
            return self.current - 1

for num in SimpleIterator(1, 7):
    print(num)

### JavaRush
## Правильное решение:
## Author: JavaRush's team
# class SimpleIterator:
#     def __init__(self, start, end):
#         self.current = start
#         self.end = end
#
#     def __iter__(self):
#         return self
#
#     def __next__(self):
#         if self.current > self.end:
#             raise StopIteration
#         else:
#             self.current += 1
#             return self.current - 1
#
# # Пример использования
# # for num in SimpleIterator(1, 5):
# #     print(num)