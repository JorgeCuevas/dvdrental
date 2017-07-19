/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.armesoft.resources;

import com.armesoft.data.entities.Category;
import com.armesoft.filtres.JWTNeeded;
import javax.ejb.Stateful;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author jcq012
 */

@Stateless
@Path("categories")
@JWTNeeded
public class CategoryResource {
    
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Category getCategories(){
        return new Category();
    }
}
