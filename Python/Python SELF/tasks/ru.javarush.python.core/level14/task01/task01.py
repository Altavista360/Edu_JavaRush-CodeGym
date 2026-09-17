## Authors: JavaRush's team, CodeGym's team, Altavista360
## Version: 1.0.0

### JavaRush
## Задача: Использование класса Timer
## Ссылка: https://javarush.com/tasks/ru.javarush.python.core.level14.task01

### CodeGym
## Task: Using the Timer class
## Link: https://codegym.cc/tasks/en.codegym.python.core.level14.task01

### JavaRush
## Условие:
# Напишите программу, которая использует класс Timer для выполнения функции с задержкой и демонстрирует отмену таймера до его срабатывания.

### JavaRush
## Требования:
# • Программа должна включать класс Timer, который управляет таймером для выполнения заданной функции с задержкой.
# • Программа должна включать функцию, которая будет выполняться с задержкой, заданной с помощью таймера.
# • Программа должна демонстрировать возможность отмены (остановки) таймера до того, как он сработает.
# • Программа должна инициализировать таймер с заданной задержкой и запустить его для выполнения функции.
# • Программа должна содержать логику обработки отмены таймера, чтобы обеспечить, что функция не будет выполнена после отмены.

### JavaRush
## Черновик:
# # Использование класса Timer
#
# # Напишите программу, которая использует класс Timer для выполнения функции с задержкой
# # и демонстрирует отмену таймера до его срабатывания.
#
# # Напишите тут ваш код

### JavaRush
# Использование класса Timer

# Напишите программу, которая использует класс Timer для выполнения функции с задержкой
# и демонстрирует отмену таймера до его срабатывания.

# Напишите тут ваш код

import threading
import time

class Timer:
    def __init__(self, interval, function, *args, **kwargs):
        self.interval = interval
        self.function = function
        self.args = args
        self.kwargs = kwargs
        self.thread = None

    def start(self):
        self.thread = threading.Timer(self.interval, self.function, self.args, self.kwargs)
        self.thread.start()

    def cancel(self):
        if self.thread:
            self.thread.cancel()

def my_function():
    print("Таймер сработал!")

t = Timer(5, my_function)

print("Запуск таймера")
t.start()

time.sleep(2)
print("Отмена таймера")
t.cancel()

### JavaRush
## Правильное решение:
## Author: JavaRush's team
# import threading
# import time
#
# class Timer:
#     def __init__(self, interval, function, *args, **kwargs):
#         self.interval = interval
#         self.function = function
#         self.args = args
#         self.kwargs = kwargs
#         self.thread = None
#
#     def start(self):
#         self.thread = threading.Timer(self.interval, self.function, self.args, self.kwargs)
#         self.thread.start()
#
#     def cancel(self):
#         if self.thread:
#             self.thread.cancel()
#
# def my_function():
#     print("Таймер сработал!")
#
# # Создаем экземпляр Timer с интервалом 5 секунд
# t = Timer(5, my_function)
#
# # Запускаем таймер
# print("Запуск таймера")
# t.start()
#
# # Ждем 2 секунды, затем отменяем таймер
# time.sleep(2)
# print("Отмена таймера")
# t.cancel()