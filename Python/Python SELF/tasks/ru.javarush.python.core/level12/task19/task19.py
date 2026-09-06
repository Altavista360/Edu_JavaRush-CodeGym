## Authors: JavaRush's team, CodeGym's team, Altavista360
## Version: 1.0.0

### JavaRush
## Задача: Использованиее метода reduce()
## Ссылка: https://javarush.com/tasks/ru.javarush.python.core.level12.task19

### CodeGym
## Task: Using the reduce() method
## Link: https://codegym.cc/tasks/en.codegym.python.core.level12.task19

### JavaRush
## Условие:
# Напишите класс, который управляет своей сериализацией с помощью метода __reduce__(), чтобы при сериализации и десериализации сохранялись только определенные поля.

### JavaRush
## Требования:
# • Программа должна включать класс, который управляет процессом сериализации и десериализации.
# • Класс должен содержать метод __reduce__(), который определяет, как объект будет сериализоваться.
# • Метод __reduce__() должен быть реализован так, чтобы сохранялись только определенные поля объекта "name" и "age", а не все.
# • Программа должна демонстрировать процесс сериализации и десериализации объекта класса, подтверждая, что сохраняются только определенные поля.

### JavaRush
## Черновик:
# # Использованиее метода reduce()
#
# # Напишите класс, который управляет своей сериализацией с помощью метода __reduce__(),
# # чтобы при сериализации и десериализации сохранялись только определенные поля.
#
# # Напишите тут ваш код

### JavaRush
# Использование метода reduce()

# Напишите класс, который управляет своей сериализацией с помощью метода __reduce__(),
# чтобы при сериализации и десериализации сохранялись только определенные поля.

import pickle

class CustomSerializable:
    def __init__(self, name, age, password=None, hidden_info=None):
        self.name = name
        self.age = age
        self.password = password
        self.hidden_info = hidden_info

    # Напишите тут ваш код
    def __reduce__(self):
        return self._serialize, (self.name, self.age)

obj = CustomSerializable("John Doe", 30, "supersecret", "hidden")

serialized_obj = pickle.dumps(obj)

deserialized_obj = pickle.loads(serialized_obj)

print(f"Имя: {deserialized_obj.name}, Возраст: {deserialized_obj.age}")
print(f"Пароль: {deserialized_obj.password}, Скрытая информация: {deserialized_obj.hidden_info}")

### JavaRush
## Правильное решение:
## Author: JavaRush's team
# import pickle
#
# class CustomSerializable:
#     def __init__(self, name, age, password, hidden_info):
#         self.name = name
#         self.age = age
#         self.password = password
#         self.hidden_info = hidden_info
#
#     def __reduce__(self):
#         return self._serialize, (self.name, self.age)
#
#     @staticmethod
#     def _serialize(name, age):
#         return CustomSerializable(name, age, None, None)
#
# # Создание объекта
# obj = CustomSerializable("John Doe", 30, "supersecret", "hidden")
#
# # Сериализация
# serialized_obj = pickle.dumps(obj)
#
# # Десериализация
# deserialized_obj = pickle.loads(serialized_obj)
#
# # Проверка
# print(f"Name: {deserialized_obj.name}, Age: {deserialized_obj.age}")
# print(f"Password: {deserialized_obj.password}, Hidden Info: {deserialized_obj.hidden_info}")