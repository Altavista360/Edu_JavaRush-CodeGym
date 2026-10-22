## Authors: JavaRush's team, CodeGym's team, Altavista360
## Version: 1.0.0

### JavaRush
## Задача: Рекурсивный поиск
## Ссылка: https://javarush.com/tasks/ru.javarush.python.core.level18.task03

### CodeGym
## Task: Recursive Search
## Link: https://codegym.cc/tasks/en.codegym.python.core.level18.task03

### JavaRush
## Условие:
# Напишите рекурсивный алгоритм для проверки, присутствует ли определённое значение в отсортированном массиве строк.

### JavaRush
## Требования:
# • Программа должна включать рекурсивную функцию, которая проверяет наличие определённого значения в отсортированном массиве строк.
# • Функция должна принимать четыре параметра: сам массив строк, искомое значение, начальный и конечный индексы.
# • Функция должна возвращать логическое значение (true или false), указывающее на присутствие или отсутствие искомого значения в массиве.
# • Функция должна использовать свойство отсортированности массива для сокращения числа проверок (например, сравнивать искомое значение с текущим элементом и двигаться дальше только в случае необходимости).
# • Функция должна реализовывать логику поиска рекурсивно, вызывая саму себя с обновленными параметрами до тех пор, пока не будет найдено искомое значение или не будут проверены все элементы массива.

### JavaRush
## Черновик:
# # Рекурсивный поиск
#
# # Напишите рекурсивный алгоритм для проверки, присутствует ли определённое значение в отсортированном массиве строк.
#
#
# def recursive_search(arr, target, left, right):
# # Напишите тут ваш код
#
# def is_value_present(arr, target):
#     return recursive_search(arr, target, 0, len(arr) - 1)
#
# # Пример использования:
# arr = ["apple", "banana", "cherry", "date", "fig", "grape", "kiwi"]
# target = "cherry"
# print(is_value_present(arr, target))  # Output: True
#
# target = "mango"
# print(is_value_present(arr, target))  # Output: False

### JavaRush
# Рекурсивный поиск

# Напишите рекурсивный алгоритм для проверки, присутствует ли определённое значение в отсортированном массиве строк.


def recursive_search(arr, target, left, right):
# Напишите тут ваш код
    if left > right:
        return False

    mid = (left + right) // 2

    if arr[mid] == target:
        return True
    elif arr[mid] < target:
        return recursive_search(arr, target, mid + 1, right)
    else:
        return recursive_search(arr, target, left, mid - 1)

def is_value_present(arr, target):
    return recursive_search(arr, target, 0, len(arr) - 1)

# Пример использования:
arr = ["apple", "banana", "cherry", "date", "fig", "grape", "kiwi"]
target = "cherry"
print(is_value_present(arr, target))  # Output: True

target = "mango"
print(is_value_present(arr, target))  # Output: False

### JavaRush
## Правильное решение:
## Author: JavaRush's team
# def recursive_search(arr, target, left, right):
#     if left > right:
#         return False
#
#     mid = (left + right) // 2
#
#     if arr[mid] == target:
#         return True
#     elif arr[mid] < target:
#         return recursive_search(arr, target, mid + 1, right)
#     else:
#         return recursive_search(arr, target, left, mid - 1)
#
# def is_value_present(arr, target):
#     return recursive_search(arr, target, 0, len(arr) - 1)
#
# # Пример использования:
# arr = ["apple", "banana", "cherry", "date", "fig", "grape", "kiwi"]
# target = "cherry"
# print(is_value_present(arr, target))  # Output: True
#
# target = "mango"
# print(is_value_present(arr, target))  # Output: False