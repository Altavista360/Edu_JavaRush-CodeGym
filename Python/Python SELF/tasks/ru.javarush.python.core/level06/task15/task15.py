## Authors: JavaRush's team, CodeGym's team, Altavista360
## Version: 1.0.0

### JavaRush
## Задача: Многострочность.
## Ссылка: https://javarush.com/tasks/ru.javarush.python.core.level06.task15

### CodeGym
## Task: Multiline Strings.
## Link: https://codegym.cc/tasks/en.codegym.python.core.level06.task15

### JavaRush
## Условие:
# Напишите программу, которая создает и выводит на экран строки, объявленные различными способами: Строку с использованием одинарных кавычек. Строку с использованием двойных кавычек. Многострочную строку с использованием тройных кавычек.

### JavaRush
## Требования:
# • Программа должна создавать строку, использующую одинарные кавычки для её объявления.
# • Программа должна создавать строку, использующую двойные кавычки для её объявления.
# • Программа должна создавать многострочную строку, используя тройные кавычки для её объявления.
# • Программа должна выводить созданные строки на экран.

### JavaRush
## Черновик:
# # Многострочность.
#
# # Напишите программу, которая создает и выводит на экран строки, объявленные различными способами:
# # Строку с использованием одинарных кавычек.
# # Строку с использованием двойных кавычек.
# # Многострочную строку с использованием тройных кавычек.
#
# # Напишите тут ваш код

### JavaRush
# Многострочность.

# Напишите программу, которая создает и выводит на экран строки, объявленные различными способами:
# Строку с использованием одинарных кавычек.
# Строку с использованием двойных кавычек.
# Многострочную строку с использованием тройных кавычек.

# Напишите тут ваш код

foo = 'Lorem ipsum dolor sit amet, consectetur adipiscing elit.'
bar = "Lorem ipsum dolor sit amet, consectetur adipiscing elit."
baz = """Lorem ipsum dolor sit amet, consectetur adipiscing elit.
Cras ipsum ante, viverra nec elit non, bibendum eleifend metus.
Suspendisse potenti. Vivamus in erat at mauris ornare fringilla.
Maecenas condimentum, massa eu consectetur condimentum,
sem augue pretium tellus, sit amet posuere turpis quam et tortor.
Suspendisse ut eleifend lectus, in tempor mi. Suspendisse mollis
sit amet lacus eu pharetra. Fusce eget est lorem. Etiam consequat
purus risus, eu tincidunt diam tristique quis. Cras eros nibh,
ultrices non pulvinar sed, laoreet id nulla."""
print(foo)
print(bar)
print(baz)

### JavaRush
## Правильное решение:
## Author: JavaRush's team
# # Строка с использованием одинарных кавычек
# single_quote_string = 'Это строка с использованием одинарных кавычек.'
#
# # Строка с использованием двойных кавычек
# double_quote_string = "Это строка с использованием двойных кавычек."
#
# # Многострочная строка с использованием тройных кавычек
# triple_quote_string = """Это многострочная строка
# с использованием тройных кавычек.
# Она может занимать несколько строк."""
#
# print(single_quote_string)
# print(double_quote_string)
# print(triple_quote_string)