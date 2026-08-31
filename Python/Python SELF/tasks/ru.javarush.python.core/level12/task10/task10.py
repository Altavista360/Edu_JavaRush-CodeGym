## Authors: JavaRush's team, CodeGym's team, Altavista360
## Version: 1.0.0

### JavaRush
## Задача: Запись бинарных данных
## Ссылка: https://javarush.com/tasks/ru.javarush.python.core.level12.task10

### CodeGym
## Task: Write binary data
## Link: https://codegym.cc/tasks/en.codegym.python.core.level12.task10

### JavaRush
## Условие:
# Напишите программу, которая читает изображение input_image.jpg и записывает его в другой файл output_image.jpg.

### JavaRush
## Требования:
# • Программа должна открыть и прочитать файл изображения с именем input_image.jpg.
# • Программа должна создать новый файл с именем output_image.jpg.
# • Программа должна записать бинарные данные, прочитанные из файла input_image.jpg, в файл output_image.jpg.
# • Программа должна корректно закрыть оба файла после завершения операций чтения и записи.

### JavaRush
## Черновик:
# # Запись бинарных данных
#
# # Напишите программу, которая читает изображение input_image.jpg и записывает его в другой файл output_image.jpg.
#
# # Напишите тут ваш код

### JavaRush
# Запись бинарных данных

# Напишите программу, которая читает изображение input_image.jpg и записывает его в другой файл output_image.jpg.

# Напишите тут ваш код

with open('input_image.jpg', 'rb') as foo:
    image_data = foo.read()

with open('output_image.jpg', 'wb') as bar:
    bar.write(image_data)

### JavaRush
## Правильное решение:
## Author: JavaRush's team
# # Чтение изображения input_image.jpg в бинарном режиме
# with open('input_image.jpg', 'rb') as input_file:
#     image_data = input_file.read()
#
# # Запись данных в новый файл output_image.jpg
# with open('output_image.jpg', 'wb') as output_file:
#     output_file.write(image_data)