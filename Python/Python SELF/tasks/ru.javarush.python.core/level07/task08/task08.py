## Authors: JavaRush's team, CodeGym's team, Altavista360
## Version: 1.0.0

### JavaRush
## Задача: Лига Плюща
## Ссылка: https://javarush.com/tasks/ru.javarush.python.core.level07.task08

### CodeGym
## Task: Ivy League
## Link: https://codegym.cc/tasks/en.codegym.python.core.level07.task08

### JavaRush
## Условие:
# Напишите программу, которая создает словарь с информацией о студенте (имя, возраст, университет). Программа должна: Проверить наличие значения "MIT" с использованием метода values(). Проверить наличие значения "Harvard" с использованием функции set(). Проверить наличие значения 22 с использованием генератора.

### JavaRush
## Требования:
# • Программа должна создать словарь с ключами "name", "age" и "university" и заполнить их соответствующими значениями.
# • Программа должна использовать метод values() для проверки, содержится ли значение "MIT" в словаре.
# • Программа должна конвертировать значения словаря в множество с помощью функции set() и проверить, содержится ли значение "Harvard" в этом множестве.
# • Программа должна использовать генератор для проверки, содержится ли в значениях словаря значение 22.

### JavaRush
## Черновик:
# # Лига Плюща
#
# # Напишите программу, которая создает словарь с информацией о студенте (имя, возраст, университет).
# # Программа должна:
# # Проверить наличие значения "MIT" с использованием метода values().
# # Проверить наличие значения "Harvard" с использованием функции set().
# # Проверить наличие значения 22 с использованием генератора.
#
# # Напишите тут ваш код

### JavaRush
# Лига Плюща

# Напишите программу, которая создает словарь с информацией о студенте (имя, возраст, университет).
# Программа должна:
# Проверить наличие значения "MIT" с использованием метода values().
# Проверить наличие значения "Harvard" с использованием функции set().
# Проверить наличие значения 22 с использованием генератора.

# Напишите тут ваш код

student_info = {
    "name": "David",
    "age": 22,
    "university": "MIT"
}

contains_mit = "MIT" in student_info.values()
print(f"Contains MIT: {contains_mit}")

contains_harvard = "Harvard" in set(student_info.values())
print(f"Contains Harvard: {contains_harvard}")

contains_22 = any(value == 22 for value in student_info.values())
print(f"Contains 22: {contains_22}")

### JavaRush
## Правильное решение:
## Author: JavaRush's team
# # Создание словаря с информацией о студенте
# student_info = {
#     "name": "John Doe",
#     "age": 22,
#     "university": "MIT"
# }
#
# # Проверка наличия значения "MIT" с использованием метода values()
# contains_mit = "MIT" in student_info.values()
# print(f"Contains MIT: {contains_mit}")
#
# # Проверка наличия значения "Harvard" с использованием функции set()
# contains_harvard = "Harvard" in set(student_info.values())
# print(f"Contains Harvard: {contains_harvard}")
#
# # Проверка наличия значения 22 с использованием генератора
# contains_22 = any(value == 22 for value in student_info.values())
# print(f"Contains 22: {contains_22}")