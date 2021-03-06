package com.backend.model.service;

import java.util.List;

import javax.inject.Inject;
import javax.transaction.Transactional;

import com.backend.model.dao.ProfessorDaoInterface;
import com.backend.model.model.ProfessorModel;

public class ProfessorServiceImplementa implements ProfessorServiceInterface {

	@Inject
	private ProfessorDaoInterface professorDaoInterface;

	@Override
	public List<ProfessorModel> getProfessores() {
		
		return professorDaoInterface.getProfessores();
	
	}

	@Override
	@Transactional
	public ProfessorModel salvarProfessor(ProfessorModel professorModel) {
		
		return professorDaoInterface.salvarProfessor(professorModel);
	
	}

	@Override
	@Transactional
	public void alterar(ProfessorModel professorModel) {
		System.out.println("service put");

		professorDaoInterface.alterar(professorModel);
	
	}

	@Override
	@Transactional
	public void excluir(ProfessorModel professorModel) {
	
		professorDaoInterface.excluir(professorModel);
	
	}

}
