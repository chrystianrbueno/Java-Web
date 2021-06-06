var professorModulo = angular.module('professorModulo', []);

professorModulo.controller("professoresController", function($scope, $http) {

	urlProfessor = 'http://localhost:8080/Projeto2httpJaxRS/rest/professores';
	$scope.listarProfessores = function() {

		$http.get(urlProfessor).then(sucessCallback, errorCalback);

		function sucessCallback(professores) {
			$scope.professores = professores.data;
		}

		function errorCalback(error) {
			alert(error);
		}

	}

	$scope.selecionaProfessor = function(professorSelecionado) {
		$scope.professor = professorSelecionado;
	}

	$scope.limparCampos = function() {
		$scope.professor = null;
	}

	$scope.salvar = function() {
		if ($scope.professor.codigo == undefined) {

			$http.post(urlProfessor, $scope.professor).then(sucessCallback, errorCalback);

			function sucessCallback() {
				$scope.professores.push($scope.professor);
				$scope.limparCampos();
			}

			function errorCalback(error) {
				alert(error);
			}

		} else {
			$http.put(urlProfessor, $scope.professor).then(sucessCallback, errorCalback);

			function sucessCallback() {
				$scope.listarProfessores();
				$scope.limparCampos();
			}

			function errorCalback(error) {
				alert(error);
			}

		}
	}
	
	
	$scope.excluir = function(){
		if ($scope.professor.codigo == undefined) {

			alert("Favor selecionar um registro para poder excluir");
			console.log("Favor selecionar um registro para poder excluir");

		}else{
			$http.delete(urlProfessor + '/' + $scope.professor.codigo).then(sucessCallback, errorCalback);

			function sucessCallback() {
				$scope.listarProfessores();
				$scope.limparCampos();
			}

			function errorCalback(error) {
				alert(error);
			}
			
		}
	}

	//executa
	$scope.listarProfessores();

});