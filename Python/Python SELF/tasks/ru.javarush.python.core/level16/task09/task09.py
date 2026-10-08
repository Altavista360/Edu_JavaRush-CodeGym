## Authors: JavaRush's team, CodeGym's team, Altavista360
## Version: 1.0.0

### JavaRush
## Задача: Хеш-таблица
## Ссылка: https://javarush.com/tasks/ru.javarush.python.core.level16.task09

### CodeGym
## Task: Hash Table
## Link: https://codegym.cc/tasks/en.codegym.python.core.level16.task09

### JavaRush
## Условие:
# Напишите класс для реализации хеш-таблицы. Ваш класс должен включать методы для вставки и получения элементов. Возможность коллизии хеш-функции можно не учитывать.

### JavaRush
## Требования:
# • Класс должен включать метод insert, который принимает ключ и значение и добавляет их в хеш-таблицу.
# • Класс должен включать метод get, который принимает ключ и возвращает значение, соответствующее этому ключу.
# • Класс должен использовать внутреннюю структуру данных, такую как массив или словарь, для хранения элементов хеш-таблицы.
# • Класс должен включать метод для генерации хеш-значений на основе ключей.

### JavaRush
## Черновик:
# # Хеш-таблица
#
# # Напишите класс для реализации хеш-таблицы.
# # Ваш класс должен включать методы для вставки и получения элементов.
# # Возможность коллизии хеш-функции можно не учитывать.
#
# # Напишите тут ваш код
#
#
# class HashTable:
#     def __init__(self, size=100):
#         self.size = size
#         self.table = [None] * self.size
#
#     def _hash(self, key):
#     # Напишите тут ваш код
#
#     def insert(self, key, value):
#     # Напишите тут ваш код
#
#     def get(self, key):
#     # Напишите тут ваш код
#
# # Пример использования
# ht = HashTable()
# ht.insert("apple", 1)
# ht.insert("banana", 2)
# print(ht.get("apple"))  # Output: 1
# print(ht.get("banana"))  # Output: 2
# print(ht.get("cherry"))  # Output: None

### JavaRush
# Хеш-таблица

# Напишите класс для реализации хеш-таблицы.
# Ваш класс должен включать методы для вставки и получения элементов.
# Возможность коллизии хеш-функции можно не учитывать.

# Напишите тут ваш код


class HashTable:
    def __init__(self, size=100):
        self.size = size
        self.table = [None] * self.size

    def _hash(self, key):
    # Напишите тут ваш код
        return hash(key) % self.size

    def insert(self, key, value):
    # Напишите тут ваш код
        index = self._hash(key)
        if self.table[index] is None:
            self.table[index] = []
        self.table[index].append((key, value))

    def get(self, key):
    # Напишите тут ваш код
        index = self._hash(key)
        if self.table[index] is None:
            return None
        for k, v in self.table[index]:
            if k == key:
                return v
        return None

# Пример использования
ht = HashTable()
ht.insert("apple", 1)
ht.insert("banana", 2)
print(ht.get("apple"))  # Output: 1
print(ht.get("banana"))  # Output: 2
print(ht.get("cherry"))  # Output: None

### JavaRush
## Правильное решение:
## Author: JavaRush's team
# class HashTable:
#     def __init__(self, size=100):
#         self.size = size
#         self.table = [None] * self.size
#
#     def _hash(self, key):
#         return hash(key) % self.size
#
#     def insert(self, key, value):
#         index = self._hash(key)
#         if self.table[index] is None:
#             self.table[index] = []
#         self.table[index].append((key, value))
#
#     def get(self, key):
#         index = self._hash(key)
#         if self.table[index] is None:
#             return None
#         for k, v in self.table[index]:
#             if k == key:
#                 return v
#         return None
#
# # Пример использования
# ht = HashTable()
# ht.insert("apple", 1)
# ht.insert("banana", 2)
# print(ht.get("apple"))  # Output: 1
# print(ht.get("banana"))  # Output: 2
# print(ht.get("cherry"))  # Output: None