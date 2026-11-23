## Authors: JavaRush's team, CodeGym's team, Altavista360
## Version: 1.0.0

### JavaRush
## Задача: Запуск и остановка сервиса
## Ссылка: https://javarush.com/tasks/ru.javarush.system.linux.level03.task01

### CodeGym
## Task: Service Start and Stop
## Link: https://codegym.cc/tasks/en.codegym.system.linux.level03.task01

### JavaRush
## Условие:
# 1. Установите пакет `cron`, если он ещё не установлен.
# 2. С помощью команды `systemctl` запустите службу `cron`.
# 3. С помощью команды `systemctl` остановите службу `cron`.
# Результат: команда `sudo systemctl status cron` должна показывать, что служба была остановлена.

### JavaRush
## Требования:
# • Необходимо проверить, установлен ли пакет `cron`, и установить его, если он отсутствует.
# • Для выполнения задачи необходимо использовать команду `systemctl` для управления сервисами.
# • Сначала необходимо запустить службу `cron` с использованием команды `sudo systemctl start cron`.
# • После запуска требуется остановить службу `cron` с использованием команды `sudo systemctl stop cron`.
# • В конце выполнения задачи команда `sudo systemctl status cron` должна показать, что служба `cron` остановлена.
# • Все команды для управления сервисами должны выполняться с правами суперпользователя (через `sudo` или под root).

### JavaRush
## Черновик:
# # Устанавливаем пакет cron
# sudo apt-get update
# sudo apt-get install -y cron
#
# # Запускаем службу cron
#
#
# # Останавливаем службу cron
#
#
# # Проверяем статус службы cron

### JavaRush
# Устанавливаем пакет cron
sudo apt-get update
sudo apt-get install -y cron

# Запускаем службу cron
sudo systemctl start cron

# Останавливаем службу cron
sudo systemctl stop cron

# Проверяем статус службы cron
sudo systemctl status cron

### JavaRush
## Правильное решение:
## Author: JavaRush's team
# # Устанавливаем пакет cron
# sudo apt-get update
# sudo apt-get install -y cron
#
# # Запускаем службу cron
# sudo systemctl start cron
#
# # Останавливаем службу cron
# sudo systemctl stop cron
#
# # Проверяем статус службы cron
# sudo systemctl status cron