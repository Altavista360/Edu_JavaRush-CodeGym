## Authors: JavaRush's team, CodeGym's team, Altavista360
## Version: 1.0.0

### JavaRush
## Задача: Исследование модуля
## Ссылка: https://javarush.com/tasks/ru.javarush.python.core.level11.task04

### CodeGym
## Task: Exploring a Module
## Link: https://codegym.cc/tasks/en.codegym.python.core.level11.task04

### JavaRush
## Условие:
# Создайте модуль mymodule.py с функцией и переменной. Используйте функцию dir(), чтобы получить список всех доступных атрибутов и методов в этом модуле.

### JavaRush
## Требования:
# • Модуль mymodule.py должен быть создан и включать в себя как минимум одну функцию и одну переменную.
# • Функция должна быть определена внутри модуля mymodule.py.
# • Переменная должна быть определена внутри модуля mymodule.py.
# • Необходимо использовать функцию dir() для получения списка всех доступных атрибутов и методов в модуле mymodule.py.

### JavaRush
## Черновик:
# # Исследование модуля
#
# # Создайте модуль mymodule.py с функцией и переменной.
# # Используйте функцию dir(), чтобы получить список всех доступных атрибутов и методов в этом модуле.
#
# # Напишите тут ваш код

### JavaRush
# Исследование модуля

# Создайте модуль mymodule.py с функцией и переменной.
# Используйте функцию dir(), чтобы получить список всех доступных атрибутов и методов в этом модуле.

# Напишите тут ваш код

import mymodule

attributes = dir(mymodule)
print(attributes)

### JavaRush
## Правильное решение:
## Author: JavaRush's team
# import mymodule
#
# attributes = dir(mymodule)
# print(attributes)