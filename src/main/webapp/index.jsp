<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Index | JerseyWithMVC</title>
    <link rel="stylesheet" type="text/css" href="<c:url value="/css/style.css"/>"/>
</head>
<body>
<form action="<c:url value="/hello"/>" method="get">
        <legend>Type your name (MVC controller)</legend>
        <input class="inputField" type="text" name="userName" value="John Doe"/>
        <input class="submit" type="submit"/>
</form>
<form action="<c:url value="/rest/hello"/>" method="get">
        <legend>Type your name (Jersey resource)</legend>
        <input class="inputField" type="text" name="userName" value="Johnnie Doe" />
        <input class="submit" type="submit"/>
</form>
</body>
</html>