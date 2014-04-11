/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.dta.entity;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
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
        return (Process) getEntityManager().createNamedQuery("Process.findByState", Process.class);        
    }
    
}
