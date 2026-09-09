## Authors: JavaRush's team, CodeGym's team, Altavista360
## Version: 1.0.0

### JavaRush
## Задача: Отправка GET-запроса
## Ссылка: https://javarush.com/tasks/ru.javarush.python.core.level13.task05

### CodeGym
## Task: Sending a GET Request
## Link: https://codegym.cc/tasks/en.codegym.python.core.level13.task05

### JavaRush
## Условие:
# Напишите программу, которая отправляет GET-запрос с параметрами на URL и обрабатывает полученный JSON-ответ.

### JavaRush
## Требования:
# • Программа должна отправить GET-запрос на заданный URL.
# • Программа должна включать параметры в GET-запрос.
# • Программа должна обработать полученный JSON-ответ.

### JavaRush
## Черновик:
# # Отправка GET-запроса
#
# # Напишите программу, которая отправляет GET-запрос с параметрами на URL и обрабатывает полученный JSON-ответ.
#
# # Напишите тут ваш код

### JavaRush
# Отправка GET-запроса

# Напишите программу, которая отправляет GET-запрос с параметрами на URL и обрабатывает полученный JSON-ответ.

# Напишите тут ваш код

import requests

url = 'https://api.example.com/data'

parameters = {
    'parameter1': 'on',
    'parameter2': 'off'
}

response = requests.get(url, params=parameters)

if response.status_code == 200:
    data = response.json()
    print(data)
else:
    print(f"Запрос не удался со статусом: {response.status_code}")

### JavaRush
## Правильное решение:
## Author: JavaRush's team
# import requests
#
# # URL для отправки GET-запроса
# url = 'https://api.example.com/data'
#
# # Параметры запроса
# params = {
#     'param1': 'value1',
#     'param2': 'value2'
# }
#
# # Отправка GET-запроса
# response = requests.get(url, params=params)
#
# # Проверка успешности запроса
# if response.status_code == 200:
#     # Обработка JSON-ответа
#     data = response.json()
#     # Вывод данных
#     print(data)
# else:
#     print(f"Запрос не удался с кодом состояния: {response.status_code}")