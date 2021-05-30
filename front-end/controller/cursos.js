var cursoModulo = angular.module('cursoModulo',[]);

cursoModulo.controller("cursoController", function ($scope){
	

	$scope.professores = [
		{codigo: 1, nome: 'Adão', email: 'chrystianrbueno@gmail.com', fone: '999999999'},
		{codigo: 2, nome: 'Juka', email: 'Juka@gmail.com', fone: '777777777'},
		{codigo: 3, nome: 'Adalberto', email: 'Adalberto@gmail.com', fone: '888888888'},
	];
	
	$scope.cursos = [
		{codigo: 1, nome: 'Java para Web', diasHorarios: 'Segundas e Quartas, 19h', professor:{codigo: 1, nome: 'Adão', email: 'chrystianrbueno@gmail.com', fone: '999999999'}},
		{codigo: 2, nome: 'Delphi', diasHorarios: 'Sábados, 18h', professor:{codigo: 2, nome: 'Juka', email: 'Juka@gmail.com', fone: '777777777'}},
		{codigo: 3, nome: 'Pascal', diasHorarios: 'Terças, 7h', professor:{codigo: 3, nome: 'Adalberto', email: 'Adalberto@gmail.com', fone: '888888888'}},
	];

	$scope.selecionaCurso = function(cursoSelecionado){
		$scope.curso = cursoSelecionado;
	}
	
	$scope.limparCampos = function(){
		$scope.curso = null;
	}
	
	$scope.salvar = function(){
		$scope.cursos.push($scope.curso);
		$scope.limparCampos();
	}
	
	$scope.excluir = function(){
		$scope.cursos.splice($scope.cursos.indexOf($scope.curso),1);
	}
});