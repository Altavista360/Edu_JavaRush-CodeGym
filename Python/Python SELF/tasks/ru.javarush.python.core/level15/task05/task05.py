## Authors: JavaRush's team, CodeGym's team, Altavista360
## Version: 1.0.0

### JavaRush
## Задача: Стек это просто
## Ссылка: https://javarush.com/tasks/ru.javarush.python.core.level15.task05

### CodeGym
## Task: Stack is Simple
## Link: https://codegym.cc/tasks/en.codegym.python.core.level15.task05

### JavaRush
## Условие:
# Напишите программу, которая реализует стек и демонстрирует его основные свойства: LIFO (Last In, First Out), операции push, pop, и peek. Класс list использовать можно.

### JavaRush
## Требования:
# • Программа должна включать класс для стека, который будет реализовывать операции push, pop и peek.
# • Программа должна обеспечивать метод push в классе стека, который добавляет элемент в конец списка (стека).
# • Программа должна обеспечивать метод pop в классе стека, который удаляет и возвращает последний добавленный элемент (верхний элемент стека).
# • Программа должна обеспечивать метод peek в классе стека, который возвращает верхний элемент стека без его удаления.
# • Программа должна демонстрировать принцип работы стека LIFO (Last In, First Out) при выполнении операций push и pop. То есть, последний добавленный элемент должен быть первым, который удаляется.

### JavaRush
## Черновик:
# # Стек это просто
#
# # Напишите программу, которая реализует стек и демонстрирует его основные свойства:
# # LIFO (Last In, First Out), операции push, pop, и peek.
# # Класс list использовать можно.
#
# class Stack:
#     def __init__(self):
#         self.container = []
#
#     def is_empty(self):
#         return len(self.container) == 0
#
#     def size(self):
#         return len(self.container)
#
#     # Напишите тут ваш код
#
#
# # Пример использования стека
# stack = Stack()
# stack.push(1)
# stack.push(2)
# stack.push(3)
# print(stack.peek())  # Output: 3
# print(stack.pop())   # Output: 3
# print(stack.pop())   # Output: 2
# print(stack.size())  # Output: 1
# print(stack.is_empty()) # Output: False
# stack.pop()
# print(stack.is_empty()) # Output: True

### JavaRush
# Стек это просто

# Напишите программу, которая реализует стек и демонстрирует его основные свойства:
# LIFO (Last In, First Out), операции push, pop, и peek.
# Класс list использовать можно.

class Stack:
    def __init__(self):
        self.container = []

    def is_empty(self):
        return len(self.container) == 0

    def size(self):
        return len(self.container)

    # Напишите тут ваш код
    def push(self, item):
        self.container.append(item)

    def pop(self):
        if not self.is_empty():
            return self.container.pop()
        return None

    def peek(self):
        if not self.is_empty():
            return self.container[-1]
        return None

# Пример использования стека
stack = Stack()
stack.push(1)
stack.push(2)
stack.push(3)
print(stack.peek())  # Output: 3
print(stack.pop())   # Output: 3
print(stack.pop())   # Output: 2
print(stack.size())  # Output: 1
print(stack.is_empty()) # Output: False
stack.pop()
print(stack.is_empty()) # Output: True

### JavaRush
## Правильное решение:
## Author: JavaRush's team
# class Stack:
#     def __init__(self):
#         self.container = []
#
#     def push(self, item):
#         self.container.append(item)
#
#     def pop(self):
#         if not self.is_empty():
#             return self.container.pop()
#         return None
#
#     def peek(self):
#         if not self.is_empty():
#             return self.container[-1]
#         return None
#
#     def is_empty(self):
#         return len(self.container) == 0
#
#     def size(self):
#         return len(self.container)
#
# # Пример использования стека
# stack = Stack()
# stack.push(1)
# stack.push(2)
# stack.push(3)
# print(stack.peek())  # Output: 3
# print(stack.pop())   # Output: 3
# print(stack.pop())   # Output: 2
# print(stack.size())  # Output: 1
# print(stack.is_empty()) # Output: False
# stack.pop()
# print(stack.is_empty()) # Output: True