## Authors: JavaRush's team, CodeGym's team, Altavista360
## Version: 1.0.0

### JavaRush
## Задача: Ошибка работы с типом.
## Ссылка: https://javarush.com/tasks/ru.javarush.python.core.level10.task02

### CodeGym
## Task: Type Error.
## Link: https://codegym.cc/tasks/en.codegym.python.core.level10.task02

### JavaRush
## Условие:
# Напиши программу, которая создает исключение TypeError

### JavaRush
## Требования:
# • Программа должна создать и вызвать исключение TypeError.

### JavaRush
## Черновик:
# # Ошибка работы с типом.
#
# # Напиши программу, которая создает исключение TypeError
#
# # Напишите тут ваш код

### JavaRush
# Ошибка работы с типом.

# Напиши программу, которая создает исключение TypeError

# Напишите тут ваш код

def cause_type_error():
    result = "qwerty" + 123

cause_type_error()

### JavaRush
## Правильное решение:
## Author: JavaRush's team
# # Создание исключения TypeError путем попытки прибавить число к строке
#
# def cause_type_error():
#     result = "string" + 5
#
# cause_type_error()