## Authors: JavaRush's team, CodeGym's team, Altavista360
## Version: 1.0.0

### JavaRush
## Задача: Объединение массивов
## Ссылка: https://javarush.com/tasks/ru.javarush.python.core.level18.task13

### CodeGym
## Task: Merging Arrays
## Link: https://codegym.cc/tasks/en.codegym.python.core.level18.task13

### JavaRush
## Условие:
# У тебя есть два отсортированных массива чисел, напиши код, который объединит их в один отсортированный массив.

### JavaRush
## Требования:
# • Программа должна принимать два отсортированных массива чисел в качестве входных данных.
# • Программа должна объединить два входных массива в один.
# • Программа должна гарантировать, что объединенный массив остается отсортированным.
# • Программа должна выводить результирующий объединенный отсортированный массив.

### JavaRush
## Черновик:
# # Объединение массивов
#
# # У тебя есть два отсортированных массива чисел, напиши код, который объединит их в один отсортированный массив.
#
#
# def merge_sorted_arrays(arr1, arr2):
# # Напишите тут ваш код
#
#
# # Пример использования
# arr1 = [1, 3, 5, 7]
# arr2 = [2, 4, 6, 8]
# merged_array = merge_sorted_arrays(arr1, arr2)
# print(merged_array)  # Вывод: [1, 2, 3, 4, 5, 6, 7, 8]

### JavaRush
# Объединение массивов

# У тебя есть два отсортированных массива чисел, напиши код, который объединит их в один отсортированный массив.


def merge_sorted_arrays(arr1, arr2):
# Напишите тут ваш код
    i, j = 0, 0
    merged_array = []

    while i < len(arr1) and j < len(arr2):
        if arr1[i] < arr2[j]:
            merged_array.append(arr1[i])
            i += 1
        else:
            merged_array.append(arr2[j])
            j += 1

    while i < len(arr1):
        merged_array.append(arr1[i])
        i += 1

    while j < len(arr2):
        merged_array.append(arr2[j])
        j += 1

    return merged_array

# Пример использования
arr1 = [1, 3, 5, 7]
arr2 = [2, 4, 6, 8]
merged_array = merge_sorted_arrays(arr1, arr2)
print(merged_array)  # Вывод: [1, 2, 3, 4, 5, 6, 7, 8]

### JavaRush
## Правильное решение:
## Author: JavaRush's team
# def merge_sorted_arrays(arr1, arr2):
#     i, j = 0, 0
#     merged_array = []
#
#     while i < len(arr1) and j < len(arr2):
#         if arr1[i] < arr2[j]:
#             merged_array.append(arr1[i])
#             i += 1
#         else:
#             merged_array.append(arr2[j])
#             j += 1
#
#     while i < len(arr1):
#         merged_array.append(arr1[i])
#         i += 1
#
#     while j < len(arr2):
#         merged_array.append(arr2[j])
#         j += 1
#
#     return merged_array
#
# # Пример использования
# arr1 = [1, 3, 5, 7]
# arr2 = [2, 4, 6, 8]
# merged_array = merge_sorted_arrays(arr1, arr2)
# print(merged_array)  # Вывод: [1, 2, 3, 4, 5, 6, 7, 8]