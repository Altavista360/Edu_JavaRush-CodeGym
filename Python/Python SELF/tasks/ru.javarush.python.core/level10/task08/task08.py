## Authors: JavaRush's team, CodeGym's team, Altavista360
## Version: 1.0.0

### JavaRush
## Задача: Извлечение информации из исключения
## Ссылка: https://javarush.com/tasks/ru.javarush.python.core.level10.task08

### CodeGym
## Task: Extracting Information from an Exception
## Link: https://codegym.cc/tasks/en.codegym.python.core.level10.task08

### JavaRush
## Условие:
# Напишите функцию read_integer, которая принимает строку и пытается преобразовать её в целое число. Если возникает ValueError, обработайте исключение и выведите аргументы ошибки и тип ошибки. Дополнительно, сохраните исключение в переменной и выведите её за пределами блока except.

### JavaRush
## Требования:
# • Функция read_integer должна пытаться преобразовать переданную строку в целое число с помощью функции int().
# • Если при преобразовании строки в целое число возникает исключение ValueError, функция должна обработать это исключение.
# • В блоке except функция должна вывести аргументы ошибки и тип ошибки, используя print().
# • Функция должна сохранить исключение, возникшее при обработке ValueError, в переменной.
# • Функция должна вывести сохраненное исключение за пределами блока except, используя print().

### JavaRush
## Черновик:
# # Извлечение информации из исключения
#
# # Напишите функцию read_integer, которая принимает строку и пытается преобразовать её в целое число.
# # Если возникает ValueError, обработайте исключение и выведите аргументы ошибки и тип ошибки.
# # Дополнительно, сохраните исключение в переменной и выведите её за пределами блока except.
#
# # Напишите тут ваш код

### JavaRush
# Извлечение информации из исключения

# Напишите функцию read_integer, которая принимает строку и пытается преобразовать её в целое число.
# Если возникает ValueError, обработайте исключение и выведите аргументы ошибки и тип ошибки.
# Дополнительно, сохраните исключение в переменной и выведите её за пределами блока except.

# Напишите тут ваш код

def read_integer(input_string):
    exception_instance = None
    try:
        return int(input_string)
    except ValueError as e:
        exception_instance = e
        print(f"Error arguments: {e.args}")
        print(f"Error type: {type(e)}")
    print(f"Exception instance: {exception_instance}")

read_integer("foobar")

### JavaRush
## Правильное решение:
## Author: JavaRush's team
# def read_integer(input_string):
#     exception_instance = None
#     try:
#         return int(input_string)
#     except ValueError as e:
#         exception_instance = e
#         print(f"Error arguments: {e.args}")
#         print(f"Error type: {type(e)}")
#     print(f"Exception instance: {exception_instance}")
#
# # Пример вызова функции
# read_integer("abc")