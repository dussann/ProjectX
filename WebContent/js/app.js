var app = angular.module('ProjectX', ['ngRoute', 'ngMaterial']);

app.config(function ($routeProvider) {
	$routeProvider
	.when("/", {
		templateUrl: "views/pocetna.html",
		controller: "TimoviCtrl"
	})
	.otherwise({
		redirectTo: "/"
	})
})