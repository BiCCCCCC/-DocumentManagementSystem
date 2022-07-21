<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="FALSE" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Springmvc文件下载</title>
</head>
<body>
<h2>Springmvc文件下载</h2>

txt <a href="${pageContext.request.contextPath}/download/test.txt"> test.txt </a><br>
jpg <a href="${pageContext.request.contextPath}/download/test.jpg"> test.jpg </a>



<h2>Springmvc文件预览载</h2>

txt <a href="${pageContext.request.contextPath}/preview/test.txt"> test.txt </a><br>
jpg <a href="${pageContext.request.contextPath}/preview/test.jpg"> test.jpg </a>
</body>
</html>