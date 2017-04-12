<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- 最上面的div -->
<div id="shortcut">
	<div class="w">
		<!-- 地区的显示和切换 -->
		<ul class="fl">
			<li class="dorpdown" id="ttbar-mycity">
				<div class="dt cw-icon ui-areamini-text-wrap">
					<i class="iconfont"></i>
					<i class="ci-right"><s>◇</s></i>
					<i class="ci-left"></i>
<!-- 					<span class="glyphicon glyphicon-map-marker" style="color:#f10215;"></span> -->
					<span class="city-text">北京</span>
				</div>
				<div class="dd dorpdown-layer">
					<div class="dd-spacer"></div>
					<div class="ui-areamini-content-wrap" style="left: auto;">
						<div class="ui-areamini-content">
							<div class="ui-areamini-content-list">
								<div class="item">
									<a data-id="1" href="javascript:void(0)" class="selected">北京</a>
								</div>
								<div class="item">
									<a data-id="2" href="javascript:void(0)">上海</a>
								</div>
								<div class="item">
									<a data-id="3" href="javascript:void(0)">广州</a>
								</div>
								<div class="item">
									<a data-id="4" href="javascript:void(0)">深圳</a>
								</div>
							</div>
						</div>
					</div>
				</div>
			</li>
		</ul>
		<!-- 登录注册等菜单 -->
		<ul class="fr">
			<li class="fore1 icon-plus-state0" id="ttbar-login">
				<a href="javascript:login()" class="link-login">你好，请登录</a>
				&nbsp;&nbsp;
				<a href="javascript:regist()" class="link-regist style-red">免费注册</a>
			</li>
			<li class="spacer"></li>
			<li class="fore2">
				<div class="dt">
					<a><span class="city-text">我的订单</span></a>
				</div>
			</li>
			<li class="spacer"></li>
			<li class="fore3">
				<div class="dt">
					<a><span class="city-text">我的订单</span></a>
				</div>
			</li>
			<li class="spacer"></li>
			<li class="fore4">
				<div class="dt">
					<a><span class="city-text">我的订单</span></a>
				</div>
			</li>
			<li class="spacer"></li>
			<li class="fore5">
				<div class="dt">
					<a><span class="city-text">我的订单</span></a>
				</div>
			</li>
		</ul>
	</div>
</div>
<!-- 全局搜索框 -->
<div id="header">
	<div class="w">
		<div id="logo" class="logo">
			<h1 class="logo_tit">
				<a href="###" class="logo_tit_lk">CS-SHOP</a>
			</h1>
			<h2 class="logo_subtit">多快好省</h2>
			<div class="logo_extend"></div>
		</div>
		<div id="search">
			<div class="search-m">
				<div class="search_logo">
					<a href="###" class="search_logo_lk">多快好省</a>
				</div>
				<ul id="shelper" style="display: none;"></ul>
				<div class="form">
					<input type="text" onkeydown="" autocomplete="off" id="key" accesskey="s" class="text" />
					<button onclick="" class="button">
						<i class="iconfont"></i>
					</button>
				</div>
			</div>
		</div>
		<div id="settleup" class="dorpdown">
			<div class="cw-icon">
				<i class="ci-left"></i>
				<i class="ci-right">></i>
				<i class="ci-count" id="shopping-amount">0</i>
				<i class="iconfont"></i>
				<a target="_blank" href="###">我的购物车</a>
			</div>
			<div class="dorpdown-layer">
				<div class="spacer"></div>
				<div class="prompt">
					<div class="nogoods">
						<b></b>
						购物车中还没有商品，赶紧选购吧！
					</div>
				</div>
			</div>
		</div>
		<div id="hotwords">
			<a href="###" target="_blank" class="style-red">买4免1</a>
			<a href="###" target="_blank">立省3000</a>
			<a href="###" target="_blank">家电秒杀</a>
			<a href="###" target="_blank">移动硬盘1T</a>
			<a href="###" target="_blank">满199减100</a>
			<a href="###" target="_blank">夏季新款</a>
		</div>
		<div id="navitems">
			<ul id="navitems-group1">
				<li class="fore1"><a target="_blank" href="###">秒杀</a></li>
				<li class="fore2"><a target="_blank" href="###">优惠券</a></li>
				<li class="fore3"><a target="_blank" href="###">闪购</a></li>
				<li class="fore4"><a target="_blank" href="###">拍卖</a></li>
			</ul>
			<div class="spacer"></div>
			<ul id="navitems-group2">
				<li class="fore1"><a target="_blank" href="###">服装城</a></li>
				<li class="fore2"><a target="_blank" href="###">京东超市</a></li>
				<li class="fore3"><a target="_blank" href="###">生鲜</a></li>
				<li class="fore4"><a target="_blank" href="###">全球购</a></li>
			</ul>
			<div class="spacer"></div>
			<ul id="navitems-group3">
				<li class="fore1"><a target="_blank" href="###">京东金融</a></li>
			</ul>
		</div>
		<div id="treasure"></div>
	</div>
</div>
