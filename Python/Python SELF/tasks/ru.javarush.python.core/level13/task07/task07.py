## Authors: JavaRush's team, CodeGym's team, Altavista360
## Version: 1.0.0

### JavaRush
## Задача: Обработка ответов сервера с модулем requests
## Ссылка: https://javarush.com/tasks/ru.javarush.python.core.level13.task07

### CodeGym
## Task: Handling server responses with the requests module
## Link: https://codegym.cc/tasks/en.codegym.python.core.level13.task07

### JavaRush
## Условие:
# Напишите программу, которая отправляет GET-запрос на сервер и обрабатывает ответ, включая статус-код, заголовки и тело ответа.

### JavaRush
## Требования:
# • Программа должна использовать модуль `requests` для отправки GET-запроса на указанный сервер.
# • Программа должна получить и обработать статус-код ответа сервера.
# • Программа должна получить и вывести заголовки ответа сервера.
# • Программа должна получить и вывести тело ответа сервера.

### JavaRush
## Черновик:
# # Обработка ответов сервера с модулем requests
#
# # Напишите программу, которая отправляет GET-запрос на сервер и обрабатывает ответ, включая статус-код, заголовки и тело ответа.
#
# # Напишите тут ваш код

### JavaRush
# Обработка ответов сервера с модулем requests

# Напишите программу, которая отправляет GET-запрос на сервер и обрабатывает ответ, включая статус-код, заголовки и тело ответа.

# Напишите тут ваш код

import requests

url = 'https://jsonplaceholder.typicode.com/posts/1'

response = requests.get(url)

status_code = response.status_code
headers = response.headers
body = response.text

print(f'Код статуса: {status_code}')
print('Заголовки:')
for key, value in headers.items():
    print(f'  {key}: {value}')
print('Содержание:')
print(body)

### JavaRush
## Правильное решение:
## Author: JavaRush's team
# import requests
#
# # URL для отправки GET-запроса
# url = 'https://jsonplaceholder.typicode.com/posts/1'
#
# # Отправка GET-запроса
# response = requests.get(url)
#
# # Обработка ответа
# status_code = response.status_code
# headers = response.headers
# body = response.text
#
# # Вывод результатов
# print(f'Status Code: {status_code}')
# print('Headers:')
# for key, value in headers.items():
#     print(f'  {key}: {value}')
# print('Body:')
# print(body)