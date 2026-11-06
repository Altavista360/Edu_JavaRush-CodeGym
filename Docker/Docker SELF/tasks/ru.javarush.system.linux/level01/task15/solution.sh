## Authors: JavaRush's team, CodeGym's team, Altavista360
## Version: 1.0.0

### JavaRush
## Задача: Редактирование файла с помощью `nano`
## Ссылка: https://javarush.com/tasks/ru.javarush.system.linux.level01.task15

### CodeGym
## Task: Editing a file using `nano`
## Link: https://codegym.cc/tasks/en.codegym.system.linux.level01.task15

### JavaRush
## Условие:
# Создайте файл с именем `example3.txt` с произвольным содержимым. Откройте файл в редакторе `nano`, добавьте текст "Добавлено с помощью nano.", сохраните файл и выйдите из редактора. Затем выведите обновлённое содержимое файла на экран с помощью команды `cat`.

### CodeGym
## Condition:
# Create a file named `example3.txt` with any content. Open the file in the `nano` editor, add the text "Added using nano.", save the file, and exit the editor. Then, display the updated contents of the file on the screen using the `cat` command.

### JavaRush
## Требования:
# • Необходимо создать файл с именем `example3.txt` с произвольным содержимым.
# • Файл должен быть открыт для редактирования в текстовом редакторе `nano`.
# • В файл `example3.txt` необходимо добавить строку "Добавлено с помощью nano.".
# • После внесения изменений файл должен быть сохранен, и из редактора `nano` следует выйти.
# • Для вывода обновленного содержимого файла на экран должна быть использована команда `cat`.
# • На экране должно отображаться полное содержимое файла, включая добавленный текст "Добавлено с помощью nano.".

### CodeGym
## Requirements:
# • A file named `example3.txt` must be created with any content.
# • The file must be opened for editing in the `nano` text editor.
# • The string "Added using nano." must be added to the file `example3.txt`.
# • After making the changes, the file must be saved, and the `nano` editor must be exited.
# • The `cat` command must be used to display the updated contents of the file on the screen.
# • The screen must display the full contents of the file, including the added text "Added using nano.".

### JavaRush
## Черновик:
# # Создание файла с произвольным содержимым
# echo "Это первоначальный текст файла example3.txt." > example3.txt
#
# # Редактирование файла в редакторе nano
# # Чтобы этот скрипт работал в реальной жизни, вам потребуется вручную открыть nano и изменить файл.
#
# # Вывод обновленного содержимого файла на экран
# ???

### CodeGym
## Draft:
# # Creating a file with any content
# echo "This is the initial text of the file example3.txt." > example3.txt
#
# # Editing the file in the nano editor
# # To make this script work in real life, you'll need to manually open nano and modify the file.
#
# # Displaying the updated contents of the file on the screen
# ???

### JavaRush
# Создание файла с произвольным содержимым
echo "Это первоначальный текст файла example3.txt." > example3.txt

# Редактирование файла в редакторе nano
# Чтобы этот скрипт работал в реальной жизни, вам потребуется вручную открыть nano и изменить файл.

# Вывод обновленного содержимого файла на экран
cat example3.txt

### CodeGym
# Creating a file with any content
echo "This is the initial text of the file example3.txt." > example3.txt

# Editing the file in the nano editor
# To make this script work in real life, you'll need to manually open nano and modify the file.

# Displaying the updated contents of the file on the screen
cat example3.txt

### JavaRush
## Правильное решение:
## Author: JavaRush's team
# # Создание файла с произвольным содержимым
# echo "Это первоначальный текст файла example3.txt." > example3.txt
#
# # Редактирование файла в редакторе nano
# # Чтобы этот скрипт работал в реальной жизни, вам потребуется вручную открыть nano и изменить файл.
#
# # Вывод обновленного содержимого файла на экран
# cat example3.txt

### CodeGym
## Correct solution:
## Author: CodeGym's team
# # Creating a file with any content
# echo "This is the initial text of the file example3.txt." > example3.txt
#
# # Editing the file in the nano editor
# # To make this script work in real life, you'll need to manually open nano and modify the file.
#
# # Displaying the updated contents of the file on the screen
# cat example3.txt