## Authors: JavaRush's team, CodeGym's team, Altavista360
## Version: 1.0.0

### JavaRush
## Задача: Выбор среднего элемента
## Ссылка: https://javarush.com/tasks/ru.javarush.python.core.level18.task16

### CodeGym
## Task: Selecting the pivot element
## Link: https://codegym.cc/tasks/en.codegym.python.core.level18.task16

### JavaRush
## Условие:
# Добавь в функцию quick_sort возможность передавать способ выбора среднего значение через lambda-функцию. Предложи 5 вариантов выбора среднего числа для быстрой сортировки.

### JavaRush
## Требования:
# • Функция quick_sort должна принимать дополнительный параметр для выбора среднего элемента, который будет lambda-функцией.
# • Параметром для выбора среднего элемента должна быть lambda-функция, которую можно передать при вызове функции quick_sort.
# • Функция quick_sort должна поддерживать как минимум пять различных способов выбора среднего элемента, реализованных через lambda-функции.

### JavaRush
## Черновик:
# # Выбор среднего элемента
#
# # Добавь в функцию quick_sort возможность передавать способ выбора среднего значение через lambda-функцию.
# # Предложи 5 вариантов выбора среднего числа для быстрой сортировки.
#
# # Напишите тут ваш код
#
# def quick_sort(arr, pivot_selection):
# # Напишите тут ваш код
#
# # 5 вариантов выбора функции pivot_selection
# # 1. Первый элемент
# pivot_first = lambda arr: arr[0]
#
# # 2. Последний элемент
# pivot_last = # Напишите тут ваш код
#
# 3. Средний элемент
# pivot_middle = # Напишите тут ваш код
#
# # 4. Случайный элемент
# import random
# pivot_random = # Напишите тут ваш код
#
# # 5. Среднее арифметическое из трех: первый, последний и средний
# pivot_median_three = # Напишите тут ваш код
#
# # Example usage:
# arr = [3, 6, 8, 10, 1, 2, 1]
# print(quick_sort(arr, pivot_first))
# print(quick_sort(arr, pivot_last))
# print(quick_sort(arr, pivot_middle))
# print(quick_sort(arr, pivot_random))
# print(quick_sort(arr, pivot_median_three))

### JavaRush
# Выбор среднего элемента

# Добавь в функцию quick_sort возможность передавать способ выбора среднего значение через lambda-функцию.
# Предложи 5 вариантов выбора среднего числа для быстрой сортировки.

# Напишите тут ваш код

def quick_sort(arr, pivot_selection):
# Напишите тут ваш код
    if len(arr) <= 1:
        return arr
    pivot = pivot_selection(arr)
    left = [x for x in arr if x < pivot]
    middle = [x for x in arr if x == pivot]
    right = [x for x in arr if x > pivot]
    return quick_sort(left, pivot_selection) + middle + quick_sort(right, pivot_selection)

# 5 вариантов выбора функции pivot_selection
# 1. Первый элемент
pivot_first = lambda arr: arr[0]

# 2. Последний элемент
pivot_last = lambda arr: arr[-1] # Напишите тут ваш код

# 3. Средний элемент
pivot_middle = lambda arr: arr[len(arr) // 2] # Напишите тут ваш код

# 4. Случайный элемент
import random
pivot_random = lambda arr: arr[random.randint(0, len(arr) - 1)] # Напишите тут ваш код

# 5. Среднее арифметическое из трех: первый, последний и средний
pivot_median_three = lambda arr: sorted([arr[0], arr[len(arr) // 2], arr[-1]])[1] # Напишите тут ваш код

# Example usage:
arr = [3, 6, 8, 10, 1, 2, 1]
print(quick_sort(arr, pivot_first))
print(quick_sort(arr, pivot_last))
print(quick_sort(arr, pivot_middle))
print(quick_sort(arr, pivot_random))
print(quick_sort(arr, pivot_median_three))

### JavaRush
## Правильное решение:
## Author: JavaRush's team
# def quick_sort(arr, pivot_selection):
#     if len(arr) <= 1:
#         return arr
#     pivot = pivot_selection(arr)
#     left = [x for x in arr if x < pivot]
#     middle = [x for x in arr if x == pivot]
#     right = [x for x in arr if x > pivot]
#     return quick_sort(left, pivot_selection) + middle + quick_sort(right, pivot_selection)
#
# # 5 variants of pivot selection
#
# # 1. First element
# pivot_first = lambda arr: arr[0]
#
# # 2. Last element
# pivot_last = lambda arr: arr[-1]
#
# # 3. Middle element
# pivot_middle = lambda arr: arr[len(arr) // 2]
#
# # 4. Random element
# import random
# pivot_random = lambda arr: arr[random.randint(0, len(arr) - 1)]
#
# # 5. Median of three (first, middle, last)
# pivot_median_three = lambda arr: sorted([arr[0], arr[len(arr) // 2], arr[-1]])[1]
#
# # Example usage:
# arr = [3, 6, 8, 10, 1, 2, 1]
# print(quick_sort(arr, pivot_first))
# print(quick_sort(arr, pivot_last))
# print(quick_sort(arr, pivot_middle))
# print(quick_sort(arr, pivot_random))
# print(quick_sort(arr, pivot_median_three))