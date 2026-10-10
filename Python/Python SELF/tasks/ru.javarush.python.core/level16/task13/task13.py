## Authors: JavaRush's team, CodeGym's team, Altavista360
## Version: 1.0.0

### JavaRush
## Задача: Поиск дубликатов
## Ссылка: https://javarush.com/tasks/ru.javarush.python.core.level16.task13

### CodeGym
## Task: Finding Duplicates
## Link: https://codegym.cc/tasks/en.codegym.python.core.level16.task13

### JavaRush
## Условие:
# Дан массив чисел. Необходимо найти и вернуть все дубликаты в массиве.

### JavaRush
## Требования:
# • Программа должна принимать на вход массив чисел.
# • Программа должна проверять каждый элемент массива на наличие дубликатов.
# • Программа должна собирать все числа, которые встречаются более одного раза, в отдельную коллекцию.
# • Программа должна возвращать коллекцию, содержащую все числа-дубликаты.

### JavaRush
## Черновик:
# # Поиск дубликатов
#
# # Дан массив чисел. Необходимо найти и вернуть все дубликаты в массиве.
#
# def find_duplicates(nums):
#     # Напишите тут ваш код
#
#
# # Пример использования:
# nums = [1, 2, 3, 2, 4, 5, 6, 3, 7, 8, 1]
# print(find_duplicates(nums))  # Output: [2, 3, 1]

### JavaRush
# Поиск дубликатов

# Дан массив чисел. Необходимо найти и вернуть все дубликаты в массиве.

def find_duplicates(nums):
    # Напишите тут ваш код
    duplicates = []
    seen = set()
    for num in nums:
        if num in seen:
            duplicates.append(num)
        else:
            seen.add(num)
    return duplicates

# Пример использования:
nums = [1, 2, 3, 2, 4, 5, 6, 3, 7, 8, 1]
print(find_duplicates(nums))  # Output: [2, 3, 1]

### JavaRush
## Правильное решение:
## Author: JavaRush's team
# def find_duplicates(nums):
#     duplicates = []
#     seen = set()
#     for num in nums:
#         if num in seen:
#             duplicates.append(num)
#         else:
#             seen.add(num)
#     return duplicates
#
# # Пример использования:
# nums = [1, 2, 3, 2, 4, 5, 6, 3, 7, 8, 1]
# print(find_duplicates(nums))  # Output: [2, 3, 1]