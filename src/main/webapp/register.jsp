<%--
  Created by IntelliJ IDEA.
  User: 0XCAFEBABE
  Date: 2018/9/26
  Time: 15:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户注册</title>
    <script src="js/user.js"></script>
</head>
<body>
<form id="confirmRegister" method="post" action="${pageContext.request.contextPath}/register">
    用户名:<input id="username" type="text" name="username"/><br/>
    密码:<input id="password" type="password" name="password"/><br/>
    确认密码:<input type="password" name="rePassword"/><br/>
    <button onclick="register()" >注册</button>
</form>
</body>
</html>
