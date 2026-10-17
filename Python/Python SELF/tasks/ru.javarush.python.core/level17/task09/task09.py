## Authors: JavaRush's team, CodeGym's team, Altavista360
## Version: 1.0.0

### JavaRush
## Задача: Выход из лабиринта
## Ссылка: https://javarush.com/tasks/ru.javarush.python.core.level17.task09

### CodeGym
## Task: Maze Exit
## Link: https://codegym.cc/tasks/en.codegym.python.core.level17.task09

### JavaRush
## Условие:
# Дан двумерный массив, представляющий лабиринт, где 0 – это проходимая клетка, а 1 – стена. Напишите функцию для нахождения пути от начальной точки до конечной с использованием DFS. Начальная и конечная точки заданы координатами.

### JavaRush
## Требования:
# • Программа должна включать функцию с именем find_path, которая принимает в качестве аргументов двумерный массив лабиринта, координаты начальной и конечной точек и возвращает путь в виде списка координат.
# • Функция find_path должна использовать алгоритм Depth-First Search (DFS) для поиска пути от начальной точки до конечной.
# • Функция find_path должна проверять, что текущая клетка находится в пределах массива и является проходимой (значение 0).
# • Функция find_path должна возвращать список координат, представляющих путь от начальной до конечной точки, или пустой список, если путь не найден.
# • Программа должна включать механизм для отслеживания посещённых клеток, чтобы избежать зацикливания и повторного посещения уже обработанных клеток.

### JavaRush
## Черновик:
# # Выход из лабиринта
#
# # Дан двумерный массив, представляющий лабиринт, где 0 – это проходимая клетка, а 1 – стена.
# # Напишите функцию для нахождения пути от начальной точки до конечной с использованием DFS.
# # Начальная и конечная точки заданы координатами.
#
# def find_path(maze, start, end):
#     # Напишите тут ваш код
#
#
#
# # Пример использования
# maze = [
#     [0, 1, 0, 0, 0],
#     [0, 1, 0, 1, 0],
#     [0, 0, 0, 1, 0],
#     [0, 1, 1, 1, 0],
#     [0, 0, 0, 0, 0]
# ]
# start = (0, 0)
# end = (4, 4)
# path = find_path(maze, start, end)
# print(path)

### JavaRush
# Выход из лабиринта

# Дан двумерный массив, представляющий лабиринт, где 0 – это проходимая клетка, а 1 – стена.
# Напишите функцию для нахождения пути от начальной точки до конечной с использованием DFS.
# Начальная и конечная точки заданы координатами.

def find_path(maze, start, end):
    # Напишите тут ваш код
    rows, cols = len(maze), len(maze[0])
    stack = [(start, [start])]
    visited = set()

    while stack:
        (x, y), path = stack.pop()
        if (x, y) == end:
            return path
        if (x, y) in visited:
            continue
        visited.add((x, y))

        for dx, dy in [(-1, 0), (1, 0), (0, -1), (0, 1)]:
            nx, ny = x + dx, y + dy
            if 0 <= nx < rows and 0 <= ny < cols and maze[nx][ny] == 0:
                stack.append(((nx, ny), path + [(nx, ny)]))

    return []


# Пример использования
maze = [
    [0, 1, 0, 0, 0],
    [0, 1, 0, 1, 0],
    [0, 0, 0, 1, 0],
    [0, 1, 1, 1, 0],
    [0, 0, 0, 0, 0]
]
start = (0, 0)
end = (4, 4)
path = find_path(maze, start, end)
print(path)

### JavaRush
## Правильное решение:
## Author: JavaRush's team
# def find_path(maze, start, end):
#     rows, cols = len(maze), len(maze[0])
#     stack = [(start, [start])]
#     visited = set()
#
#     while stack:
#         (x, y), path = stack.pop()
#         if (x, y) == end:
#             return path
#         if (x, y) in visited:
#             continue
#         visited.add((x, y))
#
#         for dx, dy in [(-1, 0), (1, 0), (0, -1), (0, 1)]:
#             nx, ny = x + dx, y + dy
#             if 0 <= nx < rows and 0 <= ny < cols and maze[nx][ny] == 0:
#                 stack.append(((nx, ny), path + [(nx, ny)]))
#
#     return []
#
# # Пример использования
# maze = [
#     [0, 1, 0, 0, 0],
#     [0, 1, 0, 1, 0],
#     [0, 0, 0, 1, 0],
#     [0, 1, 1, 1, 0],
#     [0, 0, 0, 0, 0]
# ]
# start = (0, 0)
# end = (4, 4)
# path = find_path(maze, start, end)
# print(path)