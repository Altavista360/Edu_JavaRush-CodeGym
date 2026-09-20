## Authors: JavaRush's team, CodeGym's team, Altavista360
## Version: 1.0.0

### JavaRush
## Задача: Управление задачами (Tasks)
## Ссылка: https://javarush.com/tasks/ru.javarush.python.core.level14.task07

### CodeGym
## Task: Task Management (Tasks)
## Link: https://codegym.cc/tasks/en.codegym.python.core.level14.task07

### JavaRush
## Условие:
# Напишите асинхронную программу, которая создает две задачи. Первая задача должна ждать 1 секунду и печатать "Первая задача завершена", вторая задача должна ждать 2 секунды и печатать "Вторая задача завершена". Используйте asyncio.create_task() для создания задач и asyncio.run() для их выполнения.

### JavaRush
## Требования:
# • Программа должна использовать функцию asyncio.create_task() для создания двух асинхронных задач.
# • Первая задача должна ждать 1 секунду с использованием asyncio.sleep(1) и затем печатать "Первая задача завершена".
# • Вторая задача должна ждать 2 секунды с использованием asyncio.sleep(2) и затем печатать "Вторая задача завершена".
# • Программа должна использовать функцию asyncio.run() для выполнения задач.

### JavaRush
## Черновик:
# # Управление задачами (Tasks)
#
# # Напишите асинхронную программу, которая создает две задачи.
# # Первая задача должна ждать 1 секунду и печатать "Первая задача завершена",
# # вторая задача должна ждать 2 секунды и печатать "Вторая задача завершена".
# # Используйте asyncio.create_task() для создания задач и asyncio.run() для их выполнения.
#
# # Напишите тут ваш код

### JavaRush
# Управление задачами (Tasks)

# Напишите асинхронную программу, которая создает две задачи.
# Первая задача должна ждать 1 секунду и печатать "Первая задача завершена",
# вторая задача должна ждать 2 секунды и печатать "Вторая задача завершена".
# Используйте asyncio.create_task() для создания задач и asyncio.run() для их выполнения.

# Напишите тут ваш код

import asyncio

async def first_task():
    await asyncio.sleep(1)
    print("Первая задача завершена")

async def second_task():
    await asyncio.sleep(2)
    print("Вторая задача завершена")

async def main():
    task1 = asyncio.create_task(first_task())
    task2 = asyncio.create_task(second_task())
    await task1
    await task2

asyncio.run(main())

### JavaRush
## Правильное решение:
## Author: JavaRush's team
# import asyncio
#
# async def first_task():
#     await asyncio.sleep(1)
#     print("Первая задача завершена")
#
# async def second_task():
#     await asyncio.sleep(2)
#     print("Вторая задача завершена")
#
# async def main():
#     task1 = asyncio.create_task(first_task())
#     task2 = asyncio.create_task(second_task())
#     await task1
#     await task2
#
# asyncio.run(main())