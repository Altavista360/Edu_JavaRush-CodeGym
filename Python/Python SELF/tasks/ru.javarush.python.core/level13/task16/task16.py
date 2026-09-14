## Authors: JavaRush's team, CodeGym's team, Altavista360
## Version: 1.0.0

### JavaRush
## Задача: Отправка почты с использованием SMTP
## Ссылка: https://javarush.com/tasks/ru.javarush.python.core.level13.task16

### CodeGym
## Task: Sending mail using SMTP
## Link: https://codegym.cc/tasks/en.codegym.python.core.level13.task16

### JavaRush
## Условие:
# Напишите программу, которая подключается к SMTP-серверу, аутентифицируется и отправляет письмо.

### JavaRush
## Требования:
# • Программа должна включать функциональность для установления соединения с SMTP-сервером.
# • Программа должна выполнять аутентификацию на SMTP-сервере с использованием предоставленных учетных данных (логина и пароля).
# • Программа должна иметь возможность отправлять письмо через SMTP-сервер, включая указание получателя, отправителя, тему и текст письма.
# • Программа должна включать обработку ошибок для случая неудачной аутентификации, потери соединения и других возможных ошибок при отправке письма.

### JavaRush
## Черновик:
# # Отправка почты с использованием SMTP
#
# # Напишите программу, которая подключается к SMTP-серверу, аутентифицируется и отправляет письмо.
#
# # Напишите тут ваш код

### JavaRush
# Отправка почты с использованием SMTP

# Напишите программу, которая подключается к SMTP-серверу, аутентифицируется и отправляет письмо.

# Напишите тут ваш код

import smtplib
from email.mime.multipart import MIMEMultipart
from email.mime.text import MIMEText

smtp_server = 'smtp.example.com'
smtp_port = 587
username = 'mailbox@example.com'
password = 'credentials__password'
from_email = 'your_email@example.com'
to_email = 'recipient@example.com'
subject = 'Тема письма'
body = 'Это тело письма'

msg = MIMEMultipart()
msg['From'] = from_email
msg['To'] = to_email
msg['Subject'] = subject
msg.attach(MIMEText(body, 'plain'))

try:
    server = smtplib.SMTP(smtp_server, smtp_port)
    server.starttls()
    server.login(username, password)
    server.sendmail(from_email, to_email, msg.as_string())
    print("Письмо отправлено")
except Exception as e:
    print(f"Ошибка при отправке: {e}")
finally:
    server.quit()

### JavaRush
## Правильное решение:
## Author: JavaRush's team
# import smtplib
# from email.mime.multipart import MIMEMultipart
# from email.mime.text import MIMEText
#
# # Настройки
# smtp_server = 'smtp.example.com'
# smtp_port = 587
# username = 'your_email@example.com'
# password = 'your_password'
# from_email = 'your_email@example.com'
# to_email = 'recipient@example.com'
# subject = 'Тема письма'
# body = 'Это тело письма'
#
# # Создание сообщения
# msg = MIMEMultipart()
# msg['From'] = from_email
# msg['To'] = to_email
# msg['Subject'] = subject
# msg.attach(MIMEText(body, 'plain'))
#
# # Подключение к SMTP-серверу и отправка письма
# try:
#     server = smtplib.SMTP(smtp_server, smtp_port)
#     server.starttls()  # Установим соединение TLS
#     server.login(username, password)
#     server.sendmail(from_email, to_email, msg.as_string())
#     print("Письмо успешно отправлено")
# except Exception as e:
#     print(f"Ошибка при отправке письма: {e}")
# finally:
#     server.quit()