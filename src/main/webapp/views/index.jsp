<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>

<head>
    <link rel="stylesheet" type="text/css" href="/style.css">
</head>

<body>
<h1>Add User</h1>

<form action="addUser" method="post">
    <label for="username">Enter name:</label>
    <input type="text" id="username" name="name"><br>

    <label for="userAge">Enter age:</label>
    <input type="text" id="userAge" name="age"><br>

    <input type="submit" value="submit">

</form>
</body>

</html>