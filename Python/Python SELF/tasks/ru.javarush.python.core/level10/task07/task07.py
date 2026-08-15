## Authors: JavaRush's team, CodeGym's team, Altavista360
## Version: 1.0.0

### JavaRush
## Задача: Получение числа.
## Ссылка: https://javarush.com/tasks/ru.javarush.python.core.level10.task07

### CodeGym
## Task: Obtaining a number.
## Link: https://codegym.cc/tasks/en.codegym.python.core.level10.task07

### JavaRush
## Условие:
# Напишите функцию process_input, которая принимает строку и пытается преобразовать её в целое число. Если преобразование успешно, функция должна возвращать квадрат числа. Если строка не является числом, обработайте ValueError и выведите сообщение об ошибке. Если строка пустая, обработайте IndexError, но перед этим выбросьте (raise) это исключение, и выведите соответствующее сообщение.

### JavaRush
## Требования:
# • В коде должна быть функция process_input.
# • Функция process_input должна принимать строку.
# • Функция process_input должна пытаться преобразовать строку в целое число.
# • Если преобразование успешно, функция должна возвращать квадрат числа.
# • Функция должна обрабатывать ValueError и выводить сообщение об ошибке, если строка не является числом.
# • Функция должна обрабатывать IndexError и выводить сообщение об ошибке, если строка пустая.

### JavaRush
## Черновик:
# # Получение числа.
#
# # Напишите функцию process_input, которая принимает строку и пытается преобразовать её в целое число.
# # Если преобразование успешно, функция должна возвращать квадрат числа.
# # Если строка не является числом, обработайте ValueError и выведите сообщение об ошибке.
# # Если строка пустая, обработайте IndexError и выведите соответствующее сообщение.
#
# # Напишите тут ваш код
#
# # Примеры вызова функции
# print(process_input("5"))         # Вывод: 25
# print(process_input("abc"))       # Вывод: Ошибка: введенная строка не является числом.
# print(process_input(""))          # Вывод: Ошибка: введена пустая строка.

### JavaRush
# Получение числа.

# Напишите функцию process_input, которая принимает строку и пытается преобразовать её в целое число.
# Если преобразование успешно, функция должна возвращать квадрат числа.
# Если строка не является числом, обработайте ValueError и выведите сообщение об ошибке.
# Если строка пустая, обработайте IndexError и выведите соответствующее сообщение.

# Напишите тут ваш код

def process_input(input_string):
    try:
        if input_string == "":
            raise IndexError("Empty string")
        number = int(input_string)
        return number ** 2
    except ValueError:
        print("Error: not number")
    except IndexError:
        print("Error: empty string")

# Примеры вызова функции
print(process_input("5"))         # Вывод: 25
print(process_input("abc"))       # Вывод: Ошибка: введенная строка не является числом.
print(process_input(""))          # Вывод: Ошибка: введена пустая строка.

### JavaRush
## Правильное решение:
## Author: JavaRush's team
# def process_input(input_string):
#     try:
#         if input_string == "":
#             raise IndexError("Пустая строка")
#         number = int(input_string)
#         return number ** 2
#     except ValueError:
#         print("Ошибка: введенная строка не является числом.")
#     except IndexError:
#         print("Ошибка: введена пустая строка.")
#
# # Примеры вызова функции
# print(process_input("5"))         # Вывод: 25
# print(process_input("abc"))       # Вывод: Ошибка: введенная строка не является числом.
# print(process_input(""))          # Вывод: Ошибка: введена пустая строка.