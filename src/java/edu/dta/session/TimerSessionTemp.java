/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.dta.session;

import edu.dta.entity.Process;
import edu.dta.entity.ProcessFacade;
import java.util.Date;
import javax.ejb.EJB;
import javax.ejb.Schedule;
import javax.ejb.Stateless;
import org.omg.CORBA.MARSHAL;

/**
 *
 * @author Camilo
 */
@Stateless
public class TimerSessionTemp {
    @EJB
    private ProcessFacade processFacade;
    
    @Schedule(minute = "*", second = "30", dayOfMonth = "*", month = "*", year = "*", hour = "*", dayOfWeek = "*", persistent = false)
    public void myTimer() {
        Process p = processFacade.findByState(true);
        if(p!=null){
            
            p.getTemp().add(Math.random()*10);
            processFacade.edit(p);
            System.out.println(" Updating Temperature at Time: " + new Date());
        }
    }
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
