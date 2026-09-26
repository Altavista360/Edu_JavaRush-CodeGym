## Authors: JavaRush's team, CodeGym's team, Altavista360
## Version: 1.0.0

### JavaRush
## Задача: Использование многопроцессорности
## Ссылка: https://javarush.com/tasks/ru.javarush.python.core.level14.task19

### CodeGym
## Task: Using Multiprocessing
## Link: https://codegym.cc/tasks/en.codegym.python.core.level14.task19

### JavaRush
## Условие:
# Напишите программу, которая создает 4 параллельных процесса. Каждый процесс должен печатать свое имя и текущий идентификатор процесса. Используйте модуль multiprocessing.

### JavaRush
## Требования:
# • Программа должна импортировать модуль multiprocessing для создания параллельных процессов.
# • Программа должна создать 4 параллельных процесса.
# • Каждый процесс должен выводить свое имя.
# • Каждый процесс должен выводить текущий идентификатор процесса.

### JavaRush
## Черновик:
# # Использование многопроцессорности
#
# # Напишите программу, которая создает 4 параллельных процесса.
# # Каждый процесс должен печатать свое имя и текущий идентификатор процесса.
# # Используйте модуль multiprocessing.
#
# # Напишите тут ваш код

### JavaRush
# Использование многопроцессорности

# Напишите программу, которая создает 4 параллельных процесса.
# Каждый процесс должен печатать свое имя и текущий идентификатор процесса.
# Используйте модуль multiprocessing.

# Напишите тут ваш код

import multiprocessing
import os

def worker(name):
    print(f'Process name: {name}, PID: {os.getpid()}')

processes = []
for i in range(4):
    process_name = f'Process-{i+1}'
    p = multiprocessing.Process(target=worker, args=(process_name,))
    processes.append(p)
    p.start()

for p in processes:
    p.join()

### JavaRush
## Правильное решение:
## Author: JavaRush's team
# import multiprocessing
# import os
#
# def worker(name):
#     print(f'Process name: {name}, PID: {os.getpid()}')
#
#
# processes = []
# for i in range(4):
#     process_name = f'Process-{i+1}'
#     p = multiprocessing.Process(target=worker, args=(process_name,))
#     processes.append(p)
#     p.start()
#
# for p in processes:
#     p.join()