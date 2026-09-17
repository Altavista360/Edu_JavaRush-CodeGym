## Authors: JavaRush's team, CodeGym's team, Altavista360
## Version: 1.0.0

### JavaRush
## Задача: Использование ThreadLocal
## Ссылка: https://javarush.com/tasks/ru.javarush.python.core.level14.task02

### CodeGym
## Task: Using ThreadLocal
## Link: https://codegym.cc/tasks/en.codegym.python.core.level14.task02

### JavaRush
## Условие:
# Напишите программу, которая использует класс ThreadLocal для хранения данных, уникальных для каждого потока.

### JavaRush
## Требования:
# • Программа должна использовать класс ThreadLocal для хранения данных, которые будут уникальными для каждого потока.
# • Программа должна создавать и запускать несколько потоков.
# • В каждом потоке должна быть возможность установить и получить уникальные данные, используя объект ThreadLocal.
# • Программа должна выводить установленные данные на консоль для каждого потока, чтобы продемонстрировать, что данные действительно уникальны для каждого потока.

### JavaRush
## Черновик:
# # Использование ThreadLocal
#
# # Напишите программу, которая использует класс ThreadLocal для хранения данных, уникальных для каждого потока.
#
# # Напишите тут ваш код

### JavaRush
# Использование ThreadLocal

# Напишите программу, которая использует класс ThreadLocal для хранения данных, уникальных для каждого потока.

# Напишите тут ваш код

import threading

thread_local_data = threading.local()

def process_data():
    thread_local_data.value = threading.current_thread().name
    print(f"Hello from {thread_local_data.value}")

def thread_function():
    process_data()

threads = []
for i in range(5):
    thread = threading.Thread(target=thread_function, name=f"Thread-{i}")
    threads.append(thread)
    thread.start()

for thread in threads:
    thread.join()

### JavaRush
## Правильное решение:
## Author: JavaRush's team
# import threading
#
# # Создаем объект ThreadLocal
# thread_local_data = threading.local()
#
# # Функция, работающая с ThreadLocal данными
# def process_data():
#     thread_local_data.value = threading.current_thread().name
#     print(f"Hello from {thread_local_data.value}")
#
# # Функция для потока
# def thread_function():
#     process_data()
#
# # Создаем несколько потоков
# threads = []
# for i in range(5):
#     thread = threading.Thread(target=thread_function, name=f"Thread-{i}")
#     threads.append(thread)
#     thread.start()
#
# # Ожидаем завершения всех потоков
# for thread in threads:
#     thread.join()