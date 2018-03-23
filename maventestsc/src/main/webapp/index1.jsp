<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
 <link rel="stylesheet" type="text/css" href="css/bootstrap.css" />
		<script src="" type="text/javascript" charset="utf-8"></script>
		<script src="js/bootstrap.js" type="text/javascript" charset="utf-8"></script>
		<link rel="stylesheet" type="text/css" href="css/bootstrap.css" />
		<script src="js/bootstrap-table.js" type="text/javascript" charset="utf-8"></script>
		<script src="js/bootstrap-table-zh-CN.min.js" type="text/javascript" charset="utf-8"></script>
</head>
<script type="text/javascript">
</script>
<body>
<form method="post"  action="Userservlet?type=insertUser">
  <div class="control-group  col-sm-offset-3">
    <label class="control-label" for="classno">编号</label>
    <div class="controls">
      <input type="text"  name="pid"  value="1111"  disabled="disabled">
    </div>
  </div>
    <div class="control-group  col-sm-offset-3">
    <label class="control-label" for="classno">名字</label>
    <div class="controls">
      <input type="text"  name="pname"   >
    </div>
  </div>
    <div class="control-group  col-sm-offset-3">
    <label class="control-label" for="classno">数量</label>
    <div class="controls">
      <input type="text"  name="pcount"   >
    </div>
  </div>
    <div class="control-group  col-sm-offset-3">
    <label class="control-label" for="classno">价格</label>
    <div class="controls">
      <input type="text"  name="pprize"   >
    </div>
  </div>
  <div class="control-group col-sm-offset-3">
    <label class="control-label" for="inputPassword">类型</label>
    <div class="controls">
     <select style=" width:160px ;">
     	<option>
     	</option>
     </select>
    </div>
  </div>
  <div class="control-group col-sm-offset-3">
    <div class="controls">
        <button type="submit" >添加</button>
    </div>
  </div>
</form>
</body>
</html>