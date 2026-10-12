## Authors: JavaRush's team, CodeGym's team, Altavista360
## Version: 1.0.0

### JavaRush
## Задача: Общий подмассив
## Ссылка: https://javarush.com/tasks/ru.javarush.python.core.level16.task16

### CodeGym
## Task: Common Subarray
## Link: https://codegym.cc/tasks/en.codegym.python.core.level16.task16

### JavaRush
## Условие:
# Даны два массива чисел. Необходимо найти элементы первого массива, которые существуют во втором массиве.

### JavaRush
## Требования:
# • Программа должна содержать два массива чисел, представляющих входные данные.
# • Программа должна найти пересекающиеся элементы первого и второго массивов.
# • Программа должна вернуть массив чисел, которые присутствуют в обоих исходных массивах.

### JavaRush
## Черновик:
# # Общий подмассив
#
# # Даны два массива чисел. Необходимо найти элементы первого массива, которые существуют во втором массиве.
#
#
#
# def common_subarray(arr1, arr2):
# # Напишите тут ваш код
#
#
# # Пример использования
# arr1 = [1, 2, 3, 4, 5]
# arr2 = [3, 4, 5, 6, 7]
#
# result = common_subarray(arr1, arr2)
# print(result)

### JavaRush
# Общий подмассив

# Даны два массива чисел. Необходимо найти элементы первого массива, которые существуют во втором массиве.



def common_subarray(arr1, arr2):
# Напишите тут ваш код
    return [element for element in arr1 if element in arr2]

# Пример использования
arr1 = [1, 2, 3, 4, 5]
arr2 = [3, 4, 5, 6, 7]

result = common_subarray(arr1, arr2)
print(result)

### JavaRush
## Правильное решение:
## Author: JavaRush's team
# def common_subarray(arr1, arr2):
#     return [element for element in arr1 if element in arr2]
#
# # Пример использования
# arr1 = [1, 2, 3, 4, 5]
# arr2 = [3, 4, 5, 6, 7]
#
# result = common_subarray(arr1, arr2)
# print(result)