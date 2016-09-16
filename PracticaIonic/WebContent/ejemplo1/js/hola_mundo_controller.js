var app = angular.module('holaMundoApp', []);
app.controller("HolaMundoController", function($scope) {
	
	$scope.nombre = "Juan Perez";
	$scope.saludo = "";
	
	$scope.saludarClick = function() {
		$scope.saludo = "Hola!!! " + $scope.nombre;
	};
	
});