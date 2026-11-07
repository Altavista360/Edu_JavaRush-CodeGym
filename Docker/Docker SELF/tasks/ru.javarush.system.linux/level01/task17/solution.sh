## Authors: JavaRush's team, CodeGym's team, Altavista360
## Version: 1.0.0

### JavaRush
## Задача: Создание файла и просмотр содержимого
## Ссылка: https://javarush.com/tasks/ru.javarush.system.linux.level01.task17

### CodeGym
## Task: Creating a file and viewing its contents
## Link: https://codegym.cc/tasks/en.codegym.system.linux.level01.task17

### JavaRush
## Условие:
# 1. Создайте директорию с именем `task1` в домашней директории.
# 2. Перейдите в созданную директорию.
# 3. Создайте пустой текстовый файл с именем `testfile.txt`.
# 4. Добавьте текст "Hello, Linux World!" в файл `testfile.txt` с помощью текстового редактора `nano`.
# 5. Выведите содержимое файла `testfile.txt` на экран с использованием команды `cat`. Скрипт должен вывести текст "Hello, Linux World!".

### CodeGym
## Condition:
# 1. Create a directory named `task1` in the home directory.
# 2. Navigate to the newly created directory.
# 3. Create an empty text file named `testfile.txt`.
# 4. Add the text "Hello, Linux World!" to the `testfile.txt` file using the `nano` text editor.
# 5. Display the contents of the `testfile.txt` file on the screen using the `cat` command. The script must output the text "Hello, Linux World!".

### JavaRush
## Требования:
# • В домашней директории должна быть создана новая директория с именем `task1` с использованием соответствующей команды.
# • После создания директории необходимо выполнить переход в неё с использованием команды `cd`.
# • В директории `task1` должен быть создан пустой текстовый файл с именем `testfile.txt` с использованием команды `touch`.
# • В скрипте должна быть команда открытия файла в редакторе — `nano testfile.txt`, а файл `testfile.txt` должен содержать текст "Hello, Linux World!".
# • Нажатия клавиш внутри редактора записываются в скрипте комментариями: сохранение и выход должны быть указаны комментариями с клавишами `Ctrl+O`, `Enter` и `Ctrl+X`.
# • Для вывода содержимого файла `testfile.txt` необходимо использовать команду `cat`.
# • Содержимое файла при выполнении команды `cat` должно соответствовать тексту "Hello, Linux World!".

### CodeGym
## Requirements:
# • A new directory named `task1` must be created in the home directory using the appropriate command.
# • After creating the directory, you must navigate into it using the `cd` command.
# • An empty text file named `testfile.txt` must be created in the `task1` directory using the `touch` command.
# • The script must contain the command to open the file in the editor — `nano testfile.txt`, and the file `testfile.txt` must contain the text "Hello, Linux World!."
# • Keystrokes inside the editor are recorded in the script as comments: saving and exiting must be specified in comments with the keys `Ctrl+O`, `Enter`, and `Ctrl+X`.
# • The `cat` command must be used to display the contents of the `testfile.txt` file.
# • The contents of the file, when the `cat` command is executed, must match the text "Hello, Linux World!".

### JavaRush
## Черновик:
# # Создаем директорию task1 в домашней директории
# mkdir -p ~/task1
#
# # Переходим в созданную директорию
# cd ~/task1
#
# # Создаем пустой файл testfile.txt
# touch testfile.txt
#
# # Добавляем текст "Hello, Linux World!" в файл с помощью редактора nano
#
# # Выводим содержимое файла testfile.txt на экран
# cat testfile.txt

### CodeGym
## Draft:
# # Create the task1 directory in the home directory
# mkdir -p ~/task1
#
# # Navigate to the created directory
# cd ~/task1
#
# # Create an empty file named testfile.txt
# touch testfile.txt
#
# # Add the text "Hello, Linux World!" to the file using the nano editor
#
# # Display the contents of the testfile.txt file on the screen
# cat testfile.txt

### JavaRush
# Создаем директорию task1 в домашней директории
mkdir -p ~/task1

# Переходим в созданную директорию
cd ~/task1

# Создаем пустой файл testfile.txt
touch testfile.txt

# Добавляем текст "Hello, Linux World!" в файл с помощью редактора nano
nano testfile.txt

# Выводим содержимое файла testfile.txt на экран
cat testfile.txt

### CodeGym
# Create the task1 directory in the home directory
mkdir -p ~/task1

# Navigate to the created directory
cd ~/task1

# Create an empty file named testfile.txt
touch testfile.txt

# Add the text "Hello, Linux World!" to the file using the nano editor
nano testfile.txt

# Display the contents of the testfile.txt file on the screen
cat testfile.txt

### JavaRush
## Правильное решение:
## Author: JavaRush's team
# # Создаем директорию task1 в домашней директории
# mkdir -p ~/task1
#
# # Переходим в созданную директорию
# cd ~/task1
#
# # Создаем пустой файл testfile.txt
# touch testfile.txt
#
# # Открываем файл testfile.txt в редакторе nano
# nano testfile.txt
#
# # Дальше работа идёт внутри редактора, поэтому шаги записаны комментариями:
# # Наберите строку `Hello, Linux World!`
# # Нажмите `Ctrl+O`, затем `Enter` — сохранить изменения в файл
# # Нажмите `Ctrl+X` — выйти из редактора
#
# # Выводим содержимое файла testfile.txt на экран
# cat testfile.txt

### CodeGym
## Correct solution:
## Author: CodeGym's team
# # Create the task1 directory in the home directory
# mkdir -p ~/task1
#
# # Navigate to the created directory
# cd ~/task1
#
# # Create an empty file named testfile.txt
# touch testfile.txt
#
# # Open the testfile.txt file in the nano editor
# nano testfile.txt
#
# # The rest of the work takes place inside the editor, so the steps are written as comments:
# # Type the line `Hello, Linux World!`
# # Press `Ctrl+O`, then `Enter` - save the changes to the file
# # Press `Ctrl+X` - exit the editor
#
# # Display the contents of the testfile.txt file on the screen
# cat testfile.txt