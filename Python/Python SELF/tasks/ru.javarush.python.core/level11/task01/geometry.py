## Authors: JavaRush's team, CodeGym's team, Altavista360
## Version: 1.0.0

### JavaRush
## Задача: Импорт элементов из модуля
## Ссылка: https://javarush.com/tasks/ru.javarush.python.core.level11.task01

### CodeGym
## Task: Import elements from a module
## Link: https://codegym.cc/tasks/en.codegym.python.core.level11.task01

### JavaRush
## Условие:
# Создайте модуль geometry.py, который содержит функции circle_area(radius) и rectangle_area(length, width). Затем импортируйте только функцию circle_area и используйте её в другом файле.

### JavaRush
## Требования:
# • Создать файл geometry.py, содержащий определения функций circle_area(radius) и rectangle_area(length, width).
# • В файле geometry.py создать функцию circle_area(radius), которая принимает радиус и возвращает площадь круга.
# • В файле geometry.py создать функцию rectangle_area(length, width), которая принимает длину и ширину и возвращает площадь прямоугольника.
# • В другом файле выполнить импорт только функции circle_area из модуля geometry.
# • В другом файле должна быть использована функция circle_area для вычисления площади круга.

### JavaRush
import math

def circle_area(radius):
    return math.pi * radius * radius

def rectangle_area(length, width):
    return length * width

### JavaRush
## Правильное решение:
## Author: JavaRush's team
# import math
#
# def circle_area(radius):
#     return math.pi * radius * radius
#
# def rectangle_area(length, width):
#     return length * width