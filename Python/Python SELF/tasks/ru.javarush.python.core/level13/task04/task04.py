## Authors: JavaRush's team, CodeGym's team, Altavista360
## Version: 1.0.0

### JavaRush
## Задача: Использование декодера
## Ссылка: https://javarush.com/tasks/ru.javarush.python.core.level13.task04

### CodeGym
## Task: Using a Decoder
## Link: https://codegym.cc/tasks/en.codegym.python.core.level13.task04

### JavaRush
## Условие:
# Напишите программу, которая десериализует JSON-строку в объект Python с использованием пользовательского декодера для преобразования строк ISO в объекты datetime.

### JavaRush
## Требования:
# • Программа должна импортировать модуль json для работы с JSON-строками.
# • Программа должна импортировать модуль datetime для работы с объектами datetime.
# • Программа должна определить пользовательский декодер, который будет преобразовывать строки ISO в объекты datetime.
# • Программа должна использовать функцию json.loads для десериализации JSON-строки в объект Python, передавая пользовательский декодер.

### JavaRush
## Черновик:
# # Использование декодера
#
# # Напишите программу, которая десериализует JSON-строку в объект Python с использованием
# # пользовательского декодера для преобразования строк ISO в объекты datetime.
#
# # Напишите тут ваш код

### JavaRush
# Использование декодера

# Напишите программу, которая десериализует JSON-строку в объект Python с использованием
# пользовательского декодера для преобразования строк ISO в объекты datetime.

# Напишите тут ваш код

import json
from datetime import datetime

def iso_to_datetime(iso_str):
    return datetime.fromisoformat(iso_str)

def custom_decoder(dct):
    for key, value in dct.items():
        if isinstance(value, str):
            try:
                dct[key] = iso_to_datetime(value)
            except ValueError:
                pass
    return dct

json_str = '{"name": "Harry", "birthdate": "1908-07-31T12:34:55"}'
result = json.loads(json_str, object_hook=custom_decoder)
print(result)

### JavaRush
## Правильное решение:
## Author: JavaRush's team
# import json
# from datetime import datetime
#
# def iso_to_datetime(iso_str):
#     return datetime.fromisoformat(iso_str)
#
# def custom_decoder(dct):
#     for key, value in dct.items():
#         if isinstance(value, str):
#             try:
#                 dct[key] = iso_to_datetime(value)
#             except ValueError:
#                 pass
#     return dct
#
# json_str = '{"name": "John", "birthdate": "1990-01-01T12:00:00"}'
# result = json.loads(json_str, object_hook=custom_decoder)
# print(result)