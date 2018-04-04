<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8">
	<title>个人信息</title>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta name="renderer" content="webkit">	
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">	
	<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">	
	<meta name="apple-mobile-web-app-status-bar-style" content="black">	
	<meta name="apple-mobile-web-app-capable" >	
	<meta name="format-detection" content="telephone=no">	
	<link rel="stylesheet" type="text/css" href="/common/layui/css/layui.css" media="all">
	<link rel="stylesheet" type="text/css" href="/common/bootstrap/css/bootstrap.css" media="all">
	<link rel="stylesheet" type="text/css" href="/common/global.css" media="all">
	<link rel="stylesheet" type="text/css" href="/css/personal.css" media="all">
	<script src="/js/jquery-3.0.0.js" type="text/javascript" charset="utf-8"></script>
</head>
<script type="text/javascript">
        function fun(a) {   
            layer.open({  
                    title: ['温馨提示'],  
                    content: '<div style="color:#767676">确定删除吗</div>',  
                    btn: ['确定', '取消'],  
                    shadeClose: true,  
                    //回调函数  
                    yes: function(index, layero){  
                    	$.post("/pt/delpt", {
            			tid:a
            		},function(data){
            			if(data==1){
            				alert("该类型正在被使用不能被删除")
            			}else{
            				window.location.href="/pt/listPt";
            			}
            			},"json");
                    },  
                    btn2: function(index, layero){  
                    },  
                    cancel: function(index,layero){  
                       
                    },  
              
            });   
    } 
</script>
<body>
<section class="layui-larry-box ">
	<div class="larry-personal">
<form action="" method="post" >
	    <div class="layui-tab ">
            <blockquote class="layui-elem-quote news_search">
		<div class="layui-inline">
			 <div class="layui-input-inline">
		    	<input value="${qname}" name="qname" id="qname" placeholder="请输入关类型" class="layui-input search_input" type="text">
		    </div>
		   <a class="layui-btn search_btn" onclick="findAll()">查询</a>
		</div><div class="layui-inline">
			<a class="layui-btn layui-btn-normal newsAdd_btn" href="/inptInfo.jsp">添加商品</a>
		</div>
  </div>
	</blockquote>
		    <div class="layui-tab-content larry-personal-body clearfix mylog-info-box">
		         <!-- 操作日志 -->
                <div class="layui-tab-item layui-field-box layui-show">
                     <table class="layui-table table-hover" lay-even="" lay-skin="nob"  id="tab">
                          <thead>
                              <tr>
                                  <th>ID</th>
                                  <th>类型</th>
                                  <th>删除</th>
                                  <th>修改</th>
                              </tr>
          <tr>
       <c:forEach items="${pt }"  var="p"  varStatus="stea">
       <th >${stea.index+1}</th>
       <th >${p.ptname}</th> 
      <th ><button class="layui-btn layui-btn-sm" type="button" onclick="fun(${p.ptid})">
    <i class="layui-icon">&#xe640;</i>
  </button></th> 
       <th ><a href="/pt/getById/${p.ptid}"  class="layui-btn layui-btn-normal"> <i class="layui-icon">&#xe642;</i></a></th> 
       </tr> 
</c:forEach>
               </thead>
                     </table>
                     <div class="larry-table-page clearfix">
                          <a href="javascript:;" class="layui-btn layui-btn-small"><i class="iconfont icon-shanchu1"></i>删除</a>
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
                          <a href="javascript:;" class="layui-btn layui-btn-small"><i class="iconfont icon-shanchu1"></i>删除</a>
				          <div id="page2" class="page"></div>
			         </div>
			    </div>
		    </div>
		</div>
	</div>
</section>
<script type="text/javascript" src="/common/layui/layui.js"></script>
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
</body>

</html>