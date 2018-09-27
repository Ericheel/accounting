<%--
  Created by IntelliJ IDEA.
  User: 0XCAFEBABE
  Date: 2018/9/26
  Time: 11:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="${pageContext.request.contextPath}/bootstrap/css/bootstrap.min.css" rel="stylesheet"/>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-3.3.1.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/bootstrap/js/bootstrap.min.js"></script>
    <title>用户登录</title>
</head>
<body class="container">
<h1>EZ-Accounting</h1>
<form method="post" action="${pageContext.request.contextPath}/login" id="confirmLogin" class="form-horizontal"
      style="padding-top: 150px">
    <div class="form-group">
        <label for="username" class="col-sm-4 control-label">用户名</label>
        <div class="col-sm-4">
            <input name="username" type="username" class="form-control" id="username" placeholder="username">
        </div>
        <span><font color="red" style="line-height: 35px" id="usernameMessage"></font></span>
    </div>
    <div class="form-group">
        <label for="password" class="col-sm-4 control-label">密码</label>
        <div class="col-sm-4">
            <input name="password" type="password" class="form-control" id="password" placeholder="Password">
        </div>
        <span><font color="red" style="line-height: 35px" id="passwordMessage"></font></span>
    </div>
    <div class="form-group">
        <div class="col-sm-offset-4 col-sm-4">
            <div class="checkbox">
                <label>
                    <input type="checkbox"> 记住我
                </label>
            </div>
        </div>
    </div>
    <div class="form-group">
        <div class="col-sm-offset-4 col-sm-2">
            <button type="button" onclick="userLogin()" class="btn btn-default">登录</button>
        </div>
        <div class="col-sm-2">
            <a href="${pageContext.request.contextPath}/register.jsp" class="btn btn-default">注册</a>
        </div>
    </div>
</form>
</body>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/user.js"></script>
</html>

