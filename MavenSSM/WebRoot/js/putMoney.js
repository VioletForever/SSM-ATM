
var xmlHttp;

//创建XMLHttpRequest对象
function createXmlHttp() {
    if (window.XMLHttpRequest) {
        xmlHttp = new XMLHttpRequest();
    } else {
        xmlHttp = new ActiveXObject("Microsoft.XMLHTTP");
    }
}

var money_correct = false;




/**
 * 存款
 */
function jqAjaxPutMoney() {
    if (!money_correct) {
        $("#money").blur();
        return;
    }
    var putMoney = parseFloat(document.getElementById("money").value);
   	var money = parseFloat(document.getElementById("mon").value);
    var data;
        data = { money: (money+putMoney) }
    $.ajax({
        type: "post",
        url: "updateMoney.do",
        data: data,
        dataType: "json",
        success: function(response) {
            if (response.code == 0) {
                window.location.href = "main.jsp";
            } else {
                $("#checkError").text(response.info);
            }
        }
    });
}


$(document).ready(function() {

    $("#money").blur(function(e) {
        if ($(this).val() == "") {
            $("#moneyError").text("存款金额不能为空！");
            money_correct = false;
        }
        else {
            $("#moneyError").text("");
            money_correct = true;
        }
    });
});