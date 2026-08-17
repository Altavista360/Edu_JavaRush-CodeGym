## Authors: JavaRush's team, CodeGym's team, Altavista360
## Version: 1.0.0

### JavaRush
## Задача: Запуск стандартного исключения
## Ссылка: https://javarush.com/tasks/ru.javarush.python.core.level10.task11

### CodeGym
## Task: Raising a Standard Exception
## Link: https://codegym.cc/tasks/en.codegym.python.core.level10.task11

### JavaRush
## Условие:
# Напишите функцию check_positive, которая принимает число и проверяет, является ли оно положительным. Если число отрицательное или равно нулю, функция должна запустить исключение ValueError с сообщением "Number must be positive".

### JavaRush
## Требования:
# • Функция check_positive должна принимать один аргумент, который является числом.
# • Функция должна проверять, является ли переданное число больше нуля.
# • Если число отрицательное или равно нулю, функция должна вызывать исключение ValueError с сообщением "Number must be positive".
# • Если число положительное, функция должна завершаться без вызова исключений.

### JavaRush
## Черновик:
# # Запуск стандартного исключения
#
# # Напишите функцию check_positive, которая принимает число и проверяет, является ли оно положительным.
# # Если число отрицательное или равно нулю, функция должна запустить исключение ValueError с сообщением "Number must be positive".
#
# # Напишите тут ваш код

### JavaRush
# Запуск стандартного исключения

# Напишите функцию check_positive, которая принимает число и проверяет, является ли оно положительным.
# Если число отрицательное или равно нулю, функция должна запустить исключение ValueError с сообщением "Number must be positive".

# Напишите тут ваш код

def check_positive(number):
    if number <= 0:
        raise ValueError("Number must be positive")
    return True

### JavaRush
## Правильное решение:
## Author: JavaRush's team
# def check_positive(number):
#     if number <= 0:
#         raise ValueError("Number must be positive")
#     return True