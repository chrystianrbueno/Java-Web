var professoresModulo = angular.module('professoresModulo',[]);

professoresModulo.controller("professoresController", function ($scope){
	
	$scope.professores = [
		{codigo: 1, nome: 'Chrystian Rocha', email: 'chrystianrbueno@gmail.com', fone: '999999999'},
		{codigo: 2, nome: 'Juka', email: 'Juka@gmail.com', fone: '777777777'},
		{codigo: 3, nome: 'Adalberto', email: 'Adalberto@gmail.com', fone: '888888888'},
	];
	
	$scope.selecionaProfessor = function(professorSelecionado){
		$scope.professor = professorSelecionado;
	}
	
	$scope.limparCampos = function(){
		$scope.professor = null;
	}
	
	$scope.salvar = function(){
		$scope.professores.push($scope.professor);
		$scope.limparCampos();
	}
	
	$scope.excluir = function(){
		$scope.professores.splice($scope.professores.indexOf($scope.professor),1);
	}
});