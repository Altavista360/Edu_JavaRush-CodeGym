## Authors: JavaRush's team, CodeGym's team, Altavista360
## Version: 1.0.0

### JavaRush
## Задача: Список смежности
## Ссылка: https://javarush.com/tasks/ru.javarush.python.core.level17.task08

### CodeGym
## Task: Adjacency List
## Link: https://codegym.cc/tasks/en.codegym.python.core.level17.task08

### JavaRush
## Условие:
# Напишите функцию для представления графа в виде списков смежности. Функция должна принимать на вход матрицу смежности, а возвращать списки смежности.

### JavaRush
## Требования:
# • Функция должна принимать на вход матрицу смежности в виде списка списков.
# • Функция должна возвращать список, где каждый элемент является списком смежности для соответствующей вершины графа.
# • Функция должна корректно преобразовывать матрицу смежности в списки смежности, учитывая наличие и отсутствие ребер.
# • Функция должна итерировать по каждому элементу матрицы смежности для построения списков смежности.

### JavaRush
## Черновик:
# # Список смежности
#
# # Напишите функцию для представления графа в виде списков смежности.
# # Функция должна принимать на вход матрицу смежности, а возвращать списки смежности.
#
#
# def adjacency_matrix_to_list(matrix):
# # Напишите тут ваш код
#
# # Пример использования
# matrix = [
#     [0, 1, 0, 0],
#     [1, 0, 1, 0],
#     [0, 1, 0, 1],
#     [0, 0, 1, 0]
# ]
#
# print(adjacency_matrix_to_list(matrix))

### JavaRush
# Список смежности

# Напишите функцию для представления графа в виде списков смежности.
# Функция должна принимать на вход матрицу смежности, а возвращать списки смежности.


def adjacency_matrix_to_list(matrix):
# Напишите тут ваш код
    adj_list = []
    for i in range(len(matrix)):
        neighbors = []
        for j in range(len(matrix[i])):
            if matrix[i][j] == 1:
                neighbors.append(j)
        adj_list.append(neighbors)
    return adj_list

# Пример использования
matrix = [
    [0, 1, 0, 0],
    [1, 0, 1, 0],
    [0, 1, 0, 1],
    [0, 0, 1, 0]
]

print(adjacency_matrix_to_list(matrix))

### JavaRush
## Правильное решение:
## Author: JavaRush's team
# def adjacency_matrix_to_list(matrix):
#     adj_list = []
#     for i in range(len(matrix)):
#         neighbors = []
#         for j in range(len(matrix[i])):
#             if matrix[i][j] == 1:
#                 neighbors.append(j)
#         adj_list.append(neighbors)
#     return adj_list
#
# # Пример использования
# matrix = [
#     [0, 1, 0, 0],
#     [1, 0, 1, 0],
#     [0, 1, 0, 1],
#     [0, 0, 1, 0]
# ]
#
# print(adjacency_matrix_to_list(matrix))