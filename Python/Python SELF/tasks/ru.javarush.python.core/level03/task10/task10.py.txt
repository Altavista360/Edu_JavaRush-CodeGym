## Authors: JavaRush's team, CodeGym's team, Altavista360
## Version: 1.0.0

### JavaRush
## Задача: Конвертация температуры с комментариями
## Ссылка: https://javarush.com/tasks/ru.javarush.python.core.level03.task10

### CodeGym
## Task: Temperature Conversion with Comments
## Link: https://codegym.cc/tasks/en.codegym.python.core.level03.task10

### JavaRush
## Условие:
# Комментарии опять перемешались - расставь их правильно.

### CodeGym
## Condition:
# The comments got mixed up again - arrange them correctly.

### JavaRush
## Требования:
# • Комментарий про "Запрашиваем у пользователя температуру" должен относиться к функции input()
# • Комментарий про "Конвертируем температуру" должен относиться к формуле преобразования
# • Комментарий про "Формула для конвертации" должен относиться к формуле преобразования
# • Комментарий про "Выводим результат" должен относиться к функции print()

### CodeGym
## Requirements:
# • The comment about "Asking the user for temperature" should be related to the input() function.
# • The comment about "Converting temperature" should be related to the conversion formula.
# • The comment about "Conversion formula" should be related to the conversion formula.
# • The comment about "Displaying the result" should be related to the print() function.

### JavaRush
## Черновик:
# # Конвертация температуры с комментариями
# 
# # Комментарии опять перемешались - расставь их правильно.
# 
# # Конвертируем температуру в градусы Фаренгейта
# celsius = float(input("Введите температуру в градусах Цельсия: "))
# 
# # Выводим результат
# # Запрашиваем у пользователя температуру в градусах Цельсия
# fahrenheit = (celsius * 9/5) + 32
# 
# # Формула для конвертации: F = (C * 9/5) + 32
# print("Температура в градусах Фаренгейта:", fahrenheit)

### CodeGym
## Draft:
# # Temperature Conversion with Comments
#
# # The comments got mixed up again - arrange them correctly.
#
# # Converting temperature to Fahrenheit
# celsius = float(input("Enter the temperature in Celsius: "))
#
# # Displaying the result
# # Asking the user for temperature in Celsius
# fahrenheit = (celsius * 9/5) + 32
#
# # Conversion formula: F = (C * 9/5) + 32
# print("Temperature in Fahrenheit:", fahrenheit)

### JavaRush
# Конвертация температуры с комментариями

# Комментарии опять перемешались - расставь их правильно.

# Запрашиваем у пользователя температуру в градусах Цельсия
celsius = float(input("Введите температуру в градусах Цельсия: "))

# Конвертируем температуру в градусы Фаренгейта
# Формула для конвертации: F = (C * 9/5) + 32
fahrenheit = (celsius * 9/5) + 32

# Выводим результат
print("Температура в градусах Фаренгейта:", fahrenheit)

### CodeGym
# # Temperature Conversion with Comments
#
# # The comments got mixed up again - arrange them correctly.
#
# # Asking the user for temperature in Celsius
# celsius = float(input("Enter the temperature in Celsius: "))
#
# # Converting temperature to Fahrenheit
# # Conversion formula: F = (C * 9/5) + 32
# fahrenheit = (celsius * 9/5) + 32
#
# # Displaying the result
# print("Temperature in Fahrenheit:", fahrenheit)

### JavaRush
## Правильное решение:
## Author: JavaRush's team
# # Запрашиваем у пользователя температуру в градусах Цельсия
# celsius = float(input("Введите температуру в градусах Цельсия: "))
# 
# # Конвертируем температуру в градусы Фаренгейта
# # Формула для конвертации: F = (C * 9/5) + 32
# fahrenheit = (celsius * 9/5) + 32
# 
# # Выводим результат
# print("Температура в градусах Фаренгейта:", fahrenheit)

### CodeGym
## Correct solution:
## Author: CodeGym's team
# # Asking the user for temperature in Celsius
# celsius = float(input("Enter the temperature in Celsius: "))
#
# # Converting temperature to Fahrenheit
# # Conversion formula: F = (C * 9/5) + 32
# fahrenheit = (celsius * 9/5) + 32
#
# # Displaying the result
# print("Temperature in Fahrenheit:", fahrenheit)