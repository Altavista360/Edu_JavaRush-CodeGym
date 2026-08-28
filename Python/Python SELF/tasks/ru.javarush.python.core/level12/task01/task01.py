## Authors: JavaRush's team, CodeGym's team, Altavista360
## Version: 1.0.0

### JavaRush
## Задача: Чтение файла.
## Ссылка: https://javarush.com/tasks/ru.javarush.python.core.level12.task01

### CodeGym
## Task: Reading a file.
## Link: https://codegym.cc/tasks/en.codegym.python.core.level12.task01

### JavaRush
## Условие:
# Напишите программу, которая открывает файл example.txt для чтения, читает его содержимое и выводит его на экран. После этого закройте файл.

### JavaRush
## Требования:
# • Программа должна открыть файл example.txt в режиме чтения.
# • Программа должна считать всё содержимое файла example.txt.
# • Программа должна вывести считанное содержимое файла example.txt на экран.
# • Программа должна закрыть файл example.txt после чтения.

### JavaRush
## Черновик:
# # Чтение файла.
#
# # Напишите программу, которая открывает файл example.txt для чтения, читает его содержимое и выводит его на экран.
# # После этого закройте файл.
#
# # Напишите тут ваш код

### JavaRush
# Чтение файла.

# Напишите программу, которая открывает файл example.txt для чтения, читает его содержимое и выводит его на экран.
# После этого закройте файл.

# Напишите тут ваш код

file = open('example.txt', 'r')
content = file.read()
print(content)
file.close()

### JavaRush
## Правильное решение:
## Author: JavaRush's team
# # Открытие файла
# file = open('example.txt', 'r')
#
# # Чтение содержимого файла
# content = file.read()
# print(content)
#
# # Закрытие файла
# file.close()