## Authors: JavaRush's team, CodeGym's team, Altavista360
## Version: 1.0.0

### JavaRush
## Задача: Асинхронный контекстный менеджер
## Ссылка: https://javarush.com/tasks/ru.javarush.python.core.level14.task15

### CodeGym
## Task: Asynchronous Context Manager
## Link: https://codegym.cc/tasks/en.codegym.python.core.level14.task15

### JavaRush
## Условие:
# Напишите асинхронный контекстный менеджер, который будет печатать сообщения при входе и выходе из контекста. Внутри контекста выполните асинхронную задержку на 2 секунды и выведите сообщение "Внутри контекста".

### JavaRush
## Требования:
# • Программа должна включать класс, реализующий асинхронные методы __aenter__ и __aexit__ для управления контекстом.
# • Асинхронный метод __aenter__ должен печатать сообщение при входе в контекст.
# • Внутри контекста должна выполняться асинхронная задержка на 2 секунды.
# • После асинхронной задержки должно быть выведено сообщение "Внутри контекста".
# • Асинхронный метод __aexit__ должен печатать сообщение при выходе из контекста.

### JavaRush
## Черновик:
# # Асинхронный контекстный менеджер
#
# # Напишите асинхронный контекстный менеджер, который будет печатать сообщения при входе и выходе из контекста.
# # Внутри контекста выполните асинхронную задержку на 2 секунды и выведите сообщение "Внутри контекста".
#
# # Напишите тут ваш код

### JavaRush
# Асинхронный контекстный менеджер

# Напишите асинхронный контекстный менеджер, который будет печатать сообщения при входе и выходе из контекста.
# Внутри контекста выполните асинхронную задержку на 2 секунды и выведите сообщение "Внутри контекста".

# Напишите тут ваш код

import asyncio

class AsyncContextManager:
    async def __aenter__(self):
        print("Входим в контекст")
        return self

    async def __aexit__(self, exc_type, exc_value, traceback):
        print("Выходим из контекста")

    async def do_work(self):
        await asyncio.sleep(2)
        print("Внутри контекста")

async def main():
    async with AsyncContextManager() as manager:
        await manager.do_work()

asyncio.run(main())

### JavaRush
## Правильное решение:
## Author: JavaRush's team
# import asyncio
#
# class AsyncContextManager:
#     async def __aenter__(self):
#         print("Входим в контекст")
#         return self
#
#     async def __aexit__(self, exc_type, exc_value, traceback):
#         print("Выходим из контекста")
#
#     async def do_work(self):
#         await asyncio.sleep(2)
#         print("Внутри контекста")
#
# async def main():
#     async with AsyncContextManager() as manager:
#         await manager.do_work()
#
# asyncio.run(main())