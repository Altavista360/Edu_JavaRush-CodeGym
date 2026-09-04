## Authors: JavaRush's team, CodeGym's team, Altavista360
## Version: 1.0.0

### JavaRush
## Задача: Сериализация с помощью yaml
## Ссылка: https://javarush.com/tasks/ru.javarush.python.core.level12.task16

### CodeGym
## Task: Serialization using YAML
## Link: https://codegym.cc/tasks/en.codegym.python.core.level12.task16

### JavaRush
## Условие:
# Напишите программу, которая сериализует и десериализует объект Python с использованием модуля yaml. Объектом для сериализации будет словарь, содержащий информацию о фильме: название, режиссёр и год выпуска.

### JavaRush
## Требования:
# • Программа должна импортировать модуль yaml для выполнения операций сериализации и десериализации.
# • Программа должна создать словарь, содержащий информацию о фильме, включая ключи "название", "режиссёр" и "год выпуска".
# • Программа должна сериализовать созданный словарь в строку формата YAML с использованием методов модуля yaml.
# • Программа должна десериализовать строку формата YAML обратно в объект Python с использованием методов модуля yaml.
# • Программа должна вывести на экран сериализованную строку формата YAML и десериализованный объект словаря.

### JavaRush
## Черновик:
# # Сериализация с помощью yaml
#
# # Напишите программу, которая сериализует и десериализует объект Python с использованием модуля yaml.
# # Объектом для сериализации будет словарь, содержащий информацию о фильме: название, режиссёр и год выпуска.
#
# # Напишите тут ваш код
#
# # Пример словаря с информацией о фильме
# film_info = {
#     'title': 'Inception',
#     'director': 'Christopher Nolan',
#     'year': 2010
# }
#
# # Напишите тут ваш код

### JavaRush
# Сериализация с помощью yaml

# Напишите программу, которая сериализует и десериализует объект Python с использованием модуля yaml.
# Объектом для сериализации будет словарь, содержащий информацию о фильме: название, режиссёр и год выпуска.

# Напишите тут ваш код

# Пример словаря с информацией о фильме
film_info = {
    'title': 'Inception',
    'director': 'Christopher Nolan',
    'year': 2010
}

# Напишите тут ваш код

import yaml

film_info_rus = {
    'название': 'Начало',
    'режиссёр': 'Кристофер Нолан',
    'год выпуска': 2010
}

yaml_string = yaml.dump(film_info_rus)
print(yaml_string)

with open('data.yaml', 'w') as file:
    yaml.dump(film_info_rus, file)
loaded_data = yaml.load(yaml_string, Loader=yaml.FullLoader)
print(loaded_data)

with open('data.yaml', 'r') as file:
    loaded_data = yaml.load(file, Loader=yaml.FullLoader)
print(loaded_data)

### JavaRush
## Правильное решение:
## Author: JavaRush's team
# import yaml
#
# film_info = {
#     "название": "Матрица",
#     "режиссёр": "Лана и Лилли Вачовски",
#     "год выпуска": 1999
# }
#
# yaml_str = yaml.dump(film_info, default_flow_style=False)
#
# deserialized_data = yaml.load(yaml_str, Loader=yaml.SafeLoader)
#
# print("Сериализованная строка в формате YAML:")
# print(yaml_str)
#
# print("Десериализованный объект словаря:")
# print(deserialized_data)