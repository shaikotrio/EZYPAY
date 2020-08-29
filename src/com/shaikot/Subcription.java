package com.shaikot;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.ApplicationPath;
import jakarta.ws.rs.core.Application;

@Path("/sub")
public class Subcription {
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String getDetails(@QueryParam("amount") String amount, @QueryParam("day") String day) {
		System.out.println("Amount is: "+amount);
		System.out.println("Day is: "+day);
		String resource="<html> Amount : "+amount+" ; Date: "+day+"</html>";
		return resource;
	}
}
