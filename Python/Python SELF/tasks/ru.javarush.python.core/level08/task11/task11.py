## Authors: JavaRush's team, CodeGym's team, Altavista360
## Version: 1.0.0

### JavaRush
## Задача: Множество декораторов.
## Ссылка: https://javarush.com/tasks/ru.javarush.python.core.level08.task11

### CodeGym
## Task: Multiple decorators.
## Link: https://codegym.cc/tasks/en.codegym.python.core.level08.task11

### JavaRush
## Условие:
# Напишите программу, которая использует несколько декораторов для одной функции. Программа должна: Определить два декоратора decorator1 и decorator2, которые логируют свои вызовы. Применить оба декоратора к функции say_hello. Вызвать функцию say_hello.

### JavaRush
## Требования:
# • Декоратор decorator1 должен логировать свой вызов.
# • Декоратор decorator2 должен логировать свой вызов.
# • Программа должна применить оба декоратора decorator1 и decorator2 к функции say_hello.
# • Программа должна вызвать функцию say_hello, чтобы можно было наблюдать за работой декораторов.

### JavaRush
## Черновик:
# # Множество декораторов.
#
# # Напишите программу, которая использует несколько декораторов для одной функции.
# # Программа должна:
# # Определить два декоратора decorator1 и decorator2, которые логируют свои вызовы.
# # Применить оба декоратора к функции say_hello.
# # Вызвать функцию say_hello.
#
# # Напишите тут ваш код

### JavaRush
# Множество декораторов.

# Напишите программу, которая использует несколько декораторов для одной функции.
# Программа должна:
# Определить два декоратора decorator1 и decorator2, которые логируют свои вызовы.
# Применить оба декоратора к функции say_hello.
# Вызвать функцию say_hello.

# Напишите тут ваш код

def decorator1(func):
    def wrapper(*args, **kwargs):
        print("Decorator 1: Before function call")
        result = func(*args, **kwargs)
        print("Decorator 1: After function call")
        return result
    return wrapper

def decorator2(func):
    def wrapper(*args, **kwargs):
        print("Decorator 2: Before function call")
        result = func(*args, **kwargs)
        print("Decorator 2: After function call")
        return result
    return wrapper

@decorator1
@decorator2
def say_hello():
    print("Hello, world!")

say_hello()

### JavaRush
## Правильное решение:
## Author: JavaRush's team
# def decorator1(func):
#     def wrapper(*args, **kwargs):
#         print("Decorator 1: Before function call")
#         result = func(*args, **kwargs)
#         print("Decorator 1: After function call")
#         return result
#     return wrapper
#
# def decorator2(func):
#     def wrapper(*args, **kwargs):
#         print("Decorator 2: Before function call")
#         result = func(*args, **kwargs)
#         print("Decorator 2: After function call")
#         return result
#     return wrapper
#
# @decorator1
# @decorator2
# def say_hello():
#     print("Hello, world!")
#
# say_hello()