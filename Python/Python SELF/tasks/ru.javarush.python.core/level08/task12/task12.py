## Authors: JavaRush's team, CodeGym's team, Altavista360
## Version: 1.0.0

### JavaRush
## Задача: Длительность работы.
## Ссылка: https://javarush.com/tasks/ru.javarush.python.core.level08.task12

### CodeGym
## Task: Execution Duration.
## Link: https://codegym.cc/tasks/en.codegym.python.core.level08.task12

### JavaRush
## Условие:
# Напишите программу, которая создает декоратор для измерения времени выполнения функции. Программа должна: Определить декоратор time_decorator, который измеряет и выводит время выполнения функции. Применить декоратор к функции compute_square(n), которая вычисляет квадрат числа и имитирует задержку с помощью time.sleep(). Вызвать функцию compute_square(n).

### JavaRush
## Требования:
# • Программа должна определить декоратор `time_decorator`, который измеряет и выводит время выполнения функции.
# • Программа должна применить декоратор `time_decorator` к функции `compute_square(n)`, которая вычисляет квадрат числа.
# • Функция `compute_square(n)` должна имитировать задержку с использованием функции `time.sleep()`.
# • Программа должна вызвать функцию `compute_square(n)`.

### JavaRush
## Черновик:
# # Длительность работы.
#
# # Напишите программу, которая создает декоратор для измерения времени выполнения функции.
# # Программа должна:
# # Определить декоратор time_decorator, который измеряет и выводит время выполнения функции.
# # Применить декоратор к функции compute_square(n), которая вычисляет квадрат числа и имитирует задержку с помощью time.sleep().
# # Вызвать функцию compute_square(n).
#
# # Напишите тут ваш код

### JavaRush
# Длительность работы.

# Напишите программу, которая создает декоратор для измерения времени выполнения функции.
# Программа должна:
# Определить декоратор time_decorator, который измеряет и выводит время выполнения функции.
# Применить декоратор к функции compute_square(n), которая вычисляет квадрат числа и имитирует задержку с помощью time.sleep().
# Вызвать функцию compute_square(n).

# Напишите тут ваш код

import time

def time_decorator(func):
    def wrapper(n):
        start_time = time.time()
        result = func(n)
        end_time = time.time()
        print(f"Execution time: {end_time - start_time} seconds")
        return result
    return wrapper

@time_decorator
def compute_square(n):
    time.sleep(3)
    return n * n

compute_square(6)

### JavaRush
## Правильное решение:
## Author: JavaRush's team
# import time
#
# def time_decorator(func):
#     def wrapper(n):
#         start_time = time.time()
#         result = func(n)
#         end_time = time.time()
#         print(f"Время выполнения: {end_time - start_time} секунд")
#         return result
#     return wrapper
#
# @time_decorator
# def compute_square(n):
#     time.sleep(2)  # имитация задержки
#     return n * n
#
# compute_square(5)