package com.backend.model.rest.facade;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.backend.model.dao.ProfessorDaoImplementa;
import com.backend.model.model.ProfessorModel;

@Path("/professores")
@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
@Consumes(MediaType.APPLICATION_JSON)
public class ProfessoresFaced {

	@Inject
	private ProfessorDaoImplementa professorDaoImplementa;

	@GET
	public List<ProfessorModel> getProfessores() {
		System.out.println("get");
		return professorDaoImplementa.getProfessores();
	}

}