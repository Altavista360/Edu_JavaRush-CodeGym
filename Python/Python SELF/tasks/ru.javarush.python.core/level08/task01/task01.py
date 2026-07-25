## Authors: JavaRush's team, CodeGym's team, Altavista360
## Version: 1.0.0

### JavaRush
## Задача: Системные функции.
## Ссылка: https://javarush.com/tasks/ru.javarush.python.core.level08.task01

### CodeGym
## Task: System Functions.
## Link: https://codegym.cc/tasks/en.codegym.python.core.level08.task01

### JavaRush
## Условие:
# Напишите программу, которая создает несколько объектов различных типов и использует функции id(), hash(), и dir() для выполнения следующих операций: Определить и вывести уникальные идентификаторы объектов с помощью id(). Вывести хеш-значения хешируемых объектов с помощью hash(). Вывести список атрибутов и методов объекта с помощью dir().

### JavaRush
## Требования:
# • Программа должна создать несколько объектов различных типов.
# • Программа должна определить и вывести уникальные идентификаторы созданных объектов с помощью функции id().
# • Программа должна вычислить и вывести хеш-значения для хешируемых созданных объектов с помощью функции hash().
# • Программа должна вывести список атрибутов и методов для каждого созданного объекта с помощью функции dir().

### JavaRush
## Черновик:
# # Системные функции.
#
# # Напишите программу, которая создает несколько объектов различных типов и
# # использует функции id(), hash(), и dir() для выполнения следующих операций:
# # Определить и вывести уникальные идентификаторы объектов с помощью id().
# # Вывести хеш-значения хешируемых объектов с помощью hash().
# # Вывести список атрибутов и методов объекта с помощью dir().
#
# # Напишите тут ваш код

### JavaRush
# Системные функции.

# Напишите программу, которая создает несколько объектов различных типов и
# использует функции id(), hash(), и dir() для выполнения следующих операций:
# Определить и вывести уникальные идентификаторы объектов с помощью id().
# Вывести хеш-значения хешируемых объектов с помощью hash().
# Вывести список атрибутов и методов объекта с помощью dir().

# Напишите тут ваш код

int_obj = 13
str_obj = "abcdefghijklmnopqrstuvwxyz"
list_obj = [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
tuple_obj = (0, 1, 2, 3, 4, 5, 6, 7, 8, 9)
set_obj = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}
dict_obj = {'a': 0, 'b': 1, 'c': 2}
print("Unique Identifiers:")
print(f"id(int_obj): {id(int_obj)}")
print(f"id(str_obj): {id(str_obj)}")
print(f"id(list_obj): {id(list_obj)}")
print(f"id(tuple_obj): {id(tuple_obj)}")
print(f"id(set_obj): {id(set_obj)}")
print(f"id(dict_obj): {id(dict_obj)}")
print("\nHash Values:")
print(f"hash(int_obj): {hash(int_obj)}")
print(f"hash(str_obj): {hash(str_obj)}")
print(f"hash(tuple_obj): {hash(tuple_obj)}")
print("\nAttributes and Methods:")
print(f"dir(int_obj): {dir(int_obj)}")
print(f"dir(str_obj): {dir(str_obj)}")
print(f"dir(list_obj): {dir(list_obj)}")
print(f"dir(tuple_obj): {dir(tuple_obj)}")
print(f"dir(set_obj): {dir(set_obj)}")
print(f"dir(dict_obj): {dir(dict_obj)}")

### JavaRush
## Правильное решение:
## Author: JavaRush's team
# # Создание нескольких объектов различных типов
# int_obj = 42
# str_obj = "hello"
# list_obj = [1, 2, 3]
# tuple_obj = (4, 5, 6)
# set_obj = {7, 8, 9}
# dict_obj = {'a': 1, 'b': 2}
#
# # Определение и вывод уникальных идентификаторов объектов с помощью id()
# print("Unique Identifiers:")
# print(f"id(int_obj): {id(int_obj)}")
# print(f"id(str_obj): {id(str_obj)}")
# print(f"id(list_obj): {id(list_obj)}")
# print(f"id(tuple_obj): {id(tuple_obj)}")
# print(f"id(set_obj): {id(set_obj)}")
# print(f"id(dict_obj): {id(dict_obj)}")
#
# # Вывод хеш-значений хешируемых объектов с помощью hash()
# print("\nHash Values:")
# print(f"hash(int_obj): {hash(int_obj)}")
# print(f"hash(str_obj): {hash(str_obj)}")
# print(f"hash(tuple_obj): {hash(tuple_obj)}")
#
# # Вывод списка атрибутов и методов объекта с помощью dir()
# print("\nAttributes and Methods:")
# print(f"dir(int_obj): {dir(int_obj)}")
# print(f"dir(str_obj): {dir(str_obj)}")
# print(f"dir(list_obj): {dir(list_obj)}")
# print(f"dir(tuple_obj): {dir(tuple_obj)}")
# print(f"dir(set_obj): {dir(set_obj)}")
# print(f"dir(dict_obj): {dir(dict_obj)}")