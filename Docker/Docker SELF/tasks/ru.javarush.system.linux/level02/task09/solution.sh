## Authors: JavaRush's team, CodeGym's team, Altavista360
## Version: 1.0.0

### JavaRush
## Задача: Создание группы
## Ссылка: https://javarush.com/tasks/ru.javarush.system.linux.level02.task09

### CodeGym
## Task: Creating a group
## Link: https://codegym.cc/tasks/en.codegym.system.linux.level02.task09

### JavaRush
## Условие:
# Создайте новую группу с именем `team_alpha`. Проверьте, что группа была добавлена в систему, выполнив команду для просмотра её информации.

### JavaRush
## Требования:
# • Необходимо использовать команду `groupadd` для создания новой группы с именем `team_alpha`.
# • Требуется выполнить команду для просмотра информации о существующих группах и убедиться, что созданная группа `team_alpha` присутствует в списке.
# • Имя создаваемой группы должно быть строго `team_alpha`.
# • Действия по созданию группы должны быть выполнены от имени пользователя с соответствующими правами (например, через `sudo`).

### JavaRush
## Черновик:
# # Создаем новую группу с именем team_alpha с использованием команды groupadd
#
#
# # Проверяем, что группа была добавлена успешно. Для этого выводим информацию о группах и ищем "team_alpha".
# getent group | grep team_alpha

### JavaRush
# Создаем новую группу с именем team_alpha с использованием команды groupadd
sudo groupadd team_alpha

# Проверяем, что группа была добавлена успешно. Для этого выводим информацию о группах и ищем "team_alpha".
getent group | grep team_alpha

### JavaRush
## Правильное решение:
## Author: JavaRush's team
# # Создаем новую группу с именем team_alpha с использованием команды groupadd
# sudo groupadd team_alpha
#
# # Проверяем, что группа была добавлена успешно. Для этого выводим информацию о группах и ищем "team_alpha".
# getent group | grep team_alpha