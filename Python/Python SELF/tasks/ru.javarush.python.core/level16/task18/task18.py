## Authors: JavaRush's team, CodeGym's team, Altavista360
## Version: 1.0.0

### JavaRush
## Задача: Авторизация
## Ссылка: https://javarush.com/tasks/ru.javarush.python.core.level16.task18

### CodeGym
## Task: Authorization
## Link: https://codegym.cc/tasks/en.codegym.python.core.level16.task18

### JavaRush
## Условие:
# Напишите программу имитации логина пользователей. Программа должна содержать функцию login(email, password) и register(email, password). При регистрации пользователя нужно вызвать функцию register и добавить пользователя в список пользователей. Вместо пароля нужно хранить его hash. При логине пользователя нужно вызвать функцию login где проверить, что hash пароля совпадает с одним из сохраненных хешей.

### JavaRush
## Требования:
# • Программа должна содержать функцию register(email, password), которая добавляет пользователя в список пользователей. Вместо пароля необходимо сохранять его хэш.
# • Программа должна содержать функцию login(email, password), которая проверяет, что хэш пароля совпадает с одним из сохранённых хэшей для входа пользователя.
# • Для хранения пользователей и их хэшированных паролей необходимо использовать соответствующую структуру данных (например, список или словарь).
# • Хэширование пароля должно производиться с использованием безопасного хеш-функции (например, библиотеки hashlib или bcrypt).
# • При вызове функции login, программа должна проверять, существует ли пользователь с указанным email, и если да — проверять правильность введенного пароля путем сравнения хэшей.

### JavaRush
## Черновик:
# # Авторизация
#
# # Напишите программу имитации логина пользователей.
# # Программа должна содержать функцию login(email, password) и register(email, password).
# # При регистрации пользователя нужно вызвать функцию register и добавить пользователя в список пользователей.
# # Вместо пароля нужно хранить его hash.
# # При логине пользователя нужно вызвать функцию login где проверить, что hash пароля совпадает с одним из сохраненных хешей.
#
# users = {}
#
# def hash_password(password):
# # Напишите тут ваш код
#
# def register(email, password):
# # Напишите тут ваш код
#
# def login(email, password):
# # Напишите тут ваш код
#
# # Example usage
# register("user@example.com", "securepassword123")
# login("user@example.com", "securepassword123")
# login("user@example.com", "wrongpassword")

### JavaRush
# Авторизация

# Напишите программу имитации логина пользователей.
# Программа должна содержать функцию login(email, password) и register(email, password).
# При регистрации пользователя нужно вызвать функцию register и добавить пользователя в список пользователей.
# Вместо пароля нужно хранить его hash.
# При логине пользователя нужно вызвать функцию login где проверить, что hash пароля совпадает с одним из сохраненных хешей.
import hashlib

users = {}

def hash_password(password):
# Напишите тут ваш код
    return hashlib.sha256(password.encode()).hexdigest()

def register(email, password):
# Напишите тут ваш код
    hashed_password = hash_password(password)
    users[email] = hashed_password
    print(f"User {email} registered successfully.")

def login(email, password):
# Напишите тут ваш код
    hashed_password = hash_password(password)
    if email in users and users[email] == hashed_password:
        print(f"User {email} logged in successfully.")
    else:
        print("Login failed: Invalid email or password.")

# Example usage
register("user@example.com", "securepassword123")
login("user@example.com", "securepassword123")
login("user@example.com", "wrongpassword")

### JavaRush
## Правильное решение:
## Author: JavaRush's team
# import hashlib
#
# users = {}
#
# def hash_password(password):
#     return hashlib.sha256(password.encode()).hexdigest()
#
# def register(email, password):
#     hashed_password = hash_password(password)
#     users[email] = hashed_password
#     print(f"User {email} registered successfully.")
#
# def login(email, password):
#     hashed_password = hash_password(password)
#     if email in users and users[email] == hashed_password:
#         print(f"User {email} logged in successfully.")
#     else:
#         print("Login failed: Invalid email or password.")
#
# # Example usage
# register("user@example.com", "securepassword123")
# login("user@example.com", "securepassword123")
# login("user@example.com", "wrongpassword")