## Authors: JavaRush's team, CodeGym's team, Altavista360
## Version: 1.0.0

### JavaRush
## Задача: Изменение временной зоны
## Ссылка: https://javarush.com/tasks/ru.javarush.system.linux.level03.task11

### CodeGym
## Task: Changing the Time Zone
## Link: https://codegym.cc/tasks/en.codegym.system.linux.level03.task11

### JavaRush
## Условие:
# Изменение временной зоны
# Напишите последовательность команд, которая:
# 1. Изменяет текущую временную зону системы на UTC.
# 2. Проверяет, что временная зона изменилась.
# 3. Устанавливает временную зону обратно на Europe/Moscow.

### JavaRush
## Требования:
# • Все действия по изменению и проверке временной зоны должны быть выполнены с использованием команды `timedatectl`.
# • Необходимо корректно изменить текущую временную зону системы на UTC.
# • После изменения временной зоны на UTC должно быть выполнено действие для проверки, что временная зона была успешно изменена.
# • После проверки временная зона должна быть изменена обратно на Europe/Moscow.
# • Для выполнения изменения настроек временной зоны необходимо, чтобы команды выполнялись с соответствующими правами (например, с использованием `sudo`, где требуется).

### JavaRush
## Черновик:
# # Устанавливаем временную зону на UTC
# ???
#
# # Проверяем, что временная зона изменилась на UTC
# ??? | grep "Time zone"
#
# # Устанавливаем временную зону обратно на Europe/Moscow
# ??? Europe/Moscow
#
# # Проверяем, что временная зона изменилась обратно на Europe/Moscow
# ??? | grep "Time zone"

### JavaRush
# Устанавливаем временную зону на UTC
sudo timedatectl set-timezone UTC

# Проверяем, что временная зона изменилась на UTC
timedatectl status | grep "Time zone"

# Устанавливаем временную зону обратно на Europe/Moscow
sudo timedatectl set-timezone Europe/Moscow

# Проверяем, что временная зона изменилась обратно на Europe/Moscow
timedatectl status | grep "Time zone"

### JavaRush
## Правильное решение:
## Author: JavaRush's team
# # Устанавливаем временную зону на UTC
# sudo timedatectl set-timezone UTC
#
# # Проверяем, что временная зона изменилась на UTC
# timedatectl status | grep "Time zone"
#
# # Устанавливаем временную зону обратно на Europe/Moscow
# sudo timedatectl set-timezone Europe/Moscow
#
# # Проверяем, что временная зона изменилась обратно на Europe/Moscow
# timedatectl status | grep "Time zone"