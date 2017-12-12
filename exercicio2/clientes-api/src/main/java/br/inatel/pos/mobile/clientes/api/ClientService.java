package br.inatel.pos.mobile.clientes.api;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/clientManager")
public interface ClientService {
	
	@POST
	@Path("/client/{name}")
	public void addNewClient(@PathParam("name") String name);
	
	@GET
	@Path("/client/all")
	@Produces(MediaType.APPLICATION_JSON)
	public String[] listClients();

}
