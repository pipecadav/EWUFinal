/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ewu.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author cadav
 */

@Entity
@Table(name = "euw_data")
@NamedQueries({@NamedQuery(name="EWUData.getAll", query = "SELECT e FROM EWUData e")})
public class EWUData implements Serializable{
    
    @Id
    @SequenceGenerator(
            name="SEQ_GEN",
            sequenceName="SEQ_GEN",
            allocationSize=500
    )
    @GeneratedValue(strategy=GenerationType.IDENTITY, generator="SEQ_GEN")
    private long userId;
    
    @Column
    private String firstName;
    
    @Column
    private String lastName;
    
    @Column
    private String email;
    
    @Column
    private String report;
    
    @Column 
    private long id;
    
    public EWUData(){
        
    }
 
    public long getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getReport() {
        return report;
    }

    public void setReport(String report) {
        this.report = report;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
    
    

    
    
}
