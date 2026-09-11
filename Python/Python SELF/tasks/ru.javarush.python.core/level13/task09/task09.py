## Authors: JavaRush's team, CodeGym's team, Altavista360
## Version: 1.0.0

### JavaRush
## Задача: Выполнение GET-запроса с использованием http.client
## Ссылка: https://javarush.com/tasks/ru.javarush.python.core.level13.task09

### CodeGym
## Task: Executing a GET request using http.client
## Link: https://codegym.cc/tasks/en.codegym.python.core.level13.task09

### JavaRush
## Условие:
# Напишите программу, которая выполняет GET-запрос на сервер, читает и выводит ответ. Программа должна обрабатывать возможные ошибки.

### JavaRush
## Требования:
# • Программа должна импортировать модуль http.client для выполнения GET-запроса.
# • Программа должна устанавливать соединение с сервером с помощью методов модуля http.client.
# • Программа должна отправлять GET-запрос на сервер и получать ответ.
# • Программа должна читать и выводить ответ от сервера.
# • Программа должна включать обработку возможных ошибок, таких как проблемы с подключением или некорректный ответ от сервера.

### JavaRush
## Черновик:
# # Выполнение GET-запроса с использованием http.client
#
# # Напишите программу, которая выполняет GET-запрос на сервер, читает и выводит ответ.
# # Программа должна обрабатывать возможные ошибки.
#
# # Напишите тут ваш код

### JavaRush
# Выполнение GET-запроса с использованием http.client

# Напишите программу, которая выполняет GET-запрос на сервер, читает и выводит ответ.
# Программа должна обрабатывать возможные ошибки.

# Напишите тут ваш код

import http.client

def get_request(host, path):
    try:
        connection = http.client.HTTPConnection(host)
        connection.request("GET", path)
        response = connection.getresponse()

        if response.status == 200:
            data = response.read()
            print(data.decode('utf-8'))
        else:
            print(f"Error: {response.status}, {response.reason}")

    except http.client.HTTPException as e:
        print(f"HTTP error occurred: {e}")
    except Exception as e:
        print(f"An error occurred: {e}")
    finally:
        connection.close()

host = "example.com"
path = "/"
get_request(host, path)

### JavaRush
## Правильное решение:
## Author: JavaRush's team
# import http.client
#
# def get_request(host, path):
#     try:
#         connection = http.client.HTTPConnection(host)
#         connection.request("GET", path)
#         response = connection.getresponse()
#
#         if response.status == 200:
#             data = response.read()
#             print(data.decode('utf-8'))
#         else:
#             print(f"Error: {response.status}, {response.reason}")
#
#     except http.client.HTTPException as e:
#         print(f"HTTP error occurred: {e}")
#     except Exception as e:
#         print(f"An error occurred: {e}")
#     finally:
#         connection.close()
#
# # Example usage
# host = "example.com"
# path = "/"
# get_request(host, path)