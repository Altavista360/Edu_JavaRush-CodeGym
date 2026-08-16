## Authors: JavaRush's team, CodeGym's team, Altavista360
## Version: 1.0.0

### JavaRush
## Задача: Использование traceback
## Ссылка: https://javarush.com/tasks/ru.javarush.python.core.level10.task09

### CodeGym
## Task: Using traceback
## Link: https://codegym.cc/tasks/en.codegym.python.core.level10.task09

### JavaRush
## Условие:
# Напишите функцию divide_numbers, которая принимает два аргумента и делит первое число на второе. Если возникает исключение ZeroDivisionError, перехватите его и выведите стек-трейс, используя модуль traceback.

### JavaRush
## Требования:
# • Программа должна импортировать модуль traceback для использования его функциональности.
# • Программа должна включать функцию divide_numbers, которая принимает два аргумента.
# • Функция divide_numbers должна выполнять деление первого аргумента на второй и перехватывать исключение ZeroDivisionError.
# • Если возникает исключение ZeroDivisionError, функция divide_numbers должна выводить стек-трейс с использованием модуля traceback.

### JavaRush
## Черновик:
# # Использование traceback
#
# # Напишите функцию divide_numbers, которая принимает два аргумента и делит первое число на второе.
# # Если возникает исключение ZeroDivisionError, перехватите его и выведите стек-трейс, используя модуль traceback.
#
# # Напишите тут ваш код

### JavaRush
# Использование traceback

# Напишите функцию divide_numbers, которая принимает два аргумента и делит первое число на второе.
# Если возникает исключение ZeroDivisionError, перехватите его и выведите стек-трейс, используя модуль traceback.

# Напишите тут ваш код

import traceback

def divide_numbers(foo, bar):
    try:
        return foo / bar
    except ZeroDivisionError:
        traceback.print_exc()

divide_numbers(100500, 0)

### JavaRush
## Правильное решение:
## Author: JavaRush's team
# import traceback
#
# def divide_numbers(a, b):
#     try:
#         return a / b
#     except ZeroDivisionError:
#         traceback.print_exc()
#
# # Пример вызова функции
# divide_numbers(10, 0)