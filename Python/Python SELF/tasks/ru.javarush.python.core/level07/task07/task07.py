## Authors: JavaRush's team, CodeGym's team, Altavista360
## Version: 1.0.0

### JavaRush
## Задача: Три проверки.
## Ссылка: https://javarush.com/tasks/ru.javarush.python.core.level07.task07

### CodeGym
## Task: Three checks.
## Link: https://codegym.cc/tasks/en.codegym.python.core.level07.task07

### JavaRush
## Условие:
# Напишите программу, которая создает словарь с информацией о книге (например, название, автор, год издания). Программа должна: Проверить наличие ключа "author" с использованием оператора in. Проверить наличие ключа "publisher" с использованием метода get(). Проверить наличие ключа "title" с использованием метода keys().

### JavaRush
## Требования:
# • Программа должна включать словарь, который содержит информацию о книге, такой как название, автор и год издания (title, author, year).
# • Программа должна использовать оператор in для проверки наличия ключа "author" в словаре.
# • Программа должна использовать метод get() для проверки наличия ключа "publisher" в словаре.
# • Программа должна использовать метод keys() для проверки наличия ключа "title" в словаре.

### JavaRush
## Черновик:
# # Три проверки.
#
# # Напишите программу, которая создает словарь с информацией о книге (title, author, year).
# # Программа должна:
# # Проверить наличие ключа "author" с использованием оператора in.
# # Проверить наличие ключа "publisher" с использованием метода get().
# # Проверить наличие ключа "title" с использованием метода keys().
#
# # Напишите тут ваш код

### JavaRush
# Три проверки.

# Напишите программу, которая создает словарь с информацией о книге (title, author, year).
# Программа должна:
# Проверить наличие ключа "author" с использованием оператора in.
# Проверить наличие ключа "publisher" с использованием метода get().
# Проверить наличие ключа "title" с использованием метода keys().

# Напишите тут ваш код

book_info = {
    "title": "Clean Code",
    "author": "Robert C. Martin",
    "year": 2008
}

if "author" in book_info:
    print("Ключ 'author' найден")

if book_info.get("publisher") is not None:
    print("Ключ 'publisher' найден")
else:
    print("Ключ 'publisher' не найден")

if "title" in book_info.keys():
    print("Ключ 'title' найден")

### JavaRush
## Правильное решение:
## Author: JavaRush's team
# # Создаем словарь с информацией о книге
# book_info = {
#     "title": "To Kill a Mockingbird",
#     "author": "Harper Lee",
#     "year": 1960
# }
#
# # Проверка наличия ключа "author" с использованием оператора in
# if "author" in book_info:
#     print("Ключ 'author' найден")
#
# # Проверка наличия ключа "publisher" с использованием метода get()
# if book_info.get("publisher") is not None:
#     print("Ключ 'publisher' найден")
# else:
#     print("Ключ 'publisher' не найден")
#
# # Проверка наличия ключа "title" с использованием метода keys()
# if "title" in book_info.keys():
#     print("Ключ 'title' найден")