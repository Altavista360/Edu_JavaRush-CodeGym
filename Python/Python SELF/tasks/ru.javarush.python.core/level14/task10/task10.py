## Authors: JavaRush's team, CodeGym's team, Altavista360
## Version: 1.0.0

### JavaRush
## Задача: Запуск и остановка цикла событий
## Ссылка: https://javarush.com/tasks/ru.javarush.python.core.level14.task10

### CodeGym
## Task: Starting and Stopping the Event Loop
## Link: https://codegym.cc/tasks/en.codegym.python.core.level14.task10

### JavaRush
## Условие:
# Напишите программу, которая запускает цикл событий в бесконечном режиме. Запланируйте остановку цикла через 3 секунды, используя метод call_later. Проверьте, запущен ли цикл до и после вызова метода stop().

### JavaRush
## Требования:
# • Программа должна включать создание цикла событий с помощью библиотеки asyncio или аналогичной.
# • Цикл событий должен запускаться в бесконечном режиме.
# • Используя метод call_later, необходимо запланировать остановку цикла через 3 секунды.
# • Программа должна вывести статус работы цикла перед вызовом метода stop().

### JavaRush
## Черновик:
# # Запуск и остановка цикла событий
#
# # Напишите программу, которая запускает цикл событий в бесконечном режиме.
# # Запланируйте остановку цикла через 3 секунды, используя метод call_later.
# # Публикация состояния запущен ли цикл до и после вызова метода stop().
#
# # Напишите тут ваш код

### JavaRush
# Запуск и остановка цикла событий

# Напишите программу, которая запускает цикл событий в бесконечном режиме.
# Запланируйте остановку цикла через 3 секунды, используя метод call_later.
# Публикация состояния запущен ли цикл до и после вызова метода stop().

# Напишите тут ваш код

import asyncio

def stop_loop():
    print(f"Статус цикла до stop: {loop.is_running()}")
    loop.stop()
    print(f"Статус цикла после stop: {loop.is_running()}")

async def main():
    loop.call_later(3, stop_loop)

loop = asyncio.get_event_loop()
loop.create_task(main())
loop.run_forever()

### JavaRush
## Правильное решение:
## Author: JavaRush's team
# import asyncio
#
# def stop_loop():
#     print(f"Статус работы цикла перед stop: {loop.is_running()}")
#     loop.stop()
#     print(f"Статус работы цикла после stop: {loop.is_running()}")
#
# async def main():
#     loop.call_later(3, stop_loop)
#
# loop = asyncio.get_event_loop()
# loop.create_task(main())
# loop.run_forever()