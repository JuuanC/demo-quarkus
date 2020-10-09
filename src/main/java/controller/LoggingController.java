package controller;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@RequestScoped
@Path(value="/prueba")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class LoggingController {
    @GET @Path("/") @Produces(MediaType.APPLICATION_JSON)
	public Response user(@QueryParam("param") String param) {
		return Response.ok("Content").build();
	}
}
