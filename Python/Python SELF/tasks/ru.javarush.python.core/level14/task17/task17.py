## Authors: JavaRush's team, CodeGym's team, Altavista360
## Version: 1.0.0

### JavaRush
## Задача: Асинхронный итератор
## Ссылка: https://javarush.com/tasks/ru.javarush.python.core.level14.task17

### CodeGym
## Task: Asynchronous Iterator
## Link: https://codegym.cc/tasks/en.codegym.python.core.level14.task17

### JavaRush
## Условие:
# Напишите асинхронный итератор, который будет возвращать числа от 1 до 5 с задержкой в 1 секунду между числами. Используйте этот итератор в асинхронной функции, чтобы вывести числа на экран.

### JavaRush
## Требования:
# • Класс должен реализовывать методы `__aiter__()` и `__anext__()`, где `__anext__()` реализует задержку в 1 секунду между возвращаемыми числами от 1 до 5.
# • Создайте асинхронную функцию, которая использует созданный асинхронный итератор для вывода чисел от 1 до 5 на экран.
# • Метод `__anext__()` класса асинхронного итератора должен использовать `await asyncio.sleep(1)` для создания задержки в 1 секунду перед возвращением следующего числа.

### JavaRush
## Черновик:
# # Асинхронный итератор
#
# # Напишите асинхронный итератор, который будет возвращать числа от 1 до 5 с задержкой в 1 секунду между числами.
# # Используйте этот итератор в асинхронной функции, чтобы вывести числа на экран.
#
# # Напишите тут ваш код

### JavaRush
# Асинхронный итератор

# Напишите асинхронный итератор, который будет возвращать числа от 1 до 5 с задержкой в 1 секунду между числами.
# Используйте этот итератор в асинхронной функции, чтобы вывести числа на экран.

# Напишите тут ваш код

import asyncio

class AsyncIterator:
    def __init__(self):
        self.current = 1

    def __aiter__(self):
        return self

    async def __anext__(self):
        if self.current > 5:
            raise StopAsyncIteration
        await asyncio.sleep(1)
        value = self.current
        self.current += 1
        return value

async def main():
    async for number in AsyncIterator():
        print(number)

asyncio.run(main())

### JavaRush
## Правильное решение:
## Author: JavaRush's team
# import asyncio
#
# class AsyncIterator:
#     def __init__(self):
#         self.current = 1
#
#     def __aiter__(self):
#         return self
#
#     async def __anext__(self):
#         if self.current > 5:
#             raise StopAsyncIteration
#         await asyncio.sleep(1)
#         value = self.current
#         self.current += 1
#         return value
#
# async def main():
#     async for number in AsyncIterator():
#         print(number)
#
# asyncio.run(main())