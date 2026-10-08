## Authors: JavaRush's team, CodeGym's team, Altavista360
## Version: 1.0.0

### JavaRush
## Задача: Хеш-функция для словаря
## Ссылка: https://javarush.com/tasks/ru.javarush.python.core.level16.task08

### CodeGym
## Task: Hash Function for a Dictionary
## Link: https://codegym.cc/tasks/en.codegym.python.core.level16.task08

### JavaRush
## Условие:
# Напиши свою хеш-функцию, которая возвращает целое число от 0 до 10к для словаря с произвольными элементами.

### JavaRush
## Требования:
# • Программа должна включать функцию, принимающую словарь в качестве входного параметра.
# • Функция должна возвращать целое число.
# • Значение, возвращаемое функцией, должно быть в диапазоне от 0 до 10,000 включительно.
# • Хеш-функция должна корректно обрабатывать словари независимо от их содержания, включая различные типы ключей и значений.

### JavaRush
## Черновик:
# # Хеш-функция для словаря
#
# # Напиши свою хеш-функцию, которая возвращает целое число от 0 до 10к для словаря с произвольными элементами.
#
# # Напишите тут ваш код

### JavaRush
# Хеш-функция для словаря

# Напиши свою хеш-функцию, которая возвращает целое число от 0 до 10к для словаря с произвольными элементами.

# Напишите тут ваш код

def custom_hash(d):
    hash_value = 0
    for key, value in d.items():
        hash_value += hash(key)
        hash_value += hash(value)
    return hash_value % 10000

### JavaRush
## Правильное решение:
## Author: JavaRush's team
# def custom_hash(d):
#     hash_value = 0
#     for key, value in d.items():
#         hash_value += hash(key)
#         hash_value += hash(value)
#     return hash_value % 10000
#
# # Пример использования
# sample_dict = {'apple': 1, 'banana': 2, 'cherry': 3}
# print(custom_hash(sample_dict))