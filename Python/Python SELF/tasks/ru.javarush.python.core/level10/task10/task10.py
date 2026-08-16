## Authors: JavaRush's team, CodeGym's team, Altavista360
## Version: 1.0.0

### JavaRush
## Задача: Анализ стек-трейс
## Ссылка: https://javarush.com/tasks/ru.javarush.python.core.level10.task10

### CodeGym
## Task: Stack Trace Analysis
## Link: https://codegym.cc/tasks/en.codegym.python.core.level10.task10

### JavaRush
## Условие:
# Напишите функцию complex_operation, которая вызывает несколько вложенных функций и может вызвать исключение. Если возникает исключение, перехватите его и извлеките "сырые" сведения о трассировке стека с использованием traceback.extract_tb(). Выведите информацию о каждом фрейме стека (файл, строка, имя функции, текст строки).

### JavaRush
## Требования:
# • Программа должна включать функцию complex_operation, которая вызывает несколько вложенных функций и может вызвать исключение.
# • Функция complex_operation должна перехватывать возникшие исключения с помощью конструкции try-except.
# • При возникновении исключения, функция complex_operation должна использовать traceback.extract_tb() для извлечения "сырых" сведений о трассировке стека.
# • Функция complex_operation должна выводить файл, строку, имя функции и текст строки для каждого фрейма стека.

### JavaRush
## Черновик:
# # Анализ стек-трейс
#
# # Напишите функцию complex_operation, которая вызывает несколько вложенных функций и может вызвать исключение.
# # Если возникает исключение, перехватите его и извлеките "сырые" сведения о
# # трассировке стека с использованием traceback.extract_tb().
# # Выведите информацию о каждом фрейме стека (файл, строка, имя функции, текст строки).
#
# # Напишите тут ваш код

### JavaRush
# Анализ стек-трейс

# Напишите функцию complex_operation, которая вызывает несколько вложенных функций и может вызвать исключение.
# Если возникает исключение, перехватите его и извлеките "сырые" сведения о
# трассировке стека с использованием traceback.extract_tb().
# Выведите информацию о каждом фрейме стека (файл, строка, имя функции, текст строки).

# Напишите тут ваш код

import traceback

def complex_operation():
    def inner_function_foo():
        def inner_function_bar():
            def inner_function_baz():
                raise ValueError("An error occurred")
            inner_function_baz()
        inner_function_bar()
    try:
        inner_function_foo()
    except Exception as e:
        tb = traceback.extract_tb(e.__traceback__)
        for frame in tb:
            print(f"File: {frame.filename}; Line: {frame.lineno}; Function: {frame.name}; Code: {frame.line}")

complex_operation()

### JavaRush
## Правильное решение:
## Author: JavaRush's team
# import traceback
#
# def complex_operation():
#     def inner_function_1():
#         def inner_function_2():
#             def inner_function_3():
#                 # Здесь генерируем исключение
#                 raise ValueError("An error occurred")
#             inner_function_3()
#         inner_function_2()
#     try:
#         inner_function_1()
#     except Exception as e:
#         tb = traceback.extract_tb(e.__traceback__)
#         for frame in tb:
#             print(f"File: {frame.filename}, Line: {frame.lineno}, Function: {frame.name}, Code: {frame.line}")
#
# # Пример вызова функции
# complex_operation()