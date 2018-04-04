<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>发货人信息管理</title>
	</head>
	<meta charset="UTF-8">
	<title>个人信息</title>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta name="renderer" content="webkit">
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
	<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
	<meta name="apple-mobile-web-app-status-bar-style" content="black">
	<meta name="apple-mobile-web-app-capable" content="yes">
	<meta name="format-detection" content="telephone=no">

	<script src="js/bootstrap.js" type="text/javascript" charset="utf-8"></script>
	<script src="js/bootstrap-table.js" type="text/javascript" charset="utf-8"></script>
	<script src="js/locale/bootstrap-table-zh-CN.min.js" type="text/javascript" charset="utf-8"></script>

	<link rel="stylesheet" type="text/css" href="/common/layui/css/layui.css" media="all">
	<link rel="stylesheet" type="text/css" href="/common/bootstrap/css/bootstrap.css" media="all">

	<link rel="stylesheet" type="text/css" href="/common/global.css" media="all">
	<link rel="stylesheet" type="text/css" href="/css/personal.css" media="all">
	<script src="/js/jquery-3.0.0.js" type="text/javascript" charset="utf-8"></script>
	<link rel="stylesheet" type="text/css" href="/css/bootstrap.css" />
	<link rel="stylesheet" type="text/css" href="/css/bootstrap.css" />
	</head>
	<script type="text/javascript">
	
	function add() {
		document.forms[0].action = "/orderInformatAdd.jsp";
		document.forms[0].submit();
	}

	</script>  

	<body>
		<section class="layui-larry-box">
			<div class="larry-personal">
				<div class="layui-tab">
					<form action="" method="post">
						<blockquote class="layui-elem-quote news_search">
							<button type="button" class="btn btn-info" onclick="add()">添加发货信息</button> 
						</blockquote>

						<div class="layui-tab-content larry-personal-body clearfix mylog-info-box">
							<!-- 操作日志 -->
							<div class="layui-tab-item layui-field-box layui-show">

								<table class="layui-table table-hover" lay-even="" lay-skin="nob">

									</tr>
									<thead>
										<tr>
											<th><input type="checkbox" id="selected-all"></th>
											<th>ID</th>
											<th>发货人</th>
											<th>联系方式</th>
											<th>发货地址</th>
											<th>是否默认</th>
											<th>操作</th>
										</tr>
									</thead>
									<tr>
										</thead>
										<tbody>
											
											<c:forEach items="${list}" var="p" varStatus="stea">
												<tr>
													<td><input type="checkbox"></td>
													<th>${p.shipper_id }</th>
													<th>${p.shipper_name}</th>
													<th>${p.shipper_contact}</th>
													<th>${p.shipper_address}</th>
													<th>${p.shipper_default}</th>
												<%-- 	<c:if test="${p.shipper_default==1}">
													<th>是</th>
													</c:if>
													<c:if test="${p.shipper_default==0}">
													<th>否</th>
													</c:if>
													
													
													 --%>
												<th>
														<a href="/shipper/delete/${p.shipper_id}" class="layui-btn layui-btn-small ">删除</a>
														<a href="/shipper/init/${p.shipper_id}" class="btn btn-default">修改</a>
													</th>
													
												</tr>
											</c:forEach>
										</tbody>
								</table>
								
							</div>
							<!-- 登录日志 -->
							<div class="layui-tab-item layui-field-box ">
								<table class="layui-table table-hover " lay-even=" " lay-skin="nob ">
									<thead>
										<tr>
											<th><input type="checkbox " id="selected-all "></th>
											<th>ID</th>
											<th>管理员账号</th>
											<th>状态</th>
											<th>最后登录时间</th>
											<th>上次登录IP</th>
											<th>登录IP</th>
											<th>IP所在位置</th>
										</tr>
									</thead>
									<tbody>
										<tr>
											<td><input type="checkbox "></td>
											<td>110</td>
											<td>admin</td>
											<td>后台登录成功</td>
											<td>2016-12-19 14:26:03</td>
											<td>127.0.0.1</td>
											<td>127.0.0.1</td>
											<td>Unknown</td>
										</tr>
									</tbody>
								</table>
					</form>
					<div class="larry-table-page clearfix ">
						<a href="javascript:; " class="layui-btn layui-btn-small "><i class="iconfont icon-shanchu1 "></i>删除</a>
						<div id="page2 " class="page "></div>
					</div>
					</div>
					</div>
				</div>
			</div>
		</section>
		<script type="text/javascript " src="/common/layui/layui.js "></script>
	
	</body>

</html>