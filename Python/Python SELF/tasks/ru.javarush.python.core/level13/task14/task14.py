## Authors: JavaRush's team, CodeGym's team, Altavista360
## Version: 1.0.0

### JavaRush
## Задача: Создание сокет-клиента
## Ссылка: https://javarush.com/tasks/ru.javarush.python.core.level13.task14

### CodeGym
## Task: Creating a socket client
## Link: https://codegym.cc/tasks/en.codegym.python.core.level13.task14

### JavaRush
## Условие:
# Напишите программу, которая создает сокет-клиента, подключается к сокет-серверу, отправляет ему сообщение и получает ответ.

### JavaRush
## Требования:
# • Программа должна создать сокет-клиента с использованием библиотеки, предоставляющей функциональность для работы с сокетами, такой как `socket` в Python.
# • Программа должна использовать созданный сокет для подключения к сокет-серверу. Адрес сервера и порт должны быть заданы в программе.
# • Программа должна отправить сообщение на подключенный сокет-сервер. Сообщение может быть задано в программе или введено пользователем.
# • Программа должна принять ответ от сервера и обработать его, например, вывести на экран.
# • Программа должна корректно закрыть сокет после отправки сообщения и получения ответа.

### JavaRush
## Черновик:
# # Создание сокет-клиента
#
# # Напишите программу, которая создает сокет-клиента, подключается к сокет-серверу, отправляет ему сообщение и получает ответ.
#
# # Напишите тут ваш код

### JavaRush
# Создание сокет-клиента

# Напишите программу, которая создает сокет-клиента, подключается к сокет-серверу, отправляет ему сообщение и получает ответ.

# Напишите тут ваш код

import socket

def main():
    server_host = '127.0.0.1'
    server_port = 12345

    client_socket = socket.socket(socket.AF_INET, socket.SOCK_STREAM)

    try:
        client_socket.connect((server_host, server_port))
        print(f'Подключен к серверу {server_host}:{server_port}')

        message = 'Привет, сервер!'
        client_socket.sendall(message.encode('utf-8'))
        print(f'Сообщение отправлено: {message}')

        response = client_socket.recv(1024).decode('utf-8')
        print(f'Ответ от сервера: {response}')

    except socket.error as e:
        print(f'Ошибка сокета: {e}')

    finally:
        client_socket.close()
        print('Соединение закрыто')

main()

### JavaRush
## Правильное решение:
## Author: JavaRush's team
# import socket
#
# def main():
#     # Параметры сервера
#     server_host = '127.0.0.1'  # Адрес сервера (localhost)
#     server_port = 12345        # Порт сервера
#
#     # Создание сокета-клиента
#     client_socket = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
#
#     try:
#         # Подключение к серверу
#         client_socket.connect((server_host, server_port))
#         print(f'Подключен к серверу {server_host}:{server_port}')
#
#         # Сообщение для отправки серверу
#         message = 'Привет, сервер!'
#         client_socket.sendall(message.encode('utf-8'))
#         print(f'Сообщение отправлено: {message}')
#
#         # Получение ответа от сервера
#         response = client_socket.recv(1024).decode('utf-8')
#         print(f'Ответ от сервера: {response}')
#
#     except socket.error as e:
#         print(f'Ошибка сокета: {e}')
#
#     finally:
#         # Закрытие сокета
#         client_socket.close()
#         print('Соединение закрыто')
#
# main()