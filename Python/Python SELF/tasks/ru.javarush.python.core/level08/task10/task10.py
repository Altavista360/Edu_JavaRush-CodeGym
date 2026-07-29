## Authors: JavaRush's team, CodeGym's team, Altavista360
## Version: 1.0.0

### JavaRush
## Задача: Многократый декоратор.
## Ссылка: https://javarush.com/tasks/ru.javarush.python.core.level08.task10

### CodeGym
## Task: Multiple decorator.
## Link: https://codegym.cc/tasks/en.codegym.python.core.level08.task10

### JavaRush
## Условие:
# Напишите программу, которая создает декоратор для повторного вызова функции заданное количество раз. Программа должна: Определить декоратор repeat(num_times), который принимает количество повторов в качестве аргумента. Применить декоратор к функции say_hello(name), которая выводит приветственное сообщение. Вызвать функцию say_hello(name).

### JavaRush
## Требования:
# • Программа должна определить декоратор repeat(num_times), который принимает количество повторов в качестве аргумента.
# • Программа должна применить декоратор repeat(num_times) к функции say_hello(name).
# • Программа должна определить функцию say_hello(name), которая выводит приветственное сообщение.
# • Программа должна вызвать функцию say_hello(name), чтобы проверить корректность работы декоратора.

### JavaRush
## Черновик:
# # Многократый декоратор.
#
# # Напишите программу, которая создает декоратор для повторного вызова функции заданное количество раз.
# # Программа должна:
# # Определить декоратор repeat(num_times), который принимает количество повторов в качестве аргумента.
# # Применить декоратор к функции say_hello(name), которая выводит приветственное сообщение.
# # Вызвать функцию say_hello(name).
#
# # Напишите тут ваш код

### JavaRush
# Многократый декоратор.

# Напишите программу, которая создает декоратор для повторного вызова функции заданное количество раз.
# Программа должна:
# Определить декоратор repeat(num_times), который принимает количество повторов в качестве аргумента.
# Применить декоратор к функции say_hello(name), которая выводит приветственное сообщение.
# Вызвать функцию say_hello(name).

# Напишите тут ваш код

def repeat(num_times):
    def decorator(func):
        def wrapper(*args, **kwargs):
            for _ in range(num_times):
                func(*args, **kwargs)
        return wrapper
    return decorator

@repeat(3)
def say_hello(name):
    print(f"Hello, {name}!")

say_hello("Amelia")

### JavaRush
## Правильное решение:
## Author: JavaRush's team
# def repeat(num_times):
#     def decorator(func):
#         def wrapper(*args, **kwargs):
#             for _ in range(num_times):
#                 func(*args, **kwargs)
#         return wrapper
#     return decorator
#
# @repeat(3)
# def say_hello(name):
#     print(f"Hello, {name}!")
#
# say_hello("Alice")