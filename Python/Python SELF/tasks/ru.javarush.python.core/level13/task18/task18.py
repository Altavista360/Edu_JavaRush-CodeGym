## Authors: JavaRush's team, CodeGym's team, Altavista360
## Version: 1.0.0

### JavaRush
## Задача: OpenWeatherMap API
## Ссылка: https://javarush.com/tasks/ru.javarush.python.core.level13.task18

### CodeGym
## Task: OpenWeatherMap API
## Link: https://codegym.cc/tasks/en.codegym.python.core.level13.task18

### JavaRush
## Условие:
# Напишите программу, которая использует OpenWeatherMap API для получения текущей погоды в указанном городе.

### JavaRush
## Требования:
# • Программа должна включать механизм для использования API ключа, необходимого для доступа к OpenWeatherMap API.
# • Программа должна принимать название города в качестве входного параметра для выполнения запроса к API.
# • Программа должна отправить запрос к OpenWeatherMap API с использованием названия города и API ключа, чтобы получить текущую погоду.
# • Программа должна обрабатывать ответ от OpenWeatherMap API и проверять наличие ошибок в запросе.
# • Программа должна выводить текущую погоду в указанном городе в удобочитаемом формате.

### JavaRush
## Черновик:
# # OpenWeatherMap API
#
# # Напишите программу, которая использует OpenWeatherMap API для получения текущей погоды в указанном городе.
#
# # Напишите тут ваш код

### JavaRush
# OpenWeatherMap API

# Напишите программу, которая использует OpenWeatherMap API для получения текущей погоды в указанном городе.

# Напишите тут ваш код

import requests

def get_weather(city_name, api_key):
    base_url = "http://api.openweathermap.org/data/2.5/weather"
    params = {
        'q': city_name,
        'appid': api_key,
        'units': 'metric'
    }
    response = requests.get(base_url, params=params)
    if response.status_code == 200:
        weather_data = response.json()
        print(f"Текущая температура в {city_name}: {weather_data['main']['temp']}°C")
        print(f"Описание погоды: {weather_data['weather'][0]['description']}")
    else:
        print(f"Произошла ошибка: {response.status_code} - {response.json()['message']}")

api_key = 'credentials_api_key'
city_name = input("Укажите город: ")
get_weather(city_name, api_key)

### JavaRush
## Правильное решение:
## Author: JavaRush's team
# import requests
#
# def get_weather(city_name, api_key):
#     base_url = "http://api.openweathermap.org/data/2.5/weather"
#     params = {
#         'q': city_name,
#         'appid': api_key,
#         'units': 'metric'  # For temperature in Celsius
#     }
#     response = requests.get(base_url, params=params)
#     if response.status_code == 200:
#         weather_data = response.json()
#         print(f"Current temperature in {city_name}: {weather_data['main']['temp']}°C")
#         print(f"Weather description: {weather_data['weather'][0]['description']}")
#     else:
#         print(f"Error: {response.status_code} - {response.json()['message']}")
#
# # Replace 'your_api_key' with your actual OpenWeatherMap API key
# api_key = 'your_api_key'
# city_name = input("Enter the city name: ")
# get_weather(city_name, api_key)