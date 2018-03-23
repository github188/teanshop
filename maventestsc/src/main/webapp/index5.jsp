<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
 <link rel="stylesheet" type="text/css" href="css/bootstrap.css" />
		<script src="js/jquery-3.0.0.js" type="text/javascript" charset="utf-8"></script>
		<script src="js/bootstrap.js" type="text/javascript" charset="utf-8"></script>
		<link rel="stylesheet" type="text/css" href="css/bootstrap.css" />
		<script src="js/bootstrap-table.js" type="text/javascript" charset="utf-8"></script>
		<script src="js/bootstrap-table-zh-CN.min.js" type="text/javascript" charset="utf-8"></script>
</head>
<script type="text/javascript">
function queryInfo(){
	  document.forms[0].action="ProductServlet?list=findAll";
	  document.forms[0].submit();
}

function handleup(){
	  document.forms[0].action="ProductServlet?list=findAll&handle=up";
	  document.forms[0].submit();
}
function handledown(){
	  document.forms[0].action="ProductServlet?list=findAll&handle=down";
	  document.forms[0].submit();
}
</script>
<body >
<form action="" method="post"> 
<table  id="tabl" align="center" border="1" width="500" class=" tab table-hover  " >
         <tr>
        <td  colspan="3">
         <select  name="tid"  id="tid">
         <option value="-1">请选择</option>
          <c:forEach items="${listType}" var="t">
     <option value="${t.tid }">${t.tname}</option>
      </c:forEach>
     </select>
     </td>
     
     <td colspan="3"><input type="text"  value="${qname}" name="qname" id="qname"  ><button type="button" onclick="queryInfo()">搜索</button></td>
  
    </tr>
      <tr>
      <td  width="125"><h3 align="center">编号</h3></td>
   <td  width="125"><h3 align="center">名字</h3></td>
    <td  width="125"><h3 align="center">数量</h3></td>
    <td   width="125"><h3 align="center">价格</h3></td>
       <td  width="125" ><h3 align="center">类型</h3></td>
       <td  width="125" ><h3 align="center">删除</h3></td>
       <td  width="125" ><h3 align="center">修改</h3></td>
      </tr>
      <c:forEach  items="${listPro}"  var="p"  varStatus="stea">
      <tr>
       <td  width="125" align="center">${stea.index+1}</td>
       <td  width="125" align="center">${p.pname}</td>
       <td  width="125" align="center">${p.pcount}</td>
       <td  width="125" align="center">${p.pprize}</td>
       <td  width="125" align="center">${p.type.tname}</td>
       <td  width="125" align="center"><a href="ProductServlet?list=delPro&pid=${p.pid}"">删除</a></td>
       <td  width="125" align="center"><a href="ProductServlet?list=upPro&pid=${p.pid}">修改</a></td>
         </c:forEach>
      </tr>
      <tr>
       <td><a href="#"  onclick="handleup()">上一页</a></td>
       <td><a href="#"></a></td>
       <td><a href="#"></a></td>
       <td><a href="#"></a></td>
       <td><a href="#"></a></td>
       <td><a href="#"></a></td>
       <td><a href="#"  onclick="handledown()">下一页</a></td>
      </tr>
   </table>
   </form>
   <script type="text/javascript">
      var tid = document.getElementById("tid");
      tid.value='${tid}';
     </script>
</body>
</html>