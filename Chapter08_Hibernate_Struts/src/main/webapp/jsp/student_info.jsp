<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: fcsca
  Date: 2018-11-19
  Time: 下午 18:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>学生选课系统</title>
</head>
<body bgcolor="#ffe4c4">
<table width="400">
    <s:set value="#request.student" var="student"/>
    <tr><td>学号</td><td><s:property value="#student.studentNumber"/></td></tr>
    <tr><td>姓名</td><td><s:property value="#student.studentName"/></td></tr>
    <tr>
        <td>性别</td>
        <td>
            <s:if test="#student.gender==1">男</s:if>
            <s:else>女</s:else>
        </td>
    </tr>
    <tr>
        <td>专业</td><td><s:property value="#student.professional.professionalName"></s:property> </td>
    </tr>
    <tr>
        <td>生日</td><td><s:property value="#student.birthday"></s:property> </td>
    </tr>
    <tr>
        <td>总学分</td><td><s:property value="#student.totalCredit"></s:property> </td>
    </tr>
    <tr>
        <td>备注</td><td><s:property value="#student.note"></s:property> </td>
    </tr>
    <tr>
        <td>照片</td><td><img src="getImage.action?student.studentNumber=<s:property value="#student.studentNumber"/>" width="150"> </td>
    </tr>
</table>
</body>
</html>
