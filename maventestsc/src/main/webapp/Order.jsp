<%@page import="com.bean.Ptype"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<meta charset="UTF-8">
<title>订单管理</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="renderer" content="webkit">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1">
<meta name="apple-mobile-web-app-status-bar-style" content="black">
<meta name="apple-mobile-web-app-capable" content="yes">
<meta name="format-detection" content="telephone=no">
<link rel="stylesheet" type="text/css"
	href="/common/layui/css/layui.css" media="all">
<link rel="stylesheet" type="text/css"
	href="/common/bootstrap/css/bootstrap.css" media="all">
<link rel="stylesheet" type="text/css" href="/common/global.css"
	media="all">
<link rel="stylesheet" type="text/css" href="/css/personal.css"
	media="all">
<script src="/js/jquery-3.0.0.js" type="text/javascript" charset="utf-8"></script>
</head>
<script type="text/javascript">
function queryInfo(){
	  document.forms[0].action="OrderSerivce";
	  document.forms[0].submit();
}
</script>
<body>
	<section class="layui-larry-box ">
	<div class="larry-personal">
		<form action="" method="post">
			<div class="layui-tab ">
				<blockquote class="layui-elem-quote news_search">
					<div class="layui-inline">
					
					<c:forEach items="${list}" var="l" varStatus="stea">
					
						<form action="/Order/listorder" method="post">
							<div class="layui-inline">
								<select id="order_status" name="order_status"
									class="form-control" style="width: 150px; height: 40px;"
									lay-filter="aihao">
									<option value="${l.order_status }">订单状态</option>
									<option value="1">未确认</option>
									<option value="2">已确认</option>
									<option value="3">已取消</option>
			
									<option value="4">已完成</option>
								</select>
							</div>
							<div class="layui-inline">
								<select id="payment_status" name="payment_status"
									 class="form-control"
									style="width: 150px; height: 40px;" lay-filter="aihao">
									<option value="0">支付状态</option>
									<option value="1">未支付</option>
									<option value="2">已支付</option>
									<option value="3">已退款</option>
								</select>
							</div>
							<div class="layui-inline">
								<select id="distribution_state" name="distribution_state"
									 class="form-control"
									style="width: 150px; height: 40px;" lay-filter="aihao">
									<option value="0">配送状态</option>
									<option value="1">未发货</option>
									<option value="2">已发货</option>
									<option value="3">已退货</option>
								</select>
							</div>
							<div class="layui-inline">
								<select id="pay_way" name="pay_way" class="form-control"
									 style="width: 150px; height: 40px;"
									lay-filter="aihao">
									<option value="0">支付方式</option>
									<option value="1">网上支付</option>
									<option value="2">银行汇款</option>
									<option value="3">货到付款</option>
								</select>
							</div>
							<div class="layui-inline">
								<select id="distribution_mode" name="distribution_mode"
								 class="form-control"
									style="width: 150px; height: 40px;" lay-filter="aihao">
									<option value="0">配送方式</option>
									<option value="1">普通快递</option>
									<option value="2">顺丰快递</option>
								</select>
							</div>
							
							
<%-- 							<option value="${t.ptid}"
<c:if test="${pb.tid==t.ptid }">selected="selected"</c:if> >
${t.ptname}</option> --%>
							
<%-- 							<c:if test="${pb.tid==t.ptid }">selected="selected"</c:if> --%>
							
							
							
							<input type="submit" onclick="tyu()" value="提交"/>
						</form>
						</c:forEach>
					</div>
					<div class="layui-tab">
						<input type="button" hidden="hidden" id="" value="fs" />
					</div>
					<br>

					<div>
						<table style="width: 1500px">
							<tr>
								<td style="width: 70px">订单编号:</td>
								<td style="width: 200px"><input type="text"
									style="width: 150px; height: 35px;" class="form-control"
									value=""></td>
								<td>下单日期:</td>
							</tr>
						</table>
					</div>
				</blockquote>
				<div
					class="layui-tab-content larry-personal-body clearfix mylog-info-box">
					<!-- 操作日志 -->
					<div class="layui-tab-item layui-field-box layui-show">
						<form action="" method="post">
							<table class="layui-table table-hover" lay-even="" lay-skin="nob"
								id="tab">
								<thead>
									<tr>
										<th><input type="checkbox" id="selected-all"></th>
										<th>ID</th>
										<th>订单编号</th>
										<th>卖家用户名</th>
										<th>订单金额(元)</th>
										<th>下单日期</th>
										<th>订单状态</th>
										<th>支付状态</th>
										<th>支付方式</th>
										<th>配送状态</th>
										<th>配送方式</th>
										<th>操作</th>
									</tr>
									<c:forEach items="${list}" var="p" varStatus="stea">
										<tr>
											<td><input type="checkbox"></td>
											<th>${stea.index+1}</th>
											<th>${p.order_number}</th>
											<th>${p.myshop_member.member_username}</th>
											<th>${p.order_amount}</th>
											<th>${p.order_date}</th>
											<c:if test="${p.order_status == 1}">
												<th>未确认</th>
											</c:if>
											<c:if test="${p.order_status == 2}">
												<th>已确认</th>
											</c:if>
											<c:if test="${p.order_status == 3}">
												<th>已取消</th>
											</c:if>
											<c:if test="${p.order_status == 4}">
												<th>已完成</th>
											</c:if>
											<c:if test="${p.payment_status == 1}">
												<th>未支付</th>
											</c:if>
											<c:if test="${p.payment_status == 2}">
												<th>已支付</th>
											</c:if>
											<c:if test="${p.payment_status == 3}">
												<th>已退款</th>
											</c:if>
											<c:if test="${p.pay_way == 1}">
												<th>网上支付</th>
											</c:if>
											<c:if test="${p.pay_way == 2}">
												<th>银行汇款</th>
											</c:if>
											<c:if test="${p.pay_way == 3}">
												<th>货到付款</th>
											</c:if>

											<c:if test="${p.distribution_state == 1}">
												<th>未发货</th>
											</c:if>
											<c:if test="${p.distribution_state == 2}">
												<th>已发货</th>
											</c:if>
											<c:if test="${p.distribution_state == 3}">
												<th>已退货</th>
											</c:if>
											<c:if test="${p.distribution_mode == 1}">
												<th>普通快递</th>
											</c:if>
											<c:if test="${p.distribution_mode == 2}">
												<th>顺丰快递</th>
											</c:if>
											<th><a href="#"><img title="订单详情" src="/img/order.PNG"></a> <a href="/Order/deleteOrder/${p.order_id}">
											<img title="删除" src="/img/delete.PNG" /></a> <a href="#"><img title="修改" src="/img/update.PNG"></a></th>
										</tr>
									</c:forEach>
								</thead>

							</table>
						</form>
						<div class="larry-table-page clearfix">
							<a href="javascript:;" class="layui-btn layui-btn-small"><i
								class="iconfont icon-shanchu1"></i>删除</a>
							<div id="page" class="page"></div>
						</div>
					</div>
					<!-- 登录日志 -->
					<div class="layui-tab-item layui-field-box">
						<table class="layui-table table-hover" lay-even="" lay-skin="nob">
							<thead>
								<tr>
									<th><input type="checkbox" id="selected-all"></th>
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
									<td><input type="checkbox"></td>
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
		<div class="larry-table-page clearfix">
			<a href="javascript:;" class="layui-btn layui-btn-small"><i
				class="iconfont icon-shanchu1"></i>删除</a>
			<div id="page2" class="page"></div>
		</div>
	</div>
	</div>
	</div>
	</div>
	</section>
	<script type="text/javascript" src="/common/layui/layui.js"></script>
	<script type="text/javascript">
	function tyu(){
		alert($("#distribution_mode").val);
	}
// function tey(){
// 	//distribution_mode配送方式
// 	var distribution_mode = $("#distribution_mode").val();
// 	//pay_way支付方式
// 	var pay_way = $("#pay_way").val();
// 	//distribution_state配送状态
// 	var distribution_state = $("#distribution_state").val();
// 	//payment_status支付状态
// 	var payment_status = $("#payment_status").val();
// 	//order_status订单状态
// 	var order_status = $("#order_status").val();
	
// 	alert("订单状态:"+order_status+",支付状态:"+payment_status+",配送状态:"+distribution_state+",支付方式:"+pay_way+",配送方式:"+distribution_mode);

// 	location.href="selectOrder/"+uname+"/"+upwd;
	
// }
</script>
	<script type="text/javascript">
	layui.use(['jquery','layer','element','laypage'],function(){
	      window.jQuery = window.$ = layui.jquery;
	      window.layer = layui.layer;
          var element = layui.element(),
              laypage = layui.laypage;
            
          laypage({
					cont: 'page',
					pages: 10 //总页数
						,
					groups: 5 //连续显示分页数
						,
					jump: function(obj, first) {
						//得到了当前页，用于向服务端请求对应数据
						var curr = obj.curr;
						if(!first) {
							//layer.msg('第 '+ obj.curr +' 页');
						}
					}
				});

          laypage({
					cont: 'page2',
					pages: 10 //总页数
						,
					groups: 5 //连续显示分页数
						,
					jump: function(obj, first) {
						//得到了当前页，用于向服务端请求对应数据
						var curr = obj.curr;
						if(!first) {
							//layer.msg('第 '+ obj.curr +' 页');
						}
					}
				});
    });
</script>
	<!--    <script type="text/javascript"> -->
	<!--   var tid = document.getElementById("tid"); -->
	<!--  tid.value='${tid}'; -->
	<!--      </script> -->
</body>

</html>