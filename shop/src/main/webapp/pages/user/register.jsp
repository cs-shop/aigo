<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%-- <html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>注册</title>
	<%@include file="/pages/common/common.jsp" %>
</head>
<body>
<div class="header" >fd</div>
<div class="container">
	<div class="row clearfix">
		<div class="col-md-12 column">
			<nav class="navbar navbar-default" role="navigation">
				<div class="navbar-header">
					 <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1"> <span class="sr-only">Toggle navigation</span><span class="icon-bar"></span><span class="icon-bar"></span><span class="icon-bar"></span></button> <a class="navbar-brand" href="#">Brand</a>
				</div>
			
			</nav>
		
		</div>
	</div>

</div>
</body>
</html> --%>

<html>
<head>
<%@include file="/pages/common/common.jsp" %>
    <title>cs-shop注册</title>
    <meta charset="utf-8">
    <link rel="stylesheet" type="text/css" href="${ctx}/css/user/register.css">
    <script type="text/javascript" src="${ctx}/js/user/user.js"></script>
</head>
<body>

<!--导航栏-->
        <nav>
            <div class="nav_all">
              <!--   <ul class="nav_lef">
                    <li><img src="./images/star.jpg"></li>
                    <li><a href="">收藏京东</a></li>
                </ul> -->
                <ul class="nav_rig">
                    <li><a href="">您好，欢迎来到csshop！</a></li>
                    <li><a href="">[登录]</a></li>
                    <li><a href="">[免费注册]</a></li>
                    <li>|</li>
                    <li><a href="">我的订单</a></li>
                    <li>|</li>
                    <li><a href="">客户服务</a></li>
                    <li>|</li>
                    <li><a href="">网站导航</a></li>
                </ul>
            </div>
        </nav>

<!--jd_logo-->
        <div class="jd">
            <ul  class="jd_logo">
                <li id="jd_logo"></li>
                <li id="separator">|</li>
                <li id="zc">欢迎注册</li>
            </ul>
        </div>

<!--表单的表头-->
      <!--   <div class="from_bt">
            <ul>
                <li class="from_gr">个人用户</li>
                <li class="from_qy">企业用户</li>
                <li class="from_engliash">InternationalCustomers</li>
            </ul>
        </div> -->

    <header class="head">
        <form>
        <div class="form_body">
       
            <div class="from_nam">
            		<span class="from_xing">*</span>
            		<span class="from_name">用户名:</span>
                    <input type="text" id="user_name" class="from_text" placeholder="nihao">
                    <!-- <span class="yhtx_logo"><img src="./images/user.jpg"></span> -->
            <span class="from_tsy">4-20位字母、数字汉字及特殊字符组合</span>
            </div>
            <!--密码框-->
            <div class="from1_nam">
	            <span class="from_xing">*</span>
	            <span class="from_name">密码:</span>
	             <input type="password" id="pwd" name="pwd" class="from1_text" placeholder="nihao" />
	                   <!--  <span class="yhtx1_logo"><img src="./images/pwd.jpg"></span> -->
	            <span class="from1_tsy">6-20位字符，建议字母、数字和符号</span>
            </div>
            <!--确认密码框-->
            <div class="from2_nam">
	            <span class="from_xing">*</span>
	            <span class="from_name">请确认密码:</span>
	            <input type="password" id="pwdc" name="pwdc" class="from2_text" placeholder="nihao" />
	            <span class="from2_tsy">请再次输入密码</span>
            </div>
            <!--手机验证-->
            <div class="from3_nam">
            <span class="from_xing">*</span>
            <span class="from_name">验证手机:</span>
            <input type="text" name="" class="from3_text">
                    <!-- <span class="yhtx3_logo"><img src="./images/phone.jpg"></span> -->
            <span class="from3_tsy">完成验证后，可以使用该手机找回</span>
            </div>
            <!--短信验证码-->
            <div class="from4_nam">
	            <span class="from_xing">*</span>
	            <span class="from_name">邮箱:</span>
	            <input type="text" name="" class="from4_text">
	            <span class="from4_tsy">邮箱</span>
            </div>
            <!--from尾部-->
            <div class="from5_nam">
                <input type="checkbox" name="">
                <span>我已同意并阅读</span>
                <span><a href=""><<用户注册协议>></a></span>
            </div>
            <input type="button" name="" class="from5_text" value="立即注册" onclick="register()">
          </div>
        </form>

        
        <div id="regphone">
        <img src="${ctx}/ico/cs-shop.png">
        </div>
    </header>
<!--footer-->
    <footer>
        <ul class="footer">
            <li><a href="#">关于我们</a></li>
            <li>|</li>
            <li><a href="#">联系我们</a></li>
            <li>|</li>
            <li><a href="#">人才招聘</a></li>
            <li>|</li>
            <li><a href="#">商家入驻</a></li>
            <li>|</li>
            <li><a href="#">广告服务</a></li>
            <li>|</li>
            <li><a href="#">友情链接</a></li>
            <li>|</li>
            <li><a href="#">销售联盟</a></li>
            <li id="jd_number">Copyright©2017-2018  cs-shop 版权所有 </li>
        </ul>
    </footer>
<!--侧边悬浮框-->
<!--     <aside>
        <ul>
            <li class="zhuti">特色栏目</li>
            <li>为我推荐</li>
            <li>视频购物</li>
            <li>京东社区</li>
            <li>特色栏目</li>
            <li>校园频道</li>
            <li>在线读书</li>
            <li>装机大师</li>
            <li>礼品卡</li>
        </ul>
        <ul>
            <li class="zhuti">企业服务</li>
            <li>企业采购</li>
            <li>办公直通车</li>
        </ul>
        <ul>
            <li class="zhuti">旗下网站</li>
            <li>36TOP</li>
            <li>迷你挑</li>
            <li>EngliahSite</li>
        </ul>
    </aside> -->
</body>
</html>
