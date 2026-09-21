## Authors: JavaRush's team, CodeGym's team, Altavista360
## Version: 1.0.0

### JavaRush
## Задача: Создание и получение цикла событий
## Ссылка: https://javarush.com/tasks/ru.javarush.python.core.level14.task09

### CodeGym
## Task: Creating and obtaining an event loop
## Link: https://codegym.cc/tasks/en.codegym.python.core.level14.task09

### JavaRush
## Условие:
# Напишите программу, которая создает новый цикл событий, устанавливает его как текущий и печатает его. Затем создайте еще один новый цикл событий и снова установите его как текущий. Убедитесь, что вы правильно меняете циклы событий.

### JavaRush
## Требования:
# • Программа должна создавать новый цикл событий и присваивать его переменной.
# • Программа должна устанавливать первый созданный цикл событий в качестве текущего.
# • Программа должна выводить на печать текущий установленный цикл событий.
# • Программа должна создавать второй новый цикл событий и присваивать его другой переменной.
# • Программа должна устанавливать второй созданный цикл событий в качестве текущего, заменяя первый цикл.

### JavaRush
## Черновик:
# # Создание и получение цикла событий
#
# # Напишите программу, которая создает новый цикл событий, устанавливает его как текущий и печатает его.
# # Затем создайте еще один новый цикл событий и снова установите его как текущий.
# # Убедитесь, что вы правильно меняете циклы событий.
#
# # Напишите тут ваш код

### JavaRush
# Создание и получение цикла событий

# Напишите программу, которая создает новый цикл событий, устанавливает его как текущий и печатает его.
# Затем создайте еще один новый цикл событий и снова установите его как текущий.
# Убедитесь, что вы правильно меняете циклы событий.

# Напишите тут ваш код

import asyncio

first_event_loop = asyncio.new_event_loop()
asyncio.set_event_loop(first_event_loop)
print("Первое событие цикла:", first_event_loop)

second_event_loop = asyncio.new_event_loop()
asyncio.set_event_loop(second_event_loop)
print("Второе событие цикла:", second_event_loop)

### JavaRush
## Правильное решение:
## Author: JavaRush's team
# import asyncio
#
# # Создаем первый цикл событий
# first_event_loop = asyncio.new_event_loop()
# asyncio.set_event_loop(first_event_loop)
# print("First event loop:", first_event_loop)
#
# # Создаем второй цикл событий
# second_event_loop = asyncio.new_event_loop()
# asyncio.set_event_loop(second_event_loop)
# print("Second event loop:", second_event_loop)