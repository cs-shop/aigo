/**
 * 
 */
define(function(require,exports,module) {

  var $ = require('jquery');
	function good(){};
	module.exports = good;
	
	good.search = function() {
		var good_name = "情侣对戒";
		
		$.ajax({
			url : ctx+"/good/list?good_name="+good_name,
			method : "get",
			success : function(data) {
				debugger;
				console.info(data);
				$("#good_name").val("dsds");
			}
		});
		
	}
	
	
});