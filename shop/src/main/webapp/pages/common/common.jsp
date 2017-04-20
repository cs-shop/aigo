<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>

 		<!-- Javascript -->
		<script type="text/javascript" src="${ctx}/js/sea-debug.js"></script>
		<script type="text/javascript" src="${ctx}/js/seajs-css-debug.js"></script>
		<script type="text/javascript" src="${ctx}/js/seajs-text-debug.js"></script>
<script type="text/javascript">
	var ctx = "${ctx}";
	seajs.config({
		  base: ctx+"/js/",
		  paths : {
			  "js" : ctx+"/js/",
			  "css" : ctx+"/css",
			  "font" : ctx+"/font-awesome"
		  },
		  alias: {
		    "jquery": "js/jquery/jquery-1.11.1.js",
		    "bootstrap":"css/bootstrap/css/bootstrap.min.css",
		    "bootstrap-theme":"css/bootstrap/css/bootstrap-theme.css",
		    "bootstrap-table-css":"css/bootstrap/css/bootstrap-table.css",
		    "font-css":"font/css/font-awesome.min.css",
		    "bootstrap-table-js":"css/bootstrap/js/bootstrap-table.js",
		    "bootstrap-table-zh":"css/bootstrap/js/bootstrap-table-zh-CN.js",
		    "angular":"js/angular/angular.js",
		  }
		});

</script>