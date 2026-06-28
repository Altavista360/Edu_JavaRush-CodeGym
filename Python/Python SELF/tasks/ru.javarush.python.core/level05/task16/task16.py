## Authors: JavaRush's team, CodeGym's team, Altavista360
## Version: 1.0.0

### JavaRush
## Задача: Сортировка строк по длине
## Ссылка: https://javarush.com/tasks/ru.javarush.python.core.level05.task16

### CodeGym
## Task: Sorting strings by length
## Link: https://codegym.cc/tasks/en.codegym.python.core.level05.task16

### JavaRush
## Условие:
# Напишите программу, которая создает список из 5 строк, запрашиваемых у пользователя. Затем программа должна отсортировать список по длине строк и вывести отсортированный список.

### JavaRush
## Требования:
# • Программа должна создать список из 5 строк, которые запрашиваются у пользователя.
# • Программа должна запрашивать у пользователя ввод 5 строк.
# • Программа должна отсортировать список по длине строк.
# • Программа должна вывести отсортированный список.

### JavaRush
## Черновик:
# # Сортировка строк по длине
#
# # Напишите программу, которая создает список из 5 строк, запрашиваемых у пользователя.
# # Затем программа должна отсортировать список по длине строк и вывести отсортированный список.
#
# # Напишите тут ваш код

### JavaRush
Lorem ipsum dolor sit amet, consectetur adipiscing elit

### JavaRush
## Правильное решение:
## Author: JavaRush's team
# strings = []
# for _ in range(5):
#     string = input("Введите строку: ")
#     strings.append(string)
#
# sorted_strings = sorted(strings, key=len)
#
# print("Отсортированный список:")
# for string in sorted_strings:
#     print(string)