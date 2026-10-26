## Authors: JavaRush's team, CodeGym's team, Altavista360
## Version: 1.0.0

### JavaRush
## Задача: Сортировка кортежей
## Ссылка: https://javarush.com/tasks/ru.javarush.python.core.level18.task10

### CodeGym
## Task: Sorting Tuples
## Link: https://codegym.cc/tasks/en.codegym.python.core.level18.task10

### JavaRush
## Условие:
# Напишите функцию, которая использует сортировку вставками для сортировки списка кортежей по первому элементу каждого кортежа.

### JavaRush
## Требования:
# • Программа должна включать функцию, которая принимает список кортежей в качестве аргумента.
# • Функция должна использовать алгоритм сортировки вставками для упорядочивания элементов списка.
# • Во время сортировки программа должна сравнивать и упорядочивать кортежи по значению их первого элемента.
# • Функция должна возвращать отсортированный список кортежей.

### JavaRush
## Черновик:
# # Сортировка кортежей
#
# # Напишите функцию, которая использует сортировку вставками для сортировки списка кортежей по первому элементу каждого кортежа.
#
#
# def insertion_sort_tuples(arr):
# # Напишите тут ваш код
#
#
# # Example usage:
# tuples_list = [(3, 'c'), (1, 'a'), (2, 'b'), (4, 'd')]
# sorted_list = insertion_sort_tuples(tuples_list)
# print(sorted_list)

### JavaRush
# Сортировка кортежей

# Напишите функцию, которая использует сортировку вставками для сортировки списка кортежей по первому элементу каждого кортежа.


def insertion_sort_tuples(arr):
# Напишите тут ваш код
    for i in range(1, len(arr)):
        key = arr[i]
        j = i - 1
        while j >= 0 and key[0] < arr[j][0]:
            arr[j + 1] = arr[j]
            j -= 1
        arr[j + 1] = key
    return arr

# Example usage:
tuples_list = [(3, 'c'), (1, 'a'), (2, 'b'), (4, 'd')]
sorted_list = insertion_sort_tuples(tuples_list)
print(sorted_list)

### JavaRush
## Правильное решение:
## Author: JavaRush's team
# def insertion_sort_tuples(arr):
#     for i in range(1, len(arr)):
#         key = arr[i]
#         j = i - 1
#         while j >= 0 and key[0] < arr[j][0]:
#             arr[j + 1] = arr[j]
#             j -= 1
#         arr[j + 1] = key
#     return arr
#
# # Example usage:
# tuples_list = [(3, 'c'), (1, 'a'), (2, 'b'), (4, 'd')]
# sorted_list = insertion_sort_tuples(tuples_list)
# print(sorted_list)