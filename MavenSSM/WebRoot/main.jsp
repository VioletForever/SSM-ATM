<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
<title>欢迎进入主页面</title>
<link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
<style type="text/css">
	img{
		width:100%;
		height:100%;
		cursor:pointer;
	}
	.download{
		font-weight:bolder;
	}
	.mainJPG{
		margin:80px auto;
	}
	body {
    background-image: url(../images/back.jpg);
    font-size: 14px;
}
</style>
</head>
<body>
	<nav class="navbar navbar-default navbar-fixed-top" role="navigation">
		<div class="container-fluid">
			<div class="navbar-header">
				<a class="navbar-brand" >欢迎,${userName}</a>
				<p class="navbar-brand">余额:${money}</p>
			</div>			
			<div>
				<ul class="nav navbar-nav">
					<li><a href="main.jsp">首页</a></li>
					<li><a href="getMoney.jsp" class="download" >取款</a></li>
					<li><a href="putMoney.jsp" class="download">存款</a></li>
					<li><a href="lock.jsp" class="download">锁定</a></li>
					<li><a href="setPassword.jsp"class="download">修改密码</a></li>
					<li><a href="transferMoney.jsp"class="download">转账</a></li>
				</ul>
			</div>
		</div>
	</nav>


</body>
</html>