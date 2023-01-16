<%--
  Created by IntelliJ IDEA.
  User: Руслан
  Date: 17.01.2023
  Time: 0:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Создание новой книги</title>
</head>
<body>
<form name="create_book" action="<%=request.getContextPath()%>/addBook-servlet">
    <label for="author">Введите автора книги:</label>
    <input type="text" id="author" name="author" required>
    <p></p>

    <label for="book_name">Введите название книги:</label>
    <input type="text" id="book_name" name="book_name" required>
    <p></p>

    <label for="publish">Введите дату публикации книги:</label>
    <input type="text" id="publish" name="publish" required>
    <p></p>

    <label for="num_of_pages">Введите количество страниц в книге:</label>
    <input type="text" id="num_of_pages" name="num_of_pages" required>
    <p></p>

    <button type="submit">Создать</button>
</form>
</body>
</html>
