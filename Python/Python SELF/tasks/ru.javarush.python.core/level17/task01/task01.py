## Authors: JavaRush's team, CodeGym's team, Altavista360
## Version: 1.0.0

### JavaRush
## Задача: Бинарное дерево
## Ссылка: https://javarush.com/tasks/ru.javarush.python.core.level17.task01

### CodeGym
## Task: Binary Tree
## Link: https://codegym.cc/tasks/en.codegym.python.core.level17.task01

### JavaRush
## Условие:
# Напишите функцию для вставки нового элемента в бинарное дерево поиска (BST). Функция должна принимать корневой узел дерева и значение нового элемента и возвращать обновленное дерево.

### JavaRush
## Требования:
# • Программа должна определять функцию, которая принимает два аргумента: корневой узел дерева и значение нового элемента.
# • Функция должна проверять, является ли корневой узел дерева пустым (null или None). Если дерево пустое, новый элемент должен становиться корневым узлом дерева.
# • Функция должна сравнивать значение нового элемента со значением текущего узла и рекурсивно вызывать себя для вставки элемента в левое или правое поддерево в зависимости от результата сравнения.
# • Функция должна возвращать корневой узел обновленного дерева после вставки нового элемента.
# • Функция должна корректно обрабатывать случаи, когда добавляемое значение уже существует в дереве, обычно это означает, что значение не должно быть добавлено снова (с учетом реализаций бинарного дерева поиска).

### JavaRush
## Черновик:
# # Бинарное дерево
#
# # Напишите функцию для вставки нового элемента в бинарное дерево поиска (BST).
# # Функция должна принимать корневой узел дерева и значение нового элемента и возвращать обновленное дерево.
#
# class TreeNode:
#     def __init__(self, value=0, left=None, right=None):
#         self.value = value
#         self.left = left
#         self.right = right
#
# def insert_into_bst(root, value):
#     # Напишите тут ваш код
#
#     return root

### JavaRush
# Бинарное дерево

# Напишите функцию для вставки нового элемента в бинарное дерево поиска (BST).
# Функция должна принимать корневой узел дерева и значение нового элемента и возвращать обновленное дерево.

class TreeNode:
    def __init__(self, value=0, left=None, right=None):
        self.value = value
        self.left = left
        self.right = right

def insert_into_bst(root, value):
    # Напишите тут ваш код
    if root is None:
        return TreeNode(key)
    if key < root.val:
        root.left = insert(root.left, key)
    elif key > root.val:
        root.right = insert(root.right, key)
    return root

### JavaRush
## Правильное решение:
## Author: JavaRush's team
# class TreeNode:
#     def __init__(self, key):
#         self.left = None
#         self.right = None
#         self.val = key
#
# def insert(root, key):
#     if root is None:
#         return TreeNode(key)
#     if key < root.val:
#         root.left = insert(root.left, key)
#     elif key > root.val:
#         root.right = insert(root.right, key)
#     return root