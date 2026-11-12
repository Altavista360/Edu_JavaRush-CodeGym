## Authors: JavaRush's team, CodeGym's team, Altavista360
## Version: 1.0.0

### JavaRush
## Задача: Изменение параметров пользователя
## Ссылка: https://javarush.com/tasks/ru.javarush.system.linux.level02.task06

### CodeGym
## Task: Modifying user parameters
## Link: https://codegym.cc/tasks/en.codegym.system.linux.level02.task06

### JavaRush
## Условие:
# Изменение параметров пользователя
# 1. Измените имя пользователя `new_user` на `developer`.
# 2. Смените домашнюю директорию пользователя на `/home/developer` с переносом всех данных.
# 3. Визуально проверьте изменения в файле `/etc/passwd`.

### JavaRush
## Требования:
# • Для изменения имени пользователя и домашней директории необходимо использовать команду `usermod`.
# • Скрипт или команда должна успешно переименовать пользователя `new_user` в `developer`.
# • Домашняя директория пользователя должна быть изменена на `/home/developer` с переносом всех данных из старой директории.
# • Результаты произведённых изменений должны быть проверены в файле `/etc/passwd`.
# • При переносе домашней директории данные из старой директории пользователя не должны быть потеряны.
# • Пользователь или скрипт должен выполнить вывод содержимого файла `/etc/passwd` для визуальной проверки.

### JavaRush
## Черновик:
# # Измените имя пользователя `new_user` на `developer`.
#
#
# # Смените домашнюю директорию пользователя на `/home/developer` с переносом всех данных.
#
#
# # Визуально проверьте изменения в файле `/etc/passwd`.
# grep developer /etc/passwd

### JavaRush
# Измените имя пользователя `new_user` на `developer`.
usermod -l developer new_user

# Смените домашнюю директорию пользователя на `/home/developer` с переносом всех данных.
usermod -d /home/developer -m developer

# Визуально проверьте изменения в файле `/etc/passwd`.
grep developer /etc/passwd

### JavaRush
## Правильное решение:
## Author: JavaRush's team
# # Измените имя пользователя `new_user` на `developer`.
# usermod -l developer new_user
#
# # Смените домашнюю директорию пользователя на `/home/developer` с переносом всех данных.
# usermod -d /home/developer -m developer
#
# # Визуально проверьте изменения в файле `/etc/passwd`.
# grep developer /etc/passwd