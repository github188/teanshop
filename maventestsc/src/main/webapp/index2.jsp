<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
<body>
123
<c:forEach  items="${listb}" var="p">
	<form id="myfromser" class="form-horizontal">
   <div  class="form-group">
    <label for="uid" class="col-sm-2 control-label">id:</label>
    <div class="col-sm-4">
      <input type="text" class="form-control" value="${p.pid}" name="pid" id="pid" disabled="disabled" >
    </div>
  </div>
  <div  class="form-group">
    <label for="uid" class="col-sm-2 control-label">名字:</label>
    <div class="col-sm-4">
      <input type="text" class="form-control" value="${p.pname}" name="pname" id="pname"  >
    </div>
  </div>
  <div class="form-group">
    <label for="uname" class="col-sm-2 control-label">数量:</label>
    <div class="col-sm-4">
      <input type="text" class="form-control" id="pcount" name="pcount"  value="${p.pcount}">
    </div>
  </div>
  <div class="form-group">
    <label for="uname" class="col-sm-2 control-label">价格:</label>
    <div class="col-sm-4">
      <input type="text" class="form-control" id="pprize" name="pprize"  value="${p.pprize}">
    </div>
  </div>
  <div class="form-group">
    <label for="uname" class="col-sm-2 control-label">类型:</label>
    <div class="col-sm-4">
     <select id="sel"  >
     <c:forEach  items="${lista}" var="t">
     <option  value="${t.tid}">${t.tname}</option>
     </c:forEach>
     </select>
    </div>
  </div>
</form>
<script>
  var tid=document.getElementById("sel");
  tid.value='${p.type.tid}';
</script>
</c:forEach>
</body>
</html>