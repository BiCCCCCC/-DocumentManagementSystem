<%--
  Created by IntelliJ IDEA.
  User: WEI
  Date: 2022/7/18
  Time: 15:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="FALSE" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
多文件上传
<form action="${pageContext.request.contextPath}/upload" method="post" enctype="multipart/form-data">
    文件<input type="file" name="uploadFiles"><br/>
    文件<input type="file" name="uploadFiles"><br/>
    <input type="submit">
</form>
<br/>
<br/>
<br/>
单文件上传
<form action="${pageContext.request.contextPath}/upload1" method="post" enctype="multipart/form-data">
    文件<input type="file" name="uploadFile"><br/>
    <input type="submit">
</form>
</body>
</html>
