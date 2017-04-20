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
<div ng-app="good" class="container" ng-init="names=['Jani','Hege','Kai','lilei','hanmei']">

		<div ng-controller="good">
		<div id="J-goodsList" class="col-xs-6 col-sm-4 col-md-3 col-lg-3 goodslist" ng-repeat="x in names">
			<div class="p-img" >
				<a target="_blank" title="wahahah">
					<img alt="" src="//img13.360buyimg.com/n7/jfs/t181/88/758646805/94933/bce3768f/5397f438N52fffbd3.jpg">
				</a>
			</div>
			<div class="g_price">
				<strong data-price="40.40" data-done="1">
				<em>￥</em>
				<i>40.80</i>
				</strong>
			</div>
			<p>{{ x }}</p>
		</div>
	<!-- 		<div class="col-xs-4 col-sm-4 col-md-3" ng-repeat="x in names">
				<div class="gl-i-wrap">
					<p>{{ x }}</p>
				</div>

			</div> -->
		<!-- 	<table id="tb_departments"></table> -->
		</div>
	</div>
>>>>>>> 1aec925bb1e982a5bc232107e985594f691183d0


<script type="text/javascript">
	var bootstrap = ["bootstrap","bootstrap-theme","bootstrap-table-js","bootstrap-table-css","bootstrap-table-zh"];
	seajs.use(bootstrap);
	var angular = ["angular"];
	seajs.use(angular);
	seajs.use("good/ng");
	seajs.use("good/good",function(good){
		good.init();
	});
	seajs.use("../../css/good/good.css");
</script>
</body>
</html>