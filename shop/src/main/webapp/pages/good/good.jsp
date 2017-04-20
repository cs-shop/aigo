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
<div ng-app="good" class="container">

		<div ng-controller="good" >
		<div  class="col-xs-6 col-sm-4 col-md-3 col-lg-3 goodslist thumbnail" ng-repeat="good in goods" on-finish-render="test()">
		
					<a href="#">
						<img  ng-src="//img13.360buyimg.com/n7/jfs/t181/88/758646805/94933/bce3768f/5397f438N52fffbd3.jpg">
					</a>
					<hr style="margin: 5px 0 5px 0;border-color: #cccccc;" />
					<div>
						<strong>
							<em>￥</em>
							<i ng-bind="{{good.shopprice}}"></i>
						</strong>
					</div>
					
					<div>
					<a  class="a1" title="wahhh" ng-bind="{{good.shopprice}}"></a>
					</div>
					<div>
						<strong>
						已有{{goods.length}}人评价
						</strong>
					</div>
					<div class="caption" style="padding: 0;">
						<div style="margin: 5px 0 5px 0;">
							<span style="display:block;white-space:nowrap; overflow:hidden; text-overflow:ellipsis;font-size: 16px;" ng-bind="{{x.name}}"></span>
						</div>
						<div>
							<a class="btn btn-sm btn-primary" style="float: right !important;margin-right: 20px" ng-click="goDeploy(x.id)">
								<i class="glyphicon glyphicon-shopping-cart"></i>
								<span>加入购物车</span>
	 						</a>
 						</div>
				</div>
		
		
		<!-- 	<div class="p-img" style="">
			<span style="text-align: center;">
					<img src="//img13.360buyimg.com/n7/jfs/t181/88/758646805/94933/bce3768f/5397f438N52fffbd3.jpg">
			</span>
			</div>
			<div class="g_price">
				<strong data-price="40.40" data-done="1">
				<em>￥</em>
				<i>40.80</i>
				</strong>
			</div>
			<p>{{ x }}</p> -->
		</div>
	<!-- 		<div class="col-xs-4 col-sm-4 col-md-3" ng-repeat="x in names">
				<div class="gl-i-wrap">
					<p>{{ x }}</p>
				</div>

			</div> -->
		<!-- 	<table id="tb_departments"></table> -->
		</div>
	</div>


<script type="text/javascript">
	var bootstrap = ["bootstrap","bootstrap-theme","bootstrap-table-js","bootstrap-table-css","bootstrap-table-zh"];
	seajs.use(bootstrap);
	var font = ["font-css"];
	seajs.use(font);
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