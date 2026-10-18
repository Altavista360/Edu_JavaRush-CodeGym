## Authors: JavaRush's team, CodeGym's team, Altavista360
## Version: 1.0.0

### JavaRush
## Задача: Связный граф
## Ссылка: https://javarush.com/tasks/ru.javarush.python.core.level17.task10

### CodeGym
## Task: Connected Graph
## Link: https://codegym.cc/tasks/en.codegym.python.core.level17.task10

### JavaRush
## Условие:
# Напишите функцию для проверки, является ли граф связным, с использованием DFS. Функция должна принимать граф в виде списков смежности и возвращать True, если граф связный, и False в противном случае.

### JavaRush
## Требования:
# • Программа должна включать функцию с именем, например, `is_connected`, которая принимает граф в виде списков смежности в качестве аргумента.
# • Функция должна использовать алгоритм поиска в глубину (DFS) для проверки связности графа.
# • Функция должна возвращать логическое значение: `True`, если граф связный, и `False`, если нет.
# • Функция должна обходить все вершины графа, используя DFS, чтобы проверить, что все вершины достижимы из начальной вершины.
# • Функция должна корректно обрабатывать случай, когда граф пуст (т.е. список смежности пуст), и возвращать `False` в этом случае.

### JavaRush
# ## Черновик:
# # Связный граф
#
# # Напишите функцию для проверки, является ли граф связным, с использованием DFS.
# # Функция должна принимать граф в виде списков смежности и возвращать True, если граф связный,
# # и False в противном случае.
#
#
# def dfs(graph, visited, node):
# # Напишите тут ваш код
#
#
# def is_connected(graph):
# # Напишите тут ваш код
#
#
# # Пример использования:
# graph = {
#     0: [1, 2],
#     1: [0, 3],
#     2: [0, 3],
#     3: [1, 2]
# }
# print(is_connected(graph))  # Output: True

### JavaRush
# Связный граф

# Напишите функцию для проверки, является ли граф связным, с использованием DFS.
# Функция должна принимать граф в виде списков смежности и возвращать True, если граф связный,
# и False в противном случае.


def dfs(graph, visited, node):
# Напишите тут ваш код
    visited.add(node)
    for neighbor in graph[node]:
        if neighbor not in visited:
            dfs(graph, visited, neighbor)

def is_connected(graph):
# Напишите тут ваш код
    if not graph:
        return False

    visited = set()
    start_node = list(graph.keys())[0]
    dfs(graph, visited, start_node)

    return len(visited) == len(graph)

# Пример использования:
graph = {
    0: [1, 2],
    1: [0, 3],
    2: [0, 3],
    3: [1, 2]
}
print(is_connected(graph))  # Output: True

### JavaRush
## Правильное решение:
## Author: JavaRush's team
# def dfs(graph, visited, node):
#     visited.add(node)
#     for neighbor in graph[node]:
#         if neighbor not in visited:
#             dfs(graph, visited, neighbor)
#
#
# def is_connected(graph):
#     if not graph:
#         return False
#
#     visited = set()
#     start_node = list(graph.keys())[0]
#     dfs(graph, visited, start_node)
#
#     # Check if all nodes were visited
#     return len(visited) == len(graph)
#
#
# # Пример использования:
# graph = {
#     0: [1, 2],
#     1: [0, 3],
#     2: [0, 3],
#     3: [1, 2]
# }
# print(is_connected(graph))  # Output: True