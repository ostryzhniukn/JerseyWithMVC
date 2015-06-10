<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Hi! | JerseyWithMVC</title>
    <link rel="stylesheet" type="text/css" href="<c:url value="/css/style.css"/>"/>
</head>
<body>
    <a id="backButton" href="<c:url value="/"/>">
        <span id="backButtonCaption">
            Back
        </span>
    </a>
    <div id="greeting">
        <h1>Hello <c:out value="${param.userName}"/>!</h1>
    </div>
</body>
</html>
