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

import com.backend.model.model.CursoModel;
import com.backend.model.service.CursoServiceImplementa;

@Path("/cursos")
@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
@Consumes(MediaType.APPLICATION_JSON)
public class CursosRestFaced {

//Modo direto sem o uso de serviços
	/*
	 * @Inject private CursoDaoImplementa cursoDaoImplementa;
	 * 
	 * @GET public List<CursoModel> getCursos() {
	 * System.out.println("get"); return cursoDaoImplementa.getCursos(); }
	 */

	@Inject
	private CursoServiceImplementa cursoServiceImplementa;

	@GET
	public List<CursoModel> getCursos() {

		return cursoServiceImplementa.getCursos();
		

	}

	@POST
	public CursoModel salvarCurso(CursoModel cursoModel) {

		return cursoServiceImplementa.salvarCurso(cursoModel);

	}

	@PUT
	public void atualizaCurso(CursoModel cursoModel) {

		cursoServiceImplementa.alterar(cursoModel);

	}

	@DELETE
	@Path("/{codigoCurso}")
	public void excluiCurso(@PathParam("codigoCurso") Integer codigoCurso) {
		
		CursoModel cursoModel = new CursoModel();
		cursoModel.setCodigo(codigoCurso);
		cursoServiceImplementa.excluir(cursoModel);
		
	}
}