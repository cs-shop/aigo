
jQuery(document).ready(function() {
	
    /*
        Fullscreen background
    */
    $.backstretch("img/backgrounds/1.jpg");
    
    /*
        Form validation
    */
    $('.login-form input[type="text"], .login-form input[type="password"], .login-form textarea').on('focus', function() {
    	$(this).removeClass('input-error');
    });
    
/*    $('.login-form').on('submit', function(e) {
    	$(this).find('input[type="text"], input[type="password"], textarea').each(function(){
    		if( $(this).val() == "" ) {
    			e.preventDefault();
    			$(this).addClass('input-error');
    		}
    		else {
    			$(this).removeClass('input-error');
    		}
    	});
    	
    });*/
    
    
});
var login = function() {
	$.ajax({
		url:"http://localhost:8081/cs-service/user/getUser",
		type:'get',
		dataType:"jsonp",    //跨域json请求一定是jsonp
		jsonp: "callbackparam",    //跨域请求的参数名，默认是callback
		//jsonpCallback:"successCallback",    //自定义跨域参数值，回调函数名也是一样，默认为jQuery自动生成的字符串
		success: function(data) {
			 //请求成功处理，和本地回调完全一样
			debugger;
			    },
			
		complete: function(data) {
			       //请求完成的处理
			debugger;
		     },
			
		error: function(data) {
		        //请求出错处理
			debugger;
		    }
	}); 
 }
