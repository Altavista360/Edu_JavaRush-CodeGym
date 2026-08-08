## Authors: JavaRush's team, CodeGym's team, Altavista360
## Version: 1.0.0

### JavaRush
## Задача: Полиморфизм.
## Ссылка: https://javarush.com/tasks/ru.javarush.python.core.level09.task11

### CodeGym
## Task: Polymorphism.
## Link: https://codegym.cc/tasks/en.codegym.python.core.level09.task11

### JavaRush
## Условие:
# Создайте базовый класс Shape с методом area, который будет возвращать площадь фигуры. Затем создайте дочерние классы Circle и Rectangle, которые будут переопределять метод area для расчета площади своих фигур. Используйте полиморфизм, чтобы создать список фигур и вычислить их площади.

### JavaRush
## Требования:
# • Программа должна включать базовый класс Shape, содержащий метод area, который будет возвращать площадь фигуры (возвращаемое значение должно быть определено в дочерних классах).
# • Программа должна включать дочерний класс Circle, который наследует класс Shape и переопределяет метод area для расчета площади круга.
# • Программа должна включать дочерний класс Rectangle, который наследует класс Shape и переопределяет метод area для расчета площади прямоугольника.
# • Программа должна использовать полиморфизм для создания списка объектов типа Shape, включающего объекты классов Circle и Rectangle, и вычисления их площадей.
# • Программа должна включать код для вывода площадей всех фигур, содержащихся в списке объектов типа Shape.

### JavaRush
## Черновик:
# # Полиморфизм.
#
# # Создайте базовый класс Shape с методом area, который будет возвращать площадь фигуры.
# # Затем создайте дочерние классы Circle и Rectangle, которые будут переопределять метод area для расчета площади своих фигур.
# # Используйте полиморфизм, чтобы создать список фигур и вычислить их площади.
#
# import math
#
# class Shape:
#     def area(self):
#         raise NotImplementedError("Subclasses should implement this method!")
#
#
#
# # Напишите тут ваш код
#
#
#
# shapes = [Circle(5), Rectangle(4, 6), Circle(3)]
# areas = [shape.area() for shape in shapes]
#
# for area in areas:
#     print(area)

### JavaRush
# Полиморфизм.

# Создайте базовый класс Shape с методом perimeter, который будет возвращать периметр фигуры.
# Затем создайте дочерние классы Triangle и Rectangle, которые будут переопределять метод perimeter для расчета периметра своих фигур.
# Используйте полиморфизм, чтобы создать список фигур и вычислить их периметры.

class Shape:
    def perimeter(self):
        raise NotImplementedError("Subclasses should implement this method!")



# Напишите тут ваш код
class Triangle(Shape):
    def __init__(self, a, b, c):
        self.a = a
        self.b = b
        self.c = c

    def perimeter(self):
        return self.a + self.b + self.c

class Rectangle(Shape):
    def __init__(self, a, b):
        self.a = a
        self.b = b

    def perimeter(self):
        return self.a * 2 + self.b * 2

shapes = [Triangle(3, 4, 5), Rectangle(4, 6), Triangle(5, 12, 13)]
perimeters = [shape.perimeter() for shape in shapes]

for perimeter in perimeters:
    print(perimeter)


### JavaRush
## Правильное решение:
## Author: JavaRush's team
# import math
#
# class Shape:
#     def area(self):
#         raise NotImplementedError("Subclasses should implement this method!")
#
# class Circle(Shape):
#     def __init__(self, radius):
#         self.radius = radius
#
#     def area(self):
#         return math.pi * self.radius ** 2
#
# class Rectangle(Shape):
#     def __init__(self, width, height):
#         self.width = width
#         self.height = height
#
#     def area(self):
#         return self.width * self.height
#
# shapes = [Circle(5), Rectangle(4, 6), Circle(3)]
# areas = [shape.area() for shape in shapes]
#
# for area in areas:
#     print(area)