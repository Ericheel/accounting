register = function () {
    var $username = $("#username");
    var $password = $("#password");

    if($username===""||$password===""){
        alert("呜啦啦啦啦");
        return;
    }
    $("#confirmRegister").submit();
}

userLogin = function () {
    alert("123")
    var $username = $("#username");
    var $password = $("#password");

    if($username===""||$password===""){
        alert("呜啦啦啦啦");
        return;
    }

    $("#confirmLogin").submit()
}