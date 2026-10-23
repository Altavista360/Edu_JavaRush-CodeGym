## Authors: JavaRush's team, CodeGym's team, Altavista360
## Version: 1.0.0

### JavaRush
## Задача: Мемеоизация Фибоначчи
## Ссылка: https://javarush.com/tasks/ru.javarush.python.core.level18.task05

### CodeGym
## Task: Fibonacci Memoization
## Link: https://codegym.cc/tasks/en.codegym.python.core.level18.task05

### JavaRush
## Условие:
# Напишите функцию для вычисления n-го числа Фибоначчи с использованием мемоизации, чтобы улучшить производительность по сравнению с простым рекурсивным подходом.

### JavaRush
## Требования:
# • Программа должна включать функцию, которая принимает одно целое число n в качестве аргумента и возвращает n-е число Фибоначчи.
# • Функция должна использовать мемоизацию для хранения уже вычисленных значений чисел Фибоначчи, чтобы избежать повторных вычислений и тем самым улучшить производительность.
# • Функция должна корректно обрабатывать базовые случаи n = 0 и n = 1, возвращая соответственно 0 и 1.
# • Программа должна включать структуру данных (например, словарь или массив) для хранения уже вычисленных значений чисел Фибоначчи.

### JavaRush
## Черновик:
# # Мемеоизация Фибоначчи
#
# # Напишите функцию для вычисления n-го числа Фибоначчи с использованием мемоизации,
# # чтобы улучшить производительность по сравнению с простым рекурсивным подходом.
#
#
# def fibonacci_memo(n, memo={}):
# # Напишите тут ваш код
#
#
# # Пример использования
# n = 10
# print(f"fibonacci_memo({n}) = {fibonacci_memo(n)}")

### JavaRush
# Мемеоизация Фибоначчи

# Напишите функцию для вычисления n-го числа Фибоначчи с использованием мемоизации,
# чтобы улучшить производительность по сравнению с простым рекурсивным подходом.


def fibonacci_memo(n, memo={}):
# Напишите тут ваш код
    if n in memo:
        return memo[n]
    if n <= 1:
        return n
    memo[n] = fibonacci_memo(n - 1, memo) + fibonacci_memo(n - 2, memo)
    return memo[n]

# Пример использования
n = 10
print(f"fibonacci_memo({n}) = {fibonacci_memo(n)}")

### JavaRush
## Правильное решение:
## Author: JavaRush's team
# def fibonacci_memo(n, memo={}):
#     if n in memo:
#         return memo[n]
#     if n <= 1:
#         return n
#     memo[n] = fibonacci_memo(n - 1, memo) + fibonacci_memo(n - 2, memo)
#     return memo[n]
#
# # Пример использования
# n = 10
# print(f"fibonacci_memo({n}) = {fibonacci_memo(n)}")