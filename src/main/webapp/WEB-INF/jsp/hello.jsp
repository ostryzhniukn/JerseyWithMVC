<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Hi! | JerseyWithMVC</title>
</head>
<body>
    <a href="<c:url value="/"/>">Back</a>
    <br>
    <h1>Hello <c:out value="${param.userName}"/>!</h1>
</body>
</html>
