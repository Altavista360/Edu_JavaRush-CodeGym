## Authors: JavaRush's team, CodeGym's team, Altavista360
## Version: 1.0.0

### JavaRush
## Задача: Животный мир.
## Ссылка: https://javarush.com/tasks/ru.javarush.python.core.level09.task12

### CodeGym
## Task: Animal World.
## Link: https://codegym.cc/tasks/en.codegym.python.core.level09.task12

### JavaRush
## Условие:
# Создайте базовый класс Animal с методом make_sound, который будет возвращать строку "Ууууууу!". Затем создайте дочерние классы Dog и Cat, которые будут переопределять метод make_sound и использовать super() для вызова метода родительского класса.

### JavaRush
## Требования:
# • Программа должна включать базовый класс Animal с методом make_sound, который возвращает строку "Ууууууу!".
# • Программа должна включать дочерний класс Dog, который переопределяет метод make_sound и использует super() для вызова метода родительского класса.
# • Программа должна включать дочерний класс Cat, который переопределяет метод make_sound и использует super() для вызова метода родительского класса.

### JavaRush
## Черновик:
# # Животный мир.
#
# # Создайте базовый класс Animal с методом make_sound, который будет возвращать строку "Ууууууу!".
# # Затем создайте дочерние классы Dog и Cat, которые будут переопределять метод make_sound
# # и использовать super() для вызова метода родительского класса.
#
# # Напишите тут ваш код
#
#
#
#
#
#
# # Примеры использования:
# dog = Dog()
# cat = Cat()
#
# print(dog.make_sound())  # Ууууууу! Гав-гав!
# print(cat.make_sound())  # Ууууууу! Мяу-мяу!

### JavaRush
# Животный мир.

# Создайте базовый класс Animal с методом make_sound, который будет возвращать строку "Ууууууу!".
# Затем создайте дочерние классы Dog и Cat, которые будут переопределять метод make_sound
# и использовать super() для вызова метода родительского класса.

# Напишите тут ваш код
class Animal:
    def make_sound(self):
        return "Ууууууу!"

class Dog(Animal):
    def make_sound(self):
        return super().make_sound() + " Гав-гав!"

class Cat(Animal):
    def make_sound(self):
        return super().make_sound() + " Мяу-мяу!"





# Примеры использования:
dog = Dog()
cat = Cat()

print(dog.make_sound())  # Ууууууу! Гав-гав!
print(cat.make_sound())  # Ууууууу! Мяу-мяу!

### JavaRush
## Правильное решение:
## Author: JavaRush's team
# class Animal:
#     def make_sound(self):
#         return "Ууууууу!"
#
# class Dog(Animal):
#     def make_sound(self):
#         return super().make_sound() + " Гав-гав!"
#
# class Cat(Animal):
#     def make_sound(self):
#         return super().make_sound() + " Мяу-мяу!"
#
# # Примеры использования:
# dog = Dog()
# cat = Cat()
#
# print(dog.make_sound())  # Ууууууу! Гав-гав!
# print(cat.make_sound())  # Ууууууу! Мяу-мяу!