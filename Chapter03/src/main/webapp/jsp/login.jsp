<%--
  Created by IntelliJ IDEA.
  User: fcsca
  Date: 2018-11-09
  Time: 下午 22:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>FCC的留言板</title>
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
<form action="<%=basePath%>mainServlet" method="post">
    <table align="center">
        <caption>用户登录</caption>
        <tr>
            <td>登录名:</td>
            <td><input type="text" name="username" size="20"></td>
        </tr>
        <tr>
            <td>密码:</td>
            <td><input type="password" name="pwd" size="21"></td>
        </tr>
    </table>
    <input type="submit" value="登录"/>
    <input type="reset" value="重置"/>
</form>
如果没有注册单击<a href="/jsp/register.jsp">这里</a>注册！
</body>
</html>
