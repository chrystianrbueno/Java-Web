package com.backend.model.rest.faced;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.backend.model.ProfessorModel;

@Path("/professores")
@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
@Consumes(MediaType.APPLICATION_JSON)
public class ProfessoresFaced {
	static List<ProfessorModel> listaProfessores = new ArrayList<ProfessorModel>();
	
	static {
		listaProfessores.add(new ProfessorModel(1, "Professor1", "professor1@gmail.com", "(51)999999999"));
		listaProfessores.add(new ProfessorModel(2, "Professor2", "professor2@gmail.com", "(51)888888888"));
		listaProfessores.add(new ProfessorModel(3, "Professor3", "professor3@gmail.com", "(51)777777777"));
		listaProfessores.add(new ProfessorModel(4, "Professor4", "professor4@gmail.com", "(51)666666666"));
	}
	
	@GET
	public List<ProfessorModel> getProfessores(){
		return listaProfessores;
	}
	
	@POST
	public ProfessorModel salvar(ProfessorModel professor) {
		System.out.println("POST");
		listaProfessores.add(professor);
		return professor;
	}
	
	@PUT
	public void atualizar(ProfessorModel professor) {
		System.out.println("PUT");
		listaProfessores.remove(professor);
		listaProfessores.add(professor);
	}
	
	@DELETE
	@Path("/{codigoProfessor}")
	public void excluir(@PathParam("codigoProfessor")Integer codigoProfessor) {
		
		System.out.println("DELETE");
		ProfessorModel professor = new ProfessorModel();
		
		professor.setCodigo(codigoProfessor);
		listaProfessores.remove(professor);
	}
}
