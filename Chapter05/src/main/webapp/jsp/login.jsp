<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: fcsca
  Date: 2018-11-13
  Time: 上午 7:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
</head>
<body>
<s:i18n name="messageResource">
    <s:form action="login.action" method="POST">
        <s:textfield name="user.id" key="username"></s:textfield>
        <s:password name="user.password" key="password" size="21"></s:password>
        <s:submit value="%{getText('login')}"/>
    </s:form>
</s:i18n>
</body>
</html>
