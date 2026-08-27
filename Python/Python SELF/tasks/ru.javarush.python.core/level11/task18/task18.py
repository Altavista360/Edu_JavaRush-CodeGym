## Authors: JavaRush's team, CodeGym's team, Altavista360
## Version: 1.0.0

### JavaRush
## Задача: Зона видимости переменной.
## Ссылка: https://javarush.com/tasks/ru.javarush.python.core.level11.task18

### CodeGym
## Task: Variable Scope.
## Link: https://codegym.cc/tasks/en.codegym.python.core.level11.task18

### JavaRush
## Условие:
# Исправьте код, чтобы последний print выводил исключение.

### JavaRush
## Требования:
# • Программа должна включать правильные отступы в функции bar и bad, чтобы код был синтаксически корректен.
# • Последний print в функции bad должен выводить значение переменной e, которая содержит информацию об исключении.
# • Переменная e должна быть видимой в блоке try-except, чтобы её значение можно было использовать после блока обработки исключений.

### JavaRush
## Черновик:
# # Зона видимости переменной.
#
# # Исправьте код, чтобы последний print выводил исключение.
#
# def bar(i):
#     if i == 1:
#         raise KeyError(1)
#     if i == 2:
#         raise ValueError(2)
#
# def bad():
#     try:
#         bar(1)
#     except KeyError as e:
#         print('key error')
#     except ValueError as e:
#         print('value error')
#     print(e)  # This should raise an exception because e is not defined in this scope
#
# bad()

### JavaRush
# Зона видимости переменной.

# Исправьте код, чтобы последний print выводил исключение.

def bar(i):
    if i == 1:
        raise KeyError(1)
    if i == 2:
        raise ValueError(2)

def bad():
    exception = None
    try:
        bar(1)
    except KeyError as e:
        exception = e
        print('key error')
    except ValueError as e:
        exception = e
        print('value error')
    print(exception)

bad()

### JavaRush
## Правильное решение:
## Author: JavaRush's team
# def bar(i):
#     if i == 1:
#         raise KeyError(1)
#     if i == 2:
#         raise ValueError(2)
#
# def bad():
#     exception = None
#     try:
#         bar(1)
#     except KeyError as e:
#         exception = e
#         print('key error')
#     except ValueError as e:
#         exception = e
#         print('value error')
#     print(exception)  # Fixed!
#
# bad()