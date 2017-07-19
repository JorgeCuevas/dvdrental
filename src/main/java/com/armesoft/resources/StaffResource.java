/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.armesoft.resources;




import com.armesoft.config.exceptions.UserWebServiceException;
import com.armesoft.data.dao.StaffDaoImpl;
import com.armesoft.data.entities.Credentials;
import com.armesoft.data.entities.ErrorMessage;
import com.armesoft.data.entities.Staff;


import com.armesoft.util.KeyGenerator;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import java.net.URI;
import java.security.Key;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;
import com.armesoft.data.interfaces.StaffDao;
import javax.persistence.Entity;

/**
 *
 * @author jcq012
 */
@Path("staff")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Stateless
public class StaffResource {

    @Inject
    private KeyGenerator keyGenerator;
    
    @Context
    private UriInfo uriInfo;
    
    
    @Inject
    private StaffDao userDao;

    
    
    @GET
    public String getStaff() {
        return "Autenticate";
    }

    @POST
    @Path("signup")
    public Response signUpStaff(Staff staff, @Context UriInfo uriInfo) {
         Staff savedStaff = userDao.save(staff);
        if(savedStaff.getStaffId() > 0){
            URI uri = uriInfo.getAbsolutePathBuilder().path(String.valueOf(staff.getStaffId())).build();
            return Response.created(uri).build();
        }
        return Response.serverError().build();
    }

    @POST
    @Path("authenticate")
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    public Response loginStaff(@FormParam("username") String username,
                               @FormParam("password") String password) throws UserWebServiceException {
        
        Staff staff = userDao.authenticate(new Credentials(username, password));
        if (staff.getStaffId() > 0) {
            String gen = staff.getStaffId()+" "+staff.getFirstName()+" "+ staff.getLastName();
            String token = issuedToken(gen);
            return Response.ok().entity(new ErrorMessage(200, "Authenticate, Successfully", "You have token header "))
                    .header(HttpHeaders.AUTHORIZATION,"Bearer "+ token).build();
        }
        return Response.ok().status(Response.Status.UNAUTHORIZED).build();
    }

    @DELETE
    @Path("{userId}")
    public Response deleteStaff() {
        return Response.noContent().build();
    }

    @PUT
    @Path("{userId}")
    public Response putStaff() {
        return Response.ok().build();
    }

    private String issuedToken(String login) {
        Key key = keyGenerator.generateKey();
        String stringToken = Jwts.builder()
                .setSubject(login)
                .setIssuer(uriInfo.getAbsolutePath().toString())
                .setIssuedAt(new Date())
                .setExpiration(toDate(LocalDateTime.now().plusMinutes(108000L)))
                .signWith(SignatureAlgorithm.HS512, key)
                .compact();
        return stringToken;
    }

    private Date toDate(LocalDateTime localDateTime) {
        return Date.from(localDateTime.atZone(ZoneId.systemDefault()).toInstant());
    }
}
