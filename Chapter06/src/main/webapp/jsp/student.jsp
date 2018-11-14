<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="sx" uri="/struts-dojo-tags" %>
<%@ taglib prefix="sd" uri="/struts-dojo-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: fcsca
  Date: 2018-11-13
  Time: 下午 22:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>学生信息采集系统</title>
    <sx:head extraLocales="en"/>
</head>
<body>
<h3>添加学生信息</h3>
<s:form action="save" method="POST" theme="simple">
    <table>
        <tr>
            <td>学号：</td>
            <td>
                <s:textfield name="student.id"></s:textfield>
            </td>
        </tr>
        <tr>
            <td>姓名：</td>
            <td>
                <s:textfield name="student.name"></s:textfield>
            </td>
        </tr>
        <tr>
            <td>性别：</td>
            <td>
                <s:radio list="#{1:'男',2:'女'}" name="student.gender" value="1"></s:radio>
            </td>
        </tr>
        <tr>
            <td>专业：</td>
            <td>
                <s:textfield name="student.professional" label="专业"></s:textfield>
            </td>
        </tr>
        <tr>
            <td width="70">出生时间：</td>
            <td>
                <sx:datetimepicker name="student.birthday" id="birthday" displayFormat="yyyy-MM-dd" language="en"></sx:datetimepicker>
            </td>
        </tr>
        <tr>
            <td>备注：</td>
            <td>
                <s:textfield name="student.note" label="备注"></s:textfield>
            </td>
        </tr>
        <tr>
            <td><s:submit value="添加"/></td>
            <td>
                <s:reset value="重置"></s:reset>
            </td>
        </tr>
    </table>
</s:form>
</body>
</html>
