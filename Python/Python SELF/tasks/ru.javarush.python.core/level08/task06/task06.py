## Authors: JavaRush's team, CodeGym's team, Altavista360
## Version: 1.0.0

### JavaRush
## Задача: Замыкание.
## Ссылка: https://javarush.com/tasks/ru.javarush.python.core.level08.task06

### CodeGym
## Task: Closure.
## Link: https://codegym.cc/tasks/en.codegym.python.core.level08.task06

### JavaRush
## Условие:
# Напишите программу, которая создает функцию фильтра с использованием замыканий. Программа должна: Определить внешнюю функцию make_filter(threshold), которая создает и возвращает внутреннюю функцию filter_func(value). Внутренняя функция filter_func(value) должна возвращать True, если value больше threshold. Создать несколько функций фильтров с различными пороговыми значениями и использовать их для фильтрации списка данных, выводя результат на экран.

### JavaRush
## Требования:
# • Программа должна определить внешнюю функцию make_filter(threshold), которая создает и возвращает внутреннюю функцию filter_func(value).
# • Внутренняя функция filter_func(value) должна возвращать True, если value больше threshold.
# • Программа должна создать несколько функций фильтров с различными пороговыми значениями.
# • Программа должна использовать созданные функции фильтров для фильтрации списка данных.
# • Программа должна выводить результат фильтрации списка данных на экран.

### JavaRush
## Черновик:
# # Замыкание.
#
# # Напишите программу, которая создает функцию фильтра с использованием замыканий.
# # Программа должна:
# # Определить внешнюю функцию make_filter(threshold), которая создает и возвращает внутреннюю функцию filter_func(value).
# # Внутренняя функция filter_func(value) должна возвращать True, если value больше threshold.
# # Создать несколько функций фильтров с различными пороговыми значениями и
# # использовать их для фильтрации списка данных, выводя результат на экран.
#
# # Напишите тут ваш код

### JavaRush
# Замыкание.

# Напишите программу, которая создает функцию фильтра с использованием замыканий.
# Программа должна:
# Определить внешнюю функцию make_filter(threshold), которая создает и возвращает внутреннюю функцию filter_func(value).
# Внутренняя функция filter_func(value) должна возвращать True, если value больше threshold.
# Создать несколько функций фильтров с различными пороговыми значениями и
# использовать их для фильтрации списка данных, выводя результат на экран.

# Напишите тут ваш код

def make_filter(threshold):
    def filter_func(value):
        return value > threshold
    return filter_func

filter_10 = make_filter(10)
filter_20 = make_filter(15)
filter_30 = make_filter(30)
data = [0, 5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55, 60, 65, 70, 75, 80, 85, 90, 95, 100]
print(list(filter(filter_10, data)))
print(list(filter(filter_20, data)))
print(list(filter(filter_30, data)))

### JavaRush
## Правильное решение:
## Author: JavaRush's team
# def make_filter(threshold):
#     def filter_func(value):
#         return value > threshold
#     return filter_func
#
# # Создаем несколько фильтрующих функций с различными пороговыми значениями
# filter_10 = make_filter(10)
# filter_20 = make_filter(20)
# filter_30 = make_filter(30)
#
# # Список данных для фильтрации
# data = [5, 15, 25, 35, 45]
#
# # Фильтруем данные и выводим результаты
# print(list(filter(filter_10, data)))  # Должен вывести [15, 25, 35, 45]
# print(list(filter(filter_20, data)))  # Должен вывести [25, 35, 45]
# print(list(filter(filter_30, data)))  # Должен вывести [35, 45]