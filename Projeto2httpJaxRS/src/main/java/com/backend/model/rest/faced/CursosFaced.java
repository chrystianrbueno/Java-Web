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

import com.backend.model.CursoModel;
import com.backend.model.ProfessorModel;

@Path("/cursos")
@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
@Consumes(MediaType.APPLICATION_JSON)
public class CursosFaced {
	static List<CursoModel> listaCursos = new ArrayList<CursoModel>();

	static {
		listaCursos.add(new CursoModel(1, "Java", "Segunda 18h",
				new ProfessorModel(2, "Professor2", "professor2@gmail.com", "(51)888888888")));
		listaCursos.add(new CursoModel(2, "Python", "Quinta 9h",
				new ProfessorModel(4, "Professor4", "professor4@gmail.com", "(51)666666666")));
		listaCursos.add(new CursoModel(3, "Javascript", "Sábado 11h",
				new ProfessorModel(3, "Professor3", "professor2@gmail.com", "(51)777777777")));
		listaCursos.add(new CursoModel(4, "CSS", "Terça 16h",
				new ProfessorModel(1, "Professor1", "professor1@gmail.com", "(51)999999999")));
	}

	@GET
	public List<CursoModel> getCursos() {
		return listaCursos;
	}

	@POST
	public CursoModel salvar(CursoModel professor) {
		System.out.println("POST");
		listaCursos.add(professor);
		return professor;
	}

	@PUT
	public void atualizar(CursoModel professor) {
		System.out.println("PUT");
		listaCursos.remove(professor);
		listaCursos.add(professor);
	}

	@DELETE
	@Path("/{codigoProfessor}")
	public void excluir(@PathParam("codigoProfessor") Integer codigoProfessor) {

		System.out.println("DELETE");
		CursoModel professor = new CursoModel();

		professor.setCodigo(codigoProfessor);
		listaCursos.remove(professor);
	}
}