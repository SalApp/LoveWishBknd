/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LoveWishWS;

import java.util.Date;
import java.util.List;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author f.muratorio
 */
@Path("generic")
public class GenericResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of GenericResource
     */
    public GenericResource() {
    }

    /**
     * Retrieves representation of an instance of LoveWishWS.GenericResource
     * @param name
     * @param lastname
     * @param bithdate
     * @param city
     * @param email
     * @param password
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.TEXT_HTML)
    public String getXml(
                @QueryParam("name") String name,
		@QueryParam("lastname") String lastname,
		@QueryParam("bithdate") String bithdate,
                @QueryParam("city") String city,
                @QueryParam("email") String email,
                @QueryParam("password") String password
    ) {
        
        //TODO return proper representation object
        return name + " " + lastname + " " + bithdate + " " + city + " " + email + " " + password;
    }

    /**
     * PUT method for updating or creating an instance of GenericResource
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_XML)
    public void putXml(String content) {
    }
}
