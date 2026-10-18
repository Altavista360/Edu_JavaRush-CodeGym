## Authors: JavaRush's team, CodeGym's team, Altavista360
## Version: 1.0.0

### JavaRush
## Задача: Связный гаф: BFS-версия
## Ссылка: https://javarush.com/tasks/ru.javarush.python.core.level17.task11

### CodeGym
## Task: Connected Graph: BFS Version
## Link: https://codegym.cc/tasks/en.codegym.python.core.level17.task11

### JavaRush
## Условие:
# Напишите функцию для проверки, является ли граф связным с использованием BFS. Функция должна принимать граф в виде списков смежности и возвращать True, если граф связный, и False в противном случае.

### JavaRush
## Требования:
# • Программа должна включать функцию, которая принимает граф в виде списков смежности.
# • Функция должна использовать алгоритм BFS для обхода графа.
# • Функция должна проверять, можно ли посетить все вершины графа, начиная с произвольной вершины.
# • Функция должна возвращать `True`, если граф связный, и `False`, если граф несвязный.

### JavaRush
# ## Черновик:
# # Связный гаф: BFS-версия
#
# # Напишите функцию для проверки, является ли граф связным с использованием BFS.
# # Функция должна принимать граф в виде списков смежности и возвращать True, если граф связный,
# # и False в противном случае.
#
# from collections import deque
#
# def is_connected(graph):
# # Напишите тут ваш код
#
# # Пример использования:
# graph = {
#     0: [1, 2],
#     1: [0, 3],
#     2: [0],
#     3: [1]
# }
# print(is_connected(graph))  # True

### JavaRush
# Связный гаф: BFS-версия

# Напишите функцию для проверки, является ли граф связным с использованием BFS.
# Функция должна принимать граф в виде списков смежности и возвращать True, если граф связный,
# и False в противном случае.

from collections import deque

def is_connected(graph):
# Напишите тут ваш код
    if not graph:
        return True

    visited = set()
    queue = deque([list(graph.keys())[0]])

    while queue:
        node = queue.popleft()
        if node not in visited:
            visited.add(node)
            for neighbor in graph[node]:
                if neighbor not in visited:
                    queue.append(neighbor)

    return len(visited) == len(graph)

# Пример использования:
graph = {
    0: [1, 2],
    1: [0, 3],
    2: [0],
    3: [1]
}
print(is_connected(graph))  # True

### JavaRush
## Правильное решение:
## Author: JavaRush's team
# from collections import deque
#
# def is_connected(graph):
#     if not graph:
#         return True  # Пустой граф считается связным
#
#     visited = set()
#     queue = deque([list(graph.keys())[0]])  # Начнем с любого узла, например, первого
#
#     while queue:
#         node = queue.popleft()
#         if node not in visited:
#             visited.add(node)
#             for neighbor in graph[node]:
#                 if neighbor not in visited:
#                     queue.append(neighbor)
#
#     return len(visited) == len(graph)
#
# # Пример использования:
# graph = {
#     0: [1, 2],
#     1: [0, 3],
#     2: [0],
#     3: [1]
# }
# print(is_connected(graph))  # True