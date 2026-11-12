## Authors: JavaRush's team, CodeGym's team, Altavista360
## Version: 1.0.0

### JavaRush
## Задача: Смена shell пользователя
## Ссылка: https://javarush.com/tasks/ru.javarush.system.linux.level02.task07

### CodeGym
## Task: Change user shell
## Link: https://codegym.cc/tasks/en.codegym.system.linux.level02.task07

### JavaRush
## Условие:
# 1. Создайте нового пользователя с именем `tester_user`.
# 2. Установите для пользователя `tester_user` новый shell `/bin/zsh` с помощью команды `usermod`.
# 3. Проверьте, что shell пользователя действительно изменён, просмотрев соответствующую строку в файле `/etc/passwd`.

### JavaRush
## Требования:
# • Скрипт должен создать нового пользователя с именем `tester_user` с помощью команды `adduser`.
# • Скрипт должен изменить shell пользователя `tester_user` на `/bin/zsh` с использованием команды `usermod`.
# • Скрипт должен выполнить проверку строки, содержащей информацию о пользователе `tester_user`, в файле `/etc/passwd`, чтобы убедиться, что shell изменён на `/bin/zsh`.

### JavaRush
## Черновик:
# # Создание нового пользователя с именем tester_user с помощью команды adduser
#
#
# # Смена shell для пользователя tester_user на /bin/zsh с использованием команды usermod
#
#
# # Проверка, изменен ли shell пользователя путем поиска строки в файле /etc/passwd
# grep -q "^tester_user:.*:/bin/zsh$" /etc/passwd

### JavaRush
# Создание нового пользователя с именем tester_user с помощью команды adduser
adduser --disabled-password --gecos "" tester_user

# Смена shell для пользователя tester_user на /bin/zsh с использованием команды usermod
usermod --shell /bin/zsh tester_user

# Проверка, изменен ли shell пользователя путем поиска строки в файле /etc/passwd
grep -q "^tester_user:.*:/bin/zsh$" /etc/passwd

### JavaRush
## Правильное решение:
## Author: JavaRush's team
# # Создание нового пользователя с именем tester_user с помощью команды adduser
# adduser --disabled-password --gecos "" tester_user
#
# # Смена shell для пользователя tester_user на /bin/zsh с использованием команды usermod
# usermod --shell /bin/zsh tester_user
#
# # Проверка, изменен ли shell пользователя путем поиска строки в файле /etc/passwd
# grep -q "^tester_user:.*:/bin/zsh$" /etc/passwd