## Authors: JavaRush's team, CodeGym's team, Altavista360
## Version: 1.0.0

### JavaRush
## Задача: Определение текущего пользователя
## Ссылка: https://javarush.com/tasks/ru.javarush.system.linux.level01.task11

### CodeGym
## Task: Copying and Moving
## Link: https://codegym.cc/tasks/en.codegym.system.linux.level01.task11

### JavaRush
## Условие:
# 1. Создайте папку `project` с двумя вложенными папками: `src` и `docs`.
# 2. Создайте файл `readme.txt` в папке `docs`.
# 3. Скопируйте файл `readme.txt` из папки `docs` в папку `src`.
# 4. Переместите файл `readme.txt` из папки `src` в корневую папку `project`.

### CodeGym
## Condition:
# 1. Create a folder named `project` with two subfolders: `src` and `docs`.
# 2. Create a file named `readme.txt` inside the `docs` folder.
# 3. Copy the file `readme.txt` from the `docs` folder to the `src` folder.
# 4. Move the file `readme.txt` from the `src` folder to the root `project` folder.

### JavaRush
## Требования:
# • Для создания папки `project` с вложенными папками `src` и `docs` необходимо использовать команду `mkdir`.
# • Для создания файла `readme.txt` в папке `docs` требуется использовать команду `touch`.
# • Для копирования файла `readme.txt` из папки `docs` в папку `src` необходимо применять команду `cp`.
# • Все операции должны выполняться с корректным указанием путей к папкам и файлам.
# • Для перемещения файла `readme.txt` из папки `src` в корневую папку `project` должна быть использована команда `mv`.
# • Итоговая структура папки `project` после выполнения всех действий должна содержать файл `readme.txt` в корневой директории и в папке `docs` (исходный файл остаётся там после копирования), а папка `src` должна быть пустой.

### CodeGym
## Requirements:
# • To create the `project` folder with the `src` and `docs` subfolders, you need to use the `mkdir` command.
# • To create the `readme.txt` file in the `docs` folder, you need to use the `touch` command.
# • To copy the `readme.txt` file from the `docs` folder to the `src` folder, you must use the `cp` command.
# • All operations must be performed with the correct paths to the folders and files.
# • To move the `readme.txt` file from the `src` folder to the root `project` folder, you must use the `mv` command.
# • The final structure of the `project` folder after all the actions are completed should contain the `readme.txt` file in the root directory and in the `docs` folder (the original file remains there after copying), while the `src` folder should be empty.

### JavaRush
## Черновик:
# # Создаем папку project с вложенными папками src и docs
#
#
# # Создаем файл readme.txt в папке docs
#
#
# # Копируем файл readme.txt из папки docs в папку src
#
#
# # Перемещаем файл readme.txt из папки src в корневую папку project

### CodeGym
## Draft:
# # Create the project folder with subfolders src and docs
#
#
# # Create the readme.txt file inside the docs folder
#
#
# # Copy the readme.txt file from the docs folder to the src folder
#
#
# # Move the readme.txt file from the src folder to the root project folder

### JavaRush
# Создаем папку project с вложенными папками src и docs
mkdir -p project/src project/docs

# Создаем файл readme.txt в папке docs
touch project/docs/readme.txt

# Копируем файл readme.txt из папки docs в папку src
cp project/docs/readme.txt project/src/

# Перемещаем файл readme.txt из папки src в корневую папку project
mv project/src/readme.txt project/

### CodeGym
# Create the project folder with subfolders src and docs
mkdir -p project/src project/docs

# Create the readme.txt file inside the docs folder
touch project/docs/readme.txt

# Copy the readme.txt file from the docs folder to the src folder
cp project/docs/readme.txt project/src/

# Move the readme.txt file from the src folder to the root project folder
mv project/src/readme.txt project/

### JavaRush
## Правильное решение:
## Author: JavaRush's team
# # Создаем папку project с вложенными папками src и docs
# mkdir -p project/src project/docs
#
# # Создаем файл readme.txt в папке docs
# touch project/docs/readme.txt
#
# # Копируем файл readme.txt из папки docs в папку src
# cp project/docs/readme.txt project/src/
#
# # Перемещаем файл readme.txt из папки src в корневую папку project
# mv project/src/readme.txt project/

### CodeGym
## Correct solution:
## Author: CodeGym's team
# # Create the project folder with subfolders src and docs
# mkdir -p project/src project/docs
#
# # Create the readme.txt file inside the docs folder
# touch project/docs/readme.txt
#
# # Copy the readme.txt file from the docs folder to the src folder
# cp project/docs/readme.txt project/src/
#
# # Move the readme.txt file from the src folder to the root project folder
# mv project/src/readme.txt project/