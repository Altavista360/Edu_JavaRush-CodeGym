## Authors: JavaRush's team, CodeGym's team, Altavista360
## Version: 1.0.0

### JavaRush
## Задача: Прямоугольники.
## Ссылка: https://javarush.com/tasks/ru.javarush.python.core.level09.task03

### CodeGym
## Task: Rectangles.
## Link: https://codegym.cc/tasks/en.codegym.python.core.level09.task03

### JavaRush
## Условие:
# Создайте класс Rectangle с конструктором, который принимает параметры width и height. Добавьте метод area(), который возвращает площадь прямоугольника. Создайте объект этого класса и вычислите его площадь.

### JavaRush
## Требования:
# • Программа должна включать класс Rectangle, который содержит конструктор с параметрами width и height.
# • В классе Rectangle должен быть метод area(), который возвращает площадь прямоугольника, рассчитанную как произведение ширины и высоты.
# • Необходимо создать объект класса Rectangle с заданными шириной и высотой.
# • С помощью метода area() создаденного объекта необходимо вычислить и вывести площадь прямоугольника.

### JavaRush
## Черновик:
# # Прямоугольники.
#
# # Создайте класс Rectangle с конструктором, который принимает параметры width и height.
# # Добавьте метод area(), который возвращает площадь прямоугольника.
# # Создайте объект этого класса и вычислите его площадь.
#
# # Напишите тут ваш код

### JavaRush
# Прямоугольники.

# Создайте класс Rectangle с конструктором, который принимает параметры width и height.
# Добавьте метод area(), который возвращает площадь прямоугольника.
# Создайте объект этого класса и вычислите его площадь.

# Напишите тут ваш код

class Rectangle:
    def __init__(self, width, height):
        self.width = width
        self.height = height

    def area(self):
        return self.width * self.height

rect = Rectangle(30, 40)
print(rect.area())

### JavaRush
## Правильное решение:
## Author: JavaRush's team
# class Rectangle:
#     def __init__(self, width, height):
#         self.width = width
#         self.height = height
#
#     def area(self):
#         return self.width * self.height
#
# # Создание объекта класса Rectangle
# rect = Rectangle(5, 10)
#
# # Вычисление площади прямоугольника
# print(rect.area())