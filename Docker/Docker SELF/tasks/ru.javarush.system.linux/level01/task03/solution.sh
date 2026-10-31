## Authors: JavaRush's team, CodeGym's team, Altavista360
## Version: 1.0.0

### JavaRush
## Задача: Создание и перемещение
## Ссылка: https://javarush.com/tasks/ru.javarush.system.linux.level01.task03

### CodeGym
## Task: Creating and Navigating
## Link: https://codegym.cc/tasks/en.codegym.system.linux.level01.task03

### JavaRush
## Условие:
# Напишите последовательность команд, которая:
# 1. Создаёт новую директорию example в текущей рабочей директории.
# 2. Перемещается в созданную директорию example.
# 3. Создаёт новую директорию project в текущей рабочей директории.
# 4. Перемещается в созданную директорию project.

### CodeGym
## Condition:
# Write a sequence of commands that:
# 1. Creates a new directory named `example` in the current working directory.
# 2. Moves into the newly created `example` directory.
# 3. Creates a new directory named `project` within the current working directory.
# 4. Moves into the newly created `project` directory.

### JavaRush
## Требования:
# • Создание директорий должно быть выполнено с помощью команды `mkdir`.
# • Все переходы между директориями должны осуществляться только с использованием команды `cd`.
# • Необходимо создать директорию с именем `example` в текущей рабочей директории.
# • После создания директории `example` необходимо выполнить переход в неё.
# • Внутри директории `example` должна быть создана директория с именем `project`.
# • После создания директории `project` необходимо выполнить переход в неё.
# • Команды должны быть выполнены строго в указанной последовательности.

### CodeGym
## Requirements:
# • The directory creation should be performed using the `mkdir` command.
# • All directory transitions should be performed only using the `cd` command.
# • You must create a directory named `example` in the current working directory.
# • After creating the `example` directory, you need to navigate into it.
# • Inside the `example` directory, you must create a directory named `project`.
# • After creating the `project` directory, you need to navigate into it.
# • Commands must be executed strictly in the specified sequence.

### JavaRush
## Черновик:
# # Создание директории example в текущей рабочей директории
#
#
# # Переход в созданную директорию example
#
#
# # Создание директории project внутри example
#
#
# # Переход в созданную директорию project

### CodeGym
## Draft:
# # Create the `example` directory in the current working directory
#
#
# # Navigate into the newly created `example` directory
#
#
# # Create the `project` directory inside `example`
#
#
# # Navigate into the newly created `project` directory

### JavaRush
# Создание директории example в текущей рабочей директории
mkdir example

# Переход в созданную директорию example
cd example

# Создание директории project внутри example
mkdir project

# Переход в созданную директорию project
cd project

### CodeGym
# Create the `example` directory in the current working directory
mkdir example

# Navigate into the newly created `example` directory
cd example

# Create the `project` directory inside `example`
mkdir project

# Navigate into the newly created `project` directory
cd project

### JavaRush
## Правильное решение:
## Author: JavaRush's team
# # Создание директории example в текущей рабочей директории
# mkdir example
#
# # Переход в созданную директорию example
# cd example
#
# # Создание директории project внутри example
# mkdir project
#
# # Переход в созданную директорию project
# cd project

### CodeGym
## Correct solution:
## Author: CodeGym's team
# # Create the `example` directory in the current working directory
# mkdir example
#
# # Navigate into the newly created `example` directory
# cd example
#
# # Create the `project` directory inside `example`
# mkdir project
#
# # Navigate into the newly created `project` directory
# cd project