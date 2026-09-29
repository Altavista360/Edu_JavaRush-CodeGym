## Authors: JavaRush's team, CodeGym's team, Altavista360
## Version: 1.0.0

### JavaRush
## Задача: Стек это не так уж и просто
## Ссылка: https://javarush.com/tasks/ru.javarush.python.core.level15.task06

### CodeGym
## Task: Stacks Aren't So Simple
## Link: https://codegym.cc/tasks/en.codegym.python.core.level15.task06

### JavaRush
## Условие:
# Напишите программу, которая реализует стек и демонстрирует его основные свойства: LIFO (Last In, First Out), операции push, pop, и peek. Класс list использовать можно.

### JavaRush
## Требования:
# • Программа должна включать создание класса для стека, который будет реализовывать основные операции стека.
# • Класс стека должен содержать метод push, который добавляет элемент на вершину стека.
# • Класс стека должен содержать метод pop, который удаляет и возвращает элемент с вершины стека. Если стек пуст, метод должен обработать эту ситуацию соответствующим образом (например, выбросить исключение или вернуть специальное значение).
# • Класс стека должен содержать метод peek, который возвращает элемент с вершины стека, не удаляя его. Если стек пуст, метод должен обработать эту ситуацию соответствующим образом.
# • Программа должна демонстрировать порядок работы стека по принципу LIFO (Last In, First Out), показывая, что последний помещенный элемент будет первым изъят.

### JavaRush
## Черновик:
# # Стек это не так уж и просто
#
# # Напишите программу, которая реализует стек и демонстрирует его основные свойства:
# # LIFO (Last In, First Out), операции push, pop, и peek.
#
# class Stack:
#     def __init__(self):
#         self.items = #???
#
#     def is_empty(self):
#         return len(self.items) == 0
#
#     def size(self):
#         return len(self.items)
#
#     # Напишите тут ваш код
#
#
# # Демонстрация работы стека
# stack = Stack()
# print("Стек пуст:", stack.is_empty())
#
# stack.push(1)
# stack.push(2)
# stack.push(3)
# print("Верхний элемент стека:", stack.peek())
#
# print("Выталкивание элемента:", stack.pop())
# print("Выталкивание элемента:", stack.pop())
# print("Верхний элемент стека:", stack.peek())
#
# print("Стек пуст:", stack.is_empty())
# print("Выталкивание элемента:", stack.pop())
# print("Стек пуст:", stack.is_empty())

### JavaRush
# Стек это не так уж и просто

# Напишите программу, которая реализует стек и демонстрирует его основные свойства:
# LIFO (Last In, First Out), операции push, pop, и peek.

class Stack:
    def __init__(self):
        self.items = #???

    def is_empty(self):
        return len(self.items) == 0

    def size(self):
        return len(self.items)

    # Напишите тут ваш код
    def push(self, item):
        self.items.append(item)

    def pop(self):
        if not self.is_empty():
            return self.items.pop()
        return None

    def peek(self):
        if not self.is_empty():
            return self.items[-1]
        return None

# Демонстрация работы стека
stack = Stack()
print("Стек пуст:", stack.is_empty())

stack.push(1)
stack.push(2)
stack.push(3)
print("Верхний элемент стека:", stack.peek())

print("Выталкивание элемента:", stack.pop())
print("Выталкивание элемента:", stack.pop())
print("Верхний элемент стека:", stack.peek())

print("Стек пуст:", stack.is_empty())
print("Выталкивание элемента:", stack.pop())
print("Стек пуст:", stack.is_empty())

### JavaRush
## Правильное решение:
## Author: JavaRush's team
# class Stack:
#     def __init__(self):
#         self.items = []
#
#     def is_empty(self):
#         return len(self.items) == 0
#
#     def push(self, item):
#         self.items.append(item)
#
#     def pop(self):
#         if not self.is_empty():
#             return self.items.pop()
#         return None
#
#     def peek(self):
#         if not self.is_empty():
#             return self.items[-1]
#         return None
#
#     def size(self):
#         return len(self.items)
#
# # Демонстрация работы стека
# stack = Stack()
# print("Стек пуст:", stack.is_empty())
#
# stack.push(1)
# stack.push(2)
# stack.push(3)
# print("Верхний элемент стека:", stack.peek())
#
# print("Выталкивание элемента:", stack.pop())
# print("Выталкивание элемента:", stack.pop())
# print("Верхний элемент стека:", stack.peek())
#
# print("Стек пуст:", stack.is_empty())
# print("Выталкивание элемента:", stack.pop())
# print("Стек пуст:", stack.is_empty())