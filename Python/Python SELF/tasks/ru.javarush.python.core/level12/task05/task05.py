## Authors: JavaRush's team, CodeGym's team, Altavista360
## Version: 1.0.0

### JavaRush
## Задача: Создание файла
## Ссылка: https://javarush.com/tasks/ru.javarush.python.core.level12.task05

### CodeGym
## Task: Creating a File
## Link: https://codegym.cc/tasks/en.codegym.python.core.level12.task05

### JavaRush
## Условие:
# Напишите программу, которая создает новый файл example.txt и записывает в него строку "This is a new file."

### JavaRush
## Требования:
# • Программа должна создать новый файл с именем example.txt.
# • Программа должна записать строку "This is a new file." в файл example.txt.
# • Программа должна обеспечить закрытие файла example.txt после записи для предотвращения утечек ресурсов.

### JavaRush
## Черновик:
# # Создание файла
#
# # Напишите программу, которая создает новый файл example.txt и записывает в него строку "This is a new file."
#
# # Напишите тут ваш код

### JavaRush
# Создание файла

# Напишите программу, которая создает новый файл example.txt и записывает в него строку "This is a new file."

# Напишите тут ваш код

file = open("example.txt", "w")
file.write("This is a new file.")
file.close()

### JavaRush
## Правильное решение:
## Author: JavaRush's team
# # Открытие файла в режиме записи
# file = open("example.txt", "w")
#
# # Запись строки в файл
# file.write("This is a new file.")
#
# # Закрытие файла
# file.close()