# Lab 1 Application with common JavaEE architecture
## Абдулвалеев Крупников 6133

Для начала работы необходимо скачать и установить GlassFish. В данной работе был скачана и установлена 5 версия.
В папке config редактируем файл asenv.bat и добавляем строчку:
```
set AS_JAVA=C:\Program Files\Java\AmazonCorreto8\jdk1.8.0_352 
```
Далее запускаем glassfish из директории glassfish5\bin крмандой
```
asadmin start-domain 
```

# Настройка GlassFish из административного окна
Ниже приведены настройки конфигурации pool'а и resource tabl'а:

![image](https://user-images.githubusercontent.com/87262680/212562760-4894ccc6-38bb-46d6-b644-b0cad22fc491.png)


![image](https://user-images.githubusercontent.com/87262680/212562768-b1b5ce70-f530-480d-a4a6-8d8a872d4c76.png)


![image](https://user-images.githubusercontent.com/87262680/212562777-3ee3b8be-60e6-4e66-9241-4afb165382fa.png)

# Связи в бд

![image](https://user-images.githubusercontent.com/87262680/212563299-b29cc421-8f52-4187-8304-255aa1548cad.png)


# Данные в бд

![image](https://user-images.githubusercontent.com/87262680/212563274-c19ef87a-dbbe-4fdf-80a1-d1ea2445d894.png)


![image](https://user-images.githubusercontent.com/87262680/212563275-a8541792-c654-4789-9def-ea22d7079b3f.png)


# Отображение данных бд на web

![image](https://user-images.githubusercontent.com/87262680/212776997-f113d12c-c524-459a-9b14-97c2336dfdba.png)

По первой кнопке выводит список авторов

![image](https://user-images.githubusercontent.com/87262680/212777031-05a1ac9d-eec9-4b46-81a2-3f7df52e9c42.png)

По второй ссылке выводит список книг

![image](https://user-images.githubusercontent.com/87262680/212777599-61d28a17-5626-445c-82ef-94dcfa3ad191.png)

Третья ссылка это окно добавления книги, добавим например еще одну книгу лавкрафта азатот:

![image](https://user-images.githubusercontent.com/87262680/212777158-b5cf3b76-df46-4fb4-adab-2398e65b1594.png)

После редиректа на главную страницу если снова вывести список книг увидим там Азатота:

![image](https://user-images.githubusercontent.com/87262680/212777231-51b6f647-e17a-4aef-9c24-2e45b05be9a9.png)

Четвертая ссылка с главной страницы ведет на страницу удаления книги, где вводится ее название:

![image](https://user-images.githubusercontent.com/87262680/212777351-5d2f886d-fff6-4859-bf44-f77fbf93809a.png)
 
Удалим созданного азатота и проверим что все удалилось:

![image](https://user-images.githubusercontent.com/87262680/212777423-bac37f94-02bf-40c6-9e55-10df486bc275.png)

![image](https://user-images.githubusercontent.com/87262680/212777461-f80c1924-cc77-49d2-8bd3-00a38340d12f.png)

![image](https://user-images.githubusercontent.com/87262680/212777472-c3a567c5-8375-4a0d-a0df-d8605ee0503b.png)

Удаление происходит по вводу имени, сначала находится книга по имени, а потом она удаляется.




