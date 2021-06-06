package com.backend.model.rest.faced;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
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
}
