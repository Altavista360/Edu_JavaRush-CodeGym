## Authors: JavaRush's team, CodeGym's team, Altavista360
## Version: 1.0.0

### JavaRush
## Задача: Близкий друг
## Ссылка: https://javarush.com/tasks/ru.javarush.python.core.level18.task04

### CodeGym
## Task: Close Friend
## Link: https://codegym.cc/tasks/en.codegym.python.core.level18.task04

### JavaRush
## Условие:
# Напишите рекурсивный алгоритм для поиска элемента, наиболее близкого к заданному значению в отсортированном массиве.

### JavaRush
## Требования:
# • Программа должна включать рекурсивную функцию для поиска элемента, наиболее близкого к заданному значению в отсортированном массиве.
# • Функция должна принимать четыре аргумента: отсортированный массив, начальный и конечный индексы рассматриваемого подмассива, и заданное значение.
# • Функция должна корректно делить массив на подмассивы и вызывать саму себя с новыми индексами, чтобы продолжить поиск.
# • Функция должна иметь условие завершения, при котором достигается базовый случай, и возвращается наилучшее найденное значение.
# • Функция должна сравнивать текущий элемент с заданным значением и проверять, является ли он наиболее близким на текущий момент.

### JavaRush
## Черновик:
# # Близкий друг
#
# # Напишите рекурсивный алгоритм для поиска элемента, наиболее близкого к заданному значению в отсортированном массиве.
#
#
# def closest_element(arr, low, high, target, best=None):
# # Напишите тут ваш код
#
#
# Пример использования:
# arr = [1, 3, 5, 8, 10, 14, 17]
# target = 9
# result = closest_element(arr, 0, len(arr) - 1, target)
# print(f"Element closest to {target} is {result}") # 8

### JavaRush
# Близкий друг

# Напишите рекурсивный алгоритм для поиска элемента, наиболее близкого к заданному значению в отсортированном массиве.


def closest_element(arr, low, high, target, best=None):
# Напишите тут ваш код
    if low > high:
        return best

    mid = (low + high) // 2

    if best is None or abs(arr[mid] - target) < abs(best - target):
        best = arr[mid]

    if arr[mid] < target:
        return closest_element(arr, mid + 1, high, target, best)
    else:
        return closest_element(arr, low, mid - 1, target, best)

# Пример использования:
arr = [1, 3, 5, 8, 10, 14, 17]
target = 9
result = closest_element(arr, 0, len(arr) - 1, target)
print(f"Element closest to {target} is {result}") # 8

### JavaRush
## Правильное решение:
## Author: JavaRush's team
# def closest_element(arr, low, high, target, best=None):
#     if low > high:
#         return best
#
#     mid = (low + high) // 2
#
#     if best is None or abs(arr[mid] - target) < abs(best - target):
#         best = arr[mid]
#
#     if arr[mid] < target:
#         return closest_element(arr, mid + 1, high, target, best)
#     else:
#         return closest_element(arr, low, mid - 1, target, best)
#
#
# # Пример использования:
# arr = [1, 3, 5, 8, 10, 14, 17]
# target = 9
# result = closest_element(arr, 0, len(arr) - 1, target)
# print(f"Element closest to {target} is {result}") # 8