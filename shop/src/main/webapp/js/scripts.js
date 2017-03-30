
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
		url:"http://localhost:8080/cs-shop/user/getUsers",
		type:'get',
		success: function(data) {
			 //请求成功处理，和本地回调完全一样
			alert('login success');
			windows.localtion.href='/pages/test.jsp';
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
