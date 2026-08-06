## Authors: JavaRush's team, CodeGym's team, Altavista360
## Version: 1.0.0

### JavaRush
## Задача: Фигуры.
## Ссылка: https://javarush.com/tasks/ru.javarush.python.core.level09.task08

### CodeGym
## Task: Shapes.
## Link: https://codegym.cc/tasks/en.codegym.python.core.level09.task08

### JavaRush
## Условие:
# Создайте базовый класс Shape, который будет иметь метод area для вычисления площади. Затем создайте два дочерних класса Rectangle и Circle, которые будут наследовать от Shape и переопределять метод area для вычисления площади прямоугольника и круга соответственно.

### JavaRush
## Требования:
# • Программа должна включать базовый класс Shape, который содержит метод area.
# • Программа должна включать класс Rectangle, который наследует от класса Shape и переопределяет метод area для вычисления площади прямоугольника.
# • Программа должна включать класс Circle, который наследует от класса Shape и переопределяет метод area для вычисления площади круга.

### JavaRush
## Черновик:
# # Фигуры.
#
# # Создайте базовый класс Shape, который будет иметь метод area для вычисления площади.
# # Затем создайте два дочерних класса Rectangle и Circle, которые будут наследовать от Shape
# # и переопределять метод area для вычисления площади прямоугольника и круга соответственно.
#
#
#
# import math
#
# class Shape:
#     def area(self):
#         pass
#
# # Напишите тут ваш код
#
#
#
# # Пример использования
# rect = Rectangle(3, 4)
# print(f"Area of rectangle: {rect.area()}")
#
# circle = Circle(5)
# print(f"Area of circle: {circle.area()}")

### JavaRush
# Фигуры.

# Создайте базовый класс Shape, который будет иметь метод area для вычисления площади.
# Затем создайте два дочерних класса Rectangle и Circle, которые будут наследовать от Shape
# и переопределять метод area для вычисления площади прямоугольника и круга соответственно.



import math

class Shape:
    def area(self):
        pass

# Напишите тут ваш код

class Rectangle(Shape):
    def __init__(self, width, height):
        self.width = width
        self.height = height

    def area(self):
        return self.width * self.height

class Circle(Shape):
    def __init__(self, radius):
        self.radius = radius

    def area(self):
        return math.pi * (self.radius ** 2)

# Пример использования
rect = Rectangle(3, 4)
print(f"Area of rectangle: {rect.area()}")

circle = Circle(5)
print(f"Area of circle: {circle.area()}")

### JavaRush
## Правильное решение:
## Author: JavaRush's team
# import math
#
# class Shape:
#     def area(self):
#         pass
#
# class Rectangle(Shape):
#     def __init__(self, width, height):
#         self.width = width
#         self.height = height
#
#     def area(self):
#         return self.width * self.height
#
# class Circle(Shape):
#     def __init__(self, radius):
#         self.radius = radius
#
#     def area(self):
#         return math.pi * (self.radius ** 2)
#
# # Пример использования
# rect = Rectangle(3, 4)
# print(f"Area of rectangle: {rect.area()}")
#
# circle = Circle(5)
# print(f"Area of circle: {circle.area()}")