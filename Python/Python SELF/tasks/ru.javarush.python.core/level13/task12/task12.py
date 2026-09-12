## Authors: JavaRush's team, CodeGym's team, Altavista360
## Version: 1.0.0

### JavaRush
## Задача: Использование прокси-сервера с модулем http.client
## Ссылка: https://javarush.com/tasks/ru.javarush.python.core.level13.task12

### CodeGym
## Task: Using a Proxy Server with the http.client Module
## Link: https://codegym.cc/tasks/en.codegym.python.core.level13.task12

### JavaRush
## Условие:
# Напишите программу, которая отправляет GET-запрос через прокси-сервер с использованием библиотеки http.client.

### JavaRush
## Требования:
# • Программа должна импортировать библиотеку http.client для выполнения HTTP-запросов.
# • Программа должна создать объект подключения HTTPConnection или HTTPSConnection к прокси-серверу с указанием его адреса и порта.
# • Программа должна добавить заголовок для прокси-запроса, указывающий URL целевого сервера.
# • Программа должна отправить GET-запрос через прокси-сервер и обработать ответ.

### JavaRush
## Черновик:
# # Использование прокси-сервера с модулем http.client
#
# # Напишите программу, которая отправляет GET-запрос через прокси-сервер с использованием библиотеки http.client.
#
# # Напишите тут ваш код

### JavaRush
# Использование прокси-сервера с модулем http.client

# Напишите программу, которая отправляет GET-запрос через прокси-сервер с использованием библиотеки http.client.

# Напишите тут ваш код

import http.client
proxy_host = "proxy.example.com"
proxy_port = 8080
target_host = "www.example.com"
target_path = "/"
conn = http.client.HTTPConnection(proxy_host, proxy_port)
conn.request("GET", target_path, headers={"Host": target_host})
response = conn.getresponse()
print(response.status, response.reason)
data = response.read()
print(data.decode('utf-8'))
conn.close()

### JavaRush
## Правильное решение:
## Author: JavaRush's team
# import http.client
#
# # Прокси сервер
# proxy_host = "proxy.example.com"
# proxy_port = 8080
#
# # Целевой сервер и запрос
# target_host = "www.example.com"
# target_path = "/"
#
# # Устанавливаем соединение с прокси сервером
# conn = http.client.HTTPConnection(proxy_host, proxy_port)
#
# # Отправляем запрос GET через прокси сервер
# conn.request("GET", target_path, headers={"Host": target_host})
#
# # Получаем ответ
# response = conn.getresponse()
#
# # Выводим статус и данные ответа
# print(response.status, response.reason)
# data = response.read()
# print(data.decode('utf-8'))
#
# # Закрываем соединение
# conn.close()