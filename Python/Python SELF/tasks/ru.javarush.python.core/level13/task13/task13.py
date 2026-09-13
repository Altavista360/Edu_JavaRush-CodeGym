## Authors: JavaRush's team, CodeGym's team, Altavista360
## Version: 1.0.0

### JavaRush
## Задача: Создание сокет-сервера
## Ссылка: https://javarush.com/tasks/ru.javarush.python.core.level13.task13

### CodeGym
## Task: Creating a Socket Server
## Link: https://codegym.cc/tasks/en.codegym.python.core.level13.task13

### JavaRush
## Условие:
# Напишите программу, которая создает сокет-сервер, принимает входящие соединения от клиентов и отвечает им "Hello, client!".

### JavaRush
## Требования:
# • Программа должна создавать сокет-сервер, который прослушивает входящие соединения на указанном порту.
# • Программа должна быть способна принимать входящие соединения от клиентов.
# • После успешного установления соединения, сервер должен отправить клиенту сообщение "Hello, client!".
# • Программа должна корректно закрывать соединение с клиентом после отправки сообщения.

### JavaRush
## Черновик:
# # Создание сокет-сервера
#
# # Напишите программу, которая создает сокет-сервер, принимает входящие соединения от клиентов и отвечает им "Hello, client!".
#
# # Напишите тут ваш код

### JavaRush
# Создание сокет-сервера

# Напишите программу, которая создает сокет-сервер, принимает входящие соединения от клиентов и отвечает им "Hello, client!".

# Напишите тут ваш код

import socket

def start_server(host='127.0.0.1', port=65432):
    with socket.socket(socket.AF_INET, socket.SOCK_STREAM) as s:
        s.bind((host, port))
        s.listen()
        print(f"Server listening on {host}:{port}")

        while True:
            conn, addr = s.accept()
            with conn:
                print(f"Connected by {addr}")
                conn.sendall(b"Hello, client!")

start_server()

### JavaRush
## Правильное решение:
## Author: JavaRush's team
# import socket
#
# def start_server(host='127.0.0.1', port=65432):
#     with socket.socket(socket.AF_INET, socket.SOCK_STREAM) as s:
#         s.bind((host, port))
#         s.listen()
#         print(f"Server listening on {host}:{port}")
#
#         while True:
#             conn, addr = s.accept()
#             with conn:
#                 print(f"Connected by {addr}")
#                 conn.sendall(b"Hello, client!")
#
# start_server()