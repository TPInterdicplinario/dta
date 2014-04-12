/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.dta.entity;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Camilo
 */
@Stateless
public class ProcessFacade extends AbstractFacade<Process> {
    @PersistenceContext(unitName = "PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ProcessFacade() {
        super(Process.class);
    }
    
    public Process findByState(boolean state){
        try {
            Process p = (Process) em.createNamedQuery("Process.findByState", Process.class).setParameter("state", state).getSingleResult();
            return p;
        }catch(NoResultException e){
            return null;
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }
    
}
