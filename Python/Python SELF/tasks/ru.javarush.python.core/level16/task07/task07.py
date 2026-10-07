## Authors: JavaRush's team, CodeGym's team, Altavista360
## Version: 1.0.0

### JavaRush
## Задача: Хеш-функция
## Ссылка: https://javarush.com/tasks/ru.javarush.python.core.level16.task07

### CodeGym
## Task: Hash Function
## Link: https://codegym.cc/tasks/en.codegym.python.core.level16.task07

### JavaRush
## Условие:
# Напиши свою хеш-функцию, которая возвращает целое число от 0 до 10к для строки произвольной длинны.

### JavaRush
## Требования:
# • Программа должна включать функцию custom_hash, которая принимает строку в качестве аргумента.
# • Функция должна возвращать целое число.
# • Возвращаемое целое число должно быть в диапазоне от 0 до 10 000 (не включительно).
# • Функция должна корректно обрабатывать строки произвольной длины.

### JavaRush
## Черновик:
# # Хеш-функция
#
# # Напиши свою хеш-функцию, которая возвращает целое число от 0 до 10к для строки произвольной длинны.
#
# # Напишите тут ваш код

### JavaRush
# Хеш-функция

# Напиши свою хеш-функцию, которая возвращает целое число от 0 до 10к для строки произвольной длинны.

# Напишите тут ваш код

def custom_hash(s):
    foo = 0
    bar = 31
    for char in s:
        foo = (foo * bar + ord(char)) % 10000
    return foo

example_string = "Hello, World!"
print(custom_hash(example_string))

### JavaRush
## Правильное решение:
## Author: JavaRush's team
# def custom_hash(s):
#     hash_value = 0
#     prime = 31
#     for char in s:
#         hash_value = (hash_value * prime + ord(char)) % 10000
#     return hash_value
#
# # Пример использования
# example_string = "Hello, World!"
# print(custom_hash(example_string))