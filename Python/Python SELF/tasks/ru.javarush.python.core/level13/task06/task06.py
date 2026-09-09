## Authors: JavaRush's team, CodeGym's team, Altavista360
## Version: 1.0.0

### JavaRush
## Задача: Отправка POST-запроса
## Ссылка: https://javarush.com/tasks/ru.javarush.python.core.level13.task06

### CodeGym
## Task: Sending a POST Request
## Link: https://codegym.cc/tasks/en.codegym.python.core.level13.task06

### JavaRush
## Условие:
# Напишите программу, которая отправляет POST-запрос с JSON-данными на URL и обрабатывает полученный JSON-ответ.

### JavaRush
## Требования:
# • Программа должна создавать JSON-данные для отправки в POST-запросе.
# • Программа должна отправлять POST-запрос на заданный URL.
# • Программа должна обрабатывать JSON-ответ, полученный в результате POST-запроса.
# • Программа должна использовать подходящую библиотеку для выполнения HTTP-запросов (например, requests в языке Python).

### JavaRush
## Черновик:
# # Отправка POST-запроса
#
# # Напишите программу, которая отправляет POST-запрос с JSON-данными на URL и обрабатывает полученный JSON-ответ.
#
# # Напишите тут ваш код

### JavaRush
# Отправка POST-запроса

# Напишите программу, которая отправляет POST-запрос с JSON-данными на URL и обрабатывает полученный JSON-ответ.

# Напишите тут ваш код

import requests
import json

url = 'http://example.com/api'

data = {
    'name': 'Frodo Baggins',
    'age': 33,
    'city': 'The Shire'
}

response = requests.post(url, json=data)

if response.status_code == 200:
    response_data = response.json()
    print(json.dumps(response_data, indent=4))
else:
    print(f"POST запрос не удался со статусом: {response.status_code}")

### JavaRush
## Правильное решение:
## Author: JavaRush's team
# import requests
# import json
#
# # URL для отправки POST-запроса
# url = 'http://example.com/api'
#
# # Данные, которые будут отправлены в виде JSON
# data = {
#     'name': 'John',
#     'age': 30,
#     'city': 'New York'
# }
#
# # Отправка POST-запроса с JSON-данными
# response = requests.post(url, json=data)
#
# # Проверка успешности запроса
# if response.status_code == 200:
#     # Обработка полученного JSON-ответа
#     response_data = response.json()
#     print(json.dumps(response_data, indent=4))  # Печать ответных данных в красивом формате
# else:
#     print(f"POST запрос не удался, статус код: {response.status_code}")