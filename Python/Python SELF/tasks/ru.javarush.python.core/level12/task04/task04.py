## Authors: JavaRush's team, CodeGym's team, Altavista360
## Version: 1.0.0

### JavaRush
## Задача: Итерация по строкам файла
## Ссылка: https://javarush.com/tasks/ru.javarush.python.core.level12.task04

### CodeGym
## Task: Iterate over file lines
## Link: https://codegym.cc/tasks/en.codegym.python.core.level12.task04

### JavaRush
## Условие:
# Напишите программу, которая читает файл example.txt построчно, используя итератор, и выводит каждую строку на экран.

### JavaRush
## Требования:
# • Программа должна использовать итератор для чтения файла example.txt построчно.
# • Программа должна открыть файл example.txt для чтения.
# • Программа должна выводить каждую строку файла example.txt на экран.
# • Программа должна закрывать файл example.txt после завершения чтения.

### JavaRush
## Черновик:
# # Итерация по строкам файла
#
# # Напишите программу, которая читает файл example.txt построчно, используя итератор, и выводит каждую строку на экран.
#
# # Напишите тут ваш код

### JavaRush
# Итерация по строкам файла

# Напишите программу, которая читает файл example.txt построчно, используя итератор, и выводит каждую строку на экран.

# Напишите тут ваш код

file = open('example.txt', 'r')

for line in file:
    print(line, end='')

file.close()

### JavaRush
## Правильное решение:
## Author: JavaRush's team
# # Открытие файла в режиме чтения
# file = open('example.txt', 'r')
#
# # Чтение файла построчно и вывод содержимого
# for line in file:
#     print(line, end='')
#
# # Закрытие файла
# file.close()