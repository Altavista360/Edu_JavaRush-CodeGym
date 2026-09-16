## Authors: JavaRush's team, CodeGym's team, Altavista360
## Version: 1.0.0

### JavaRush
## Задача: Google Cloud Vision API
## Ссылка: https://javarush.com/tasks/ru.javarush.python.core.level13.task20

### CodeGym
## Task: Google Cloud Vision API
## Link: https://codegym.cc/tasks/en.codegym.python.core.level13.task20

### JavaRush
## Условие:
# Напишите программу, которая использует Google Cloud Vision API для анализа изображения и распознавания объектов.

### JavaRush
## Требования:
# • Программа должна использовать Google Cloud Vision API для анализа изображения и распознавания объектов.
# • Программа должна предусматривать возможность загрузки изображения, которое будет анализироваться.
# • Программа должна посылать запросы к Google Cloud Vision API с изображением для анализа.
# • Программа должна получать результаты анализа от Google Cloud Vision API и отображать распознанные объекты пользователю.

### JavaRush
## Черновик:
# # Google Cloud Vision API
#
# # Напишите программу, которая использует Google Cloud Vision API для анализа изображения и распознавания объектов.
#
# # Напишите тут ваш код

### JavaRush
# Google Cloud Vision API

# Напишите программу, которая использует Google Cloud Vision API для анализа изображения и распознавания объектов.

# Напишите тут ваш код

from google.cloud import vision
import io

def detect_objects(image_path):
    # Create a client
    client = vision.ImageAnnotatorClient()

    # Load the image
    with io.open(image_path, 'rb') as image_file:
        content = image_file.read()

    image = vision.Image(content=content)

    # Perform object detection
    response = client.object_localization(image=image)
    localized_object_annotations = response.localized_object_annotations

    # Print the results
    print('Objects detected:')
    for obj in localized_object_annotations:
        print(f'\n{obj.name} (confidence: {obj.score})')
        print('Bounding polygon vertices:')
        for vertex in obj.bounding_poly.normalized_vertices:
            print(f' - ({vertex.x}, {vertex.y})')

    if response.error.message:
        raise Exception(f'{response.error.message}')


image_path = 'path_to_your_image.jpg'
detect_objects(image_path)

### JavaRush
## Правильное решение:
## Author: JavaRush's team
# from google.cloud import vision
# import io
#
# def detect_objects(image_path):
#     # Create a client
#     client = vision.ImageAnnotatorClient()
#
#     # Load the image
#     with io.open(image_path, 'rb') as image_file:
#         content = image_file.read()
#
#     image = vision.Image(content=content)
#
#     # Perform object detection
#     response = client.object_localization(image=image)
#     localized_object_annotations = response.localized_object_annotations
#
#     # Print the results
#     print('Objects detected:')
#     for obj in localized_object_annotations:
#         print(f'\n{obj.name} (confidence: {obj.score})')
#         print('Bounding polygon vertices:')
#         for vertex in obj.bounding_poly.normalized_vertices:
#             print(f' - ({vertex.x}, {vertex.y})')
#
#     if response.error.message:
#         raise Exception(f'{response.error.message}')
#
#
# image_path = 'path_to_your_image.jpg'
# detect_objects(image_path)