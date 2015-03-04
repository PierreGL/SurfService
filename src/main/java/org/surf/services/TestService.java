package org.surf.services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

//@Path("/TestService")
public class TestService {
	
	@GET
	@Path("/Hello")
	public Response getHelloWorld(){
		return Response.status(200).entity("Hello").build();
	}
	
}
