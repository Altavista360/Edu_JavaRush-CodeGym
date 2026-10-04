## Authors: JavaRush's team, CodeGym's team, Altavista360
## Version: 1.0.0

### JavaRush
## Задача: Очередь это сложно
## Ссылка: https://javarush.com/tasks/ru.javarush.python.core.level15.task08

### CodeGym
## Task: Queues are tricky
## Link: https://codegym.cc/tasks/en.codegym.python.core.level15.task08

### JavaRush
## Условие:
# Напишите программу, которая реализует очередь и демонстрирует ее основные свойства: FIFO (First In, First Out), операции enqueue, dequeue, и peek. Класс list использовать нельзя.

### JavaRush
## Требования:
# • Программа должна включать класс Queue, который реализует основную функциональность очереди.
# • Класс Queue должен включать метод enqueue, который добавляет элемент в конец очереди.
# • Класс Queue должен включать метод dequeue, который удаляет и возвращает элемент из начала очереди. Если очередь пуста, метод должен обрабатывать эту ситуацию (например, выбрасывать исключение или возвращать специальное значение).
# • Класс Queue должен включать метод peek, который возвращает первый элемент очереди, не удаляя его. Если очередь пуста, метод должен обрабатывать эту ситуацию (например, выбрасывать исключение или возвращать специальное значение).
# • Программа должна реализовывать очередь без использования встроенного типа данных list (вместо этого можно использовать, например, два стека или другие структуры данных).

### JavaRush
## Черновик:
# # Очередь это сложно
#
# # Напишите программу, которая реализует очередь и демонстрирует ее основные свойства:
# # FIFO (First In, First Out), операции enqueue, dequeue, и peek.
#
# # Класс list использовать нельзя.
#
# class Node:
#     def __init__(self, value):
#         self.value = value
#         self.next = None
#
# class Queue:
#     def __init__(self):
#     # инициализация очереди
#
#     def enqueue(self, value):
#     # добавление элемента
#
#     def dequeue(self):
#     # удаление и возвращение элемента
#
#     def peek(self):
#     # возвращение первого элемента без удаления
#
#     def is_empty(self):
#         return self.front is None
#
#     def display(self):
#         current = self.front
#         values = []
#         while current is not None:
#             values.append(current.value)
#             current = current.next
#         return values
#
# # Демонстрация функционирования
# queue = Queue()
# queue.enqueue(1)
# queue.enqueue(2)
# queue.enqueue(3)
# print("Queue after enqueues:", queue.display())
# print("Peek:", queue.peek())
# print("Dequeue:", queue.dequeue())
# print("Queue after dequeue:", queue.display())
# print("Dequeue:", queue.dequeue())
# print("Queue after dequeue:", queue.display())
# print("Dequeue:", queue.dequeue())
# print("Queue after dequeue:", queue.display())

### JavaRush
# Очередь это сложно

# Напишите программу, которая реализует очередь и демонстрирует ее основные свойства:
# FIFO (First In, First Out), операции enqueue, dequeue, и peek.

# Класс list использовать нельзя.

class Node:
    def __init__(self, value):
        self.value = value
        self.next = None

class Queue:
    def __init__(self):
    # инициализация очереди
        self.front = None
        self.rear = None

    def enqueue(self, value):
    # добавление элемента
        node = Node(value)
        if self.rear is None:
            self.front = self.rear = node
        else:
            self.rear.next = node
            self.rear = node

    def dequeue(self):
    # удаление и возвращение элемента
        if self.is_empty():
            raise IndexError("dequeue from empty queue")
        value = self.front.value
        self.front = self.front.next
        if self.front is None:
            self.rear = None
        return value

    def peek(self):
    # возвращение первого элемента без удаления
        if self.is_empty():
            raise IndexError("peek from empty queue")
        return self.front.value

    def is_empty(self):
        return self.front is None

    def display(self):
        current = self.front
        values = []
        while current is not None:
            values.append(current.value)
            current = current.next
        return values

# Демонстрация функционирования
queue = Queue()
queue.enqueue(1)
queue.enqueue(2)
queue.enqueue(3)
print("Queue after enqueues:", queue.display())
print("Peek:", queue.peek())
print("Dequeue:", queue.dequeue())
print("Queue after dequeue:", queue.display())
print("Dequeue:", queue.dequeue())
print("Queue after dequeue:", queue.display())
print("Dequeue:", queue.dequeue())
print("Queue after dequeue:", queue.display())
