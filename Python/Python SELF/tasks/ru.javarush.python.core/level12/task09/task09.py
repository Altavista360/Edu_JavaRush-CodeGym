## Authors: JavaRush's team, CodeGym's team, Altavista360
## Version: 1.0.0

### JavaRush
## Задача: Чтение бинарного файла
## Ссылка: https://javarush.com/tasks/ru.javarush.python.core.level12.task09

### CodeGym
## Task: Reading a binary file
## Link: https://codegym.cc/tasks/en.codegym.python.core.level12.task09

### JavaRush
## Условие:
# Напишите программу, которая читает бинарный файл example.bin и выводит его содержимое в консоль в виде байтов.

### JavaRush
## Требования:
# • Программа должна открыть бинарный файл с именем example.bin для чтения.
# • Программа должна читать данные из файла именно как байты, а не как текст или другие типы данных.
# • Программа должна вывести все байты, считанные из файла, в консоль.
# • Программа должна корректно закрыть файл после завершения чтения для освобождения системных ресурсов.

### JavaRush
## Черновик:
# # Чтение бинарного файла
#
# # Напишите программу, которая читает бинарный файл example.bin и выводит его содержимое в консоль в виде байтов.
#
# # Напишите тут ваш код

### JavaRush
# Чтение бинарного файла

# Напишите программу, которая читает бинарный файл example.bin и выводит его содержимое в консоль в виде байтов.

# Напишите тут ваш код

with open('example.bin', 'rb') as foobar:
    binary_data = foobar.read()
    print (binary_data)

### JavaRush
## Правильное решение:
## Author: JavaRush's team
# with open('example.bin', 'rb') as file:
#     content = file.read()
#     print(content)