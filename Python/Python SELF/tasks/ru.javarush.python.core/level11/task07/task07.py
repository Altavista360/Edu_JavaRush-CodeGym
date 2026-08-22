## Authors: JavaRush's team, CodeGym's team, Altavista360
## Version: 1.0.0

### JavaRush
## Задача: Использование пакета requests.
## Ссылка: https://javarush.com/tasks/ru.javarush.python.core.level11.task07

### CodeGym
## Task: Using the requests package.
## Link: https://codegym.cc/tasks/en.codegym.python.core.level11.task07

### JavaRush
## Условие:
# Используйте пакет requests для выполнения GET-запроса к API. Выполните следующие шаги: Установите пакет requests с помощью pip. Используйте пакет requests для выполнения GET-запроса к API, например, к https://jsonplaceholder.typicode.com. Выведите на экран результат запроса.

### JavaRush
## Требования:
# • Программа должна включать установку пакета requests с помощью команды pip.
# • Программа должна импортировать библиотеку requests.
# • Программа должна использовать пакет requests для выполнения GET-запроса к API.
# • Программа должна вывести на экран результат запроса.

### JavaRush
## Черновик:
# # Использование пакета requests.
#
# # Используйте пакет requests для выполнения GET-запроса к API.
# # Выполните следующие шаги:
# # Установите пакет requests с помощью pip.
# # Используйте пакет requests для выполнения GET-запроса к API, например, к https://jsonplaceholder.typicode.com.
# # Выведите на экран результат запроса.
#
# # Напишите тут ваш код

### JavaRush
# Использование пакета requests.

# Используйте пакет requests для выполнения GET-запроса к API.
# Выполните следующие шаги:
# Установите пакет requests с помощью pip.
# Используйте пакет requests для выполнения GET-запроса к API, например, к https://jsonplaceholder.typicode.com.
# Выведите на экран результат запроса.

# Напишите тут ваш код

import requests

response = requests.get('https://jsonplaceholder.typicode.com/posts')

print(response.json())

### JavaRush
## Правильное решение:
## Author: JavaRush's team
# import requests
#
# # Выполнение GET-запроса к API
# response = requests.get('https://jsonplaceholder.typicode.com/posts')
#
# # Вывод результата запроса
# print(response.json())