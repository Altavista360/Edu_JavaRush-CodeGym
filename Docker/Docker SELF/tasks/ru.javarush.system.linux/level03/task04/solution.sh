## Authors: JavaRush's team, CodeGym's team, Altavista360
## Version: 1.0.0

### JavaRush
## Задача: Управление веб-сервером (потребуется установка nginx)
## Ссылка: https://javarush.com/tasks/ru.javarush.system.linux.level03.task04

### CodeGym
## Task: Managing a web server (requires installing nginx)
## Link: https://codegym.cc/tasks/en.codegym.system.linux.level03.task04

### JavaRush
## Условие:
# 1. Установите веб-сервер `nginx` через ваш менеджер пакетов (например, `sudo apt install nginx`).
# 2. Запустите службу `nginx` через `systemctl`.
# 3. Перезапустите службу `nginx`.
# 4. Проверьте статус службы `nginx`.
# 5. Отключите автозапуск службы `nginx`.
# 6. Проверьте, что автозапуск отключён.
# Подсказки:
# - Команда `systemctl status nginx` покажет, что служба активна.
# - Команда `systemctl is-enabled nginx` должна указать, что автозапуск отключён.

### JavaRush
## Требования:
# • Пользователь должен установить веб-сервер `nginx` через менеджер пакетов (например, командой `sudo apt install nginx`).
# • Пользователь должен запустить службу `nginx` с помощью команды `systemctl start nginx`.
# • Пользователь должен перезапустить службу `nginx` с использованием команды `systemctl restart nginx`.
# • Пользователь должен проверить статус службы `nginx` с помощью команды `systemctl status nginx`.
# • Пользователь должен отключить автозапуск службы `nginx` с использованием команды `systemctl disable nginx`.
# • Пользователь должен проверить, что автозапуск службы отключён, с помощью команды `systemctl is-enabled nginx`.

### JavaRush
## Черновик:
# # Установка веб-сервера nginx
# sudo apt update
# sudo apt install -y nginx
#
# # Запуск службы nginx
#
#
# # Перезапуск службы nginx
#
#
# # Проверка статуса службы nginx
#
#
# # Отключение автозапуска службы nginx
#
#
# # Проверка, что автозапуск службы nginx отключён

### JavaRush
# Установка веб-сервера nginx
sudo apt update
sudo apt install -y nginx

# Запуск службы nginx
sudo systemctl start nginx

# Перезапуск службы nginx
sudo systemctl restart nginx

# Проверка статуса службы nginx
sudo systemctl status nginx

# Отключение автозапуска службы nginx
sudo systemctl disable nginx

# Проверка, что автозапуск службы nginx отключён
sudo systemctl is-enabled nginx

### JavaRush
## Правильное решение:
## Author: JavaRush's team
# # Установка веб-сервера nginx
# sudo apt update
# sudo apt install -y nginx
#
# # Запуск службы nginx
# sudo systemctl start nginx
#
# # Перезапуск службы nginx
# sudo systemctl restart nginx
#
# # Проверка статуса службы nginx
# sudo systemctl status nginx
#
# # Отключение автозапуска службы nginx
# sudo systemctl disable nginx
#
# # Проверка, что автозапуск службы nginx отключён
# sudo systemctl is-enabled nginx