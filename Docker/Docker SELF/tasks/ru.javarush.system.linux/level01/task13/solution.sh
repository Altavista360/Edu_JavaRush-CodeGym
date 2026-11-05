## Authors: JavaRush's team, CodeGym's team, Altavista360
## Version: 1.0.0

### JavaRush
## Задача: Определение текущего пользователя
## Ссылка: https://javarush.com/tasks/ru.javarush.system.linux.level01.task13

### CodeGym
## Task: Using the `cat` command
## Link: https://codegym.cc/tasks/en.codegym.system.linux.level01.task13

### JavaRush
## Условие:
# Создайте файл с именем `example1.txt` и заполните его следующим содержимым: "Это пример текста для команды cat.". С помощью команды `cat` выведите содержимое файла `example1.txt` на экран.

### CodeGym
## Condition:
# Create a file named `example1.txt` and fill it with the following content: "This is an example text for the cat command.". Using the `cat` command, display the contents of the `example1.txt` file on the screen.

### JavaRush
## Требования:
# • Необходимо создать файл с именем `example1.txt`.
# • Файл `example1.txt` должен содержать текст: "Это пример текста для команды cat.".
# • Для вывода содержимого файла на экран должна быть использована команда `cat`.
# • Содержимое файла `example1.txt` должно быть корректно отображено на экране в точности так, как оно указано в файле.
# • Все действия (создание файла, заполнение содержимого, использование команды `cat`) должны быть выполнены через терминал Linux.

### CodeGym
## Requirements:
# • You need to create a file named `example1.txt`.
# • The file `example1.txt` must contain the text: "This is an example text for the cat command.".
# • The `cat` command must be used to display the file contents on the screen.
# • The contents of the file `example1.txt` must be displayed on the screen exactly as it appears in the file.
# • All actions (file creation, filling the content, using the `cat` command) must be performed through the Linux terminal.

### JavaRush
## Черновик:
# # Создание файла example1.txt и добавление в него текста
# ???
#
# # Вывод содержимого файла example1.txt на экран с помощью команды cat
# ???

### CodeGym
## Draft:
# # Create the file example1.txt and add text into it
# ???
#
# # Display the contents of the file example1.txt using the cat command
# ???

### JavaRush
# Создание файла example1.txt и добавление в него текста
echo "Это пример текста для команды cat." > example1.txt

# Вывод содержимого файла example1.txt на экран с помощью команды cat
cat example1.txt

### CodeGym
# Create the file example1.txt and add text into it
echo "This is an example text for the cat command." > example1.txt

# Display the contents of the file example1.txt using the cat command
cat example1.txt

### JavaRush
## Правильное решение:
## Author: JavaRush's team
# # Создание файла example1.txt и добавление в него текста
# echo "Это пример текста для команды cat." > example1.txt
#
# # Вывод содержимого файла example1.txt на экран с помощью команды cat
# cat example1.txt

### CodeGym
## Correct solution:
## Author: CodeGym's team
# # Create the file example1.txt and add text into it
# echo "This is an example text for the cat command." > example1.txt
#
# # Display the contents of the file example1.txt using the cat command
# cat example1.txt