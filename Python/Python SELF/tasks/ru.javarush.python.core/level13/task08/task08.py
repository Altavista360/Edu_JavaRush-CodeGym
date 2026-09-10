## Authors: JavaRush's team, CodeGym's team, Altavista360
## Version: 1.0.0

### JavaRush
## Задача: Обработка ошибок запросов с модулем requests
## Ссылка: https://javarush.com/tasks/ru.javarush.python.core.level13.task08

### CodeGym
## Task: Handling request errors with the requests module
## Link: https://codegym.cc/tasks/en.codegym.python.core.level13.task08

### JavaRush
## Условие:
# Напишите программу, которая отправляет GET-запрос на сервер и обрабатывает возможные ошибки, используя исключения.

### JavaRush
## Требования:
# • Программа должна импортировать модуль requests для отправки HTTP-запросов.
# • Программа должна отправлять GET-запрос на указанный URL с использованием функции requests.get().
# • Программа должна обрабатывать возможные исключения, связанные с запросами, такие как requests.exceptions.RequestException, и выводить соответствующие сообщения об ошибках.

### JavaRush
## Черновик:
# # Обработка ошибок запросов с модулем requests
#
# # Напишите программу, которая отправляет GET-запрос на сервер и обрабатывает возможные ошибки, используя исключения.
#
# # Напишите тут ваш код

### JavaRush
# Обработка ошибок запросов с модулем requests

# Напишите программу, которая отправляет GET-запрос на сервер и обрабатывает возможные ошибки, используя исключения.

# Напишите тут ваш код

import requests

def fetch_url(url):
    try:
        response = requests.get(url)
        response.raise_for_status()
        return response.text
    except requests.exceptions.HTTPError as http_err:
        print(f"HTTP error occurred: {http_err}")
    except requests.exceptions.ConnectionError as conn_err:
        print(f"Connection error occurred: {conn_err}")
    except requests.exceptions.Timeout as timeout_err:
        print(f"Timeout error occurred: {timeout_err}")
    except requests.exceptions.RequestException as req_err:
        print(f"An error occurred: {req_err}")

url = "http://example.com"
content = fetch_url(url)
if content:
    print(content)

### JavaRush
## Правильное решение:
## Author: JavaRush's team
# import requests
#
# def fetch_url(url):
#     try:
#         response = requests.get(url)
#         response.raise_for_status()  # Raises HTTPError for bad responses (4xx and 5xx)
#         return response.text
#     except requests.exceptions.HTTPError as http_err:
#         print(f"HTTP error occurred: {http_err}")
#     except requests.exceptions.ConnectionError as conn_err:
#         print(f"Connection error occurred: {conn_err}")
#     except requests.exceptions.Timeout as timeout_err:
#         print(f"Timeout error occurred: {timeout_err}")
#     except requests.exceptions.RequestException as req_err:
#         print(f"An error occurred: {req_err}")
#
# url = "http://example.com"
# content = fetch_url(url)
# if content:
#     print(content)