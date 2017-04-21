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
	    			console.info(data);
	    		}
	    	});
	    }
	    
	    $scope.init();
	});
	
});