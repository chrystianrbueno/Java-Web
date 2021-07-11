package com.backend.model.service;

import java.util.List;

import com.backend.model.model.ProfessorModel;

public interface ProfessorServiceInterface {

	ProfessorModel salvarProfessor(ProfessorModel professorModel);

	void alterar(ProfessorModel professorModel);

	void excluir(ProfessorModel professorModel);

	List<ProfessorModel> getProfessores();
	
}