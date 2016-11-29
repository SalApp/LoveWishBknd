/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LoveWishWS;

import LoveWishDAO.User;
import LoveWishWS.utils.HibernateUtil;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import org.hibernate.Session;

/**
 * REST Web Service
 *
 * @author f.muratorio
 */
@Path("generic")
public class LoveWishResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of GenericResource
     */
    public LoveWishResource() {
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
		@QueryParam("bithdate") String birthdate,
                @QueryParam("city") String city,
                @QueryParam("email") String email,
                @QueryParam("sex") String sex,
                @QueryParam("username") String username,
                @QueryParam("password") String password
    ) {

        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            
            DateFormat format = new SimpleDateFormat("MMMM d, yyyy", Locale.ENGLISH);
            Date date = format.parse(birthdate);
            User user = new User(name,lastname,email,password,sex,date,username,city);
            
            session.save(user);
            session.getTransaction().commit();
            
            //TODO return proper representation object
            return name + " " + lastname + " " + birthdate + " " + city + " " + email + " " + password;
        } catch (ParseException ex) {
            Logger.getLogger(LoveWishResource.class.getName()).log(Level.SEVERE, null, ex);
            return "Error";
        }
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
