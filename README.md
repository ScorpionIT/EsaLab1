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

![image](https://user-images.githubusercontent.com/87262680/212562808-a56eb052-d793-42dc-ba56-638440182518.png)

Если нажать на кнопку, то :

![image](https://user-images.githubusercontent.com/87262680/212562850-2a7c5dfb-319e-4720-a7bd-fd54fcf57ddf.png)
