## Authors: JavaRush's team, CodeGym's team, Altavista360
## Version: 1.0.0

### JavaRush
## Задача: Сортировка слиянием
## Ссылка: https://javarush.com/tasks/ru.javarush.python.core.level18.task14

### CodeGym
## Task: Merge Sort
## Link: https://codegym.cc/tasks/en.codegym.python.core.level18.task14

### JavaRush
## Условие:
# Напишите функцию, которая использует алгоритм сортировки слиянием для сортировки массива чисел.

### JavaRush
## Требования:
# • Программа должна включать функцию с названием merge_sort, которая принимает массив чисел в качестве аргумента.
# • Функция merge_sort должна рекурсивно разделять массив на две половины до тех пор, пока массивы не станут размером один или пустыми.
# • Программа должна включать вспомогательную функцию, которая сливает два отсортированных массива в один отсортированный массив.
# • Функция merge_sort должна возвращать новый массив, который является отсортированной версией входного массива.

### JavaRush
## Черновик:
# # Сортировка слиянием
#
# # Напишите функцию, которая использует алгоритм сортировки слиянием для сортировки массива чисел.
#
# def merge(left, right):
#     sorted_array = []
#     left_index, right_index = 0, 0
#
#     while left_index < len(left) and right_index < len(right):
#         if left[left_index] < right[right_index]:
#             sorted_array.append(left[left_index])
#             left_index += 1
#         else:
#             sorted_array.append(right[right_index])
#             right_index += 1
#
#     sorted_array.extend(left[left_index:])
#     sorted_array.extend(right[right_index:])
#
#     return sorted_array
#
# def merge_sort(arr):
# # Напишите тут ваш код
#
# # Пример использования функции
# arr = [38, 27, 43, 3, 9, 82, 10]
# sorted_arr = merge_sort(arr)
# print(sorted_arr)

### JavaRush
# Сортировка слиянием

# Напишите функцию, которая использует алгоритм сортировки слиянием для сортировки массива чисел.

def merge(left, right):
    sorted_array = []
    left_index, right_index = 0, 0

    while left_index < len(left) and right_index < len(right):
        if left[left_index] < right[right_index]:
            sorted_array.append(left[left_index])
            left_index += 1
        else:
            sorted_array.append(right[right_index])
            right_index += 1

    sorted_array.extend(left[left_index:])
    sorted_array.extend(right[right_index:])

    return sorted_array

def merge_sort(arr):
# Напишите тут ваш код
    if len(arr) <= 1:
        return arr

    mid = len(arr) // 2
    left_half = merge_sort(arr[:mid])
    right_half = merge_sort(arr[mid:])

    return merge(left_half, right_half)

# Пример использования функции
arr = [38, 27, 43, 3, 9, 82, 10]
sorted_arr = merge_sort(arr)
print(sorted_arr)

### JavaRush
## Правильное решение:
## Author: JavaRush's team
# def merge(left, right):
#     sorted_array = []
#     left_index, right_index = 0, 0
#
#     while left_index < len(left) and right_index < len(right):
#         if left[left_index] < right[right_index]:
#             sorted_array.append(left[left_index])
#             left_index += 1
#         else:
#             sorted_array.append(right[right_index])
#             right_index += 1
#
#     sorted_array.extend(left[left_index:])
#     sorted_array.extend(right[right_index:])
#
#     return sorted_array
#
# def merge_sort(arr):
#     if len(arr) <= 1:
#         return arr
#
#     mid = len(arr) // 2
#     left_half = merge_sort(arr[:mid])
#     right_half = merge_sort(arr[mid:])
#
#     return merge(left_half, right_half)
#
# # Пример использования функции
# arr = [38, 27, 43, 3, 9, 82, 10]
# sorted_arr = merge_sort(arr)
# print(sorted_arr)