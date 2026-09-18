## Authors: JavaRush's team, CodeGym's team, Altavista360
## Version: 1.0.0

### JavaRush
## Задача: Создание и выполнение асинхронных функций
## Ссылка: https://javarush.com/tasks/ru.javarush.python.core.level14.task03

### CodeGym
## Task: Creating and Executing Asynchronous Functions
## Link: https://codegym.cc/tasks/en.codegym.python.core.level14.task03

### JavaRush
## Условие:
# Напишите программу, которая создает и выполняет несколько асинхронных функций, каждая из которых использует оператор await для ожидания завершения другой асинхронной функции.

### JavaRush
## Требования:
# • Программа должна использовать библиотеку asyncio для создания и выполнения асинхронных функций.
# • Программа должна содержать несколько (минимум две) асинхронные функции, которые выполняют конкретные задачи.
# • В каждой из асинхронных функций должен использоваться оператор await для ожидания завершения другой асинхронной функции.
# • Программа должна включать основную функцию, которая запускает созданные асинхронные функции и управляет их выполнением.
# • Программа должна использовать asyncio.run для выполнения основной функции, запускающей асинхронные задачи.

### JavaRush
## Черновик:
# # Создание и выполнение асинхронных функций
#
# # Напишите программу, которая создает и выполняет несколько асинхронных функций,
# # каждая из которых использует оператор await для ожидания завершения другой асинхронной функции.
#
# # Напишите тут ваш код

### JavaRush
# Создание и выполнение асинхронных функций

# Напишите программу, которая создает и выполняет несколько асинхронных функций,
# каждая из которых использует оператор await для ожидания завершения другой асинхронной функции.

# Напишите тут ваш код

import asyncio

async def async_function_1():
    print("Запуск асинхронной функции 1")
    await asyncio.sleep(2)
    print("Завершение асинхронной функции 1")

async def async_function_2():
    print("Запуск асинхронной функции 2")
    await asyncio.sleep(1)
    print("Завершение асинхронной функции 2")

async def main():
    print("Запуск main")
    task1 = asyncio.create_task(async_function_1())
    task2 = asyncio.create_task(async_function_2())

    await task1
    await task2
    print("Завершение main")

asyncio.run(main())

### JavaRush
## Правильное решение:
## Author: JavaRush's team
# import asyncio
#
# async def async_function_1():
#     print("Запуск async_function_1")
#     await asyncio.sleep(2)
#     print("Завершение async_function_1")
#
# async def async_function_2():
#     print("Запуск async_function_2")
#     await asyncio.sleep(1)
#     print("Завершение async_function_2")
#
# async def main():
#     print("Запуск main")
#     task1 = asyncio.create_task(async_function_1())
#     task2 = asyncio.create_task(async_function_2())
#
#     await task1
#     await task2
#     print("Завершение main")
#
# asyncio.run(main())