## Authors: JavaRush's team, CodeGym's team, Altavista360
## Version: 1.0.0

### JavaRush
## Задача: Определение текущего пользователя
## Ссылка: https://javarush.com/tasks/ru.javarush.system.linux.level01.task12

### CodeGym
## Task: Working with directory structure
## Link: https://codegym.cc/tasks/en.codegym.system.linux.level01.task12

### JavaRush
## Условие:
# 1. Создайте следующую структуру папок:
# # website/
# #     assets/
# #         css/
# #         js/
# #     content/
# 2. Создайте файлы `index.html` в папке `website`, `styles.css` в папке `css`, и `script.js` в папке `js`.
# 3. Скопируйте всю папку `assets` в папку `content`.
# 4. Удалите папку `js` внутри папки `assets`.

### CodeGym
## Condition:
# 1. Create the following folder structure:
# # website/
# #     assets/
# #         css/
# #         js/
# #     content/
# 2. Create the files `index.html` in the `website` folder, `styles.css` in the `css` folder, and `script.js` in the `js` folder.
# 3. Copy the entire `assets` folder into the `content` folder.
# 4. Delete the `js` folder inside the `assets` folder.

### JavaRush
## Требования:
# • Скрипт должен использовать команду `mkdir` для создания всех необходимых папок: `website`, `website/assets`, `website/assets/css`, `website/assets/js`, `website/content`.
# • Скрипт должен использовать команду `touch` для создания файла `index.html` в папке `website`, файла `styles.css` в папке `website/assets/css`, и файла `script.js` в папке `website/assets/js`.
# • Скрипт должен использовать команду `cp` для копирования папки `assets` в папку `content` (в результате должна быть создана структура `website/content/assets`).
# • Скрипт должен корректно использовать команду `rm -r` для удаления папки `js` внутри `website/assets`.
# • При копировании папки `assets`, вложенные директории и файлы должны сохранять исходную структуру.
# • Все команды должны быть выполнены в рамках текущей рабочей директории, соответствующей структуре `website`.
# • Каждая команда должна быть выполнена корректно, без возникновения ошибок или некорректных результатов.
# • Для выполнения задания должны применяться только команды, перечисленные в лекции: `mkdir`, `rm`, `touch`, `cp`, `mv`.

### CodeGym
## Requirements:
# • The script must use the `mkdir` command to create all required folders: `website`, `website/assets`, `website/assets/css`, `website/assets/js`, `website/content`.
# • The script must use the `touch` command to create the `index.html` file in the `website` folder, the `styles.css` file in the `website/assets/css` folder, and the `script.js` file in the `website/assets/js` folder.
# • The script must use the `cp` command to copy the `assets` folder to the `content` folder (the result should be the `website/content/assets` structure).
# • The script must correctly use the `rm -r` command to delete the `js` folder within `website/assets`.

### JavaRush
## Черновик:
# # Создание структуры директорий
#
#
# # Создание файлов
#
#
# # Копирование папки assets в content
#
#
# # Удаление папки js из assets

### CodeGym
## Draft:
# # Creating the directory structure
#
#
# # Creating files
#
#
# # Copying the assets folder to content
#
#
# # Deleting the js folder from assets

### JavaRush
# Создание структуры директорий
mkdir -p website/assets/css
mkdir -p website/assets/js
mkdir -p website/content

# Создание файлов
touch website/index.html
touch website/assets/css/styles.css
touch website/assets/js/script.js

# Копирование папки assets в content
cp -r website/assets website/content

# Удаление папки js из assets
rm -r website/assets/js

### CodeGym
# Creating the directory structure
mkdir -p website/assets/css
mkdir -p website/assets/js
mkdir -p website/content

# Creating files
touch website/index.html
touch website/assets/css/styles.css
touch website/assets/js/script.js

# Copying the assets folder to content
cp -r website/assets website/content

# Deleting the js folder from assets
rm -r website/assets/js

### JavaRush
## Правильное решение:
## Author: JavaRush's team
# # Создание структуры директорий
# mkdir -p website/assets/css
# mkdir -p website/assets/js
# mkdir -p website/content
#
# # Создание файлов
# touch website/index.html
# touch website/assets/css/styles.css
# touch website/assets/js/script.js
#
# # Копирование папки assets в content
# cp -r website/assets website/content
#
# # Удаление папки js из assets
# rm -r website/assets/js

### CodeGym
## Correct solution:
## Author: CodeGym's team
# # Creating the directory structure
# mkdir -p website/assets/css
# mkdir -p website/assets/js
# mkdir -p website/content
#
# # Creating files
# touch website/index.html
# touch website/assets/css/styles.css
# touch website/assets/js/script.js
#
# # Copying the assets folder to content
# cp -r website/assets website/content
#
# # Deleting the js folder from assets
# rm -r website/assets/js