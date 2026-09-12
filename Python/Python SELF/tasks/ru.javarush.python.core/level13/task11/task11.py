## Authors: JavaRush's team, CodeGym's team, Altavista360
## Version: 1.0.0

### JavaRush
## Задача: Использование прокси-сервера с модулем requests
## Ссылка: https://javarush.com/tasks/ru.javarush.python.core.level13.task11

### CodeGym
## Task: Using a Proxy Server with the requests Module
## Link: https://codegym.cc/tasks/en.codegym.python.core.level13.task11

### JavaRush
## Условие:
# Напишите программу, которая отправляет GET-запрос через прокси-сервер с использованием библиотеки requests.

### JavaRush
## Требования:
# • Программа должна создавать словарь, содержащий данные прокси-сервера для использования в запросе.
# • Программа должна импортировать библиотеку requests для отправки HTTP-запросов.
# • Программа должна отправлять GET-запрос через прокси-сервер, используя данные, указанные в прокси-словаре.
# • Программа должна обрабатывать ответ, полученный от GET-запроса, и выводить его содержание на экран.

### JavaRush
## Черновик:
# # Использование прокси-сервера с модулем requests
#
# # Напишите программу, которая отправляет GET-запрос через прокси-сервер с использованием библиотеки requests.
#
# # Напишите тут ваш код

### JavaRush
# Использование прокси-сервера с модулем requests

# Напишите программу, которая отправляет GET-запрос через прокси-сервер с использованием библиотеки requests.

# Напишите тут ваш код

import requests

proxy = {
    'http': 'http://ip_or_domain:port',
    'https': 'https://ip_or_domain:port'
}

url = 'http://example.com'

try:
    response = requests.get(url, proxies=proxy)
    print(response.status_code)
    print(response.text)
except requests.exceptions.RequestException as e:
    print(f"An error occurred: {e}")

### JavaRush
## Правильное решение:
## Author: JavaRush's team
# import requests
#
# # Прокси сервер и порт
# proxy = {
#     'http': 'http://your_proxy_server:port',
#     'https': 'https://your_proxy_server:port'
# }
#
# # URL для отправки GET-запроса
# url = 'http://example.com'
#
# try:
#     response = requests.get(url, proxies=proxy)
#     print(response.status_code)
#     print(response.text)
# except requests.exceptions.RequestException as e:
#     print(f"An error occurred: {e}")