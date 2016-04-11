package services;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import dao.IgracDAO;
import entities.Igrac;

@Path("igraci")
public class IgracService {	
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getIgrace(){
		List<Igrac> igraci = IgracDAO.vratiSveIgrace();
		return Response.ok().entity(igraci).build();
		
	}
}
