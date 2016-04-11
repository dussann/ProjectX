app.service('TimoviService', ['$http', function($http) {
	return {
		list: function() {
			return $http.get('/ProjectX/rest/timovi');
		}
	
	}	
}]);