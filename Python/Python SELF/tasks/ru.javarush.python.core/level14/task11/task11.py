## Authors: JavaRush's team, CodeGym's team, Altavista360
## Version: 1.0.0

### JavaRush
## Задача: Управление циклом событий
## Ссылка: https://javarush.com/tasks/ru.javarush.python.core.level14.task11

### CodeGym
## Task: Event Loop Management
## Link: https://codegym.cc/tasks/en.codegym.python.core.level14.task11

### JavaRush
## Условие:
# Напишите асинхронную программу, которая создает две задачи. Первая задача должна печатать "Первая задача" и ждать 2 секунды, вторая задача должна печатать "Вторая задача" и ждать 3 секунды. Используйте asyncio.create_task() для создания задач и выполните их параллельно, дождавшись завершения обеих.

### JavaRush
## Требования:
# • Программа должна создать первую задачу, которая печатает "Первая задача" и ждет 2 секунды.
# • Программа должна создать вторую задачу, которая печатает "Вторая задача" и ждет 3 секунды.
# • Для создания задач программа должна использовать функцию asyncio.create_task().
# • Программа должна выполнить обе задачи параллельно, дождавшись завершения обеих.
# • Программа должна быть асинхронной и использовать модуль asyncio для управления циклом событий.

### JavaRush
## Черновик:
# # Управление циклом событий
#
# # Напишите асинхронную программу, которая создает две задачи.
# # Первая задача должна печатать "Первая задача" и ждать 2 секунды,
# # вторая задача должна печатать "Вторая задача" и ждать 3 секунды.
# # Используйте asyncio.create_task() для создания задач и выполните их параллельно, дождавшись завершения обеих.
#
# # Напишите тут ваш код

### JavaRush
# Управление циклом событий

# Напишите асинхронную программу, которая создает две задачи.
# Первая задача должна печатать "Первая задача" и ждать 2 секунды,
# вторая задача должна печатать "Вторая задача" и ждать 3 секунды.
# Используйте asyncio.create_task() для создания задач и выполните их параллельно, дождавшись завершения обеих.

# Напишите тут ваш код

import asyncio

async def task_one():
    print("Первая задача")
    await asyncio.sleep(2)

async def task_two():
    print("Вторая задача")
    await asyncio.sleep(3)

async def main():
    task1 = asyncio.create_task(task_one())
    task2 = asyncio.create_task(task_two())

    await asyncio.gather(task1, task2)

asyncio.run(main())

### JavaRush
## Правильное решение:
## Author: JavaRush's team
# import asyncio
#
# async def task_one():
#     print("Первая задача")
#     await asyncio.sleep(2)
#
# async def task_two():
#     print("Вторая задача")
#     await asyncio.sleep(3)
#
# async def main():
#     task1 = asyncio.create_task(task_one())
#     task2 = asyncio.create_task(task_two())
#
#     await asyncio.gather(task1, task2)
#
# # Запуск основного события цикла
# asyncio.run(main())