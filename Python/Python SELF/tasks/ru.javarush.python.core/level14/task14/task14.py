## Authors: JavaRush's team, CodeGym's team, Altavista360
## Version: 1.0.0

### JavaRush
## Задача: Обработка исключений Future
## Ссылка: https://javarush.com/tasks/ru.javarush.python.core.level14.task14

### CodeGym
## Task: Handling Future Exceptions
## Link: https://codegym.cc/tasks/en.codegym.python.core.level14.task14

### JavaRush
## Условие:
# Напишите программу, которая создает объект Future и устанавливает для него исключение через 2 секунды. Используйте метод set_exception для установки исключения и обработайте это исключение после его возникновения.

### JavaRush
## Требования:
# • Программа должна создавать объект Future, который будет использоваться для установки исключения.
# • Программа должна устанавливать исключение для объекта Future через 2 секунды, используя метод set_exception.
# • Программа должна обрабатывать возникшее исключение после того, как оно будет установлено для объекта Future.
# • Программа должна использовать асинхронные механизмы для реализации задержки в 2 секунды перед установкой исключения.

### JavaRush
## Черновик:
# # Обработка исключений Future
#
# # Напишите программу, которая создает объект Future и устанавливает для него исключение через 2 секунды.
# # Используйте метод set_exception для установки исключения и обработайте это исключение после его возникновения.
#
# # Напишите тут ваш код

### JavaRush
# Обработка исключений Future

# Напишите программу, которая создает объект Future и устанавливает для него исключение через 2 секунды.
# Используйте метод set_exception для установки исключения и обработайте это исключение после его возникновения.

# Напишите тут ваш код

import asyncio

async def set_future_exception(future):
    await asyncio.sleep(2)
    future.set_exception(Exception("Произошла ошибка"))

async def main():
    loop = asyncio.get_running_loop()
    future = loop.create_future()

    asyncio.create_task(set_future_exception(future))

    try:
        await future
    except Exception as e:
        print(f"Произошло исключение: {e}")

asyncio.run(main())

### JavaRush
## Правильное решение:
## Author: JavaRush's team
# import asyncio
#
# async def set_future_exception(future):
#     await asyncio.sleep(2)
#     future.set_exception(Exception("An error has occurred"))
#
# async def main():
#     loop = asyncio.get_running_loop()
#     future = loop.create_future()
#
#     asyncio.create_task(set_future_exception(future))
#
#     try:
#         await future
#     except Exception as e:
#         print(f"Exception occurred: {e}")
#
# asyncio.run(main())