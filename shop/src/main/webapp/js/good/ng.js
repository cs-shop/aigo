define(function(require,exports,module) {
	var angular = require('angular');
	var app = angular.module('myApp', []);
	app.controller('myCtrl', function($scope) {
	    $scope.name = "John Doe";
	});
	
});