## Authors: JavaRush's team, CodeGym's team, Altavista360
## Version: 1.0.0

### JavaRush
## Задача: Словарь из списка кортежей.
## Ссылка: https://javarush.com/tasks/ru.javarush.python.core.level07.task12

### CodeGym
## Task: Dictionary from a list of tuples.
## Link: https://codegym.cc/tasks/en.codegym.python.core.level07.task12

### JavaRush
## Условие:
# Напишите программу, которая создает список кортежей с информацией о сотрудниках (например, имя и должность). Программа должна: Использовать dictionary comprehension для создания словаря из списка кортежей. Вывести созданный словарь.

### JavaRush
## Требования:
# • Программа должна включать список кортежей, где каждый кортеж содержит информацию о сотруднике, такую как имя и должность.
# • Программа должна использовать dictionary comprehension для создания словаря из списка кортежей.
# • Программа должна вывести созданный словарь.

### JavaRush
## Черновик:
# # Словарь из списка кортежей.
#
# # Напишите программу, которая создает список кортежей с информацией о сотрудниках (например, имя и должность).
# # Программа должна:
# # Использовать dictionary comprehension для создания словаря из списка кортежей.
# # Вывести созданный словарь.
#
# # Напишите тут ваш код

### JavaRush
# Словарь из списка кортежей.

# Напишите программу, которая создает список кортежей с информацией о сотрудниках (например, имя и должность).
# Программа должна:
# Использовать dictionary comprehension для создания словаря из списка кортежей.
# Вывести созданный словарь.

# Напишите тут ваш код

foo = [("Ivy", "Software Developer"), ("Lily", "Doctor"), ("Florence", "Data Scientist")]
bar = {name: position for name, position in foo}
print(bar)

### JavaRush
## Правильное решение:
## Author: JavaRush's team
# # Список кортежей с информацией о сотрудниках
# employees = [("Иван", "Инженер"), ("Мария", "Менеджер"), ("Петр", "Аналитик")]
#
# # Создание словаря с использованием dictionary comprehension
# employee_dict = {name: position for name, position in employees}
#
# # Вывод созданного словаря
# print(employee_dict)