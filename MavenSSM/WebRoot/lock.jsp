<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
    <title>锁定账户</title>
    <link href="css/login.css" rel="stylesheet" />
    <script src="js/jquery-3.5.0.min.js"></script>
    <script src="js/lock.js"></script>
</head>

<body>
<input type='hidden' value='${money}'id='mon'/>
    <div id="loginForm">
        <form>
            <h3>锁定账户</h3>
            <p>
                <input id="btLogin" type="button" value="锁&nbsp;&nbsp;定 " onclick="jqAjaxlock();" />
                <span class="auth_err" id="checkError"></span>
            </p>
        </form>
    </div>
</body>

</html>