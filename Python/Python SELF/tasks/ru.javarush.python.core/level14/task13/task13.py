## Authors: JavaRush's team, CodeGym's team, Altavista360
## Version: 1.0.0

### JavaRush
## Задача: Использование объекта Future
## Ссылка: https://javarush.com/tasks/ru.javarush.python.core.level14.task13

### CodeGym
## Task: Using a Future Object
## Link: https://codegym.cc/tasks/en.codegym.python.core.level14.task13

### JavaRush
## Условие:
# Напишите программу, которая создает объект Future и устанавливает для него результат через 3 секунды. Используйте метод set_result для установки результата и выведите результат объекта Future после его завершения.

### JavaRush
## Требования:
# • Программа должна создать объект Future.
# • Программа должна установить задержку выполнения на 3 секунды перед установкой результата.
# • Программа должна использовать метод set_result для установки результата объекта Future.
# • Программа должна вывести результат объекта Future после его завершения.

### JavaRush
## Черновик:
# # Использование объекта Future
#
# # Напишите программу, которая создает объект Future и устанавливает для него результат через 3 секунды.
# # Используйте метод set_result для установки результата и выведите результат объекта Future после его завершения.
#
# # Напишите тут ваш код

### JavaRush
# Использование объекта Future

# Напишите программу, которая создает объект Future и устанавливает для него результат через 3 секунды.
# Используйте метод set_result для установки результата и выведите результат объекта Future после его завершения.

# Напишите тут ваш код

import asyncio

async def set_future_result(fut):
    await asyncio.sleep(3)
    fut.set_result('Я из будущего.')

async def main():
    fut = asyncio.Future()
    await asyncio.gather(set_future_result(fut))
    print(fut.result())

asyncio.run(main())

### JavaRush
## Правильное решение:
## Author: JavaRush's team
# import asyncio
#
# async def set_future_result(fut):
#     await asyncio.sleep(3)
#     fut.set_result('Hello, Future!')
#
# async def main():
#     fut = asyncio.Future()
#     await asyncio.gather(set_future_result(fut))
#     print(fut.result())
#
# asyncio.run(main())