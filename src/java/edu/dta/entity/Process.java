/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.dta.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Temporal;

/**
 *
 * @author Camilo
 */
@Entity
@NamedQueries({
    @NamedQuery(name="Process.findByState",
                query="SELECT p FROM Process p WHERE p.state = :state"),
    })
public class Process implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(nullable = false)
    private double maxTemp;
    @Column(nullable = false)
    private double targetTemp;
    @Column(nullable = false)
    private double sterilizationTime;
    private String itemDescription;
    private String userDescription;
    private ArrayList<Double> temp;
    @Temporal(javax.persistence.TemporalType.DATE)    
    private Date initialDate;
    @Column(unique = true)
    private boolean state;
    
    public Process(){
       temp = new ArrayList<Double>();
       initialDate = new Date();
       state=true;
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getMaxTemp() {
        return maxTemp;
    }

    public void setMaxTemp(double maxTemp) {
        this.maxTemp = maxTemp;
    }

    public double getTargetTemp() {
        return targetTemp;
    }

    public void setTargetTemp(double targetTemp) {
        this.targetTemp = targetTemp;
    }

    public double getSterilizationTime() {
        return sterilizationTime;
    }

    public void setSterilizationTime(double sterilizationTime) {
        this.sterilizationTime = sterilizationTime;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public String getUserDescription() {
        return userDescription;
    }

    public void setUserDescription(String userDescription) {
        this.userDescription = userDescription;
    }

    public ArrayList<Double> getTemp() {
        return temp;
    }

    public void setTemp(ArrayList<Double> temp) {
        this.temp = temp;
    }

    public Date getInitialDate() {
        return initialDate;
    }

    public void setInitialDate(Date initialDate) {
        this.initialDate = initialDate;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Process)) {
            return false;
        }
        Process other = (Process) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "edu.temperature.entity.Process[ id=" + id + " ]";
    }
    
}
