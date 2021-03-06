<%--
  Created by IntelliJ IDEA.
  User: 0XCAFEBABE
  Date: 2018/9/26
  Time: 15:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="${pageContext.request.contextPath}/bootstrap/css/bootstrap.min.css" rel="stylesheet"/>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-3.3.1.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/bootstrap/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/user.js"></script>
    <title>用户注册</title>
</head>
<body class="container">
<h1>用户注册</h1>
<form id="confirmRegister" class="form-horizontal" style="padding-top: 150px" method="post"
      action="${pageContext.request.contextPath}/register">
    <div class="form-group">
        <label for="username" class="col-sm-4 control-label">用户名</label>
        <div class="col-sm-4">
            <input name="username" type="username" class="form-control" id="username" placeholder="username">
        </div>
    </div>
    <div class="form-group">
        <label for="password" class="col-sm-4 control-label">密码</label>
        <div class="col-sm-4">
            <input name="password" type="password" class="form-control" id="password" placeholder="Password">
        </div>
    </div>
    <div class="form-group">
        <label for="rePassword" class="col-sm-4 control-label">确认密码</label>
        <div class="col-sm-4">
            <input name="rePassword" type="password" class="form-control" id="rePassword" placeholder="Password">
        </div>
    </div>
    <div class="form-group">
        <div class="col-sm-offset-4 col-sm-1">
            <button type="button" id="registerButton" onclick="register()" class="btn btn-default">注册</button>
        </div><span><font color="red" style="line-height: 35px" id="registerMessage"></font></span>
    </div>
    <c:if test="${registerMessage=='error'}">
        <script type="text/javascript">
            $("#registerMessage").html("用户已存在")
            <c:remove var="registerMessage" scope="session"/>
        </script>
    </c:if>
</form>
</body>
</html>
