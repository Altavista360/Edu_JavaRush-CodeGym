## Authors: JavaRush's team, CodeGym's team, Altavista360
## Version: 1.0.0

### JavaRush
## Задача: Декоратор.
## Ссылка: https://javarush.com/tasks/ru.javarush.python.core.level08.task09

### CodeGym
## Task: Decorator.
## Link: https://codegym.cc/tasks/en.codegym.python.core.level08.task09

### JavaRush
## Условие:
# Напишите программу, которая создает простой декоратор для логирования вызовов функции. Программа должна: Определить декоратор log_decorator, который выводит сообщение перед и после вызова функции. Применить декоратор к функции greet(), которая выводит приветственное сообщение. Вызвать функцию greet().

### JavaRush
## Требования:
# • Программа должна определить декоратор `log_decorator`, который выводит сообщение перед и после вызова функции.
# • Программа должна применить декоратор `log_decorator` к функции `greet()`, которая выводит приветственное сообщение.
# • Программа должна вызвать декорированную функцию `greet()`.

### JavaRush
## Черновик:
# # Декоратор.
#
# # Напишите программу, которая создает простой декоратор для логирования вызовов функции.
# # Программа должна:
# # Определить декоратор log_decorator, который выводит сообщение перед и после вызова функции.
# # Применить декоратор к функции greet(), которая выводит приветственное сообщение.
# # Вызвать функцию greet().
#
# # Напишите тут ваш код

### JavaRush
# Декоратор.

# Напишите программу, которая создает простой декоратор для логирования вызовов функции.
# Программа должна:
# Определить декоратор log_decorator, который выводит сообщение перед и после вызова функции.
# Применить декоратор к функции greet(), которая выводит приветственное сообщение.
# Вызвать функцию greet().

# Напишите тут ваш код

def log_decorator(func):
    def wrapper(*args, **kwargs):
        print("Before calling a function")
        result = func(*args, **kwargs)
        print("After calling a function")
        return result
    return wrapper

@log_decorator
def greet():
    print("Hello!")

greet()

### JavaRush
## Правильное решение:
## Author: JavaRush's team
# def log_decorator(func):
#     def wrapper(*args, **kwargs):
#         print("Перед вызовом функции")
#         result = func(*args, **kwargs)
#         print("После вызова функции")
#         return result
#     return wrapper
#
# @log_decorator
# def greet():
#     print("Привет!")
#
# greet()