## Authors: JavaRush's team, CodeGym's team, Altavista360
## Version: 1.0.0

### JavaRush
## Задача: Обработка ошибок при работе с файлами
## Ссылка: https://javarush.com/tasks/ru.javarush.python.core.level12.task07

### CodeGym
## Task: Error handling when working with files
## Link: https://codegym.cc/tasks/en.codegym.python.core.level12.task07

### JavaRush
## Условие:
# Напишите программу, которая открывает файл example.txt в режиме добавления, записывает в него строку "Новая линия.". Нужно корректно обрабатывать исключение FileNotFoundError, закрывая файл в любом случае.

### JavaRush
## Требования:
# • Программа должна включать операцию открытия файла example.txt в режиме добавления ('a').
# • Программа должна записать строку "Новая линия." в открытый файл example.txt.
# • Программа должна корректно обрабатывать возможное исключение FileNotFoundError.
# • Программа должна закрыть файл независимо от того, возникло исключение или нет.
# • Программа не должна использовать оператор with.

### JavaRush
## Черновик:
# # Обработка ошибок при работе с файлами
#
# # Напишите программу, которая открывает файл example.txt в режиме добавления, записывает в него строку "Новая линия.".
# # Нужно корректно обрабатывать исключение FileNotFoundError, закрывая файл в любом случае.
#
# # Напишите тут ваш код

### JavaRush
# Обработка ошибок при работе с файлами

# Напишите программу, которая открывает файл example.txt в режиме добавления, записывает в него строку "Новая линия.".
# Нужно корректно обрабатывать исключение FileNotFoundError, закрывая файл в любом случае.

# Напишите тут ваш код

file = None
try:
    file = open('example.txt', 'a')
    file.write("Новая линия.")
except FileNotFoundError:
    print("Файл не найден.")
finally:
    if file:
        file.close()

### JavaRush
## Правильное решение:
## Author: JavaRush's team
# file = None 
# try:
#     file = open('example.txt', 'a')
#     file.write("Новая линия.")
# except FileNotFoundError:
#     print("Файл не найден.")
# finally:
#     if file:
#         file.close()