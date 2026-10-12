## Authors: JavaRush's team, CodeGym's team, Altavista360
## Version: 1.0.0

### JavaRush
## Задача: Хеширование паролей
## Ссылка: https://javarush.com/tasks/ru.javarush.python.core.level16.task17

### CodeGym
## Task: Password Hashing
## Link: https://codegym.cc/tasks/en.codegym.python.core.level16.task17

### JavaRush
## Условие:
# Напишите программу для хеширования паролей. Ваша задача — создать функцию, которая принимает строку пароля и возвращает его хеш-значение.

### JavaRush
## Требования:
# • Программа должна включать функцию, которая принимает в качестве входного параметра строку пароля.
# • Функция должна возвращать хеш-значение входного пароля.
# • Ширование пароля должно быть надежным В программе следует использовать надежный алгоритм хеширования, например SHA-256, для обеспечения безопасности паролей.
# • Хеш-значение должно быть представлено в удобочитаемом виде, например, в виде шестнадцатеричной строки.

### JavaRush
## Черновик:
# # Хеширование паролей
#
# # Напишите программу для хеширования паролей.
# # Ваша задача — создать функцию, которая принимает строку пароля и возвращает его хеш-значение.
#
# def hash_password(password: str) -> str:
# # Напишите тут ваш код
#
#
# # Пример использования:
# password = "my_secure_password"
# hashed_password = hash_password(password)
# print(hashed_password)

### JavaRush
# Хеширование паролей

# Напишите программу для хеширования паролей.
# Ваша задача — создать функцию, которая принимает строку пароля и возвращает его хеш-значение.

def hash_password(password: str) -> str:
# Напишите тут ваш код
    hasher = hashlib.sha256()
    hasher.update(password.encode('utf-8'))
    return hasher.hexdigest()

# Пример использования:
password = "my_secure_password"
hashed_password = hash_password(password)
print(hashed_password)

### JavaRush
## Правильное решение:
## Author: JavaRush's team
# import hashlib
#
# def hash_password(password: str) -> str:
#     # Создаем объект хеширования с алгоритмом SHA-256
#     hasher = hashlib.sha256()
#     # Кодируем пароль в байты и обновляем хешер
#     hasher.update(password.encode('utf-8'))
#     # Возвращаем хеш как шестнадцатеричную строку
#     return hasher.hexdigest()
#
# # Пример использования:
# password = "my_secure_password"
# hashed_password = hash_password(password)
# print(hashed_password)