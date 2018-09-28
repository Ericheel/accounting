$(function () {

})

function addOne() {
    
}

function getAll() {
    $.ajax({
        type: "post",
        url: "/today",
        contentType: "application/json",
        success: function (data) {
            var obj = eval("(" + data + ")")
        }
    })
}