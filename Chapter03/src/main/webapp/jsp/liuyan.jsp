<%--
  Created by IntelliJ IDEA.
  User: fcsca
  Date: 2018-11-09
  Time: 下午 23:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>留言板</title>
    <style>
        body {
            background: url("../images/1.png");
            background-size: 50%;
        }
    </style>
</head>
<body>
<center>
    <%
        String path = request.getContextPath();
        String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + "/";
    %>
    <form action="<%=basePath%>addServlet" method="post">
        <table border="1">
            <caption>填写留言信息</caption>
            <tr>
                <td>留言标题</td>
                <td><input type="text" name="title"></td>
            </tr>
            <tr>
                <td>留言内容</td>
                <td><textarea name="context" rows="5" cols="35"></textarea> </td>
            </tr>
        </table>
        <input type="submit" value="提交">
        <input type="reset" value="重置">
    </form>
</center>
</body>
</html>
