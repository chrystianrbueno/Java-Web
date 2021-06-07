package com.backend.model;

import java.io.Serializable;

public class CursoModel implements Serializable{

	private static final long serialVersionUID = 1L;

	Integer codigo;
	String nome;
	String diasHorarios;
	
	ProfessorModel professorModel;

	public CursoModel() {
	
	}

	public CursoModel(Integer codigo, String nome, String diasHorarios, ProfessorModel professorModel) {
		this.codigo = codigo;
		this.nome = nome;
		this.diasHorarios = diasHorarios;
		this.professorModel = professorModel;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDiasHorarios() {
		return diasHorarios;
	}

	public void setDiasHorarios(String diasHorarios) {
		this.diasHorarios = diasHorarios;
	}

	public ProfessorModel getProfessorModel() {
		return professorModel;
	}

	public void setProfessorModel(ProfessorModel professorModel) {
		this.professorModel = professorModel;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CursoModel other = (CursoModel) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}
	
}