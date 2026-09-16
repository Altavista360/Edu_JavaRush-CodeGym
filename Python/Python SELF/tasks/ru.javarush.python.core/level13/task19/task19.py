## Authors: JavaRush's team, CodeGym's team, Altavista360
## Version: 1.0.0

### JavaRush
## Задача: API от OpenAI
## Ссылка: https://javarush.com/tasks/ru.javarush.python.core.level13.task19

### CodeGym
## Task: OpenAI API
## Link: https://codegym.cc/tasks/en.codegym.python.core.level13.task19

### JavaRush
## Условие:
# Напишите программу, которая использует OpenAI API для получения ответа от модели ChatGPT.

### JavaRush
## Требования:
# • Программа должна включать использование OpenAI API для отправки запроса к модели ChatGPT.
# • Программа должна предусматривать ввод и использование API-ключа для аутентификации пользователя при обращении к OpenAI API.
# • Программа должна отправлять запрос с текстом сообщения пользователя к модели ChatGPT через OpenAI API.
# • Программа должна получать ответ от модели ChatGPT и выводить его пользователю.

### JavaRush
## Черновик:
# # API от OpenAI
#
# # Напишите программу, которая использует OpenAI API для получения ответа от модели ChatGPT.
#
# # Напишите тут ваш код

### JavaRush
# API от OpenAI

# Напишите программу, которая использует OpenAI API для получения ответа от модели ChatGPT.

# Напишите тут ваш код

import openai

def get_openai_response(api_key, prompt):
    openai.api_key = api_key
    response = openai.Completion.create(
        engine="text-davinci-003",
        prompt=prompt,
        max_tokens=150
    )
    return response.choices[0].text.strip()

api_key = input("Введите API-ключ: ")
prompt = input("Введите промт: ")
response = get_openai_response(api_key, prompt)
print("Ответ: ")
print(response)

### JavaRush
## Правильное решение:
## Author: JavaRush's team
# import openai
#
# def get_openai_response(api_key, prompt):
#     openai.api_key = api_key
#     response = openai.Completion.create(
#         engine="text-davinci-003",
#         prompt=prompt,
#         max_tokens=150
#     )
#     return response.choices[0].text.strip()
#
# api_key = input("Введите ваш API-ключ OpenAI: ")
# prompt = input("Введите ваш запрос для модели ChatGPT: ")
# response = get_openai_response(api_key, prompt)
# print("Ответ от модели ChatGPT:")
# print(response)