<%@ page import="com.model.User" %>
<%@ page isELIgnored="false" %>
<%--
  Created by IntelliJ IDEA.
  User: Feeling
  Date: 2014/12/9
  Time: 12:44
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<%
User user=(User)request.getAttribute("user");
    System.out.println(user.getUsername());
%>
${user.username}
${message}
</body>
</html>
