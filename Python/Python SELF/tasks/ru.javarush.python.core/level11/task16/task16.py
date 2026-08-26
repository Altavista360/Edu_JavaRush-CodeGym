## Authors: JavaRush's team, CodeGym's team, Altavista360
## Version: 1.0.0

### JavaRush
## Задача: Исправляем замыкания.
## Ссылка: https://javarush.com/tasks/ru.javarush.python.core.level11.task16

### CodeGym
## Task: Fixing closures.
## Link: https://codegym.cc/tasks/en.codegym.python.core.level11.task16

### JavaRush
## Условие:
# Исправьте код замыкания:

### JavaRush
## Требования:
# • Замыкание должно использовать текущие значения переменной `i` из цикла, а не только её последнее значение.
# • Функция `create_multipliers_correct` должна правильно возвращать список функций.
# • Код функции `create_multipliers_correct` должен быть правильно отформатирован, включая корректные отступы.

### JavaRush
## Черновик:
# # Исправляем замыкания.
#
# # Исправьте код замыкания:
#
# def create_multipliers_correct():
#     return [lambda x: i * x for i in range(5)]
#
# for multiplier in create_multipliers_correct():
#     print(multiplier(2))  # Вывод: 0 2 4 6 8

### JavaRush
# Исправляем замыкания.

# Исправьте код замыкания:

def create_multipliers_correct():
    return [lambda x, i=i: i * x for i in range(5)]

for multiplier in create_multipliers_correct():
    print(multiplier(2))  # Вывод: 0 2 4 6 8

### JavaRush
## Правильное решение:
## Author: JavaRush's team
# def create_multipliers_correct():
#     return [lambda x, i=i: i * x for i in range(5)]
#
# for multiplier in create_multipliers_correct():
#     print(multiplier(2))  # Вывод: 0 2 4 6 8