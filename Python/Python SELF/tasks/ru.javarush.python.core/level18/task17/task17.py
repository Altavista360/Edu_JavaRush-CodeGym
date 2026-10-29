## Authors: JavaRush's team, CodeGym's team, Altavista360
## Version: 1.0.0

### JavaRush
## Задача: Лучший алгоритм
## Ссылка: https://javarush.com/tasks/ru.javarush.python.core.level18.task17

### CodeGym
## Task: The Best Algorithm
## Link: https://codegym.cc/tasks/en.codegym.python.core.level18.task17

### JavaRush
## Условие:
# Дан массив из 10 элементов, определи какой из алгоритмов сортировки лучше всего подойдет для него. Подсказка: попробуй различные алгоритмы и оставь лучший

### JavaRush
## Требования:
# • Программа должна включать массив из 10 элементов с заданными значениями.
# • Программа должна реализовать как минимум три различных алгоритма сортировки, таких как пузырьковая сортировка, быстрая сортировка и сортировка вставками.
# • Программа должна измерять и сравнивать время выполнения каждого из реализованных алгоритмов сортировки для данного массива.
# • Программа должна вывести на экран название алгоритма с наименьшим временем выполнения, определяя его как "лучший" для данного массива.

### JavaRush
## Черновик:
# # Лучший алгоритм
# # Дан массив из 10 элементов, определи какой из алгоритмов сортировки лучше всего подойдет для него.
# # Подсказка: попробуй различный алгоритмы и оставь лучший
#
# import time
#
# def measure_time(func, arr):
#     start_time = time.time()
#     func(arr)
#     end_time = time.time()
#     return end_time - start_time
#
# array = [5, 3, 8, 6, 2, 7, 1, 0, 9, 4]
#
# # Напишите тут ваш код

### JavaRush
# Лучший алгоритм
# Дан массив из 10 элементов, определи какой из алгоритмов сортировки лучше всего подойдет для него.
# Подсказка: попробуй различный алгоритмы и оставь лучший

import time

def measure_time(func, arr):
    start_time = time.time()
    func(arr)
    end_time = time.time()
    return end_time - start_time

array = [5, 3, 8, 6, 2, 7, 1, 0, 9, 4]

# Напишите тут ваш код
def bubble_sort(arr):
    new_arr = arr.copy()
    n = len(new_arr)
    for i in range(n):
        for j in range(0, n-i-1):
            if new_arr[j] > new_arr[j+1]:
                new_arr[j], new_arr[j+1] = new_arr[j+1], new_arr[j]
    return new_arr

def insertion_sort(arr):
    new_arr = arr.copy()
    for i in range(1, len(new_arr)):
        key = new_arr[i]
        j = i - 1
        while j >= 0 and key < new_arr[j]:
            new_arr[j + 1] = new_arr[j]
            j -= 1
        new_arr[j + 1] = key
    return new_arr

def quick_sort(arr):
    if len(arr) <= 1:
        return arr
    pivot = arr[len(arr) // 2]
    left = [x for x in arr if x < pivot]
    middle = [x for x in arr if x == pivot]
    right = [x for x in arr if x > pivot]
    return quick_sort(left) + middle + quick_sort(right)

algorithms = {
    "Сортировка пузырьком": bubble_sort,
    "Сортировка вставками": insertion_sort,
    "Быстрая сортировка": quick_sort
}

times = {name: measure_time(func, array) for name, func in algorithms.items()}
best_algorithm = min(times, key=times.get)

print(f"Лучший алгоритм: {best_algorithm}")

### JavaRush
## Правильное решение:
## Author: JavaRush's team
# import time
#
# def measure_time(func, arr):
#     start_time = time.time()
#     func(arr)
#     end_time = time.time()
#     return end_time - start_time
#
# array = [5, 3, 8, 6, 2, 7, 1, 0, 9, 4]
#
# def bubble_sort(arr):
#     new_arr = arr.copy()
#     n = len(new_arr)
#     for i in range(n):
#         for j in range(0, n-i-1):
#             if new_arr[j] > new_arr[j+1]:
#                 new_arr[j], new_arr[j+1] = new_arr[j+1], new_arr[j]
#     return new_arr
#
# def insertion_sort(arr):
#     new_arr = arr.copy()
#     for i in range(1, len(new_arr)):
#         key = new_arr[i]
#         j = i - 1
#         while j >= 0 and key < new_arr[j]:
#             new_arr[j + 1] = new_arr[j]
#             j -= 1
#         new_arr[j + 1] = key
#     return new_arr
#
# def quick_sort(arr):
#     if len(arr) <= 1:
#         return arr
#     pivot = arr[len(arr) // 2]
#     left = [x for x in arr if x < pivot]
#     middle = [x for x in arr if x == pivot]
#     right = [x for x in arr if x > pivot]
#     return quick_sort(left) + middle + quick_sort(right)
#
# algorithms = {
#     "Bubble Sort": bubble_sort,
#     "Insertion Sort": insertion_sort,
#     "Quick Sort": quick_sort
# }
#
# times = {name: measure_time(func, array) for name, func in algorithms.items()}
# best_algorithm = min(times, key=times.get)
#
# print(f"Лучший алгоритм: {best_algorithm}")