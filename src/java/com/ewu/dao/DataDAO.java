/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ewu.dao;

import com.ewu.model.EWUData;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author cadav
 */
@Stateless
public class DataDAO implements DataDAOLocal {

    @PersistenceContext
    private EntityManager em;
    
    @Override
    public void addReport(EWUData report) {
        em.persist(report);
    }

    @Override
    public void editReport(EWUData report) {
        em.merge(report);
    }

    @Override
    public void deleteReport(long id) {
        em.remove(getReport(id));
    }

    @Override
    public EWUData getReport(long id) {
        return em.find(EWUData.class, id);
    }

    @Override
    public List<EWUData> getAll() {
    return em.createNamedQuery("EWUData.getAll").getResultList();
    }
}
