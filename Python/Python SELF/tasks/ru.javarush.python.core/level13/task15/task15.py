## Authors: JavaRush's team, CodeGym's team, Altavista360
## Version: 1.0.0

### JavaRush
## Задача: Чтение почты с POP3-сервера
## Ссылка: https://javarush.com/tasks/ru.javarush.python.core.level13.task15

### CodeGym
## Task: Reading mail from a POP3 server
## Link: https://codegym.cc/tasks/en.codegym.python.core.level13.task15

### JavaRush
## Условие:
# Напишите программу, которая подключается к POP3-серверу, аутентифицируется, получает список писем и отображает содержимое последнего письма.

### JavaRush
## Требования:
# • Программа должна осуществлять подключение к указанному POP3-серверу с использованием предоставленных учетных данных.
# • Программа должна выполнять аутентификацию пользователя на POP3-сервере, используя имя пользователя и пароль.
# • Программа должна запрашивать и получать список всех писем, находящихся в почтовом ящике пользователя на POP3-сервере.
# • Программа должна определить последнее письмо в списке и вывести его содержимое на экран.

### JavaRush
## Черновик:
# # Чтение почты с POP3-сервера
#
# # Напишите программу, которая подключается к POP3-серверу, аутентифицируется,
# # получает список писем и отображает содержимое последнего письма.
#
# # Напишите тут ваш код

### JavaRush
# Чтение почты с POP3-сервера

# Напишите программу, которая подключается к POP3-серверу, аутентифицируется,
# получает список писем и отображает содержимое последнего письма.

# Напишите тут ваш код

import poplib
from email.parser import BytesParser
from email.policy import default

POP3_SERVER = 'pop.example.com'
POP3_PORT = 110
USERNAME = 'credentials_username'
PASSWORD = 'credentials_password'

mailbox = poplib.POP3(POP3_SERVER, POP3_PORT)
mailbox.user(USERNAME)
mailbox.pass_(PASSWORD)

num_messages = len(mailbox.list()[1])

if num_messages > 0:
    response, lines, octets = mailbox.retr(num_messages)
    message_content = b'\r\n'.join(lines)

    message = BytesParser(policy=default).parsebytes(message_content)

    print(f"Тема: {message['subject']}")
    print(f"От: {message['from']}")
    print(f"Кому: {message['to']}")
    print(f"Дата: {message['date']}")
    print("\nПисьмо:\n")
    if message.is_multipart():
        for part in message.iter_parts():
            if part.get_content_type() == "text/plain":
                print(part.get_payload(decode=True).decode(part.get_content_charset()))
    else:
        print(message.get_payload(decode=True).decode(message.get_content_charset()))

mailbox.quit()

### JavaRush
## Правильное решение:
## Author: JavaRush's team
# import poplib
# from email.parser import BytesParser
# from email.policy import default
#
# # POP3-сервер и учетные данные
# POP3_SERVER = 'pop.example.com'
# POP3_PORT = 110
# USERNAME = 'your_username'
# PASSWORD = 'your_password'
#
# # Подключение к POP3-серверу и аутентификация
# mailbox = poplib.POP3(POP3_SERVER, POP3_PORT)
# mailbox.user(USERNAME)
# mailbox.pass_(PASSWORD)
#
# # Получение списка писем
# num_messages = len(mailbox.list()[1])
#
# # Если есть письма, получаем содержимое последнего
# if num_messages > 0:
#     response, lines, octets = mailbox.retr(num_messages)
#     message_content = b'\r\n'.join(lines)
#
#     # Парсинг письма
#     message = BytesParser(policy=default).parsebytes(message_content)
#
#     # Отображение содержимого последнего письма
#     print(f"Subject: {message['subject']}")
#     print(f"From: {message['from']}")
#     print(f"To: {message['to']}")
#     print(f"Date: {message['date']}")
#     print("\nBody:\n")
#     if message.is_multipart():
#         for part in message.iter_parts():
#             if part.get_content_type() == "text/plain":
#                 print(part.get_payload(decode=True).decode(part.get_content_charset()))
#     else:
#         print(message.get_payload(decode=True).decode(message.get_content_charset()))
#
# # Закрытие соединения
# mailbox.quit()