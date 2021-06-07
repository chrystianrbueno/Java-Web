var cursoModulo = angular.module('cursoModulo', []);

cursoModulo.controller("cursoController", function($scope, $http) {

	urlProfessor = 'http://localhost:8080/Projeto2httpJaxRS/rest/professores';
	urlCurso = 'http://localhost:8080/Projeto2httpJaxRS/rest/cursos';

	$scope.listarCursos = function() {

		$http.get(urlCurso).then(sucessCallback, errorCalback);

		function sucessCallback(cursos) {
			$scope.cursos = cursos.data;
		}

		function errorCalback(error) {
			alert(error);
		}

	}

	$scope.listarProfessores = function() {

		$http.get(urlProfessor).then(sucessCallback, errorCalback);

		function sucessCallback(professores) {
			$scope.professores = professores.data;
		}

		function errorCalback(error) {
			alert(error);
		}

	}


	$scope.selecionaCurso = function(cursoSelecionado) {
		$scope.curso = cursoSelecionado;
	}

	$scope.limparCampos = function() {
		$scope.curso = null;
	}

	$scope.salvar = function() {
		if ($scope.curso.codigo == undefined) {

			$http.post(urlCurso, $scope.curso).then(sucessCallback, errorCalback);

			function sucessCallback() {
				$scope.cursos.push($scope.curso);
				$scope.limparCampos();
			}

			function errorCalback(error) {
				alert(error);
			}

		} else {
			$http.put(urlCurso, $scope.curso).then(sucessCallback, errorCalback);

			function sucessCallback() {
				$scope.listarCursos();
				$scope.limparCampos();
			}

			function errorCalback(error) {
				alert(error);
			}

		}
	}


	$scope.excluir = function() {
		if ($scope.curso.codigo == undefined) {

			alert("Favor selecionar um registro para poder excluir");
			console.log("Favor selecionar um registro para poder excluir");

		} else {
			$http.delete(urlcurso + '/' + $scope.curso.codigo).then(sucessCallback, errorCalback);

			function sucessCallback() {
				$scope.listarCursos();
				$scope.limparCampos();
			}

			function errorCalback(error) {
				alert(error);
			}

		}
	}

	//executa
	$scope.listarCursos();
	$scope.listarProfessores();

});