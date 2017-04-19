<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
 <%@include file="/pages/common/common.jsp" %>
</head>
<body>
<div class="container">
 <div ng-app="myApp" ng-controller="myCtrl">
    名字: <input ng-model="name">
    <h1>你输入了: {{name}}</h1>
</div>
</div>
<!-- 
<table id="tb_departments"></table>
<input id="good_name" type="text" class="form-control" value="123"/>
<button type="button" class="btn btn-success">成功按钮</button>
</div> -->


<script type="text/javascript">
	var bootstrap = ["bootstrap","bootstrap-theme","bootstrap-table-js","bootstrap-table-css","bootstrap-table-zh"];
	seajs.use(bootstrap);
	var angular = ["angular"];
	seajs.use(angular);
	seajs.use("good/ng");
	seajs.use("good/good",function(good){
		good.init();
	});
</script>
</body>
</html>