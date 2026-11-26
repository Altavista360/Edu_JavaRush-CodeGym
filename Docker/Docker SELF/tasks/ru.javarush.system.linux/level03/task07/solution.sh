## Authors: JavaRush's team, CodeGym's team, Altavista360
## Version: 1.0.0

### JavaRush
## Задача: Работа с логами конкретного сервиса
## Ссылка: https://javarush.com/tasks/ru.javarush.system.linux.level03.task07

### CodeGym
## Task: Working with logs for a specific service
## Link: https://codegym.cc/tasks/en.codegym.system.linux.level03.task07

### JavaRush
## Условие:
# Напишите команду для отображения логов сервиса `cron` за последние 24 часа. Также найдите в этих логах строки, содержащие слово `ERROR` (используйте подходящие команды и фильтрацию).

### JavaRush
## Требования:
# • Команда должна использовать утилиту `journalctl` для работы с системными журналами.
# • Команда должна отображать логи, относящиеся только к сервису `cron`.
# • Команда должна ограничивать вывод логов за последние 24 часа.
# • Команда должна находить только строки, содержащие слово `ERROR`.
# • Для поиска строки `ERROR` необходимо использовать подходящие инструменты фильтрации (например, `grep`).

### JavaRush
## Черновик:
# # Вывод логов сервиса `cron` за последние 24 часа и поиск строк с ключевым словом `ERROR`
# ???  | grep "ERROR"

### JavaRush
# Вывод логов сервиса `cron` за последние 24 часа и поиск строк с ключевым словом `ERROR`
journalctl --unit=cron --since "24 hours ago" | grep "ERROR"

### JavaRush
## Правильное решение:
## Author: JavaRush's team
# # Вывод логов сервиса `cron` за последние 24 часа и поиск строк с ключевым словом `ERROR`
# journalctl --unit=cron --since "24 hours ago" | grep "ERROR"