## Authors: JavaRush's team, CodeGym's team, Altavista360
## Version: 1.0.0

### JavaRush
## Задача: Создаем классы.
## Ссылка: https://javarush.com/tasks/ru.javarush.python.core.level09.task02

### CodeGym
## Task: Create classes.
## Link: https://codegym.cc/tasks/en.codegym.python.core.level09.task02

### JavaRush
## Условие:
# Создайте класс Library с атрибутом books, который представляет собой список книг. Добавьте методы add_book(book) для добавления книги в библиотеку и display_books() для вывода списка всех книг. Создайте объект класса Library, добавьте несколько книг и выведите список книг, используя методы объекта.

### JavaRush
## Требования:
# • Программа должна включать класс Library с атрибутом books, представляющим собой список книг.
# • Класс Library должен содержать метод add_book(book), который добавляет книгу в список books.
# • Класс Library должен содержать метод display_books(), который выводит список всех книг.
# • Программа должна создавать объект класса Library.
# • Программа должна использовать методы add_book(book) и display_books() на созданном объекте для добавления книг и вывода списка книг.

### JavaRush
## Черновик:
# # Создаем классы.
#
# # Создайте класс Library с атрибутом books, который представляет собой список книг.
# # Добавьте методы add_book(book) для добавления книги в библиотеку
# # и display_books() для вывода списка всех книг.
# # Создайте объект класса Library, добавьте несколько книг и выведите список книг, используя методы объекта.
#
# # Напишите тут ваш код

### JavaRush
# Создаем классы.

# Создайте класс Library с атрибутом books, который представляет собой список книг.
# Добавьте методы add_book(book) для добавления книги в библиотеку
# и display_books() для вывода списка всех книг.
# Создайте объект класса Library, добавьте несколько книг и выведите список книг, используя методы объекта.

# Напишите тут ваш код

class Library:
    def __init__(self):
        self.books = []

    def add_book(self, book):
        self.books.append(book)

    def display_books(self):
        for book in self.books:
            print(book)

library = Library()

library.add_book("Harry Potter and the Philosopher's Stone")
library.add_book("Harry Potter and the Chamber of Secrets")
library.add_book("Harry Potter and the Prisoner of Azkaban")
library.add_book("Harry Potter and the Goblet of Fire")
library.add_book("Harry Potter and the Order of the Phoenix")
library.add_book("Harry Potter and the Half-Blood Prince")
library.add_book("Harry Potter and the Deathly Hallows")

library.display_books()

### JavaRush
## Правильное решение:
## Author: JavaRush's team
# class Library:
#     def __init__(self):
#         self.books = []
#
#     def add_book(self, book):
#         self.books.append(book)
#
#     def display_books(self):
#         for book in self.books:
#             print(book)
#
# # Создание объекта класса Library
# library = Library()
#
# # Добавление нескольких книг
# library.add_book("War and Peace")
# library.add_book("1984")
# library.add_book("The Great Gatsby")
#
# # Вывод списка всех книг
# library.display_books()