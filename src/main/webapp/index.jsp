<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Index | JerseyWithMVC</title>
</head>
<body>
<form action="<c:url value="/hi"/>" method="get">
    <fieldset>
        <legend>Type your name</legend>
        <input type="text" name="userName"/>
        <input type="submit">
    </fieldset>
</form>
</body>
</html>