/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ewu.dao;

import com.ewu.model.EWUData;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author cadav
 */
@Local
public interface DataDAOLocal {

    void addReport(EWUData report);
    
    void editReport(EWUData report);
    
    void deleteReport(long id);
    
    EWUData getReport(long id);
    
    List<EWUData> getAll();
    
            
            
    
}
