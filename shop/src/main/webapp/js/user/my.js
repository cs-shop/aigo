define(function(require,exports,module) {

  var $ = require('jquery');
	function my(){}
	module.exports = my;
	
	my.init = function() {
		$('#login').click(function() {
			alert("login");
		});
/*		$('#login').on('click',function() {
			alert("login");
		});
*/		
	}
	
	
	my.reg = function() {
		alert('reg...');
	}
	
	my.login = function() {
		alert('reg...');
	}
});