## Authors: JavaRush's team, CodeGym's team, Altavista360
## Version: 1.0.0

### JavaRush
## Задача: Сортировка вставками
## Ссылка: https://javarush.com/tasks/ru.javarush.python.core.level18.task09

### CodeGym
## Task: Insertion Sort
## Link: https://codegym.cc/tasks/en.codegym.python.core.level18.task09

### JavaRush
## Условие:
# Напишите функцию, которая использует сортировку вставками для сортировки списка строк в алфавитном порядке.

### JavaRush
## Требования:
# • Программа должна включать функцию, которая реализует алгоритм сортировки вставками для сортировки списка строк в алфавитном порядке.
# • Функция должна принимать на вход список строк, который требуется отсортировать.
# • Функция должна возвращать новый список строк, отсортированный в алфавитном порядке.
# • Функция должна использовать алгоритм сортировки вставками, который предполагает последовательное перемещение каждого элемента списка в его правильную позицию относительно уже отсортированных элементов.

### JavaRush
## Черновик:
# # Сортировка вставками
#
# # Напишите функцию, которая использует сортировку вставками для сортировки списка строк в алфавитном порядке.
#
#
# def insertion_sort(strings):
# # Напишите тут ваш код
#
#
# # Пример использования:
# strings = ["banana", "apple", "cherry", "date"]
# sorted_strings = insertion_sort(strings)
# print(sorted_strings)  # Output: ['apple', 'banana', 'cherry', 'date']

### JavaRush
# Сортировка вставками

# Напишите функцию, которая использует сортировку вставками для сортировки списка строк в алфавитном порядке.


def insertion_sort(strings):
# Напишите тут ваш код
    for i in range(1, len(strings)):
        key = strings[i]
        j = i - 1
        while j >= 0 and strings[j] > key:
            strings[j + 1] = strings[j]
            j -= 1
        strings[j + 1] = key
    return strings

# Пример использования:
strings = ["banana", "apple", "cherry", "date"]
sorted_strings = insertion_sort(strings)
print(sorted_strings)  # Output: ['apple', 'banana', 'cherry', 'date']

### JavaRush
## Правильное решение:
## Author: JavaRush's team
# def insertion_sort(strings):
#     for i in range(1, len(strings)):
#         key = strings[i]
#         j = i - 1
#         while j >= 0 and strings[j] > key:
#             strings[j + 1] = strings[j]
#             j -= 1
#         strings[j + 1] = key
#     return strings
#
# # Пример использования:
# strings = ["banana", "apple", "cherry", "date"]
# sorted_strings = insertion_sort(strings)
# print(sorted_strings)  # Output: ['apple', 'banana', 'cherry', 'date']