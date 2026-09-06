## Authors: JavaRush's team, CodeGym's team, Altavista360
## Version: 1.0.0

### JavaRush
## Задача: Исключение несериализуемых полей
## Ссылка: https://javarush.com/tasks/ru.javarush.python.core.level12.task20

### CodeGym
## Task: Excluding Non-serializable Fields
## Link: https://codegym.cc/tasks/en.codegym.python.core.level12.task20

### JavaRush
## Условие:
# Напишите класс, который содержит несериализуемые поля, такие как открытые файлы или базы данных, и реализуйте методы __getstate__() и __setstate__(), чтобы исключить эти поля при сериализации и восстановить их при десериализации.

### JavaRush
## Требования:
# • Создайте класс, который содержит поля, не подлежащие сериализации, такие как открытые файлы, подключения к базам данных или другие ресурсы.
# • Реализуйте метод __getstate__(), который будет вызываться при сериализации объекта.Метод должен возвращать словарь (или другой контейнер), содержащий только те поля, которые могут быть сериализованы.
# • Реализуйте метод __setstate__(), который будет вызываться при десериализации объекта. Метод должен принимать один аргумент — словарь состояний, созданный методом __getstate__(). Восстановите состояние объекта, используя переданный словарь. Вновь откройте или инициализируйте несериализуемые ресурсы, которые были исключены в __getstate__().
# • Напишите демонстрационный код, который создаёт экземпляр класса, сериализует и десериализует его, показывая, что несериализуемые поля корректно исключены и восстановлены.

### JavaRush
## Черновик:
# # Исключение несериализуемых полей
#
# # Напишите класс, который содержит несериализуемые поля, такие как открытые файлы или базы данных,
# # и реализуйте методы __getstate__() и __setstate__(),
# # чтобы исключить эти поля при сериализации и восстановить их при десериализации.
#
# # Напишите тут ваш код

### JavaRush
# Исключение несериализуемых полей

# Напишите класс, который содержит несериализуемые поля, такие как открытые файлы или базы данных,
# и реализуйте методы __getstate__() и __setstate__(),
# чтобы исключить эти поля при сериализации и восстановить их при десериализации.

# Напишите тут ваш код

import pickle

class MyClass:
    def __init__(self, filepath):
        self.filepath = filepath
        self.file = open(filepath, 'r')
        self.data = self.file.read()

    def __getstate__(self):
        state = self.__dict__.copy()
        del state['file']
        return state

    def __setstate__(self, state):
        self.__dict__.update(state)
        self.file = open(self.filepath, 'r')
        self.data = self.file.read()

    def __del__(self):
        self.file.close()

with open('file.txt', 'w', encoding='utf-8') as file:
    file.write('Данные из file.txt.\n')

obj = MyClass('file.txt')

serialized_state = obj.__getstate__()
print('Поле file отсутствует в сериализованном состоянии:', 'file' not in serialized_state)

serialized_obj = pickle.dumps(obj)
deserialized_obj = pickle.loads(serialized_obj)

print('Поле file восстановлено после десериализации:', hasattr(deserialized_obj, 'file'))
print('Содержимое восстановленного файла:', deserialized_obj.data)

### JavaRush
## Правильное решение:
## Author: JavaRush's team
# import pickle
#
# class MyClass:
#     def __init__(self, filepath):
#         self.filepath = filepath
#         self.file = open(filepath, 'r')
#         self.data = self.file.read()
#
#     def __getstate__(self):
#         state = self.__dict__.copy()
#         # Remove the file attribute from the state to prevent serialization
#         del state['file']
#         return state
#
#     def __setstate__(self, state):
#         self.__dict__.update(state)
#         # Re-open the file upon deserialization
#         self.file = open(self.filepath, 'r')
#         self.data = self.file.read()
#
#     def __del__(self):
#         self.file.close()
#
# Example usage:
# obj = MyClass('example.txt')
# serialized_obj = pickle.dumps(obj)
# deserialized_obj = pickle.loads(serialized_obj)
# print(deserialized_obj.data)