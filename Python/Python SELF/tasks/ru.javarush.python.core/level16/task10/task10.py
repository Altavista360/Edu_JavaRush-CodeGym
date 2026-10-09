## Authors: JavaRush's team, CodeGym's team, Altavista360
## Version: 1.0.0

### JavaRush
## Задача: Реальная хеш-таблица
## Ссылка: https://javarush.com/tasks/ru.javarush.python.core.level16.task10

### CodeGym
## Task: Real Hash Table
## Link: https://codegym.cc/tasks/en.codegym.python.core.level16.task10

### JavaRush
## Условие:
# Напишите класс для реализации хеш-таблицы. Ваш класс должен включать методы для вставки, получения, поиска и удаления элементов. Возможность коллизии хеш-функции можно не учитывать.

### JavaRush
## Требования:
# • Программа должна включать класс, который реализует структуру данных хеш-таблицы.
# • Класс должен включать метод, который позволяет вставлять элементы в хеш-таблицу.
# • Класс должен включать метод, который позволяет получать элементы из хеш-таблицы по ключу.
# • Класс должен включать метод, который позволяет искать элементы в хеш-таблице по ключу.
# • Класс должен включать метод, который позволяет удалять элементы из хеш-таблицы по ключу.

### JavaRush
## Черновик:
# # Реальная хеш-таблица
#
# # Напишите класс для реализации хеш-таблицы.
# # Ваш класс должен включать методы для вставки, получения, поиска и удаления элементов.
# # Возможность коллизии хеш-функции можно не учитывать.
#
# class HashTable:
#     def __init__(self, size=100):
#         self.size = size
#         self.table = [None] * size
#
#     def _hash(self, key):
#         return hash(key) % self.size
#
#     def insert(self, key, value):
#     # Напишите тут ваш код
#
#     def get(self, key):
#     # Напишите тут ваш код
#
#     def delete(self, key):
#     # Напишите тут ваш код
#
#     def search(self, key):
#     # Напишите тут ваш код
#
# # Пример использования
# hash_table = HashTable()
# hash_table.insert("key1", "value1")
# print(hash_table.get("key1"))  # Output: value1
# print(hash_table.search("key1"))  # Output: True
# hash_table.delete("key1")
# print(hash_table.get("key1"))  # Output: None

### JavaRush
# Реальная хеш-таблица

# Напишите класс для реализации хеш-таблицы.
# Ваш класс должен включать методы для вставки, получения, поиска и удаления элементов.
# Возможность коллизии хеш-функции можно не учитывать.

class HashTable:
    def __init__(self, size=100):
        self.size = size
        self.table = [None] * size

    def _hash(self, key):
        return hash(key) % self.size

    def insert(self, key, value):
    # Напишите тут ваш код
        index = self._hash(key)
        if self.table[index] is None:
            self.table[index] = [(key, value)]
        else:
            updated = False
            for i, (k, v) in enumerate(self.table[index]):
                if k == key:
                    self.table[index][i] = (key, value)
                    updated = True
                    break
            if not updated:
                self.table[index].append((key, value))

    def get(self, key):
    # Напишите тут ваш код
        index = self._hash(key)
        if self.table[index] is not None:
            for k, v in self.table[index]:
                if k == key:
                    return v
        return None

    def delete(self, key):
    # Напишите тут ваш код
        index = self._hash(key)
        if self.table[index] is not None:
            for i, (k, v) in enumerate(self.table[index]):
                if k == key:
                    del self.table[index][i]
                    return True
        return False

    def search(self, key):
    # Напишите тут ваш код
        index = self._hash(key)
        if self.table[index] is not None:
            for k, v in self.table[index]:
                if k == key:
                    return True
        return False

# Пример использования
hash_table = HashTable()
hash_table.insert("key1", "value1")
print(hash_table.get("key1"))  # Output: value1
print(hash_table.search("key1"))  # Output: True
hash_table.delete("key1")
print(hash_table.get("key1"))  # Output: None

### JavaRush
## Правильное решение:
## Author: JavaRush's team
# class HashTable:
#     def __init__(self, size=100):
#         self.size = size
#         self.table = [None] * size
#
#     def _hash(self, key):
#         return hash(key) % self.size
#
#     def insert(self, key, value):
#         index = self._hash(key)
#         if self.table[index] is None:
#             self.table[index] = [(key, value)]
#         else:
#             updated = False
#             for i, (k, v) in enumerate(self.table[index]):
#                 if k == key:
#                     self.table[index][i] = (key, value)
#                     updated = True
#                     break
#             if not updated:
#                 self.table[index].append((key, value))
#
#     def get(self, key):
#         index = self._hash(key)
#         if self.table[index] is not None:
#             for k, v in self.table[index]:
#                 if k == key:
#                     return v
#         return None
#
#     def delete(self, key):
#         index = self._hash(key)
#         if self.table[index] is not None:
#             for i, (k, v) in enumerate(self.table[index]):
#                 if k == key:
#                     del self.table[index][i]
#                     return True
#         return False
#
#     def search(self, key):
#         index = self._hash(key)
#         if self.table[index] is not None:
#             for k, v in self.table[index]:
#                 if k == key:
#                     return True
#         return False
#
# # Пример использования
# hash_table = HashTable()
# hash_table.insert("key1", "value1")
# print(hash_table.get("key1"))  # Output: value1
# print(hash_table.search("key1"))  # Output: True
# hash_table.delete("key1")
# print(hash_table.get("key1"))  # Output: None