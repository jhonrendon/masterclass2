/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.usa.ciclo3.ciclo3.repository;

import co.usa.ciclo3.ciclo3.model.Computer;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import co.usa.ciclo3.ciclo3.repository.crud.ComputerCrudRepository;

/**
 *
 * @author jacke
 */
@Repository
public class ComputerRepository {
    @Autowired
    private ComputerCrudRepository computerCrudRepository;
    
    public List<Computer> getAll(){
        return (List<Computer>)computerCrudRepository.findAll();
    }
    public Optional<Computer> getComputer(int id){
        return computerCrudRepository.findById(id);
    }
    public Computer save(Computer p){
        return computerCrudRepository.save(p);
    }
}
