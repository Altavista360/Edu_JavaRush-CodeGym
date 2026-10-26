## Authors: JavaRush's team, CodeGym's team, Altavista360
## Version: 1.0.0

### JavaRush
## Задача: Сортировка выбором
## Ссылка: https://javarush.com/tasks/ru.javarush.python.core.level18.task11

### CodeGym
## Task: Selection Sort
## Link: https://codegym.cc/tasks/en.codegym.python.core.level18.task11

### JavaRush
## Условие:
# Напишите функцию, которая использует сортировку выбором для сортировки списка строк по их длине.

### JavaRush
## Требования:
# • Программа должна включать функцию, которая принимает список строк в качестве аргумента.
# • Функция должна реализовывать алгоритм сортировки выбором для сортировки элементов списка.
# • Функция должна сортировать строки в списке по их длине, от самой короткой до самой длинной.
# • Функция должна возвращать новый список, содержащий строки в отсортированном порядке.

### JavaRush
## Черновик:
# # Сортировка выбором
#
# # Напишите функцию, которая использует сортировку выбором для сортировки списка строк по их длине.
#
# def selection_sort_by_length(strings):
# # Напишите тут ваш код
#
# # Пример использования
# strings = ["apple", "dog", "banana", "cat", "elephant"]
# sorted_strings = selection_sort_by_length(strings)
# print(sorted_strings)  # ['dog', 'cat', 'apple', 'banana', 'elephant']

### JavaRush
# Сортировка выбором

# Напишите функцию, которая использует сортировку выбором для сортировки списка строк по их длине.

def selection_sort_by_length(strings):
# Напишите тут ваш код
    n = len(strings)
    for i in range(n):
        min_idx = i
        for j in range(i + 1, n):
            if len(strings[j]) < len(strings[min_idx]):
                min_idx = j
        strings[i], strings[min_idx] = strings[min_idx], strings[i]
    return strings

# Пример использования
strings = ["apple", "dog", "banana", "cat", "elephant"]
sorted_strings = selection_sort_by_length(strings)
print(sorted_strings)  # ['dog', 'cat', 'apple', 'banana', 'elephant']

### JavaRush
## Правильное решение:
## Author: JavaRush's team
# def selection_sort_by_length(strings):
#     n = len(strings)
#     for i in range(n):
#         min_idx = i
#         for j in range(i + 1, n):
#             if len(strings[j]) < len(strings[min_idx]):
#                 min_idx = j
#         strings[i], strings[min_idx] = strings[min_idx], strings[i]
#     return strings
#
# # Пример использования
# strings = ["apple", "dog", "banana", "cat", "elephant"]
# sorted_strings = selection_sort_by_length(strings)
# print(sorted_strings)  # ['dog', 'cat', 'apple', 'banana', 'elephant']