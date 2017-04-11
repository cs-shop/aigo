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
<link rel="stylesheet" href="${ctx }/css/main.css">

<style>
ul#bcty365_nav{padding-left:50px; margin-bottom:10px; border-bottom:2px solid #ccc; overflow:hidden; _zoom:1;}
ul#bcty365_nav li{float:left; display:inline; margin:10px;}
ul#bcty365_nav li a{display:block;color:#000000; font-size:16px;}
ul#bcty365_nav li a,#wimoban_p,#wimoban_p a{ font-family:"微软雅黑";}
ul#bcty365_nav li a:hover,#wimoban_p a:hover{color:red;}
</style>	

</head>
<body>
	<div class="top"></div>
	<!--导航 Start-->
	<div class="menu">
		<div class="all-sort"><h2><a href="">全部商品分类</a></h2></div>
		<div class="ad">
			<a href="">
				<img src="${ctx }/images/rBEhVlJEA84IAAAAAAAZY9Mm2-UAADmFQNaVy4AABl7123.jpg" width="141" height="40" />
			</a>
		</div>
		<div class="nav">
			<ul class="clearfix">
				<li><a href="###" class="current">首页</a></li>
				<li><a href="###">服装城</a></li>
				<li><a href="###">京东超市</a></li>
				<li><a href="###">团购</a></li>
				<li><a href="###">拍卖</a></li>
				<li><a href="###">在线游戏</a></li>
			</ul>
		</div>
	</div>
	<!--导航 End-->

	<!--所有分类 Start-->
	<div class="wrap">
		<div class="all-sort-list">
			<div class="item bo">
				<h3><span>·</span><a href="">图书</a>、<a href="">音像</a>、<a href="">数字商品</a></h3>
				<div class="item-list clearfix">
					<div class="subitem">
						<dl class="fore1">
							<dt><a href="#">电子书0</a></dt>
							<dd><em><a href="#">免费</a></em><em><a href="#">小说</a></em><em><a href="#">励志与成功</a></em><em><a href="#">婚恋/两性</a></em><em><a href="#">文学</a></em><em><a href="#">经管</a></em><em><a href="#">畅读VIP</a></em></dd>
						</dl>
						<dl class="fore2">
							<dt><a href="#">数字音乐</a></dt>
							<dd><em><a href="#">通俗流行</a></em><em><a href="#">古典音乐</a></em><em><a href="#">摇滚说唱</a></em><em><a href="#">爵士蓝调</a></em><em><a href="#">乡村民谣</a></em><em><a href="#">有声读物</a></em></dd>
						</dl>
						<dl class="fore3">
							<dt><a href="#">音像</a></dt>
							<dd><em><a href="#">音乐</a></em><em><a href="#">影视</a></em><em><a href="#">教育音像</a></em><em><a href="#">游戏</a></em></dd>
						</dl>
						<dl class="fore4">
							<dt>文艺</dt>
							<dd><em><a href="#">小说</a></em><em><a href="#">文学</a></em><em><a href="#">青春文学</a></em><em><a href="#">传记</a></em><em><a href="#">艺术</a></em></dd>
						</dl>
						<dl class="fore5">
							<dt>人文社科</dt>
							<dd><em><a href="#">历史</a></em><em><a href="#">心理学</a></em><em><a href="#">政治/军事</a></em><em><a href="#">国学/古籍</a></em><em><a href="#">哲学/宗教</a></em><em><a href="#">社会科学</a></em></dd>
						</dl>
						<dl class="fore6">
							<dt>经管励志</dt>
							<dd><em><a href="#">经济</a></em><em><a href="#">金融与投资</a></em><em><a href="#">管理</a></em><em><a href="#">励志与成功</a></em></dd>
						</dl>
						<dl class="fore7">
							<dt>生活</dt>
							<dd><em><a href="#">家庭与育儿</a></em><em><a href="#">旅游/地图</a></em><em><a href="#">烹饪/美食</a></em><em><a href="#">时尚/美妆</a></em><em><a href="#">家居</a></em><em><a href="#">婚恋与两性</a></em><em><a href="#">娱乐/休闲</a></em><em><a href="#">健身与保健</a></em><em><a href="#">动漫/幽默</a></em><em><a href="#">体育/运动</a></em></dd>
						</dl>
						<dl class="fore8">
							<dt>科技</dt>
							<dd><em><a href="#">科普</a></em><em><a href="#">IT</a></em><em><a href="#">建筑</a></em><em><a href="#">医学</a></em><em><a href="#">工业技术</a></em><em><a href="#">电子/通信</a></em><em><a href="#">农林</a></em><em><a href="#">科学与自然</a></em></dd>
						</dl>
						<dl class="fore9">
							<dt>少儿</dt>
							<dd><em><a href="#">少儿</a></em><em><a href="#">0-2岁</a></em><em><a href="#">3-6岁</a></em><em><a href="#">7-10岁</a></em><em><a href="#">11-14岁</a></em></dd>
						</dl>
						<dl class="fore10">
							<dt>教育</dt>
							<dd><em><a href="#">教材教辅</a></em><em><a href="#">考试</a></em><em><a href="#">外语学习</a></em></dd>
						</dl>
						<dl class="fore11">
							<dt>其它</dt>
							<dd><em><a href="#">英文原版书</a></em><em><a href="#">港台图书</a></em><em><a href="#">工具书</a></em><em><a href="#">套装书</a></em><em><a href="#">杂志/期刊</a></em></dd>
						</dl>
					</div>
					<div class="cat-right">
						<dl class="categorys-promotions">
							<dd>
							<ul>
								<li><a href="#" target="_blank"><img src="${ctx }/images/rBEhWFJTydgIAAAAAAAiD8_1J3AAAD5mAMC0SYAACIn230.jpg" width="194" height="70" title="特价书满减"></a></li>
								<li><a href="#" target="_blank"><img src="${ctx }/images/rBEhVlJTyt8IAAAAAAAiq1D-0D8AAD7_gIE2KUAACLD102.jpg" width="194" height="70" title="重磅独家"></a></li>
							</ul>
							</dd>
						</dl>
						<dl class="categorys-brands">
							<dt>推荐品牌出版商</dt>
							<dd>
							<ul>
								<li><a href="#" target="_blank">中华书局</a></li>
								<li><a href="#" target="_blank">人民邮电出版社</a></li>
								<li><a href="#" target="_blank">上海世纪出版股份有限公司</a></li>
								<li><a href="#" target="_blank">电子工业出版社</a></li>
								<li><a href="#" target="_blank">三联书店</a></li>
								<li><a href="#" target="_blank">浙江少年儿童出版社</a></li>
								<li><a href="#" target="_blank">人民文学出版社</a></li>
								<li><a href="#" target="_blank">外语教学与研究出版社</a></li>
								<li><a href="#" target="_blank">中信出版社</a></li>
								<li><a href="#" target="_blank">化学工业出版社</a></li>
								<li><a href="#" target="_blank">北京大学出版社</a></li>
							</ul>
							</dd>
						</dl>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!--所有分类 End-->
	<script type="text/javascript">
		$('.all-sort-list > .item').hover(function(){
			var eq = $('.all-sort-list > .item').index(this),				//获取当前滑过是第几个元素
				h = $('.all-sort-list').offset().top,						//获取当前下拉菜单距离窗口多少像素
				s = $(window).scrollTop(),									//获取游览器滚动了多少高度
				i = $(this).offset().top,									//当前元素滑过距离窗口多少像素
				item = $(this).children('.item-list').height(),				//下拉菜单子类内容容器的高度
				sort = $('.all-sort-list').height();						//父类分类列表容器的高度
			
			if ( item < sort ){												//如果子类的高度小于父类的高度
				if ( eq == 0 ){
					$(this).children('.item-list').css('top', (i-h));
				} else {
					$(this).children('.item-list').css('top', (i-h)+1);
				}
			} else {
				if ( s > h ) {												//判断子类的显示位置，如果滚动的高度大于所有分类列表容器的高度
					if ( i-s > 0 ){											//则 继续判断当前滑过容器的位置 是否有一半超出窗口一半在窗口内显示的Bug,
						$(this).children('.item-list').css('top', (s-h)+2 );
					} else {
						$(this).children('.item-list').css('top', (s-h)-(-(i-s))+2 );
					}
				} else {
					$(this).children('.item-list').css('top', 3 );
				}
			}	

			$(this).addClass('hover');
			$(this).children('.item-list').css('display','block');
		},function(){
			$(this).removeClass('hover');
			$(this).children('.item-list').css('display','none');
		});

		$('.item > .item-list > .close').click(function(){
			$(this).parent().parent().removeClass('hover');
			$(this).parent().hide();
		});
	</script>
  <div style=" clear:both; width:700px; margin:0 auto; text-align:center; padding-top:10px;">
</div>
</body>