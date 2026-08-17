## Authors: JavaRush's team, CodeGym's team, Altavista360
## Version: 1.0.0

### JavaRush
## Задача: Пользовательское исключение
## Ссылка: https://javarush.com/tasks/ru.javarush.python.core.level10.task13

### CodeGym
## Task: Custom Exception
## Link: https://codegym.cc/tasks/en.codegym.python.core.level10.task13

### JavaRush
## Условие:
# Создайте пользовательское исключение InvalidAgeError, которое будет вызываться в функции check_age, если возраст меньше 0 или больше 150. Обработайте это исключение в блоке try-except.

### JavaRush
## Требования:
# • Программа должна включать определение пользовательского исключения InvalidAgeError.
# • Программа должна включать функцию check_age, которая проверяет, чтобы возраст был в пределах от 0 до 150.
# • Функция check_age должна выбрасывать исключение InvalidAgeError, если возраст меньше 0 или больше 150.
# • Программа должна включать блок try-except для обработки исключения InvalidAgeError, выброшенного функцией check_age.

### JavaRush
## Черновик:
# # Пользовательское исключение
#
# # Создайте пользовательское исключение InvalidAgeError, которое будет вызываться в функции check_age,
# # если возраст меньше 0 или больше 150. Обработайте это исключение в блоке try-except.
#
# # Напишите тут ваш код
#
# try:
#     age = int(input("Enter your age: "))
#     check_age(age)
#     print("Age is valid.")
# except InvalidAgeError as e:
#     print(e)
# except ValueError:
#     print("Please enter a valid integer for age.")

### JavaRush
# Пользовательское исключение

# Создайте пользовательское исключение InvalidAgeError, которое будет вызываться в функции check_age,
# если возраст меньше 0 или больше 150. Обработайте это исключение в блоке try-except.

# Напишите тут ваш код

class InvalidAgeError(Exception):
    pass

def check_age(age):
    if age < 0 or age > 150:
        raise InvalidAgeError(f"Invalid age: {age}")

try:
    age = int(input("Enter your age: "))
    check_age(age)
    print("Age is valid.")
except InvalidAgeError as e:
    print(e)
except ValueError:
    print("Please enter a valid integer for age.")

### JavaRush
## Правильное решение:
## Author: JavaRush's team
# class InvalidAgeError(Exception):
#     pass
#
# def check_age(age):
#     if age < 0 or age > 150:
#         raise InvalidAgeError(f"Invalid age: {age}")
#
# try:
#     age = int(input("Enter your age: "))
#     check_age(age)
#     print("Age is valid.")
# except InvalidAgeError as e:
#     print(e)
# except ValueError:
#     print("Please enter a valid integer for age.")