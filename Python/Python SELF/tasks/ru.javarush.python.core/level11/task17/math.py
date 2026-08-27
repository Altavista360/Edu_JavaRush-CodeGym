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
# def sqrt(x):
#     print("This is a custom math module.")

### JavaRush
def sqrt(x):
    print("This is a custom math module.")

### JavaRush
## Правильное решение:
## Author: JavaRush's team
# def sqrt(x):
#     print("This is a custom math module.")