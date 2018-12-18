<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Mr.Tong
  Date: 2018/11/4
  Time: 14:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:forEach items="${userList}" var="user">
    编号：${user.id}
    账号：${user.name}
    密码：${user.pwd}
</c:forEach>
</body>
</html>
