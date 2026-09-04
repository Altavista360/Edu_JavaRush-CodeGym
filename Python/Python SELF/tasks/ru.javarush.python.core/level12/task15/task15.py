## Authors: JavaRush's team, CodeGym's team, Altavista360
## Version: 1.0.0

### JavaRush
## Задача: Сериализация помощью pickle
## Ссылка: https://javarush.com/tasks/ru.javarush.python.core.level12.task15

### CodeGym
## Task: Serialization with pickle
## Link: https://codegym.cc/tasks/en.codegym.python.core.level12.task15

### JavaRush
## Условие:
# Напишите программу, которая сериализует и десериализует объект Python с использованием модуля pickle. Объектом для сериализации будет словарь, содержащий информацию о студенте: имя, возраст и статус студента.

### JavaRush
## Требования:
# • Программа должна импортировать и использовать модуль pickle для выполнения операций сериализации и десериализации.
# • Программа должна создать словарь, содержащий информацию о студенте с ключами "name", "age" и "status".
# • Программа должна сериализовать словарь студента и сохранить его в файл с помощью модуля pickle.
# • Программа должна загрузить и десериализовать объект из файла, используя модуль pickle, и вывести полученный словарь.
# • Программа должна корректно выводить десериализованный словарь с информацией о студенте для проверки правильности выполнения операций.

### JavaRush
## Черновик:
# # Сериализация помощью pickle
#
# # Напишите программу, которая сериализует и десериализует объект Python с использованием модуля pickle.
# # Объектом для сериализации будет словарь, содержащий информацию о студенте: имя, возраст и статус студента.
#
# # Напишите тут ваш код
#
# Объект для сериализации
# student_info = {
#     'name': 'John Doe',
#     'age': 20,
#     'status': 'student'
# }
#
# # Напишите тут ваш код

### JavaRush
# Сериализация помощью pickle

# Напишите программу, которая сериализует и десериализует объект Python с использованием модуля pickle.
# Объектом для сериализации будет словарь, содержащий информацию о студенте: имя, возраст и статус студента.

# Напишите тут ваш код

# Объект для сериализации
student_info = {
    'name': 'John Doe',
    'age': 20,
    'status': 'student'
}

# Напишите тут ваш код

import pickle

with open('data.pkl', 'wb') as file:
    pickle.dump(student_info, file)

with open('data.pkl', 'rb') as file:
    loaded_data = pickle.load(file)

print(loaded_data)

### JavaRush
## Правильное решение:
## Author: JavaRush's team
# import pickle
#
# # Объект для сериализации
# student_info = {
#     'name': 'John Doe',
#     'age': 20,
#     'status': 'student'
# }
#
# # Сериализация объекта
# with open('student_info.pkl', 'wb') as f:
#     pickle.dump(student_info, f)
#
# # Десериализация объекта
# with open('student_info.pkl', 'rb') as f:
#     loaded_student_info = pickle.load(f)
#
# print(loaded_student_info)