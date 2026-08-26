## Authors: JavaRush's team, CodeGym's team, Altavista360
## Version: 1.0.0

### JavaRush
## Задача: Исправляем глобальные переменные.
## Ссылка: https://javarush.com/tasks/ru.javarush.python.core.level11.task15

### CodeGym
## Task: Fixing global variables.
## Link: https://codegym.cc/tasks/en.codegym.python.core.level11.task15

### JavaRush
## Условие:
# Исправьте функцию:

### JavaRush
## Требования:
# • Программа должна включать инициализацию глобальной переменной `x` со значением 10 до определения функции `foo_correct`.
# • Внутри функции `foo_correct` должно быть объявление, что `x` является глобальной переменной, с помощью ключевого слова `global`.
# • Функция `foo_correct` должна увеличивать значение глобальной переменной `x` на 1.
# • Функция `foo_correct` должна выводить новое значение глобальной переменной `x` после её увеличения.

### JavaRush
## Черновик:
# # Исправляем глобальные переменные.
#
# # Исправьте код функции:
#
# x = 10
#
# def foo_correct():
#     x += 1
#     print(x)
#
# foo_correct()  # Вывод: 11

### JavaRush
# Исправляем глобальные переменные.

# Исправьте код функции:

x = 10

def foo_correct():
    global x
    x += 1
    print(x)

foo_correct()  # Вывод: 11

### JavaRush
## Правильное решение:
## Author: JavaRush's team
# x = 10
#
# def foo_correct():
#     global x
#     x += 1
#     print(x)
#
# foo_correct()  # Вывод: 11