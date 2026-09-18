## Authors: JavaRush's team, CodeGym's team, Altavista360
## Version: 1.0.0

### JavaRush
## Задача: Выполнение нескольких задач параллельно
## Ссылка: https://javarush.com/tasks/ru.javarush.python.core.level14.task04

### CodeGym
## Task: Executing several tasks in parallel
## Link: https://codegym.cc/tasks/en.codegym.python.core.level14.task04

### JavaRush
## Условие:
# Напишите программу, которая использует asyncio.gather() для выполнения нескольких асинхронных задач параллельно и собирает их результаты.

### JavaRush
## Требования:
# • Программа должна импортировать модуль asyncio, чтобы использовать его функции и классы для создания и исполнения асинхронных задач.
# • Программа должна содержать по крайней мере две асинхронные функции (task1 и task2), которые выполняют какие-либо действия (например, имитация задержки с помощью asyncio.sleep()).
# • Программа должна использовать функцию asyncio.gather() для запуска нескольких асинхронных задач параллельно.
# • Программа должна собирать результаты выполнения всех асинхронных задач, переданных в asyncio.gather().
# • Программа должна запускать событийный цикл с помощью asyncio.run(), чтобы выполнить асинхронные задачи и получить их результаты.

### JavaRush
## Черновик:
# # Выполнение нескольких задач параллельно
#
# # Напишите программу, которая использует asyncio.gather() для выполнения нескольких асинхронных задач параллельно
# # и собирает их результаты.
#
# # Напишите тут ваш код

### JavaRush
# Выполнение нескольких задач параллельно

# Напишите программу, которая использует asyncio.gather() для выполнения нескольких асинхронных задач параллельно
# и собирает их результаты.

# Напишите тут ваш код

import asyncio

async def task1():
    await asyncio.sleep(1)
    return "Результат функции task1"

async def task2():
    await asyncio.sleep(2)
    return "Результат функции task2"

async def main():
    results = await asyncio.gather(task1(), task2())
    print(results)

asyncio.run(main())

### JavaRush
## Правильное решение:
## Author: JavaRush's team
# import asyncio
#
# async def task1():
#     await asyncio.sleep(1)
#     return "Result of task1"
#
# async def task2():
#     await asyncio.sleep(2)
#     return "Result of task2"
#
# async def main():
#     results = await asyncio.gather(task1(), task2())
#     print(results)
#
# asyncio.run(main())