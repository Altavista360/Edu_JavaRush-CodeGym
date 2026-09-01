## Authors: JavaRush's team, CodeGym's team, Altavista360
## Version: 1.0.0

### JavaRush
## Задача: Проверка существования файла
## Ссылка: https://javarush.com/tasks/ru.javarush.python.core.level12.task12

### CodeGym
## Task: File Existence Check
## Link: https://codegym.cc/tasks/en.codegym.python.core.level12.task12

### JavaRush
## Условие:
# Напишите программу, которая проверяет, существует ли файл example.txt, и если существует, удаляет его.

### JavaRush
## Требования:
# • Проверка существования файла example.txt
# • Удаление файла example.txt, если он существует
# • Вывод сообщения о результате проверки и удаления файла

### JavaRush
## Черновик:
# # Проверка существования файла
#
# # Напишите программу, которая проверяет, существует ли файл example.txt, и если существует, удаляет его.
#
# # Напишите тут ваш код

### JavaRush
# Проверка существования файла

# Напишите программу, которая проверяет, существует ли файл example.txt, и если существует, удаляет его.

# Напишите тут ваш код

import os

if os.path.exists('example.txt'):
    os.remove('example.txt')
    print("Файл 'example.txt' удалён.")
else:
    print("Файл 'example.txt' не найден.")

### JavaRush
## Правильное решение:
## Author: JavaRush's team
# import os
#
# file_path = 'example.txt'
#
# if os.path.exists(file_path):
#     os.remove(file_path)
#     print(f'Файл {file_path} был удалён.')
# else:
#     print(f'Файл {file_path} не существует.')