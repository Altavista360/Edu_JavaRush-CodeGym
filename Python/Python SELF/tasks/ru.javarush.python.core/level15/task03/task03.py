## Authors: JavaRush's team, CodeGym's team, Altavista360
## Version: 1.0.0

### JavaRush
## Задача: Односвязный список
## Ссылка: https://javarush.com/tasks/ru.javarush.python.core.level15.task03

### CodeGym
## Task: Singly Linked List
## Link: https://codegym.cc/tasks/en.codegym.python.core.level15.task03

### JavaRush
## Условие:
# Напишите программу, которая реализует односвязный список с методами добавления, удаления и поиска элементов. Добавьте несколько элементов в список, удалите один из них и найдите элемент по значению.

### JavaRush
## Требования:
# • Программа должна включать класс Node, который представляет собой узел односвязного списка. Класс должен содержать два атрибута: значение value и указатель на следующий узел next.
# • Программа должна включать класс LinkedList, который реализует односвязный список и содержит методы для добавления, удаления и поиска элементов.
# • Класс LinkedList должен включать метод add(value), который добавляет новый узел с заданным значением в конец списка.
# • Класс LinkedList должен включать метод remove(value), который удаляет первый узел с заданным значением из списка. Если такого узла нет, метод не должен изменять список.
# • Класс LinkedList должен включать метод find(value), который возвращает True, если элемент с заданным значением присутствует в списке, и False в противном случае.

### JavaRush
## Черновик:
# # Односвязный список
#
# # Напишите программу, которая реализует односвязный список с методами добавления, удаления и поиска элементов.
# # Добавьте несколько элементов в список, удалите один из них и найдите элемент по значению.
#
# class Node:
#     def __init__(self, value):
#         self.value = value
#         self.next = None
#
# class LinkedList:
#     def __init__(self):
#         self.head = None
#
#     def add(self, value):
#     # Напишите тут ваш код
#
#     def remove(self, key):
#     # Напишите тут ваш код
#
#     def find(self, key):
#     # Напишите тут ваш код
#
#     def print_list(self):
#         current = self.head
#         while current:
#             print(current.value, end=' -> ')
#             current = current.next
#         print('None')
#
# # Test the LinkedList
# sll = LinkedList()
# sll.add(1)
# sll.add(2)
# sll.add(3)
# sll.print_list()
#
# sll.remove(2)
# sll.print_list()
#
# print(sll.find(3))  # Outputs: True
# print(sll.find(2))  # Outputs: False

### JavaRush
# Односвязный список

# Напишите программу, которая реализует односвязный список с методами добавления, удаления и поиска элементов.
# Добавьте несколько элементов в список, удалите один из них и найдите элемент по значению.

class Node:
    def __init__(self, value):
        self.value = value
        self.next = None

class LinkedList:
    def __init__(self):
        self.head = None

    def add(self, value):
    # Напишите тут ваш код
        new_node = Node(value)
        if not self.head:
            self.head = new_node
        else:
            current = self.head
            while current.next:
                current = current.next
            current.next = new_node

    def remove(self, key):
    # Напишите тут ваш код
        current = self.head
        if current and current.value == value:
            self.head = current.next
            return
        prev = None
        while current and current.value != value:
            prev = current
            current = current.next
        if current:
            prev.next = current.next

    def find(self, key):
    # Напишите тут ваш код
        current = self.head
        while current:
            if current.value == value:
                return True
            current = current.next
        return False

    def print_list(self):
        current = self.head
        while current:
            print(current.value, end=' -> ')
            current = current.next
        print('None')

# Test the LinkedList
sll = LinkedList()
sll.add(1)
sll.add(2)
sll.add(3)
sll.print_list()

sll.remove(2)
sll.print_list()

print(sll.find(3))  # Outputs: True
print(sll.find(2))  # Outputs: False

### JavaRush
## Правильное решение:
## Author: JavaRush's team
# class Node:
#     def __init__(self, value):
#         self.value = value
#         self.next = None
#
# class LinkedList:
#     def __init__(self):
#         self.head = None
#
#     def add(self, value):
#         new_node = Node(value)
#         if not self.head:
#             self.head = new_node
#         else:
#             current = self.head
#             while current.next:
#                 current = current.next
#             current.next = new_node
#
#     def remove(self, value):
#         current = self.head
#         if current and current.value == value:
#             self.head = current.next
#             return
#         prev = None
#         while current and current.value != value:
#             prev = current
#             current = current.next
#         if current:
#             prev.next = current.next
#
#     def find(self, value):
#         current = self.head
#         while current:
#             if current.value == value:
#                 return True
#             current = current.next
#         return False
#
#     def print_list(self):
#         current = self.head
#         while current:
#             print(current.value, end=' -> ')
#             current = current.next
#         print('None')
#
# # Test the LinkedList
# sll = LinkedList()
# sll.add(1)
# sll.add(2)
# sll.add(3)
# sll.print_list()
#
# sll.remove(2)
# sll.print_list()
#
# print(sll.find(3))  # Outputs: True
# print(sll.find(2))  # Outputs: False