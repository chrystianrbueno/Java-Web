package com.backend.jaxrs;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

//url ao qual o serviço rest estará respodendo
@Path("/exemplowsrs")
public class ExemploBase {

	@GET
	public String executaGet() {
		return "Exemplo executou um GET";
	}
	
	@POST
	public String executaPost() {
		return "Exemplo executou um Post";
	}
	
}