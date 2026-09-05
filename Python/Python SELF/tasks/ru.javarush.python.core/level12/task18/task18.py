## Authors: JavaRush's team, CodeGym's team, Altavista360
## Version: 1.0.0

### JavaRush
## Задача: Сериализация словаря в строку
## Ссылка: https://javarush.com/tasks/ru.javarush.python.core.level12.task18

### CodeGym
## Task: Serializing a dictionary to a string
## Link: https://codegym.cc/tasks/en.codegym.python.core.level12.task18

### JavaRush
## Условие:
# Напишите программу, которая сериализует словарь в строку с использованием модуля pickle, а затем десериализует этот словарь из строки.

### JavaRush
## Требования:
# • Программа должна импортировать модуль pickle.
# • Программа должна создать словарь, который будет сериализован в строку.
# • Программа должна использовать модуль pickle для сериализации словаря в строку.
# • Программа должна использовать модуль pickle для здесериализации словаря из строки.

### JavaRush
## Черновик:
# # Сериализация словаря в строку
#
# # Напишите программу, которая сериализует словарь в строку с использованием модуля pickle,
# # а затем десериализует этот словарь из строки.
#
# import pickle
#
# # Пример словаря для сериализации
# data = {
#     'name': 'Alice',
#     'age': 30,
#     'city': 'Wonderland'
# }
#
#
# # Напишите тут ваш код

### JavaRush
# Сериализация словаря в строку

# Напишите программу, которая сериализует словарь в строку с использованием модуля pickle,
# а затем десериализует этот словарь из строки.

import pickle

# Пример словаря для сериализации
data = {
    'name': 'Alice',
    'age': 30,
    'city': 'Wonderland'
}


# Напишите тут ваш код

foo = pickle.dumps(data)
bar = pickle.loads(foo)
print(bar)

### JavaRush
## Правильное решение:
## Author: JavaRush's team
# import pickle
#
# # Пример словаря для сериализации
# data = {
#     'name': 'Alice',
#     'age': 30,
#     'city': 'Wonderland'
# }
#
# # Сериализация словаря в строку
# serialized_data = pickle.dumps(data)
#
# # Десериализация словаря из строки
# deserialized_data = pickle.loads(serialized_data)
#
# # Вывод результата для проверки
# print("Serialized data:", serialized_data)
# print("Deserialized data:", deserialized_data)