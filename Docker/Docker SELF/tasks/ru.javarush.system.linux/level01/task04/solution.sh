## Authors: JavaRush's team, CodeGym's team, Altavista360
## Version: 1.0.0

### JavaRush
## Задача: Определение текущего пользователя
## Ссылка: https://javarush.com/tasks/ru.javarush.system.linux.level01.task04

### CodeGym
## Task: Creating and Navigating
## Link: https://codegym.cc/tasks/en.codegym.system.linux.level01.task04

### JavaRush
## Условие:
# Напишите последовательность команд, которая:
# 1. Создаёт новую директорию example_directory в текущей рабочей директории.
# 2. Перемещается в созданную директорию example_directory.
# 3. Показывает содержимое текущей директории (список файлов и папок).

### CodeGym
## Condition:
# Write a sequence of commands that:
# 1. Creates a new directory named example_directory in the current working directory.
# 2. Navigates into the newly created directory example_directory.
# 3. Displays the contents of the current directory (list of files and folders).

### JavaRush
## Требования:
# • Последовательность команд должна включать создание новой директории с именем `example_directory` с использованием команды `mkdir`.
# • После создания директории необходимо использовать команду `cd` для перехода в созданную директорию.
# • Последовательность команд должна показывать содержимое текущей директории с помощью команды `ls`.
# • Команда перехода в созданную директорию должна использовать относительный путь.
# • Последовательность команд должна строго следовать указанным шагам, без выполнения дополнительных операций.

### CodeGym
## Requirements:
# • The sequence of commands must include creating a new directory named `example_directory` using the `mkdir` command.
# • After creating the directory, you must use the `cd` command to navigate into the newly created directory.
# • The sequence of commands must display the contents of the current directory using the `ls` command.
# • The command to navigate into the newly created directory must use a relative path.
# • The sequence of commands must strictly follow the specified steps without performing any additional operations.

### JavaRush
## Черновик:
# # Создание директории example_directory
#
#
# # Перемещение в директорию example_directory
#
#
# # Показ содержимого текущей директории

### CodeGym
## Draft:
# # Creating the directory example_directory
#
#
# # Navigating into the directory example_directory
#
#
# # Displaying the contents of the current directory

### JavaRush
# Создание директории example_directory
mkdir example_directory

# Перемещение в директорию example_directory
cd example_directory

# Показ содержимого текущей директории
ls

### CodeGym
# Creating the directory example_directory
mkdir example_directory

# Navigating into the directory example_directory
cd example_directory

# Displaying the contents of the current directory
ls

### JavaRush
## Правильное решение:
## Author: JavaRush's team
# # Создание директории example_directory
# mkdir example_directory
#
# # Перемещение в директорию example_directory
# cd example_directory
#
# # Показ содержимого текущей директории
# ls

### CodeGym
## Correct solution:
## Author: CodeGym's team
# # Creating the directory example_directory
# mkdir example_directory
#
# # Navigating into the directory example_directory
# cd example_directory
#
# # Displaying the contents of the current directory
# ls