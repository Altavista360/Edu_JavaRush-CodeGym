## Authors: JavaRush's team, CodeGym's team, Altavista360
## Version: 1.0.0

### JavaRush
## Задача: Двусвязный список
## Ссылка: https://javarush.com/tasks/ru.javarush.python.core.level15.task04

### CodeGym
## Task: Doubly Linked List
## Link: https://codegym.cc/tasks/en.codegym.python.core.level15.task04

### JavaRush
## Условие:
# Напишите программу, которая реализует двусвязный список с методами добавления, удаления и поиска элементов. Добавьте несколько элементов в список, удалите один из них и найдите элемент по значению.

### JavaRush
## Требования:
# • Программа должна включать класс Node, который имеет атрибуты value для хранения значения узла, prev для хранения ссылки на предыдущий узел и next для хранения ссылки на следующий узел.
# • Программа должна включать класс DoublyLinkedList, который реализует методы добавления, удаления и поиска элементов.
# • Класс DoublyLinkedList должен иметь метод add(value), который добавляет новый узел с заданным значением в конец списка.
# • Класс DoublyLinkedList должен иметь метод remove(value), который удаляет первый найденный узел с заданным значением из списка.
# • Класс DoublyLinkedList должен иметь метод find(value), который возвращает найденный узел с заданным значением. Если узел не найден, метод должен возвращать None.

### JavaRush
## Черновик:
# # Двусвязный список
#
# # Напишите программу, которая реализует двусвязный список с методами добавления, удаления и поиска элементов.
# # Добавьте несколько элементов в список, удалите один из них и найдите элемент по значению.
#
# class Node:
#     def __init__(self, value):
#         self.value = value
#         self.prev = None
#         self.next = None
#
# class DoublyLinkedList:
#     def __init__(self):
#         self.head = None
#         self.tail = None
#
#     def add(self, value):
#     # Напишите тут ваш код
#
#
#     def remove(self, value):
#     # Напишите тут ваш код
#
#
#     def find(self, value):
#     # Напишите тут ваш код
#
#
#     def display(self):
#         elements = []
#         current = self.head
#         while current:
#             elements.append(current.value)
#             current = current.next
#         return elements
#
# # Демонстрация работы
# dll = DoublyLinkedList()
# dll.add(1)
# dll.add(2)
# dll.add(3)
# print("Список после добавления элементов:", dll.display())
# dll.remove(2)
# print("Список после удаления элемента 2:", dll.display())
# result = dll.find(3)
# print("Поиск элемента 3:", result.value if result else "Не найден")

### JavaRush
# Двусвязный список

# Напишите программу, которая реализует двусвязный список с методами добавления, удаления и поиска элементов.
# Добавьте несколько элементов в список, удалите один из них и найдите элемент по значению.

class Node:
    def __init__(self, value):
        self.value = value
        self.prev = None
        self.next = None

class DoublyLinkedList:
    def __init__(self):
        self.head = None
        self.tail = None

    def add(self, value):
    # Напишите тут ваш код
        new_node = Node(value)
        if self.head is None:
            self.head = self.tail = new_node
        else:
            self.tail.next = new_node
            new_node.prev = self.tail
            self.tail = new_node

    def remove(self, value):
    # Напишите тут ваш код
        current = self.head
        while current:
            if current.value == value:
                if current.prev:
                    current.prev.next = current.next
                if current.next:
                    current.next.prev = current.prev
                if current == self.head:
                    self.head = current.next
                if current == self.tail:
                    self.tail = current.prev
                return
            current = current.next

    def find(self, value):
    # Напишите тут ваш код
        current = self.head
        while current:
            if current.value == value:
                return current
            current = current.next
        return None

    def display(self):
        elements = []
        current = self.head
        while current:
            elements.append(current.value)
            current = current.next
        return elements

# Демонстрация работы
dll = DoublyLinkedList()
dll.add(1)
dll.add(2)
dll.add(3)
print("Список после добавления элементов:", dll.display())
dll.remove(2)
print("Список после удаления элемента 2:", dll.display())
result = dll.find(3)
print("Поиск элемента 3:", result.value if result else "Не найден")

### JavaRush
## Правильное решение:
## Author: JavaRush's team
# class Node:
#     def __init__(self, value):
#         self.value = value
#         self.prev = None
#         self.next = None
#
# class DoublyLinkedList:
#     def __init__(self):
#         self.head = None
#         self.tail = None
#
#     def add(self, value):
#         new_node = Node(value)
#         if self.head is None:
#             self.head = self.tail = new_node
#         else:
#             self.tail.next = new_node
#             new_node.prev = self.tail
#             self.tail = new_node
#
#     def remove(self, value):
#         current = self.head
#         while current:
#             if current.value == value:
#                 if current.prev:
#                     current.prev.next = current.next
#                 if current.next:
#                     current.next.prev = current.prev
#                 if current == self.head:
#                     self.head = current.next
#                 if current == self.tail:
#                     self.tail = current.prev
#                 return
#             current = current.next
#
#     def find(self, value):
#         current = self.head
#         while current:
#             if current.value == value:
#                 return current
#             current = current.next
#         return None
#
#     def display(self):
#         elements = []
#         current = self.head
#         while current:
#             elements.append(current.value)
#             current = current.next
#         return elements
#
# # Демонстрация работы
# dll = DoublyLinkedList()
# dll.add(1)
# dll.add(2)
# dll.add(3)
# print("Список после добавления элементов:", dll.display())
# dll.remove(2)
# print("Список после удаления элемента 2:", dll.display())
# result = dll.find(3)
# print("Поиск элемента 3:", result.value if result else "Не найден")