## Authors: JavaRush's team, CodeGym's team, Altavista360
## Version: 1.0.0

### JavaRush
## Задача: Сортировка чисел
## Ссылка: https://javarush.com/tasks/ru.javarush.python.core.level18.task12

### CodeGym
## Task: Sorting Numbers
## Link: https://codegym.cc/tasks/en.codegym.python.core.level18.task12

### JavaRush
## Условие:
# Напишите функцию, которая использует сортировку выбором для сортировки списка чисел по возрастанию.

### JavaRush
## Требования:
# • Программа должна включать функцию, которая принимает на вход список чисел.
# • Функция должна реализовать алгоритм сортировки выбором для упорядочивания элементов списка по возрастанию.
# • Функция должна возвращать новый список чисел, отсортированный по возрастанию.

### JavaRush
## Черновик:
# # Сортировка чисел
#
# # Напишите функцию, которая использует сортировку выбором для сортировки списка чисел по возрастанию.
#
#
# def selection_sort(arr):
# # Напишите тут ваш код
#
# # Пример использования
# numbers = [64, 25, 12, 22, 11]
# sorted_numbers = selection_sort(numbers)
# print(sorted_numbers)  # Вывод: [11, 12, 22, 25, 64]

### JavaRush
# Сортировка чисел

# Напишите функцию, которая использует сортировку выбором для сортировки списка чисел по возрастанию.


def selection_sort(arr):
# Напишите тут ваш код
def selection_sort(arr):
    for i in range(len(arr)):
        min_idx = i
        for j in range(i+1, len(arr)):
            if arr[j] < arr[min_idx]:
                min_idx = j
        arr[i], arr[min_idx] = arr[min_idx], arr[i]
    return arr

# Пример использования
numbers = [64, 25, 12, 22, 11]
sorted_numbers = selection_sort(numbers)
print(sorted_numbers)  # Вывод: [11, 12, 22, 25, 64]

### JavaRush
## Правильное решение:
## Author: JavaRush's team
# def selection_sort(arr):
#     for i in range(len(arr)):
#         min_idx = i
#         for j in range(i+1, len(arr)):
#             if arr[j] < arr[min_idx]:
#                 min_idx = j
#         arr[i], arr[min_idx] = arr[min_idx], arr[i]
#     return arr
#
# # Пример использования
# numbers = [64, 25, 12, 22, 11]
# sorted_numbers = selection_sort(numbers)
# print(sorted_numbers)  # Вывод: [11, 12, 22, 25, 64]