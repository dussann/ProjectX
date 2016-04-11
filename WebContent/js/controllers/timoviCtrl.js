app.controller('TimoviCtrl', ['$scope', 'TimoviService', function($scope, TimoviService) {
	
	var vratiSveTimove = function() {
		TimoviService.list().then(function(value) {
			$scope.timovi = value.data;
		}, function(reason) {
			
		});
	}
}]);