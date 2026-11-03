## Authors: JavaRush's team, CodeGym's team, Altavista360
## Version: 1.0.0

### JavaRush
## Задача: Определение текущего пользователя
## Ссылка: https://javarush.com/tasks/ru.javarush.system.linux.level01.task08

### CodeGym
## Task: Navigation using absolute and relative paths
## Link: https://codegym.cc/tasks/en.codegym.system.linux.level01.task08

### JavaRush
## Условие:
# 1. Перейдите из текущей директории в папку /tmp.
# 2. Создайте в /tmp папку с именем linux_lab.
# 3. Перейдите в созданную папку linux_lab, используя относительный путь.
# 4. Проверьте путь до текущей директории с помощью pwd.
# 5. Вернитесь в корневую директорию /.
# 6. Перейдите в папку /tmp/linux_lab, используя абсолютный путь.

### CodeGym
## Condition:
# 1. Navigate from the current directory to the /tmp folder.
# 2. Create a folder named linux_lab in /tmp.
# 3. Navigate to the newly created linux_lab folder using a relative path.
# 4. Check the path to the current directory using pwd.
# 5. Return to the root directory /.
# 6. Navigate to the /tmp/linux_lab folder using an absolute path.

### JavaRush
## Требования:
# • В задаче необходимо использовать команду `cd` для навигации по файловой системе, как с абсолютными, так и с относительными путями.
# • Для создания директории linux_lab в папке /tmp нужно использовать команду `mkdir`.
# • Требуется перейти в папку linux_lab из текущей директории, используя относительный путь.
# • Необходимо использовать команду `pwd` для проверки и вывода пути до текущей директории.
# • Задача включает переход в корневую директорию / с использованием абсолютного пути.
# • Требуется перейти в директорию /tmp/linux_lab, используя абсолютный путь.
# • Все команды должны быть выполнены в указанной последовательности и без ошибок.

### CodeGym
## Requirements:
# • The task requires using the `cd` command to navigate through the file system, both with absolute and relative paths.
# • To create the linux_lab directory in the /tmp folder, you need to use the `mkdir` command.
# • You are required to navigate to the linux_lab folder from the current directory using a relative path.
# • You need to use the `pwd` command to check and output the current directory path.
# • The task includes navigating to the root directory / using an absolute path.
# • You are required to navigate to the /tmp/linux_lab directory using an absolute path.
# • All commands must be executed in the specified sequence without errors.

### JavaRush
## Черновик:
# # Переход в папку /tmp с использованием абсолютного пути
#
#
# # Создание папки с именем linux_lab
#
#
# # Переход в созданную папку linux_lab, используя относительный путь
#
#
# # Проверка пути до текущей директории
#
#
# # Переход в корневую директорию /
#
#
# # Переход в директорию /tmp/linux_lab с использованием абсолютного пути

### CodeGym
## Draft:
# # Navigate to the /tmp directory using an absolute path
#
#
# # Create a directory named linux_lab
#
#
# # Navigate to the newly created linux_lab directory using a relative path
#
#
# # Check the path to the current directory
#
#
# # Navigate to the root directory /
#
#
# # Navigate to the /tmp/linux_lab directory using an absolute path

### JavaRush
# Переход в папку /tmp с использованием абсолютного пути
cd /tmp

# Создание папки с именем linux_lab
mkdir linux_lab

# Переход в созданную папку linux_lab, используя относительный путь
cd linux_lab

# Проверка пути до текущей директории
pwd

# Переход в корневую директорию /
cd /

# Переход в директорию /tmp/linux_lab с использованием абсолютного пути
cd /tmp/linux_lab

### CodeGym
# Navigate to the /tmp directory using an absolute path
cd /tmp

# Create a directory named linux_lab
mkdir linux_lab

# Navigate to the newly created linux_lab directory using a relative path
cd linux_lab

# Check the path to the current directory
pwd

# Navigate to the root directory /
cd /

# Navigate to the /tmp/linux_lab directory using an absolute path
cd /tmp/linux_lab

### JavaRush
## Правильное решение:
## Author: JavaRush's team
# # Переход в папку /tmp с использованием абсолютного пути
# cd /tmp
#
# # Создание папки с именем linux_lab
# mkdir linux_lab
#
# # Переход в созданную папку linux_lab, используя относительный путь
# cd linux_lab
#
# # Проверка пути до текущей директории
# pwd
#
# # Переход в корневую директорию /
# cd /
#
# # Переход в директорию /tmp/linux_lab с использованием абсолютного пути
# cd /tmp/linux_lab

### CodeGym
## Correct solution:
## Author: CodeGym's team
# # Navigate to the /tmp directory using an absolute path
# cd /tmp
#
# # Create a directory named linux_lab
# mkdir linux_lab
#
# # Navigate to the newly created linux_lab directory using a relative path
# cd linux_lab
#
# # Check the path to the current directory
# pwd
#
# # Navigate to the root directory /
# cd /
#
# # Navigate to the /tmp/linux_lab directory using an absolute path
# cd /tmp/linux_lab