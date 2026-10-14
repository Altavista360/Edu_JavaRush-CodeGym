## Authors: JavaRush's team, CodeGym's team, Altavista360
## Version: 1.0.0

### JavaRush
## Задача: Поиск элемента в бинарном дереве
## Ссылка: https://javarush.com/tasks/ru.javarush.python.core.level17.task02

### CodeGym
## Task: Searching for an element in a binary tree
## Link: https://codegym.cc/tasks/en.codegym.python.core.level17.task02

### JavaRush
## Условие:
# Напишите функцию для поиска элемента в бинарном дереве поиска (BST). Функция должна принимать корневой узел дерева и значение искомого элемента и возвращать узел, содержащий искомое значение, или None, если элемент не найден.

### JavaRush
## Требования:
# • Функция должна принимать два параметра: корневой узел бинарного дерева (root) и значение искомого элемента (value).
# • Функция должна использовать рекурсивный или итеративный метод для поиска элемента в бинарном дереве поиска.
# • Функция должна сравнивать значение узла с искомым значением и решать, в какое поддерево перейти (левое или правое).
# • Функция должна возвращать узел, содержащий искомое значение, если такой узел найден, или None, если значение не существует в дереве.

### JavaRush
## Черновик:
# # Поиск элемента в бинарном дереве
#
# # Напишите функцию для поиска элемента в бинарном дереве поиска (BST).
# # Функция должна принимать корневой узел дерева и значение искомого элемента
# # и возвращать узел, содержащий искомое значение, или None, если элемент не найден.
#
# class TreeNode:
#     def __init__(self, value=0, left=None, right=None):
#         self.value = value
#         self.left = left
#         self.right = right
#
# def search_bst(root: TreeNode, val: int) -> TreeNode:
# # Напишите тут ваш код

### JavaRush
# Поиск элемента в бинарном дереве

# Напишите функцию для поиска элемента в бинарном дереве поиска (BST).
# Функция должна принимать корневой узел дерева и значение искомого элемента
# и возвращать узел, содержащий искомое значение, или None, если элемент не найден.

class TreeNode:
    def __init__(self, value=0, left=None, right=None):
        self.value = value
        self.left = left
        self.right = right

def search_bst(root: TreeNode, val: int) -> TreeNode:
# Напишите тут ваш код
    if root is None or root.value == val:
        return root
    if val < root.value:
        return search_bst(root.left, val)
    else:
        return search_bst(root.right, val)

### JavaRush
## Правильное решение:
## Author: JavaRush's team
# class TreeNode:
#     def __init__(self, value=0, left=None, right=None):
#         self.value = value
#         self.left = left
#         self.right = right
#
# def search_bst(root: TreeNode, val: int) -> TreeNode:
#     if root is None or root.value == val:
#         return root
#     if val < root.value:
#         return search_bst(root.left, val)
#     else:
#         return search_bst(root.right, val)