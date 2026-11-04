## Authors: JavaRush's team, CodeGym's team, Altavista360
## Version: 1.0.0

### JavaRush
## Задача: Определение текущего пользователя
## Ссылка: https://javarush.com/tasks/ru.javarush.system.linux.level01.task10

### CodeGym
## Task: Deleting a File and Folder
## Link: https://codegym.cc/tasks/en.codegym.system.linux.level01.task10

### JavaRush
## Условие:
# 1. Создайте папку `temp` и файл `temporary.txt` внутри неё.
# 2. Затем удалите файл `temporary.txt`.
# 3. Удалите папку `temp`.

### CodeGym
## Condition:
# 1. Create a folder `temp` and a file `temporary.txt` inside it.
# 2. Then delete the file `temporary.txt`.
# 3. Delete the folder `temp`.

### JavaRush
## Требования:
# • Скрипт должен создавать папку `temp` с помощью команды `mkdir`.
# • Скрипт должен создавать файл `temporary.txt` внутри папки `temp` с использованием команды `touch`.
# • Файл `temporary.txt` должен быть удалён с помощью команды `rm`.
# • Папка `temp` должна быть удалена после удаления файла, с использованием команды `rmdir` (если папка пуста) или `rm -r`.
# • Сначала должен быть удалён файл, находящийся в созданной папке, после этого папка должна быть удалена.

### CodeGym
## Requirements:
# • The script should create the folder `temp` using the `mkdir` command.
# • The script should create the file `temporary.txt` inside the folder `temp` using the `touch` command.
# • The file `temporary.txt` must be deleted using the `rm` command.
# • The folder `temp` must be deleted after the file is removed, using the `rmdir` command (if the folder is empty) or `rm -r`.
# • First, the file inside the created folder must be deleted, then the folder should be deleted.

### JavaRush
## Черновик:
# # Создаём папку temp
#
#
# # Создаём файл temporary.txt внутри папки temp
#
#
# # Удаляем файл temporary.txt
#
#
# # Удаляем папку temp

### CodeGym
## Draft:
# # Create the folder temp
#
#
# # Create the file temporary.txt inside the folder temp
#
#
# # Delete the file temporary.txt
#
#
# # Delete the folder temp

### JavaRush
# Создаём папку temp
mkdir temp

# Создаём файл temporary.txt внутри папки temp
touch temp/temporary.txt

# Удаляем файл temporary.txt
rm temp/temporary.txt

# Удаляем папку temp
rmdir temp

### CodeGym
# Create the folder temp
mkdir temp

# Create the file temporary.txt inside the folder temp
touch temp/temporary.txt

# Delete the file temporary.txt
rm temp/temporary.txt

# Delete the folder temp
rmdir temp

### JavaRush
## Правильное решение:
## Author: JavaRush's team
# # Создаём папку temp
# mkdir temp
#
# # Создаём файл temporary.txt внутри папки temp
# touch temp/temporary.txt
#
# # Удаляем файл temporary.txt
# rm temp/temporary.txt
#
# # Удаляем папку temp
# rmdir temp

### CodeGym
## Correct solution:
## Author: CodeGym's team
# # Create the folder temp
# mkdir temp
#
# # Create the file temporary.txt inside the folder temp
# touch temp/temporary.txt
#
# # Delete the file temporary.txt
# rm temp/temporary.txt
#
# # Delete the folder temp
# rmdir temp