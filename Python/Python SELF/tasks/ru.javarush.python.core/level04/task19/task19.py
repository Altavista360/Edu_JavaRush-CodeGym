## Authors: JavaRush's team, CodeGym's team, Altavista360
## Version: 1.0.0

### JavaRush
## Задача: Использование глобальной переменной
## Ссылка: https://javarush.com/tasks/ru.javarush.python.core.level04.task19

### CodeGym
## Task: Using a Global Variable
## Link: https://codegym.cc/tasks/en.codegym.python.core.level04.task19

### JavaRush
## Условие:
# Напишите программу, в которой есть глобальная переменная counter, равная 0. Напишите функцию increment_counter(), которая увеличивает значение этой переменной на 1 каждый раз, когда она вызывается. Затем вызовите эту функцию несколько раз и выведите значение глобальной переменной counter.

### JavaRush
## Требования:
# • Программа должна включать глобальную переменную counter, которой присваивается значение 0.
# • Программа должна содержать функцию increment_counter(), которая увеличивает значение глобальной переменной counter на 1.
# • Функция increment_counter() должна использовать ключевое слово global для изменения значения глобальной переменной counter.
# • Программа должна несколько раз вызывать функцию increment_counter().
# • Программа должна вывести значение глобальной переменной counter после нескольких вызовов функции increment_counter().

### JavaRush
## Черновик:
# # Использование глобальной переменной
#
# # Напишите программу, в которой есть глобальная переменная counter, равная 0.
# # Напишите функцию increment_counter(), которая увеличивает значение этой переменной на 1 каждый раз, когда она вызывается.
# # Затем вызовите эту функцию несколько раз и выведите значение глобальной переменной counter.
#
# # Напишите тут ваш код

### JavaRush
# Использование глобальной переменной

# Напишите программу, в которой есть глобальная переменная counter, равная 0.
# Напишите функцию increment_counter(), которая увеличивает значение этой переменной на 1 каждый раз, когда она вызывается.
# Затем вызовите эту функцию несколько раз и выведите значение глобальной переменной counter.

# Напишите тут ваш код

counter = 0

def increment_counter():
    global counter
    counter += 1

increment_counter()
increment_counter()
increment_counter()
increment_counter()
increment_counter()
print(counter)

### JavaRush
## Правильное решение:
## Author: JavaRush's team
# counter = 0
#
# def increment_counter():
#     global counter
#     counter += 1
#
# # Вызовем функцию несколько раз
# increment_counter()
# increment_counter()
# increment_counter()
#
# # Вывод значения глобальной переменной counter
# print(counter)