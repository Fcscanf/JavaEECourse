<%--
  Created by IntelliJ IDEA.
  User: fcsca
  Date: 2018-11-10
  Time: 下午 19:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Success</title>
    <style>
        body {
            background: url("../images/1.png");
            background-size: 50%;
        }
    </style>
</head>
<body>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + "/";
%>
留言成功，点击<a href="<%=basePath%>mainServlet">这里</a>返回主界面！
</body>
</html>
