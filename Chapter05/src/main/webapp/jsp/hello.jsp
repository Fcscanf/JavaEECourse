<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: fcsca
  Date: 2018-11-11
  Time: 下午 13:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Struts</title>
</head>
<body>
<s:form action="struts.action" method="post">
    <s:textfield name="name" label="请输入姓名"></s:textfield>
    <s:submit value="提交"></s:submit>
</s:form>
</body>
</html>
