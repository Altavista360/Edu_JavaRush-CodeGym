## Authors: JavaRush's team, CodeGym's team, Altavista360
## Version: 1.0.0

### JavaRush
## Задача: Режимы доступа
## Ссылка: https://javarush.com/tasks/ru.javarush.python.core.level12.task02

### CodeGym
## Task: Access Modes
## Link: https://codegym.cc/tasks/en.codegym.python.core.level12.task02

### JavaRush
## Условие:
# Напишите программу, которая создает или открывает файл example.txt в режиме записи и записывает в него строку "Hello, World!". Затем откройте файл в режиме добавления и добавьте строку "Appended text.".

### JavaRush
## Требования:
# • Программа должна создавать или открывать существующий файл с именем example.txt в режиме записи ('w'), чтобы записать в него определенное содержание.
# • Программа должна включать операцию записи строки "Hello, World!" в файл example.txt, открытый в режиме записи.
# • Программа должна открывать файл example.txt в режиме добавления ('a'), чтобы добавить новое содержание к уже существующему.
# • Программа должна включать операцию добавления строки "Appended text." в файл example.txt, открытый в режиме добавления.

### JavaRush
## Черновик:
# # Режимы доступа
#
# # Напишите программу, которая создает или открывает файл example.txt в режиме записи и
# # записывает в него строку "Hello, World!".
# # Затем откройте файл в режиме добавления и добавьте строку "Appended text.".
#
# # Напишите тут ваш код

### JavaRush
# Режимы доступа

# Напишите программу, которая создает или открывает файл example.txt в режиме записи и
# записывает в него строку "Hello, World!".
# Затем откройте файл в режиме добавления и добавьте строку "Appended text.".

# Напишите тут ваш код

file = open('example.txt', 'w')
file.write("Hello, World!")
file.close()
file = open('example.txt', 'a')
file.write("Appended text.")
file.close()

### JavaRush
## Правильное решение:
## Author: JavaRush's team
# # Открытие файла в режиме записи и запись строки "Hello, World!"
# file = open('example.txt', 'w')
# file.write("Hello, World!")
# file.close()
#
# # Открытие файла в режиме добавления и добавление строки "Appended text."
# file = open('example.txt', 'a')
# file.write("Appended text.")
# file.close()