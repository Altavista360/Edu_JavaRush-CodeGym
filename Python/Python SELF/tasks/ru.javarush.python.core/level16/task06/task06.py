## Authors: JavaRush's team, CodeGym's team, Altavista360
## Version: 1.0.0

### JavaRush
## Задача: Лучший поиск
## Ссылка: https://javarush.com/tasks/ru.javarush.python.core.level16.task06

### CodeGym
## Task: The Best Search
## Link: https://codegym.cc/tasks/en.codegym.python.core.level16.task06

### JavaRush
## Условие:
# Напишите программу которая выяснит, что какой способ поиска в массиве из 1000 элементов быстрее: Способ 1: 10 раз воспользоваться линейным поиском. Способ 2: отсортировать массив + 10 раз воспользоваться бинарным поиском.

### JavaRush
## Требования:
# • Программа должна создать массив из 1000 случайных элементов.
# • Программа должна реализовать функцию линейного поиска и выполнить её 10 раз на несортированном массиве.
# • Программа должна отсортировать массив и затем выполнить бинарный поиск 10 раз.
# • Программа должна измерить и сравнить время выполнения для обоих способов поиска.
# • Программа должна вывести результаты сравнения времени выполнения линейного и бинарного поисков.

### JavaRush
## Черновик:
# # Лучший поиск
#
# # Напишите программу которая выяснит, что какой способ поиска в массиве из 1000 элементов быстрее:
# # Способ 1: 10 раз воспользоваться линейным поиском.
# # Способ 2: отсортировать массив + 10 раз воспользоваться бинарным поиском.
#
# # Напишите тут ваш код

### JavaRush
# Лучший поиск

# Напишите программу которая выяснит, что какой способ поиска в массиве из 1000 элементов быстрее:
# Способ 1: 10 раз воспользоваться линейным поиском.
# Способ 2: отсортировать массив + 10 раз воспользоваться бинарным поиском.

# Напишите тут ваш код

import random
import time

def linear(a, x):
    return x in a

def binary(a, x):
    l, r = 0, len(a) - 1
    while l <= r:
        m = (l + r) // 2
        if a[m] == x:
            return True
        if a[m] < x:
            l = m + 1
        else:
            r = m - 1
    return False

a = [random.randint(1, 10000) for _ in range(1000)]
x = [random.choice(a) for _ in range(10)]

t = time.perf_counter()
for i in x:
    linear(a, i)
t1 = time.perf_counter() - t

t = time.perf_counter()
b = sorted(a)
for i in x:
    binary(b, i)
t2 = time.perf_counter() - t

print(f"Линейный поиск: {t1:.8f} с")
print(f"Сортировка и бинарный поиск: {t2:.8f} с")
print("Быстрее:", "линейный поиск" if t1 < t2 else "бинарный поиск")

### JavaRush
## Правильное решение:
## Author: JavaRush's team
# import time
# import random
# import bisect
#
# arr = [random.randint(1, 10000) for _ in range(1000)]
#
# def linear_search(arr, target):
#     for i in range(len(arr)):
#         if arr[i] == target:
#             return i
#     return -1
#
# start_time = time.time()
# for _ in range(10):
#     target = random.choice(arr)
#     linear_search(arr, target)
# linear_search_time = time.time() - start_time
#
# sorted_arr = sorted(arr)
#
# def binary_search(arr, target):
#     index = bisect.bisect_left(arr, target)
#     if index != len(arr) and arr[index] == target:
#         return index
#     return -1
#
# start_time = time.time()
# for _ in range(10):
#     target = random.choice(sorted_arr)
#     binary_search(sorted_arr, target)
# binary_search_time = time.time() - start_time
#
# print(f"Время линейного поиска: {linear_search_time:.6f} секунд")
# print(f"Время бинарного поиска после сортировки: {binary_search_time:.6f} секунд")