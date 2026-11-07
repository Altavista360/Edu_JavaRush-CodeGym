## Authors: JavaRush's team, CodeGym's team, Altavista360
## Version: 1.0.0

### JavaRush
## Задача: Редактирование файла и работа в редакторе `vim`
## Ссылка: https://javarush.com/tasks/ru.javarush.system.linux.level01.task16

### CodeGym
## Task: Editing a file and working in the `vim` editor
## Link: https://codegym.cc/tasks/en.codegym.system.linux.level01.task16

### JavaRush
## Условие:
# Создайте файл с именем `example4.txt` с текстом "Это пример текста для редактирования в vim.". Откройте файл с помощью редактора `vim`. Перейдите в режим редактирования, добавьте строку "Текст добавлен в vim.", сохраните изменения и выйдите из редактора. После этого с помощью команды `cat` выведите содержимое файла `example4.txt` на экран.

### CodeGym
## Condition:
# Create a file named `example4.txt` with the text "This is a sample text for editing in vim.". Open the file using the `vim` editor. Switch to editing mode, add the line "Text added in vim.", save the changes, and exit the editor. After that, use the `cat` command to display the contents of the `example4.txt` file on the screen.

### JavaRush
## Требования:
# • Файл с именем `example4.txt` должен существовать и содержать исходный текст "Это пример текста для редактирования в vim.".
# • В скрипте должна быть команда открытия файла в редакторе — `vim example4.txt`.
# • Нажатия клавиш внутри редактора записываются в скрипте комментариями: переход в режим редактирования должен быть указан комментарием с клавишей `i`.
# • Файл `example4.txt` должен содержать строку "Текст добавлен в vim." отдельной строкой после исходного текста.
# • В скрипте комментарием должна быть указана команда `vim`, которой изменения записываются в файл, — `:w` или `:wq`.
# • В скрипте комментарием должны быть указаны клавиша `ESC` и команда выхода из редактора — `:q` или `:wq`.
# • Содержимое файла `example4.txt` должно выводиться на экран командой `cat example4.txt`.
# • Шаги в скрипте должны идти в порядке из условия: открытие файла в `vim`, переход в режим редактирования, добавление строки, сохранение изменений, выход из редактора и только после этого вывод содержимого командой `cat`.

### CodeGym
## Requirements:
# • The file named `example4.txt` must exist and contain the original text "This is a sample text for editing in vim.".
# • The script must contain the command to open the file in the editor - `vim example4.txt`.
# • Key presses inside the editor are recorded in the script as comments: entering edit mode must be indicated by a comment with the `i` key.
# • File `example4.txt` must contain the line "Text added in vim." on a separate line after the original text.
# • The script's comment must specify the `vim` command used to write changes to the file - `:w` or `:wq`.
# • The script comment must specify the `ESC` key and the command to exit the editor — `:q` or `:wq`.
# • The contents of the file `example4.txt` should be displayed on the screen with the command `cat example4.txt`.
# • The steps in the script must follow the order specified in the task: opening the file in `vim`, switching to editing mode, adding a line, saving the changes, exiting the editor, and only then displaying the contents with the `cat` command.

### JavaRush
## Черновик:
# # Открываем файл example4.txt в редакторе vim
#
#
# # Дальше работа идёт внутри редактора, поэтому шаги записаны комментариями:
# # Нажмите `?` — переход в режим редактирования
# # Наберите строку `Текст добавлен в vim.`
# # Нажмите `?` — выход из режима редактирования
# # Напишите `?` — сохранить изменения и выйти из редактора
#
# # Вывести содержимое файла example4.txt на экран
# cat example4.txt

### CodeGym
## Draft:
# # Open the example4.txt file in the vim editor
#
#
# # Next, the work takes place inside the editor, so the steps are written as comments:
# # Press `?` - enter edit mode
# # Type the line `Text added in vim.`
# # Press `?` - exit edit mode
# # Type `?` - save changes and exit the editor
#
# # Display the contents of the file example4.txt on the screen
# cat example4.txt

### JavaRush
# Открываем файл example4.txt в редакторе vim
vim example4.txt

# Дальше работа идёт внутри редактора, поэтому шаги записаны комментариями:
# Нажмите `i` — переход в режим редактирования
# Наберите строку `Текст добавлен в vim.`
# Нажмите `ESC` — выход из режима редактирования
# Напишите `:wq` — сохранить изменения и выйти из редактора

# Вывести содержимое файла example4.txt на экран
cat example4.txt

### CodeGym
# Open the example4.txt file in the vim editor
vim example4.txt

# Next, the work takes place inside the editor, so the steps are written as comments:
# Press `i` - switch to edit mode
# Type the line `Text added in vim.`
# Press `ESC` - exit edit mode
# Type `:wq` - save the changes and exit the editor

# Display the contents of the file example4.txt on the screen
cat example4.txt

### JavaRush
## Правильное решение:
## Author: JavaRush's team
# # Открываем файл example4.txt в редакторе vim
# vim example4.txt
#
# # Дальше работа идёт внутри редактора, поэтому шаги записаны комментариями:
# # Нажмите `i` — переход в режим редактирования
# # Наберите строку `Текст добавлен в vim.`
# # Нажмите `ESC` — выход из режима редактирования
# # Напишите `:wq` — сохранить изменения и выйти из редактора
#
# # Вывести содержимое файла example4.txt на экран
# cat example4.txt

### CodeGym
## Correct solution:
## Author: CodeGym's team
# # Open the example4.txt file in the vim editor
# vim example4.txt
#
# # Next, the work takes place inside the editor, so the steps are written as comments:
# # Press `i` - switch to edit mode
# # Type the line `Text added in vim.`
# # Press `ESC` - exit edit mode
# # Type `:wq` - save the changes and exit the editor
#
# # Display the contents of the file example4.txt on the screen
# cat example4.txt