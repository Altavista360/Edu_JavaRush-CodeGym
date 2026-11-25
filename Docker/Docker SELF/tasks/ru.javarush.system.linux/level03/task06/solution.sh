## Authors: JavaRush's team, CodeGym's team, Altavista360
## Version: 1.0.0

### JavaRush
## Задача: Фильтрация логов по времени
## Ссылка: https://javarush.com/tasks/ru.javarush.system.linux.level03.task06

### CodeGym
## Task: Filtering logs by time
## Link: https://codegym.cc/tasks/en.codegym.system.linux.level03.task06

### JavaRush
## Условие:
# Отобразите логи системы за последние 2 часа, используя соответствующую опцию команды `journalctl`.

### JavaRush
## Требования:
# • Задача должна быть выполнена с использованием команды `journalctl`.
# • Необходимо отобразить только те системные логи, которые соответствуют последним двум часам.
# • Нужно использовать правильную опцию `journalctl`, предназначенную для фильтрации логов по времени.
# • Команда должна быть написана с соблюдением синтаксиса и структуры, принятых в Linux.
# • В результате выполнения команды должны отображаться только нужные логи, без лишней информации.

### JavaRush
## Черновик:
# # Отображение системных логов за последние 2 часа

### JavaRush
# Отображение системных логов за последние 2 часа
journalctl --since "2 hours ago"

### JavaRush
## Правильное решение:
## Author: JavaRush's team
# # Отображение системных логов за последние 2 часа
# journalctl --since "2 hours ago"