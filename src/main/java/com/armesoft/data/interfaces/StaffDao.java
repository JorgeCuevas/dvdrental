/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.armesoft.data.interfaces;

import com.armesoft.config.exceptions.UserWebServiceException;
import com.armesoft.data.entities.Credentials;
import com.armesoft.data.entities.Staff;



/**
 *
 * @author jcq012
 */
public interface StaffDao extends Dao<Integer, Staff>{
 
    public Staff authenticate(Credentials credential) throws UserWebServiceException;

    public void cancel(Staff user);
    
}
