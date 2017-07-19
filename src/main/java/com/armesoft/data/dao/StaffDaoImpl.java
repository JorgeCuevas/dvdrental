/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.armesoft.data.dao;

import com.armesoft.config.exceptions.UserWebServiceException;
import com.armesoft.data.entities.Credentials;
import com.armesoft.data.entities.Staff;
import com.armesoft.data.interfaces.StaffDao;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

/**
 *
 *
 * @author jcq012
 */
@Stateless
public class StaffDaoImpl implements StaffDao {

    @PersistenceContext
    private EntityManager em;

    /**
     *
     * @param credential
     * @return
     * @throws UserWebServiceException
     */
    @Override
    public Staff authenticate(Credentials credential) throws UserWebServiceException {
        try {
            TypedQuery<Staff> query = em.createNamedQuery(Staff.LOGIN, Staff.class)
                    .setParameter("name", credential.getUsername())
                    .setParameter("password", credential.getPassword());

            return query.getSingleResult();
        } catch (NoResultException e) {
            throw new UserWebServiceException("Not user staff username "+credential.getUsername());
        }
    }

    @Override
    public void cancel(Staff user) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Staff findById(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Staff> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Staff save(Staff entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Staff entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
