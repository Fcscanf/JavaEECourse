<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.Iterator" %>
<%@ page import="cn.fcsca.model.LyTable" %>
<%@ page import="cn.fcsca.utils.DB" %><%--
  Created by IntelliJ IDEA.
  User: fcsca
  Date: 2018-11-10
  Time: 下午 12:22
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
<form action="liuyan.jsp" method="post">
    <table border="1">
        <caption>所有留言信息</caption>
        <tr>
            <th>留言人姓名</th>
            <th>留言时间</th>
            <th>留言标题</th>
            <th>留言内容</th>
        </tr>
        <%
            ArrayList arrayList = (ArrayList) session.getAttribute("arrayList");
            Iterator iterator = arrayList.iterator();
            while (iterator.hasNext()) {
                LyTable lyTable = (LyTable) iterator.next();
        %>
        <tr>
            <td><%=new DB().getUserName(lyTable.getUserId())%></td>
            <td><%=lyTable.getDate().toString()%></td>
            <td><%=lyTable.getTitle()%></td>
            <td><%=lyTable.getContent()%></td>
        </tr>
        <%
            }
        %>
    </table>
    <input type="submit" value="留言">
</form>
</body>
</html>
