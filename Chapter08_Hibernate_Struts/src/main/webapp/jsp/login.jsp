<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: fcsca
  Date: 2018-11-19
  Time: 下午 18:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>学生选课系统</title>
    <%--<style>--%>
        <%--body{--%>
            <%--background: "../images/1.jpg";--%>
            <%--background-size: 50%;--%>
        <%--}--%>
    <%--</style>--%>
</head>
<body>
<s:form action="login.action" method="POST">
    <table align="center">
        <tr>
            <td colspan="2"><img src="" sizes="100%"></td>
        </tr>
        <tr>
            <s:textfield name="login.studentNumber" label="学号" size="20"></s:textfield>
        </tr>
        <tr>
            <s:password name="login.password" label="密码" size="22"></s:password>
        </tr>
        <tr>
            <td><input type="submit" value="登录"></td>
            <td><input type="reset" value="重置"></td>
        </tr>
    </table>
</s:form>
</body>
</html>
