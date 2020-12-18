
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
var userName_correct = false;




/**
 * 取款
 */
function jqAjaxTransferMoney() {
    /*if (!money_correct||!userName_correct) {
     *   $("#money").blur();
     *   $("#userName").blur();
     *   return;
    }*/
    var getMoney = parseFloat(document.getElementById("money").value);
   	var balance = parseFloat(document.getElementById("mon").value);
    var data;
        data = { transferMoney: money, toId: $("#userName").val(), balance: balance}
    $.ajax({
        type: "post",
        url: "transferMoney.do",
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
   		 var getMoney = parseFloat(document.getElementById("money").value);
   		 var money = parseFloat(document.getElementById("mon").value);
   		 $("#money").text(money);
        if ($(this).val() == "") {
            $("#moneyError").text("取款金额不能为空！");
            money_correct = false;
        }
        else if(getMoney>money){
        	$("#moneyError").text("余额不足");
        	money_correct = false;
        }
        else {
            $("#moneyError").text("");
            money_correct = true;
        }
    });
    
    $("#userName").blur(function(e) {
        if ($(this).val() == "") {
            $("#userNameError").text("账号不能为空！");
            userName_correct = false;
        } else {
            $("#userNameError").text("");
            userName_correct = true;
        }
    });
});