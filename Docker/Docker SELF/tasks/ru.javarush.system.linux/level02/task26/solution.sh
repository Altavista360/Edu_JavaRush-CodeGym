## Authors: JavaRush's team, CodeGym's team, Altavista360
## Version: 1.0.0

### JavaRush
## Задача: Создание группы и добавление пользователей
## Ссылка: https://javarush.com/tasks/ru.javarush.system.linux.level02.task26

### CodeGym
## Task: Creating a group and adding users
## Link: https://codegym.cc/tasks/en.codegym.system.linux.level02.task26

### JavaRush
## Условие:
# Создайте группу `developers` и добавьте в неё пользователей `user1` и `user2`. Выведите список групп для каждого пользователя, чтобы убедиться, что они являются членами группы `developers`.

### JavaRush
## Требования:
# • Скрипт должен создавать группу с именем `developers` с использованием соответствующей команды Linux.
# • Скрипт должен добавлять существующих пользователей `user1` и `user2` в группу `developers` с помощью команды `usermod -aG`.
# • Для каждого пользователя (`user1` и `user2`) должно быть выполнено отображение списка групп, к которым они принадлежат, с использованием команды `groups`.
# • Списки групп для `user1` и `user2` должны содержать группу `developers`.
# • Все команды для создания группы, добавления пользователей и проверки групп должны быть выполнены через терминал.
# • Добавление пользователей в группу должно происходить после создания группы.

### JavaRush
## Черновик:
# # Создание группы "developers"
#
#
# # Добавление пользователей `user1` и `user2` в группу "developers"
#
#
# # Проверка, что пользователи добавлены в группу "developers"
# echo "Группы для user1:"
#
#
# echo "Группы для user2:"

### JavaRush
# Создание группы "developers"
groupadd developers

# Добавление пользователей `user1` и `user2` в группу "developers"
usermod -aG developers user1
usermod -aG developers user2

# Проверка, что пользователи добавлены в группу "developers"
echo "Группы для user1:"
groups user1

echo "Группы для user2:"
groups user2

### JavaRush
## Правильное решение:
## Author: JavaRush's team
# # Создание группы "developers"
# groupadd developers
#
# # Добавление пользователей `user1` и `user2` в группу "developers"
# usermod -aG developers user1
# usermod -aG developers user2
#
# # Проверка, что пользователи добавлены в группу "developers"
# echo "Группы для user1:"
# groups user1
#
# echo "Группы для user2:"
# groups user2