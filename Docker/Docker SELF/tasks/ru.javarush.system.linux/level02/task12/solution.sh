## Authors: JavaRush's team, CodeGym's team, Altavista360
## Version: 1.0.0

### JavaRush
## Задача: Удаление пользователя из группы и работы с группами
## Ссылка: https://javarush.com/tasks/ru.javarush.system.linux.level02.task12

### CodeGym
## Task: Removing a user from a group and working with groups
## Link: https://codegym.cc/tasks/en.codegym.system.linux.level02.task12

### JavaRush
## Условие:
# 1. Создайте группу `design_team`.
# 2. Создайте пользователя `john`.
# 3. Добавьте пользователя `john` в группу `design_team`.
# 4. Удалите пользователя `john` из группы `design_team`.
# 5. Удалите созданную группу `design_team`.
# 6. Проверьте, что группа `design_team` больше не существует, отобразив список групп.

### JavaRush
## Требования:
# • Скрипт должен создать группу с названием `design_team` с использованием команды `groupadd`.
# • Скрипт должен создать пользователя `john` с использованием команды, например, `adduser` или аналогичной.
# • Скрипт должен добавить пользователя `john` в группу `design_team` с использованием команды `usermod -aG`.
# • Скрипт должен удалить пользователя `john` из группы `design_team`, используя соответствующую команду.
# • Скрипт должен удалить созданную группу `design_team` с использованием команды, такой как `groupdel`.
# • Скрипт должен отобразить список всех групп, чтобы убедиться в удалении группы `design_team`. Используется команда `groups` или ее эквивалент.

### JavaRush
## Черновик:
# # Создание группы `design_team`
#
#
# # Создание пользователя `john`
#
#
# # Добавление пользователя `john` в группу `design_team`
#
#
# # Удаление пользователя `john` из группы `design_team`
#
#
# # Удаление созданной группы `design_team`
#
#
# # Проверка, что группы `design_team` больше не существует

### JavaRush
# Создание группы `design_team`
groupadd design_team

# Создание пользователя `john`
useradd john

# Добавление пользователя `john` в группу `design_team`
usermod -aG design_team john

# Удаление пользователя `john` из группы `design_team`
gpasswd -d john design_team

# Удаление созданной группы `design_team`
groupdel design_team

# Проверка, что группы `design_team` больше не существует
getent group

### JavaRush
## Правильное решение:
## Author: JavaRush's team
# # Создание группы `design_team`
# groupadd design_team
#
# # Создание пользователя `john`
# useradd john
#
# # Добавление пользователя `john` в группу `design_team`
# usermod -aG design_team john
#
# # Удаление пользователя `john` из группы `design_team`
# gpasswd -d john design_team
#
# # Удаление созданной группы `design_team`
# groupdel design_team
#
# # Проверка, что группы `design_team` больше не существует
# getent group