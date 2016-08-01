package com.batme.saml;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/inbound")
public class OutBoundSSO{

	@Path("/sso")
	@GET
	public Response test(){
		System.out.println("test");
		return Response.ok("test").build();
	}
	
	
}
