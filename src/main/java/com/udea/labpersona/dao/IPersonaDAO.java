/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udea.labpersona.dao;

import com.udea.labpersona.model.Persona;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IPersonaDAO extends CrudRepository<Persona, Long> {
    
}
