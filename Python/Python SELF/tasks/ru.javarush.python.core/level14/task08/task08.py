## Authors: JavaRush's team, CodeGym's team, Altavista360
## Version: 1.0.0

### JavaRush
## Задача: Использование Future
## Ссылка: https://javarush.com/tasks/ru.javarush.python.core.level14.task08

### CodeGym
## Task: Using Future
## Link: https://codegym.cc/tasks/en.codegym.python.core.level14.task08

### JavaRush
## Условие:
# Напишите асинхронную функцию, которая принимает объект Future и устанавливает для него результат после задержки в 1 секунду. Создайте цикл событий, объект Future и используйте функцию для установки результата. Затем выведите результат Future на экран.

### JavaRush
## Требования:
# • Программа должна включать асинхронную функцию, которая принимает объект Future.
# • Асинхронная функция должна использовать задержку в 1 секунду перед установкой результата для объекта Future.
# • После задержки асинхронная функция должна установить результат для переданного объекта Future.
# • Программа должна создать цикл событий для выполнения асинхронной функции.
# • После выполнения асинхронной функции программа должна напечатать результат объекта Future на экран.

### JavaRush
## Черновик:
# # Использование Future
#
# # Напишите асинхронную функцию, которая принимает объект Future
# # и устанавливает для него результат после задержки в 1 секунду.
# # Создайте цикл событий, объект Future и используйте функцию для установки результата.
# # Затем выведите результат Future на экран.
#
# # Напишите тут ваш код

### JavaRush
# Использование Future

# Напишите асинхронную функцию, которая принимает объект Future
# и устанавливает для него результат после задержки в 1 секунду.
# Создайте цикл событий, объект Future и используйте функцию для установки результата.
# Затем выведите результат Future на экран.

# Напишите тут ваш код

import asyncio

async def set_future_result(future):
    await asyncio.sleep(1)
    future.set_result('Результат через 1 секунду')

async def main():
    loop = asyncio.get_running_loop()
    future = loop.create_future()

    await set_future_result(future)
    print(future.result())

asyncio.run(main())

### JavaRush
## Правильное решение:
## Author: JavaRush's team
# import asyncio
#
# async def set_future_result(future):
#     await asyncio.sleep(1)
#     future.set_result('Result after 1 second')
#
# async def main():
#     loop = asyncio.get_running_loop()
#     future = loop.create_future()
#
#     await set_future_result(future)
#     print(future.result())
#
# asyncio.run(main())