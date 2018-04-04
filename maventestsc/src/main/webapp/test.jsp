<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<link rel="stylesheet" type="text/css" href="/css/zTreeStyle.css"/>
<script type="text/javascript" src="/js/jquery-1.4.4.min.js"></script>
 <script type="text/javascript" src="/js/jquery.ztree.core.js"></script>
         <script type="text/javascript">
         var setting = {
                 async: {
                     enable: true,//开启异步加载处理
                     dataFilter: filter//用于对 Ajax 返回数据进行预处理的函数
                 },
                 view: {
                     expandSpeed: "",//zTree 节点展开、折叠时的动画速度，设置方法同 JQuery 动画效果中 speed 参数。
                     addHoverDom: addHoverDom,//用于当鼠标移动到节点上时，显示用户自定义控件，显示隐藏状态同 zTree 内部的编辑、删除按钮
                     removeHoverDom: removeHoverDom,//设置鼠标移到节点上，在后面显示一个按钮
                     selectedMulti: false// 禁止多点同时选中的功能
                 },
                 edit: {
                     enable: true//设置 zTree 进入编辑状态
                 },
                 data: {
                     simpleData: {
                         enable:true,
                         idKey: "id",
                         pIdKey: "pid",
                         rootPId: ""
                     }
                 },
                 callback: {
                     beforeRemove: beforeRemove,//用于捕获节点被删除之前的事件回调函数，并且根据返回值确定是否允许删除操作
                     beforeRename: beforeRename//用于捕获节点编辑名称结束（Input 失去焦点 或 按下 Enter 键）之后，更新节点名称数据之前的事件回调函数，并且根据返回值确定是否允许更改名称的操作
                 }
             };
             //修改异步获取到的节点name属性
             function filter(treeId, parentNode, childNodes) {
                 if (!childNodes) return null;
                 for (var i = 0, l = childNodes.length; i < l; i++) {
                     childNodes[i].name = childNodes[i].name.replace(/\.n/g, '.');
                 }
                 return childNodes;
             }
             //删除节点信息
             function beforeRemove(treeId, treeNode) {
                 var zTree = $.fn.zTree.getZTreeObj("treeDemo");
                 zTree.selectNode(treeNode);
                 if (confirm("确认删除 节点 -- " + treeNode.name + " 吗？")) {
                     var treeInfo = treeNode.id;
                     $.ajax({
                         url: "Ajax.aspx?_tid=" + treeInfo + "&action=Remove",
                         type: "POST",
                         async: false,
                         success: function (res) {
                             if (res = "success") {
                                 alert('删除成功!');
                                 window.location.reload();
                             } else {
                                 alert('删除失败!');
                                 window.location.reload();
                             }
                         }
                     });
                 } else {
                     window.location.reload();
                 }
             }
             //修改节点信息
             function beforeRename(treeId, treeNode, newName) {
                 if (newName.length == 0) {
                     alert("节点名称不能为空.");
                     return false;
                 }
                 var treeInfo = treeNode.id;
                 $.ajax({
                     url: "Ajax.aspx?_tid=" + treeInfo + "&_newname=" + newName + "&action=ReName",
                     type: "POST",
                     async: false,
                     success: function (res) {
                         if (res = "success") {
                             alert('修改成功!');
                             window.location.reload();
                         } else {
                             alert('修改失败!');
                             window.location.reload();
                         }
                     }
                 });
             }
             //添加新的节点
             function addHoverDom(treeId, treeNode) {
                 var sObj = $("#" + treeNode.tId + "_span");
                 if (treeNode.editNameFlag || $("#addBtn_" + treeNode.tId).length > 0) return;
                 var addStr = "<span class='button add' id='addBtn_" + treeNode.tId
     + "' title='add node' onfocus='this.blur();'></span>";
                 sObj.after(addStr);
                 var btn = $("#addBtn_" + treeNode.tId);
                 if (btn) btn.bind("click", function () {
                     var zTree = $.fn.zTree.getZTreeObj("treeDemo");
                     if (confirm("确认为 " + treeNode.name + " 添加子节点吗？")) {

                         // zTree.addNodes(treeNode, { id: (100 + newCount), pId: treeNode.id, name: "new node" + (newCount++) });
                         var treeInfo = treeNode.id;
                         $.ajax({
                             url: "Ajax.aspx?_Pid=" + treeInfo + "&action=Insert",
                             type: "POST",
                             async: false,
                             success: function (res) {
                                 if (res = "success") {
                                     alert('添加成功!');
                                     window.location.reload();
                                 } else {
                                     alert('添加失败!');
                                     window.location.reload();
                                 }
                             }
                         });
                     }
                 });
             };
             //设置鼠标移到节点上，在后面显示一个按钮
             function removeHoverDom(treeId, treeNode) {
                 $("#addBtn_" + treeNode.tId).unbind().remove();
             };
             var zNodes =${td}
             //加载显示
             $(document).ready(function () {
                 $.fn.zTree.init($("#tree"), setting, zNodes);
             });
         </script>
<body>
	  <ul id="tree" class="ztree" style="width:260px; overflow:auto;"></ul>
</body>
</html>