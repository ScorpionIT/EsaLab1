<%--
  Created by IntelliJ IDEA.
  User: Руслан
  Date: 17.01.2023
  Time: 2:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form name="delete_book" action="<%=request.getContextPath()%>/deleteBook-servlet">

  <label for="name">Введите название книги, которую хотите удалить:</label>
  <input type="text" id="name" name="name" required>
  <p></p>

  <button type="submit">Удалить</button>

</form>
</body>
</html>
