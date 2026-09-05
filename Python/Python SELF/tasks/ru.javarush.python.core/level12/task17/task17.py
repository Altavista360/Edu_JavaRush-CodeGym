## Authors: JavaRush's team, CodeGym's team, Altavista360
## Version: 1.0.0

### JavaRush
## Задача: Сериализация списка в файл
## Ссылка: https://javarush.com/tasks/ru.javarush.python.core.level12.task17

### CodeGym
## Task: Serialize a list to a file
## Link: https://codegym.cc/tasks/en.codegym.python.core.level12.task17

### JavaRush
## Условие:
# Напишите программу, которая сериализует список в файл с использованием модуля pickle, а затем десериализует этот список из файла.

### JavaRush
## Требования:
# • Программа должна импортировать модуль pickle.
# • Программа должна создать список, который будет сериализован в файл.
# • Программа должна использовать модуль pickle для сериализации списка и сохранения его в файл.
# • Программа должна использовать модуль pickle для загрузки (десериализации) списка из файла.
# • Программа должна выводить десериализованный список, чтобы подтвердить успешность операции.

### JavaRush
## Черновик:
# # Сериализация списка в файл
#
# # Напишите программу, которая сериализует список в файл с использованием модуля pickle,
# # а затем десериализует этот список из файла.
#
# import pickle
#
# # Пример списка для сериализации
# data = [1, 2, 3, 'a', 'b', 'c']
#
#
# # Напишите тут ваш код

### JavaRush
# Сериализация списка в файл

# Напишите программу, которая сериализует список в файл с использованием модуля pickle,
# а затем десериализует этот список из файла.

import pickle

# Пример списка для сериализации
data = [1, 2, 3, 'a', 'b', 'c']


# Напишите тут ваш код

with open('data.pkl', 'wb') as file:
    pickle.dump(data, file)

with open('data.pkl', 'rb') as file:
    loaded_data = pickle.load(file)

print(loaded_data)

### JavaRush
## Правильное решение:
## Author: JavaRush's team
# import pickle
#
# # Пример списка для сериализации
# data = [1, 2, 3, 'a', 'b', 'c']
#
# # Сериализация списка в файл
# with open('data.pkl', 'wb') as file:
#     pickle.dump(data, file)
#
# # Десериализация списка из файла
# with open('data.pkl', 'rb') as file:
#     loaded_data = pickle.load(file)
#
# # Проверка результата
# print(loaded_data)