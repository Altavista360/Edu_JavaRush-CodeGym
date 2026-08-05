## Authors: JavaRush's team, CodeGym's team, Altavista360
## Version: 1.0.0

### JavaRush
## Задача: Библиотека.
## Ссылка: https://javarush.com/tasks/ru.javarush.python.core.level09.task06

### CodeGym
## Task: Library.
## Link: https://codegym.cc/tasks/en.codegym.python.core.level09.task06

### JavaRush
## Условие:
# Создайте класс Library, который будет представлять библиотеку книг. Добавьте метод __str__, который будет возвращать строку с информацией о библиотеке с перечнем книг, и метод __len__, который будет возвращать количество книг в библиотеке. Создайте объект класса Library, добавьте в него несколько книг и выведите информацию о библиотеке и количество книг.

### JavaRush
## Требования:
# • Программа должна включать класс Library, который представляет библиотеку книг.
# • В классе Library должен быть метод __str__, который возвращает строковую информацию о библиотеке с перечнем книг.
# • В классе Library должен быть метод __len__, который возвращает количество книг в библиотеке.
# • Должна быть возможность добавлять книги в объект класса Library.
# • Программа должна выводить информацию о библиотеке с перечнем книг и количество книг с использованием методов __str__ и __len__.

### JavaRush
## Черновик:
# # Библиотека.
#
# # Создайте класс Library, который будет представлять библиотеку книг.
# # Добавьте метод __str__, который будет возвращать строку с информацией о библиотеке с перечнем книг, и метод __len__,
# # который будет возвращать количество книг в библиотеке.
# # Создайте объект класса Library, добавьте в него несколько книг и
# # выведите информацию о библиотеке с перечнем книг и количество книг.
#
# class Library:
#     def __init__(self):
#         self.books = []
#
#     def add_book(self, book):
# # Напишите тут ваш код
#
#     def __str__(self):
# # Напишите тут ваш код
#
#     def __len__(self):
# # Напишите тут ваш код
#
#
#
# # Создаем объект библиотеки
# library = Library()
#
# # Добавляем книги в библиотеку
# library.add_book("Harry Potter and the Philosopher's Stone")
# library.add_book("The Great Gatsby")
# library.add_book("1984")
#
# # Выводим информацию о библиотеке с перечнем книг и количество книг
# print(library)
# print(f"Number of books in library: {len(library)}")

### JavaRush
# Библиотека.

# Создайте класс Library, который будет представлять библиотеку книг.
# Добавьте метод __str__, который будет возвращать строку с информацией о библиотеке с перечнем книг, и метод __len__,
# который будет возвращать количество книг в библиотеке.
# Создайте объект класса Library, добавьте в него несколько книг и
# выведите информацию о библиотеке с перечнем книг и количество книг.

class Library:
    def __init__(self):
        self.books = []

    def add_book(self, book):
# Напишите тут ваш код
        self.books.append(book)

    def __str__(self):
# Напишите тут ваш код
        return f"Библиотека содержит {len(self.books)} книг: " + ", ".join(self.books)

    def __len__(self):
# Напишите тут ваш код
        return len(self.books)

# Создаем объект библиотеки
library = Library()

# Добавляем книги в библиотеку
library.add_book("Harry Potter and the Philosopher's Stone")
library.add_book("Harry Potter and the Chamber of Secrets")
library.add_book("Harry Potter and the Prisoner of Azkaban")
library.add_book("Harry Potter and the Goblet of Fire")
library.add_book("Harry Potter and the Order of the Phoenix")
library.add_book("Harry Potter and the Half-Blood Prince")
library.add_book("Harry Potter and the Deathly Hallows")

# Выводим информацию о библиотеке с перечнем книг и количество книг
print(library)
print(f"Колличество книг: {len(library)}")

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
#     def __str__(self):
#         return f"Library with {len(self.books)} books: " + ", ".join(self.books)
#
#     def __len__(self):
#         return len(self.books)
#
# # Создаем объект библиотеки
# library = Library()
#
# # Добавляем книги в библиотеку
# library.add_book("Harry Potter and the Philosopher's Stone")
# library.add_book("The Great Gatsby")
# library.add_book("1984")
#
# # Выводим информацию о библиотеке с перечнем книг и количество книг
# print(library)
# print(f"Number of books in library: {len(library)}")