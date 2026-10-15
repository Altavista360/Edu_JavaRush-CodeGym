## Authors: JavaRush's team, CodeGym's team, Altavista360
## Version: 1.0.0

### JavaRush
## Задача: Поиск в AVL-дереве
## Ссылка: https://javarush.com/tasks/ru.javarush.python.core.level17.task05

### CodeGym
## Task: Search in an AVL Tree
## Link: https://codegym.cc/tasks/en.codegym.python.core.level17.task05

### JavaRush
## Условие:
# Напишите функцию search для поиска элемента в бинарном дереве поиска (BST). Функция должна принимать корневой узел дерева и значение искомого элемента и возвращать узел, содержащий искомое значение, или None, если элемент не найден.

### JavaRush
## Требования:
# • Функция search должна принимать два аргумента: корень бинарного дерева поиска и значение искомого элемента.
# • Функция search должна возвращать узел, содержащий искомое значение, если такой узел существует в дереве.
# • Функция search должна возвращать None, если элемент не найден в дереве.
# • Функция должна работать в соответствии с принципом поиска в бинарном дереве поиска (BST), то есть переходить в левое или правое поддерево в зависимости от значения текущего узла и искомого элемента.

### JavaRush
## Черновик:
# # Поиск в AVL-дереве
#
# # Напишите функцию search для поиска элемента в бинарном дереве поиска (BST).
# # Функция должна принимать корневой узел дерева и значение искомого элемента и возвращать узел,
# # содержащий искомое значение, или None, если элемент не найден.
#
# class TreeNode:
#     def __init__(self, key, left=None, right=None, height=1):
#         self.key = key
#         self.left = left
#         self.right = right
#         self.height = height
#
# def search(root, key):
# # Напишите тут ваш код
#
#
# # Пример использования:
# # root = TreeNode(10)
# # root.left = TreeNode(5)
# # root.right = TreeNode(15)
# # result = search(root, 15)
# # print(result.key if result else "Not found")

### JavaRush
# Поиск в AVL-дереве

# Напишите функцию search для поиска элемента в бинарном дереве поиска (BST).
# Функция должна принимать корневой узел дерева и значение искомого элемента и возвращать узел,
# содержащий искомое значение, или None, если элемент не найден.

class TreeNode:
    def __init__(self, key, left=None, right=None, height=1):
        self.key = key
        self.left = left
        self.right = right
        self.height = height

def search(root, key):
# Напишите тут ваш код
    if root is None or root.key == key:
        return root
    if key < root.key:
        return search(root.left, key)
    else:
        return search(root.right, key)

# Пример использования:
# root = TreeNode(10)
# root.left = TreeNode(5)
# root.right = TreeNode(15)
# result = search(root, 15)
# print(result.key if result else "Not found")

### JavaRush
## Правильное решение:
## Author: JavaRush's team
# class TreeNode:
#     def __init__(self, key, left=None, right=None, height=1):
#         self.key = key
#         self.left = left
#         self.right = right
#         self.height = height
#
# def search(root, key):
#     if root is None or root.key == key:
#         return root
#     if key < root.key:
#         return search(root.left, key)
#     else:
#         return search(root.right, key)
#
# # Пример использования:
# # root = TreeNode(10)
# # root.left = TreeNode(5)
# # root.right = TreeNode(15)
# # result = search(root, 15)
# # print(result.key if result else "Not found")