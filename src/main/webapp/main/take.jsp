<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/take.js"></script>
</head>
<body>
<div>
    <button onclick="getAll()" type="button" class="btn btn-default btn-lg">查看今天</button>
    <button onclick="addOne()" type="button" class="btn btn-default btn-lg">记录一条</button>
</div>
<div>
    <table id="all" style="display: none" class="table table-bordered">
    </table>
</div>
</body>
</html>
