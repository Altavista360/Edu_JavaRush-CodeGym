## Authors: JavaRush's team, CodeGym's team, Altavista360
## Version: 1.0.0

### JavaRush
## Задача: Хеш-таблица без коллизий
## Ссылка: https://javarush.com/tasks/ru.javarush.python.core.level16.task11

### CodeGym
## Task: Collision-free Hash Table
## Link: https://codegym.cc/tasks/en.codegym.python.core.level16.task11

### JavaRush
## Условие:
# Напишите класс для реализации хеш-таблицы с использованием цепочек (chaining). Ваш класс должен включать методы для вставки и получения элементов. Также напишите функцию для демонстрации работы хеш-таблицы. Возможную коллизию хеш-функции нужно решить методом цепочек.

### JavaRush
## Требования:
# • Программа должна включать класс HashTable, который будет реализовывать хеш-таблицу с использованием цепочек.
# • Класс HashTable должен включать метод insert, который позволяет добавлять элементы в таблицу.
# • Класс HashTable должен включать метод get, который позволяет извлекать элементы из таблицы с использованием их ключей.
# • В случае коллизии (когда два ключа хешируются в одно и то же значение), программа должна использовать цепочки (списки) для хранения всех элементов, хешировавшихся по данному значению.
# • Программа должна включать отдельную функцию, которая будет демонстрировать работу хеш-таблицы, показывая вставку и извлечение элементов.

### JavaRush
## Черновик:
# # Хеш-таблица без коллизий
#
# # Напишите класс для реализации хеш-таблицы с использованием цепочек (chaining).
# # Ваш класс должен включать методы для вставки и получения элементов.
# # Также напишите функцию для демонстрации работы хеш-таблицы.
# # Возможную коллизию хеш-функции нужно решить методом цепочек.
#
#
# class Node:
#     def __init__(self, key, value):
#         self.key = key
#         self.value = value
#         self.next = None
#
# class HashTable:
#     def __init__(self, size):
#         self.size = size
#         self.table = [None] * size
#
#     def _hash_function(self, key):
#         return hash(key) % self.size
#
#     def insert(self, key, value):
#     # Напишите тут ваш код
#
#     def get(self, key):
#     # Напишите тут ваш код
#
#
# ht = HashTable(10)
# ht.insert('apple', 1)
# ht.insert('banana', 2)
# ht.insert('grape', 3)
# ht.insert('apple', 4)
#
# print(ht.get('apple'))   # Output: 4
# print(ht.get('banana'))  # Output: 2
# print(ht.get('grape'))   # Output: 3
# print(ht.get('pear'))    # Output: None

### JavaRush
# Хеш-таблица без коллизий

# Напишите класс для реализации хеш-таблицы с использованием цепочек (chaining).
# Ваш класс должен включать методы для вставки и получения элементов.
# Также напишите функцию для демонстрации работы хеш-таблицы.
# Возможную коллизию хеш-функции нужно решить методом цепочек.


class Node:
    def __init__(self, key, value):
        self.key = key
        self.value = value
        self.next = None

class HashTable:
    def __init__(self, size):
        self.size = size
        self.table = [None] * size

    def _hash_function(self, key):
        return hash(key) % self.size

    def insert(self, key, value):
    # Напишите тут ваш код
        index = self._hash_function(key)
        new_node = Node(key, value)
        if self.table[index] is None:
            self.table[index] = new_node
        else:
            current = self.table[index]
            while current.next is not None:
                if current.key == key:
                    current.value = value
                    return
                current = current.next
            if current.key == key:
                current.value = value
            else:
                current.next = new_node

    def get(self, key):
    # Напишите тут ваш код
        index = self._hash_function(key)
        current = self.table[index]
        while current is not None:
            if current.key == key:
                return current.value
            current = current.next
        return None

ht = HashTable(10)
ht.insert('apple', 1)
ht.insert('banana', 2)
ht.insert('grape', 3)
ht.insert('apple', 4)

print(ht.get('apple'))   # Output: 4
print(ht.get('banana'))  # Output: 2
print(ht.get('grape'))   # Output: 3
print(ht.get('pear'))    # Output: None

### JavaRush
## Правильное решение:
## Author: JavaRush's team
# class Node:
#     def __init__(self, key, value):
#         self.key = key
#         self.value = value
#         self.next = None
#
# class HashTable:
#     def __init__(self, size):
#         self.size = size
#         self.table = [None] * size
#
#     def _hash_function(self, key):
#         return hash(key) % self.size
#
#     def insert(self, key, value):
#         index = self._hash_function(key)
#         new_node = Node(key, value)
#         if self.table[index] is None:
#             self.table[index] = new_node
#         else:
#             current = self.table[index]
#             while current.next is not None:
#                 if current.key == key:
#                     current.value = value
#                     return
#                 current = current.next
#             if current.key == key:
#                 current.value = value
#             else:
#                 current.next = new_node
#
#     def get(self, key):
#         index = self._hash_function(key)
#         current = self.table[index]
#         while current is not None:
#             if current.key == key:
#                 return current.value
#             current = current.next
#         return None
#
#
# ht = HashTable(10)
# ht.insert('apple', 1)
# ht.insert('banana', 2)
# ht.insert('grape', 3)
# ht.insert('apple', 4)
#
# print(ht.get('apple'))   # Output: 4
# print(ht.get('banana'))  # Output: 2
# print(ht.get('grape'))   # Output: 3
# print(ht.get('pear'))    # Output: None