<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title></title>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<head>
<script src="${ctx}/js/jquery/jquery-1.11.1.min.js"></script>
<head>
<title>CS-SHOP</title>
<link rel="stylesheet" href="${ctx }/css/jd.css">
<link rel="stylesheet" href="${ctx }/css/footer.css">
</head>
<body class="index">
<!-- 头部 -->
<%@ include file="/pages/common/navigat.jsp"%>
<!-- 菜单、幻灯片 -->
<%@ include file="/pages/index_menu.jsp"%>
<!-- 底部 -->
<%@ include file="/pages/common/footer.jsp" %>
</body>
</html> 