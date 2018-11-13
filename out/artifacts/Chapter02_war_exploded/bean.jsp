<%--
  Created by IntelliJ IDEA.
  User: fcsca
  Date: 2018-11-05
  Time: 下午 14:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>useBean动作元素的应用</title>
</head>
<body>
<jsp:useBean id="test" scope="page" class="cn.fcsca.TestBean"/>
<%
    test.setStr("盐城工学院");
    String s = test.getStr();
    out.print(s);
%>
</body>
</html>
