<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: fcsca
  Date: 2018-11-19
  Time: 下午 18:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>学生选课系统</title>
</head>
<body>
<table width="400" border="1">
    <caption>你的选课信息如下：</caption>
    <tr>
        <th>课程号</th><th>课程名</th><th>开学时间</th><th>学时</th><th>学分</th><th>操作</th>
    </tr>
    <s:iterator var="course" value="#request.list">
        <tr>
            <td align="center"><s:property value="#course.courseNumber"/> </td>
            <td align="center"><s:property value="#course.courseName"/> </td>
            <td align="center"><s:property value="#course.schoolYear"/> </td>
            <td align="center"><s:property value="#course.courseTime"/> </td>
            <td align="center"><s:property value="#course.courseCredit"/> </td>
            <td align="center">
                <a href="delCou.action?course.courseNumber=<s:property value="#course.courseNumber"/> "
                   onClick="if (!confirm('你确定退选该课程吗？')) return false;else return true;">退选</a>
            </td>
        </tr>
    </s:iterator>
</table>
</body>
</html>
