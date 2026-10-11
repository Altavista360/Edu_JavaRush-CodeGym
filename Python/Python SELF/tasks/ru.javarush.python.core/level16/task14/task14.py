## Authors: JavaRush's team, CodeGym's team, Altavista360
## Version: 1.0.0

### JavaRush
## Задача: Анаграммы
## Ссылка: https://javarush.com/tasks/ru.javarush.python.core.level16.task14

### CodeGym
## Task: Anagrams
## Link: https://codegym.cc/tasks/en.codegym.python.core.level16.task14

### JavaRush
## Условие:
# Даны две строки. Необходимо определить, являются ли они анаграммами (содержат одни и те же символы в одинаковом количестве).

### JavaRush
## Требования:
# • Программа должна принимать две строки в качестве входных данных.
# • Программа должна проверять, содержат ли обе строки одни и те же символы в одинаковом количестве.
# • Программа должна выводить булево значение (True или False), указывающее, являются ли строки анаграммами.
# • Программа должна учитывать только символы, игнорируя регистр (например, "Listen" и "Silent" должны считаться анаграммами).

### JavaRush
## Черновик:
# # Анаграммы
#
# # Даны две строки. Необходимо определить, являются ли они анаграммами (содержат одни и те же символы в одинаковом количестве).
#
#
# def are_anagrams(str1, str2):
# # Напишите тут ваш код
#
#
# # Примеры использования
# str1 = "listen"
# str2 = "silent"
# print(are_anagrams(str1, str2))  # True
#
# str1 = "hello"
# str2 = "bello"
# print(are_anagrams(str1, str2))  # False

### JavaRush
# Анаграммы

# Даны две строки. Необходимо определить, являются ли они анаграммами (содержат одни и те же символы в одинаковом количестве).


def are_anagrams(str1, str2):
# Напишите тут ваш код
    return sorted(str1.lower()) == sorted(str2.lower())

# Примеры использования
str1 = "listen"
str2 = "silent"
print(are_anagrams(str1, str2))  # True

str1 = "hello"
str2 = "bello"
print(are_anagrams(str1, str2))  # False

### JavaRush
## Правильное решение:
## Author: JavaRush's team
# def are_anagrams(str1, str2):
#     return sorted(str1.lower()) == sorted(str2.lower())
#
# # Примеры использования
# str1 = "listen"
# str2 = "silent"
# print(are_anagrams(str1, str2))  # True
#
# str1 = "hello"
# str2 = "bello"
# print(are_anagrams(str1, str2))  # False