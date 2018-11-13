<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: fcsca
  Date: 2018-11-11
  Time: 下午 13:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Hello,Welcome</title>
</head>
<body>
Hello:<s:property value="#request.name"/>!

<br>
<s:bean name="cn.fcsca.model.Student">
    <s:param name="name" value="'樊乘'"/>
    <s:property value="name"/>
</s:bean>
<%--<s:bean name="cn.fcsca.model.Student" id="s">
    <s:param name="name" value="'樊乘'"/>
</s:bean>
<s:property value="#s.name"/>--%>

<br>
<s:date name="date"></s:date><br>
<s:date name="date" nice="true"></s:date><br>
<s:date name="date" format="Year-Mouth-Day HH:mm:ss"></s:date>

<<br>
<%--<table border="1" width="200">
    <s:iterator value="{'apple','orange','pear','banana'}" id="fruit" status="st">
        <tr <s:if test="#st.even">style="background-color: blue" </s:if>>
            <td><s:property value="fruit"/> </td>
        </tr>
    </s:iterator>
</table>--%>

</body>
</html>
