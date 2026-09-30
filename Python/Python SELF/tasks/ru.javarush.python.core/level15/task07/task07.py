## Authors: JavaRush's team, CodeGym's team, Altavista360
## Version: 1.0.0

### JavaRush
## Задача: Очередь это просто
## Ссылка: https://javarush.com/tasks/ru.javarush.python.core.level15.task07

### CodeGym
## Task: Queue is simple
## Link: https://codegym.cc/tasks/en.codegym.python.core.level15.task07

### JavaRush
## Условие:
# Напишите программу, которая реализует очередь и демонстрирует ее основные свойства: FIFO (First In, First Out), операции enqueue, dequeue, и peek. Класс list использовать можно.

### JavaRush
## Требования:
# • Программа должна содержать структуру данных для хранения элементов очереди, используя класс list.
# • Программа должна реализовать метод enqueue, который добавляет элемент в конец очереди.
# • Программа должна реализовать метод dequeue, который удаляет и возвращает первый элемент из очереди. Если очередь пуста, метод должен корректно обрабатывать это исключение.
# • Программа должна реализовать метод peek, который возвращает первый элемент очереди без его удаления. Если очередь пуста, метод должен корректно обрабатывать это исключение.
# • Программа должна демонстрировать правильное поведение очереди, поддерживая принцип FIFO (First In, First Out), т.е. элементы должны удаляться в том порядке, в котором они были добавлены.
# • Программа должна содержать метод или условие для проверки, является ли очередь пустой, и соответствующим образом обрабатывать попытки удалить или просмотреть элементы из пустой очереди.

### JavaRush
## Черновик:
# # Очередь это просто
# # Напишите программу, которая реализует очередь и демонстрирует ее основные свойства:
# # FIFO (First In, First Out), операции enqueue, dequeue, и peek.
# # Класс list использовать можно.
#
# class Queue:
#     def __init__(self):
#         self.queue = []
#
#     def is_empty(self):
#         return len(self.queue) == 0
#
#     def size(self):
#         return len(self.queue)
#
#     def enqueue(self, item):
#         # Напишите тут ваш код
#
#     def dequeue(self):
#     # Напишите тут ваш код
#
#
#     def peek(self):
#     # Напишите тут ваш код
#
#
#
# # Демонстрация работы
# q = Queue()
# q.enqueue(1)
# q.enqueue(2)
# q.enqueue(3)
# q.peek()         # Front item: 1
# q.dequeue()      # Dequeued: 1
# q.dequeue()      # Dequeued: 2
# q.peek()         # Front item: 3
# q.dequeue()      # Dequeued: 3
# q.dequeue()      # Queue is empty

### JavaRush
# Очередь это просто
# Напишите программу, которая реализует очередь и демонстрирует ее основные свойства:
# FIFO (First In, First Out), операции enqueue, dequeue, и peek.
# Класс list использовать можно.

class Queue:
    def __init__(self):
        self.queue = []

    def is_empty(self):
        return len(self.queue) == 0

    def size(self):
        return len(self.queue)

    def enqueue(self, item):
        # Напишите тут ваш код
        self.queue.append(item)
        print(f"Enqueued: {item}")

    def dequeue(self):
        # Напишите тут ваш код
        if not self.is_empty():
            item = self.queue.pop(0)
            print(f"Dequeued: {item}")
            return item
        else:
            print("Queue is empty")
            return None

    def peek(self):
        # Напишите тут ваш код
        if not self.is_empty():
            print(f"Front item: {self.queue[0]}")
            return self.queue[0]
        else:
            print("Queue is empty")
            return None


# Демонстрация работы
q = Queue()
q.enqueue(1)
q.enqueue(2)
q.enqueue(3)
q.peek()         # Front item: 1
q.dequeue()      # Dequeued: 1
q.dequeue()      # Dequeued: 2
q.peek()         # Front item: 3
q.dequeue()      # Dequeued: 3
q.dequeue()      # Queue is empty

### JavaRush
## Правильное решение:
## Author: JavaRush's team
# class Queue:
#     def __init__(self):
#         self.queue = []
#
#     def enqueue(self, item):
#         self.queue.append(item)
#         print(f"Enqueued: {item}")
#
#     def dequeue(self):
#         if not self.is_empty():
#             item = self.queue.pop(0)
#             print(f"Dequeued: {item}")
#             return item
#         else:
#             print("Queue is empty")
#             return None
#
#     def peek(self):
#         if not self.is_empty():
#             print(f"Front item: {self.queue[0]}")
#             return self.queue[0]
#         else:
#             print("Queue is empty")
#             return None
#
#     def is_empty(self):
#         return len(self.queue) == 0
#
#     def size(self):
#         return len(self.queue)
#
# # Демонстрация работы
# q = Queue()
# q.enqueue(1)
# q.enqueue(2)
# q.enqueue(3)
# q.peek()         # Front item: 1
# q.dequeue()      # Dequeued: 1
# q.dequeue()      # Dequeued: 2
# q.peek()         # Front item: 3
# q.dequeue()      # Dequeued: 3
# q.dequeue()      # Queue is empty