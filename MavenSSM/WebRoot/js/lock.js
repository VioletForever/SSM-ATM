
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
 * 锁定
 */
function jqAjaxlock() {
    var data;
        data = {}
    $.ajax({
        type: "post",
        url: "lock.do",
        data: data,
        dataType: "json",
        success: function(response) {
            if (response.code == 0) {
                window.location.href = "login.html";
            } 
        }
    });
}

