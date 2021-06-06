var professorModulo = angular.module('professorModulo', []);

professorModulo.controller("professoresController", function($scope, $http) {

	urlProfessor = 'http://localhost:8080/Projeto2httpJaxRS/rest/professores';
	$scope.listarProfessores = function() {
		
		$http.get(urlProfessor).then(sucessCallback, errorCalback);
				
		function sucessCallback(professores){
			$scope.professores = professores.data;
		}	

		function errorCalback(error){
			alert(error);
		}
		
	}
	
	$scope.selecionaProfessor = function(professorSelecionado){
		$scope.professor = professorSelecionado;
	}
	
	$scope.limparCampos = function(){
		$scope.professor = null;
	}
	
	
	//executa
	$scope.listarProfessores();

});
