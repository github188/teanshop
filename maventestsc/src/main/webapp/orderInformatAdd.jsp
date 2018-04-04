<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<meta name="renderer" content="webkit">
		<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
		<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
		<meta name="apple-mobile-web-app-status-bar-style" content="black">
		<meta name="apple-mobile-web-app-capable" content="yes">
		<meta name="format-detection" content="telephone=no">
		<link rel="stylesheet" type="text/css" href="common/layui/css/layui.css" media="all">
		<link rel="stylesheet" type="text/css" href="common/bootstrap/css/bootstrap.css" media="all">
		<link rel="stylesheet" type="text/css" href="common/global.css" media="all">
		<link rel="stylesheet" type="text/css" href="css/personal.css" media="all">
		<title>添加发货信息</title>
	</head>

<script type="text/javascript">

</script>
	<body>
		<section class="layui-larry-box">
			<div class="larry-personal">
				<header class="larry-personal-tit">
					<span>发货信息</span>
					
					<span style="margin-left:900px;"><a href="/shipper/list" class="btn btn-default">返回列表</a></span>
				</header>
				<!-- /header -->
				<div class="larry-personal-body clearfix changepwd">
					<form class="layui-form col-lg-4" method="post" action="/shipper/save">
						<div class="layui-form-item">
							<label class="layui-form-label">发货人</label>
							<div class="layui-input-block">
							<input type="text" name="shipper_name" autocomplete="off" class="layui-input" value="" >
							</div>
						</div>
						<div class="layui-form-item">
							<label class="layui-form-label">联系方式</label>
							<div class="layui-input-block">
								<input type="text" name="shipper_contact" autocomplete="off" class="layui-input" value="" >
							</div>
						</div>
						<div class="layui-form-item">
							<label class="layui-form-label">发货地址：</label>
							<div class="layui-input-block">
								<input type="text" name="shipper_address" autocomplete="off" class="layui-input" value="" >
							</div>
						</div>
						<div class="layui-form-item">
					<label class="layui-form-label">是否默认</label>
					<div class="layui-input-block">
						<input type="radio" name="shipper_default" value="1" title="是" checked="checked">
						<div class="layui-unselect layui-form-radio layui-form-radioed">
							<i class="layui-anim layui-icon"></i><span>是</span></div>
						<input type="radio" name="shipper_default" value="0" title="否">
						<div class="layui-unselect layui-form-radio">
							<i class="layui-anim layui-icon"></i><span>否</span></div>
					</div>
				</div>
						<div class="layui-form-item change-submit">
							<div class="layui-input-block">
								<button  type="submit" class="layui-btn" >立即提交</button>
								<button type="reset" class="layui-btn layui-btn-primary">重置</button>
							</div>
						</div>
					</form>
				</div>
			</div>
		</section>
		<script type="text/javascript" src="common/layui/layui.js"></script>
		<script type="text/javascript">
			layui.use(['form', 'upload'], function() {
				var form = layui.form();
			});
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