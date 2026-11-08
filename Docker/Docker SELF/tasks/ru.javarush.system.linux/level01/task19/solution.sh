## Authors: JavaRush's team, CodeGym's team, Altavista360
## Version: 1.0.0

### JavaRush
## Задача: Создание структуры директорий и перемещение файлов
## Ссылка: https://javarush.com/tasks/ru.javarush.system.linux.level01.task19

### CodeGym
## Task: Creating a directory structure and moving files
## Link: https://codegym.cc/tasks/en.codegym.system.linux.level01.task19

### JavaRush
## Условие:
# 1. Создайте директорию с именем task3 в домашней директории.
# 2. Перейдите в созданную директорию.
# 3. Создайте текстовый файл с именем testfile.txt и добавьте в него текст "Hello, Linux World!".
# 4. Создайте поддиректорию с именем backup внутри директории task3.
# 5. Скопируйте файл testfile.txt в поддиректорию backup и назовите его backup_testfile.txt.
# 6. Используя команду ls, проверьте, что файл testfile.txt все еще находится в текущей директории.
# 7. Используя команду ls backup, проверьте, что файл backup_testfile.txt находится в поддиректории backup.

### CodeGym
## Condition:
# 1. Create a directory named task3 in the home directory.
# 2. Navigate to the newly created directory.
# 3. Create a text file named testfile.txt and add the text "Hello, Linux World!" to it.
# 4. Create a subdirectory named backup inside the task3 directory.
# 5. Copy the file testfile.txt to the backup subdirectory and rename it to backup_testfile.txt.
# 6. Use the ls command to confirm that the file testfile.txt is still located in the current directory.
# 7. Use the ls backup command to confirm that the file backup_testfile.txt is located in the backup subdirectory.

### JavaRush
## Требования:
# • Пользователь должен использовать команду `mkdir` для создания директории с именем task3 в домашней директории.
# • Пользователь должен использовать команду `cd` для перехода в созданную директорию task3.
# • Пользователь должен использовать команду `echo` или текстовый редактор (например, `nano`) для создания файла testfile.txt и добавления текста "Hello, Linux World!".
# • Пользователь должен использовать команду `mkdir` для создания поддиректории с именем backup внутри task3.
# • Пользователь должен использовать команду `cp` для копирования файла testfile.txt в поддиректорию backup с новым именем backup_testfile.txt.
# • Пользователь должен использовать команду `ls` для проверки, что файл testfile.txt все еще находится в текущей директории task3.
# • Пользователь должен использовать команду `ls backup` для проверки, что файл backup_testfile.txt находится в поддиректории backup.

### CodeGym
## Requirements:
# • The user must use the `mkdir` command to create the directory named task3 in the home directory.
# • The user must use the `cd` command to navigate to the newly created task3 directory.
# • The user must use the `echo` command or a text editor (e.g., `nano`) to create the file testfile.txt and add the text "Hello, Linux World!" to it.
# • The user must use the `mkdir` command to create a subdirectory named backup inside the task3 directory.
# • The user must use the `cp` command to copy the file testfile.txt to the backup subdirectory with the new name backup_testfile.txt.
# • The user must use the `ls` command to confirm that the file testfile.txt is still located in the current task3 directory.
# • The user must use the `ls backup` command to confirm that the file backup_testfile.txt is located in the backup subdirectory.

### JavaRush
## Черновик:
# # 1. Создание директории task3 в домашней директории
#
#
# # 2. Переход в созданную директорию
#
#
# # 3. Создание текстового файла testfile.txt с текстом "Hello, Linux World!"
#
#
# # 4. Создание поддиректории backup внутри task3
#
#
# # 5. Копирование файла testfile.txt в поддиректорию backup с новым именем backup_testfile.txt
#
#
# # 6. Проверка наличия файла testfile.txt в текущей директории
#
#
# # 7. Проверка наличия файла backup_testfile.txt в поддиректории backup

### CodeGym
## Draft:
# # 1. Creating the task3 directory in the home directory
#
#
# # 2. Navigating to the newly created directory
#
#
# # 3. Creating the testfile.txt file and adding the text "Hello, Linux World!"
#
#
# # 4. Creating the backup subdirectory inside task3
#
#
# # 5. Copying testfile.txt to the backup subdirectory with the new name backup_testfile.txt
#
#
# # 6. Verifying testfile.txt is in the current directory
#
#
# # 7. Verifying backup_testfile.txt is in the backup subdirectory

### JavaRush
# 1. Создание директории task3 в домашней директории
mkdir ~/task3

# 2. Переход в созданную директорию
cd ~/task3

# 3. Создание текстового файла testfile.txt с текстом "Hello, Linux World!"
echo "Hello, Linux World!" > testfile.txt

# 4. Создание поддиректории backup внутри task3
mkdir backup

# 5. Копирование файла testfile.txt в поддиректорию backup с новым именем backup_testfile.txt
cp testfile.txt backup/backup_testfile.txt

# 6. Проверка наличия файла testfile.txt в текущей директории
ls

# 7. Проверка наличия файла backup_testfile.txt в поддиректории backup
ls backup

### CodeGym
# 1. Creating the task3 directory in the home directory
mkdir ~/task3

# 2. Navigating to the newly created directory
cd ~/task3

# 3. Creating the testfile.txt file and adding the text "Hello, Linux World!"
echo "Hello, Linux World!" > testfile.txt

# 4. Creating the backup subdirectory inside task3
mkdir backup

# 5. Copying testfile.txt to the backup subdirectory with the new name backup_testfile.txt
cp testfile.txt backup/backup_testfile.txt

# 6. Verifying testfile.txt is in the current directory
ls

# 7. Verifying backup_testfile.txt is in the backup subdirectory
ls backup

### JavaRush
## Правильное решение:
## Author: JavaRush's team
# # 1. Создание директории task3 в домашней директории
# mkdir ~/task3
#
# # 2. Переход в созданную директорию
# cd ~/task3
#
# # 3. Создание текстового файла testfile.txt с текстом "Hello, Linux World!"
# echo "Hello, Linux World!" > testfile.txt
#
# # 4. Создание поддиректории backup внутри task3
# mkdir backup
#
# # 5. Копирование файла testfile.txt в поддиректорию backup с новым именем backup_testfile.txt
# cp testfile.txt backup/backup_testfile.txt
#
# # 6. Проверка наличия файла testfile.txt в текущей директории
# ls
#
# # 7. Проверка наличия файла backup_testfile.txt в поддиректории backup
# ls backup

### CodeGym
## Correct solution:
## Author: CodeGym's team
# # 1. Creating the task3 directory in the home directory
# mkdir ~/task3
#
# # 2. Navigating to the newly created directory
# cd ~/task3
#
# # 3. Creating the testfile.txt file and adding the text "Hello, Linux World!"
# echo "Hello, Linux World!" > testfile.txt
#
# # 4. Creating the backup subdirectory inside task3
# mkdir backup
#
# # 5. Copying testfile.txt to the backup subdirectory with the new name backup_testfile.txt
# cp testfile.txt backup/backup_testfile.txt
#
# # 6. Verifying testfile.txt is in the current directory
# ls
#
# # 7. Verifying backup_testfile.txt is in the backup subdirectory
# ls backup