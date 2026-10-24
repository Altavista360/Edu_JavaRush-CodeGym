## Authors: JavaRush's team, CodeGym's team, Altavista360
## Version: 1.0.0

### JavaRush
## Задача: Сортировка пузырьком
## Ссылка: https://javarush.com/tasks/ru.javarush.python.core.level18.task07

### CodeGym
## Task: Bubble Sort
## Link: https://codegym.cc/tasks/en.codegym.python.core.level18.task07

### JavaRush
## Условие:
# Напишите функцию, которая использует сортировку пузырьком для сортировки списка строк по их длине.

### JavaRush
## Требования:
# • Программа должна включать функцию bubble_sort_by_length, которая принимает список строк в качестве аргумента.
# • Программа должна использовать алгоритм сортировки пузырьком для упорядочивания строк в списке.
# • При сортировке элементы списка должны сравниваться по их длине, а не по лексикографическому порядку.
# • Если строка имеет большую длину, чем следующая за ней строка, они должны быть поменяны местами.
# • Функция bubble_sort_by_length должна возвращать отсортированный по длине строк список.

### JavaRush
## Черновик:
# # Сортировка пузырьком
#
# # Напишите функцию, которая использует сортировку пузырьком для сортировки списка строк по их длине.
#
# def bubble_sort_by_length(arr):
# # Напишите тут ваш код
#
#
# # Пример использования
# strings = ["apple", "banana", "kiwi", "cherry", "mango"]
# sorted_strings = bubble_sort_by_length(strings)
# print(sorted_strings)

### JavaRush
# Сортировка пузырьком

# Напишите функцию, которая использует сортировку пузырьком для сортировки списка строк по их длине.

def bubble_sort_by_length(arr):
# Напишите тут ваш код
    n = len(arr)
    for i in range(n):
        for j in range(0, n-i-1):
            if len(arr[j]) > len(arr[j+1]):
                arr[j], arr[j+1] = arr[j+1], arr[j]
    return arr

# Пример использования
strings = ["apple", "banana", "kiwi", "cherry", "mango"]
sorted_strings = bubble_sort_by_length(strings)
print(sorted_strings)

### JavaRush
## Правильное решение:
## Author: JavaRush's team
# def bubble_sort_by_length(arr):
#     n = len(arr)
#     for i in range(n):
#         for j in range(0, n-i-1):
#             if len(arr[j]) > len(arr[j+1]):
#                 arr[j], arr[j+1] = arr[j+1], arr[j]
#     return arr
#
# # Пример использования
# strings = ["apple", "banana", "kiwi", "cherry", "mango"]
# sorted_strings = bubble_sort_by_length(strings)
# print(sorted_strings)