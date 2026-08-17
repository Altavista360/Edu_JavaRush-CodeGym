## Authors: JavaRush's team, CodeGym's team, Altavista360
## Version: 1.0.0

### JavaRush
## Задача: Иерархия пользовательских исключений
## Ссылка: https://javarush.com/tasks/ru.javarush.python.core.level10.task14

### CodeGym
## Task: Hierarchy of Custom Exceptions
## Link: https://codegym.cc/tasks/en.codegym.python.core.level10.task14

### JavaRush
## Условие:
# Создайте базовый класс исключений ApplicationError и два подкласса NegativeValueError и ValueTooLargeError. Реализуйте функцию check_number, которая будет вызывать соответствующее исключение, если число отрицательное или слишком большое. Обработайте исключения в блоке try-except.

### JavaRush
## Требования:
# • Программа должна включать базовый класс исключений ApplicationError, который будет наследоваться от встроенного класса Exception.
# • Программа должна включать два подкласса исключений, NegativeValueError и ValueTooLargeError, которые будут наследоваться от ApplicationError.
# • Программа должна включать функцию check_number, которая проверяет переданное число и вызывает соответствующее исключение, если число отрицательное или слишком большое.
# • Программа должна включать блок try-except, который обрабатывает исключения NegativeValueError и ValueTooLargeError.

### JavaRush
## Черновик:
# # Иерархия пользовательских исключений
#
# # Создайте базовый класс исключений ApplicationError и два подкласса NegativeValueError и ValueTooLargeError.
# # Реализуйте функцию check_number, которая будет вызывать соответствующее исключение, если число отрицательное или слишком большое.
# # Обработайте исключения в блоке try-except.
#
# # Напишите тут ваш код

### JavaRush
# Иерархия пользовательских исключений

# Создайте базовый класс исключений ApplicationError и два подкласса NegativeValueError и ValueTooLargeError.
# Реализуйте функцию check_number, которая будет вызывать соответствующее исключение, если число отрицательное или слишком большое.
# Обработайте исключения в блоке try-except.

# Напишите тут ваш код

class ApplicationError(Exception):
    pass

class NegativeValueError(ApplicationError):
    pass

class ValueTooLargeError(ApplicationError):
    pass

def check_number(number):
    if number < 0:
        raise NegativeValueError("The value is negative.")
    elif number > 100:
        raise ValueTooLargeError("The value is too large.")
    else:
        return "The value is acceptable."

try:
    num = int(input("Enter a number: "))
    result = check_number(num)
    print(result)
except NegativeValueError as e:
    print(f"Error: {e}")
except ValueTooLargeError as e:
    print(f"Error: {e}")
except ApplicationError as e:
    print(f"An application error occurred: {e}")

### JavaRush
## Правильное решение:
## Author: JavaRush's team
# class ApplicationError(Exception):
#     pass
#
# class NegativeValueError(ApplicationError):
#     pass
#
# class ValueTooLargeError(ApplicationError):
#     pass
#
# def check_number(number):
#     if number < 0:
#         raise NegativeValueError("The value is negative.")
#     elif number > 100:
#         raise ValueTooLargeError("The value is too large.")
#     else:
#         return "The value is acceptable."
#
# try:
#     num = int(input("Enter a number: "))
#     result = check_number(num)
#     print(result)
# except NegativeValueError as e:
#     print(f"Error: {e}")
# except ValueTooLargeError as e:
#     print(f"Error: {e}")
# except ApplicationError as e:
#     print(f"An application error occurred: {e}")