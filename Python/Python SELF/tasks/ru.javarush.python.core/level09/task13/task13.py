## Authors: JavaRush's team, CodeGym's team, Altavista360
## Version: 1.0.0

### JavaRush
## Задача: Домашние животные.
## Ссылка: https://javarush.com/tasks/ru.javarush.python.core.level09.task13

### CodeGym
## Task: Pets.
## Link: https://codegym.cc/tasks/en.codegym.python.core.level09.task13

### JavaRush
## Условие:
# Напишите функцию check_type для проверки, является ли переданный объект экземпляром класса Animal или его подклассов. Используйте функцию isinstance() для выполнения проверки. Затем создайте классы Animal, Dog, Cat и проверьте несколько объектов.

### JavaRush
## Требования:
# • Программа должна включать определение класса Animal.
# • Программа должна включать определение класса Dog, который является подклассом Animal.
# • Программа должна включать определение класса Cat, который является подклассом Animal.
# • Программа должна включать функцию check_type, которая использует isinstance() для проверки, является ли переданный объект экземпляром класса Animal или его подклассов.
# • Программа должна проверять несколько объектов с помощью функции check_type и выводить результаты проверки.

### JavaRush
## Черновик:
# # Домашние животные.
#
# # Напишите функцию check_type для проверки, является ли переданный объект экземпляром класса Animal или его подклассов.
# # Используйте функцию isinstance() для выполнения проверки.
# # Затем создайте классы Animal, Dog, Cat и проверьте несколько объектов.
#
# # Напишите тут ваш код

### JavaRush
# Домашние животные.

# Напишите функцию check_type для проверки, является ли переданный объект экземпляром класса Animal или его подклассов.
# Используйте функцию isinstance() для выполнения проверки.
# Затем создайте классы Animal, Dog, Cat и проверьте несколько объектов.

# Напишите тут ваш код

class Animal:
    pass

class Dog(Animal):
    pass

class Cat(Animal):
    pass

def check_type(obj):
    return isinstance(obj, Animal)

dog = Dog()
cat = Cat()
not_animal = "Не животное"

print(check_type(dog))
print(check_type(cat))
print(check_type(not_animal))

### JavaRush
## Правильное решение:
## Author: JavaRush's team
# class Animal:
#     pass
#
# class Dog(Animal):
#     pass
#
# class Cat(Animal):
#     pass
#
# def check_type(obj):
#     return isinstance(obj, Animal)
#
# # Примеры использования:
# dog = Dog()
# cat = Cat()
# not_animal = "Not an animal"
#
# print(check_type(dog))  # True
# print(check_type(cat))  # True
# print(check_type(not_animal))  # False