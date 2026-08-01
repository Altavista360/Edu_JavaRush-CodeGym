## Authors: JavaRush's team, CodeGym's team, Altavista360
## Version: 1.0.0

### JavaRush
## Задача: Работа с директориями.
## Ссылка: https://javarush.com/tasks/ru.javarush.python.core.level08.task15

### CodeGym
## Task: Working with directories.
## Link: https://codegym.cc/tasks/en.codegym.python.core.level08.task15

### JavaRush
## Условие:
# Напишите программу, которая создает директорию, переходит в нее, создает файл внутри этой директории, записывает в файл текст, а затем читает и выводит его содержимое. Программа должна: Создать директорию test_directory. Перейти в директорию test_directory. Создать файл test_file.txt и записать в него строку "Hello, World!". Прочитать содержимое файла test_file.txt и вывести его на экран. Удалить файл и директорию.

### JavaRush
## Требования:
# • Программа должна создать директорию с именем "test_directory".
# • Программа должна перейти в созданную директорию "test_directory".
# • Программа должна создать файл с именем "test_file.txt" и записать в него строку "Hello, World!".
# • Программа должна прочитать содержимое файла "test_file.txt" и вывести его на экран.
# • Программа должна удалить файл "test_file.txt" и директорию "test_directory".

### JavaRush
## Черновик:
# # Работа с директориями.
#
# # Напишите программу, которая создает директорию, переходит в нее, создает файл внутри этой директории,
# # записывает в файл текст, а затем читает и выводит его содержимое.
# # Программа должна:
# # Создать директорию test_directory.
# # Перейти в директорию test_directory.
# # Создать файл test_file.txt и записать в него строку "Hello, World!".
# # Прочитать содержимое файла test_file.txt и вывести его на экран.
# # Удалить файл и директорию.
#
# # Напишите тут ваш код

### JavaRush
# Работа с директориями.

# Напишите программу, которая создает директорию, переходит в нее, создает файл внутри этой директории,
# записывает в файл текст, а затем читает и выводит его содержимое.
# Программа должна:
# Создать директорию test_directory.
# Перейти в директорию test_directory.
# Создать файл test_file.txt и записать в него строку "Hello, World!".
# Прочитать содержимое файла test_file.txt и вывести его на экран.
# Удалить файл и директорию.

# Напишите тут ваш код

import os
os.makedirs('test_directory', exist_ok=True)
os.chdir('test_directory')
with open('test_file.txt', 'w') as file:
    file.write('Hello, World!')
with open('test_file.txt', 'r') as file:
    content = file.read()
    print(content)
os.remove('test_file.txt')
os.chdir('..')
os.rmdir('test_directory')

### JavaRush
## Правильное решение:
## Author: JavaRush's team
# import os
#
# # Создаем директорию
# os.makedirs('test_directory', exist_ok=True)
#
# # Переходим в директорию
# os.chdir('test_directory')
#
# # Создаем файл и записываем в него строку
# with open('test_file.txt', 'w') as file:
#     file.write('Hello, World!')
#
# # Читаем содержимое файла
# with open('test_file.txt', 'r') as file:
#     content = file.read()
#     print(content)
#
# # Удаляем файл
# os.remove('test_file.txt')
#
# # Переходим в родительскую директорию
# os.chdir('..')
#
# # Удаляем директорию
# os.rmdir('test_directory')