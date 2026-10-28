## Authors: JavaRush's team, CodeGym's team, Altavista360
## Version: 1.0.0

### JavaRush
## Задача: Быстрая сортировка
## Ссылка: https://javarush.com/tasks/ru.javarush.python.core.level18.task15

### CodeGym
## Task: Quick Sort
## Link: https://codegym.cc/tasks/en.codegym.python.core.level18.task15

### JavaRush
## Условие:
# Напишите функцию, которая реализует алгоритм быстрой сортировки для сортировки массива чисел.

### JavaRush
## Требования:
# • Программа должна включать функцию, которая реализует алгоритм быстрой сортировки для сортировки массива чисел.
# • Функция должна принимать один аргумент — массив чисел, который необходимо отсортировать.
# • Функция должна возвращать новый массив чисел, отсортированный в порядке возрастания.
# • Функция должна использовать рекурсивный подход для реализации алгоритма быстрой сортировки.
# • Функция должна выбирать опорный элемент для разделения массива на подмассивы.

### JavaRush
## Черновик:
# # Быстрая сортировка
#
# # Напишите функцию, которая реализует алгоритм быстрой сортировки для сортировки массива чисел.
#
# def quick_sort(arr):
# # Напишите тут ваш код
#
#
# # Пример использования
# array = [3, 6, 8, 10, 1, 2, 1]
# sorted_array = quick_sort(array)
# print(sorted_array)

### JavaRush
# Быстрая сортировка

# Напишите функцию, которая реализует алгоритм быстрой сортировки для сортировки массива чисел.

def quick_sort(arr):
# Напишите тут ваш код
    if len(arr) <= 1:
        return arr
    else:
        pivot = arr[len(arr) // 2]
        left = [x for x in arr if x < pivot]
        middle = [x for x in arr if x == pivot]
        right = [x for x in arr if x > pivot]
        return quick_sort(left) + middle + quick_sort(right)

# Пример использования
array = [3, 6, 8, 10, 1, 2, 1]
sorted_array = quick_sort(array)
print(sorted_array)

### JavaRush
## Правильное решение:
## Author: JavaRush's team
# def quick_sort(arr):
#     if len(arr) <= 1:
#         return arr
#     else:
#         pivot = arr[len(arr) // 2]
#         left = [x for x in arr if x < pivot]
#         middle = [x for x in arr if x == pivot]
#         right = [x for x in arr if x > pivot]
#         return quick_sort(left) + middle + quick_sort(right)
#
# # Пример использования
# array = [3, 6, 8, 10, 1, 2, 1]
# sorted_array = quick_sort(array)
# print(sorted_array)