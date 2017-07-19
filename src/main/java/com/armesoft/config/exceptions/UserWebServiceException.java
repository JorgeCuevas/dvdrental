/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.armesoft.config.exceptions;

import java.io.Serializable;

/**
 *
 * @author jcq012
 */
public class UserWebServiceException extends Exception implements Serializable {
    
    private static final long serialVersionUID = 1169426381288170661L;

    public UserWebServiceException() {
        super();
    }

    public UserWebServiceException(String message) {
        super(message);
    }

    
    public UserWebServiceException(String message, Exception e) {
        super(message, e);
    }
}
