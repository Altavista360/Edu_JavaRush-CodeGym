## Authors: JavaRush's team, CodeGym's team, Altavista360
## Version: 1.0.0

### JavaRush
## Задача: Урановые ломы в ртути
## Ссылка: https://javarush.com/tasks/ru.javarush.python.core.level18.task08

### CodeGym
## Task: Uranium bars in mercury
## Link: https://codegym.cc/tasks/en.codegym.python.core.level18.task08

### JavaRush
## Условие:
# Напишите функцию, которая использует сортировку пузырьком для сортировки списка чисел по убыванию.

### JavaRush
## Требования:
# • Программа должна включать функцию с именем sort_desc_bubble, которая принимает в качестве аргумента список чисел.
# • Функция sort_desc_bubble должна реализовывать алгоритм сортировки пузырьком для обработки списка чисел.
# • Функция sort_desc_bubble должна сортировать список чисел по убыванию, то есть от большего к меньшему.
# • Функция sort_desc_bubble должна возвращать отсортированный по убыванию список чисел.

### JavaRush
## Черновик:
# # Урановые ломы в ртути
#
# # Напишите функцию, которая использует сортировку пузырьком для сортировки списка чисел по убыванию.
#
#
# def sort_desc_bubble(arr):
# # Напишите тут ваш код
#
# # Пример использования
# numbers = [5, 3, 8, 4, 2]
# sorted_numbers = sort_desc_bubble(numbers)
# print(sorted_numbers)  # Вывод: [8, 5, 4, 3, 2]

### JavaRush
# Урановые ломы в ртути

# Напишите функцию, которая использует сортировку пузырьком для сортировки списка чисел по убыванию.


def sort_desc_bubble(arr):
# Напишите тут ваш код
    n = len(arr)
    for i in range(n):
        for j in range(0, n - i - 1):
            if arr[j] < arr[j + 1]:
                arr[j], arr[j + 1] = arr[j + 1], arr[j]
    return arr

# Пример использования
numbers = [5, 3, 8, 4, 2]
sorted_numbers = sort_desc_bubble(numbers)
print(sorted_numbers)  # Вывод: [8, 5, 4, 3, 2]

### JavaRush
## Правильное решение:
## Author: JavaRush's team
# def sort_desc_bubble(arr):
#     n = len(arr)
#     for i in range(n):
#         for j in range(0, n - i - 1):
#             if arr[j] < arr[j + 1]:
#                 arr[j], arr[j + 1] = arr[j + 1], arr[j]
#     return arr
#
# # Пример использования
# numbers = [5, 3, 8, 4, 2]
# sorted_numbers = sort_desc_bubble(numbers)
# print(sorted_numbers)  # Вывод: [8, 5, 4, 3, 2]