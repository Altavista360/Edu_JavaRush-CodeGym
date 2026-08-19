## Authors: JavaRush's team, CodeGym's team, Altavista360
## Version: 1.0.0

### JavaRush
## Задача: Создание простого пакета
## Ссылка: https://javarush.com/tasks/ru.javarush.python.core.level11.task03

### JavaRush
## Условие:
# Создайте пакет под названием mypackage, содержащий два модуля: module1.py и module2.py. Каждый модуль должен содержать одну функцию. Затем используйте этот пакет в тестовом файле.

### JavaRush
## Требования:
# • Программа должна включать создание директории с именем mypackage.
# • Программа должна включать файл module1.py внутри директории mypackage, содержащий одну функцию.
# • Программа должна включать файл module2.py внутри директории mypackage, содержащий одну функцию.
# • Программа должна включать тестовый файл, в котором используется пакет mypackage.

### JavaRush
## Черновик:
# # Создание простого пакета
#
# # Создайте пакет под названием mypackage, содержащий два модуля: module1.py и module2.py.
# # Каждый модуль должен содержать одну функцию.
# # Затем используйте этот пакет в тестовом файле.
#
# # Напишите тут ваш код

### JavaRush
from mypackage import foo, bar

print(foo())
print(bar())

### JavaRush
## Правильное решение:
## Author: JavaRush's team
# from mypackage import func1, func2
#
# print(func1())
# print(func2())