## Authors: JavaRush's team, CodeGym's team, Altavista360
## Version: 1.0.0

### JavaRush
## Задача: Сумма чисел
## Ссылка: https://javarush.com/tasks/ru.javarush.python.core.level16.task15

### CodeGym
## Task: Sum of numbers
## Link: https://codegym.cc/tasks/en.codegym.python.core.level16.task15

### JavaRush
## Условие:
# Дан массив чисел и целевое значение суммы. Необходимо найти все пары чисел, которые в сумме дают целевое значение.

### JavaRush
## Требования:
# • Программа должна принимать массив чисел и целевое значение суммы в качестве входных данных.
# • Программа должна находить все пары чисел из массива, которые в сумме дают целевое значение.
# • Программа должна возвращать список пар чисел, где каждая пара представлена в виде кортежа (например, (a, b)).
# • Программа должна корректно обрабатывать массивы, содержащие как положительные, так и отрицательные числа.
# • Программа должна игнорировать порядок чисел в парах, то есть (a, b) и (b, a) считаются одной и той же парой.

### JavaRush
## Черновик:
# # Сумма чисел
#
# # Дан массив чисел и целевое значение суммы. Необходимо найти все пары чисел, которые в сумме дают целевое значение.
#
# def find_pairs(nums, target):
# # Напишите тут ваш код
#
#
# # Пример использования
# nums = [2, 4, 3, 5, 7, 8, 9]
# target = 10
# print(find_pairs(nums, target))

### JavaRush
# Сумма чисел

# Дан массив чисел и целевое значение суммы. Необходимо найти все пары чисел, которые в сумме дают целевое значение.

def find_pairs(nums, target):
# Напишите тут ваш код
    pairs = []
    seen = set()

    for num in nums:
        complement = target - num
        if complement in seen:
            pairs.append((complement, num))
        seen.add(num)

    return pairs

# Пример использования
nums = [2, 4, 3, 5, 7, 8, 9]
target = 10
print(find_pairs(nums, target))

### JavaRush
## Правильное решение:
## Author: JavaRush's team
# def find_pairs(nums, target):
#     pairs = []
#     seen = set()
#
#     for num in nums:
#         complement = target - num
#         if complement in seen:
#             pairs.append((complement, num))
#         seen.add(num)
#
#     return pairs
#
# # Пример использования
# nums = [2, 4, 3, 5, 7, 8, 9]
# target = 10
# print(find_pairs(nums, target))