## Authors: JavaRush's team, CodeGym's team, Altavista360
## Version: 1.0.0

### JavaRush
## Задача: Банкир.
## Ссылка: https://javarush.com/tasks/ru.javarush.python.core.level09.task04

### CodeGym
## Task: Banker.
## Link: https://codegym.cc/tasks/en.codegym.python.core.level09.task04

### JavaRush
## Условие:
# Создайте класс BankAccount с конструктором, который принимает параметры account_number и initial_balance. Добавьте метод deposit(amount), который пополняет счет, и метод withdraw(amount), который снимает средства со счета. Создайте объект этого класса и выполните несколько операций пополнения и снятия средств.

### JavaRush
## Требования:
# • Программа должна включать класс BankAccount, который имеет конструктор, принимающий параметры account_number и initial_balance.
# • Класс BankAccount должен содержать метод deposit(amount), который увеличивает баланс счета на указанную сумму.
# • Класс BankAccount должен иметь метод withdraw(amount), который уменьшает баланс счета на указанную сумму при условии наличия достаточных средств.
# • Программа должна создать объект класса BankAccount и выполнить несколько операций по пополнению и снятию средств, демонстрируя работу методов deposit и withdraw.

### JavaRush
## Черновик:
# # Банкир.
#
# # Создайте класс BankAccount с конструктором, который принимает параметры account_number и initial_balance.
# # Добавьте метод deposit(amount), который пополняет счет, и метод withdraw(amount), который снимает средства со счета.
# # Создайте объект этого класса и выполните несколько операций пополнения и снятия средств.
#
# # Напишите тут ваш код

### JavaRush
# Банкир.

# Создайте класс BankAccount с конструктором, который принимает параметры account_number и initial_balance.
# Добавьте метод deposit(amount), который пополняет счет, и метод withdraw(amount), который снимает средства со счета.
# Создайте объект этого класса и выполните несколько операций пополнения и снятия средств.

# Напишите тут ваш код

class BankAccount:
    def __init__(self, account_number, initial_balance=0):
        self.account_number = account_number
        self.balance = initial_balance

    def deposit(self, amount):
        if amount > 0:
            self.balance += amount
            print(f"Внесено {amount}. Новый баланс: {self.balance}")
        else:
            print("Сумма для внесения должна быть положительной.")

    def withdraw(self, amount):
        if 0 < amount <= self.balance:
            self.balance -= amount
            print(f"Снято {amount}. Новый баланс: {self.balance}")
        else:
            print("Сумма для снятия должна быть положительной и не превышать текущий баланс.")

account = BankAccount("123", 15)
account.deposit(20)
account.withdraw(25)
account.deposit(190)

### JavaRush
## Правильное решение:
## Author: JavaRush's team
# class BankAccount:
#     def __init__(self, account_number, initial_balance=0):
#         self.account_number = account_number
#         self.balance = initial_balance
#
#     def deposit(self, amount):
#         if amount > 0:
#             self.balance += amount
#             print(f"Deposited {amount}. New balance: {self.balance}")
#         else:
#             print("Deposit amount must be positive.")
#
#     def withdraw(self, amount):
#         if 0 < amount <= self.balance:
#             self.balance -= amount
#             print(f"Withdrew {amount}. New balance: {self.balance}")
#         else:
#             print("Withdrawal amount must be positive and not exceed the current balance.")
#
# # Создание аккаунта и операции по нему
# account = BankAccount("123456", 1000)
# account.deposit(500)
# account.withdraw(200)
# account.deposit(300)
# account.withdraw(700)
# account.withdraw(1000)