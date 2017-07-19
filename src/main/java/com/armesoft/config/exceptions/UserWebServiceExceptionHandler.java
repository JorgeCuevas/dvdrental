/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.armesoft.config.exceptions;

import com.armesoft.data.entities.ErrorMessage;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

/**
 *
 * @author jcq012
 */
@Provider
public final class UserWebServiceExceptionHandler implements
        ExceptionMapper<UserWebServiceException> {

    @Override
    public Response toResponse(final UserWebServiceException exception) {
        return Response.status(Response.Status.BAD_REQUEST)
                .entity(new ErrorMessage(500, exception.getMessage(), exception.toString()))
                .type(MediaType.APPLICATION_JSON).build();
    }
}
