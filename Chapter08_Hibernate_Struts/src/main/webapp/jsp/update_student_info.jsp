<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: fcsca
  Date: 2018-11-19
  Time: 下午 18:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>学生信息修改</title>
</head>
<body bgcolor="#ff7f50">
<s:set var="student" value="#request.student"></s:set>
<s:form action="updateStu.action" name="student.studentNumber" method="POST" enctype="multipart/form-data">
    <table>
        <tr>
            <td>学号</td>
            <td><input type="text"
                       name="student.studentNumber"
                       value="<s:property value="#student.studentNumber"/>"
                       readonly/>
            </td>
        </tr>
        <tr>
            <td>姓名</td>
            <td><input type="text"
                       name="student.studentNumber"
                       value="<s:property value="#student.studentName"/>"/>
            </td>
        </tr>
        <tr>
            <td>专业</td>
            <td>
                <select id="professional" name="professional.id">
                    <s:iterator value="#request.selectProfessional">
                        <option value="<s:property value="#professional.id"/> ">
                            <s:property value="#professional.professionalName"/>
                        </option>
                    </s:iterator>
                </select>
            </td>
        </tr>
        <tr>
            <td>生日</td>
            <td><input type="text"
                       name="student.birthday"
                       value="<s:date
                       name="#student.birthday" format="yyyy-MM-dd"/>"/>
            </td>
        </tr>
        <tr>
            <td>备注</td>
            <td><input type="text"
                       name="student.note"
                       value="<s:property value="#student.note"/>"/>
            </td>
        </tr>
        <tr>
            <td>总学分</td>
            <td><input type="text"
                       name="student.totalCredit"
                       value="<s:property value="#student.totalCredit"/>"/>
            </td>
        </tr>
        <tr>
            <td>照片</td>
            <td><input type="file" name="photoFile"/></td>
        </tr>
        <tr>
            <td><input type="submit" value="修改"></td>
        </tr>
    </table>
</s:form>
</body>
</html>
