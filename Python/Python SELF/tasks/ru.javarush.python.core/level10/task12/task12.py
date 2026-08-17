## Authors: JavaRush's team, CodeGym's team, Altavista360
## Version: 1.0.0

### JavaRush
## Задача: Переупаковка исключения
## Ссылка: https://javarush.com/tasks/ru.javarush.python.core.level10.task12

### CodeGym
## Task: Exception Repacking
## Link: https://codegym.cc/tasks/en.codegym.python.core.level10.task12

### JavaRush
## Условие:
# Напишите функцию validate_input, которая принимает строку и проверяет, что она не пустая и что ее длина не превышает 10 символов. Если строка пустая, запустите ValueError с сообщением "Input cannot be empty". Если строка слишком длинная, запустите ValueError с сообщением "Input is too long". Затем перехватите это исключение и переупакуйте его в пользовательское исключение InputValidationError, сохранив исходное исключение как причину.

### JavaRush
## Требования:
# • Программа должна проверять, что вводимая строка не пустая. В случае пустой строки должно запускаться исключение ValueError с сообщением "Input cannot be empty".
# • Программа должна проверять, что длина вводимой строки не превышает 10 символов. В случае, если длина строки превышает 10 символов, должно запускаться исключение ValueError с сообщением "Input is too long".
# • Программа должна определять пользовательское исключение InputValidationError.
# • Программа должна перехватывать исключения ValueError и переупаковывать их в пользовательское исключение InputValidationError, сохранив исходное исключение как причину.
# • Программа должна включать функцию validate_input, которая принимает строку и реализует описанную выше логику проверки и обработки исключений.

### JavaRush
## Черновик:
# # Переупаковка исключения
#
# # Напишите функцию validate_input, которая принимает строку и проверяет,
# # что она не пустая и что ее длина не превышает 10 символов.
# # Если строка пустая, запустите ValueError с сообщением "Input cannot be empty".
# # Если строка слишком длинная, запустите ValueError с сообщением "Input is too long".
# # Затем перехватите это исключение и переупакуйте его в пользовательское исключение InputValidationError, сохранив исходное исключение как причину.
#
# # Напишите тут ваш код
#
# # Пример использования:
# try:
#     validate_input("")
# except InputValidationError as e:
#     print(f"Caught custom exception: {e}")
#     print(f"Original exception: {e.original_exception}")

### JavaRush
# Переупаковка исключения

# Напишите функцию validate_input, которая принимает строку и проверяет,
# что она не пустая и что ее длина не превышает 10 символов.
# Если строка пустая, запустите ValueError с сообщением "Input cannot be empty".
# Если строка слишком длинная, запустите ValueError с сообщением "Input is too long".
# Затем перехватите это исключение и переупакуйте его в пользовательское исключение InputValidationError, сохранив исходное исключение как причину.

# Напишите тут ваш код

class InputValidationError(Exception):
    def __init__(self, message, original_exception):
        super().__init__(message)
        self.original_exception = original_exception

def validate_input(input_str):
    try:
        if not input_str:
            raise ValueError("Input cannot be empty")
        if len(input_str) > 10:
            raise ValueError("Input is too long")
    except ValueError as e:
        raise InputValidationError("Validation error occurred", e) from e

# Пример использования:
try:
    validate_input("")
except InputValidationError as e:
    print(f"Caught custom exception: {e}")
    print(f"Original exception: {e.original_exception}")

### JavaRush
## Правильное решение:
## Author: JavaRush's team
# class InputValidationError(Exception):
#     def __init__(self, message, original_exception):
#         super().__init__(message)
#         self.original_exception = original_exception
#
# def validate_input(input_str):
#     try:
#         if not input_str:
#             raise ValueError("Input cannot be empty")
#         if len(input_str) > 10:
#             raise ValueError("Input is too long")
#     except ValueError as e:
#         raise InputValidationError("Validation error occurred", e)
#
# # Пример использования:
# try:
#     validate_input("")
# except InputValidationError as e:
#     print(f"Caught custom exception: {e}")
#     print(f"Original exception: {e.original_exception}")