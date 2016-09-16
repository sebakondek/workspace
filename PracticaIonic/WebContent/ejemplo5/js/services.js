app.factory('PersonasService', function($http) {
	
	return {
		recuperarPersonas : function() {
			return $http.get('../personas_json.jsp');
		},
		recuperarPersonaPorId : function(idPersona) {
			return $http.get('../persona_json.jsp?id=' + idPersona);
		}
	}
});