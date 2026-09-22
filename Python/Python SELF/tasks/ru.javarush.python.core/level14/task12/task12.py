## Authors: JavaRush's team, CodeGym's team, Altavista360
## Version: 1.0.0

### JavaRush
## Задача: Отмена задачи
## Ссылка: https://javarush.com/tasks/ru.javarush.python.core.level14.task12

### CodeGym
## Task: Task Cancellation
## Link: https://codegym.cc/tasks/en.codegym.python.core.level14.task12

### JavaRush
## Условие:
# Напишите асинхронную программу, которая создает задачу, выполняющую ожидание 5 секунд. Запустите её, подождите 1 секунду, затем отмените задачу и выведите сообщение о её отмене. Обработайте исключение CancelledError.

### JavaRush
## Требования:
# • Программа должна создавать асинхронную задачу, которая выполняет ожидание 5 секунд.
# • Программа должна запускать асинхронную задачу, ожидать 1 секунду, а затем пытаться отменить задачу.
# • Программа должна корректно отменять задачу и выводить сообщение о её отмене.
# • Программа должна обрабатывать исключение CancelledError, которое возникает при отмене задачи.

### JavaRush
## Черновик:
# # Отмена задачи
#
# # Напишите асинхронную программу, которая создает задачу, выполняющую ожидание 5 секунд.
# # Запустите её, подождите 1 секунду, затем отмените задачу и выведите сообщение о её отмене.
# # Обработайте исключение CancelledError.
#
# # Напишите тут ваш код

### JavaRush
# Отмена задачи

# Напишите асинхронную программу, которая создает задачу, выполняющую ожидание 5 секунд.
# Запустите её, подождите 1 секунду, затем отмените задачу и выведите сообщение о её отмене.
# Обработайте исключение CancelledError.

# Напишите тут ваш код

import asyncio

async def long_running_task():
    try:
        print("Задача запущена. Ожидание 5 секунд.")
        await asyncio.sleep(5)
        print("Задача выполнена.")
    except asyncio.CancelledError:
        print("Задача отменена.")

async def main():
    task = asyncio.create_task(long_running_task())
    await asyncio.sleep(1)
    task.cancel()
    try:
        await task
    except asyncio.CancelledError:
        print("Перехвачена отмена задачи.")

asyncio.run(main())

### JavaRush
## Правильное решение:
## Author: JavaRush's team
# import asyncio
#
# async def long_running_task():
#     try:
#         print("Task started, will sleep for 5 seconds...")
#         await asyncio.sleep(5)
#         print("Task completed!")
#     except asyncio.CancelledError:
#         print("Task was cancelled.")
#
# async def main():
#     task = asyncio.create_task(long_running_task())
#     await asyncio.sleep(1)
#     task.cancel()
#     try:
#         await task
#     except asyncio.CancelledError:
#         print("Caught task cancellation.")
#
# asyncio.run(main())