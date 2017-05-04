define(function(require,exports,module) {
	var angular = require('angular');
	var $ = require('jquery');
	var app = angular.module('index-ng', []);
	app.controller('index-ng', function($scope) {
	    $scope.names = ["John Doe","lshon"];
	    
	    $scope.init = function() {
	    	$.ajax({
	    		url : ctx + "/good/cats",
	    		type : "get",
	    		success : function(data) {
	    			$scope.goodsCat = data;
	    			$scope.$apply();
	    		}
	    	});
	    };
	    
	    $scope.test = function(index) { //一级导航悬浮
	        $(".cate_menu_item").removeClass("cate_menu_item_on");
	        $(".cate_menu_item").eq(index).addClass("cate_menu_item_on");
	        $(".cate_pop").children(".cate_part").hide();
	        $(".cate_pop").children(".cate_part").eq(index).show();
	        
	        $(".cate_pop").show();
	    };
	    
	    $scope.move = function() {
	        $(".cate_pop").hide();
	        $('.cate_menu_item').removeClass("cate_menu_item_on");
	    };
	    
	    $scope.initChildMenu = function(){
	    	
	    };
	    
	    $scope.init();
	});
	
});