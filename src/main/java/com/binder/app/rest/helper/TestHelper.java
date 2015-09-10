package com.binder.app.rest.helper;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;
 
@Path("/hello")
public class TestHelper {
	public String fname = null;
	public String lname= null;
 
	@GET
	@Path("/{param}")
	public Response getMsg(@PathParam("param") String msg) {
 
		String output = "Jersey say : " + msg;
		
		JDBCResult res = new JDBCResult();
		String[] arg = {""};
		System.out.println(res.main(arg));
		return Response.status(200).entity(output +" ").build();
 
	}
 
}
