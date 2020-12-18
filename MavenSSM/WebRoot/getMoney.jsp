<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
    <title>取款</title>
    <link href="css/login.css" rel="stylesheet" />
    <script src="js/jquery-3.5.0.min.js"></script>
    <script src="js/getMoney.js"></script>
</head>

<body>
<input type='hidden' value='${money}'id='mon'/>
    <div id="loginForm">
        <form>
            <h3>取款</h3>
            <h3>当前余额:<p>${money}</p></h3>
           
            <p><input id="money" name="money" type="text" placeholder="取款金额" />
                
                <span class="auth_err" id="moneyError"></span>
            </p>
            <p>
                <input id="btLogin" type="button" value="取&nbsp;&nbsp;款 " onclick="jqAjaxGetMoney();" />
                <span class="auth_err" id="checkError"></span>
            </p>
        </form>
    </div>
</body>

</html>