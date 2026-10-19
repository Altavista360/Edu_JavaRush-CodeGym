## Authors: JavaRush's team, CodeGym's team, Altavista360
## Version: 1.0.0

### JavaRush
## Задача: Кратчайший путь: BFS-версия
## Ссылка: https://javarush.com/tasks/ru.javarush.python.core.level17.task12

### CodeGym
## Task: Shortest Path: BFS Version
## Link: https://codegym.cc/tasks/en.codegym.python.core.level17.task12

### JavaRush
## Условие:
# Напишите функцию для поиска кратчайшего пути от начальной вершины до целевой в неориентированном графе с использованием BFS. Функция должна возвращать список вершин, составляющих кратчайший путь.

### JavaRush
## Требования:
# • Функция должна называться find_shortest_path и принимать три параметра: граф в виде словаря смежности, начальную вершину и целевую вершину.
# • Функция должна использовать алгоритм Breadth-First Search (BFS) для поиска кратчайшего пути от начальной вершины до целевой.
# • Функция должна возвращать список вершин, представляющих кратчайший путь от начальной вершины до целевой.
# • Функция должна корректно обрабатывать случай, когда пути от начальной вершины до целевой не существует, возвращая пустой список или соответствующее уведомление.
# • Для реализации алгоритма BFS функция должна использовать очередь для хранения вершин, которые нужно посетить.

### JavaRush
## Черновик:
# # Кратчайший путь: BFS-версия
#
# # Напишите функцию для поиска кратчайшего пути от начальной вершины до целевой
# # в неориентированном графе с использованием BFS.
# # Функция должна возвращать список вершин, составляющих кратчайший путь.
#
# from collections import deque
#
# def find_shortest_path(graph, start, goal):
# # Напишите тут ваш код
#
#
# # Пример использования:
# graph = {
#     'A': ['B', 'C'],
#     'B': ['A', 'D', 'E'],
#     'C': ['A', 'F'],
#     'D': ['B'],
#     'E': ['B', 'F'],
#     'F': ['C', 'E']
# }
#
# start = 'A'
# goal = 'F'
# print(find_shortest_path(graph, start, goal))

### JavaRush
# Кратчайший путь: BFS-версия

# Напишите функцию для поиска кратчайшего пути от начальной вершины до целевой
# в неориентированном графе с использованием BFS.
# Функция должна возвращать список вершин, составляющих кратчайший путь.

from collections import deque

def find_shortest_path(graph, start, goal):
# Напишите тут ваш код
    visited = set()
    queue = deque([(start, [start])])

    while queue:
        current, path = queue.popleft()
        if current == goal:
            return path

        visited.add(current)

        for neighbor in graph[current]:
            if neighbor not in visited:
                queue.append((neighbor, path + [neighbor]))
                visited.add(neighbor)

    return []

# Пример использования:
graph = {
    'A': ['B', 'C'],
    'B': ['A', 'D', 'E'],
    'C': ['A', 'F'],
    'D': ['B'],
    'E': ['B', 'F'],
    'F': ['C', 'E']
}

start = 'A'
goal = 'F'
print(find_shortest_path(graph, start, goal))

### JavaRush
## Правильное решение:
## Author: JavaRush's team
# from collections import deque
#
# def find_shortest_path(graph, start, goal):
#     visited = set()
#     queue = deque([(start, [start])])
#
#     while queue:
#         current, path = queue.popleft()
#         if current == goal:
#             return path
#
#         visited.add(current)
#
#         for neighbor in graph[current]:
#             if neighbor not in visited:
#                 queue.append((neighbor, path + [neighbor]))
#                 visited.add(neighbor)
#
#     return []
#
# # Пример использования:
# graph = {
#     'A': ['B', 'C'],
#     'B': ['A', 'D', 'E'],
#     'C': ['A', 'F'],
#     'D': ['B'],
#     'E': ['B', 'F'],
#     'F': ['C', 'E']
# }
#
# start = 'A'
# goal = 'F'
# print(find_shortest_path(graph, start, goal))