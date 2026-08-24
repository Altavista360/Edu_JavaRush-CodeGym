## Authors: JavaRush's team, CodeGym's team, Altavista360
## Version: 1.0.0

### JavaRush
## Задача: Перегрузка операторов индексации
## Ссылка: https://javarush.com/tasks/ru.javarush.python.core.level11.task12

### CodeGym
## Task: Overloading Indexing Operators
## Link: https://codegym.cc/tasks/en.codegym.python.core.level11.task12

### JavaRush
## Условие:
# Напишите класс Matrix, который будет представлять двумерную матрицу и поддерживать перегрузку операторов индексации ([]). Реализуйте методы __getitem__ и __setitem__.

### JavaRush
## Требования:
# • Программа должна включать определение класса Matrix, который будет представлять собой двумерную матрицу.
# • Класс Matrix должен иметь метод __getitem__, который позволяет получать доступ к элементам матрицы по указанным индексам.
# • Класс Matrix должен иметь метод __setitem__, который позволяет присваивать значения элементам матрицы по указанным индексам.
# • Класс Matrix должен поддерживать хранение данных в виде двумерной структуры (например, список списков) для правильного функционирования методов __getitem__ и __setitem__.
# • Методы __getitem__ и __setitem__ должны корректно обрабатывать некорректные индексы (например, выходящие за пределы матрицы) и выдавать соответствующие ошибки, такие как IndexError.

### JavaRush
## Черновик:
# # Перегрузка операторов индексации
#
# # Напишите класс Matrix, который будет представлять двумерную матрицу и поддерживать перегрузку операторов индексации ([]).
# # Реализуйте методы __getitem__ и __setitem__.
#
# class Matrix:
#
# # Напишите тут ваш код
#
#
#
# # Пример использования
# matrix = Matrix(3, 3)
# matrix[0, 0] = 1
# print(matrix[0, 0])  # Вывод: 1

### JavaRush
# Перегрузка операторов индексации

# Напишите класс Matrix, который будет представлять двумерную матрицу и поддерживать перегрузку операторов индексации ([]).
# Реализуйте методы __getitem__ и __setitem__.

class Matrix:

# Напишите тут ваш код

    def __init__(self, rows, cols, fill_value=0):
        self.rows = rows
        self.cols = cols
        self.data = [[fill_value for _ in range(cols)] for _ in range(rows)]

    def __getitem__(self, indices):
        row, col = indices
        if row >= self.rows or col >= self.cols:
            raise IndexError("Index out of range")
        try:
            return self.data[row][col]
        except TypeError as e:
            raise e

    def __setitem__(self, indices, value):
        row, col = indices
        if row >= self.rows or col >= self.cols:
            raise IndexError("Index out of range")
        self.data[row][col] = value

# Пример использования
matrix = Matrix(3, 3)
matrix[0, 0] = 1
print(matrix[0, 0])  # Вывод: 1

### JavaRush
## Правильное решение:
## Author: JavaRush's team
# class Matrix:
#     def __init__(self, rows, cols, fill_value=0):
#         self.rows = rows
#         self.cols = cols
#         self.data = [[fill_value for _ in range(cols)] for _ in range(rows)]
#
#     def __getitem__(self, indices):
#         row, col = indices
#         if row >= self.rows or col >= self.cols:
#             raise IndexError("Index out of range")
#         return self.data[row][col]
#
#     def __setitem__(self, indices, value):
#         row, col = indices
#         if row >= self.rows or col >= self.cols:
#             raise IndexError("Index out of range")
#         self.data[row][col] = value
#
# # Пример использования
# matrix = Matrix(3, 3)
# matrix[0, 0] = 1
# print(matrix[0, 0])  # Вывод: 1