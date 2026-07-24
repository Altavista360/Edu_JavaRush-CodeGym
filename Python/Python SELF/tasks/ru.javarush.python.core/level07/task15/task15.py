## Authors: JavaRush's team, CodeGym's team, Altavista360
## Version: 1.0.0

### JavaRush
## Задача: Заморозка
## Ссылка: https://javarush.com/tasks/ru.javarush.python.core.level07.task15

### CodeGym
## Task: Freezing
## Link: https://codegym.cc/tasks/en.codegym.python.core.level07.task15

### JavaRush
## Условие:
# Напишите программу, которая создает несколько объектов типа frozenset из различных итерируемых объектов (список, строка). Программа должна: Создать frozenset из списка. Создать frozenset из строки. Выполнить объединение, пересечение, разность и симметрическую разность двух frozenset множеств. Вывести результаты каждой операции.

### JavaRush
## Требования:
# • Программа должна создать переменную, которой присваивается frozenset, созданный из указанного списка.
# • Программа должна создать переменную, которой присваивается frozenset, созданный из указанной строки.
# • Программа должна выполнить операцию объединения двух frozenset множеств и вывести результат.
# • Программа должна выполнить операцию пересечения двух frozenset множеств и вывести результат.
# • Программа должна выполнить операцию разности двух frozenset множеств и вывести результат.
# • Программа должна выполнить операцию симметрической разности двух frozenset множеств и вывести результат.

### JavaRush
## Черновик:
# # Заморозка
#
# # Напишите программу, которая создает несколько объектов типа frozenset из различных итерируемых объектов (список, строка).
# # Программа должна:
# # Создать frozenset из списка.
# # Создать frozenset из строки.
# # Выполнить объединение, пересечение, разность и симметрическую разность двух frozenset множеств.
# # Вывести результаты каждой операции.
#
# # Напишите тут ваш код

### JavaRush
# Заморозка

# Напишите программу, которая создает несколько объектов типа frozenset из различных итерируемых объектов (список, строка).
# Программа должна:
# Создать frozenset из списка.
# Создать frozenset из строки.
# Выполнить объединение, пересечение, разность и симметрическую разность двух frozenset множеств.
# Вывести результаты каждой операции.

# Напишите тут ваш код

list_frozen = frozenset([0, 1, 2, 3, 4, 5, 6, 7, 8, 9])
string_frozen = frozenset("abcdefghijklmnopqrstuvwxyz")
union_result = list_frozen | string_frozen
intersection_result = list_frozen & string_frozen
difference_result = list_frozen - string_frozen
symmetric_difference_result = list_frozen ^ string_frozen
print(f"Объединение: {union_result}")
print(f"Пересечение: {intersection_result}")
print(f"Разность: {difference_result}")
print(f"Симметрическая разность: {symmetric_difference_result}")

### JavaRush
## Правильное решение:
## Author: JavaRush's team
# # Создаем frozenset из списка
# list_frozen = frozenset([1, 2, 3, 4, 5])
#
# # Создаем frozenset из строки
# string_frozen = frozenset("abcde")
#
# # Объединение
# union_result = list_frozen | string_frozen
#
# # Пересечение
# intersection_result = list_frozen & string_frozen
#
# # Разность
# difference_result = list_frozen - string_frozen
#
# # Симметрическая разность
# symmetric_difference_result = list_frozen ^ string_frozen
#
# # Вывод результатов
# print(f"Объединение: {union_result}")
# print(f"Пересечение: {intersection_result}")
# print(f"Разность: {difference_result}")
# print(f"Симметрическая разность: {symmetric_difference_result}")