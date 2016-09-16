var app = angular.module('holaMundoApp', []);
app.controller("HolaMundoController", function($scope) {
	
//	$scope.nombre = "Juan Perez";
//	$scope.saludo = "";
//	
//	$scope.saludarClick = function() {
//		$scope.saludo = "Hola!!! " + $scope.nombre;
//	};
//	
	
//	$scope.sumar = function() {
//		$scope.resultado = $scope.num1 + $scope.num2;
//	};
//	
//	$scope.restar = function() {
//		$scope.resultado = $scope.num1 - $scope.num2;
//	};
//	
//	$scope.multiplicar = function() {
//		$scope.resultado = $scope.num1 * $scope.num2;
//	};
//	
//	$scope.dividir = function() {
//		if($scope.num2 != 0){
//			$scope.resultado = $scope.num1 / $scope.num2;
//		} else {
//			$scope.resultado = "No se puede dividir por 0!";
//		}
//	};

	$scope.num1 = 0;
	$scope.num2 = 0;
	
	$scope.operar = function(){
		switch($scope.operacion) {
			 case "sumar":
				 $scope.resultado = $scope.num1 + $scope.num2;
				 break;
			 case "restar":
				 $scope.resultado = $scope.num1 - $scope.num2;
				 break;
			 case "multiplicar":
				 $scope.resultado = $scope.num1 * $scope.num2;
				 break;
			 case "dividir":
				if($scope.num2 != 0 && $scope.num2 != null){
					$scope.resultado = $scope.num1 / $scope.num2;
				} else{
					$scope.resultado = "No se puede dividir por 0!";
				}
				 break;
			}
	}
});