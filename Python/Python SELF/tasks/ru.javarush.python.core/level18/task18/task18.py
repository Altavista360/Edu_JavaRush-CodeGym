## Authors: JavaRush's team, CodeGym's team, Altavista360
## Version: 1.0.0

### JavaRush
## Задача: Это жизнь
## Ссылка: https://javarush.com/tasks/ru.javarush.python.core.level18.task18

### CodeGym
## Task: This is life
## Link: https://codegym.cc/tasks/en.codegym.python.core.level18.task18

### JavaRush
## Условие:
# Вам необходимо отсортировать массив на устройстве с ограниченной памятью, где доступно всего 1 КБ дополнительной памяти. Какой алгоритм сортировки вы выберете? Напишите его.

### JavaRush
## Требования:
# • Алгоритм сортировки должен работать в условиях, когда дополнительной памяти доступно не более 1 КБ.
# • Алгоритм должен использовать преимущественно внутреннюю память массива для выполнения сортировки.
# • Алгоритм должен быть способен сортировать массивы, размер которых значительно превышает доступную дополнительную память.
# • Алгоритм сортировки должен быть эффективным по времени выполнения, но может использовать рекурсию.

### JavaRush
## Черновик:
# # Это жизнь
#
# # Вам необходимо отсортировать массив на устройстве с ограниченной памятью, где доступно всего 1 КБ дополнительной памяти.
# # Какой алгоритм сортировки вы выберете?  Напишите его.
#
# # Напишите тут ваш код
#
# def in_place_quick_sort(arr, low, high):
# # Напишите тут ваш код
#
# # Example usage
# arr = [3, 6, 8, 10, 1, 2, 1]
# in_place_quick_sort(arr, 0, len(arr) - 1)
# print(arr)

### JavaRush
# Это жизнь

# Вам необходимо отсортировать массив на устройстве с ограниченной памятью, где доступно всего 1 КБ дополнительной памяти.
# Какой алгоритм сортировки вы выберете?  Напишите его.

# Напишите тут ваш код
def partition(arr, low, high):
    pivot = arr[high]
    i = low - 1
    for j in range(low, high):
        if arr[j] < pivot:
            i += 1
            arr[i], arr[j] = arr[j], arr[i]
    arr[i + 1], arr[high] = arr[high], arr[i + 1]
    return i + 1

def in_place_quick_sort(arr, low, high):
# Напишите тут ваш код
    if low < high:
        pivot_index = partition(arr, low, high)
        in_place_quick_sort(arr, low, pivot_index - 1)
        in_place_quick_sort(arr, pivot_index + 1, high)

# Example usage
arr = [3, 6, 8, 10, 1, 2, 1]
in_place_quick_sort(arr, 0, len(arr) - 1)
print(arr)

### JavaRush
## Правильное решение:
## Author: JavaRush's team
# def in_place_quick_sort(arr, low, high):
#     if low < high:
#         pivot_index = partition(arr, low, high)
#         in_place_quick_sort(arr, low, pivot_index - 1)
#         in_place_quick_sort(arr, pivot_index + 1, high)
#
# def partition(arr, low, high):
#     pivot = arr[high]
#     i = low - 1
#     for j in range(low, high):
#         if arr[j] < pivot:
#             i += 1
#             arr[i], arr[j] = arr[j], arr[i]
#     arr[i + 1], arr[high] = arr[high], arr[i + 1]
#     return i + 1
#
# # Example usage
# arr = [3, 6, 8, 10, 1, 2, 1]
# in_place_quick_sort(arr, 0, len(arr) - 1)
# print(arr)