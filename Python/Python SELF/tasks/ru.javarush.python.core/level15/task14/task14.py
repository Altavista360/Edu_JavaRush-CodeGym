## Authors: JavaRush's team, CodeGym's team, Altavista360
## Version: 1.0.0

### JavaRush
## Задача: Люблю список еще больше
## Ссылка: https://javarush.com/tasks/ru.javarush.python.core.level15.task14

### CodeGym
## Task: Love the list even more
## Link: https://codegym.cc/tasks/en.codegym.python.core.level15.task14

### JavaRush
## Условие:
# Напишите программу, которая создает динамический массив (список) и демонстрирует его основные операции: добавление, удаление, доступ по индексу и изменение элемента. Класс list использовать нельзя.

### JavaRush
## Требования:
# • Программа должна включать определение класса DynamicArray, который будет реализовывать функциональность динамического массива. Этот класс должен включать методы для добавления, удаления элементов, доступа к элементам по индексу и изменения элементов.
# • Класс DynamicArray должен иметь метод add(element), который позволяет добавлять элементы в конец массива.
# • Класс DynamicArray должен иметь метод remove(index), который позволяет удалять элемент из массива по указанному индексу. Если индекс выходит за пределы массива, метод должен обрабатывать эту ситуацию (например, выбрасывать исключение или игнорировать операцию).
# • Класс DynamicArray должен иметь метод get(index), который возвращает элемент массива по указанному индексу. Если индекс выходит за пределы массива, метод должен корректно обрабатывать эту ситуацию.
# • Класс DynamicArray должен иметь метод set(index, element), который изменяет элемент массива по указанному индексу на новое значение. Если индекс выходит за пределы массива, метод должен обрабатывать эту ситуацию.

### JavaRush
## Черновик:
# # Люблю список еще больше
#
# # Напишите программу, которая создает динамический массив (список)
# # и демонстрирует его основные операции: добавление, удаление, доступ по индексу и изменение элемента.
# # Класс list использовать нельзя.
#
# class DynamicArray:
#     def __init__(self):
#         self.array = []
#
#     def add(self, element):
#     # Напишите тут ваш код
#
#     def remove(self, index):
#     # Напишите тут ваш код
#
#     def get(self, index):
#     # Напишите тут ваш код
#
#     def set(self, index, element):
#     # Напишите тут ваш код
#
#     def __len__(self):
#         return len(self.array)
#
#     def __str__(self):
#         return str(self.array)
#
#
# # Примеры использования:
# arr = DynamicArray()
# arr.add(1)
# arr.add(2)
# arr.add(3)
# print(arr)  # [1, 2, 3]
#
# arr.remove(2)
# print(arr)  # [1, 2]
#
# print(arr.get(1))  # 2
#
# arr.set(1, 5)
# print(arr)  # [1, 5]
#
# print(len(arr))  # 2

### JavaRush
# Люблю список еще больше

# Напишите программу, которая создает динамический массив (список)
# и демонстрирует его основные операции: добавление, удаление, доступ по индексу и изменение элемента.
# Класс list использовать нельзя.

class DynamicArray:
    def __init__(self):
        self.array = []

    def add(self, element):
    # Напишите тут ваш код
        self.array.append(element)

    def remove(self, index):
    # Напишите тут ваш код
        if 0 <= index < len(self.array):
            self.array.pop(index)

    def get(self, index):
    # Напишите тут ваш код
        if 0 <= index < len(self.array):
            return self.array[index]
        else:
            raise IndexError("Index out of bounds")

    def set(self, index, element):
    # Напишите тут ваш код
        if 0 <= index < len(self.array):
            self.array[index] = element
        else:
            raise IndexError("Index out of bounds")

    def __len__(self):
        return len(self.array)

    def __str__(self):
        return str(self.array)


# Примеры использования:
arr = DynamicArray()
arr.add(1)
arr.add(2)
arr.add(3)
print(arr)  # [1, 2, 3]

arr.remove(2)
print(arr)  # [1, 2]

print(arr.get(1))  # 2

arr.set(1, 5)
print(arr)  # [1, 5]

print(len(arr))  # 2

### JavaRush
## Правильное решение:
## Author: JavaRush's team
# class DynamicArray:
#     def __init__(self):
#         self.array = []
#
#     def add(self, element):
#         self.array.append(element)
#
#     def remove(self, index):
#         if 0 <= index < len(self.array):
#             self.array.pop(index)
#
#     def get(self, index):
#         if 0 <= index < len(self.array):
#             return self.array[index]
#         else:
#             raise IndexError("Index out of bounds")
#
#     def set(self, index, element):
#         if 0 <= index < len(self.array):
#             self.array[index] = element
#         else:
#             raise IndexError("Index out of bounds")
#
#     def __len__(self):
#         return len(self.array)
#
#     def __str__(self):
#         return str(self.array)
#
#
# # Примеры использования:
# arr = DynamicArray()
# arr.add(1)
# arr.add(2)
# arr.add(3)
# print(arr)  # [1, 2, 3]
#
# arr.remove(2)
# print(arr)  # [1, 2]
#
# print(arr.get(1))  # 2
#
# arr.set(1, 5)
# print(arr)  # [1, 5]
#
# print(len(arr))  # 2