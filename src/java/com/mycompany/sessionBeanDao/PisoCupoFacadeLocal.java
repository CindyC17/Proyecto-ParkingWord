/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sessionBeanDao;

import com.mycompany.entity.PisoCupo;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Andres
 */
@Local
public interface PisoCupoFacadeLocal {

    void create(PisoCupo pisoCupo);

    void edit(PisoCupo pisoCupo);

    void remove(PisoCupo pisoCupo);

    PisoCupo find(Object id);

    List<PisoCupo> findAll();

    List<PisoCupo> findRange(int[] range);

    int count();
    
}
