## Authors: JavaRush's team, CodeGym's team, Altavista360
## Version: 1.0.0

### JavaRush
## Задача: Города и списки
## Ссылка: https://javarush.com/tasks/ru.javarush.python.core.level17.task14

### CodeGym
## Task: Cities and Lists
## Link: https://codegym.cc/tasks/en.codegym.python.core.level17.task14

### JavaRush
## Условие:
# У вас есть алгоритм Дейкстры реализованный для матрицы смежности. Переделайте его для графа заданного списком смежности.

### JavaRush
## Требования:
# • Входные данные в формате списка смежности
# • Модификация алгоритма Дейкстры для работы со списком смежности
# • Сохранение корректности вычисления кратчайших путей

### JavaRush
## Черновик:
# # Города и списки
#
# # У вас есть алгоритм Дейкстры реализованный для матрицы смежности.
# # Переделайте его для графе заданного списком смежности.
#
#
# import heapq
#
# def dijkstra(adj_list, start):
# # Напишите тут ваш код
#
#
# # Пример использования:
# adj_list = {
#     0: [(1, 4), (2, 1)],
#     1: [(3, 1)],
#     2: [(1, 2), (3, 5)],
#     3: []
# }
# start = 0
# print(dijkstra(adj_list, start))

### JavaRush
# Города и списки

# У вас есть алгоритм Дейкстры реализованный для матрицы смежности.
# Переделайте его для графе заданного списком смежности.


import heapq

def dijkstra(adj_list, start):
# Напишите тут ваш код
    n = len(adj_list)
    dist = {i: float('inf') for i in adj_list}
    dist[start] = 0
    priority_queue = [(0, start)]

    while priority_queue:
        current_dist, current_vertex = heapq.heappop(priority_queue)

        if current_dist > dist[current_vertex]:
            continue

        for neighbor, weight in adj_list[current_vertex]:
            distance = current_dist + weight

            if distance < dist[neighbor]:
                dist[neighbor] = distance
                heapq.heappush(priority_queue, (distance, neighbor))

    return dist

# Пример использования:
adj_list = {
    0: [(1, 4), (2, 1)],
    1: [(3, 1)],
    2: [(1, 2), (3, 5)],
    3: []
}
start = 0
print(dijkstra(adj_list, start))

### JavaRush
## Правильное решение:
## Author: JavaRush's team
# import heapq
#
# def dijkstra(adj_list, start):
#     # Инициализация
#     n = len(adj_list)
#     dist = {i: float('inf') for i in adj_list}
#     dist[start] = 0
#     priority_queue = [(0, start)]
#
#     # Основной цикл
#     while priority_queue:
#         current_dist, current_vertex = heapq.heappop(priority_queue)
#
#         # Если текущее расстояние больше записанного, продолжить
#         if current_dist > dist[current_vertex]:
#             continue
#
#         # Обновление расстояний до соседей
#         for neighbor, weight in adj_list[current_vertex]:
#             distance = current_dist + weight
#
#             # Если найден короткий путь, обновляем и помещаем в очередь
#             if distance < dist[neighbor]:
#                 dist[neighbor] = distance
#                 heapq.heappush(priority_queue, (distance, neighbor))
#
#     return dist
#
# # Пример использования:
# adj_list = {
#     0: [(1, 4), (2, 1)],
#     1: [(3, 1)],
#     2: [(1, 2), (3, 5)],
#     3: []
# }
# start = 0
# print(dijkstra(adj_list, start))