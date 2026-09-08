## Authors: JavaRush's team, CodeGym's team, Altavista360
## Version: 1.0.0

### JavaRush
## Задача: Использование энкодера
## Ссылка: https://javarush.com/tasks/ru.javarush.python.core.level13.task03

### CodeGym
## Task: Using an Encoder
## Link: https://codegym.cc/tasks/en.codegym.python.core.level13.task03

### JavaRush
## Условие:
# Напишите программу, которая сериализует объект Python, содержащий дату и время, в JSON-строку с использованием пользовательского кодера для преобразования объектов datetime в строковый формат ISO.

### JavaRush
## Требования:
# • Программа должна использовать библиотеку json для сериализации объектов Python в JSON-строки.
# • Программа должна включать пользовательский кодер, который преобразует объекты datetime в строковый формат ISO.
# • Программа должна оперировать объектами datetime, которые представляют дату и время.
# • Программа должна сериализовать объект Python, содержащий дату и время, в JSON-строку с использованием вышеупомянутого пользовательского кодера.

### JavaRush
## Черновик:
# # Использование энкодера
#
# # Напишите программу, которая сериализует объект Python, содержащий дату и время, в JSON-строку
# # с использованием пользовательского кодера для преобразования объектов datetime в строковый формат ISO.
#
# # Напишите тут ваш код

### JavaRush
# Использование энкодера

# Напишите программу, которая сериализует объект Python, содержащий дату и время, в JSON-строку
# с использованием пользовательского кодера для преобразования объектов datetime в строковый формат ISO.

# Напишите тут ваш код

import json
from datetime import datetime

class DateTimeEncoder(json.JSONEncoder):
    def default(self, obj):
        if isinstance(obj, datetime):
            return obj.isoformat()
        return super().default(obj)

data = {
    'name': 'Harry Potter',
    'timestamp': datetime.now()
}

json_str = json.dumps(data, cls=DateTimeEncoder)
print(json_str)

### JavaRush
## Правильное решение:
## Author: JavaRush's team
# import json
# from datetime import datetime
#
# class DateTimeEncoder(json.JSONEncoder):
#     def default(self, obj):
#         if isinstance(obj, datetime):
#             return obj.isoformat()
#         return super().default(obj)
#
# data = {
#     'name': 'John Doe',
#     'timestamp': datetime.now()
# }
#
# json_str = json.dumps(data, cls=DateTimeEncoder)
# print(json_str)