<%--
  Created by IntelliJ IDEA.
  User: Mr.Tong
  Date: 2018/11/4
  Time: 13:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"  %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
    out.print(request.getAttribute("name"));
    %>
    ${name}
</body>
</html>
