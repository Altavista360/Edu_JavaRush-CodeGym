## Authors: JavaRush's team, CodeGym's team, Altavista360
## Version: 1.0.0

### JavaRush
## Задача: Копирование и переименование файла
## Ссылка: https://javarush.com/tasks/ru.javarush.system.linux.level01.task18

### CodeGym
## Task: Copying and renaming a file
## Link: https://codegym.cc/tasks/en.codegym.system.linux.level01.task18

### JavaRush
## Условие:
# 1. Создайте директорию с именем task2 в домашней директории.
# 2. Перейдите в созданную директорию.
# 3. Создайте текстовый файл с именем testfile.txt и добавьте в него текст "Hello, Linux World!".
# 4. Скопируйте файл testfile.txt и назовите копию backup_testfile.txt.
# 5. Используя команду ls, отобразите содержимое текущей директории. В списке файлов должны быть testfile.txt и backup_testfile.txt.
# 6. Выведите содержимое файла backup_testfile.txt с помощью команды cat. Ожидаемый вывод: "Hello, Linux World!".

### CodeGym
## Condition:
# 1. Create a directory named task2 in your home directory.
# 2. Navigate to the created directory.
# 3. Create a text file named testfile.txt and add the text "Hello, Linux World!" to it.
# 4. Copy the testfile.txt file and name the copy backup_testfile.txt.
# 5. Using the ls command, display the contents of the current directory. The file list should include testfile.txt and backup_testfile.txt.
# 6. Display the contents of the backup_testfile.txt file using the cat command. Expected output: "Hello, Linux World!".

### JavaRush
## Требования:
# • Должна быть создана директория с именем task2 в домашней директории пользователя.
# • Необходимо выполнить команду для перехода в директорию task2.
# • Должен быть создан файл testfile.txt внутри директории task2.
# • В файл testfile.txt должен быть добавлен текст "Hello, Linux World!".
# • Файл testfile.txt должен быть скопирован, причём копия должна называться backup_testfile.txt.
# • Команда ls должна показать оба файла (testfile.txt и backup_testfile.txt) в текущей директории.
# • Используя команду cat, должно быть отображено содержимое файла backup_testfile.txt, которое должно совпадать с содержимым "Hello, Linux World!".

### CodeGym
## Requirements:
# • A directory named task2 must be created in the user's home directory.
# • You need to execute a command to navigate to the task2 directory.
# • The testfile.txt file must be created inside the task2 directory.
# • The text "Hello, Linux World!" must be added to the testfile.txt file.
# • The testfile.txt file must be copied, and the copy must be named backup_testfile.txt.
# • The ls command must display both files (testfile.txt and backup_testfile.txt) in the current directory.
# • Using the cat command, the contents of the backup_testfile.txt file must be displayed, matching "Hello, Linux World!".

### JavaRush
## Черновик:
# # Создаем директорию task2 в домашней директории
#
#
# # Переходим в созданную директорию
#
#
# # Создаем файл testfile.txt и добавляем в него текст
#
#
# # Копируем файл testfile.txt в backup_testfile.txt
#
#
# # Отображаем содержимое текущей директории
#
#
# # Выводим содержимое файла backup_testfile.txt

### CodeGym
## Draft:
# # Create the task2 directory in the home directory
#
#
# # Navigate to the created directory
#
#
# # Create the testfile.txt file and add text to it
#
#
# # Copy the testfile.txt file to backup_testfile.txt
#
#
# # Display the contents of the current directory
#
#
# # Display the contents of the backup_testfile.txt file

### JavaRush
# Создаем директорию task2 в домашней директории
mkdir -p ~/task2

# Переходим в созданную директорию
cd ~/task2

# Создаем файл testfile.txt и добавляем в него текст
echo "Hello, Linux World!" > testfile.txt

# Копируем файл testfile.txt в backup_testfile.txt
cp testfile.txt backup_testfile.txt

# Отображаем содержимое текущей директории
ls

# Выводим содержимое файла backup_testfile.txt
cat backup_testfile.txt

### CodeGym
# Create the task2 directory in the home directory
mkdir -p ~/task2

# Navigate to the created directory
cd ~/task2

# Create the testfile.txt file and add text to it
echo "Hello, Linux World!" > testfile.txt

# Copy the testfile.txt file to backup_testfile.txt
cp testfile.txt backup_testfile.txt

# Display the contents of the current directory
ls

# Display the contents of the backup_testfile.txt file
cat backup_testfile.txt

### JavaRush
## Правильное решение:
## Author: JavaRush's team
# # Создаем директорию task2 в домашней директории
# mkdir -p ~/task2
#
# # Переходим в созданную директорию
# cd ~/task2
#
# # Создаем файл testfile.txt и добавляем в него текст
# echo "Hello, Linux World!" > testfile.txt
#
# # Копируем файл testfile.txt в backup_testfile.txt
# cp testfile.txt backup_testfile.txt
#
# # Отображаем содержимое текущей директории
# ls
#
# # Выводим содержимое файла backup_testfile.txt
# cat backup_testfile.txt

### CodeGym
## Correct solution:
## Author: CodeGym's team
# # Create the task2 directory in the home directory
# mkdir -p ~/task2
#
# # Navigate to the created directory
# cd ~/task2
#
# # Create the testfile.txt file and add text to it
# echo "Hello, Linux World!" > testfile.txt
#
# # Copy the testfile.txt file to backup_testfile.txt
# cp testfile.txt backup_testfile.txt
#
# # Display the contents of the current directory
# ls
#
# # Display the contents of the backup_testfile.txt file
# cat backup_testfile.txt