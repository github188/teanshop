<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>退货修改</title>

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
		<link rel="stylesheet" type="text/css" href="common/bootstrap/css/bootstrap.css" media="all">

		<link rel="stylesheet" type="text/css" href="/common/global.css" media="all">
		<link rel="stylesheet" type="text/css" href="/css/personal.css" media="all">
		<script src="js/jquery-3.0.0.js" type="text/javascript" charset="utf-8"></script>
		<link rel="stylesheet" type="text/css" href="/css/bootstrap.css" />
		<link rel="stylesheet" type="text/css" href="/css/bootstrap.css" />

		<style type="text/css">
			#d1 {
				margin: 0px 70px 0px 70px;
				width: 1200px;
				background: white;
			
			}
			
			#t1 {
				font-size: 16px;
				padding: 5px 0px 5px 30px;
				background: #F5F5F5;
			}
			
			#t2 {
				padding: 5px 0px 5px 950px;
				background: #F5F5F5;
			}
			
			#t3 {
				padding: 15px 100px;
			}
			input {
	border-top-style: none;
	border-left-style: none;
	border-bottom-style: none;
	border-right-style: none;
	font-size: 15px;
}
		</style>
	</head>

	<body>
		<div id="d1">
			<table width="1200px" align="center">
				<tr height="50px">
					<td id="t1">退回订单操作</td>
					<td id="t2">
						<a href="/returns/list" class="layui-btn layui-btn-primary">返回列表</a>
					</td>
				</tr>
				<tr height="50px">
					<td colspan="2" id="t3">
						<a href="/shipper/list" class="layui-btn layui-btn-primary">审核</a>
						<a href="/shipper/list" class="layui-btn layui-btn-primary">退回</a>
						<a href="/shipper/list" class="layui-btn layui-btn-primary">收货</a>
						<a href="/shipper/list" class="layui-btn layui-btn-primary">退款</a>
					</td>
				</tr>
			</table>
			<hr />
			<table style="font-family: '微软雅黑'; font-size:16px;font-weight:bold; color:#808080; text-align: center; width: 100%;">
				<tr height="30px">
					<td>商品编号</td>
					<td>商品名称</td>
					<td>商品价格</td>
				</tr>
				<tr>
					<td></td>
					<td></td>
					<td></td>
				</tr>
			</table>
			<hr />

			<table>
				<tr>
					<td style="font-family: '微软雅黑'; font-size:16px; color:#00BFFF ; text-align: left; padding-left: 50px;">订单信息</td>
				</tr>
			</table>
			<table style="font-family: '微软雅黑'; height: 300px; font-size: 16px; color: DarkGray; text-align: center; width: 100%;">
				<tr>
					<td>
						订单编号&ensp;&ensp;&ensp;&ensp;<input type="text" value="" />
					</td>
					<td>
						下单日期&ensp;&ensp;&ensp;&ensp;<input type="text" value="" />
					</td>
				</tr>
				<tr>
					<td>
						订单状态&ensp;&ensp;&ensp;&ensp;<input type="text" value="" />
					</td>
					<td>
						支付状态&ensp;&ensp;&ensp;&ensp;<input type="text" value="" />
					</td>
				</tr>
				<tr>
					<td>
						配送状态&ensp;&ensp;&ensp;&ensp;<input type="text" value="" />
					</td>
					<td>
						配送方式&ensp;&ensp;&ensp;&ensp;<input type="text" value="" />
					</td>
				</tr>
				<tr>
					<td>
						商品总金额&ensp;&ensp;&ensp;&ensp;<input type="text" value="" />
					</td>
					<td>
						运费&ensp;&ensp;&ensp;&ensp;<input type="text" value="" />
					</td>
				</tr>
				<tr>
					<td>
						订单总金额&ensp;&ensp;&ensp;&ensp;<input type="text" value="" />
					</td>
					<td>
						支付方式&ensp;&ensp;&ensp;&ensp;<input type="text" value="" />
					</td>
				</tr>
			</table>
			
					<hr />

			<table>
				<tr>
					<td style="font-family: '微软雅黑'; font-size:16px; color:#00BFFF ; text-align: left; padding-left: 50px;">退款详情</td>
				</tr>
			</table>
			
				<table style="font-family: '微软雅黑'; height: 300px; font-size: 16px; color: DarkGray; text-align: center; width: 100%;">
				<tr>
					<td>
						退款编号&ensp;&ensp;&ensp;&ensp;<input type="text" value="${re.return_serialNumber}" />
					</td>
					<td>
						申请时间&ensp;&ensp;&ensp;&ensp;<input type="text" value="${re.return_time}" />
					</td>
				</tr>
				<tr>
					<td>
						退款类型&ensp;&ensp;&ensp;&ensp;<input type="text" value="" />
					</td>
					<td>
						退款状态&ensp;&ensp;&ensp;&ensp;<input type="text" value="${re.state_id.state_name}" />
					</td>
				</tr>
				<tr>
					<td>
						退款金额&ensp;&ensp;&ensp;&ensp;<input type="text" value="" />
					</td>
					<td>
						退款支付类型&ensp;&ensp;&ensp;&ensp;<input type="text" value="" />
					</td>
				</tr>
				<tr>
					<td colspan="2">
						退款原因&ensp;&ensp;&ensp;&ensp;<input type="text" value="${re.refund_why}" />
					</td>
					
				</tr>
				<tr>
					<td colspan="2">
						退款说明&ensp;&ensp;&ensp;&ensp;<input type="text" value="" />
					</td>
				</tr>
			</table>
			
					<hr />

			<table>
				<tr>
					<td style="font-family: '微软雅黑'; font-size:16px; color:#00BFFF ; text-align: left; padding-left: 50px;">收货人信息</td>
				</tr>
			</table>
			
				<table style="font-family: '微软雅黑'; height: 300px; font-size: 16px; color: DarkGray; text-align: center; width: 100%;">
				<tr>
					<td>
						收货人姓名&ensp;&ensp;&ensp;&ensp;<input type="text" value="${re.shipper_id.shipper_name}" />
					</td>
					<td>
						收货人手机号&ensp;&ensp;&ensp;&ensp;<input type="text" value="${re.shipper_id.shipper_contact}" />
					</td>
				</tr>
				<tr>
					<td>
						收货人固定电话&ensp;&ensp;&ensp;&ensp;<input type="text" value="${re.shipper_id.shipper_contact}" />
					</td>
					<td>
						收货人邮编&ensp;&ensp;&ensp;&ensp;<input type="text" value="" />
					</td>
				</tr>
				<tr>
					<td colspan="2">
						收货人地址&ensp;&ensp;&ensp;&ensp;<input type="text" value="${re.shipper_id.shipper_address}" />
					</td>
				
				</tr>
				<tr>
					<td colspan="2">
						客户留言&ensp;&ensp;&ensp;&ensp;<input type="text" value="" />
					</td>	
				</tr>
			</table>
			
			
			
					<hr />

			<table>
				<tr>
					<td style="font-family: '微软雅黑'; font-size:16px; color:#00BFFF ; text-align: left; padding-left: 50px;">收货人信息</td>
				</tr>
			</table>
			<table style="font-family: '微软雅黑'; height: 100px; font-size: 16px; color: DarkGray; text-align: center; width: 100%;">
				<tr>
					<td>
						物流单号&ensp;&ensp;&ensp;&ensp;<input type="text" value="" />
					</td>
					<td>
						所选物流&ensp;&ensp;&ensp;&ensp;<input type="text" value="" />
					</td>
				</tr>
			</table>
		</div>
	</body>

</html>