## Authors: JavaRush's team, CodeGym's team, Altavista360
## Version: 1.0.0

### JavaRush
## Задача: Определение текущего пользователя
## Ссылка: https://javarush.com/tasks/ru.javarush.system.linux.level01.task14

### CodeGym
## Task: Viewing and navigating a file using `less`
## Link: https://codegym.cc/tasks/en.codegym.system.linux.level01.task14

### JavaRush
## Условие:
# Создайте файл с именем `example2.txt`. Заполните этот файл 10 строками текста, используя команду `echo` и операцию перенаправления. Откройте файл с помощью команды `less` и выполните навигацию: перейдите на следующую страницу и вернитесь назад. Завершите работу с программой.

### CodeGym
## Condition:
# Create a file named `example2.txt`. Fill this file with 10 lines of text using the `echo` command and redirection operation. Open the file using the `less` command and navigate: go to the next page and then go back. Exit the program.

### JavaRush
## Требования:
# • Необходимо создать файл с именем `example2.txt` с помощью команды `echo` и оператора перенаправления.
# • Файл `example2.txt` должен быть заполнен 10 строками текста.
# • Файл `example2.txt` нужно открыть с помощью команды `less`.
# • В режиме просмотра через `less` пользователь должен перейти на следующую страницу содержимого файла.
# • В режиме просмотра через `less` пользователь должен вернуться на предыдущую страницу содержимого файла.
# • По завершении навигации пользователь должен выйти из режима просмотра программы `less`.

### CodeGym
## Requirements:
# • You need to create a file named `example2.txt` using the `echo` command and the redirection operator.
# • The file `example2.txt` must be filled with 10 lines of text.
# • The file `example2.txt` needs to be opened using the `less` command.
# • In view mode using `less`, the user must go to the next page of the file’s content.
# • In view mode using `less`, the user must return to the previous page of the file’s content.
# • After completing the navigation, the user must exit the view mode of the `less` program.

### JavaRush
## Черновик:
# # Создание файла example2.txt и заполнение его 10 строками текста
# ???
#
# # Открытие файла с помощью less
# ???
#
# # В less:
# # - Нажмите '?' для перехода на следующую страницу.
# # - Нажмите '?' для возврата на предыдущую страницу.
# # - Нажмите '?' для выхода из программы.

### CodeGym
## Draft:
# # Creating example2.txt file and populating it with 10 lines of text
# ???
#
# # Opening the file using less
# ???
#
# # In less:
# # - Press '?' to go to the next page.
# # - Press '?' to go back to the previous page.
# # - Press '?' to exit the program.

### JavaRush
# Создание файла example2.txt и заполнение его 10 строками текста
echo "Это строка номер 1" >> example2.txt
echo "Это строка номер 2" >> example2.txt
echo "Это строка номер 3" >> example2.txt
echo "Это строка номер 4" >> example2.txt
echo "Это строка номер 5" >> example2.txt
echo "Это строка номер 6" >> example2.txt
echo "Это строка номер 7" >> example2.txt
echo "Это строка номер 8" >> example2.txt
echo "Это строка номер 9" >> example2.txt
echo "Это строка номер 10" >> example2.txt

# Открытие файла с помощью less
less example2.txt

# В less:
# - Нажмите 'space' для перехода на следующую страницу.
# - Нажмите 'b' для возврата на предыдущую страницу.
# - Нажмите 'q' для выхода из программы.

### CodeGym
# Creating example2.txt file and populating it with 10 lines of text
echo "This is line number 1" >> example2.txt
echo "This is line number 2" >> example2.txt
echo "This is line number 3" >> example2.txt
echo "This is line number 4" >> example2.txt
echo "This is line number 5" >> example2.txt
echo "This is line number 6" >> example2.txt
echo "This is line number 7" >> example2.txt
echo "This is line number 8" >> example2.txt
echo "This is line number 9" >> example2.txt
echo "This is line number 10" >> example2.txt

# Opening the file using less
less example2.txt

# In less:
# - Press 'space' to go to the next page.
# - Press 'b' to go back to the previous page.
# - Press 'q' to exit the program.

### JavaRush
## Правильное решение:
## Author: JavaRush's team
# # Создание файла example2.txt и заполнение его 10 строками текста
# echo "Это строка номер 1" >> example2.txt
# echo "Это строка номер 2" >> example2.txt
# echo "Это строка номер 3" >> example2.txt
# echo "Это строка номер 4" >> example2.txt
# echo "Это строка номер 5" >> example2.txt
# echo "Это строка номер 6" >> example2.txt
# echo "Это строка номер 7" >> example2.txt
# echo "Это строка номер 8" >> example2.txt
# echo "Это строка номер 9" >> example2.txt
# echo "Это строка номер 10" >> example2.txt
#
# # Открытие файла с помощью less
# less example2.txt
#
# # В less:
# # - Нажмите 'space' для перехода на следующую страницу.
# # - Нажмите 'b' для возврата на предыдущую страницу.
# # - Нажмите 'q' для выхода из программы.

### CodeGym
## Correct solution:
## Author: CodeGym's team
# # Creating example2.txt file and populating it with 10 lines of text
# echo "This is line number 1" >> example2.txt
# echo "This is line number 2" >> example2.txt
# echo "This is line number 3" >> example2.txt
# echo "This is line number 4" >> example2.txt
# echo "This is line number 5" >> example2.txt
# echo "This is line number 6" >> example2.txt
# echo "This is line number 7" >> example2.txt
# echo "This is line number 8" >> example2.txt
# echo "This is line number 9" >> example2.txt
# echo "This is line number 10" >> example2.txt
#
# # Opening the file using less
# less example2.txt
#
# # In less:
# # - Press 'space' to go to the next page.
# # - Press 'b' to go back to the previous page.
# # - Press 'q' to exit the program.