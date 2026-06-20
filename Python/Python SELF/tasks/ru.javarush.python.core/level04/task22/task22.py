## Authors: JavaRush's team, CodeGym's team, Altavista360
## Version: 1.0.0

### JavaRush
## Задача: Профиль кота
## Ссылка: https://javarush.com/tasks/ru.javarush.python.core.level04.task22

### CodeGym
## Task: Cat Profile
## Link: https://codegym.cc/tasks/en.codegym.python.core.level04.task22

### JavaRush
## Условие:
# Напишите функцию create_cat_profile(name: str, age: int, **kwargs: str) -> None, которая принимает имя и возраст кота в качестве обязательных параметров, а также произвольное количество именованных параметров (например, порода, цвет и т.д.). Функция должна выводить профиль кота, включая все переданные параметры.

### JavaRush
## Требования:
# • Функция должна быть названа create_cat_profile.
# • Функция должна принимать обязательные параметры name и age.
# • Функция должна принимать произвольное количество именованных параметров через **kwargs.
# • Функция должна выводить профиль кота, включая все переданные параметры (имя, возраст и дополнительные данные).

### JavaRush
## Черновик:
# # Профиль кота
#
# # Напишите функцию create_cat_profile(name: str, age: int, **kwargs: str) -> None, которая принимает имя и возраст кота в качестве обязательных параметров,
# # а также произвольное количество именованных параметров (например, порода, цвет и т.д.).
# # Функция должна выводить профиль кота, включая все переданные параметры.
#
# # Напишите тут ваш код
#
# create_cat_profile("Мурзик", 3, порода="Сиамский", цвет="Черный")
# create_cat_profile("Барсик", 5, страна="Китай", хобби="Ловить мышей")

### JavaRush
# Профиль кота

# Напишите функцию create_cat_profile(name: str, age: int, **kwargs: str) -> None, которая принимает имя и возраст кота в качестве обязательных параметров,
# а также произвольное количество именованных параметров (например, порода, цвет и т.д.).
# Функция должна выводить профиль кота, включая все переданные параметры.

# Напишите тут ваш код

def create_cat_profile(name: str, age: int, **kwargs: str) -> None:
    profile = {
        "Имя": name,
        "Возраст": age
    }
    profile.update(kwargs)

    for key, value in profile.items():
        print(f"{key}: {value}")

create_cat_profile("Мурзик", 3, порода="Сиамский", цвет="Черный")
create_cat_profile("Барсик", 5, страна="Китай", хобби="Ловить мышей")

### JavaRush
## Правильное решение:
## Author: JavaRush's team
# def create_cat_profile(name: str, age: int, **kwargs: str) -> None:
#     profile = {
#         "Имя": name,
#         "Возраст": age
#     }
#     profile.update(kwargs)
#
#     for key, value in profile.items():
#         print(f"{key}: {value}")
#
# # Пример использования функции
# create_cat_profile("Мурзик", 3, порода="Сиамский", цвет="Черный")
# create_cat_profile("Барсик", 5, страна="Китай", хобби="Ловить мышей")