## Authors: JavaRush's team, CodeGym's team, Altavista360
## Version: 1.0.0

### JavaRush
## Задача: AVL-дерево
## Ссылка: https://javarush.com/tasks/ru.javarush.python.core.level17.task03

### CodeGym
## Task: AVL Tree
## Link: https://codegym.cc/tasks/en.codegym.python.core.level17.task03

### JavaRush
## Условие:
# Напишите функцию для вставки нового элемента в AVL-дерево. Напишите функции get_height, update_height, left_rotate и right_rotate

### JavaRush
## Требования:
# • Программа должна включать функцию для вставки нового элемента в AVL-дерево, которая будет поддерживать сбалансированность дерева после каждой вставки.
# • Программа должна включать функцию get_height, которая возвращает высоту узла. Если узел пустой, функция должна возвращать 0.
# • Программа должна включать функцию update_height, которая обновляет высоту узла на основе высоты его детей.
# • Программа должна включать функцию left_rotate для выполнения левого вращения вокруг заданного узла, чтобы поддерживать балансировку дерева.
# • Программа должна включать функцию right_rotate для выполнения правого вращения вокруг заданного узла, чтобы поддерживать балансировку дерева.

### JavaRush
## Черновик:
# # AVL-дерево
#
# # Напишите функцию для вставки нового элемента в AVL-дерево.
# # Напишите функции get_height, update_height, left_rotate и right_rotate
#
# class TreeNode:
#     def __init__(self, key):
#         self.key = key
#         self.left = None
#         self.right = None
#         self.height = 1
#
# def get_height(node):
# # Напишите тут ваш код
#
# def update_height(node):
# # Напишите тут ваш код
#
# def left_rotate(z):
# # Напишите тут ваш код
#
# def right_rotate(z):
# # Напишите тут ваш код
#
# def get_balance(node):
#     if not node:
#         return 0
#     return get_height(node.left) - get_height(node.right)
#
# def insert(root, key):
#     if not root:
#         return TreeNode(key)
#     elif key < root.key:
#         root.left = insert(root.left, key)
#     else:
#         root.right = insert(root.right, key)
#     update_height(root)
#
#     balance = get_balance(root)
#
#     # Left Left Case
#     if balance > 1 and key < root.left.key:
#         return right_rotate(root)
#
#     # Right Right Case
#     if balance < -1 and key > root.right.key:
#         return left_rotate(root)
#
#     # Left Right Case
#     if balance > 1 and key > root.left.key:
#         root.left = left_rotate(root.left)
#         return right_rotate(root)
#
#     # Right Left Case
#     if balance < -1 and key < root.right.key:
#         root.right = right_rotate(root.right)
#         return left_rotate(root)
#
#     return root

### JavaRush
# AVL-дерево

# Напишите функцию для вставки нового элемента в AVL-дерево.
# Напишите функции get_height, update_height, left_rotate и right_rotate

class TreeNode:
    def __init__(self, key):
        self.key = key
        self.left = None
        self.right = None
        self.height = 1

def get_height(node):
# Напишите тут ваш код
    if not node:
        return 0
    return node.height

def update_height(node):
# Напишите тут ваш код
    if node:
        node.height = 1 + max(get_height(node.left), get_height(node.right))

def left_rotate(z):
# Напишите тут ваш код
    y = z.right
    T2 = y.left
    y.left = z
    z.right = T2
    update_height(z)
    update_height(y)
    return y

def right_rotate(z):
# Напишите тут ваш код
    y = z.left
    T3 = y.right
    y.right = z
    z.left = T3
    update_height(z)
    update_height(y)
    return y

def get_balance(node):
    if not node:
        return 0
    return get_height(node.left) - get_height(node.right)

def insert(root, key):
    if not root:
        return TreeNode(key)
    elif key < root.key:
        root.left = insert(root.left, key)
    else:
        root.right = insert(root.right, key)
    update_height(root)

    balance = get_balance(root)

    # Left Left Case
    if balance > 1 and key < root.left.key:
        return right_rotate(root)

    # Right Right Case
    if balance < -1 and key > root.right.key:
        return left_rotate(root)

    # Left Right Case
    if balance > 1 and key > root.left.key:
        root.left = left_rotate(root.left)
        return right_rotate(root)

    # Right Left Case
    if balance < -1 and key < root.right.key:
        root.right = right_rotate(root.right)
        return left_rotate(root)

    return root

### JavaRush
## Правильное решение:
## Author: JavaRush's team
# class TreeNode:
#     def __init__(self, key):
#         self.key = key
#         self.left = None
#         self.right = None
#         self.height = 1
#
# def get_height(node):
#     if not node:
#         return 0
#     return node.height
#
# def update_height(node):
#     if node:
#         node.height = 1 + max(get_height(node.left), get_height(node.right))
#
# def left_rotate(z):
#     y = z.right
#     T2 = y.left
#     y.left = z
#     z.right = T2
#     update_height(z)
#     update_height(y)
#     return y
#
# def right_rotate(z):
#     y = z.left
#     T3 = y.right
#     y.right = z
#     z.left = T3
#     update_height(z)
#     update_height(y)
#     return y
#
# def get_balance(node):
#     if not node:
#         return 0
#     return get_height(node.left) - get_height(node.right)
#
# def insert(root, key):
#     if not root:
#         return TreeNode(key)
#     elif key < root.key:
#         root.left = insert(root.left, key)
#     else:
#         root.right = insert(root.right, key)
#     update_height(root)
#
#     balance = get_balance(root)
#
#     # Left Left Case
#     if balance > 1 and key < root.left.key:
#         return right_rotate(root)
#
#     # Right Right Case
#     if balance < -1 and key > root.right.key:
#         return left_rotate(root)
#
#     # Left Right Case
#     if balance > 1 and key > root.left.key:
#         root.left = left_rotate(root.left)
#         return right_rotate(root)
#
#     # Right Left Case
#     if balance < -1 and key < root.right.key:
#         root.right = right_rotate(root.right)
#         return left_rotate(root)
#
#     return root