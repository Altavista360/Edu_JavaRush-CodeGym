## Authors: JavaRush's team, CodeGym's team, Altavista360
## Version: 1.0.0

### JavaRush
## Задача: Чтение всего файла
## Ссылка: https://javarush.com/tasks/ru.javarush.python.core.level12.task03

### CodeGym
## Task: Reading the entire file
## Link: https://codegym.cc/tasks/en.codegym.python.core.level12.task03

### JavaRush
## Условие:
# Напишите программу, которая читает и выводит на экран содержимое файла example.txt полностью.

### JavaRush
## Требования:
# • Программа должна открыть файл example.txt для чтения.
# • Программа должна полностью прочитать содержимое файла example.txt.
# • Программа должна вывести на экран содержимое файла example.txt.
# • Программа должна закрыть файл example.txt после завершения чтения.

### JavaRush
## Черновик:
# # Чтение всего файла
#
# # Напишите программу, которая читает и выводит на экран содержимое файла example.txt полностью.
#
# # Напишите тут ваш код

### JavaRush
# Чтение всего файла

# Напишите программу, которая читает и выводит на экран содержимое файла example.txt полностью.

# Напишите тут ваш код

file = open('example.txt', 'r')

content = file.read()

print(content)

file.close()

### JavaRush
## Правильное решение:
## Author: JavaRush's team
# # Открытие файла в режиме чтения
# file = open('example.txt', 'r')
#
# # Чтение содержимого файла
# content = file.read()
#
# # Вывод содержимого на экран
# print(content)
#
# # Закрытие файла
# file.close()