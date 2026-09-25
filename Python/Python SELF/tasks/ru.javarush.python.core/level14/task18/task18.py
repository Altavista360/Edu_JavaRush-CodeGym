## Authors: JavaRush's team, CodeGym's team, Altavista360
## Version: 1.0.0

### JavaRush
## Задача: Асинхронный генератор
## Ссылка: https://javarush.com/tasks/ru.javarush.python.core.level14.task18

### CodeGym
## Task: Asynchronous Generator
## Link: https://codegym.cc/tasks/en.codegym.python.core.level14.task18

### JavaRush
## Условие:
# Напишите асинхронный генератор, который будет генерировать числа от 0 до 2 с задержкой в 1 секунду между числами. Используйте этот генератор в асинхронной функции, чтобы вывести значения на экран.

### JavaRush
## Требования:
# • Асинхронный генератор должен генерировать числа от 0 до 2 с задержкой 1 секунда между генерацией каждого числа.
# • Для реализации задержки в 1 секунду между числами, в асинхронном генераторе должна использоваться функция `await asyncio.sleep(1)`.
# • Необходимо создать асинхронную функцию, которая будет использовать созданный асинхронный генератор для получения значений.
# • Асинхронная функция должна выводить значения, сгенерированные асинхронным генератором, на экран с помощью функции `print()`.

### JavaRush
## Черновик:
# # Асинхронный генератор
#
# # Напишите асинхронный генератор, который будет генерировать числа от 0 до 2 с задержкой в 1 секунду между числами.
# # Используйте этот генератор в асинхронной функции, чтобы вывести значения на экран.
#
# # Напишите тут ваш код

### JavaRush
# Асинхронный генератор

# Напишите асинхронный генератор, который будет генерировать числа от 0 до 2 с задержкой в 1 секунду между числами.
# Используйте этот генератор в асинхронной функции, чтобы вывести значения на экран.

# Напишите тут ваш код

import asyncio

async def async_generator():
    for i in range(3):
        await asyncio.sleep(1)
        yield i

async def main():
    async for value in async_generator():
        print(value)

asyncio.run(main())

### JavaRush
## Правильное решение:
## Author: JavaRush's team
# import asyncio
#
# async def async_generator():
#     for i in range(3):
#         await asyncio.sleep(1)
#         yield i
#
# async def main():
#     async for value in async_generator():
#         print(value)
#
# asyncio.run(main())