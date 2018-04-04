<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8">
	<title>个人信息</title>
	<meta name="renderer" content="webkit">	
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">	
	<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">	
	<meta name="apple-mobile-web-app-status-bar-style" content="black">	
	<meta name="apple-mobile-web-app-capable" content="yes">	
	<meta name="format-detection" content="telephone=no">	
	<script src="/js/jquery-3.0.0.js" type="text/javascript" charset="utf-8" media="all"></script>
	<link rel="stylesheet" type="text/css" href="/common/layui/css/layui.css" media="all">
	<link rel="stylesheet" type="text/css" href="/common/bootstrap/css/bootstrap.css" media="all">
	<link rel="stylesheet" type="text/css" href="/common/global.css" media="all">
	<link rel="stylesheet" type="text/css" href="/css/personal.css" media="all">
</head>
<script type="text/javascript">
	$(function(){
	//重新渲染表单
	function renderForm(){
	  layui.use('form', function(){
	   var form = layui.form();//高版本建议把括号去掉，有的低版本，需要加()
	   form.render();
	  });
	 }
	
	$("#product_name").on("click",function(){
		console.log(2323423423)
	})
	//因为是layui插件，所有需要套在layui.use里面
	layui.use("form", function () {
		//这里form是form表单
	    var form = layui.form();
	    // 代码写在这里面.
	    form.on('select(aihao)', function(data){
	    
	     });  
	})
});
</script>
<body>
<section class="layui-larry-box">
	<div class="larry-personal">
		<header class="larry-personal-tit">
			<span>增加商品</span>
		</header><!-- /header -->
		<div class="larry-personal-body clearfix">
			<form class="layui-form col-lg-5" action="/pt/inpt" method="post">
				<div class="layui-form-item">
					<label class="layui-form-label">商品种类</label>
					<div class="layui-input-block">  
						 <input name="ptname" class="layui-input" type="text" placeholder="请输入标题" autocomplete="off" lay-verify="required">
					</div>
				</div>
				<div class="layui-form-item">
					<div class="layui-input-block">
						<button class="layui-btn" lay-filter="demo1" lay-submit="">立即提交</button>
						<button type="reset" class="layui-btn layui-btn-primary">重置</button>
						<a href="/pt/listPt" class="layui-btn layui-btn-primary">返回</a>
					</div>
				</div>
				</div>
			</form>
		</div>
	</div>
</section>
<script type="text/javascript" src="/common/layui/layui.js"></script>
<script type="text/javascript">
function show_sub(){     
	alert("123456");   
    alert(v);     
} 
	layui.use(['form','upload'],function(){
         var form = layui.form();
         layui.upload({ 
             url: '' ,//上传接口 
             success: function(res){
              //上传成功后的回调 
              console.log(res) 
            } 
         });
	});
</script>
</body>
</html>