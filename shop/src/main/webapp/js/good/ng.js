define(function(require,exports,module) {
	var angular = require('angular');
	var app = angular.module('good', []);
	app.controller('good', function($scope) {
	    $scope.name = "John Doe";
	});
	
});