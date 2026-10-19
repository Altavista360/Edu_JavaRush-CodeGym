## Authors: JavaRush's team, CodeGym's team, Altavista360
## Version: 1.0.0

### JavaRush
## Задача: Путь между городами
## Ссылка: https://javarush.com/tasks/ru.javarush.python.core.level17.task13

### CodeGym
## Task: Path between cities
## Link: https://codegym.cc/tasks/en.codegym.python.core.level17.task13

### JavaRush
## Условие:
# Напишите функцию для нахождения кратчайшего пути между двумя городами в транспортной сети с использованием алгоритма Дейкстры. Функция должна возвращать кратчайший путь и его стоимость.

### JavaRush
## Требования:
# • Функция должна находить кратчайший путь между двумя городами в транспортной сети с использованием алгоритма Дейкстры.
# • Функция должна возвращать сам кратчайший путь между двумя городами, представленный в виде списка городов.
# • Функция должна возвращать стоимость кратчайшего пути между двумя городами в виде числового значения.
# • Функция должна принимать параметры: начальный город, конечный город и саму транспортную сеть, представленную в виде графа.

### JavaRush
## Черновик:
# # Путь между городами
#
# # Напишите функцию для нахождения кратчайшего пути между двумя городами в транспортной сети
# # с использованием алгоритма Дейкстры.
# # Функция должна возвращать кратчайший путь и его стоимость.
#
# import heapq
#
# def dijkstra(graph, start, end):
#     # Напишите тут ваш код
#
#
# # Пример графа: словарь, где ключ - город, а значение - словарь соседей и расстояний до них
# graph = {
#     'A': {'B': 1, 'C': 4},
#     'B': {'A': 1, 'C': 2, 'D': 5},
#     'C': {'A': 4, 'B': 2, 'D': 1},
#     'D': {'B': 5, 'C': 1}
# }
#
# # Пример использования функции
# start_city = 'A'
# end_city = 'D'
# distance, path = dijkstra(graph, start_city, end_city)
# print(f"Кратчайший путь от {start_city} до {end_city} стоит {distance} и проходит через {path}.")

### JavaRush
# Путь между городами

# Напишите функцию для нахождения кратчайшего пути между двумя городами в транспортной сети
# с использованием алгоритма Дейкстры.
# Функция должна возвращать кратчайший путь и его стоимость.

import heapq

def dijkstra(graph, start, end):
    shortest_paths = {node: (float('inf'), []) for node in graph}
    shortest_paths[start] = (0, [start])

    priority_queue = [(0, start)]

    while priority_queue:
        current_distance, current_node = heapq.heappop(priority_queue)

        if current_distance > shortest_paths[current_node][0]:
            continue

        for neighbor, weight in graph[current_node].items():
            distance = current_distance + weight
            if distance < shortest_paths[neighbor][0]:
                shortest_paths[neighbor] = (distance, shortest_paths[current_node][1] + [neighbor])
                heapq.heappush(priority_queue, (distance, neighbor))

    return shortest_paths[end]

# Пример графа: словарь, где ключ - город, а значение - словарь соседей и расстояний до них
graph = {
    'A': {'B': 1, 'C': 4},
    'B': {'A': 1, 'C': 2, 'D': 5},
    'C': {'A': 4, 'B': 2, 'D': 1},
    'D': {'B': 5, 'C': 1}
}

# Пример использования функции
start_city = 'A'
end_city = 'D'
distance, path = dijkstra(graph, start_city, end_city)
print(f"Кратчайший путь от {start_city} до {end_city} стоит {distance} и проходит через {path}.")

### JavaRush
## Правильное решение:
## Author: JavaRush's team
# import heapq
#
# def dijkstra(graph, start, end):
#     # Создаем словарь для хранения минимальных затрат на достижение каждого узла
#     shortest_paths = {node: (float('inf'), []) for node in graph}
#     shortest_paths[start] = (0, [start])
#
#     # Создаем очередь с приоритетом для посещения узлов
#     priority_queue = [(0, start)]
#
#     while priority_queue:
#         current_distance, current_node = heapq.heappop(priority_queue)
#
#         # Пропускаем узлы, которые уже были обработаны
#         if current_distance > shortest_paths[current_node][0]:
#             continue
#
#         for neighbor, weight in graph[current_node].items():
#             distance = current_distance + weight
#             if distance < shortest_paths[neighbor][0]:
#                 shortest_paths[neighbor] = (distance, shortest_paths[current_node][1] + [neighbor])
#                 heapq.heappush(priority_queue, (distance, neighbor))
#
#     return shortest_paths[end]
#
# # Пример графа: словарь, где ключ - город, а значение - словарь соседей и расстояний до них
# graph = {
#     'A': {'B': 1, 'C': 4},
#     'B': {'A': 1, 'C': 2, 'D': 5},
#     'C': {'A': 4, 'B': 2, 'D': 1},
#     'D': {'B': 5, 'C': 1}
# }
#
# # Пример использования функции
# start_city = 'A'
# end_city = 'D'
# distance, path = dijkstra(graph, start_city, end_city)
# print(f"Кратчайший путь от {start_city} до {end_city} стоит {distance} и проходит через {path}.")