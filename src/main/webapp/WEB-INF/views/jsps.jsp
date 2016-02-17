<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>WebChat</title>
    <meta charset="UTF-8"/>
</head>
<body>
    <h1>Сделайте выбор</h1>
    <p><a href="<c:url value="/interfacejsps/history"/>">Перейти к истории сообщений</a></p>
    <p><a href="<c:url value="/interfacejsp/chat"/>">Перейти к чату</a></p>
</body>
</html>
