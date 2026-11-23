## Authors: JavaRush's team, CodeGym's team, Altavista360
## Version: 1.0.0

### JavaRush
## Задача: Проверка статуса и автозапуска
## Ссылка: https://javarush.com/tasks/ru.javarush.system.linux.level03.task02

### CodeGym
## Task: Checking service status and enabling autostart
## Link: https://codegym.cc/tasks/en.codegym.system.linux.level03.task02

### JavaRush
## Условие:
# 1. С помощью команды `systemctl` проверьте статус службы `cron`.
# 2. Включите автозапуск для службы `cron`, используя соответствующую команду.
# 3. Проверьте, включён ли автозапуск.
# Подсказка: команда `systemctl is-enabled cron` должна подтвердить, что автозапуск включён.

### JavaRush
## Требования:
# • Задача требует применения команды `systemctl` для выполнения всех действий.
# • Необходимо использовать команду `systemctl status cron` для просмотра текущего состояния службы `cron`.
# • Следует применить соответствующую команду, чтобы активировать автозапуск для службы `cron` (например, `systemctl enable cron`).
# • Нужно убедиться, что автозапуск службы включён, с помощью команды `systemctl is-enabled cron`.
# • Все действия должны быть выполнены только для службы `cron`.
# • Действия должны выполняться последовательно: сначала проверка статуса, затем включение автозапуска, и в конце проверка состояния автозапуска.

### JavaRush
## Черновик:
# # Проверка статуса службы 'cron'
#
#
# # Включение автозапуска для службы 'cron'
#
#
# # Проверка, включён ли автозапуск для службы 'cron'

### JavaRush
# Проверка статуса службы 'cron'
systemctl status cron

# Включение автозапуска для службы 'cron'
systemctl enable cron

# Проверка, включён ли автозапуск для службы 'cron'
systemctl is-enabled cron

### JavaRush
## Правильное решение:
## Author: JavaRush's team
# # Проверка статуса службы 'cron'
# systemctl status cron
#
# # Включение автозапуска для службы 'cron'
# systemctl enable cron
#
# # Проверка, включён ли автозапуск для службы 'cron'
# systemctl is-enabled cron