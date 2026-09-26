## Authors: JavaRush's team, CodeGym's team, Altavista360
## Version: 1.0.0

### JavaRush
## Задача: Асинхронное программирование
## Ссылка: https://javarush.com/tasks/ru.javarush.python.core.level14.task20

### CodeGym
## Task: Asynchronous Programming
## Link: https://codegym.cc/tasks/en.codegym.python.core.level14.task20

### JavaRush
## Условие:
# Напишите асинхронную программу, которая выполняет 30 задач параллельно. Каждая задача должна ожидать 2 секунды и затем выводить своё сообщение "Task n done", где n - номер задачи. Используйте модуль asyncio.

### JavaRush
## Требования:
# • Программа должна включать асинхронную функцию, которая будет ожидать 2 секунды и затем выводить сообщение "Task n done", где n - номер задачи.
# • Асинхронная функция должна использовать asyncio.sleep для ожидания в течение 2 секунд.
# • Программа должна создавать и запускать 30 задач параллельно с использованием asyncio.gather или asyncio.create_task.
# • Каждая задача должна выводить сообщение "Task n done", где n - номер задачи (начиная с 1 и до 30).
# • Помимо прочего, программа должна использовать asyncio.run для запуска основного асинхронного процесса, который будет управлять созданием и выполнением 30 задач.

### JavaRush
## Черновик:
# # Асинхронное программирование
#
# # Напишите асинхронную программу, которая выполняет 30 задач параллельно.
# # Каждая задача должна ожидать 2 секунды и затем выводить своё сообщение "Task n done", где n - номер задачи.
# # Используйте модуль asyncio.
#
# # Напишите тут ваш код

### JavaRush
# Асинхронное программирование

# Напишите асинхронную программу, которая выполняет 30 задач параллельно.
# Каждая задача должна ожидать 2 секунды и затем выводить своё сообщение "Task n done", где n - номер задачи.
# Используйте модуль asyncio.

# Напишите тут ваш код

import asyncio

async def task(n):
    await asyncio.sleep(2)
    print(f"Task {n} done")

async def main():
    tasks = [task(i) for i in range(1, 31)]
    await asyncio.gather(*tasks)

asyncio.run(main())

### JavaRush
## Правильное решение:
## Author: JavaRush's team
# import asyncio
#
# async def task(n):
#     await asyncio.sleep(2)
#     print(f"Task {n} done")
#
# async def main():
#     tasks = [task(i) for i in range(1, 31)]
#     await asyncio.gather(*tasks)
#
# asyncio.run(main())