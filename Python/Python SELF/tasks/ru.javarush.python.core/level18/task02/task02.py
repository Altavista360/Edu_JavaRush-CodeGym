## Authors: JavaRush's team, CodeGym's team, Altavista360
## Version: 1.0.0

### JavaRush
## Задача: Снежинка Коха
## Ссылка: https://javarush.com/tasks/ru.javarush.python.core.level18.task02

### CodeGym
## Task: Koch Snowflake
## Link: https://codegym.cc/tasks/en.codegym.python.core.level18.task02

### JavaRush
## Условие:
# Напишите рекурсивный алгоритм для рисования снежинки Коха. Алгоритм должен использовать библиотеку turtle для рисования фрактальной кривой.

### JavaRush
## Требования:
# • Программа должна импортировать библиотеку turtle для создания графического окна и рисования в нем.
# • Программа должна включать рекурсивную функцию koch_curve, которая рисует одну сторону снежинки Коха с определенной длиной и числом рекурсивных уровней.
# • Программа должна включать функцию koch_snowflake, которая вызывает функцию koch_curve для рисования всех трех сторон снежинки Коха.
# • Программа должна настроить графическое окно и холст для рисования с использованием методов turtle, таких как setup, speed, и colormode.
# • Программа должна запускать основной цикл рисования с использованием метода turtle.mainloop(), чтобы отобразить нарисованную снежинку Коха в графическом окне и удерживать его открытым.

### JavaRush
## Черновик:
# # Снежинка Коха
#
# # Напишите рекурсивный алгоритм для рисования снежинки Коха.
# # Алгоритм должен использовать библиотеку turtle для рисования фрактальной кривой.
#
# import turtle
#
# def koch_curve(t, order, size):
# # Напишите тут ваш код
#
# def koch_snowflake(t, order, size):
# # Напишите тут ваш код
#
#
# screen = turtle.Screen()
# t = turtle.Turtle()
# t.speed(0)
#
# order = 3  # глубина фрактала
# size = 300  # Сторона
#
# koch_snowflake(t, order, size)
#
# t.hideturtle()
# screen.mainloop()

### JavaRush
# Снежинка Коха

# Напишите рекурсивный алгоритм для рисования снежинки Коха.
# Алгоритм должен использовать библиотеку turtle для рисования фрактальной кривой.

import turtle

def koch_curve(t, order, size):
# Напишите тут ваш код
    if order == 0:
        t.forward(size)
    else:
        size /= 3
        koch_curve(t, order - 1, size)
        t.left(60)
        koch_curve(t, order - 1, size)
        t.right(120)
        koch_curve(t, order - 1, size)
        t.left(60)
        koch_curve(t, order - 1, size)

def koch_snowflake(t, order, size):
# Напишите тут ваш код
    for _ in range(3):
        koch_curve(t, order, size)
        t.right(120)

screen = turtle.Screen()
t = turtle.Turtle()
t.speed(0)

order = 3  # глубина фрактала
size = 300  # Сторона

koch_snowflake(t, order, size)

t.hideturtle()
screen.mainloop()

### JavaRush
## Правильное решение:
## Author: JavaRush's team
# import turtle
#
#
# def koch_curve(t, order, size):
#     if order == 0:
#         t.forward(size)
#     else:
#         size /= 3
#         koch_curve(t, order - 1, size)
#         t.left(60)
#         koch_curve(t, order - 1, size)
#         t.right(120)
#         koch_curve(t, order - 1, size)
#         t.left(60)
#         koch_curve(t, order - 1, size)
#
#
# def koch_snowflake(t, order, size):
#     for _ in range(3):
#         koch_curve(t, order, size)
#         t.right(120)
#
#
# screen = turtle.Screen()
# t = turtle.Turtle()
# t.speed(0)
#
# order = 3  # You can change the order to see different levels of the fractal
# size = 300  # Adjust the size as needed
#
# koch_snowflake(t, order, size)
#
# t.hideturtle()
# screen.mainloop()