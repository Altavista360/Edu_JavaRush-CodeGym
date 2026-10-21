## Authors: JavaRush's team, CodeGym's team, Altavista360
## Version: 1.0.0

### JavaRush
## Задача: Сортировка мусора
## Ссылка: https://javarush.com/tasks/ru.javarush.python.core.level17.task16

### CodeGym
## Task: Garbage Sorting
## Link: https://codegym.cc/tasks/en.codegym.python.core.level17.task16

### JavaRush
## Условие:
# Напишите функцию для упорядочения пакетов так, чтобы все зависимости были установлены перед установкой самого пакета. Используйте алгоритм топологической сортировки через поиск в глубину (DFS). Функция должна возвращать список пакетов в правильном порядке установки.

### JavaRush
## Требования:
# • Программа должна включать функцию topological_sort, которая принимает на вход граф зависимостей пакетов.
# • Функция должна использовать алгоритм поиска в глубину (DFS) для обхода графа зависимостей.
# • Функция должна выполнять топологическую сортировку графа зависимостей, чтобы определить правильный порядок установки пакетов.
# • Функция должна возвращать список пакетов в порядке их правильной установки.

### JavaRush
## Черновик:
# # Сортировка мусора
#
# # Напишите функцию для упорядочения пакетов так, чтобы все зависимости были установлены перед установкой самого пакета.
# # Используйте алгоритм топологической сортировки через поиск в глубину (DFS).
# # Функция должна возвращать список пакетов в правильном порядке установки.
#
#
# dependency_graph = dict()
# visited = set()
# temp_marked = set()
# result = list()
#
# def dfs(package):
#     if package in temp_marked:
#         raise ValueError("Cycle detected!")
#     if package not in visited:
#         temp_marked.add(package)
#         for dep in dependency_graph.get(package, []):
#             dfs(dep)
#         temp_marked.remove(package)
#         visited.add(package)
#         result.append(package)
#
# def topological_sort(packages):
# # Напишите тут ваш код
#
# # Example usage:
# packages = [
#     ('a', ['b', 'c']),
#     ('b', ['c', 'd']),
#     ('c', ['d']),
#     ('d', [])
# ]
#
# print(topological_sort(packages))
# # Output: ['d', 'c', 'b', 'a']

### JavaRush
# Сортировка мусора

# Напишите функцию для упорядочения пакетов так, чтобы все зависимости были установлены перед установкой самого пакета.
# Используйте алгоритм топологической сортировки через поиск в глубину (DFS).
# Функция должна возвращать список пакетов в правильном порядке установки.


dependency_graph = dict()
visited = set()
temp_marked = set()
result = list()

def dfs(package):
    if package in temp_marked:
        raise ValueError("Cycle detected!")
    if package not in visited:
        temp_marked.add(package)
        for dep in dependency_graph.get(package, []):
            dfs(dep)
        temp_marked.remove(package)
        visited.add(package)
        result.append(package)

def topological_sort(packages):
# Напишите тут ваш код

    dependency_graph.update({ pkg: deps for pkg, deps in packages} )

    for package in dependency_graph:
        if package not in visited:
            dfs(package)

    return result

# Example usage:
packages = [
    ('a', ['b', 'c']),
    ('b', ['c', 'd']),
    ('c', ['d']),
    ('d', [])
]

print(topological_sort(packages))
# Output: ['d', 'c', 'b', 'a']

### JavaRush
## Правильное решение:
## Author: JavaRush's team
# dependency_graph = dict()
# visited = set()
# temp_marked = set()
# result = list()
#
# def dfs(package):
#     if package in temp_marked:
#         raise ValueError("Cycle detected!")
#     if package not in visited:
#         temp_marked.add(package)
#         for dep in dependency_graph.get(package, []):
#             dfs(dep)
#         temp_marked.remove(package)
#         visited.add(package)
#         result.append(package)
#
# def topological_sort(packages):
#
#
#     dependency_graph.update({ pkg: deps for pkg, deps in packages} )
#
#     for package in dependency_graph:
#         if package not in visited:
#             dfs(package)
#
#     return result
#
# # Example usage:
# packages = [
#     ('a', ['b', 'c']),
#     ('b', ['c', 'd']),
#     ('c', ['d']),
#     ('d', [])
# ]
#
# print(topological_sort(packages))
# # Output: ['d', 'c', 'b', 'a']