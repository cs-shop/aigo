define(function(require,exports,module) {
	var angular = require('angular');
	var $ = require('jquery');
	var app = angular.module('good', []);
	app.controller('good', function($scope) {
	    $scope.names = ["John Doe","lshon"];
	    $scope.goods = new Array();
	    $scope.isFinsh = false;
	    $scope.init = function() {
	    	
	    	console.info(ctx);
	    	$.ajax({
				url : ctx + "/good/list",
				type : "get",
				success : function(data) {
					debugger;
					
					$scope.goods = data;
					$scope.$apply();
				} 
	    	});
	    }
	    $scope.test = function () {
	    	$scope.isFinsh = true;
	    	$scope.$apply();
	    }
	    $scope.init();
	    
	});
	
});