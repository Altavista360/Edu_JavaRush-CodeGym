## Authors: JavaRush's team, CodeGym's team, Altavista360
## Version: 1.0.0

### JavaRush
## Задача: Пересечение имен.
## Ссылка: https://javarush.com/tasks/ru.javarush.python.core.level11.task17

### CodeGym
## Task: Intersection of names.
## Link: https://codegym.cc/tasks/en.codegym.python.core.level11.task17

### JavaRush
## Условие:
# Вызовите функцию sqrt вашего модуля math. Вызовите функцию sqrt встроенного модуля math.

### JavaRush
## Требования:
# • Программа должна вызывать функцию sqrt, определенную в пользовательском модуле math, которая выводит текст "This is a custom math module."
# • Программа должна вызывать функцию sqrt из стандартного модуля math.
# • Программа должна импортировать стандартный модуль math.
# • Программа должна импортировать пользовательский модуль math. Рекомендуется использовать функции importlib.util.spec_from_file_location и importlib.util.module_from_spec

### JavaRush
## Черновик:
# # Пересечение имен.
#
# # Вызовите функцию sqrt вашего модуля math.
# # Вызовите функцию sqrt встроенного модуля math.
#
# # Напишите тут ваш код

### JavaRush
# Пересечение имен.

# Вызовите функцию sqrt вашего модуля math.
# Вызовите функцию sqrt встроенного модуля math.

# Напишите тут ваш код

import math as std_math

print(std_math.sqrt(9))

import importlib.util

custom_math_path = 'Edu_JavaRush-CodeGym/Python/Python SELF/tasks/ru.javarush.python.core/level11/task17/math.py'

spec = importlib.util.spec_from_file_location("custom_math", custom_math_path)
custom_math = importlib.util.module_from_spec(spec)
spec.loader.exec_module(custom_math)

custom_math.sqrt(9)

### JavaRush
## Правильное решение:
## Author: JavaRush's team
# # Импортируем встроенный модуль math
# import math as std_math
#
# # Вызов функции sqrt стандартного модуля math
# print(std_math.sqrt(9))
#
# # Импортируем пользовательский модуль math
# import importlib.util
#
# # Путь к пользовательскому модулю
# # custom_math_path = './math.py'
# custom_math_path = 'core/level11/task17/math.py'
#
# # Загрузите пользовательский модуль math
# spec = importlib.util.spec_from_file_location("custom_math", custom_math_path)
# custom_math = importlib.util.module_from_spec(spec)
# spec.loader.exec_module(custom_math)
#
# # Вызов функции sqrt из пользовательского модуля math
# custom_math.sqrt(9)