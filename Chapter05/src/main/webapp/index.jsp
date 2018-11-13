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
    <title>文件上传</title>
</head>
<body>
<s:form action="upload.action" method="post" enctype="multipart/form-data">
    <s:file name="upload" label="上传的文件1"></s:file>
    <s:file name="upload" label="上传的文件2"></s:file>
    <s:file name="upload" label="上传的文件3"></s:file>
    <s:submit value="上传"></s:submit>
</s:form>
</body>
</html>
