function register () {
    var $username = replaceAll($("#username").val(), " ", "");
    var $password = replaceAll($("#password").val(), " ", "");
    var $rePassword = replaceAll($("#rePassword").val(), " ", "");
    if ($username === "" || $password === "" || $rePassword === "") {
        $("#registerMessage").html("所需内容不能为空")
        return;
    }
    if ($password !== $rePassword) {
        $("#registerMessage").html("两次密码不一致")
        return;
    }
    $("#confirmRegister").submit();
}

function userLogin() {
    var $username = replaceAll($("#username").val(), " ", "");
    var $password = replaceAll($("#password").val(), " ", "");

    if ($username === "") {
        $("#usernameMessage").html("用户名为空")
        return;
    }
    if ($password === "") {
        $("#passwordMessage").html("密码为空")
        return;
    }

    $("#confirmLogin").submit()
}

function replaceAll(who, origin, target) {
    who = who.replace(origin,target)
    if (who.indexOf(origin) !== -1) {
        who = replaceAll(who, origin, target);
    }
    return who;
}

function showPopover(target, msg) {
    target.attr("data-original-title", msg);
    $('[data-toggle="tooltip"]').tooltip();
    target.tooltip('show');
    target.focus();

    //2秒后消失提示框
    var id = setTimeout(
        function () {
            target.attr("data-original-title", "");
            target.tooltip('hide');
        }, 2000
    );
}
