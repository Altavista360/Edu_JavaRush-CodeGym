## Authors: JavaRush's team, CodeGym's team, Altavista360
## Version: 1.0.0

### JavaRush
## Задача: Соревнование
## Ссылка: https://javarush.com/tasks/ru.javarush.python.core.level16.task05

### CodeGym
## Task: Competition
## Link: https://codegym.cc/tasks/en.codegym.python.core.level16.task05

### JavaRush
## Условие:
# Напишите программу, которая измеряет время, которое затрачивают на поиск линейный и бинарный поиски. Подайте ей на вход массивы длинной 1, 2, 4, 8, ... 2^n элементов. Определите количество элементов, начиная с которого бинарный поиск эффективнее. Время на сортировку массива для бинарного поиска не учитывать.

### JavaRush
## Требования:
# • Программа должна генерировать массивы различной длины, увеличивающиеся в геометрической прогрессии (длины 2^n), начиная с массива длиной 1 элемент. n <=20
# • Программа должна реализовывать функцию линейного поиска, которая принимает на вход массив и искомое значение, и возвращает индекс этого значения или -1, если значение не найдено.
# • Программа должна реализовывать функцию бинарного поиска, которая принимает на вход отсортированный массив и искомое значение, и возвращает индекс этого значения или -1, если значение не найдено.
# • Программа должна измерять время выполнения линейного и бинарного поиска для каждого массива и выводить это время.
# • Программа должна сравнивать времена выполнения линейного и бинарного поиска и определять минимальное количество элементов, при котором бинарный поиск становится эффективнее линейного поиска.

### JavaRush
## Черновик:
# # Соревнование
#
# # Напишите программу, которая измеряет время, которое затрачивают на поиск линейный и бинарный поиски.
# # Подайте ей на вход массивы длинной 1, 2, 4, 8, ... 2^n элементов.
# # Определите количество элементов, начиная с которого бинарный поиск эффективнее.
# # Время на сортировку массива для бинарного поиска не учитывать.
#
# # Напишите тут ваш код

### JavaRush
# Соревнование

# Напишите программу, которая измеряет время, которое затрачивают на поиск линейный и бинарный поиски.
# Подайте ей на вход массивы длинной 1, 2, 4, 8, ... 2^n элементов.
# Определите количество элементов, начиная с которого бинарный поиск эффективнее.
# Время на сортировку массива для бинарного поиска не учитывать.

# Напишите тут ваш код

import random
import sys
import time

try:
    sys.stdout.reconfigure(encoding="utf-8")
except AttributeError:
    pass


def linear_search(array, value):
    for i, item in enumerate(array):
        if item == value:
            return i
    return -1


def binary_search(array, value):
    foo, bar = 0, len(array) - 1
    while foo <= bar:
        baz = (foo + bar) // 2
        if array[baz] == value:
            return baz
        elif arr[baz] < value:
            foo = baz + 1
        else:
            bar = baz - 1
    return -1


def measure(function, array, values, repeats):
    start = time.perf_counter()
    for _ in range(repeats):
        for value in values:
            function(array, value)
    return (time.perf_counter() - start) / (repeats * len(values))


random.seed(42)
result = []

print(f"{'Размер':>10} {'Линейный, мкс':>16} {'Бинарный, мкс':>16}")
for n in range(21):
    size = 2 ** n
    array = sorted(random.sample(range(size * 10 + 1), size))
    values = [random.choice(array) for _ in range(16)] + [size * 10 + 1] * 16
    repeats = max(1, min(100000, 1000000 // size))
    linear = measure(linear_search, array, values, repeats)
    binary = measure(binary_search, array, values, repeats)
    result.append((size, linear, binary))
    print(f"{size:>10} {linear * 1e6:>16.3f} {binary * 1e6:>16.3f}")

for size, linear, binary in result:
    if binary < linear:
        print(f"\nБинарный поиск быстрее с {size} элементов.")
        break

### JavaRush
## Правильное решение:
## Author: JavaRush's team
# import time
# import numpy as np
#
# def linear_search(arr, target):
#     for i in range(len(arr)):
#         if arr[i] == target:
#             return i
#     return -1
#
# def binary_search(arr, target):
#     left, right = 0, len(arr) - 1
#     while left <= right:
#         mid = (left + right) // 2
#         if arr[mid] == target:
#             return mid
#         elif arr[mid] < target:
#             left = mid + 1
#         else:
#             right = mid - 1
#     return -1
#
# def measure_time(search_func, arr, target):
#     start_time = time.time()
#     search_func(arr, target)
#     end_time = time.time()
#     return end_time - start_time
#
# n = 20
# target = -1  # Target that is not in the array to ensure full search
# threshold_found = False
#
# for i in range(n + 1):
#     arr_length = 2 ** i
#     arr = list(range(arr_length))  # Sorted array for binary search
#     linear_time = measure_time(linear_search, arr, target)
#     binary_time = measure_time(binary_search, arr, target)
#
#     print(f"Array length: {arr_length}, Linear search time: {linear_time:.6f}, Binary search time: {binary_time:.6f}")
#
#     if binary_time < linear_time and not threshold_found:
#         print(f"Binary search becomes more efficient at array length: {arr_length}")
#         threshold_found = True
#         break
#
# if not threshold_found:
#     print("Binary search did not become more efficient within the given range.")