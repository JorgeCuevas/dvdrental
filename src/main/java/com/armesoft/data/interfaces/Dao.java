/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.armesoft.data.interfaces;

import java.util.List;

/**
 *
 * @author jcq012
 */
public interface Dao<ID, T> {

        public T findById(ID id);

        public List<T> findAll();

        public T save(T entity);

        public void delete(T entity);

        public void update();

        public void clear();

}
