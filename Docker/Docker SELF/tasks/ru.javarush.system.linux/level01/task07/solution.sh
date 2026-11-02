## Authors: JavaRush's team, CodeGym's team, Altavista360
## Version: 1.0.0

### JavaRush
## Задача: Определение текущего пользователя
## Ссылка: https://javarush.com/tasks/ru.javarush.system.linux.level01.task07

### CodeGym
## Task: Navigating Between Directories
## Link: https://codegym.cc/tasks/en.codegym.system.linux.level01.task07

### JavaRush
## Условие:
# Переходы между директориями
# Выполните следующую последовательность команд:
# 1. Перейдите в домашнюю директорию.
# 2. Создайте папку с именем practice_dir.
# 3. Перейдите в папку practice_dir.
# 4. Снова вернитесь в домашнюю директорию.
# Для выполнения этой задачи используйте команды cd, mkdir, и pwd, чтобы проверить текущую директорию.

### CodeGym
## Condition:
# Perform the following sequence of commands:
# 1. Navigate to the home directory.
# 2. Create a folder named practice_dir.
# 3. Navigate into the practice_dir folder.
# 4. Return to the home directory.
# To complete this task, use the commands cd, mkdir, and pwd to verify the current directory.

### JavaRush
## Требования:
# • Пользователь должен использовать команду `cd` для перехода в домашнюю директорию и обратно.
# • Пользователь должен проверить, что он находится в правильной директории, используя команду `pwd`.
# • Пользователь должен создать папку с именем `practice_dir`, используя команду `mkdir`.
# • Пользователь должен использовать команду `cd` для перехода в только что созданную директорию `practice_dir`.
# • Пользователь должен снова воспользоваться командой `cd` для возвращения в домашнюю директорию.
# • Все шаги должны быть выполнены в строгой последовательности: переход в домашнюю директорию -> создание директории -> переход в неё -> возврат в домашнюю директорию.

### CodeGym
## Requirements:
# • The user must use the `cd` command to navigate to the home directory and back.
# • The user must check that they are in the correct directory by using the `pwd` command.
# • The user must create a folder named `practice_dir` using the `mkdir` command.
# • The user must use the `cd` command to navigate into the newly created directory `practice_dir`.
# • The user must use the `cd` command again to return to the home directory.
# • All steps must be performed in strict sequence: navigating to the home directory -> creating the directory -> navigating into it -> returning to the home directory.

### JavaRush
## Черновик:
# # Переход в домашнюю директорию
#
# # Проверка текущей директории
#
#
# # Создание папки с именем practice_dir
#
#
# # Переход в папку practice_dir
#
# # Проверка текущей директории
#
#
# # Возврат в домашнюю директорию
#
# # Проверка текущей директории

### CodeGym
## Draft:
# # Navigate to the home directory
#
# # Verify the current directory
#
#
# # Create a folder named practice_dir
#
#
# # Navigate into the practice_dir folder
#
# # Verify the current directory
#
#
# # Return to the home directory
#
# # Verify the current directory

### JavaRush
# Переход в домашнюю директорию
cd ~
# Проверка текущей директории
pwd

# Создание папки с именем practice_dir
mkdir practice_dir

# Переход в папку practice_dir
cd practice_dir
# Проверка текущей директории
pwd

# Возврат в домашнюю директорию
cd ~
# Проверка текущей директории
pwd

### CodeGym
# Navigate to the home directory
cd ~
# Verify the current directory
pwd

# Create a folder named practice_dir
mkdir practice_dir

# Navigate into the practice_dir folder
cd practice_dir
# Verify the current directory
pwd

# Return to the home directory
cd ~
# Verify the current directory
pwd

### JavaRush
## Правильное решение:
## Author: JavaRush's team
# # Переход в домашнюю директорию
# cd ~
# # Проверка текущей директории
# pwd
#
# # Создание папки с именем practice_dir
# mkdir practice_dir
#
# # Переход в папку practice_dir
# cd practice_dir
# # Проверка текущей директории
# pwd
#
# # Возврат в домашнюю директорию
# cd ~
# # Проверка текущей директории
# pwd

### CodeGym
## Correct solution:
## Author: CodeGym's team
# # Navigate to the home directory
# cd ~
# # Verify the current directory
# pwd
#
# # Create a folder named practice_dir
# mkdir practice_dir
#
# # Navigate into the practice_dir folder
# cd practice_dir
# # Verify the current directory
# pwd
#
# # Return to the home directory
# cd ~
# # Verify the current directory
# pwd