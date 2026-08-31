## Authors: JavaRush's team, CodeGym's team, Altavista360
## Version: 1.0.0

### JavaRush
## Задача: Использование оператора with для работы с файлами
## Ссылка: https://javarush.com/tasks/ru.javarush.python.core.level12.task08

### CodeGym
## Task: Using the with statement for file operations
## Link: https://codegym.cc/tasks/en.codegym.python.core.level12.task08

### JavaRush
## Условие:
# Напишите программу, которая открывает файл example.txt в режиме добавления, записывает в него строку "Новая линия.". Нужно корректно обрабатывать исключение FileNotFoundError, закрывая файл в любом случае. Нужно использовать оператор with для автоматического закрытия файла.

### JavaRush
## Требования:
# • Программа должна использовать оператор with для автоматического открытия и закрытия файла.
# • Программа должна открывать файл example.txt в режиме добавления ('a').
# • Программа должна записывать строку "Новая линия." в файл example.txt.
# • Программа должна корректно обрабатывать исключение FileNotFoundError.

### JavaRush
## Черновик:
# # Использование оператора with для работы с файлами
#
# # Напишите программу, которая открывает файл example.txt в режиме добавления, записывает в него строку "Новая линия.".
# # Нужно корректно обрабатывать исключение FileNotFoundError, закрывая файл в любом случае.
# # Нужно использовать оператор with для автоматического закрытия файла.
#
# # Напишите тут ваш код

### JavaRush
# Использование оператора with для работы с файлами

# Напишите программу, которая открывает файл example.txt в режиме добавления, записывает в него строку "Новая линия.".
# Нужно корректно обрабатывать исключение FileNotFoundError, закрывая файл в любом случае.
# Нужно использовать оператор with для автоматического закрытия файла.

# Напишите тут ваш код

try:
    with open('example.txt', 'a', encoding='utf-8') as file:
        file.write('Новая линия.')
except FileNotFoundError:
    print("Файл не найден.")

### JavaRush
## Правильное решение:
## Author: JavaRush's team
# try:
#     with open('example.txt', 'a', encoding='utf-8') as file:
#         file.write('Новая линия.')
# except FileNotFoundError:
#     print("Файл не найден.")