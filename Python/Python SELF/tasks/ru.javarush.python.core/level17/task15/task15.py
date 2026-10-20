## Authors: JavaRush's team, CodeGym's team, Altavista360
## Version: 1.0.0

### JavaRush
## Задача: Топологическя сортировка
## Ссылка: https://javarush.com/tasks/ru.javarush.python.core.level17.task15

### CodeGym
## Task: Topological Sorting
## Link: https://codegym.cc/tasks/en.codegym.python.core.level17.task15

### JavaRush
## Условие:
# У вас есть список задач и их зависимости. Напишите функцию для определения порядка выполнения задач с использованием топологической сортировки через поиск в глубину (DFS). Функция должна возвращать список задач в правильном порядке.

### JavaRush
## Требования:
# • Функция должна быть определена с именем `topological_sort`, которая будет принимать на вход список задач и их зависимости.
# • Функция должна принимать на вход список задач и их зависимостей, где каждая зависимость представляется в виде пары (a, b), означающей, что задача a должна быть выполнена перед задачей b.
# • Функция должна использовать алгоритм поиска в глубину (DFS) для выполнения топологической сортировки.
# • Функция должна возвращать список задач в порядке их выполнения, который удовлетворяет всем зависимостям.

### JavaRush
## Черновик:
# # Топологическя сортировка
# # У вас есть список задач и их зависимости. Напишите функцию для определения порядка выполнения задач
# # с использованием топологической сортировки через поиск в глубину (DFS).
# # Функция должна возвращать список задач в правильном порядке.
#
# # Helper function for DFS
# from collections import defaultdict, deque
#
# # Create adjacency list
# graph = defaultdict(list)
#
# # Visited nodes tracker
# visited = set()
# temp_marks = set()
# stack = list()
#
#
# def dfs(node):
#     if node in temp_marks:
#         raise ValueError("Graph is not a Directed Acyclic Graph (DAG)")
#
#     if node not in visited:
#         temp_marks.add(node)
#         for neighbor in graph[node]:
#             dfs(neighbor)
#         temp_marks.remove(node)
#         visited.add(node)
#         stack.append(node)
#
# def topological_sort(tasks):
# # Напишите тут ваш код
#
# Example usage:
# tasks = [('a', 'b'), ('b', 'c'), ('c', 'd')]
# print(topological_sort(tasks))  # Output: ['d', 'c', 'b', 'a']

### JavaRush
# Топологическя сортировка
# У вас есть список задач и их зависимости. Напишите функцию для определения порядка выполнения задач
# с использованием топологической сортировки через поиск в глубину (DFS).
# Функция должна возвращать список задач в правильном порядке.

# Helper function for DFS
from collections import defaultdict, deque

# Create adjacency list
graph = defaultdict(list)

# Visited nodes tracker
visited = set()
temp_marks = set()
stack = list()


def dfs(node):
    if node in temp_marks:
        raise ValueError("Graph is not a Directed Acyclic Graph (DAG)")

    if node not in visited:
        temp_marks.add(node)
        for neighbor in graph[node]:
            dfs(neighbor)
        temp_marks.remove(node)
        visited.add(node)
        stack.append(node)

def topological_sort(tasks):
# Напишите тут ваш код
    for dest, src in tasks:
        graph[src].append(dest)

    all_nodes = {node for edge in tasks for node in edge}
    for node in all_nodes:
        if node not in visited:
            dfs(node)

    return stack[::-1]

# Example usage:
tasks = [('a', 'b'), ('b', 'c'), ('c', 'd')]
print(topological_sort(tasks))  # Output: ['d', 'c', 'b', 'a']

### JavaRush
## Правильное решение:
## Author: JavaRush's team
# # Helper function for DFS
# from collections import defaultdict, deque
#
# # Create adjacency list
# graph = defaultdict(list)
#
# # Visited nodes tracker
# visited = set()
# temp_marks = set()
# stack = list()
#
#
# def dfs(node):
#     if node in temp_marks:
#         raise ValueError("Graph is not a Directed Acyclic Graph (DAG)")
#
#     if node not in visited:
#         temp_marks.add(node)
#         for neighbor in graph[node]:
#             dfs(neighbor)
#         temp_marks.remove(node)
#         visited.add(node)
#         stack.append(node)
#
# def topological_sort(tasks):
#     for dest, src in tasks:
#         graph[src].append(dest)
#
#     # Perform DFS on each node
#     all_nodes = {node for edge in tasks for node in edge}
#     for node in all_nodes:
#         if node not in visited:
#             dfs(node)
#
#     return stack[::-1]
#
# # Example usage:
# tasks = [('a', 'b'), ('b', 'c'), ('c', 'd')]
# print(topological_sort(tasks))  # Output: ['d', 'c', 'b', 'a']