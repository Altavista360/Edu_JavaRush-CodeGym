## Authors: JavaRush's team, CodeGym's team, Altavista360
## Version: 1.0.0

### JavaRush
## Задача: В глубинах самых глубин.
## Ссылка: https://javarush.com/tasks/ru.javarush.python.core.level07.task14

### CodeGym
## Task: In the depths of the deepest depths.
## Link: https://codegym.cc/tasks/en.codegym.python.core.level07.task14

### JavaRush
## Условие:
# Напишите программу, которая создает словарь с информацией о человеке (например, имя, возраст, адрес, и контактная информация). Программа должна: Изменить значения верхнего уровня, вложенного словаря и более глубокого уровня вложенности. Добавить новый элемент во вложенный словарь. Удалить элемент из вложенного словаря и верхнего уровня.

### JavaRush
## Требования:
# • Программа должна создать словарь, содержащий информацию о человеке, такой как name, age, address (city, street, house), contact_info(email, phone).
# • Программа должна изменять значения элементов словаря верхнего уровня.
# • Программа должна изменять значения элементов вложенного словаря.
# • Программа должна добавлять новый элемент во вложенный словарь.
# • Программа должна удалять элементы как из вложенного словаря, так и словаря верхнего уровня.

### JavaRush
## Черновик:
# # В глубинах самых глубин.
#
# # Напишите программу, которая создает словарь с информацией о человеке (name, age, address (city, street, house), contact_info(email, phone)).
# # Программа должна:
# # Изменить значения верхнего уровня, вложенного словаря и более глубокого уровня вложенности.
# # Добавить новый элемент во вложенный словарь.
# # Удалить элемент из вложенного словаря и верхнего уровня.
#
# # Напишите тут ваш код

### JavaRush
# В глубинах самых глубин.

# Напишите программу, которая создает словарь с информацией о человеке (name, age, address (city, street, house), contact_info(email, phone)).
# Программа должна:
# Изменить значения верхнего уровня, вложенного словаря и более глубокого уровня вложенности.
# Добавить новый элемент во вложенный словарь.
# Удалить элемент из вложенного словаря и верхнего уровня.

# Напишите тут ваш код

person = {
    'name': 'Muhammad',
    'age': 23,
    'address': {
        'city': 'Liverpool',
        'street': 'Church Street',
        'house': 32
    },
    'contact_info': {
        'email': 'muhammad@example.com',
        'phone': '+44151244377'
    }
}
person['name'] = 'Noah'
person['age'] = 24
person['address']['city'] = 'Salford'
person['address']['street'] = 'Chapel Street'
person['contact_info']['email'] = 'noah@example.com'
person['address']['apartment'] = 12
del person['contact_info']['phone']
del person['age']
print(person)

### JavaRush
## Правильное решение:
## Author: JavaRush's team
# # Создаем словарь с информацией о человеке
# person = {
#     'name': 'Алексей',
#     'age': 30,
#     'address': {
#         'city': 'Москва',
#         'street': 'Тверская',
#         'house': 10
#     },
#     'contact_info': {
#         'email': 'alexey@example.com',
#         'phone': '+7 123 456 7890'
#     }
# }
#
# # Изменяем значения верхнего уровня
# person['name'] = 'Александр'
# person['age'] = 31
#
# # Изменяем значения во вложенном словаре
# person['address']['city'] = 'Санкт-Петербург'
# person['address']['street'] = 'Невский проспект'
#
# # Изменяем значения в более глубоком уровне вложенности
# person['contact_info']['email'] = 'alexander@example.com'
#
# # Добавляем новый элемент в вложенный словарь
# person['address']['apartment'] = 5
#
# # Удаляем элемент из вложенного словаря
# del person['contact_info']['phone']
#
# # Удаляем элемент верхнего уровня
# del person['age']
#
# # Выводим результат
# print(person)