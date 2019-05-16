<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <title>layui</title>
  <meta name="renderer" content="webkit">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
  <link rel="stylesheet" href="layui/css/layui.css" media="all">
  <script src="layui/layui.js"></script>
</head>
<body>

 

<table id="demo" lay-filter="test"></table>
 <div id="demo6"></div>

<script>


var limitcount = 10;
var curnum = 1;
layui.use('table', function(){
	  var table = layui.table;
	  var laypage = layui.laypage;
	table.render({
	    elem: '#demo'
	    ,height: 312
	    ,url: 'user/disps.action' //数据接口
	    ,page: true //开启分页
	    ,cols: [[ //表头
	      {field: 'id', title: 'ID', width:80, sort: true, fixed: 'left'}
	      ,{field: 'name', title: '用户名', width:80}
	      ,{field: 'sex', title: '性别', width:80, sort: true}
	      ,{field: 'city', title: '城市', width:80} 
	      ,{field: 'sign', title: '签名', width: 177}
	      ,{field: 'experience', title: '积分11', width: 80, sort: true}
	      ,{field: 'score', title: '评分', width: 80, sort: true}
	      ,{field: 'classify', title: '职业', width: 80}
	      ,{field: 'wealth', title: '财富', width: 135, sort: true}
	    ]]

				}); 
		})

	
	




</script>
</body>
</html>