## Authors: JavaRush's team, CodeGym's team, Altavista360
## Version: 1.0.0

### JavaRush
## Задача: Удаление и восстановление файла
## Ссылка: https://javarush.com/tasks/ru.javarush.system.linux.level01.task20

### CodeGym
## Task: Deleting and Restoring a File
## Link: https://codegym.cc/tasks/en.codegym.system.linux.level01.task20

### JavaRush
## Условие:
# 1. Создайте директорию с именем task4 в домашней директории.
# 2. Перейдите в созданную директорию.
# 3. Создайте текстовый файл с именем testfile.txt и добавьте в него текст "Hello, Linux World!".
# 4. Создайте поддиректорию с именем backup внутри директории task4.
# 5. Скопируйте файл testfile.txt в поддиректорию backup и назовите его backup_testfile.txt.
# 6. Удалите файл testfile.txt из текущей директории.
# 7. Скопируйте файл backup_testfile.txt из поддиректории backup обратно в текущую директорию и назовите его снова testfile.txt.
# 8. Используя команду cat, проверьте содержимое восстановленного файла testfile.txt. Ожидаемый вывод: "Hello, Linux World!".

### CodeGym
## Condition:
# 1. Create a directory named task4 in your home directory.
# 2. Navigate to the created directory.
# 3. Create a text file named testfile.txt and add the text "Hello, Linux World!" to it.
# 4. Create a subdirectory named backup inside the task4 directory.
# 5. Copy the testfile.txt file to the backup subdirectory and name it backup_testfile.txt.
# 6. Delete the testfile.txt file from the current directory.
# 7. Copy the backup_testfile.txt file from the backup subdirectory back to the current directory and rename it back to testfile.txt.
# 8. Use the cat command to check the contents of the restored file testfile.txt. The expected output: "Hello, Linux World!".

### JavaRush
## Требования:
# • Скрипт должен использовать команду mkdir для создания директории task4 в домашней директории.
# • Скрипт должен использовать команду cd для перехода в созданную директорию task4.
# • Скрипт должен использовать команду touch для создания файла testfile.txt и добавить текст "Hello, Linux World!" с помощью echo или текстового редактора.
# • Скрипт должен создать поддиректорию backup внутри директории task4 с помощью команды mkdir.
# • Скрипт должен скопировать файл testfile.txt в директорию backup под именем backup_testfile.txt с помощью команды cp.
# • Скрипт должен удалить файл testfile.txt из текущей директории с помощью команды rm.
# • Скрипт должен скопировать файл backup_testfile.txt из директории backup обратно в task4 и назвать его testfile.txt с помощью команды cp.
# • Скрипт должен использовать команду cat для проверки содержимого файла testfile.txt, которое должно соответствовать "Hello, Linux World!".

### CodeGym
## Requirements:
# • The script must use the mkdir command to create the task4 directory in the home directory.
# • The script must use the cd command to navigate to the created task4 directory.
# • The script must use the touch command to create the file testfile.txt and add the text "Hello, Linux World!" using echo or a text editor.
# • The script must create a backup subdirectory inside the task4 directory using the mkdir command.
# • The script must copy the testfile.txt file to the backup directory as backup_testfile.txt using the cp command.
# • The script must delete the testfile.txt file from the current directory using the rm command.
# • The script must copy the backup_testfile.txt file from the backup directory back to task4 and name it testfile.txt using the cp command.
# • The script must use the cat command to check the contents of the testfile.txt file, which should match "Hello, Linux World!".

### JavaRush
## Черновик:
# # Создаем директорию task4 в домашней директории
#
#
# # Переходим в созданную директорию
#
#
# # Создаем текстовый файл testfile.txt командой touch и добавляем в него текст
#
#
# # Создаем поддиректорию backup
#
#
# # Копируем файл testfile.txt в поддиректорию backup и называем его backup_testfile.txt
#
#
# # Удаляем файл testfile.txt из текущей директории
#
#
# # Восстанавливаем файл, копируя из поддиректории backup обратно
#
#
# # Проверяем содержимое восстановленного файла

### CodeGym
## Draft:
# # Create the task4 directory in the home directory
#
#
# # Navigate to the created directory
#
#
# # Create the text file testfile.txt with the touch command and add text to it
#
#
# # Create the backup subdirectory
#
#
# # Copy the testfile.txt file to the backup subdirectory and name it backup_testfile.txt
#
#
# # Delete the testfile.txt file from the current directory
#
#
# # Restore the file by copying it from the backup subdirectory back
#
#
# # Check the contents of the restored file

### JavaRush
# Создаем директорию task4 в домашней директории
mkdir ~/task4

# Переходим в созданную директорию
cd ~/task4

# Создаем текстовый файл testfile.txt командой touch и добавляем в него текст
touch testfile.txt
echo "Hello, Linux World!" > testfile.txt

# Создаем поддиректорию backup
mkdir backup

# Копируем файл testfile.txt в поддиректорию backup и называем его backup_testfile.txt
cp testfile.txt backup/backup_testfile.txt

# Удаляем файл testfile.txt из текущей директории
rm testfile.txt

# Восстанавливаем файл, копируя из поддиректории backup обратно
cp backup/backup_testfile.txt testfile.txt

# Проверяем содержимое восстановленного файла
cat testfile.txt

### CodeGym
# Create the task4 directory in the home directory
mkdir ~/task4

# Navigate to the created directory
cd ~/task4

# Create the text file testfile.txt with the touch command and add text to it
touch testfile.txt
echo "Hello, Linux World!" > testfile.txt

# Create the backup subdirectory
mkdir backup

# Copy the testfile.txt file to the backup subdirectory and name it backup_testfile.txt
cp testfile.txt backup/backup_testfile.txt

# Delete the testfile.txt file from the current directory
rm testfile.txt

# Restore the file by copying it from the backup subdirectory back
cp backup/backup_testfile.txt testfile.txt

# Check the contents of the restored file
cat testfile.txt

### JavaRush
## Правильное решение:
## Author: JavaRush's team
# # Создаем директорию task4 в домашней директории
# mkdir ~/task4
#
# # Переходим в созданную директорию
# cd ~/task4
#
# # Создаем текстовый файл testfile.txt командой touch и добавляем в него текст
# touch testfile.txt
# echo "Hello, Linux World!" > testfile.txt
#
# # Создаем поддиректорию backup
# mkdir backup
#
# # Копируем файл testfile.txt в поддиректорию backup и называем его backup_testfile.txt
# cp testfile.txt backup/backup_testfile.txt
#
# # Удаляем файл testfile.txt из текущей директории
# rm testfile.txt
#
# # Восстанавливаем файл, копируя из поддиректории backup обратно
# cp backup/backup_testfile.txt testfile.txt
#
# # Проверяем содержимое восстановленного файла
# cat testfile.txt

### CodeGym
## Correct solution:
## Author: CodeGym's team
# # Create the task4 directory in the home directory
# mkdir ~/task4
#
# # Navigate to the created directory
# cd ~/task4
#
# # Create the text file testfile.txt with the touch command and add text to it
# touch testfile.txt
# echo "Hello, Linux World!" > testfile.txt
#
# # Create the backup subdirectory
# mkdir backup
#
# # Copy the testfile.txt file to the backup subdirectory and name it backup_testfile.txt
# cp testfile.txt backup/backup_testfile.txt
#
# # Delete the testfile.txt file from the current directory
# rm testfile.txt
#
# # Restore the file by copying it from the backup subdirectory back
# cp backup/backup_testfile.txt testfile.txt
#
# # Check the contents of the restored file
# cat testfile.txt