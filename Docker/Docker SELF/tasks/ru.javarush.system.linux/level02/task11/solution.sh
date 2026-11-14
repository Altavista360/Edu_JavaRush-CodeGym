## Authors: JavaRush's team, CodeGym's team, Altavista360
## Version: 1.0.0

### JavaRush
## Задача: Работа с несколькими пользователями
## Ссылка: https://javarush.com/tasks/ru.javarush.system.linux.level02.task11

### CodeGym
## Task: Working with multiple users
## Link: https://codegym.cc/tasks/en.codegym.system.linux.level02.task11

### JavaRush
## Условие:
# 1. Создайте новую группу `project_team`.
# 2. Создайте пользователей `mike` и `sara`.
# 3. Добавьте обоих пользователей в группу `project_team`.
# 4. Выведите информацию о принадлежности пользователей к группам.

### JavaRush
## Требования:
# • Группа `project_team` должна быть создана с использованием команды `groupadd`.
# • Пользователи `mike` и `sara` должны быть созданы с использованием соответствующей команды, например, `adduser` или `useradd`.
# • Пользователи `mike` и `sara` должны быть добавлены в группу `project_team` с помощью команды `usermod -aG`.
# • Скрипт должен вывести информацию о принадлежности пользователей `mike` и `sara` к группам с помощью команды `groups`.
# • На всех этапах выполнения задач не должно быть ошибок, и команды должны корректно выполняться.
# • Создание группы должно происходить до добавления пользователей в неё, а создание пользователей — до их добавления в группу.

### JavaRush
## Черновик:
# # Создание группы project_team
#
#
# # Создание пользователя mike
#
#
# # Создание пользователя sara
#
#
# # Добавление mike в группу project_team
#
#
# # Добавление sara в группу project_team
#
#
# # Вывод информации о принадлежности mike к группам
#
#
# # Вывод информации о принадлежности sara к группам

### JavaRush
# Создание группы project_team
groupadd project_team

# Создание пользователя mike
useradd -m mike

# Создание пользователя sara
useradd -m sara

# Добавление mike в группу project_team
usermod -aG project_team mike

# Добавление sara в группу project_team
usermod -aG project_team sara

# Вывод информации о принадлежности mike к группам
groups mike

# Вывод информации о принадлежности sara к группам
groups sara

### JavaRush
## Правильное решение:
## Author: JavaRush's team
# # Создание группы project_team
# groupadd project_team
#
# # Создание пользователя mike
# useradd -m mike
#
# # Создание пользователя sara
# useradd -m sara
#
# # Добавление mike в группу project_team
# usermod -aG project_team mike
#
# # Добавление sara в группу project_team
# usermod -aG project_team sara
#
# # Вывод информации о принадлежности mike к группам
# groups mike
#
# # Вывод информации о принадлежности sara к группам
# groups sara