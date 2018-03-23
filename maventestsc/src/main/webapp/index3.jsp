<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
 <link rel="stylesheet" type="text/css" href="css/bootstrap.css" />
		<script src="js/jquery-3.0.0.js" type="text/javascript" charset="utf-8"></script>
		<script src="js/bootstrap.js" type="text/javascript" charset="utf-8"></script>
		<link rel="stylesheet" type="text/css" href="css/bootstrap.css" />
		<script src="js/bootstrap-table.js" type="text/javascript" charset="utf-8"></script>
		<script src="js/bootstrap-table-zh-CN.min.js" type="text/javascript" charset="utf-8"></script>
<title>Insert title here</title>
</head>
<script type="text/javascript">
		$(function(){
	$("#btn").click(function(){
		$("#form1").attr("action","UserServlet?type=findUser")
		$("#form1").submit();
	});
	
	$("#btn1").click(function(){
		$("#form1").attr("action","UserServlet?type=save")
		$("#form1").submit();
	});
	$("input[name='name']").blur(function(){
    	var name=$("input[name='name']").val();
    	$.post("UserServlet?type=findUser&name="+name,function(data){
    		if(data==0){
    			alert("可以使用");
    		}else{
    			alert("不能使用");
    			$("#btn1").attr("disabled","true");
    		}
    	});
    });
});
</script>
<body>
<form method="post"  name="myform"  id="form1">
  <div class="control-group  col-sm-offset-3">
    <label class="control-label" for="classno">用户名</label>
    <div class="controls">
      <input type="text"  name="name"   placeholder="请输入用户名">
    </div>
  </div>
  <div class="control-group col-sm-offset-3">
    <label class="control-label" for="inputPassword">密码</label>
    <div class="controls">
      <input type="password"  name="password" placeholder="请输入密码">
    </div>
  </div>
  <div class="control-group col-sm-offset-3">
    <div class="controls">
      <button type="button" class="btn"  id="btn">登录</button>
        <button type="button" class="btn" id="btn1">注册</button>
    </div>
  </div>
</form>
</body>
</html>