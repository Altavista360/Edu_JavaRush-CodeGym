## Authors: JavaRush's team, CodeGym's team, Altavista360
## Version: 1.0.0

### JavaRush
## Задача: Копирование файла
## Ссылка: https://javarush.com/tasks/ru.javarush.python.core.level12.task11

### CodeGym
## Task: File Copy
## Link: https://codegym.cc/tasks/en.codegym.python.core.level12.task11

### JavaRush
## Условие:
# Напишите программу, которая копирует файл source.txt в файл destination.txt

### JavaRush
## Требования:
# • Программа должна открыть файл source.txt для чтения.
# • Программа должна считать содержимое файла source.txt.
# • Программа должна создать (или открыть для записи) файл с именем destination.txt.
# • Программа должна записать считанное содержимое из файла source.txt в файл destination.txt.
# • Программа должна корректно закрыть оба файла по завершении операций чтения и записи.

### JavaRush
## Черновик:
# # Копирование файла
#
# # Напишите программу, которая копирует файл source.txt в файл destination.txt
#
# # Напишите тут ваш код

### JavaRush
# Копирование файла

# Напишите программу, которая копирует файл source.txt в файл destination.txt

# Напишите тут ваш код

with open('source.txt', 'r') as foo:
    bar = foo.read()

with open('destination.txt', 'w') as baz:
    baz.write(bar)

### JavaRush
## Правильное решение:
## Author: JavaRush's team
# # Открываем исходный файл для чтения в бинарном режиме
# with open('source.txt', 'rb') as source_file:
#     # Читаем содержимое исходного файла
#     content = source_file.read()
#
# # Открываем файл назначения для записи в бинарном режиме
# with open('destination.txt', 'wb') as destination_file:
#     # Записываем содержимое в файл назначения
#     destination_file.write(content)