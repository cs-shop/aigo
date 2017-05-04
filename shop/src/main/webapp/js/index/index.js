define(function(require,exports,module) {
	var $ = require('jquery');
	
	
	$(document).ready(function(){ 
	
	var slideIndex =0;
	function slidePlay(){
		//小圆点的切换 slider_indicator_btn_active
	    $(".slider_indicator_btn").removeClass("slider_indicator_btn_active");
	    $(".slider_indicator_btn").eq(slideIndex).addClass("slider_indicator_btn_active");
		
	    //某个div显示，其他的隐藏
	    $(".slider_item").css("opacity","0");
	    $(".slider_item").css("z-index","0");
	    $(".slider_item").hide().eq(slideIndex).css("opacity","1");
	    $(".slider_item").hide().eq(slideIndex).css("z-index","1");
	    $(".slider_item").hide().eq(slideIndex).show();    
	}

	//左侧菜单相关事件
//	$(".cate_menu").children(".cate_menu_item").hover(function() { //一级导航悬浮
	$(".cate_menu_item").hover(function() { //一级导航悬浮
        $(this).addClass("cate_menu_item_on").siblings(".cate_menu_item").removeClass("cate_menu_item_on");
        var index = $(this).index();
        $(".cate_pop").children(".cate_part").hide();
        $(".cate_pop").children(".cate_part").eq(index).show();
        
        $(".cate_pop").show();
    }, function() {
        $(".cate_pop").hide();
        $('.cate_menu_item').removeClass("cate_menu_item_on");
    });
	
    $(".cate_pop").hover(function() { //二级导航悬浮
        $(".cate_pop").show();
		$(".cate_part").each(function(){
			if($(this).css("display") != "none"){
				var index = $(this).index();
				$(".cate_menu").children(".cate_menu_item").eq(index).addClass("cate_menu_item_on");
			}
		});
    }, function() {
        $(".cate_pop").hide();
        $(".cate_pop").children(".cate_part").hide();
        $('.cate_menu_item').removeClass("cate_menu_item_on");
    });
	
	//中间图片切换事件
	var slideIndex =0;
	//3秒轮播一次
	var timer = setInterval(function(){
		slideIndex = (slideIndex+1)%8;
		slidePlay();
	}, 3000);
	
	//小圆点的切换
	$(".slider_indicator_btn").hover(function(){
		//停止自动轮询
		clearInterval(timer);
		
		var index = $(this).index();
		slideIndex = index;
		slidePlay();
	},function(){
		//当鼠标移出的时候重新开启自动轮询
		timer = setInterval(function(){
			slideIndex = (slideIndex+1)%8;
			slidePlay();
		}, 3000);
	});
	
	//左右箭头
	$(".slider_control_prev").click(function(){
		
		clearInterval(timer);
		
		slideIndex = (slideIndex == 0) ? 7 : slideIndex - 1;  
		slidePlay();
		
		timer = setInterval(function(){
			slideIndex = (slideIndex+1)%8;
			slidePlay();
		}, 3000);
	});
	$(".slider_control_next").click(function(){
		
		clearInterval(timer);
		
		slideIndex = (slideIndex == 7) ? 0 : slideIndex + 1;   
		slidePlay();
	    
	    timer = setInterval(function(){
			slideIndex = (slideIndex+1)%8;
			slidePlay();
		}, 3000);
	});
	}); 
});