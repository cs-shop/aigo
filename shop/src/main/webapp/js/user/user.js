/**
 * 
 */
var register = function () {
	var userName = $('#user_name').val();
	var password = $('#pwd').val();
	debugger;
	console.log(userName);
	$.ajax({
		url : ctx+'/user/register',
		type : 'post',
		data : {
			loginName : userName,
			loginPwd : password
		},
		dataType : 'json',
		success :   function(data, textStatus){
			debugger;
			console.log(data);
         },
         error : function(data, textStatus){
			debugger;
			console.log(data);
         }
	
	});
}
var login = function() {
	$.ajax({
		url : ctx+ '/user/login',
		type: 'post',
		data : {
			userName : "fda",
			password :  "dsf"
		},
		dataType : 'json',
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