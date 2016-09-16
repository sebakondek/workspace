var app = angular.module('OperacionApp', []);
app.controller("OperacionController", function($scope) {
	
	$scope.productos = [{articulo: "Pan", precio: "3.50"},{articulo: "Queso", precio: "15.00"}, {articulo: "Jamon", precio: "12.50"},
	                    {articulo: "Leche", precio: "10.00"},{articulo: "Huevos", precio: "2.50"},{articulo: "Manteca", precio:"20.00"}];
	
	$scope.cantidad = 0;
	
});