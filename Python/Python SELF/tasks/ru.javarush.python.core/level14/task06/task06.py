## Authors: JavaRush's team, CodeGym's team, Altavista360
## Version: 1.0.0

### JavaRush
## Задача: Метод sleep()
## Ссылка: https://javarush.com/tasks/ru.javarush.python.core.level14.task06

### CodeGym
## Task: Method sleep()
## Link: https://codegym.cc/tasks/en.codegym.python.core.level14.task06

### JavaRush
## Условие:
# Напишите асинхронную функцию, которая принимает строку и задержку в секундах, затем выводит строку после указанной задержки. Создайте две задачи, каждая из которых вызывает эту функцию с разными строками и задержками. Запустите их одновременно, используя метод asyncio.run().

### JavaRush
## Требования:
# • Программа должна включать асинхронную функцию, которая принимает две переменные: строку и задержку в секундах.
# • Асинхронная функция должна выводить строку после ожидания на указанное количество секунд при помощи метода `await asyncio.sleep()`.
# • Программа должна создавать две задачи, каждая из которых вызывает асинхронную функцию с разными строками и задержками.
# • Программа должна запускать созданные задачи одновременно, используя метод `asyncio.run()`.

### JavaRush
## Черновик:
# # Метод sleep()
#
# # Напишите асинхронную функцию, которая принимает строку и задержку в секундах, затем выводит строку после указанной задержки.
# # Создайте две задачи, каждая из которых вызывает эту функцию с разными строками и задержками.
# # Запустите их одновременно, используя метод asyncio.run().
#
# # Напишите тут ваш код

### JavaRush
# Метод sleep()

# Напишите асинхронную функцию, которая принимает строку и задержку в секундах, затем выводит строку после указанной задержки.
# Создайте две задачи, каждая из которых вызывает эту функцию с разными строками и задержками.
# Запустите их одновременно, используя метод asyncio.run().

# Напишите тут ваш код

import asyncio

async def delayed_print(text, delay):
    await asyncio.sleep(delay)
    print(text)

async def main():
    task1 = asyncio.create_task(delayed_print("Приветствие через 2 секунды", 2))
    task2 = asyncio.create_task(delayed_print("Приветствие через 5 секунд", 5))
    await task1
    await task2

asyncio.run(main())

### JavaRush
## Правильное решение:
## Author: JavaRush's team
# import asyncio
#
# async def delayed_print(text, delay):
#     await asyncio.sleep(delay)
#     print(text)
#
# async def main():
#     task1 = asyncio.create_task(delayed_print("Hello after 2 seconds", 2))
#     task2 = asyncio.create_task(delayed_print("Hello after 5 seconds", 5))
#     await task1
#     await task2
#
# asyncio.run(main())