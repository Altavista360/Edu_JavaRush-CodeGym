## Authors: JavaRush's team, CodeGym's team, Altavista360
## Version: 1.0.0

### JavaRush
## Задача: Случайный аргумент
## Ссылка: https://javarush.com/tasks/ru.javarush.python.core.level04.task14

### CodeGym
## Task: Random Argument
## Link: https://codegym.cc/tasks/en.codegym.python.core.level04.task14

### JavaRush
## Условие:
# Напишите функцию print_random(a,b,c), которая выводит на экран случайно выбранный переданный аргумент.

### JavaRush
## Требования:
# • Программа должна содержать функцию с именем print_random, которая принимает три аргумента: a, b, c.
# • В функции print_random необходимо использовать модуль random для случайного выбора одного из переданных аргументов.
# • Функция print_random должна выводить на экран случайно выбранный аргумент из a, b, c при каждом вызове.

### JavaRush
## Черновик:
# # Случайный аргумент
#
# # Напишите функцию  print_random(a,b,c), которая выводит на экран случайно выбранный переданный аргумент.
#
# # Напишите тут ваш код

### JavaRush
# Случайный аргумент

# Напишите функцию  print_random(a,b,c), которая выводит на экран случайно выбранный переданный аргумент.

# Напишите тут ваш код

import random

def print_random(a, b, c):
    print(random.choice([a, b, c]))

print_random(1, 2, 3)

### JavaRush
## Правильное решение:
## Author: JavaRush's team
# import random
#
# def print_random(a, b, c):
#     print(random.choice([a, b, c]))
#
# # Пример вызова функции
# print_random(1, 2, 3)