## Authors: JavaRush's team, CodeGym's team, Altavista360
## Version: 1.0.0

### JavaRush
## Задача: АКМ для работы с файлами
## Ссылка: https://javarush.com/tasks/ru.javarush.python.core.level14.task16

### CodeGym
## Task: ACM for file operations
## Link: https://codegym.cc/tasks/en.codegym.python.core.level14.task16

### JavaRush
## Условие:
# Используйте библиотеку aiofiles для создания асинхронного контекстного менеджера, который будет открывать файл, записывать в него строку "Асинхронная запись в файл" и закрывать файл.

### JavaRush
## Требования:
# • Программа должна импортировать библиотеку aiofiles для использования асинхронных операций с файлами.
# • Программа должна создать асинхронный контекстный менеджер для работы с файлом.
# • Внутри контекстного менеджера программа должна записать строку "Асинхронная запись в файл" в открытый файл.
# • Программа должна корректно закрыть файл по завершении записи, используя возможности контекстного менеджера.

### JavaRush
## Черновик:
# # АКМ для работы с файлами
#
# # Используйте библиотеку aiofiles для создания асинхронного контекстного менеджера,
# # который будет открывать файл, записывать в него строку "Асинхронная запись в файл" и закрывать файл.
#
# # Напишите тут ваш код

### JavaRush
# АКМ для работы с файлами

# Используйте библиотеку aiofiles для создания асинхронного контекстного менеджера,
# который будет открывать файл, записывать в него строку "Асинхронная запись в файл" и закрывать файл.

# Напишите тут ваш код

import aiofiles
import asyncio

async def write_to_file(filename):
    async with aiofiles.open(filename, mode='w', encoding='utf-8') as file:
        await file.write("Асинхронная запись в файл")

async def main():
    await write_to_file("example.txt")

asyncio.run(main())

### JavaRush
## Правильное решение:
## Author: JavaRush's team
# import aiofiles
# import asyncio
#
# async def write_to_file(filename):
#     async with aiofiles.open(filename, mode='w', encoding='utf-8') as file:
#         await file.write("Асинхронная запись в файл")
#
# # Пример использования
# async def main():
#     await write_to_file("example.txt")
#
# # Запуск асинхронной функции
# asyncio.run(main())