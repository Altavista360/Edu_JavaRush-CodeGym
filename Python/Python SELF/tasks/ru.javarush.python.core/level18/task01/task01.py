## Authors: JavaRush's team, CodeGym's team, Altavista360
## Version: 1.0.0

### JavaRush
## Задача: Дерево файлов
## Ссылка: https://javarush.com/tasks/ru.javarush.python.core.level18.task01

### CodeGym
## Task: File tree
## Link: https://codegym.cc/tasks/en.codegym.python.core.level18.task01

### JavaRush
## Условие:
# Напишите рекурсивный алгоритм для обхода дерева файлов. Алгоритм должен обходить каталог и все его подкаталоги, выводя список всех файлов и папок.

### JavaRush
## Требования:
# • Программа должна включать рекурсивную функцию, которая принимая на вход путь к директории, будет обходить все её содержимое, включая подкаталоги.
# • Программа должна выводить на экран имена всех файлов и папок, находящихся в текущем каталоге.
# • Если текущий элемент является подкаталогом, функция должна рекурсивно вызывать саму себя для обхода содержимого этого подкаталога.
# • Функция должна определять, является ли текущий элемент файлом или директорией, чтобы правильно обрабатывать их.
# • Программа должна начинаться с вызова рекурсивной функции с указанием начального каталога, который необходимо обойти.

### JavaRush
## Черновик:
# # Дерево файлов
#
# # Напишите рекурсивный алгоритм для обхода дерева файлов.
# # Алгоритм должен обходить каталог и все его подкаталоги, выводя список всех файлов и папок.
#
# import os
#
# def traverse_directory(path):
# # Напишите тут ваш код
#
# # Пример использования
# start_path = '/path/to/start/directory'  # Замените на нужный путь
# traverse_directory(start_path)

### JavaRush
# Дерево файлов

# Напишите рекурсивный алгоритм для обхода дерева файлов.
# Алгоритм должен обходить каталог и все его подкаталоги, выводя список всех файлов и папок.

import os

def traverse_directory(path):
# Напишите тут ваш код
    try:
        for entry in os.listdir(path):
            full_path = os.path.join(path, entry)
            print(full_path)
            if os.path.isdir(full_path):
                traverse_directory(full_path)
    except PermissionError:
        pass

# Пример использования
start_path = '/path/to/start/directory'  # Замените на нужный путь
traverse_directory(start_path)

### JavaRush
## Правильное решение:
## Author: JavaRush's team
# import os
#
# def traverse_directory(path):
#     try:
#         for entry in os.listdir(path):
#             full_path = os.path.join(path, entry)
#             print(full_path)
#             if os.path.isdir(full_path):
#                 traverse_directory(full_path)
#     except PermissionError:
#         pass  # Игнорируем каталоги, к которым нет доступа
#
# # Пример использования
# start_path = '/path/to/start/directory'  # Замените на нужный путь
# traverse_directory(start_path)