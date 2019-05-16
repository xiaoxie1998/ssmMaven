<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery-3.3.1.js"></script>
</head>
<body>
<a href="#" id="user">查看所有用户</a><br>
<a href="user/chakan.action">查看所有用户</a>
<a href="user/shuju.action?house.typeId=3&id=4">数据</a><br>
<a href="user/chaxun.action?id=1001">查询</a><br>
</body>

<script type="text/javascript">

$(function(){
	$("#user").click(function(){
		$.ajax({
			url:"user/userspd.action",
			data:"id=1",
			dataType:"json",
			success:function(res){
				$.each(res,function(index,value){
					
					alert(index+"："+value)
					
				})
			}
		})
	
	})
})
	
</script>
</html>