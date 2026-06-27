## Authors: JavaRush's team, CodeGym's team, Altavista360
## Version: 1.0.0

### JavaRush
## Задача: Генератор квадратов
## Ссылка: https://javarush.com/tasks/ru.javarush.python.core.level05.task13

### CodeGym
## Task: Square Generator
## Link: https://codegym.cc/tasks/en.codegym.python.core.level05.task13

### JavaRush
## Условие:
# Напишите программу, которая создает список квадратов чисел от 1 до 10 с использованием List Comprehension. Программа должна вывести полученный список.

### JavaRush
## Требования:
# • Программа должна создать список с использованием List Comprehension.
# • Программа должна создать список квадратов чисел от 1 до 10 с использованием List Comprehension.
# • Программа должна вывести созданный список на экран.

### JavaRush
## Черновик:
# # Генератор квадратов
#
# # Напишите программу, которая создает список квадратов чисел от 1 до 10 с использованием List Comprehension.
# # Программа должна вывести полученный список.
#
# # Напишите тут ваш код

### JavaRush
# Генератор квадратов

# Напишите программу, которая создает список квадратов чисел от 1 до 10 с использованием List Comprehension.
# Программа должна вывести полученный список.

# Напишите тут ваш код

foo = [x**2 for x in range(1, 11)]
print(foo)

### JavaRush
## Правильное решение:
## Author: JavaRush's team
# squares = [x**2 for x in range(1, 11)]
# print(squares)