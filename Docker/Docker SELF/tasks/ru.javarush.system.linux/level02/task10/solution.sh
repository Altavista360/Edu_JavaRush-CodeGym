## Authors: JavaRush's team, CodeGym's team, Altavista360
## Version: 1.0.0

### JavaRush
## Задача: Добавление пользователя в группу
## Ссылка: https://javarush.com/tasks/ru.javarush.system.linux.level02.task10

### CodeGym
## Task: Adding a user to a group
## Link: https://codegym.cc/tasks/en.codegym.system.linux.level02.task10

### JavaRush
## Условие:
# Добавьте существующего пользователя `user1` в группу `team_alpha`. Выведите список групп, к которым теперь принадлежит `user1`.

### JavaRush
## Требования:
# • Задача должна быть выполнена с использованием команды `usermod -aG`, которая добавляет пользователя в указанную группу без удаления его из других групп.
# • После добавления пользователя в группу команда `groups` должна быть использована для отображения групп, к которым принадлежит пользователь `user1`.
# • Выполнение команды `usermod` должно сохранить все текущие группы, к которым принадлежит пользователь `user1`.
# • Все действия должны быть выполнены с привилегиями суперпользователя (root) или через команду `sudo`.

### JavaRush
## Черновик:
# # Добавление пользователя user1 в группу team_alpha
#
#
# # Вывод списка групп, к которым принадлежит пользователь user1

### JavaRush
# Добавление пользователя user1 в группу team_alpha
sudo usermod -aG team_alpha user1

# Вывод списка групп, к которым принадлежит пользователь user1
groups user1

### JavaRush
## Правильное решение:
## Author: JavaRush's team
# # Добавление пользователя user1 в группу team_alpha
# sudo usermod -aG team_alpha user1
#
# # Вывод списка групп, к которым принадлежит пользователь user1
# groups user1