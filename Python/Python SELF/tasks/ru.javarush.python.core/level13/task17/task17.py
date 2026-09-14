## Authors: JavaRush's team, CodeGym's team, Altavista360
## Version: 1.0.0

### JavaRush
## Задача: Google Maps API
## Ссылка: https://javarush.com/tasks/ru.javarush.python.core.level13.task17

### CodeGym
## Task: Google Maps API
## Link: https://codegym.cc/tasks/en.codegym.python.core.level13.task17

### JavaRush
## Условие:
# Напишите программу, которая использует Google Maps API для получения координат (широта и долгота) по указанному адресу.

### JavaRush
## Требования:
# • Программа должна включать переменную для хранения ключа API, необходимого для использования Google Maps API.
# • Программа должна отправлять HTTP-запрос к Google Maps API, используя введенный адрес для получения координат.
# • Программа должна корректно обрабатывать ответ от API, извлекая координаты (широту и долготу) из JSON-формата.
# • Программа должна выводить пользователю координаты (широту и долготу) в удобочитаемом формате.

### JavaRush
## Черновик:
# # Google Maps API
#
# # Напишите программу, которая использует Google Maps API для получения координат (широта и долгота) по указанному адресу.
#
# # Напишите тут ваш код

### JavaRush
# Google Maps API

# Напишите программу, которая использует Google Maps API для получения координат (широта и долгота) по указанному адресу.

# Напишите тут ваш код

import requests

def get_coordinates(address, api_key):
    base_url = "https://maps.googleapis.com/maps/api/geocode/json"
    params = {
        "address": address,
        "key": api_key
    }
    response = requests.get(base_url, params=params)
    if response.status_code == 200:
        data = response.json()
        if data['status'] == 'OK':
            location = data['results'][0]['geometry']['location']
            return location['lat'], location['lng']
        else:
            print(f"Произошла ошибка: {data['status']}")
    else:
        print(f"Не удалось подключиться к API, код состояния: {response.status_code}")

API_KEY = 'CREDENTIALS_API_KEY'
address = "1600 Pennsylvania Ave NW, Washington, DC 20500, USA"
latitude, longitude = get_coordinates(address, API_KEY)
print(f"Координаты по адресу '{address}': Широта = {latitude}, Долгота = {longitude}")

### JavaRush
## Правильное решение:
## Author: JavaRush's team
# import requests
#
# def get_coordinates(address, api_key):
#     base_url = "https://maps.googleapis.com/maps/api/geocode/json"
#     params = {
#         "address": address,
#         "key": api_key
#     }
#     response = requests.get(base_url, params=params)
#     if response.status_code == 200:
#         data = response.json()
#         if data['status'] == 'OK':
#             location = data['results'][0]['geometry']['location']
#             return location['lat'], location['lng']
#         else:
#             print(f"Error: {data['status']}")
#     else:
#         print(f"Failed to connect to the API, status code: {response.status_code}")
#
# # Replace 'YOUR_API_KEY' with your actual Google Maps API key
# API_KEY = 'YOUR_API_KEY'
# address = "1600 Amphitheatre Parkway, Mountain View, CA"
# latitude, longitude = get_coordinates(address, API_KEY)
# print(f"Coordinates for '{address}': Latitude = {latitude}, Longitude = {longitude}")