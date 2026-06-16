## Authors: JavaRush's team, CodeGym's team, Altavista360
## Version: 1.0.0

### JavaRush
## Задача: Случайная функция
## Ссылка: https://javarush.com/tasks/ru.javarush.python.core.level04.task13

### CodeGym
## Task: Random Function
## Link: https://codegym.cc/tasks/en.codegym.python.core.level04.task13

### JavaRush
## Условие:
# Напишите функцию generate_random_number(), которая выводит на экран случайное число от -200 до 0.

### JavaRush
## Требования:
# • Программа должна импортировать модуль random для генерации случайных чисел.
# • Программа должна содержать функцию с именем generate_random_number.
# • Функция generate_random_number должна генерировать случайное число в диапазоне от -200 до 0 включительно.
# • Функция generate_random_number должна выводить сгенерированное число на экран.

### JavaRush
## Черновик:
# # Случайная функция
#
# # Напишите функцию generate_random_number(), которая выводит на экран случайное число от -200 до 0.
#
# # Напишите тут ваш код

### JavaRush
# Случайная функция

# Напишите функцию generate_random_number(), которая выводит на экран случайное число от -200 до 0.

# Напишите тут ваш код

import random

def generate_random_number():
    print(random.randint(-200, 0))

generate_random_number()

### JavaRush
## Правильное решение:
## Author: JavaRush's team
# import random
#
# def generate_random_number():
#     print(random.randint(-200, 0))
#
# generate_random_number()