package br.inatel.pos.mobile.calculadora.api;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/calc")
public interface CalculadoraService {

	@GET
	@Path("/getsum/{number1}/{number2}")
	@Produces(MediaType.TEXT_PLAIN)
	Integer getSum(@PathParam("number1") Integer number1, @PathParam("number2") Integer number2);
	
	@GET
	@Path("/getsub/{number1}/{number2}")
	@Produces(MediaType.TEXT_PLAIN)
	Integer getSub(@PathParam("number1") Integer number1, @PathParam("number2") Integer number2);
	
	@POST
	@Path("/sum")
	@Produces(MediaType.APPLICATION_JSON)
	Result doSum(@FormParam("number1") Integer number1, @FormParam("number2") Integer number2);
	
	@POST
	@Path("/sub")
	@Produces(MediaType.APPLICATION_JSON)
	Result doSub(@FormParam("number1") Integer number1, @FormParam("number2") Integer number2);
	

}
