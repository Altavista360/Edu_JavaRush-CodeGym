## Authors: JavaRush's team, CodeGym's team, Altavista360
## Version: 1.0.0

### JavaRush
## Задача: Создание и удаление директорий
## Ссылка: https://javarush.com/tasks/ru.javarush.python.core.level12.task13

### CodeGym
## Task: Creating and Deleting Directories
## Link: https://codegym.cc/tasks/en.codegym.python.core.level12.task13

### JavaRush
## Условие:
# Напишите программу, которая создает новую директорию new_directory. Затем создает вложенную директорию parent_directory/child_directory. А затем удаляет созданные директории.

### JavaRush
## Требования:
# • Программа должна создать новую директорию под названием new_directory.
# • Программа должна создать вложенную директорию с путем parent_directory/child_directory.
# • Программа должна удалить созданную директорию new_directory после выполнения операций.
# • Программа должна удалить вложенную директорию parent_directory/child_directory после выполнения операций.

### JavaRush
## Черновик:
# # Создание и удаление директорий
#
# # Напишите программу, которая создает новую директорию new_directory.
# # Затем создает вложенную директорию parent_directory/child_directory.
# # А затем удаляет созданные директории.
#
# import os
# import shutil
#
# # Создание директории new_directory
# # Напишите тут ваш код
#
# # Создание вложенной директории parent_directory/child_directory
# # Напишите тут ваш код
#
# # Удаление директории new_directory
# # Напишите тут ваш код
#
# # Удаление вложенной директории parent_directory/child_directory
# # Напишите тут ваш код

### JavaRush
# Создание и удаление директорий

# Напишите программу, которая создает новую директорию new_directory.
# Затем создает вложенную директорию parent_directory/child_directory.
# А затем удаляет созданные директории.

import os
import shutil

# Создание директории new_directory
# Напишите тут ваш код
os.makedirs('new_directory')

# Создание вложенной директории parent_directory/child_directory
# Напишите тут ваш код
os.makedirs('parent_directory/child_directory')

# Удаление директории new_directory
# Напишите тут ваш код
shutil.rmtree('new_directory')

# Удаление вложенной директории parent_directory/child_directory
# Напишите тут ваш код
shutil.rmtree('parent_directory')

### JavaRush
## Правильное решение:
## Author: JavaRush's team
# import os
# import shutil
#
# # Создание директории new_directory
# os.makedirs('new_directory')
#
# # Создание вложенной директории parent_directory/child_directory
# os.makedirs('parent_directory/child_directory')
#
# # Удаление директории new_directory
# shutil.rmtree('new_directory')
#
# # Удаление вложенной директории parent_directory/child_directory
# shutil.rmtree('parent_directory')