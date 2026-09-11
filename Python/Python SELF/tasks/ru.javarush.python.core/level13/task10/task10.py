## Authors: JavaRush's team, CodeGym's team, Altavista360
## Version: 1.0.0

### JavaRush
## Задача: Выполнение POST-запроса с использованием http.client
## Ссылка: https://javarush.com/tasks/ru.javarush.python.core.level13.task10

### CodeGym
## Task: Performing a POST request using http.client
## Link: https://codegym.cc/tasks/en.codegym.python.core.level13.task10

### JavaRush
## Условие:
# Напишите программу, которая выполняет POST-запрос на сервер с передачей данных и выводит ответ. Программа должна обрабатывать возможные ошибки.

### JavaRush
## Требования:
# • Программа должна включать импорт модуля http.client для выполнения HTTP-запросов.
# • Программа должна создать соединение с сервером с использованием класса HTTPConnection или HTTPSConnection.
# • Программа должна сформировать и отправить POST-запрос на сервер вместе с данными.
# • Программа должна корректно обрабатывать и выводить ответ сервера.
# • Программа должна включать обработку возможных ошибок, таких как ошибки соединения или получения ответа от сервера.

### JavaRush
## Черновик:
# # Выполнение POST-запроса с использованием http.client
#
# # Напишите программу, которая выполняет POST-запрос на сервер с передачей данных и выводит ответ.
# # Программа должна обрабатывать возможные ошибки.
#
# # Напишите тут ваш код

### JavaRush
# # Выполнение POST-запроса с использованием http.client
#
# # Напишите программу, которая выполняет POST-запрос на сервер с передачей данных и выводит ответ.
# # Программа должна обрабатывать возможные ошибки.
#
# # Напишите тут ваш код

import http.client
import json

def make_post_request(host, endpoint, data):
    try:
        connection = http.client.HTTPConnection(host)
        json_data = json.dumps(data)
        headers = {'Content-type': 'application/json'}
        connection.request('POST', endpoint, body=json_data, headers=headers)
        response = connection.getresponse()
        return response.status, response.reason, response.read().decode()

    except Exception as e:
        return None, None, f'Error: {e}'

    finally:
        connection.close()

host = 'example.com'
endpoint = '/api/data'
data = {'key': 'value'}

status, reason, response = make_post_request(host, endpoint, data)
print(f'Status: {status}')
print(f'Reason: {reason}')
print(f'Response: {response}')

### JavaRush
## Правильное решение:
## Author: JavaRush's team
# import http.client
# import json
#
# def make_post_request(host, endpoint, data):
#     try:
#         # Установим соединение с хостом
#         connection = http.client.HTTPConnection(host)
#
#         # Преобразуем данные в формат JSON
#         json_data = json.dumps(data)
#
#         # Заголовки для POST-запроса
#         headers = {'Content-type': 'application/json'}
#
#         # Выполним POST-запрос
#         connection.request('POST', endpoint, body=json_data, headers=headers)
#
#         # Получим ответ
#         response = connection.getresponse()
#
#         # Считаем и вернем данные ответа
#         return response.status, response.reason, response.read().decode()
#
#     except Exception as e:
#         # Обработка ошибок
#         return None, None, f'Error: {e}'
#
#     finally:
#         # Закрытие соединения
#         connection.close()
#
# # Пример использования функции
# host = 'example.com'
# endpoint = '/api/data'
# data = {'key': 'value'}
#
# status, reason, response = make_post_request(host, endpoint, data)
# print(f'Status: {status}')
# print(f'Reason: {reason}')
# print(f'Response: {response}')