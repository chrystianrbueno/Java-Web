package com.backend.model.dao;

import java.util.List;

import com.backend.model.model.CursoModel;

public interface CursoDaoInterface {

	CursoModel salvarCurso(CursoModel cursoModel);

	void alterar(CursoModel cursoModel);

	void excluir(CursoModel cursoModel);

	List<CursoModel> getCursos();
	
}