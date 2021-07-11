package com.backend.model.rest.facade;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.backend.model.model.ProfessorModel;
import com.backend.model.service.ProfessorServiceImplementa;

@Path("/professores")
@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
@Consumes(MediaType.APPLICATION_JSON)
public class ProfessoresRestFaced {

//Modo direto sem o uso de serviços
	/*
	 * @Inject private ProfessorDaoImplementa professorDaoImplementa;
	 * 
	 * @GET public List<ProfessorModel> getProfessores() {
	 * System.out.println("get"); return professorDaoImplementa.getProfessores(); }
	 */

	@Inject
	private ProfessorServiceImplementa professorServiceImplementa;

	@GET
	public List<ProfessorModel> getProfessores() {

		return professorServiceImplementa.getProfessores();
		

	}

	@POST
	public ProfessorModel salvarProfessor(ProfessorModel professorModel) {

		return professorServiceImplementa.salvarProfessor(professorModel);

	}

	@PUT
	public void atualizaProfessor(ProfessorModel professorModel) {

		professorServiceImplementa.alterar(professorModel);

	}

	@DELETE
	@Path("/{codigoProfessor}")
	public void excluiProfessor(@PathParam("codigoProfessor") Integer codigoProfessor) {
		
		ProfessorModel professorModel = new ProfessorModel();
		professorModel.setCodigo(codigoProfessor);
		professorServiceImplementa.excluir(professorModel);
		
	}
}