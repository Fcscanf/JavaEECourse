<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>登录界面</title>
</head>
<body>
<h2>Hello World!</h2>
<s:form action="login.action" method="POST">
    <s:textfield name="studentNumber" label="学号"/>
    <s:password name="password" label="密码"/>
    <s:submit value="登录"/>
</s:form>
</body>
</html>
