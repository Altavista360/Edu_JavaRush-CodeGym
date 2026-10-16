## Authors: JavaRush's team, CodeGym's team, Altavista360
## Version: 1.0.0

### JavaRush
## Задача: Поиск пар чисел в AVL-дереве
## Ссылка: https://javarush.com/tasks/ru.javarush.python.core.level17.task06

### JavaRush
## Условие:
# Напишите функции для нахождения минимального (find_min) и максимального (find_max) элемента в бинарном дереве поиска (BST). Функции должны принимать корневой узел дерева и возвращать узел с минимальным или максимальным значением.

### JavaRush
## Требования:
# • Программа должна содержать функцию find_min, которая принимает корневой узел бинарного дерева поиска и возвращает узел с минимальным значением.
# • Программа должна содержать функцию find_max, которая принимает корневой узел бинарного дерева поиска и возвращает узел с максимальным значением.
# • Функция find_min должна рекурсивно спускаться в левое поддерево, пока не достигнет узла без левого дочернего элемента.
# • Функция find_max должна рекурсивно спускаться в правое поддерево, пока не достигнет узла без правого дочернего элемента.
# • Обе функции (find_min и find_max) должны возвращать узел (а не значение), содержащий минимальное или максимальное значение.

### JavaRush
## Черновик:
# ## Поиск пар чисел в AVL-дереве
#
# # Напишите функции для нахождения минимального (find_min) и максимального (find_max) элемента в бинарном дереве поиска (BST).
# # Функции должны принимать корневой узел дерева и возвращать узел с минимальным или максимальным значением.
#
# class TreeNode:
#     def __init__(self, key):
#         self.left = None
#         self.right = None
#         self.val = key
#
# def find_min(node):
# # Напишите тут ваш код
#
# def find_max(node):
# # Напишите тут ваш код
#
# # Пример использования:
# root = TreeNode(20)
# root.left = TreeNode(10)
# root.right = TreeNode(30)
# root.left.left = TreeNode(5)
# root.left.right = TreeNode(15)
# root.right.right = TreeNode(35)
#
# print("Минимальное значение:", find_min(root).val)
# print("Максимальное значение:", find_max(root).val)

### JavaRush
## Поиск пар чисел в AVL-дереве

# Напишите функции для нахождения минимального (find_min) и максимального (find_max) элемента в бинарном дереве поиска (BST).
# Функции должны принимать корневой узел дерева и возвращать узел с минимальным или максимальным значением.

class TreeNode:
    def __init__(self, key):
        self.left = None
        self.right = None
        self.val = key

def find_min(node):
# Напишите тут ваш код

def find_max(node):
# Напишите тут ваш код

# Пример использования:
root = TreeNode(20)
root.left = TreeNode(10)
root.right = TreeNode(30)
root.left.left = TreeNode(5)
root.left.right = TreeNode(15)
root.right.right = TreeNode(35)

print("Минимальное значение:", find_min(root).val)
print("Максимальное значение:", find_max(root).val)

## JavaRush
## Правильное решение:
## Author: JavaRush's team
# class TreeNode:
#     def __init__(self, key):
#         self.left = None
#         self.right = None
#         self.val = key
#
# def find_min(node):
#     current = node
#     while current.left is not None:
#         current = current.left
#     return current
#
# def find_max(node):
#     current = node
#     while current.right is not None:
#         current = current.right
#     return current
#
# # Пример использования:
# root = TreeNode(20)
# root.left = TreeNode(10)
# root.right = TreeNode(30)
# root.left.left = TreeNode(5)
# root.left.right = TreeNode(15)
# root.right.right = TreeNode(35)
#
# print("Минимальное значение:", find_min(root).val)
# print("Максимальное значение:", find_max(root).val)